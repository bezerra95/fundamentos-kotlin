package orientacaoObjeto

// Definindo uma classe Pessoa
class PessoaClass {
    var nome: String = ""
    var idade: Int = 0
    var cidade: String = ""
}

// Definindo uma data class Pessoa
data class PessoaDataClass(
    var nome: String = "",
    var idade: Int = 0,
    var cidade: String = ""
)


fun main() {
    // Criando uma instância da classe Pessoa
    val pessoaClass = PessoaClass()

    // Configurando os atributos da pessoa usando with
    with(pessoaClass) {
        nome = "Ana"
        idade = 30
        cidade = "São Paulo"
    }
    // Imprimindo os atributos da pessoa
    println("Nome: ${pessoaClass.nome}, Idade: ${pessoaClass.idade}, Cidade: ${pessoaClass.cidade}")


    println()


    // Criando uma instância da data class Pessoa
    val pessoaDataClass = PessoaDataClass()

    // Configurando os atributos da pessoa usando with
    with(pessoaDataClass) {
        nome = "João"
        idade = 25
        cidade = "Rio de Janeiro"
    }

    // Imprimindo os atributos da pessoa
    println("Nome: ${pessoaDataClass.nome}, " + "Idade: ${pessoaDataClass .idade}, " + "Cidade: ${pessoaDataClass .cidade}")
}
