package EXERCICIOS.controleDeFluxoFor

/*Escreva um programa capaz de receber um número inteiro N e imprimir uma escada de tamanho N usando
o caracter #*/

fun main() {
    escada(5)
}

fun escada(n: Int) {
    var soma = ""
    for(n in 1 .. n){
        soma += "#"
        println(soma)
    }
}