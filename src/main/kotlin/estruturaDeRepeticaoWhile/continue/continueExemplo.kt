package estruturaDeRepeticaoWhile.`continue`

fun main() {
    // Exemplo de Loop 'for' com continue
    for (i in 1..5) {
        if (i == 3) {
            println("Iteração pulada em i = $i")
            continue // Pula para a próxima iteração quando i é igual a 3
        }
        println("Valor de i: $i")
    }

    // Exemplo de Loop 'while' com continue
    var contador = 0
    while (contador < 5) {
        contador++
        if (contador % 2 == 0) {
            println("Iteração pulada em contador = $contador")
            continue // Pula para a próxima iteração quando contador é par
        }
        println("Valor do contador: $contador")
    }

    // Exemplo de Loop 'do-while' com continue
    var x = 0
    do {
        x++
        if (x % 2 == 0) {
            println("Iteração pulada em x = $x")
            continue // Pula para a próxima iteração quando x é par
        }
        println("Valor de x: $x")
    } while (x < 5)
}
