fun main(argumentos : Array<String>) {

    if(argumentos.isEmpty()) {
        println("Favor informar um argumento valido")
        return
    }

    val numero = argumentos[0].toIntOrNull()

    if(numero == null){
        println("o valor informado nao e um numero valido")
        return
    }

    println("o numero digitado foi: $numero")

    var soma = 0
    soma = numero + numero
    println("A soma do numero + numero e de: $soma")
}