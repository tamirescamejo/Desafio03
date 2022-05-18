package simcityfastfood.produtos.bebidas

import simcityfastfood.produtos.Produtos

class Suco(
    override var qtdProduto: Int = 0,
    override var nomeProduto: String = "Suco",
    override var valorProduto: Double = 6.0
    ) : Produtos() {
}