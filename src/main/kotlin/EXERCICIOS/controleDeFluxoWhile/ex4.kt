package EXERCICIOS.controleDeFluxoWhile

/*Escreva uma função que recebe uma string, verifica se existe a mesma quantidade de caracteres ‘x’ e ‘o’ e
retorna true ou false. Caso não exista nem ‘x’ nem ‘o’, retornar false.
“xxooox” -> true “xxxxo” -> false “bdefghjij” -> false “ooooxzzzzz” -> false*/


fun main(){
    quantidadeDeCaracteres()
}

fun quantidadeDeCaracteres(){
    var palavra = "juliooocexxx"
    var tamanhoString = palavra.length
    var i = 0
    var cont1 = 0
    var cont2 = 0
    while (i < tamanhoString){
        var p = palavra[i]

        if (p == 'x')
            cont1++
        else if (p == 'o')
            cont2++
        i++
    }

    if (cont1 == cont2)
        println("True = (x:$cont1, o:$cont2)")
}