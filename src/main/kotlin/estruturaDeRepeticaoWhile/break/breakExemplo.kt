package estruturaDeRepeticaoWhile.`break`

fun main() {
    // Exemplo de Loop 'for'
    for (i in 1..10) {
        if (i == 5) {
            println("Loop interrompido em i = $i")
            break // Interrompe o loop quando i é igual a 5
        }
        println("Valor de i: $i")
    }

    // Exemplo de Loop 'while'
    var contador = 0
    while (contador < 10) {
        if (contador == 5) {
            println("Loop interrompido em contador = $contador")
            break // Interrompe o loop quando contador é igual a 5
        }
        println("Valor do contador: $contador")
        contador++
    }

    // Exemplo de Loop 'do-while'
    var x = 0
    do {
        if (x == 3) {
            println("Loop interrompido em x = $x")
            break // Interrompe o loop quando x é igual a 3
        }
        println("Valor de x: $x")
        x++
    } while (x < 5)

}
