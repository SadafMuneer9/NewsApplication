package android.example.newsapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class OutputActivity : AppCompatActivity() {
    private lateinit var outputImage: ImageView
    private lateinit var outputTitle: TextView
    private lateinit var outputAuthor: TextView
    private lateinit var outputDescription: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_output)

        outputImage = findViewById(R.id.outputPic)
        outputTitle = findViewById(R.id.outputHeading)
        outputAuthor = findViewById(R.id.outputAuthor)
        outputDescription = findViewById(R.id.outputDescription)



    }
}