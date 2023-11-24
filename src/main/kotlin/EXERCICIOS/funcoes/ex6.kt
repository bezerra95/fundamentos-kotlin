package EXERCICIOS.funcoes



fun quantidadeDeCaracteres(texto: String) = "Quantidade de caracteres de $texto é = ${texto.length}"

fun cubo(valor: Int) = valor * valor * valor

fun milhasConvertidoParaKm(valor: Int): Double = valor * 1.6

fun main() {
    println(quantidadeDeCaracteres("Julio"))
    println(cubo(10))
    println(milhasConvertidoParaKm(10))
}

