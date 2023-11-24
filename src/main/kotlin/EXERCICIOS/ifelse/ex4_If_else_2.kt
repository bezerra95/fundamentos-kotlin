
/*Escreva um programa para ser usado na de portaria de um evento.
a. Peça a idade. Menores de idade não são permitidos. Mensagem: “Negado. Menores de idade não são
permitidos.”.
b. Peça o tipo de convite. Os tipos de convite são comum, premium e luxo. Negar a entrada caso não seja nenhum
destes. Mensagem: “Negado. Convite inválido.”.
c. Peça o código do convite. Convites premium e luxo começam com “XL”. Convites comuns começam com “XT”.
Caso o código não esteja nos padrões, negar a entrada. Mensagem: “Negado. Convite inválido.”.
d. Caso todos os critérios sejam satisfeitos, exibir “Welcome :)”*/

package EXERCICIOS.ifelse

fun portaria(idade: Int) : String {

    val tiposConvites: List<String> = listOf("comum", "premium", "luxo")
    val tiposCod: List<String> = listOf("XL", "XT")

   return if (idade >= 18) {

        val convite = "comum"
        val cod = "XL"

        if (convite in tiposConvites && cod in tiposCod)
            "WELCOME"
        else
            "Acesso Negado. Convite invalido"

   }else
        "Acesso negado. Menores de idade não são permitidos"
}


fun main(){
    println( portaria(18))
}
