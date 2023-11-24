package EXERCICIOS.controleDeFluxoWhile

/*FizzBuzz. Imprima os números de 1 a 50 em ordem crescente de acordo com a regra abaixo:
a. Quando um número for divisível por 3, imprimir Buzz.
b. Quando um número for divisível por 5, imprimir Fizz.
c. Quando um número for divisível por 3 e 5, imprimir FizzBuzz*/

fun main(){
    FizzBuzz()
}
fun FizzBuzz(){
    var n = 0

    while (n < 50){
        n++
        if (n % 3 == 0)
            print("Buzz ")

        else if (n % 5 == 0)
            print("Fizz ")

        else if (n % 3 == 0 && n % 5 == 0)
            print("FizzBuzz ")

        else
            print(n)
    }
}