package simcityfastfood.produtos.bebidas

import simcityfastfood.produtos.Produtos

class Refrigerante(
    override var qtdProduto: Int = 0,
    override var nomeProduto: String = "Refrigerante",
    override var valorProduto: Double = 8.0
    ) : Produtos() {
}