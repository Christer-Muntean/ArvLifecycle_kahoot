package com.example.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var kahootGame: Kahoot;
    var listOfUsers: List<User>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        if(listOfUsers.isNullOrEmpty()){
            listOfUsers = listOf<User>(
                User("christer", "enmail@gmail.com", "8c7g9bia"),
                User("Stine", "stineyolo@yahoo.com", "8ichundia")
            )
        }

        listOfUsers?.let {
            kahootGame = Kahoot(it)
        }

        start_button.setOnClickListener {
            kahootGame.start()
        }

    }

}