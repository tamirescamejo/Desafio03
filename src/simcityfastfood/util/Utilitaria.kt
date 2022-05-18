package simcityfastfood.util

import simcityfastfood.carrinho.Carrinho

class Utilitaria {

    var qtdProduto: Int = 0

    fun inserirQtdProdutos() : Int {
        try {
            println("Quantidade do produto: ")
            qtdProduto = readln().toInt()
            validarQtdProduto()
        } catch (exception: NumberFormatException){
            println(MSG_FORMATO_INVALIDO)
            inserirQtdProdutos()
        }
        return qtdProduto
    }

    fun validarQtdProduto(){
        try{
        if (qtdProduto <= 0) {
            println(MSG_QTD_INVALIDA)
            qtdProduto = readln().toInt()
        }else {
            Carrinho.atualizaQtdProduto(qtdProduto)
        }
        } catch (exception: NumberFormatException) {
            println(MSG_FORMATO_INVALIDO)
            inserirQtdProdutos()
        }
    }
}
