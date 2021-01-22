import java.util.*
import kotlin.concurrent.thread
import kotlin.text.compareTo as textCompareTo

fun inp(str:String)= println("please enter the $str")

fun search(str:Array<String>,ke:String):Int
{
    str.forEachIndexed{index, s ->
        if ((ke.equals(s,true))) {
                return index
        }
    }
    return -1
}
fun print_tic(S:String)=println("$S")
open class  tecket(loc:String="India") :uistuff()
{
    var lop=loc
    override var bus_service: String
        get() = super.bus_service
        set(value) {}
    override var location: Array<String>
        get() = super.location
        set(value) {
            }
    override var currentLocation: String?
        get() =lop
        set(value) {}
    override var full: Int?
        get() = super.full
        set(value) {}

    override var fair: Int?
        get() = super.fair
        set(value) {}
    override var half: Int?
        get() = super.full
        set(value) {}

    override var passengerLoction: String?
        get() = super.passengerLoction
        set(value) {}

    override var passenger_map: MutableMap<String, Int>
        get() = super.passenger_map
        set(value) {}

    override var discount: Int?
        get() = super.discount
        set(value) {}

    override var a: Int?
        get() = super.a
        set(value) {}

    override var p: Int?
        get() = super.p
        set(value) {}

    fun get_tick(){
        var dis=0
        println("\n${currentLocation} it is our current location\n")
        super.date_time()
        inp("\nchoice for passenger\n 1.Full\n2.half\n3.Both\n")
        var i=Scanner(System.`in`).nextInt()
        var k:Int=0
        if (i==1)
        {
            inp("no of full passenger ")//e
            super.full=Scanner(System.`in`).nextInt()
            k= super.full!!
        }
        else if (i==2)
        {
            inp("no of half passengers ")
            super.half=Scanner(System.`in`).nextInt()
            k=super.half!!
        }
        else if (i==3)
        {
            inp(" no of full passenger ")
            super.full=Scanner(System.`in`).nextInt()
            inp(" no of half passenger ")
           super.half=Scanner(System.`in`).nextInt()
          k= super.full!!+ super.half!!
        }
        else
        {
            inp("correct choice Thank you")
            k=-1
        }
        if(k!=-1)
        {
            inp(" End-location")
            var s = Scanner(System.`in`).nextLine()

            if (search(location, s)!=-1)
            {
                super.passengerLoction = s
                passenger_map[s] = k
                var io=(search(location, s)+1)
                super.fair=(io*50)*k
                if((super.half!!)!=0)
                {
                    super.fair = super.fair?.minus((((io*50)*super.half!!)/2))
                }
            }
            else
            {
                inp(" correct location Thank you")
                k=-1
            }
        }
        if(k!=-1)
        {
            inp(" 1.Discount % or 0.Deny")//e
            var di=Scanner(System.`in`).nextInt()
            if(di==1)
            {
                inp("\n1.Discount 10% \n 2.Discount %20 \n 3.Discount 30% \n 4.Discount 50%")
                di=Scanner(System.`in`).nextInt()
                when (di) {
                    1 -> dis=10
                    2 -> dis=20
                    3 -> dis=30
                    4 -> dis=50
                    else -> dis=-1
                }
                if(dis==-1)
                {
                    inp("correct choice Thank you")
                    k=-1
                    dis=0
                }
                else {
                    dis *= ((super.fair!!) / 100)
                    super.fair = super.fair?.minus(dis)
                }
            }
            else if(di==0)
                println("Discount Denied :)")
            else
            {
                inp("correct choice Thank you")
                k=-1
            }

        }
        if(k!=-1)
        {
            print_tic("---------------$bus_service---------------\n")
            super.date_time()
            print_tic("\nFrom $currentLocation --> To $passengerLoction")
            super.p=k
            print_tic("Passenger : ${k.toString()}")
            super.total=fair
            print_tic("Fair : ${fair.toString()}")
            super.discount=dis
            print_tic("Discount Amount -> ${super.discount.toString()}")
            print_tic("-------------------------------------------------\n")
            discount = dis
        }

    }

}