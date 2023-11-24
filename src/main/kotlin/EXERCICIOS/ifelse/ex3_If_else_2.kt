
/*Considere o código abaixo. Qual a saída do programa caso informado o valor 4?
fun qualASaida(num: Int) {
 if (num >= 0) {
 if (num == 0)
 println("Primeira string")
 else println("Segunda string")
 }
 println("Terceira string")
}*/

package EXERCICIOS.ifelse

fun qualAsaida(num: Int){
    return if (num >= 0) {
        if (num == 0)
            println("Primeira string")
        else
            println("Segunda string")
    } else
        println("Terceira String")
}

fun main(){
    qualAsaida(4)
}