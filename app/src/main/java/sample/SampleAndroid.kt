package sample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

actual class Sample {
    actual fun checkMe() = 44
}

actual object Platform {
    actual val name: String = "Android"
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        hello()
        Sample().checkMe()
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.text_view)?.text = "${hello()}\n" +
                "Processing platform:${processingName()}\n" +
                "Processing version ${processingVersion()}"

    }
}