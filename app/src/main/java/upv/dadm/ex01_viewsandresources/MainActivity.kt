/*
 * Copyright (c) 2022-2023 Universitat Politècnica de València
 * Authors: David de Andrés and Juan Carlos Ruiz
 *          Fault-Tolerant Systems
 *          Instituto ITACA
 *          Universitat Politècnica de València
 *
 * Distributed under MIT license
 * (See accompanying file LICENSE.txt)
 *
 */

package upv.dadm.ex01_viewsandresources

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * Displays some TextView whose text is set in the layout resource,
 * or at runtime from available string resources.
 * References to View objects are obtained via findViewById(int).
 */
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