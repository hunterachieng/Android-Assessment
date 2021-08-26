package com.example.androidassessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidassessment.databinding.ActivityAccountBinding

class Account : AppCompatActivity() {
    lateinit var binding: ActivityAccountBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var rvTransactions = binding.rvTransactions
        var transactions = listOf(TransactionDetails("Buying food", "MCDERUC2345", "30/2/2021",3000,"Credit Card"),
            TransactionDetails("Buying food", "MCDERUC2345", "30/2/2021",3000,"Credit Card"),
            TransactionDetails("Buying food", "MCDERUC2345", "30/2/2021",3000,"Credit Card"),
            TransactionDetails("Buying food", "MCDERUC2345", "30/2/2021",3000,"Credit Card"),
            TransactionDetails("Buying food", "MCDERUC2345", "30/2/2021",3000,"Credit Card"))


        var transactionAdapter = TransactionAdapter(transactions)
        rvTransactions.adapter = transactionAdapter
        rvTransactions.layoutManager = LinearLayoutManager(baseContext)
    }
}