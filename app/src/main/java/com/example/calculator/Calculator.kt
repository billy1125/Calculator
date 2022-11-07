package com.example.calculator

class Calculator {
    var operator: Int = -1          // 運算符號
    var firstNumber: String = ""    // 第一個數字
    var secondNumber: String = ""   // 第二個數字

    // 方法：計算結果
    fun CalculateResults() : Float{
        var results: Float = 0f     // 宣告一個儲存結果的浮點數
        // 依照運算符號的類別，來進行第一個與第二個數字的計算
        when (operator){
            0 -> results = firstNumber.toFloat() + secondNumber.toFloat()
            1 -> results = firstNumber.toFloat() - secondNumber.toFloat()
            2 -> results = firstNumber.toFloat() * secondNumber.toFloat()
            3 -> results = firstNumber.toFloat() / secondNumber.toFloat()
        }

        return results
    }

    // 方法：重新設定
    fun Reset(){
        operator = -1
        firstNumber = ""
        secondNumber = ""
    }
}