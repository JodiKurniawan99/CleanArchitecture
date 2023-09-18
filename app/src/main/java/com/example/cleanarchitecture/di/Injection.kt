package com.example.cleanarchitecture.di

import com.example.cleanarchitecture.data.IMessageDataSource
import com.example.cleanarchitecture.data.MessageDataSource
import com.example.cleanarchitecture.data.MessageRepository
import com.example.cleanarchitecture.domain.IMessageRepository
import com.example.cleanarchitecture.domain.MessageInteractor
import com.example.cleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}