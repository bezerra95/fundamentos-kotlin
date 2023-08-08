package blocoWhen

fun main() {

    val x = 25

    when(x){

        5, -5 -> println("x == 5")
        8 -> println("x == 8")
        9 -> println("x == 9")
        10 -> {
            println("x == 10")
            println("x é uma dezena")
        }
        in 11..15 -> println("x está entre 11 e 15")
        !in 16..20 -> println("O numero não está no range de 16 a 20")
        else -> println("numero não mapeado")

    }
}