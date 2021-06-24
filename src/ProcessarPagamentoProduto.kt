import classes.FormaDePagamento
import classes.FormaPagamentoEnum
import classes.Produto

fun main(argumentos : Array<String>) {
    if(argumentos.isEmpty()){
        println("Favor informar os produtos a serem comprados")
        return
    }

    val produtosDisponiveis = arrayOf(
        Produto(nome = "Tenis", preco = 290.0),
        Produto(nome = "Bola", preco = 220.0)
    )

    val produtosSelecionados = produtosDisponiveis.filter { it:produto
    argumentos.any { argumento -> it.nome.equals(argumento, ignoreCase = true)}
    }

    if (produtosSelecionados.isEmpty()){
        println("Os produtos selecionados nao estao disponiveis")
        return
    }

    println("Favor informar a forma de pagamento desejada(Boleto, Pix")
    val formaPagamentoSelecionada = readLine()

    if(formaPagamentoSelecionada.isNullOrEmpty() || formaPagamentoSelecionada.isNullOrBlank())
        println("Favor informar uma forma de pagamento valida")
        return
}

    val formaPagamento : FormaDePagamento = if(formaPagamentoSelecionada == Pix.toString()){
        FormaPagamentoPix()
    }else if (formaPagamentoSelecionada == Boleto.toString())) {
        FormaPagamentoBoletto()
    }else {
        FormaDePagamento()

    }

    println("Seus produtos selecionados")
    produtosSelecionados.forEach { it.exibirDadosProduto()}
    formaPagamento.efetuarPagamento()
}