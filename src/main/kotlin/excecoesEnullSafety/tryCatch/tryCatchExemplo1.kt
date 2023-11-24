package excecoesEnullSafety.tryCatch


fun main() {
    try {
        // Código que pode lançar uma exceção
        val resultado = 10 / 0
    } catch (ex: ArithmeticException) {
        // Tratamento específico para a exceção ArithmeticException
        println("Ocorreu uma exceção de divisão por zero: ${ex.message}")
    } catch (ex: Exception) {
        // Tratamento genérico para todas as exceções
        println("Ocorreu uma exceção genérica: ${ex.message}")
    } finally {
        // Código que será executado independentemente de exceções
        println("Este bloco finally sempre será executado.")
    }
}
