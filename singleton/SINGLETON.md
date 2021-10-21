## SINGLETON
#### Pertence ao grupo de padrões criacionais
Permite a criação de uma única instância de uma classe e fornece um modo para recuperá-la.

Esse padrão é comumente utilizado pelos projetistas de software quando existe a necessidade de encapsular a criação de uma classe se isolando do conhecimento da classe concreta da aplicação cliente através de uma interface. Essa necessidade é comumente desejada por aqueles que trabalham no desenvolvimento de frameworks, que utilizam classes abstratas para definir e manter relacionamentos entre os objetos. Dessa forma os clientes implementam as funcionalidades esperadas pelo framework adicionando a lógica de negócio específica da aplicação, sem que o framework tenha o conhecimento de como e qual a lógica implementada pela aplicação para complementá-lo. 
Fonte: [devmedia](https://www.devmedia.com.br/conheca-os-padroes-de-projeto/957) 