fun main(args: Array<String>) {
    println(transfer("Mastercard", 50000, 100000))

}

fun transfer(accountType: String = "VK Pay", sumPastTransfer: Int = 0, sumCurrentTransfer: Int): String {
    val result = when (accountType) {
        "Mastercard", "Maestro" -> {
            if (sumCurrentTransfer > 150000) return "Дневной лимит превышен"
            when (sumCurrentTransfer + sumPastTransfer) {
                !in 0..600000 -> return "Месячный лимит превышен"
                in 0..75000 -> return "Ваша комиссия составит: 0 руб."
                else -> {
                    val commision = (sumCurrentTransfer * 0.006 + 20).toInt()
                    return "Ваша комиссия составит: $commision руб."
                }
            }
        }

        "Мир", "Visa" -> {
            if (sumCurrentTransfer > 150000) return "Дневной лимит превышен"
            if (sumCurrentTransfer + sumPastTransfer > 600000) return "Месячный лимит превышен"

            when ((sumCurrentTransfer * 0.0075).toInt()) {
                in 0..35 -> return "Ваша комиссия составит: 35 руб."
                else -> {
                    val commision = (sumCurrentTransfer * 0.0075).toInt()
                    return "Ваша комиссия составит: $commision руб."
                }

            }
        }

        "VK Pay" -> {
            if (sumCurrentTransfer > 15000) return "Дневной лимит превышен"
            if (sumCurrentTransfer + sumPastTransfer > 40000) return "Месячный лимит превышен"
            else return "Ваша комиссия составит: 0 руб."


        }

        else -> "Неверный тип карты"

    }
    return result
}

