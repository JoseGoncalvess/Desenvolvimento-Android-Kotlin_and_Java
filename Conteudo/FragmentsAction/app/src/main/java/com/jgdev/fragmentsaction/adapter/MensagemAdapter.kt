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
    private  val list : List<Mensagem>

) : Adapter<MensagemAdapter.MensagemViewHolder>() {

    inner class MensagemViewHolder(
        val itemView : View
    ): ViewHolder(itemView) {

         val  textNome : TextView = itemView.findViewById(R.id.text_nome)
         val  textsubTitle : TextView = itemView.findViewById(R.id.text_subtitle)
         val  checkBox : CheckBox = itemView.findViewById(R.id.checked_speak)

    }

    // CRIAA  VISUALIZAÇÂO
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MensagemViewHolder {
       val inflateViewHolder = LayoutInflater.from(parent.context) // crio o inflate do zero
        val itemView = inflateViewHolder.inflate(
            R.layout.item_list,
            parent,
            false
        )

        return MensagemViewHolder(itemView)
    }
        // RETORNA O TAMANHO DA LISTA
        override fun getItemCount(): Int {
            return  list.size
        }
 // AO VINCULAR O VIEWHOLDER
    override fun onBindViewHolder(holder: MensagemViewHolder, position: Int) {
        val mensagem = list[position]
        holder.textNome.text = mensagem.nome
        holder.textsubTitle.text = mensagem.ultima
        holder.checkBox.isActivated = mensagem.status

    }
}