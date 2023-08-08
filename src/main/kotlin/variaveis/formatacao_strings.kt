package variaveis

fun main() {
    // Exemplo 1: Concatenação
    println("Exemplo 1: Concatenação")
    val nomeConcat = "Alice"
    val idadeConcat = 30
    val mensagemConcat = "Olá, meu nome é " + nomeConcat + " e tenho " + idadeConcat + " anos."
    println(mensagemConcat)
    println()

    // Exemplo 2: String template
    println("Exemplo 2: String template")
    val nomeTemplate = "Bob"
    val idadeTemplate = 25
    val mensagemTemplate = "Olá, meu nome é $nomeTemplate e tenho $idadeTemplate anos."
    println(mensagemTemplate)
    println()


    // Exemplo 3: String template com expressões
    println("Exemplo 3: String template com expressões")
    val a = 10
    val b = 20
    val resultadoExpressoes = "A soma de $a e $b é ${a + b}."
    println(resultadoExpressoes)
    println()


    // Exemplo 4: Usando o método `format`
    println("Exemplo 4: Usando o método `format`")
    val nomeFormat = "Carol"
    val idadeFormat = 28
    val mensagemFormat = "Olá, meu nome é %s e tenho %d anos.".format(nomeFormat, idadeFormat)
    println(mensagemFormat)
    println()


    // Exemplo 5: Utilizando a função `run`
    println("Exemplo 5: Utilizando a função `run``")
    val nomeRun = "David"
    val idadeRun = 35
    val mensagemRun = run {
        val nomeFormatado = nomeRun.toUpperCase()
        val idadeFormatada = idadeRun * 2
        "Olá, meu nome é $nomeFormatado e tenho $idadeFormatada anos."
    }
    println(mensagemRun)
    println()


    // Exemplo 6: Usando `StringBuilder`
    println("Exemplo 6: Usando `StringBuilder`")
    val nomeBuilder = "Eve"
    val idadeBuilder = 22
    val mensagemBuilder = StringBuilder()
        .append("Olá, meu nome é ")
        .append(nomeBuilder)
        .append(" e tenho ")
        .append(idadeBuilder)
        .append(" anos.")
        .toString()
    println(mensagemBuilder)
    println()

    // Exemplo 7: Usando `String.format`
    println("Exemplo 7: Usando `String.format`")
    val nomeFormatFunction = "Fiona"
    val idadeFormatFunction = 40
    val mensagemFormatFunction = String.format("Olá, meu nome é %s e tenho %d anos.", nomeFormatFunction, idadeFormatFunction)
    println(mensagemFormatFunction)
}