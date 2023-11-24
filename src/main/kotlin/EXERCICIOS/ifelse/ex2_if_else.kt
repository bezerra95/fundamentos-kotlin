/*Modifique o primeiro exercício para considerar o tempo de experiência no cálculo de bônus.
a. Gerentes com menos de 2 anos de experiência recebem R$ 2.000,00, caso contrário recebem R$ 3.000,00
b. Coordenadores com menos de 1 ano de experiência recebem R$ 1.500,00, caso contrário recebem R$ 1.800,00
c. Engenheiros de software recebem R$ 1.000,00
d. Estagiários recebem R$ 500,00
* */

fun main() {
    var cargo = "Coodernador"
    bonusCalculado(cargo, 0)
}

fun bonusCalculado(cargo: String, exp: Int) {

    if(cargo == "Gerente"){
        if(exp < 2){
            println("$cargo = Bônus-R$ 2.000")
        }else{
            println("$cargo = Bônus-R$ 3.000")
        }
    }

    else if(cargo == "Coodernador"){
        if(exp < 1){
            println("$cargo = Bônus-R$ 1.500")
        }else{
            println("$cargo = Bônus-R$ 1.800")
        }
    }

    else if(cargo == "Coodernador"){
        println("$cargo = Bônus-R$ 1.500")
    }

    else if(cargo == "Engenheiro de software"){
        println("$cargo = Bônus-R$ 1.000")
    }

    else if(cargo == "Estagiario"){
        println("$cargo = Bônus-R$ 500")
    }
    else{
        println("ERRO")
    }
}