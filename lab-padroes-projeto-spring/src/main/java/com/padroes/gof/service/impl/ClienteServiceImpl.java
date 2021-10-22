package com.padroes.gof.service.impl;

import com.padroes.gof.model.Cliente;
import com.padroes.gof.model.Endereco;
import com.padroes.gof.repository.ClienteRepository;
import com.padroes.gof.repository.EnderecoRepository;
import com.padroes.gof.service.ClienteService;
import com.padroes.gof.service.ViaCepService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl  implements ClienteService{

    private final ClienteRepository clienteRepository;
    private final EnderecoRepository enderecoRepository;
    private final ViaCepService viaCepService;

    public ClienteServiceImpl(ClienteRepository clienteRepository,
                              EnderecoRepository enderecoRepository, ViaCepService viaCepService) {
        this.clienteRepository = clienteRepository;
        this.enderecoRepository = enderecoRepository;
        this.viaCepService = viaCepService;
    }

    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não localizado"));
    }

    @Override
    public Cliente inserir(Cliente cliente) {
        return salvarClienteComCep(cliente);
    }

    @Override
    public Cliente atualizar(Long id, Cliente cliente) {
        Cliente clienteLocalizado = buscarPorId(id);
        BeanUtils.copyProperties(cliente, clienteLocalizado, "id");
        return salvarClienteComCep(clienteLocalizado);
    }

    private Cliente salvarClienteComCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository
                .findById(cep).orElseGet(() -> {
                    Endereco enderecoNovo = viaCepService.consultarCep(cep);
                    return enderecoRepository.save(enderecoNovo);
                });
        cliente.setEndereco(endereco);
        return clienteRepository.save(cliente);
    }

    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }
}
