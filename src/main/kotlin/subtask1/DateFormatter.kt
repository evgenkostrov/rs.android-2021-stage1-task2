package subtask1

import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
//        throw NotImplementedError("Not implemented")
        try {
            val local = Locale("ru","RU")
            val date = DateTimeFormatter.ofPattern("dd MMMM, EEEE")
                .withLocale(local)
                .format((LocalDate.of(year.toInt(),month.toInt(),day.toInt())))
            return (date)
        }
        catch (e: DateTimeException){
            return "Такого дня не существует"
        }

    }
}
