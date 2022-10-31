import groovy.util.*
import java.util.*
import java.text.SimpleDateFormat 
import java.util.Date

def DateFormat (String dateTime){
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss")
        Date date = new Date()
        String newDate = formatter.format(date)
        echo newDate

}
