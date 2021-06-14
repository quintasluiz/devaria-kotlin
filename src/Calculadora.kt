import java.math.BigDecimal

fun calculaOperacao(primeiroNumero : BigDecimal, operador : String, segundoNumero : BigDecimal) : BigDecimal{
    when(operador){
        "+" -> return primeiroNumero + segundoNumero
        "-" -> return primeiroNumero - segundoNumero
        "*" -> return primeiroNumero * segundoNumero
        "/" -> return primeiroNumero / segundoNumero
        "%" -> return primeiroNumero % segundoNumero
        else -> return BigDecimal.ZERO
    }
}

fun main() {

    println("Digite um numero valido:")
    val primeiroNumero = readLine()?.toBigDecimalOrNull()

    if(primeiroNumero == null){
        println("Primeiro numero informado não e valido")
        return
    }

    println("Digite um operador valido (+, - , *, /, %:")
    val operador = readLine()

    if(operador.isNullOrEmpty() || operador.isNullOrBlank() ||
        (operador != null && operador !="+" && operador !="-" && operador !="*"
                && operador !="/" && operador !="%")){
        println("Operador invalido")
        return
    }

    println("Digite o segundo valido:")
    val segundoNumero = readLine()?.toBigDecimalOrNull()

    if(segundoNumero == null){
        println("Segundo numero informado não e valido")
        return
    }

    val resultado = calculaOperacao(primeiroNumero,operador, segundoNumero)
    println("O resultdo da sua operação foi: $resultado")
}