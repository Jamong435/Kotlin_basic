package com.kim9212.ex90hellookotlin

import android.bluetooth.BluetoothClass

open class Student constructor(name:String,age:Int,var major: String):Person(name,age) {

    init {
        println("studnt클래스 만들어짐")
    }
    //override키워드주의 [override는 자동 open이다.


    override fun show(){
        super.show()
        println("name:$name age:$age major:$major")
    }

}