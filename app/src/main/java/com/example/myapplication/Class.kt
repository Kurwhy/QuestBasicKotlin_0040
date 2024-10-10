package com.example.myapplication

class Motor()

class Contract(val id: Int, var email: String)

fun main() {
    val contract = Contract(1, "mary@gmail.com")

// Prints the value of the property: email
    println(contract.email)

// Update the value of the property: email
    contract.email = "jane@gmail.com"

// Prints the new value of the property: email
    println(contract.email)

}