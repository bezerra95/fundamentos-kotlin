package classes

class Pessoa(var nome: String, var idade: Int) {
    override fun toString(): String {
        return "Classe: Pessoa, Nome: $nome, Idade: $idade"
    }
}

fun main(){
    var julio = Pessoa("julio", 27 )
    println(julio)
}