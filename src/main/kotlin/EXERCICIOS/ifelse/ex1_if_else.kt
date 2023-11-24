package EXERCICIOS.ifelse


/*Escreva um programa para ajudar a empresa XPTO calcular o bônus que os funcionários receberão no final
do ano. Os bônus são classificados por cargo.
a. Gerentes recebem R$ 2.000,00
b. Coordenadores recebem R$ 1.500,00
c. Engenheiros de software recebem R$ 1.000,00
d. Estagiários recebem R$ 500,00
* */
fun main() {
    var cargo = "Engenheiro de software"
    bonusCalculado(cargo)

}

fun bonusCalculado(cargo: String) {
    if(cargo == "Gerente"){
        println("$cargo = Bônus-R$ 2.000")
    }else if(cargo == "Coodernador"){
        println("$cargo = Bônus-R$ 1.500")
    }else if(cargo == "Engenheiro de software"){
        println("$cargo = Bônus-R$ 1.000")
    }else if(cargo == "Estagiario"){
        println("$cargo = Bônus-R$ 500")
    }else{
        println("ERRO")
    }
}