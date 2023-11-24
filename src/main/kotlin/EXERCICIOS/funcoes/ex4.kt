package EXERCICIOS.funcoes

/*Escreva uma função capaz de receber milhas e converter em km (1 milha = 1,6km).*/

fun main() {
    println(milhaasConvertidoParaKm(10))
}

fun milhaasConvertidoParaKm(valor: Int): Double = valor * 1.6
