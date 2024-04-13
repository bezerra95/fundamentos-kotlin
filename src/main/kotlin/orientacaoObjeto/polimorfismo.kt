package orientacaoObjeto

// Definindo a interface Funcionario com o método calcularSalario().
interface Funcionario {
    fun calcularSalario(): Double
}

// Implementação da interface Funcionario para a classe Gerente.
class Gerente : Funcionario {
    override fun calcularSalario(): Double {
        // Suponha que o salário base do gerente seja 5000.
        return 5000.0
    }
}

// Implementação da interface Funcionario para a classe Analista.
class Analista : Funcionario {
    override fun calcularSalario(): Double {
        // Suponha que o salário base do analista seja 3000.
        return 3000.0
    }
}

// Função que recebe um objeto Funcionario e calcula o salário.
fun calcularSalario(funcionario: Funcionario): Double {
    return funcionario.calcularSalario()
}

fun main() {
    // Criando objetos de diferentes cargos.
    val gerente: Funcionario = Gerente() // Polimorfismo ocorre aqui
    val analista: Funcionario = Analista() // Polimorfismo ocorre aqui

    // Chamando a função calcularSalario() para cada cargo.
    println("Salário do gerente: ${calcularSalario(gerente)}")
    println("Salário do analista: ${calcularSalario(analista)}")
}

//Polimorfismo: O polimorfismo é a capacidade de um objeto poder ser
// tratado como um objeto de um tipo mais genérico. Aqui, as classes
// Gerente e Analista implementam a interface Funcionario.
// Isso permite que objetos das classes Gerente e Analista sejam
// atribuídos à variável do tipo Funcionario (val gerente: Funcionario = Gerente()
// e val analista: Funcionario = Analista()), permitindo que chamemos o método calcularSalario()
// de maneira polimórfica.
//Onde ocorre: O polimorfismo ocorre quando criamos objetos das classes
// Gerente e Analista e atribuímos a variáveis do tipo Funcionario. Em seguida,
// chamamos o método calcularSalario() para cada um desses objetos,
// onde o método específico de cada classe é chamado, demonstrando o polimorfismo na execução do método.