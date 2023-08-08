package matrizes

fun main() {
    // Exemplo 1: Matriz 2x2
    val matriz2x2 = arrayOf(
        intArrayOf(1, 2),    // Linha 0: Elemento 1 na coluna 0, elemento 2 na coluna 1
        intArrayOf(3, 4)     // Linha 1: Elemento 3 na coluna 0, elemento 4 na coluna 1
    )
    println("Elemento na linha 0, coluna 1: ${matriz2x2[0][1]}") // Acesso ao elemento na linha 0, coluna 1

    // Exemplo 2: Matriz 3x3
    val matriz3x3 = arrayOf(
        intArrayOf(1, 2, 3),    // Linha 0: Elemento 1 na coluna 0, elemento 2 na coluna 1, elemento 3 na coluna 2
        intArrayOf(4, 5, 6),    // Linha 1: Elemento 4 na coluna 0, elemento 5 na coluna 1, elemento 6 na coluna 2
        intArrayOf(7, 8, 9)     // Linha 2: Elemento 7 na coluna 0, elemento 8 na coluna 1, elemento 9 na coluna 2
    )
    println("Elemento na linha 2, coluna 0: ${matriz3x3[2][0]}") // Acesso ao elemento na linha 2, coluna 0

    // Exemplo 3: Matriz 2x3
    val matriz2x3 = arrayOf(
        intArrayOf(1, 2, 3),    // Linha 0: Elemento 1 na coluna 0, elemento 2 na coluna 1, elemento 3 na coluna 2
        intArrayOf(4, 5, 6)     // Linha 1: Elemento 4 na coluna 0, elemento 5 na coluna 1, elemento 6 na coluna 2
    )
    println("Elemento na linha 1, coluna 2: ${matriz2x3[1][2]}") // Acesso ao elemento na linha 1, coluna 2
}