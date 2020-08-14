package com.kim9212.ex90hellookotlin

//constructori(주생성자) 쓰는거 생략가능
class albastudent (name:String, age:Int,major:String, var task:String) :Student(name,age,major) {

    init {
        println("알바학생 생성")
    }

    override fun show() {
        //
        println("name:$name age:$age marjor:$major task:$task")
    }


}