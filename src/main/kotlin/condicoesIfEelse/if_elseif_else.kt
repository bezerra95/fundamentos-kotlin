package condicoesIfEelse

fun main(){
    println("Exemplo 1:")
    parOuImpar(10)
    parOuImpar(5)

    println("\nExemplo 2")
    resultadoDaNota(6)
    resultadoDaNota(4)
    resultadoDaNota(3)

    println("\nExemplo 3:")
    println(imparOuPar(5))
    println(imparOuPar(10))
}

fun parOuImpar(numero: Int){
    if(numero % 2 == 0){
        println("Par")
    }else{
        println("Impar")
    }
}

fun resultadoDaNota(nota: Int){
    if (nota >= 6){
        println("Passou!")
    }else if(nota >= 4){
        println("Recuperação!")
    }else{
        println("Reprovou!")
    }
}


fun imparOuPar(numero: Int): String{
    return if(numero % 2 == 0){
        "Par"
    }else{
        "Impar"
    }
}