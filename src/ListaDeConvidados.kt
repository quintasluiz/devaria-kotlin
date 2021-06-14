fun main() {

    println("Favor informar o nome do convidado")
    val nome = readLine()

    if(nome.isNullOrEmpty() || nome.isNullOrBlank()) {
        println("Nome informado não é válido")
        return
    }

    println("Favor informar a idade do convidado")
    val idade = readLine()?.toIntOrNull()

    if(idade == null || idade <= 0) {
        println("A idade informada nao e valida")
        return
    }

    var estaConvidado = false
    when(nome){
         "kaique" -> estaConvidado = true
          "Ale" -> estaConvidado = true
          "Ricardo" -> estaConvidado = true
            "Alan" -> estaConvidado = true
            else -> estaConvidado = false
    }

    if(estaConvidado && idade >= 18){
        println("Bem vindo a festa Kotlin devaria")
    }else if(!estaConvidado){
        println("Voce nao esta na lista de convidados")
    }else{
        println("Voce nao tem 18 anos para entrar na festa")
    }

}