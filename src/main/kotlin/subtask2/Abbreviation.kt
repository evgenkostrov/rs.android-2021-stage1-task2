package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
//        throw NotImplementedError("Not implemented")
        val count = mutableListOf<Int>()
        for (i in b.indices){
            for (j in a.indices) {
                if (b[i].toLowerCase() == a[j].toLowerCase())
                    count.add(j)
            }
        }
        var x:Boolean=false
        for(y in 0 until count.size-1){
            x = count[y]<count[y+1]
        }

        if (count.size == b.length && x)
            return "YES"
        else return "NO"
    }
}
