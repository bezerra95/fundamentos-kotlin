package variaveis

fun main() {
    // Exemplo 1: Leitura de um número inteiro
    print("Digite um número inteiro: ")
    val numero = readLine()?.toIntOrNull() // Lê a entrada do usuário e converte para Int ou retorna null

    if (numero != null) {
        println("Você digitou o número: $numero") // Imprime o número digitado
    } else {
        println("Entrada inválida!") // Mensagem de erro se a entrada não for um número inteiro
    }

    // Exemplo 2: Leitura de uma sequência de caracteres
    print("Digite uma sequência de caracteres: ")
    val texto = readLine() // Lê a entrada do usuário como uma string

    println("Você digitou: $texto") // Imprime o texto digitado

    // Exemplo 3: Leitura de um número de ponto flutuante
    print("Digite um número de ponto flutuante: ")
    val numeroDecimal = readLine()?.toDoubleOrNull() // Lê a entrada do usuário e converte para Double ou retorna null

    if (numeroDecimal != null) {
        println("Você digitou o número: $numeroDecimal") // Imprime o número digitado
    } else {
        println("Entrada inválida!") // Mensagem de erro se a entrada não for um número de ponto flutuante
    }

    // Exemplo 4: Leitura de um booleano
    print("Digite um valor booleano (true ou false): ")
    val booleano = readLine()?.toBoolean() // Lê a entrada do usuário e converte para Boolean ou retorna null

    if (booleano != null) {
        println("Você digitou o valor booleano: $booleano") // Imprime o valor booleano digitado
    } else {
        println("Entrada inválida!") // Mensagem de erro se a entrada não for um booleano válido
    }
}