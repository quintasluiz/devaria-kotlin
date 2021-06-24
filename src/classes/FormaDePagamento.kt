package classes

open class FormaDePagamento {
    open fun efetuarPagamento(): Unit {
        println("Nao foi possivel processar o pagamento com a forma selecionada")

    }
}

class FormaPagamento : FormaDePagamento() {
    override fun efetuarPagamento() {
        println("Pagamento efetuado via PIX")
    }

}

class FormaPagamentoBoleto : FormaDePagamento() {
    override fun efetuarPagamento() {
        println("Pagamento efetuado via Boleto")
    }

}

