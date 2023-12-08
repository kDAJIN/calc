
//Lv1 : 더하기, 빼기, 나누기, 곱하기 연산을 수행할 수 있는 Calculator 클래스를 만들고, 클래스를 이용하여 연산을 진행하고 출력하기

fun main() {
    println("계산기를 실행합니다.")
    println("계산을 진행할 두 수를 입력해 주세요.(정수만 가능)")

    var num11 = readLine()!!.toInt()
    var num22 = readLine()!!.toInt()

    var answer = Calculator(num11,num22)


    println("진행할 계산을 선택해 주세요.")
    println("1.덧셈 2.뺄셈 3.곱셈 4.나눗셈")

    var operator = readLine()!!.toInt()

    if(operator==1) { answer.add()

    } else if(operator==2) { answer.sub()

    } else if(operator==3) { answer.mul()

    } else if(operator==4) { answer.div()

    } else {
        print("잘못된 입력 입니다.계산을 종료 합니다.")
    }


}

class Calculator {

    var num1:Int = 0
    var num2:Int = 0

    constructor(_num1:Int,_num2:Int){
        num1 = _num1
        num2 = _num2
    }

    fun add() {
        var result_add = num1 + num2
        println("덧셈 결과: ${result_add}")
    }

    fun sub() {
        var result_sub = num1 - num2
        println("뺄셈 결과: ${result_sub}")
    }

    fun mul() {
        var result_mul = num1 * num2
        println("곱셈 결과: ${result_mul}")
    }

    fun div() {
        var result_div = num1 / num2
        println("나눗셈 결과: ${result_div}")
    }

}