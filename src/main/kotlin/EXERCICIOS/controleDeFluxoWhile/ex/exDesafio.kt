package EXERCICIOS.controleDeFluxoWhile.ex

import EXERCICIOS.controleDeFluxoWhile.quantidadeDeCaracteres

/*Ana e Paula são duas programadoras da empresa XDM. A empresa XDM possui um benefício para incentivar os funcionários a
pouparem dinheiro para a aposentadoria que funciona da seguinte maneira:
Se o funcionário destinar 5% do seu salário para o investimento, a empresa acrescenta o mesmo valor. Ou seja, caso o
funcionário invista 100 reais, a empresa investe mais 100. Este fundo de investimento possui rendimento de 0,2% ao mês.
Ana adorou a ideia e vai investir. No entanto, Paula decidiu que vai investir os mesmos 5% por conta própria já que conhece
investimentos que rendem mais que 0,2% ao mês. Paula vai escolher investimentos que rendem 0,8% ao mês.
Considere o salário de Ana e Paula iguais e no valor de 10 mil reais e que as duas estão começando com saldo 0 e que investirão
5% do salário.
Em quantos meses o patrimônio de Paula vai superar o patrimônio de Ana?*/

fun main() {
    val salario = 10000f

    var patAna = 0f
    var patPaula = 0f
    var mes = 0

    do {
        patAna += (salario * 0.05f + salario * 0.05f + patAna * 0.002f)
        patPaula += (salario * 0.05 + patPaula * 0.008).toFloat()
        mes++
    } while (patAna > patPaula)

    println("Paula vai ultrapassar o patrimônio de Ana no mês $mes.")
}