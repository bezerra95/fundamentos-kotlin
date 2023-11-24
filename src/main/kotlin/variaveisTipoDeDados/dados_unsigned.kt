package variaveisTipoDeDados

/*
Em Kotlin, não existe uma palavra-chave unsigned
como em algumas outras linguagens de programação.
Em vez disso, o Kotlin possui os tipos de dados
primitivos que suportam apenas valores positivos,
que são sempre considerados como números
inteiros ou decimais com sinal.

*/

fun main() {
    val unsignedInt: Int = 2147483647// Inteiro sem sinal (máximo valor para Int)
    val unsignedLong: Long = 9223372036854775807 // Long sem sinal (máximo valor para Long)
    val unsignedShort: Short = 32767 // Short sem sinal (máximo valor para Short)
    val unsignedByte: Byte = 127 // Byte sem sinal (máximo valor para Byte)

    println(unsignedInt)
    println(unsignedLong)
    println(unsignedShort)
    println(unsignedByte)
}