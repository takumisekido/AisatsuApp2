package jp.techacademy.takumi.sekido.aisatsuapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.app.TimePickerDialog
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        showTimePickerDialog()
    }


    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(


            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                if (2 <= hour && hour <= 10) {
                    textView.text = "おはよう"
                } else if (10 <= hour && hour <= 18) {
                    textView.text = "こんにちは"
                } else {
                    textView.text = "こんばんは"
                }
            },
            13, 0, true
            )

        timePickerDialog.show()
    }
}
