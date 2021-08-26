package com.example.androidassessment

data class TransactionDetails(
    var description:String,
    var reference: String,
    var date:String,
    var amount: Int,
    var transactionType:String
)
