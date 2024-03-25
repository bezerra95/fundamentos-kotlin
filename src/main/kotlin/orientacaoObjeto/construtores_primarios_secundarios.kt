package orientacaoObjeto

// Classe com um construtor primário e secundário
class Retangulo(val largura: Int, val altura: Int) {

    // Construtor secundário que aceita apenas uma dimensão e cria um quadrado
    constructor(lado: Int) : this(lado, lado)
}

class Circulo(val raio: Double) {
    val area: Double

    init {
        require(raio > 0) { "O raio do círculo deve ser maior que zero." }
        area = Math.PI * raio * raio
        println("Círculo criado com raio: $raio e área: $area")
    }
}


fun main() {
    val  r = Retangulo(10, 7)
    println("Largura: ${r.largura}")
    println("Altura: ${r.altura}")
    println()

    // Criando uma instância da classe Retângulo usando o construtor secundário
    val retangulo = Retangulo(5)
    println("Largura: ${retangulo.largura}, Altura: ${retangulo.altura}")
    println()

    // Criando uma instância da classe Circulo usando o construtor secundário
    val circulo = Circulo(5.0)
}
