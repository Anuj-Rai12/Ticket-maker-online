import java.util.*
fun max(i:Int,k:Int):Int
{
    if (i>k)
        return i
    else
        return k
}
fun realtime(map: Map<String,Int>, curr: String?): Int? {
    if (map[curr]!=0&&map[curr]!=null)
    {
        return map[curr]
    }
 return 0
}
fun myroute(route:route):String?
{
    do {
        print("\n1.load_route\n2.Swap_route\n3.according_your router\n4.Exit \n")
        var i=Scanner(System.`in`).nextInt()
        when(i) {
            1 -> {
                route.loadedrouter()
                println("Done ✅")
            }
            2 -> {
                println("Done ✅")
                return route.swap_loctio()
            }
            3 -> {
                var s= route.change_route()
                println("Router change current route is -> $s")
                return s
            }
            4->println(":)")
        }
    }while (i!=4)
    return null
}

fun main() {
var tic=tecket("India")
    var pas:Int=0
    var lev:Int?=0
    var max_pas=0
    var pass_map= mutableMapOf<String,Int>()
    //total
    var tot=0
    var di_s=0
    //local
    var pa=0
    var le:Int?=0
    var str:String="India"
    var rou = route()
    str=myroute(rou)!!
    //Ticket printing section
do {
    println("Want to print ticket !!! [1/2]")
    pas=if(pas>0) pas else 0
    lev=if(lev!!>0) lev else 0
    println("passenger In The BUS:$pas\t Left The Bus:$lev \n")
    var c=Scanner(System.`in`).nextInt()
    when(c) {
        1->{
            tic = tecket(str)
            tic.get_tick()
            pa = tic.p!!
            pas += pa
            max_pas = max(pas, max_pas)
            pass_map[tic.passengerLoction!!] = pas
            le = realtime(pass_map, tic.currentLocation)
            if (le != null && le > 0 && lev != null) {
                lev += le
                pas -= lev
                pass_map.remove(tic.currentLocation)
            }
            le = tic.fair
            tot += le!!
            le = tic.discount
            di_s += le!!
            println("Want To change Route system [y/n]")
            if((Scanner(System.`in`).next().single())=='y')
                str=myroute(rou)!!
        }
     2-> println(":)")
    }
}while (c!=2)
//Report section
    var rep=report(tot,di_s,max_pas)
do {
    println("1.Create Expense\n2.Report\n3.Exit")
    var io=Scanner(System.`in`).nextInt()
    when(io)
    {
        1->
        {
            rep.my_expense()
            println("Want to see report !! [y/n]")
            var o=Scanner(System.`in`).next().single()
            if(o=='y')
                rep.print_report()
        }
        2->
        {
            rep.print_report()
        }
        3->println("Thank you for using my app")
    }
}while(io!=3)
}
