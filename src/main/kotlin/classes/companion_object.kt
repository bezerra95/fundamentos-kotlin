package classes


fun main2() {
    val resultado = ExemploCompanion.PI * 5 // Acessando a constante PI diretamente pelo companion object
    println("Resultado: $resultado") // Resultado: 15.70795

    ExemploCompanion.saudacao() // Chamando a função saudacao() do companion object
}

//O companion object em Kotlin é um objeto que permite definir
// membros estáticos dentro de uma classe. Esses membros estão
// associados à própria classe, em vez de estarem associados a instâncias
// individuais. Isso significa que os membros do companion object
// podem ser acessados diretamente através do nome da classe,
// sem precisar criar uma instância da classe.

//Aqui está um exemplo de como usar o companion object e sua aplicabilidade:

//kotlin
//Copy code
class ExemploCompanion {
    companion object {
        const val PI = 3.14159 // Constante PI definida no companion object

        fun saudacao() {
            println("Olá, eu sou um membro estático do companion object!")
        }
    }

    // Outros membros da classe...
}

fun main() {
    val resultado = ExemploCompanion.PI * 5 // Acessando a constante PI diretamente pelo companion object
    println("Resultado: $resultado") // Resultado: 15.70795

    ExemploCompanion.saudacao() // Chamando a função saudacao() do companion object
}

// Neste exemplo, temos uma classe ExemploCompanion com um companion object que contém uma constante PI e uma função saudacao().
// Ambos os membros são associados à própria classe ExemploCompanion.

// Comentários explicativos:

// Definimos a classe ExemploCompanion com o companion object logo abaixo do início da classe.

// Dentro do companion object, definimos a constante PI, que pode ser acessada diretamente
// através do nome da classe, sem precisar de uma instância da classe.

// Também definimos a função saudacao() no companion object, que pode ser chamada diretamente pelo nome da classe,
// sem a necessidade de criar um objeto da classe.

// No main(), demonstramos o uso do companion object. Acessamos a constante PI e multiplicamos por 5,
// e chamamos a função saudacao() diretamente através do nome da classe ExemploCompanion.

// O companion object é útil quando precisamos criar membros que sejam compartilhados por todas
// as instâncias de uma classe e que possam ser acessados diretamente sem a necessidade de criar instâncias da classe.
// É uma forma de implementar membros estáticos em Kotlin, o que pode ser útil para armazenar constantes,
// funções utilitárias ou implementar um padrão de design Singleton.