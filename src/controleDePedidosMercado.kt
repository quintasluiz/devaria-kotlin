
//escrever um programa que recebe alguns produtos como argumentos -START

fun main(argumentos : Array<String>) {

    //validar se vieram produtos nos argumentos
    if(argumentos.isEmpty()){
        println("Favor informar sua lista de produtos")
        return
    }

    //END

    //Validar se esses produtos estao na lista de itens disponiveis do mercado - START

    val produtosDisponiveis = arrayOf("PAO", "BOLACHA", "QUEIJO", "ARROZ", "FEIJAO","OVO","FRANGO")


    val produtosRequisitadosDisponiveis = argumentos.filter { produtoRequisitado -> produtosDisponiveis.contains(produtoRequisitado.toUpperCase()) }

    //END

    //Caso estejam avisar o usuario quais produtos tem -START
    for(produtoRequisitadoDisponiveis in produtosRequisitadosDisponiveis){
        println("Este produto nos temos: $produtoRequisitadoDisponiveis")
    }

    //END

    //E quais nao tem -START

    val produtosRequisitadosNaoDisponivel = argumentos.filter{produtoRequisitado ->
        !produtosDisponiveis.contains(produtoRequisitado.toUpperCase()) }

    produtosRequisitadosNaoDisponivel.forEach { produtoNaoDisponivel -> println("Este produto nos nao temos infelizmente: $produtoNaoDisponivel")
    }

    //END

    //Lista de produtos disponiveis ordenados ordem alfabetica
    val produtosOrdenados = produtosDisponiveis.sortedBy { produto -> produto }
    produtosOrdenados.forEach { produto -> println("Confira este produto disponiel: $produto") }
}

