package blocoWhen

fun main() {
    val diaDaSemana = 3

    val mensagem = when (diaDaSemana) {
        1 -> "Domingo"
        2 -> "Segunda-feira"
        3 -> "Terça-feira"
        4 -> "Quarta-feira"
        5 -> "Quinta-feira"
        6 -> "Sexta-feira"
        7 -> "Sábado"
        else -> "Dia inválido"
    }

    println("O dia da semana correspondente ao número $diaDaSemana é: $mensagem")
}