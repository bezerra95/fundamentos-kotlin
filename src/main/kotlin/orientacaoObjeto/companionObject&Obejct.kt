package orientacaoObjeto

// Explicação da diferença entre companion object e object:

// Definição de uma classe simples
class MyClass {
    // Propriedade da classe
    val property = "Propriedade da classe"

    // Função da classe
    fun method() {
        println("Método da classe")
    }

    // Companion object dentro da classe
    companion object {
        // Propriedade do companion object
        val companionProperty = "Propriedade do companion object"

        // Função do companion object
        fun companionMethod() {
            println("Método do companion object")
        }
    }
}

// Objeto singleton
object SingletonObject {
    // Propriedade do objeto singleton
    val singletonProperty = "Propriedade do objeto singleton"

    // Função do objeto singleton
    fun singletonMethod() {
        println("Método do objeto singleton")
    }
}

fun main() {
    println("Acesso à propriedade e função da classe MyClass")
    // Acesso à propriedade e função da classe MyClass
    val myClass = MyClass()
    println(myClass.property)
    myClass.method()

    println("\nAcesso à propriedade e função do companion object")
    // Acesso à propriedade e função do companion object
    println(MyClass.companionProperty)
    MyClass.companionMethod()

    println("\nAcesso à propriedade e função do objeto singleton")
    // Acesso à propriedade e função do objeto singleton
    println(SingletonObject.singletonProperty)
    SingletonObject.singletonMethod()
}


//Diferenças Didáticas:

//Companion Object:

//Funciona como uma parte da classe em si.
//Útil quando você precisa de métodos ou constantes relacionados à classe.
//Métodos do companion object podem ser chamados diretamente usando o nome da classe.


//Object:

//É um objeto independente.
//Útil quando você precisa de um único objeto para uma funcionalidade específica.
//Pode conter propriedades e métodos e é acessado diretamente pelo nome do objeto.
//Em resumo, enquanto o companion object está associado a uma classe e é usado para
// agrupar métodos e constantes relacionadas a essa classe,
// o object é um objeto único independente, útil para criar singletons e agrupar funcionalidades
// sem a necessidade de uma classe correspondente.