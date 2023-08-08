package classes


//Criando uma Classe
//Atributos     cor              anodefabricacao           dono
class Carro(var cor: String, val anodefabricacao: Int, var dono: Dono) {

}
// Criando uma Classe
//Atributos         nome              idade
data class Dono(val nome: String, var idade: Int){

}

fun main(){
    //Criando uma instância da Classe
    var carro = Carro("Branco", 2016, Dono("Julio Cesar", 27)  )
    println(carro.cor)

    //Acessando o atributo cor através da instância da Classse Carro e modificando-o
    carro.cor = "Preto"
    println(carro.cor)

    //Acessando o atributo(classe) Dono através da instância da Classe Carro
    println(carro.dono)  //Será emprimido por conta do data, argumentado na classe

    println(carro.dono.nome)
}