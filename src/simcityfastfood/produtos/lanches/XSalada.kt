package simcityfastfood.produtos.lanches

import simcityfastfood.produtos.Produtos

class XSalada(
    override var qtdProduto: Int = 0,
    override var nomeProduto: String = "X-Salada",
    override var valorProduto: Double = 12.0
    ) : Produtos(){
}
