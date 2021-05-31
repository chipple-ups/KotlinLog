package jp.techacademy.hiroshi.okazawa.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("taro", 20, "お金")
        val human2 = Human("jiro",15,"生活")

        human.say()
        human.think()
        human2.say()
        human2.think()
    }



}

