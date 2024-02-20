package cloud.romhost.timetimberlib

import timber.log.Timber
import java.util.Calendar

class MyTimber {
    fun showLog(string: String){
        Timber.d("${Calendar.getInstance().time} $string")
    }

    fun showLog2(string: String){
        Timber.d("${Calendar.getInstance().time} $string")
    }
}