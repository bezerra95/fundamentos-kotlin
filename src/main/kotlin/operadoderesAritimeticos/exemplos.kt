package operadoderesAritimeticos

fun main() {
    // Operadores aritméticos
    val numero1 = 10
    val numero2 = 5

    val soma = numero1 + numero2 // Soma: 10 + 5 = 15
    val subtracao = numero1 - numero2 // Subtração: 10 - 5 = 5
    val multiplicacao = numero1 * numero2 // Multiplicação: 10 * 5 = 50
    val divisao = numero1 / numero2 // Divisão: 10 / 5 = 2
    val resto = numero1 % numero2 // Resto da divisão: 10 % 5 = 0

    println("Soma: $soma")
    println("Subtração: $subtracao")
    println("Multiplicação: $multiplicacao")
    println("Divisão: $divisao")
    println("Resto: $resto")

    // Operadores de comparação
    val a = 10
    val b = 5

    val igual = a == b // Igualdade: false
    val diferente = a != b // Diferença: true
    val maior = a > b // Maior que: true
    val menor = a < b // Menor que: false
    val maiorOuIgual = a >= b // Maior ou igual a: true
    val menorOuIgual = a <= b // Menor ou igual a: false

    println("Igual: $igual")
    println("Diferente: $diferente")
    println("Maior: $maior")
    println("Menor: $menor")
    println("Maior ou igual: $maiorOuIgual")
    println("Menor ou igual: $menorOuIgual")

    // Operadores lógicos
    val condicao1 = true
    val condicao2 = false

    val resultadoE = condicao1 && condicao2 // AND lógico: false
    val resultadoOU = condicao1 || condicao2 // OR lógico: true
    val resultadoNao = !condicao1 // NOT lógico: false

    println("AND lógico: $resultadoE")
    println("OR lógico: $resultadoOU")
    println("NOT lógico: $resultadoNao")
}