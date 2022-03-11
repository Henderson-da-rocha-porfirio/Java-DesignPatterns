# TemplateMethod
### 1. É utilizado quando você tem um algoritmo bem definido mas eu quero fazer com que alguns passos desse algoritmo, possam ser definidos de forma diferente. Ou seja, outros tipos de algoritmos.
### 2. Aqui só dar para usar classe abstrata. E não dá para usar Interface. Mas nessa classe abstrata você deve ter um método que não é abstrato.
### 3. E esse método que vai disparar esse algoritmo. Porque ele é um algoritmo bem definido.
### 4. Para esse algoritmo ser executado, ele vai usar, outros métodos que estão definidos nessa classe abstrata mas que são implementados em sub-classes concretas.
### 5. Ele se chama Template Method porque é um método onde você tem uma execução em forma de um template.