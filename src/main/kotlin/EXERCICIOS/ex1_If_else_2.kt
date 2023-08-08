package EXERCICIOS


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