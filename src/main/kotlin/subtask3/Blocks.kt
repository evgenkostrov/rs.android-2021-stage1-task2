package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.math.absoluteValue
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
//        throw NotImplementedError("Not implemented")


        return when (blockB) {
            String::class -> {

                val l = mutableListOf<String>()
                blockA.forEach {
                    if (it is String) {
                        l.add(it)
                    }
                }
                l.reduce { acc, i ->acc+i  }
            }

            Int::class -> {
                val m = mutableListOf<Int>()
                blockA.forEach {
                    if (it is Int) {
                        m.add(it)
                    }
                }
                m.sum()
            }

            LocalDate::class -> {

                var x = LocalDate.of(0, 1,1)
                blockA.forEach {
                    if (it is LocalDate) {
                        x = maxOf(x,it)
                    }
                }
                val s = ("${x.dayOfMonth}.${x.monthValue}.${x.year}")
                s
            }


            else -> return 1
        }

    }
}