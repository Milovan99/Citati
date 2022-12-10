package com.milovanjakovljevic.citati

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var layoutManager:LinearLayoutManager
    lateinit var adapter: CitatiAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutManager= LinearLayoutManager(this)

        idRecyclerView.layoutManager=layoutManager

adapter=CitatiAdapter()
        idRecyclerView.adapter=adapter
    }
}