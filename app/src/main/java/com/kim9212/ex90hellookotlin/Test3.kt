package com.kim9212.ex90hellookotlin

fun main() {
    //안드로이드에 가장 많이 사용되는
    //이너 클래스$익명클래스
    //1.이너클래스는 아웃터객체만 생성할수있음


    val obj=AAA()
    val b=obj.getBBBInstance()
    b.show()
    //2.인터페이스[추상메소드만 보유한 클래스]
//    val obj3=clicklistenr()//인터페이스는 직접객체생성불가
    //인터페이스를 사용하려면 인터페이스를 구현한 클래스를 만들어서
    //그 클래스안에서 인터페이스의 추상메소드를 오버라이드 해야만한다.
    val obj3=Clicker()
    obj3.onclick()

    //3.익명클래스[java문법이 완전다름:object키워드 사용]
    val obj4=object :clicklistenr{
        override fun onclick() {
            println("anonymous class onclick!!")
        }
        // () 없음
    }
    obj4.onclick()


}

//인터페이스는 특별할것이없음
interface clicklistenr{
    //추상메소드
    fun onclick()
}
//인터페이스를 구현한 클래스
class Clicker :clicklistenr{
    override fun onclick() {
        println("click!")
        println()
    }
}






open class AAA {
    var a: Int = 0
    fun show() {
        println("aaa의 show")
        println()
    }

    //이너클래스 객체를 생성하여 리턴해주는 메소드
    fun getBBBInstance(): BBB {
        val obj = BBB()
        return obj
    }

    //이너클래스 [자바와 다르게 inner키워드 없으면 아웃터클래스의 멤버를 내것인양 사용할수 있다]
    inner class BBB {
        fun show() {
            println("아웃터 클래스의 프로퍼티값  a:$a")
            //이너 안에서 아웃터 this 사용
            this@AAA.show()
            //mainactivity



        }
    }


}
