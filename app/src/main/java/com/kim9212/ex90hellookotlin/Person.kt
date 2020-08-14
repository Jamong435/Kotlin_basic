package com.kim9212.ex90hellookotlin


//주생성자 파라미터에 var 키워드를 삽입하면 곧바로 멤버변수가된다
open class Person constructor(var name: String?,var age: Int){
    init {
        println("Person")
    }
    open fun show(){
        println("name:$name"+"age:$age")
    }

}