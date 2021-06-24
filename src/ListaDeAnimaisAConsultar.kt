import classes.Ave
import classes.Mamifero
import classes.Peixe
import classes.Reptil

fun main() {
    println("Favor informar qual animal voce deseja saber mais:")
    val animalInformado = readLine()

    if (animalInformado.isNullOrBlank() || animalInformado.isNullOrEmpty()){
        println("Animal informado não e valido")
        return
    }

    val listaDeAnimaisBancoDeDados = arrayOf(
        Peixe(nome="Tubarão", qtdNadadeiras = 2),
        Mamifero(nome = "Leao", qtdMamas = 4),
        Ave(nome = "Gaviao", qtdPenas = 500, consegueFazerMigracao = true),
        Reptil(nome = "Serpente", temperaturaCorporal = 8.0)
    )
    val animalSelecionado = listaDeAnimaisBancoDeDados.find{it.nome.equals(animalInformado, ignoreCase = true) }
    if (animalSelecionado == null){
        println("Animal informado nao esta na nossa base, tente nvamente")
    }
    when(animalSelecionado){
        is Mamifero -> println("Voce pesquisou sobre o animal ${animalSelecionado.nome} ele e um mamifero e tem as seguintes caracteristicas: e aquatico ${animalSelecionado.isMamiferoAquatico}"+
        "pode botar ovo ${animalSelecionado.consegueBotarOvo}")

        is Reptil -> println("Voce pesquisou sobre o animal ${animalSelecionado.nome} ele e um reptil e tem as seguintes caracteristicas: e terrestre ${animalSelecionado.isReptilTerrestre}"+
                "quantidade de patas ${animalSelecionado.qtdDePatas}")
        is Ave -> println("Voce pesquisou sobre o animal ${animalSelecionado.nome} ele e um ave e tem as seguintes caracteristicas: e voa ${animalSelecionado.consegueVoar}"+
                "e faz migraçao ${animalSelecionado.consegueFazerMigracao}")
        is Peixe -> println("Voce pesquisou sobre o animal ${animalSelecionado.nome} ele e um peixe e tem as seguintes caracteristicas: e terrestre ${animalSelecionado.isPeixeAguaSalgada}"+
                "quantidade de patas ${animalSelecionado.isCarnivoro}")
        else -> println("Voce pesquisou sobre o animal ${animalSelecionado.nome} ele e um animal nao oidentificado")
    }
}