package orientacaoObjeto

// Classe com propriedade privada e getters/setters personalizados
class Product(private var _nome: String, private var _preco: Double) {
    // Getter personalizado para a propriedade nome
    var nome: String
        get() = _nome
        // Setter personalizado para a propriedade nome
        set(value) {
            println("Definindo nome para $value")
            _nome = value
        }

    // Getter personalizado para a propriedade preco
    var preco: Double
        get() = _preco
        // Setter personalizado para a propriedade preco
        set(value) {
            println("Definindo preço para $value")
            _preco = value
        }
}


fun main() {
    // Criando uma instância da classe Produto
    val produto = Product("Notebook", 1500.0)

    // Acessando e alterando a propriedade nome usando getters e setters personalizados
    println("Nome do produto: ${produto.nome}")
    produto.nome = "Smartphone"
    println("Novo nome do produto: ${produto.nome}")

    // Acessando e alterando a propriedade preco usando getters e setters personalizados
    println("Preço do produto: ${produto.preco}")
    produto.preco = 2000.0
    println("Novo preço do produto: ${produto.preco}")
}
