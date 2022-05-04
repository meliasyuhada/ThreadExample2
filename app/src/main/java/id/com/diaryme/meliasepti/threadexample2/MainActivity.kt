package id.com.diaryme.meliasepti.threadexample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startThread(view: View): Unit {
        val runnable = ExampleThread(10)
        Thread(runnable).start()
    }
}