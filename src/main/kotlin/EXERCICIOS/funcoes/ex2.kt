package EXERCICIOS.funcoes

/*2 Escreva uma função capaz de receber uma string e retornar a quantidade de caracteres.*/


fun main() {
    println(quantidadeDeCaractere("Julio"))
}

fun quantidadeDeCaractere(texto: String): String {

    return "Quantidade de caracteres de $texto é = ${texto.length}"
}