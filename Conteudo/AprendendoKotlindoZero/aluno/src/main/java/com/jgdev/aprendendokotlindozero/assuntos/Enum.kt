package com.jgdev.aprendendokotlindozero.assuntos

// PEDIDO_REALIZADO, PEDIDO_COMFIRMADO, PEDIDO_ENVIADO,PEDIDO_ENTREGUE


class Pedido(var itens : String = "", var valor : Double = 0.0, var statusPedido : StatusPedido = StatusPedido.PEDIDO_REALIZADO){
    companion object{
        fun atualizarStatus(pedido: Pedido){
            if (pedido.statusPedido == StatusPedido.PEDIDO_REALIZADO){
                println("SEU PEDIDO FOI REALIZADO")
            } else if(pedido.statusPedido == StatusPedido.PEDIDO_COMFIRMADO){
                println("SEU PEDIDO FOI COMFIRMADO")
            }else if (pedido.statusPedido == StatusPedido.PEDIDO_ENVIADO){
                println("SEU PEDIDO FOI ENVIADO")
            } else if (pedido.statusPedido == StatusPedido.PEDIDO_ENTREGUE){
                println("SEU PEDIDO FOI RENTREGUE")
            }
        }
    }

}

// TODO ENUM CLASS COSTUMA_SE USAR EM CASOS QUE EXISTE VALORES CONSTANTE E PRECISAMOS GARANTIR QUE NÂO SERÃO USADO OUTROS VALORES
// FORMA DE DA SEFURANÇA AS INFORMAÇÔES

/*
Dess amneira conssigo garantir que as infomações usadas nunca mudarão e que respeitação uma lsta de opções
 */
enum class StatusPedido{
    PEDIDO_REALIZADO,
    PEDIDO_COMFIRMADO,
    PEDIDO_ENVIADO,
    PEDIDO_ENTREGUE
}



fun main() {

    val  pedido = Pedido("BATAT FRITA", 15.5)
    pedido.statusPedido = StatusPedido.PEDIDO_COMFIRMADO

Pedido.atualizarStatus(pedido)


}