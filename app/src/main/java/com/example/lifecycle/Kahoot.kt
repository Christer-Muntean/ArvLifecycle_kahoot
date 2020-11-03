package com.example.lifecycle

class Kahoot(var users: List<User>) : ApiService() {

    fun start(){
        userBatchUpload(users)
    }
}