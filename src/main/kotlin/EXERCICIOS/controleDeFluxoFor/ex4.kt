package EXERCICIOS.controleDeFluxoFor

/*Faça a soma de todos os números no intervalo de 1 a 500..*/

fun main() {
    somaDoUmAo500()
}

fun somaDoUmAo500() {
    var soma = 0
    for(n in 1 .. 500){
        soma += n
    }
    println(soma)
}