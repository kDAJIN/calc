package calculator

//Lv2 : Lv1에서 만든 Calculator 클래스에 나머지 연산을 가능하도록 코드를 추가하고, 연산 진행 후 출력하기

fun main() {
    println("계산기를 실행합니다.")
    println("계산을 진행할 두 수를 입력해 주세요.(정수만 가능)")

    var num11 = readLine()!!.toInt()
    var num22 = readLine()!!.toInt()

    var answer = Calculator(num11,num22)


    println("진행할 계산을 선택해 주세요.")
    println("1.덧셈 2.뺄셈 3.곱셈 4.나눗셈 5.나눗셈의 나머지 값")

    var operator = readLine()!!.toInt()

    if(operator==1) { answer.add()

    } else if(operator==2) { answer.sub()

    } else if(operator==3) { answer.mul()

    } else if(operator==4) { answer.div()

    } else if(operator==5) { answer.rev()

    }else {
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

    fun rev() {
        var result_rev = num1 % num2
        println("나머지 값 결과: ${result_rev}")
    }

}
