package variaveisTipoDeDados

fun main() {
    val texto = "   Olá, Mundo!   "

    // Funções para manipulação de strings
    println(texto.length) // Retorna o comprimento da string (incluindo espaços)
    println(texto.toUpperCase()) // Converte para maiúsculas: "   OLÁ, MUNDO!   "
    println(texto.toLowerCase()) // Converte para minúsculas: "   olá, mundo!   "
    println(texto.trim()) // Remove espaços em branco no início e no final: "Olá, Mundo!"
    println(texto.substring(4, 10)) // Substring a partir da posição 4 até 9: ", Mund"

    // Verificação e manipulação de conteúdo
    println(texto.contains("Olá")) // Verifica se contém "Olá": true
    println(texto.startsWith("Olá")) // Verifica se começa com "Olá": false
    println(texto.endsWith(" ")) // Verifica se termina com espaço: true
    println(texto.replace("Mundo", "Universo")) // Substitui "Mundo" por "Universo": "   Olá, Universo!   "
    println(texto.removePrefix("   ")) // Remove prefixo: "Olá, Mundo!   "
    println(texto.removeSuffix("   ")) // Remove sufixo: "   Olá, Mundo!"

    // Divisão e junção
    val palavras = texto.trim().split(",") // Divide a string em uma lista ["Olá", "Mundo!"]
    println(palavras.joinToString("-")) // Junta a lista usando hífen: "Olá-Mundo!"
}