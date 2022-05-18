package simcityfastfood.carrinho

import simcityfastfood.produtos.Produtos
import simcityfastfood.produtos.bebidas.Refrigerante
import simcityfastfood.produtos.bebidas.Suco
import simcityfastfood.produtos.lanches.XBurguer
import simcityfastfood.produtos.lanches.XSalada
import simcityfastfood.util.*

object Carrinho {

    val carrinho = mutableMapOf<Int,Produtos>()
    var codigoProduto: Int = 0

    fun guardarProdutoCarrinho(listaProdutos: Produtos): Int {
        codigoProduto += 1
        carrinho[codigoProduto] = listaProdutos
        return codigoProduto
    }

    fun atualizaQtdProduto(qtdProdutos: Int){
        val produtoAtual = carrinho.get(codigoProduto)
        produtoAtual?.qtdProduto = qtdProdutos
        produtoAtual.let { carrinho[codigoProduto] = it!!}
    }

    fun mostrarProdutoCarrinho() {
        if (carrinho.isEmpty()) {
            println("O seu carrinho está vazio")
        } else {
            carrinho.forEach { (chave, produto) ->
                println("$chave - ${produto.qtdProduto} ${produto.nomeProduto} - R$ ${produto.qtdProduto * produto.valorProduto}")
            }
        }
    }

    fun incluirXBurguer() {
        val xBurger = XBurguer()
        guardarProdutoCarrinho(xBurger)
        Utilitaria().inserirQtdProdutos()
    }

    fun incluirXSalada() {
        val xSalada = XSalada()
        guardarProdutoCarrinho(xSalada)
        Utilitaria().inserirQtdProdutos()
    }

    fun incluirRefrigerante() {
        val refrigerante = Refrigerante()
        guardarProdutoCarrinho(refrigerante)
        Utilitaria().inserirQtdProdutos()
    }

    fun incluirSuco() {
        val suco = Suco()
        guardarProdutoCarrinho(suco)
        Utilitaria().inserirQtdProdutos()
    }

    fun removerProdutoCarrinho() {
        try {
            println("Qual o código deseja remover? ")
            var codigo = readln().toInt()
            if (codigo <= 0) {
                println(MSG_QTD_INVALIDA)
                codigo = readln().toInt()
            } else {
                if (codigo in carrinho) {
                    println("Produto removido com sucesso!")
                    carrinho.remove(codigo)
                    println("------- SimCity FastFood ---------")
                    mostrarProdutoCarrinho()
                } else {
                    println("Código não encontrato")
                }
            }
        } catch (e: NumberFormatException) {
            println(MSG_OPCAO_INVALIDA)
            removerProdutoCarrinho()
        }
    }

    fun alterarProdutoCarrinho(){

    }

}



