package com.example.uas_seluler

import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.GridLayoutManager
import android.content.Intent

class MainActivity : AppCompatActivity() {

    private lateinit var rvCatalog: RecyclerView
    private lateinit var etSearch: EditText
    private lateinit var btnSearch: Button

    private lateinit var classList: MutableList<FabulaUltima>
    private lateinit var filteredList: MutableList<FabulaUltima>
    private lateinit var adapter: FabulaUltimaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        rvCatalog = findViewById(R.id.rvCatalog)
        etSearch = findViewById(R.id.etSearch)
        btnSearch = findViewById(R.id.btnSearch)

        rvCatalog.layoutManager = GridLayoutManager(this, 2)

        // Data dummy coba dulu
        classList = mutableListOf(
            FabulaUltima("Arcanist"),
            FabulaUltima("Esper"),
            FabulaUltima("Wayfarer"),
            FabulaUltima("Guardian")
        )

        filteredList = classList.toMutableList()

        adapter = FabulaUltimaAdapter(filteredList)

        adapter.onItemClick = { selectedItem ->
            val intent = Intent(this, DetailClass::class.java)
            intent.putExtra("EXTRA_CLASS", selectedItem.nama)
            startActivity(intent)
        }

        rvCatalog.adapter = adapter

        btnSearch.setOnClickListener {
            val keyword = etSearch.text.toString()

            if (TextUtils.isEmpty(keyword)) {
                etSearch.error = "Mau nyari class apa ni?"
            } else {
                etSearch.error = null
            }
        }
    }
}