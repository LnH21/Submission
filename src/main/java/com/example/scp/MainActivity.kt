package com.example.scp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var rvUlama: RecyclerView
    private var list: ArrayList<Ulama> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvUlama = findViewById(R.id.rv_nu)
        rvUlama.setHasFixedSize(true)

        list.addAll(DataUlama.listData)
        rvUlama.layoutManager = LinearLayoutManager(this)
        val listUlamaAdapter = ListUlamaAdapter(list, this)
        rvUlama.adapter = listUlamaAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }


    private fun setMode(selectedMode: Int){
        when (selectedMode) {
            R.id.home -> {

            }
            R.id.about -> {
                val about = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(about)

            }
        }
    }
}