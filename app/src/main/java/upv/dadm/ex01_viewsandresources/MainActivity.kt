/*
 * Copyright (c) 2022-2024 Universitat Politècnica de València
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
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

/**
 * Displays some TextView whose text is set in the layout resource,
 * or at runtime from available string resources.
 * References to View objects are obtained via findViewById(int).
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Enable edge-to-edge display (default for API 35+)
        enableEdgeToEdge()
        // Set the activity content from a layout resource
        setContentView(R.layout.activity_main)

        // Get side margins in pixels
        val sideMarginPx = resources.getDimensionPixelSize(R.dimen.main_side_margins)
        // Prevent the layout from overlapping with system bars in edge-to-edge display
        val layout: ConstraintLayout = findViewById(R.id.main)
        ViewCompat.setOnApplyWindowInsetsListener(layout) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(sideMarginPx, systemBars.top, sideMarginPx, systemBars.bottom)
            insets
        }
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