package com.milovanjakovljevic.citati

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
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

        idRecyclerView.addItemDecoration(DividerItemDecoration(idRecyclerView.context,DividerItemDecoration.VERTICAL))

adapter=CitatiAdapter(arrayListOf("Do all the good you can",
    "God is most glorified in us when we are most satisfied in Him",
    "Faith does not eliminate questions. But faith knows where to take them",
    "True faith means holding nothing back. ",
    "Worrying is arrogant because God knows what He's doing."))
        idRecyclerView.adapter=adapter
    }
}