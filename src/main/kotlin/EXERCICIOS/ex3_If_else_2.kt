
package EXERCICIOS

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