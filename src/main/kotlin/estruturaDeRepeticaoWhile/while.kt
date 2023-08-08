package estruturaDeRepeticaoWhile


fun main() {
    println("Exemplo1:")
    whileMmaiorQueDez()
    println("\nExemplo2:")
    doWhileMaiorqueDez()
}

fun whileMmaiorQueDez(){
    var x = 0
    while(x <= 10){
        println(x)
        x++
    }
}

fun doWhileMaiorqueDez(){
    var x = 10
    do{
        println(x)
        x++
    }while(x < 10)
}