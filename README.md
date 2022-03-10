# Decorator
#### O padrão decorator tem a função de adicionar comportamentos ou estado em objetos existentes.
#### Cenário Exemplo:
##### 1. Temos uma classe, que poderia ser abstrata ou uma interface, chamada Componente ( classe genérica ), que tem um atributo operation.
##### 2. Temos outra classe "concreta", que herda se for abstrata ou implementa e sobrescreve o método se for uma interface, de Component, chamada ComponenteConcreto.
##### 3. Daí criamos um Decorator como uma classe abstrata, que herda se for abstrata ou implementa e sobrescreve o método se for uma interface, de Component. O Decorator, ele em si mesmo é um "Componente".
##### 4. O Decorator, além de herdar se for abstrata ou implementar e sobrescrever o método se for uma interface, ele tanto é um Componente quanto tem o Componente dentro dele ( geralmente esse atributo componente é definido através de passagem de parâmetro no construtor). E o Decorator, sobrescreve a operation de Componente. Ele é um Decorator genérico.
##### 5. Para Decorators especícifos, é necessário criar sub-classes específicas: ConcretaDecorator1 e ConcretaDecorator2 que são responsáveis em atribuir comportamento ao componente da super-classe Decorator.
##### 6. Consigo atrelar comportamentos a instâncias específicas. Diferente da herança, que atrelo o comportamento a todas as instâncias da classe.
##### 7. Cada classe de Decorator criada, permite que eu vá compondo com outros Decorators. Isso faz com que eu vá adicionando camadas de comportamento na ordem que eu desejar. E ter o resultado final que eu quero.
