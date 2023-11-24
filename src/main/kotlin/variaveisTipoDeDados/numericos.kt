package variaveisTipoDeDados

fun main() {
    // Tipos de dados numéricos
    val inteiro: Int = 42 // Int: -2147483648 a 2147483647
    val longo: Long = 1234567890123456789 // Long: -9223372036854775808 a 9223372036854775807
    val curto: Short = 32767 // Short: -32768 a 32767
    val byte: Byte = 127 // Byte: -128 a 127
    val pontoFlutuante: Float = 3.14F // Float: 1.4E-45 a 3.4028235E38
    val pontoDuplo: Double = 3.14159265359 // Double: 4.9E-324 a 1.7976931348623157E308

    println("Inteiro: $inteiro")
    println("Longo: $longo")
    println("Curto: $curto")
    println("Byte: $byte")
    println("Ponto Flutuante: $pontoFlutuante")
    println("Ponto Duplo: $pontoDuplo")
}