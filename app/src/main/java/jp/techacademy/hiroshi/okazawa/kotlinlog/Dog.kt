package jp.techacademy.hiroshi.okazawa.kotlinlog

import android.util.Log

open class Dog: Animal, Movable {
    // プロパティ

    // 引数付きコンストラクタ
    constructor(name: String, age: Int): super(name, age)

    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }
    override fun move() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "は全力で走った。")
    }

}