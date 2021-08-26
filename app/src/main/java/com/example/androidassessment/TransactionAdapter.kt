package com.example.androidassessment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TransactionAdapter(var transactionList: List<TransactionDetails>):RecyclerView.Adapter<TransactionViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.transaction_detail,parent,false)
    }

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        var transactions = transactionList.get(position)
        holder.tvdescription = transactions.description
        holder.tvreference = transactions.reference
        holder.tvdate = transactions.date
        holder.tvAmount = transactions.amount


    }

    override fun getItemCount(): Int {
       return  transactionList.size
    }
}
class TransactionViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
   var tvAmount = itemView.findViewById<TextView>(R.id.tvAmount)
   var tvdescription = itemView.findViewById<TextView>(R.id.tvDescription)
   var tvreference= itemView.findViewById<TextView>(R.id.tvReverence)
   var tvdate = itemView.findViewById<TextView>(R.id.tvDate)
   var tvtranstactionType = itemView.findViewById<TextView>(R.id.tvTransactionType)

}