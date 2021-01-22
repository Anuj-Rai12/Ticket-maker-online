import java.time.format.DateTimeFormatter
import java.time.LocalDateTime
open class uistuff {
    open var bus_service:String="Anuj_Ticket app"
    open var location= arrayOf("India","china","Russia","japan")
    open var p:Int?=0
    open var a:Int?=0
    open var currentLocation :String?=""
    open var passenger_map= mutableMapOf<String,Int>()
    //Passengers
    open var full:Int?=0
    open var half:Int?=0
    open var passengerLoction:String?=""
    open var total:Int?=0
    //Expenses
    open var exp:Int?=0
    open var amt:Int?=0
    open var fair:Int?=0
    open var discount:Int?=0
    //main balance
    open var bal:Int?=0
   open fun date_time()=println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
    open fun buss_service()=println("---------Anuj Ticket------------------")
   /* open fun swa()
    {
        var l=0;
        var h=location.size-1
        while(l<h)
        {
            var tem=location[l]
            location[l]=location[h]
            location[h]=tem
            l++
            h--
        }
    }*/
}