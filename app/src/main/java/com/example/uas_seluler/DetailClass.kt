package com.example.uas_seluler

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailClass : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_class)
        supportActionBar?.hide()

        val className = intent.getStringExtra("EXTRA_CLASS")

        val tvClassName = findViewById<TextView>(R.id.tvClassName)
        val tvDescription = findViewById<TextView>(R.id.tvDescription)
        val tvSkill1 = findViewById<TextView>(R.id.tvSkill1)
        val tvSkill2 = findViewById<TextView>(R.id.tvSkill2)
        val tvSkill3 = findViewById<TextView>(R.id.tvSkill3)
        val tvSkill4 = findViewById<TextView>(R.id.tvSkill4)
        val tvSkill5 = findViewById<TextView>(R.id.tvSkill5)

        tvClassName.text = "DATA: $className"

        when (className) {

            "Arcanist" -> {
                tvDescription.text = "Pengguna sihir yang menggunakan Arcanum sebagai senjata."

                tvSkill1.text = "1. Arcane Regeneration - Ledakan sihir kuat."
                tvSkill2.text = "2. Bind And Summon - Menyerap damage dengan MP."
                tvSkill3.text = "3. Phantom Strength - Menggandakan spell."
                tvSkill4.text = "4. Quick Summoning - Serangan area besar."
                tvSkill5.text = "5. Ritual Arcanism - Can perform Arcanist Ritualism."
            }

            "Esper" -> {
                tvDescription.text = "Pengguna kekuatan psikis dan kontrol pikiran."

                tvSkill1.text = "1. Cognitive Focus - Serangan mental."
                tvSkill2.text = "2. Hypercognition - Mengangkat musuh."
                tvSkill3.text = "3. Navigator - Shield mental."
                tvSkill4.text = "4. Psychic Gift - Damage besar ke satu target."
                tvSkill5.text = "5. Psychokinesis - Damage besar ke satu target."
            }

            "Wayfarer" -> {
                tvDescription.text = "Petualang fleksibel dengan banyak skill utility."

                tvSkill1.text = "1. Faithful Companion - Serangan cepat."
                tvSkill2.text = "2. Resourceful - Menghindar."
                tvSkill3.text = "3. Tavern Talk - Buff sesuai situasi."
                tvSkill4.text = "4. Treasure Hunter - Heal kecil."
                tvSkill5.text = "5. Well-Traveled - Damage besar ke satu target."
            }

            "Guardian" -> {
                tvDescription.text = "Tank dengan pertahanan tinggi."

                tvSkill1.text = "1. Retaliation - Stun musuh."
                tvSkill2.text = "2. Defensive Mastery - Tambah defense."
                tvSkill3.text = "3. Dual Shieldbearer - Tarik aggro."
                tvSkill4.text = "4. Fortress - Reduce damage besar."
                tvSkill5.text = "5.Protect - Damage besar ke satu target."
            }

            else -> {
                tvDescription.text = "Class tidak diketahui."
            }
        }
    }
}