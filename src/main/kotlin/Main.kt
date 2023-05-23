fun main(args: Array<String>) {

    fun transfer (accountType : String = "VK Pay", sumPastTransfer : Int = 0, sumCurrentTransfer : Int) : Int{
       val commision = when (accountType) {
           "Mastercard", "Maestro" -> {
               when (sumCurrentTransfer + sumPastTransfer){
                   in 0..75000 -> return 0
                   else -> return (sumCurrentTransfer * 0.006 + 20).toInt()
               }
           }
           "Мир", "Visa" -> {
               //val commision2 = (sumCurrentTransfer * 0.0075).toInt()
               when ((sumCurrentTransfer * 0.0075).toInt()){
                   in 0..35 -> return 35
                   else -> return (sumCurrentTransfer * 0.0075).toInt()

               }
           }
           else -> return 0
       }
        return commision.toInt()
    }
    println("Ваша комисия составит: ${transfer("Visa", 75000, 20000)} руб")
}