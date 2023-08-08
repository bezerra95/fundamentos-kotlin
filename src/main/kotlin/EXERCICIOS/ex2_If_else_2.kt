package EXERCICIOS


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