package id.co.ms.androidnative3

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val tv = TextView(this)
        tv.text = "MS Android Native 3\nBuild via GitHub Actions SUCCESS"
        tv.textSize = 18f

        setContentView(tv)
    }
}
