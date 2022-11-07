package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding  //增加這一段
    val calculator = Calculator() // 從Calculator類別建立calculator物件

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) //增加這一段
        // setContentView(R.layout.activity_main)
        setContentView(binding.root) //將setContentView修改
    }

    fun n_one(view : View){
        add_number("1") // 輸入數字1
    }

    fun n_two(view : View){
        add_number("2") // 輸入數字2
    }

    fun n_three(view : View){
        add_number("3") // 輸入數字3
    }

    fun n_four(view : View){
        add_number("4") // 輸入數字4
    }

    fun n_five(view : View){
        add_number("5") // 輸入數字5
    }

    fun n_six(view : View){
        add_number("6") // 輸入數字6
    }

    fun n_seven(view : View){
        add_number("7") // 輸入數字7
    }

    fun n_eight(view : View){
        add_number("8") // 輸入數字8
    }

    fun n_nine(view : View){
        add_number("9") // 輸入數字9
    }

    fun n_zero(view : View){
        add_number("0") // 輸入數字0
    }

    fun n_point(view : View){
        val result = binding.tvNumber.text.contains(".")
        if(!result)
            add_number(".") // 輸入小數點
    }

    // 方法：輸入數字
    fun add_number(number: String){
        var numberText = binding.tvNumber.text
        // 如果數字顯示本來是0，先清除文字顯示
        if (numberText == "0"){
            if (number != ".")
                binding.tvNumber.text = ""
        }
        // 按下數字按鍵，將新增的數字接到既有的數字後面
        binding.tvNumber.text = binding.tvNumber.text.toString() + number
    }

    // 加號按鍵
    fun n_add(view : View){
        calculator.firstNumber = binding.tvNumber.text.toString() // 將第一個數字設定到屬性
        calculator.operator = 0                                   // 將選擇的加減乘除按鍵設定到屬性
        binding.tvNumber.text = "0"
    }

    // 減號按鍵
    fun n_minus(view : View){
        calculator.firstNumber = binding.tvNumber.text.toString() // 將第一個數字設定到屬性
        calculator.operator = 1                                   // 將選擇的加減乘除按鍵設定到屬性
        binding.tvNumber.text = "0"
    }

    // 乘號按鍵
    fun n_plus(view : View){
        calculator.firstNumber = binding.tvNumber.text.toString() // 將第一個數字設定到屬性
        calculator.operator = 2                                   // 將選擇的加減乘除按鍵設定到屬性
        binding.tvNumber.text = "0"
    }

    // 除號按鍵
    fun n_divide(view : View){
        calculator.firstNumber = binding.tvNumber.text.toString() // 將第一個數字設定到屬性
        calculator.operator = 3                                  // 將選擇的加減乘除按鍵設定到屬性
        binding.tvNumber.text = "0"
    }

    // 等於按鍵
    fun n_equal(view : View){
        calculator.secondNumber = binding.tvNumber.text.toString()      // 將第二個數字設定到屬性
        binding.tvNumber.text = calculator.CalculateResults().toString() // 計算結果
    }

    // 清除按鍵
    fun n_clear(view : View){
        calculator.Reset()             // 重新設定計算機類別
        binding.tvNumber.text = "0"
    }
}