package orientacaoObjeto


// EXEMPLO  1

// Classe principal
class CarClass(private val model: String, var speed: Int) {
    // Propriedade privada que só pode ser acessada dentro da classe
    private var fuelLevel: Int = 100

    // Método público para acelerar o carro
    fun accelerate() {
        speed += 10
        consumeFuel()
    }

    // Método público para diminuir a velocidade do carro
    fun brake() {
        speed -= 10
    }

    // Método privado para consumir combustível
    private fun consumeFuel() {
        fuelLevel -= 5
    }

    // Método público para exibir informações do carro
    fun displayInfo() {
        println("Model: $model, Speed: $speed km/h, Fuel Level: $fuelLevel%")
    }
}

// EXEMPLO  2

// Classe principal
open class CarCarClass2(private val model: String, var speed: Int) {
    // Propriedade protegida que pode ser acessada por subclasses
    protected var fuelLevel: Int = 100

    // Método público para acelerar o carro
    fun accelerate() {
        speed += 10
        consumeFuel()
    }

    // Método público para diminuir a velocidade do carro
    fun brake() {
        speed -= 10
    }

    // Método protegido para consumir combustível
    protected fun consumeFuel() {
        fuelLevel -= 5
    }

    // Método público para exibir informações do carro
    fun displayInfo() {
        println("Model: $model, Speed: $speed km/h, Fuel Level: $fuelLevel%")
    }
}

// Subclasse que estende a classe Car
class ElectricCar(model: String, speed: Int) : CarCarClass2(model, speed) {
    // Método público para carregar o carro elétrico
    fun chargeBattery() {
        fuelLevel = 100 // Acessando a propriedade protegida fuelLevel da superclasse
    }
}



fun main() {

    println("Exemplo com PRIVATE")


    // Criando um objeto da classe Car
    val myCar = CarClass("Toyota", 60)

    // Tentando acessar propriedades e métodos com diferentes modificadores de visibilidade
    //  myCar.model // Erro! model é privado e não pode ser acessado externamente   -------> DESCOMENTA PRA VER O RESULTADO BY Julio

    myCar.speed = 70 // Acesso permitido, speed é pública
    myCar.accelerate() // Acesso permitido, accelerate() é pública
    myCar.brake() // Acesso permitido, brake() é pública
    myCar.displayInfo() // Acesso permitido, displayInfo() é pública


    println("\nExemplo com PROTECTED")


    // Criando um objeto da classe ElectricCar
    val myElectricCar = ElectricCar("Tesla", 60)

    // Acessando membros da superclasse Car e da subclasse ElectricCar
    myElectricCar.accelerate() // Acesso permitido, accelerate() é pública na superclasse Car
    myElectricCar.chargeBattery() // Acesso permitido, chargeBattery() é pública na subclasse ElectricCar
    myElectricCar.displayInfo() // Acesso permitido, displayInfo() é pública na superclasse Car
}
