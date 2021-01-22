import java.util.*
open class report(tot:Int=0, dis:Int=0, pas:Int):uistuff()
{
    var tot:Int=tot
    var dis:Int=dis
    var pas:Int=pas

    var pay:String?=null
    var k=0
    override var amt: Int?
        get() = super.amt
        set(value) {}
    override var bus_service: String
        get() = super.bus_service
        set(value) {}
    override var exp: Int?
        get() = super.exp
        set(value) {}
    override var bal: Int?
        get() = super.bal
        set(value) {}

    //etc
    var i=0
    open fun my_expense()
    {
        print_tic("\n1.Bus Stand fee\n2.Night out Entry\n3.Refund Ticket\n4.Payment\n")
         i=Scanner(System.`in`).nextInt()

        when(i)
        {
            1->
            {
                print_tic("Please Enter Bus Stand no.")
               k=Scanner(System.`in`).nextInt()
               print_tic("please Enter the Amount.")
                super.amt=Scanner(System.`in`).nextInt()
            }
            2->
            {
                print_tic("Please Enter Bus Stand no.")
                k=Scanner(System.`in`).nextInt()
                print_tic("please Enter the Amount.")
                super.amt=Scanner(System.`in`).nextInt()
            }
            3->
            {
                print_tic("please Enter the Amount.")
                super.amt=Scanner(System.`in`).nextInt()
                pas--
            }
            4->{
                print_tic("please enter the payment summary ")
                pay=Scanner(System.`in`).nextLine()
                print_tic("please Enter the Amount.")
                super.amt=Scanner(System.`in`).nextInt()
            }
            else ->
            {
                println("Please enter correct option Thank you ")
                i=-1
            }
        }
    }
    open fun print_report() {
        println("\n----------------------Collection Report-----------------------\n")
        print_tic("\t\t---------------$bus_service-------------\n")
        super.date_time()
       // ex_detial(i, k, amt!!, pay!!)
        when(i)
        {
            1-> {
                print_tic("Bus parking fee")
                print_tic("The Bus stand No : $k")
                print_tic("The Bus stand Fee : ${super.amt}")
            }
            2->
            {
                print_tic("Night out fee")
                print_tic("The Bus stand No : $k")
                print_tic("The Bus stand Fee : ${super.amt}")
            }
            3->
            {
                println("Ticket Refund fee")
                print_tic("Bus Ticket Refund Fee : ${super.amt}")
            }
            4->
            {
                print_tic("Payments Charge\nPayment Detail :$pay\n4.Amount is : ${super.amt}")
            }

        }
        println("The Collection :$tot")
        super.exp = super.exp?.plus(amt!!)
        super.exp=super.exp?.plus(dis!!)
        print_tic("The total discount :$dis")
        println("Total Expense :${super.exp}")
        println("Total passengers :$pas")
        var profit=if((tot-super.exp!!)>0)(tot-super.exp!!)else 0
        println("Total profit : $profit")
        super.exp=super.exp?.minus(dis!!)
        println("\n---------------------------------------------------------------------\n")

    }

}