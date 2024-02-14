package cloud.romhost.timetimberlib

import timber.log.Timber
import java.util.Calendar

object MyTimber {
    fun showLog(string: String){
        Timber.d("${Calendar.getInstance().time} $string")
    }
}