import java.io.File

fun main() {
    val fileName = "C:\\Users\\Tony\\IdeaProjects\\Hello_Kotlin\\AdventCode\\src\\main\\kotlin\\DataDay3"
    val gameData = File(fileName).readLines()
    var ruckSackSum: Int = 0
    val rucksackLetterPriority: HashMap<Char, Int> = hashMapOf(
        'a' to 1,
        'b' to 2,
        'c' to 3,
        'd' to 4,
        'e' to 5,
        'f' to 6,
        'g' to 7,
        'h' to 8,
        'i' to 9,
        'j' to 10,
        'k' to 11,
        'l' to 12,
        'm' to 13,
        'n' to 14,
        'o' to 15,
        'p' to 16,
        'q' to 17,
        'r' to 18,
        's' to 19,
        't' to 20,
        'u' to 21,
        'v' to 22,
        'w' to 23,
        'x' to 24,
        'y' to 25,
        'z' to 26,
        'A' to 27,
        'B' to 28,
        'C' to 29,
        'D' to 30,
        'E' to 31,
        'F' to 32,
        'G' to 33,
        'H' to 34,
        'I' to 35,
        'J' to 36,
        'K' to 37,
        'L' to 38,
        'M' to 39,
        'N' to 40,
        'O' to 41,
        'P' to 42,
        'Q' to 43,
        'R' to 44,
        'S' to 45,
        'T' to 46,
        'U' to 47,
        'V' to 48,
        'W' to 49,
        'X' to 50,
        'Y' to 51,
        'Z' to 52,
    )

    fun stringSplitDupCheck(compartment: String): Char {
        val half = compartment.length / 2
        val compartmentOne = compartment.substring(0, half)
        val compartmentTwo = compartment.substring(half)
        var commonLetter: Char = 'a'
        compartmentTwo.forEach { c ->
            if (compartmentOne.contains(c)) {
                commonLetter = c
            }
        }
        return commonLetter
    }

    fun stringGroupElfDupCheck(compartment: MutableList<String>): Char {
        val compartmentOne = compartment[0]
        val compartmentTwo = compartment[1]
        val compartmentThree = compartment[2]
        var commonLetter: Char = 'a'
        compartmentTwo.forEach { c ->
            if (compartmentOne.contains(c) && compartmentThree.contains(c)) {
                commonLetter = c
            }
        }
        return commonLetter
    }

    fun rucksackParse(sackinfo: MutableList<String>) {
        var i = 0
        var loopstop = true
        while (loopstop) {
            ruckSackSum += rucksackLetterPriority[stringSplitDupCheck(sackinfo[i])]!!
            if (i == sackinfo.size - 1) loopstop = false
            i++
        }
//        Using other loop to verify indexing and sums
//        sackinfo.forEach(){
//            ruckSackSum += rucksackLetterPriority[stringSplitDupCheck(sackinfo[it])]!!
//        }
        println(ruckSackSum)
    }

    // Part 2 parse
    fun rucksackParsePartTwo(sackinfo: MutableList<String>) {
        var i = 0
        var loopstop = true
        while (loopstop) {
            ruckSackSum += rucksackLetterPriority[stringGroupElfDupCheck(sackinfo.subList(i, i + 3))]!!
            if (i == sackinfo.size - 3) loopstop = false
            i += 3
        }
        println(ruckSackSum)
    }
    rucksackParsePartTwo(gameData as MutableList<String>)
}

//private operator fun Any.get(it: String): String {
//    return it
//}



