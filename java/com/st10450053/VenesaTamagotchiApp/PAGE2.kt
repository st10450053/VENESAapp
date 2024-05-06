package com.st10450053.VenesaTamagotchiApp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PAGE2 : AppCompatActivity() {
    private lateinit var feedProgressBar: ProgressBar
    private lateinit var playProgressBar: ProgressBar
    private lateinit var cleanProgressBar: ProgressBar

    private var feedProgressStatus: Int = 0
    private var playProgressStatus: Int = 0
    private var cleanProgressStatus: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        feedProgressBar = findViewById(R.id.FEEDprogressbar1)
        playProgressBar = findViewById(R.id.PLAYINGprogressbar2)
        cleanProgressBar = findViewById(R.id.BATHINGprogressbar3)

        /* Declarations for in app buttons */

        val BATHbutton = findViewById<Button>(R.id.BATHbutton)
        val CatActionsImageView2 = findViewById<ImageView>(R.id.CatActionsImageView2)
        val PLAYbutton = findViewById<Button>(R.id.PLAYbutton)
        val STARTPAGEbutton = findViewById<Button>(R.id.STARTPAGEbutton)
        val SLEEPbutton = findViewById<Button>(R.id.SLEEPbutton)
        val FEEDbutton = findViewById<Button>(R.id.FEEDbutton)
        val TextView = findViewById<TextView>(R.id.TextView3)
        FEEDbutton.setOnClickListener{
            CatActionsImageView2.setImageResource(R.drawable)
        }

        class MainActivity : AppCompatActivity() {
            //You add these code below here

            //end your code before this line


            @SuppressLint("MissingInflatedId")
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                enableEdgeToEdge()
                setContentView(R.layout.activity_main)
                ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                    val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                    v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                    insets
                }
                //after this curly brace you can start your declarations



                FEEDbutton.setOnClickListener {
                    feedProgressStatus = 0
                    feedProgressBar.progress = feedProgressStatus
                    Thread(Runnable {
                        while (feedProgressStatus < 100) {
                            feedProgressStatus += 5
                            Thread.sleep(1000)
                            runOnUiThread {
                                feedProgressBar.progress = feedProgressStatus
                            }
                        }
                        runOnUiThread {
                            // Update feedTextView message
                        }
                    }).start()
                }

                BATHbutton.setOnClickListener {
                    cleanProgressStatus = 0
                    cleanProgressBar.progress = cleanProgressStatus
                    Thread(Runnable {
                        while (cleanProgressStatus < 100) {
                            cleanProgressStatus += 5
                            Thread.sleep(1000)
                            runOnUiThread {
                                cleanProgressBar.progress = cleanProgressStatus
                            }
                        }
                        runOnUiThread {
                            // Update cleanTextView message
                        }
                    }).start()
                }

                PLAYbutton.setOnClickListener {
                    playProgressStatus = 0
                    playProgressBar.progress = playProgressStatus
                    Thread(Runnable {
                        while (playProgressStatus < 100) {
                            playProgressStatus += 5
                            Thread.sleep(1000)
                            runOnUiThread {
                                playProgressBar.progress = playProgressStatus
                            }
                        }
                        runOnUiThread {
                            // Update playTextView message
                        }


                    }).start()
                }
            }
        }

    }
}