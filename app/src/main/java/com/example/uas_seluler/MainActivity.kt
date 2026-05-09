package com.example.uas_seluler

import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.GridLayoutManager
import android.content.Intent

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "NIM_12345678"
    }

    private lateinit var rvCatalog: RecyclerView
    private lateinit var etSearch: EditText
    private lateinit var btnSearch: Button

    private lateinit var classList: MutableList<FabulaUltima>
    private lateinit var filteredList: MutableList<FabulaUltima>
    private lateinit var adapter: FabulaUltimaAdapter
    private lateinit var btnSortAZ: Button
    private var isSorted = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        Log.d(TAG, "MainActivity dibuka")

        rvCatalog = findViewById(R.id.rvCatalog)
        etSearch = findViewById(R.id.etSearch)
        btnSearch = findViewById(R.id.btnSearch)
        btnSortAZ = findViewById(R.id.btnSortAZ)

        rvCatalog.layoutManager = GridLayoutManager(this, 2)

        classList = mutableListOf(
            FabulaUltima("Arcanist"),
            FabulaUltima("Esper"),
            FabulaUltima("Wayfarer"),
            FabulaUltima("Guardian"),
            FabulaUltima("Arcanist Variant"),
            FabulaUltima("Chimerist"),
            FabulaUltima("Darkblade"),
            FabulaUltima("Elementalist"),
            FabulaUltima("Entropist"),
            FabulaUltima("Fury"),
            FabulaUltima("Loremaster"),
            FabulaUltima("Orator"),
            FabulaUltima("Rogue"),
            FabulaUltima("Sharpshooter"),
            FabulaUltima("Spiritist"),
            FabulaUltima("Tinkerer"),
            FabulaUltima("Weaponmaster"),
            FabulaUltima("Dancer"),
            FabulaUltima("Commander"),
            FabulaUltima("Chanter"),
            FabulaUltima("Symbolist"),
            FabulaUltima("Mutant"),
            FabulaUltima("Pilot"),
            FabulaUltima("Necromancer"),
            FabulaUltima("Floralist"),
            FabulaUltima("Gourmet"),
            FabulaUltima("Invoker"),
            FabulaUltima("Merchant")
        )

        filteredList = classList.toMutableList()

        adapter = FabulaUltimaAdapter(filteredList)

        adapter.onItemClick = { selectedItem ->
            Log.d(TAG, "Class dipilih: ${selectedItem.nama}")
            val moveIntent = Intent(this, DetailClass::class.java)
            moveIntent.putExtra("EXTRA_CLASS", selectedItem.nama)
            startActivity(moveIntent)
        }

        rvCatalog.adapter = adapter

        btnSearch.setOnClickListener {

            val keyword = etSearch.text.toString().lowercase()
            Log.d(TAG, "Keyword search: $keyword")

            if (TextUtils.isEmpty(keyword)) {
                etSearch.error = "Mau nyari class apa ni?"
                Log.w(TAG, "Search kosong")
            } else {
                etSearch.error = null
            }

            filteredList.clear()

            if (keyword.isEmpty()) {
                filteredList.addAll(classList)
            } else {
                for (p in classList) {
                    if (p.nama.lowercase().contains(keyword)) {
                        Log.i(TAG, "Ditemukan: ${p.nama}")
                        filteredList.add(p)
                    }
                }
            }
            adapter.notifyDataSetChanged()
        }

        btnSortAZ.setOnClickListener {
            Log.d(TAG, "Sorting A-Z dijalankan")

            if (!isSorted) {

                val n = filteredList.size

                for (i in 0 until n - 1) {
                    for (j in 0 until n - i - 1) {

                        if (filteredList[j].nama >
                            filteredList[j + 1].nama) {

                            val temp = filteredList[j]

                            filteredList[j] = filteredList[j + 1]

                            filteredList[j + 1] = temp
                        }
                    }
                }
                Log.i(TAG, "Data berhasil diurutkan A-Z")

                isSorted = true

            } else {

                filteredList.clear()
                filteredList.addAll(classList)
                Log.i(TAG, "Urutan dikembalikan ke default")

                isSorted = false
            }

            adapter.notifyDataSetChanged()
        }
    }
}