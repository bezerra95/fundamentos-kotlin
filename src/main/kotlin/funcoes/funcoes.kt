package funcoes

fun main(){
    println(RetornaNome())  // Chamando função para executa-la

    // Também podemos colocar em uma variavel assim:
    val retorna_nome = RetornaNome()
    println("print2 -> " + retorna_nome)

    // Chamando função com parâmetro "nome" e "idade
    println("\n\nFUNÇÕES COM PARÂMETROS\n")

    DizOi("Julio Cesar", 28)

    // Chamando função com parâmetro "funçao("retornaSTRING" e "idade")
    DizOi(RetornaNome(), 28)
}

// Criando Função que retorna nome
fun RetornaNome(): String{  // Indicando o tipo de dado que vai ser retornado "String"
    return "Julio"
}

fun DizOi(nome: String, idade: Int){         /* Podemos definir um valor padrão se quisrmos
                                                fun DizOi(nome: String, idade: Int = 20) */
    println("Oi ${nome}, Parabéns pelo seus ${idade} anos")

}