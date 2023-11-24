package estruturaDeRepeticaoWhile


fun main() {
    println("Exemplo1:")
    whileMmaiorQueDez()

    println("Exemplo2:")
    whileMenorQueDez()

    println("\nExemplo3:")
    whileString()

    println("\nExemplo4:")
    doWhileMaiorqueDez()
}

fun whileMmaiorQueDez(){
    var x = 0
    while(x <= 10){
        println(x)
        x++
    }
}

fun whileMenorQueDez(){
    var x = 10
    while(x >= 0){
        println(x)
        x--
    }
}


fun whileString(){
    var s = "Kotlin"
    var n = 0
    while(n < s.length){
        println("${s[n]}")
        n++
    }
}

fun doWhileMaiorqueDez(){
    var x = 10
    do{
        println(x)
        x++
    }while(x < 10)
}