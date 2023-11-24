package EXERCICIOS.controleDeFluxoWhile

/*Considere uma caixa d’água de 2 mil litros. Rômulo gostaria de encher a caixa d’água com balões de água de
7 litros. Quantos balões cabem na caixa d’água sem que o volume seja excedido?*/

fun main() {
    baloes()
}

fun baloes() {

    var baloes = 1
    var litros = 7

    while (litros < 2000){
        litros += 7
        baloes++
    }

    if (litros > 2000){
        litros -= 7
        baloes--
        print("Foram usados $baloes baloes e enchidos $litros Litros na caixa")

    }else {
        print("Foram usados $baloes baloes e enchidos $litros Litros na caixa")
    }

}