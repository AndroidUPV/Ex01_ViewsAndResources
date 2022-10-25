/*
 * Copyright (c) 2022
 * David de Andrés and Juan Carlos Ruiz
 * Development of apps for mobile devices
 * Universitat Politècnica de València
 */

package upv.dadm.ex01_viewsandresources

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the activity content from a layout resource
        setContentView(R.layout.activity_main)

        // Get a reference to a View (TextView) from the activity content
        val tv1: TextView = findViewById(R.id.tvRuntimeId)
        // Change its properties at runtime: resource ID as parameter
        tv1.setText(R.string.going_on)

        // Get a reference to a View (TextView) from the activity content
        val tv2: TextView = findViewById(R.id.tvRuntimeString)
        // Change its properties at runtime: String as parameter
        tv2.text = getString(R.string.anything_new)
    }
}