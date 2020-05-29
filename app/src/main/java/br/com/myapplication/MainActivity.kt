package br.com.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val paragrafList : MutableList<Example> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeDataList()
        val adapter = Adapter(this, paragrafList)
        recyclerview.adapter = adapter

    }

    private fun initializeDataList() {
        val listOf = listOf<Example>(Example("texto1"),
                Example("Texto2"), Example("Texto3"))

        paragrafList.addAll(listOf)
    }


}
