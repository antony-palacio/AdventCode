import java.io.File


fun main() {
    val fileName = "C:\\Users\\Tony\\IdeaProjects\\Hello_Kotlin\\AdventCode\\src\\main\\kotlin\\DataDay4"
    val gameData = File(fileName).readLines()
    val delimiter1 = ","
    val delimiter2 = "-"
    val elfIdTestCase = gameData[19].split(delimiter1, delimiter2).map { it.toInt() } //Test Case
    val storedElfIdList: MutableList<Int> = arrayListOf()
    val storedElfIdListPartTwo: MutableList<Int> = arrayListOf()
    val secondStoredElfIdList: MutableList<Int> = arrayListOf()
    val secondStoredElfIdListPartTwo: MutableList<Int> = arrayListOf()
    var shiftOverlap = 0
    var loopstop = true
    var i = 0
    fun overlapIdParser(s: List<Int>) { //Part one Parser
        storedElfIdList.clear()
        secondStoredElfIdList.clear()
        var firstLength = 0
        var secondLength = 0
        for (i in IntRange(s[0], s[1])) {
            storedElfIdList.add(i)
            firstLength += 1
        }
        for (i in IntRange(s[2], s[3])) {
            secondStoredElfIdList.add(i)
            secondLength += 1
        }
        if (storedElfIdList.intersect(secondStoredElfIdList.toSet()).size == firstLength || storedElfIdList.intersect(
                secondStoredElfIdList.toSet()
            ).size == secondLength
        ) {
            shiftOverlap += 1
        }
    }
    fun overlapIdParserPartTwo(s: List<Int>) { //Part Two Parser
        storedElfIdListPartTwo.clear()
        secondStoredElfIdListPartTwo.clear()
        for (i in IntRange(s[0], s[1])) {
            storedElfIdListPartTwo.add(i)
        }
        for (i in IntRange(s[2], s[3])) {
            secondStoredElfIdListPartTwo.add(i)
        }
        if (storedElfIdListPartTwo.intersect(secondStoredElfIdListPartTwo.toSet()).any()) {
            shiftOverlap += 1
        }
    }
    /* Part One
    while (loopstop) {
        overlapIdParser(gameData[i].split(delimiter1, delimiter2).map { it.toInt() })
        i++
        if (i == gameData.size) loopstop = false
    }

     */
    while (loopstop) { // Part Two
        overlapIdParserPartTwo(gameData[i].split(delimiter1, delimiter2).map { it.toInt() })
        i++
        if (i == gameData.size) loopstop = false
    }
    overlapIdParserPartTwo(elfIdTestCase)
    println(shiftOverlap)
}