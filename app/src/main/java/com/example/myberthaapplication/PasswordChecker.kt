package com.example.myberthaapplication

object PasswordChecker {
    fun Check(username: String, password: String): Boolean {
        return password.startsWith("1")
    }
}