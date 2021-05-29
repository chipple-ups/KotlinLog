package jp.techacademy.hiroshi.okazawa.kotlinlog

abstract class Animal {

    var name: String
    var age: Int
    var think: String

    constructor(name:String, age: Int, think: String) {
        this.name = name
        this.age = age
        this.think = think
    }

    abstract fun say()




}