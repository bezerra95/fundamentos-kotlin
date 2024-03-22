package orientacaoObjeto

// Definição da classe Carro
class Carro(var modelo: String, var anoFabricacao: Int) {

    // Método para exibir informações básicas do carro
    fun exibirInformacoesBasicas() {
        println("Modelo: $modelo - Ano de Fabricação: $anoFabricacao")
    }

    // Método para calcular a idade do carro com base no ano de fabricação
    fun calcularIdade(): Int {
        val anoAtual = 2024 // Supondo que o ano atual seja 2024
        return anoAtual - anoFabricacao
    }
}

fun main() {
    // Criando um objeto da classe Carro
    val meuCarro = Carro("Toyota Corolla", 2020)

    // Chamando métodos para exibir informações e calcular a idade
    meuCarro.exibirInformacoesBasicas()
    val idade = meuCarro.calcularIdade()
    println("Idade do carro: $idade anos")
}
