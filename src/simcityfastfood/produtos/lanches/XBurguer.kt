package simcityfastfood.produtos.lanches

import simcityfastfood.produtos.Produtos

class XBurguer(
    override var qtdProduto: Int = 0,
    override var nomeProduto: String = "X-Burguer",
    override var valorProduto: Double = 10.0
    ) : Produtos() {
}