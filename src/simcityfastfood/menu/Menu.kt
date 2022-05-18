package simcityfastfood.menu

import simcityfastfood.carrinho.Carrinho
import simcityfastfood.util.MSG_FORMATO_INVALIDO
import simcityfastfood.util.MSG_OPCAO_INVALIDA
import kotlin.system.exitProcess

class Menu {

    init {
        println("----------  LANCHONETE  ----------")
        println("---------- SIMCITY FOOD ----------")
        menuPrincipal()
    }

    fun menuPrincipal() {
        try {
            println("O que deseja comprar?")
            println("[1] - Lanches")
            println("[2] - Bebidas")
            println("[3] - Ver Carrinho de Compras")
            println("[4] - Remover item")
            println("[5] - Sair")

            when (readln().toInt()) {

                1 -> {
                    menuLanche()
                }
                2 -> {
                    menuBebidas()
                }
                3 -> {
                    Carrinho.mostrarProdutoCarrinho()
                    menuPrincipal()
                }
                4 -> {
                    Carrinho.removerProdutoCarrinho()
                    menuPrincipal()
                }
                5 -> {
                    println("SimCity Food agradece a preferência! Volte Sempre!")
                    exitProcess(10)
                }
                else -> {
                    println(MSG_OPCAO_INVALIDA)
                    menuPrincipal()
                }
            }

        } catch (exception: NumberFormatException) {
            println(MSG_FORMATO_INVALIDO)
        }
    }

    fun menuLanche() {
        try {
            println("Escolha seu lanche")
            println("[1] - X-Burguer - R$10,00")
            println("[2] - X-Salada - R$ 12,00")
            println("[3] - Voltar ao Menu Principal")

            when (readln().toInt()) {
                1 -> {
                    Carrinho.incluirXBurguer()
                    Carrinho.mostrarProdutoCarrinho()
                }
                2 -> {
                    Carrinho.incluirXSalada()
                    Carrinho.mostrarProdutoCarrinho()
                }
                3 -> {
                    menuPrincipal()
                }
                else -> {
                    println(MSG_OPCAO_INVALIDA)
                    menuLanche()
                }
            }
            menuPrincipal()
        } catch (exception: NumberFormatException) {
            println(MSG_FORMATO_INVALIDO)
            menuLanche()
        }
    }

    fun menuBebidas() {
        try {
            println("Escolha sua Bebida")
            println("[1] - Refrigerante - R$8,00")
            println("[2] - Suco - R$ 6,00")
            println("[3] - Voltar ao Menu Principal")

            when (readln().toInt()) {
                1 -> {
                    Carrinho.incluirRefrigerante()
                    Carrinho.mostrarProdutoCarrinho()
                }
                2 -> {
                    Carrinho.incluirSuco()
                    Carrinho.mostrarProdutoCarrinho()
                }
                3 -> {
                    menuPrincipal()
                }
                else -> {
                    println(MSG_OPCAO_INVALIDA)
                    menuBebidas()
                }
            }
            menuPrincipal()
        } catch (exception: NumberFormatException) {
            println(MSG_FORMATO_INVALIDO)
            menuBebidas()
        }
    }
}



