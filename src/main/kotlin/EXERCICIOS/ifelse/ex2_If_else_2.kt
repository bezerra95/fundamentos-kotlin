
/*Escreva um programa capaz de ler três números inteiros que representam os lados de um triângulo. Informar
se é um triângulo equilátero (todos os lados iguais)*/


package EXERCICIOS.ifelse

fun triangulo(num1: Int, num2: Int, num3: Int): String {

    return if (num1 == num2 && num1 == num3)
        "É UM TRIANGULO"
    else
        "LADOS DIFERENTES"
}

fun main(){
    var resultado = triangulo(11, 11, 11)
    println(resultado)
}