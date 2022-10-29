import groovy.util.*
import java.util.*
import java.text.SimpleDateFormat 
import java.util.Date

def DateFormat (String dateTime){
    Date date = Date.parse ('dd MMM yyyy HH:mm:ss')
    String newDate = date.format('HH:mm:ss')

}