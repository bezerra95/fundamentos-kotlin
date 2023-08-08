package colecoes

fun main() {
    // Exemplo 1: Criando um mapa e adicionando elementos
    val mapa: Map<String, Int> = mapOf("chave1" to 10, "chave2" to 20, "chave3" to 30)

    println("Mapa: $mapa") // Mapa: {chave1=10, chave2=20, chave3=30}

    // Exemplo 2: Acessando valores através das chaves
    val valorChave2 = mapa["chave2"]
    println("Valor associado à chave2: $valorChave2") // Valor associado à chave2: 20

    // Exemplo 3: Verificando se uma chave existe no mapa
    val chaveExistente = "chave1"
    val chaveInexistente = "chave4"

    val existeChave1 = mapa.containsKey(chaveExistente)
    val existeChave4 = mapa.containsKey(chaveInexistente)

    println("A chave $chaveExistente existe? $existeChave1") // A chave chave1 existe? true
    println("A chave $chaveInexistente existe? $existeChave4") // A chave chave4 existe? false

    // Exemplo 4: Percorrendo o mapa usando um loop
    for ((chave, valor) in mapa) {
        println("Chave: $chave, Valor: $valor")
    }
}