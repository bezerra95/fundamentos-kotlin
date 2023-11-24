package EXERCICIOS.controleDeFluxoWhile

/*Escreva um programa capaz de receber um texto e imprimi-lo invertido.
Entrada: Meu nome é Julius. Saída: .suiluJ é emon ueM*/

fun main(){
    inverte("Meu nome é Julius.")
}

fun inverte(string: String) {
    var i = string.length-1
    while (i > -1){
        print(string[i])
        i--
    }
}