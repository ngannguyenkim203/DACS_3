package com.example.doan3.activity

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.doan3.databinding.ActivityTableBinding
import java.text.SimpleDateFormat
import java.util.*

class TableActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTableBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_table)
        binding = ActivityTableBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.imageTime.setOnClickListener{
//            time()
//        }
//
//        binding.imageDate.setOnClickListener {
//            date()
//        }

}

//    private fun date() {
//        val cal = Calendar.getInstance()
//        val dateSetListener = DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
//            cal.set(Calendar.YEAR, year)
//            cal.set(Calendar.MONTH, monthOfYear)
//            cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)
//            val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
//            binding.textDate.text = sdf.format(cal.time)
//        }
//        DatePickerDialog(this,dateSetListener, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH)).show()
//    }
//
//    private fun time() {
//        val cal = Calendar.getInstance()
//        val timeSetListener  = TimePickerDialog.OnTimeSetListener{ timePicker, hour: Int, minute: Int ->
//            cal.set(Calendar.HOUR_OF_DAY, hour)
//            cal.set(Calendar.MINUTE, minute)
//
//            binding.textTime.text = SimpleDateFormat("HH:mm").format(cal.time)
//        }
//        TimePickerDialog(this, timeSetListener, cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), true).show()
//    }

    fun BackHome(view: View) {
        startActivity(Intent(this@TableActivity, HomeActivity::class.java))
    }

    fun book(view: View) {
        val uri: Uri = Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSfdbbxU2npd-A5OJISkob6Jf_uYz72BGd1hvwFgQYppiOzkiA/viewform?usp=sf_link")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }

}
