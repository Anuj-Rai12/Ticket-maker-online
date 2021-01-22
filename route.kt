import java.util.*

fun rout(s:String)= println("$s")
open class route(s:String="India"):tecket(s)
{
    override var location: Array<String>
        get() = super.location
        set(value) {}
    override var currentLocation: String?
        get() = super.currentLocation
        set(value) {}
     open fun loadedrouter()
     {
            location.forEachIndexed { index, s ->
                rout("Code:[${index.toString()}] : $s")
            }
     }
    open fun swap_loctio() :String//swapping location
    {
        return location[location.size-1]
    }
    open fun change_route() :String
    {
        rout(" Enter The route code ?")
        var i=Scanner(System.`in`).nextInt()
         if(i>=0&&i<location.size)
        {
            return location[i]
        }
        else
            return location[0]
    }

}