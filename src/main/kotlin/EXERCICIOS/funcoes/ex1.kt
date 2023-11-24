package EXERCICIOS.funcoes

/*Escreva uma função que seja capaz de receber a quantidade de anos e transformar em meses, dias, horas,
minutos e segundos. Saída desejada:
2 anos equivalem a:
24 meses
730 dias
17520 horas
1051200 minutos
63072000 segundos*/


fun main() {
    println(tempo(2))
}

fun tempo(ano: Int): String {
    var meses = ano * 12
    var dias = ano * 365
    var horas = dias * 24
    var minutos = horas * 60
    var segundos = minutos * 60
    return "$ano anos é = a $meses Meses, $dias Dias, $horas Horas, $minutos Minutos e $segundos Segundos"
}