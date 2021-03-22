package com.yur.testapp

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)


//        button.setOnClickListener {
//            Toast.makeText(this, "Button clicked!!", Toast.LENGTH_SHORT).show()
//        }
//
//        button.setOnClickListener(this)
//        titleTxt.setOnClickListener(this)
//        secondaryButton.setOnClickListener(this)








//
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    fun clickHandler(view: View) {
//        when(view.id) {
//            R.id.text_view -> {
//                    (view as TextView).text = "TextView is clicked"
//            }
//            R.id.show_toast_btn -> Toast.makeText(this, "Button clicked!!", Toast.LENGTH_SHORT).show()
//            R.id.secondary_btn ->  {
//                (view as Button).text = "Secondary Button clicked"
//            }
//        }
//        if (view.id == R.id.text_view) {
//            (view as TextView).text = "TextView is clicked"
//        }

    }

    fun random() {
        print((1..7).random())
    }

    override fun onClick(v: View?) {
//        v?.let {
//            if (v.id == R.id.secondary_btn) {
//                (v as Button).text = "Secondary Button clicked"
//            }
//            if (v is TextView)
//            Toast.makeText(this, "${v.text} clicked!!", Toast.LENGTH_SHORT).show()
//        }


    }
}
