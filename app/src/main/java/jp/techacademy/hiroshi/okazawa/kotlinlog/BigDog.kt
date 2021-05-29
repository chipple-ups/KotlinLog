package jp.techacademy.hiroshi.okazawa.kotlinlog

import android.util.Log

class BigDog: Dog {

    // superで親クラスのコンストラクタを呼ぶ
    constructor(name: String, age: Int, think: String): super(name, age, think) {
    }

    override fun say() {
        super.say()
        Log.d("kotlintest", "大きな犬です。")
    }
}