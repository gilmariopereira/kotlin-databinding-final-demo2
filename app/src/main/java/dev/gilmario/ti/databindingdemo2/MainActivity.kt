package dev.gilmario.ti.databindingdemo2

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ProgressBar

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.control_button)
        button.setOnClickListener {
            startOrStopProgressBar()
        }
    }

    private fun startOrStopProgressBar() {
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        if (progressBar.visibility == View.GONE) {
            progressBar.visibility = View.VISIBLE
            button.text = "Stop"
        } else {
            progressBar.visibility = View.GONE
            button.text = "Start"
        }
    }

}
