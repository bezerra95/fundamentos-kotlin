package EXERCICIOS.controleDeFluxoFor

/*Imprima os números de 1 a 50 na mesma linha em ordem crescente. Saída esperada:
“1 2 3 4 5 6 7 8 9 10 .. .. .. 49 50”*/

fun main() {
    doUmAo50()
}

fun doUmAo50() {
    for(n in 1 .. 50){
        print("$n ")
    }
}