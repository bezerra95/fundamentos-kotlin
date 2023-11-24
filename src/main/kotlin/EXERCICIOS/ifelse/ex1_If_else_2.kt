
/*Escreva um programa capaz de ler dois números inteiros que representam os lados de uma figura
geométrica. Informar se formam um quadrado (lados iguais)*/


package EXERCICIOS.ifelse

fun quadrado(num1:Int, num2: Int): String {
    return if (num1 == num2)
        "FORMA UM QUADRADO"
    else
        "LADOS DIFERENTES"

}

fun main() {

    var resultado = quadrado(11, 10)
    println(resultado)

}