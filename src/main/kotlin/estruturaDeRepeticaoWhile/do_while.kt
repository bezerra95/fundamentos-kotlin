package estruturaDeRepeticaoWhile

fun main() {
    // Exemplo Básico
    var count = 1

    do {
        println("Contagem: $count")
        count++
    } while (count <= 5)
    // Neste exemplo básico, o loop é executado enquanto a variável "count" for menor ou igual a 5.
    // A cada iteração, o valor da contagem é impresso na tela.

    // Exemplo Médio
    var sum = 0
    var input: String

    do {
        print("Digite um número inteiro (ou 0 para sair): ")
        input = readLine() ?: ""
        val number = input.toIntOrNull()

        if (number != null) {
            sum += number
        } else {
            println("Valor inválido. Tente novamente.")
        }
    } while (number != 0)
    // Neste exemplo médio, o loop continua solicitando números ao usuário até que seja digitado o valor 0.
    // Cada número digitado é somado ao valor total "sum", a menos que seja um valor inválido.

    // Exemplo Avançado
    var attempts = 3
    var password: String

    do {
        print("Digite sua senha: ")
        password = readLine() ?: ""

        if (password == "123456") {
            println("Senha correta. Acesso concedido!")
            break
        } else {
            println("Senha incorreta. Tentativas restantes: ${attempts - 1}")
            attempts--
        }
    } while (attempts > 0)
    // Neste exemplo avançado, o loop continua solicitando a senha ao usuário até que a senha correta seja digitada
    // ou o número máximo de tentativas seja atingido. A cada tentativa incorreta, o número de tentativas restantes é exibido.

    println("Fim do programa")
}
