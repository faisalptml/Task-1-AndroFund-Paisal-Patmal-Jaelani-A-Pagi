package com.mila.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.paisal.latihan.HomeFragment
import com.paisal.latihan.IniFragment

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var tv: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv = findViewById(R.id.textView)

        var username = intent.getParcelableExtra<User>("User")?.username
        var password = intent.getParcelableExtra<User>("User")?.password
        tv.text = "Username : $username \nPassword : $password"

        val btnImplicit: Button = findViewById(R.id.btn_implicit)
        btnImplicit.setOnClickListener(this)

        val btnFragment: Button = findViewById(R.id.btn_fragment)
        btnFragment.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_implicit->{
//                val message = "Hallo, Ini Pesan Untuk mengetes Implicit"
//                val intent = Intent()
//                intent.action = Intent.ACTION_SEND
//                intent.putExtra(Intent.EXTRA_TEXT, message)
//                intent.type = "text/plain"
//                startActivity(intent)

               val intent = Intent()
                intent.putExtra("history", "You already login")
                setResult(RESULT_OK,intent)
                finish()
            }
            R.id.btn_fragment -> {
                val intent =Intent(this@MainActivity, IniFragment::class.java)
                startActivity(intent)
            }
        }
    }
}