package variaveisTipoDeDados


// Váriaveis mutáveis e imutáveis
fun main() {
    var nome = "Julio"      // Mutável
    val nome2 = "Bezerra"   // Imutável

    println(nome)
    println(nome2)

    nome = "Cesar"
    //nome2 = "Cesar"  =  error

    println(nome)
    println(nome2)
}