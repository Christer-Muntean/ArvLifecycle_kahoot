package com.example.lifecycle

import android.util.Log

open class ApiService {

    fun userBatchUpload(listOfUsers: List<User>){
        for (user in listOfUsers){
            Log.d("UPLOAD_USER_TO_DB", "${user.id} ${user.name} ${user.email}")
        }
    }
}