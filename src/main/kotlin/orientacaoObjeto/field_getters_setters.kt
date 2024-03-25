package orientacaoObjeto

// Exemplo usando 'field' em Kotlin
class Contador {
    // Propriedade privada para armazenar o valor real do contador
    private var _valor: Int = 0

    // Propriedade pública que permite acesso ao valor do contador
    var valor: Int
        // Getter que retorna o valor atual do contador
        get() = _valor
        // Setter que atualiza o valor do contador
        set(value) {
            // Mensagem para indicar a atualização do valor
            println("Atualizando valor de $_valor para $value")
            // Atribui o novo valor à propriedade interna '_valor'
            _valor = value
        }
}

// Exemplo sem usar 'field' em Kotlin
class ContadorSemField {
    // Propriedade pública para o valor do contador
    var valor: Int = 0
        // Setter que atualiza o valor do contador
        set(value) {
            // Mensagem para indicar a atualização do valor
            println("Atualizando valor para $value")
            // Tentativa de atribuir o valor diretamente (pode causar loop infinito)
            // valor = value  // Isso causaria um loop infinito
        }
}

fun main() {
    // Instância do Contador usando 'field'
    val contador = Contador()
    // Atualiza o valor do contador
    contador.valor = 5
    // Imprime o valor atual do contador
    println("Valor do contador (usando 'field'): ${contador.valor}")

    // Linha de separação entre os exemplos
    println("--------------------------")

    // Instância do ContadorSemField sem 'field'
    val contadorSemField = ContadorSemField()
    // Atualiza o valor do contadorSemField
    contadorSemField.valor = 5  // Isso imprimiria a mensagem do setter indefinidamente
    // Imprime o valor atual do contadorSemField
    println("Valor do contador (sem 'field'): ${contadorSemField.valor}")
}
