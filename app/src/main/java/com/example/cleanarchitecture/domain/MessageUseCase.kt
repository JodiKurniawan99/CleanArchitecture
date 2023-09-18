package com.example.cleanarchitecture.domain

interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}