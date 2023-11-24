package EXERCICIOS.controleDeFluxoFor

/*Usando a resolução do exercício 1, não imprima os números múltiplos de 5.*/


fun main() {
    NaoMultiplosDeCinco()
}

fun NaoMultiplosDeCinco() {
    for(n in 1..50){
        if(n % 5 != 0)
            print("$n ")
    }
}
