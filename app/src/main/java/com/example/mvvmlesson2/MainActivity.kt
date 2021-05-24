package com.example.mvvmlesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        viewModel.counter.observe(this,{
            tvCounter.text = it.toString()
            tvCounter.append("Aida")
        })

        btn_count.setOnClickListener {
            viewModel.onIncrementClick()
        }

    }


    /*
    - Добавить ViewPager из 3 фрагментов в MainActivity
- 1 фрагмент кнопки ‘+’ и ‘-’, при нажатии вызывать соответствующие методы у ViewModel и выполнять необходимую логику
- 2 фрагмент отображает текущее значение LiveData счетчика
- 3 фрагмент отображает список выполненных операций (просто список строковых значений, который наблюдаются у ViewModel-a)
- Для всех задач использовать один ViewModel
*/
}