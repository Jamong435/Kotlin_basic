package com.kim9212.ex90hellookotlin

fun main(){
    //코틀린상속
    var obj= Second()


    obj.show()
    //상속의 최종연습
    val p= Person("sam",20)




}
//상속해줄 부모클래스 //상속을 시키지않으려면 open을 누르지않으면됨.
open class First{
    var a:Int=0
    open fun show(){
        println("a:$a")

    }

}
//상속의 문법[클래스명뒤에:후 부모클래스명() 작성<-부모클래스명뒤에 주생성자 호출() 주의!
class  Second : First(){
    var b:Int=20

    //상속받은 메소드의 기능을 변경:override
    //기존 메소드와 같은 이름과 파라미터로 만든 메소드
    //오버라이드를 하려면 반드시 override하겠다는 키워드 추가

    override fun show() {

        super.show()
        println("b:$b")
    }

}
