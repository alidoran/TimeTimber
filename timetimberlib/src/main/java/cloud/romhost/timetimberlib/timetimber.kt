package cloud.romhost.timetimberlib

import org.slf4j.LoggerFactory

class MyTimber {
    fun showLog(string: String){
        LoggerFactory.getLogger("AliDoran").info("Ali")
    }
}