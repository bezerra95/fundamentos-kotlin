package nullSafety

fun main(){


// EXEMPLO 1 -> Declaração de variável nullable:

    val nome: String? = null
    val idade: Int? = 25

    println("EXEMPLO 1")
    println(nome)
    println(idade)

// Nesse exemplo, a variável nome é declarada como String?
// o que significa que ela pode armazenar uma referência
// a uma string ou ter o valor nulo. Já a variável idade
// é declarada como Int?, indicando que pode conter
// um valor inteiro ou ser nula

// EXEMPLO 2 -> Operador safe call:

    val tamanho: Int? = nome?.length

    println("\nEXEMPLO 2")
    println(tamanho)


// Nesse exemplo, usamos o operador safe call (?.)
// para acessar a propriedade length da variável nome.
// Se nome for nulo, a expressão inteira avaliará
// como nula e tamanho será atribuído como nulo.

// EXEMPLO 3 -> Operador Elvis:

    val comprimento: Int = nome?.length ?: 0

    println("\nEXEMPLO 3")
    println(comprimento)

// Nesse exemplo, usamos o operador Elvis (?:)
// para fornecer um valor padrão no caso de nome ser nulo.
// Se nome não for nulo, comprimento receberá o
// valor retornado por length. Caso contrário, será atribuído o valor 0.

// EXEMPLO 4 -> Verificação de nulo com let:

    val nome2 = "Julio"
    nome2?.let {
        println("\nExemplo -> 4")
        println("O nome não é nulo: $it")
    }
// Nesse exemplo, usamos a função let para executar um bloco
//  de código somente se nome não for nulo. Dentro do bloco,
//  a referência não nula é acessada usando it.


}