package com.jgdev.fragmentsaction.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.jgdev.fragmentsaction.R

class MensagemAdapter(

    private val  ontap: (String)-> Unit

) : Adapter<MensagemAdapter.MensagemViewHolder>() {
    private  var multableMensagem  = mutableListOf<Mensagem>()

    fun atualizarList( list : MutableList<Mensagem> ){
//        multableMensagem.addAll(list)

        multableMensagem = list
        notifyDataSetChanged() // avisa pro adaptarque a a lista mudou
    }

    fun execultUpdate(msg:Mensagem){
        multableMensagem.add(msg)
        notifyItemInserted(multableMensagem.size) // NOTIFICA O ITEM AN POSIÇÂO
        notifyItemRangeInserted(multableMensagem.size, 3) // NOTIFICA ATUALIZAÇÂO  A PARTIRD UM RANGE
    }




    inner class MensagemViewHolder(
        val itemView : View
    ): ViewHolder(itemView) {

//         val  textNome : TextView = itemView.findViewById(R.id.text_nome)
//         val  textsubTitle : TextView = itemView.findViewById(R.id.text_subtitle)

         val  textNome : TextView = itemView.findViewById(R.id.text_card_nome)
         val  textsubTitle : TextView = itemView.findViewById(R.id.text_card_ultima)



    }

    // CRIAA  VISUALIZAÇÂO
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MensagemViewHolder {
       val inflateViewHolder = LayoutInflater.from(parent.context) // crio o inflate do zero

        // item view
//        val itemView = inflateViewHolder.inflate(
//            R.layout.item_list,
//            parent,
//            false
//        )

                val itemView = inflateViewHolder.inflate(
            R.layout.item_card_view,
            parent,
            false
        )

        return MensagemViewHolder(itemView)
    }
        // RETORNA O TAMANHO DA LISTA
        override fun getItemCount(): Int {
            return  multableMensagem.size
        }
 // AO VINCULAR O VIEWHOLDER
    override fun onBindViewHolder(holder: MensagemViewHolder, position: Int) {
        val mensagem = multableMensagem[position]
        holder.textNome.text = mensagem.nome
        holder.textsubTitle.text = mensagem.ultima

        ontap(mensagem.nome)
    }
}