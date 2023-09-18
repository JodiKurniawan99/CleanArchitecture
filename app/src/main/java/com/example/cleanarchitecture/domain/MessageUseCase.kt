package com.example.cleanarchitecture.domain


//This class is used as the parent code for the Interactor to be defined.
//Why do you need to create this interface?
//This is because the relationship between ViewModel/Presenter and UseCase should
//not be from concrete class to concrete class, but from concrete class to abstract class.
interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}