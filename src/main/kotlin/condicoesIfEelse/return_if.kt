package condicoesIfEelse

fun main() {
    // Exemplo 1: Função que retorna o maior valor entre dois números inteiros
    fun maiorValor(a: Int, b: Int): Int {
        return if (a > b) {  // Se a é maior que b
            a // Retorne a
        } else {
            b // Senão, retorne b
        }
    }

    val num1 = 10
    val num2 = 20
    val maior = maiorValor(num1, num2)
    println("O maior valor entre $num1 e $num2 é $maior")

    // Exemplo 2: Função que verifica se um número é positivo
    fun isPositivo(numero: Int): Boolean {
        return if (numero > 0) true else false // Se o número for maior que 0, retorne true, senão retorne false
    }

    val num = 5
    val ehPositivo = isPositivo(num)
    println("O número $num é positivo? $ehPositivo")
}