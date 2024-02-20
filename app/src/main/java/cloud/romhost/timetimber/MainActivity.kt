package cloud.romhost.timetimber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cloud.romhost.timetimberlib.MyTimber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MyTimber().showLog("Hello World")
    }
}