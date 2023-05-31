import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun transferMCDayLimit() {

        val result = transfer("Mastercard", 160000, 200000)
        assertEquals("Дневной лимит превышен", result)
    }
    @Test
    fun transferMCMarchLimit() {

        val result = transfer("Mastercard", 600000, 50000)
        assertEquals("Месячный лимит превышен", result)
    }
    @Test
    fun transferMCCommisionZero() {

        val result = transfer("Mastercard", 10000, 40000)
        assertEquals("Ваша комиссия составит: 0 руб.", result)
    }
    @Test
    fun transferMCCommision() {

        val result = transfer("Mastercard", 50000, 100000)
        assertEquals("Ваша комиссия составит: 620 руб.", result)
    }
    @Test
    fun transferMaestroDayLimit() {

        val result = transfer("Maestro", 160000, 200000)
        assertEquals("Дневной лимит превышен", result)
    }
    @Test
    fun transferMaestroMarchLimit() {

        val result = transfer("Maestro", 600000, 50000)
        assertEquals("Месячный лимит превышен", result)
    }
    @Test
    fun transferMaestroCommisionZero() {

        val result = transfer("Maestro", 10000, 40000)
        assertEquals("Ваша комиссия составит: 0 руб.", result)
    }
    @Test
    fun transferMaestroCommision() {

        val result = transfer("Maestro", 50000, 100000)
        assertEquals("Ваша комиссия составит: 620 руб.", result)
    }
    @Test
    fun transferVisaDayLimit() {

        val result = transfer("Visa", 160000, 200000)
        assertEquals("Дневной лимит превышен", result)
    }
    @Test
    fun transferVisaMarchLimit() {

        val result = transfer("Visa", 600000, 50000)
        assertEquals("Месячный лимит превышен", result)
    }
    @Test
    fun transferVisaCommisionMin() {

        val result = transfer("Visa", 10000, 1000)
        assertEquals("Ваша комиссия составит: 35 руб.", result)
    }
    @Test
    fun transferVisaCommision() {

        val result = transfer("Visa", 10000, 10000)
        assertEquals("Ваша комиссия составит: 75 руб.", result)
    }
    @Test
    fun transferMirDayLimit() {

        val result = transfer("Мир", 160000, 200000)
        assertEquals("Дневной лимит превышен", result)
    }
    @Test
    fun transferMirMarchLimit() {

        val result = transfer("Мир", 600000, 50000)
        assertEquals("Месячный лимит превышен", result)
    }
    @Test
    fun transferMirCommisionMin() {

        val result = transfer("Мир", 10000, 1000)
        assertEquals("Ваша комиссия составит: 35 руб.", result)
    }
    @Test
    fun transferMirCommision() {

        val result = transfer("Мир", 10000, 10000)
        assertEquals("Ваша комиссия составит: 75 руб.", result)
    }
    @Test
    fun transferVKDayLimit() {

        val result = transfer("VK Pay", 160000, 20000)
        assertEquals("Дневной лимит превышен", result)
    }
    @Test
    fun transferVKMarchLimit() {

        val result = transfer("VK Pay", 30000, 15000)
        assertEquals("Месячный лимит превышен", result)
    }
    @Test
    fun transferVKCommision() {

        val result = transfer("VK Pay", 10000, 10000)
        assertEquals("Ваша комиссия составит: 0 руб.", result)
    }
    @Test
    fun transferError() {

        val result = transfer("VK PayDay", 10000, 10000)
        assertEquals("Неверный тип карты", result)
    }
}