package isabellaagm.com.github.android_crypto_monitor.model

class TicketResponse {
    val ticker: Ticker = TODO()
}

class Ticker(
    val high: String,
    val low: String,
    val vol: String,
    val last: String,
    val buy: String,
    val sell: String,
    val date: Long
)