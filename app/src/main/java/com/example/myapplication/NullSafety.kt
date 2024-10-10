package com.example.myapplication

fun nullSafety() {
// neverNull has String type
    val neverNull: String = "This can't be null"

// Throws a compiler error
// neverNull = null

// nullable has nullable String type
    var nullable: String? = "You can keep a null here"
// This is OK
    nullable = null
