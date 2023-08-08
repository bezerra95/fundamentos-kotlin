package EXERCICIOS

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
