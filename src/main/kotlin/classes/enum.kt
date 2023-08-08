package classes

enum class DiaSemana {
    DOMINGO,
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO
}

fun main() {
    val dia = DiaSemana.SEXTA // Atribuindo um valor da enumeração à variável 'dia'
    println("Hoje é ${dia.name}") // Imprime: Hoje é SEXTA

    when (dia) {
        DiaSemana.DOMINGO, DiaSemana.SABADO -> println("Fim de semana")
        DiaSemana.SEGUNDA -> println("Segunda-feira")
        DiaSemana.TERCA -> println("Terça-feira")
        DiaSemana.QUARTA -> println("Quarta-feira")
        DiaSemana.QUINTA -> println("Quinta-feira")
        DiaSemana.SEXTA -> println("Sexta-feira")
    }
}