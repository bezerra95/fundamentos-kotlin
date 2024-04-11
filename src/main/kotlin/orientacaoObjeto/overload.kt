package orientacaoObjeto


// A sobrecarga ocorre quando você tem múltiplas funções ou construtores
// com o mesmo nome, mas com diferentes parâmetros. Aqui está um exemplo:
class Calculator {
    // Sobrecarga do método add para diferentes tipos de argumentos
    fun add(x: Int, y: Int): Int {
        return x + y
    }

    fun add(x: Double, y: Double): Double {
        return x + y
    }

    // Sobrecarga do método add para diferentes números de argumentos
    fun add(x: Int, y: Int, z: Int): Int {
        return x + y + z
    }
}

fun main() {
    val calc = Calculator()

    // Chamando diferentes versões do método add
    val sumInt = calc.add(3, 4)
    println("Soma de inteiros: $sumInt")

    val sumDouble = calc.add(3.5, 4.5)
    println("Soma de doubles: $sumDouble")

    val sumThreeInt = calc.add(1, 2, 3)
    println("Soma de três inteiros: $sumThreeInt")
}
