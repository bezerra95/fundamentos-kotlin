package estruturaDeRepeticaoFor

fun main(){
    println("Exemplo 1:")
    imprimaStrings("Kotlin é show!")
    println()

    println("Exemplo 2:")
    imprimaDe1a10()
    println()

    println("\nExemplo 3:")
    imprimaDe10a1()
    println()

    println("\nExemplo 4:")
    imprimaParDe2a10()
    println()

    println("\nExemplo 5:")
    imprimaRange(11, 20)
}

fun imprimaStrings(string: String){
    for(letra in string){
        println(letra)
    }
}

fun imprimaDe1a10(){
    for(numero in 1 .. 10){
        println(numero)
    }
}

fun imprimaDe10a1(){
    for(numero in 10 downTo 1){
        println(numero)
    }
}

fun imprimaParDe2a10(){
    for(numero in 2 .. 10 step 2){
        println(numero)
    }
}
fun imprimaRange(inicio: Int, fim:Int){
    for(numero in inicio .. fim){
        println(numero)
    }
}