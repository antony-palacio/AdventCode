import java.io.File
import java.util.stream.IntStream.range

fun main() {
    val fileName = "C:\\Users\\Tony\\IdeaProjects\\Hello_Kotlin\\AdventCode\\src\\main\\kotlin\\DataDay5"
    val gameData = File(fileName).readLines()

    val boardSetUp: MutableList<MutableList<String>> = mutableListOf(
        mutableListOf("G", "B", "D", "C", "P", "R"),
        mutableListOf("G", "V", "H"),
        mutableListOf("M", "P", "J", "D", "Q", "S", "N"),
        mutableListOf("M", "N", "C", "D", "G", "L", "S", "P"),
        mutableListOf("S", "L", "F", "P", "C", "N", "B", "J"),
        mutableListOf("S", "T", "G", "V", "Z", "D", "B", "Q"),
        mutableListOf("Q", "T", "F", "H", "M", "Z", "B"),
        mutableListOf("F", "B", "D", "M", "C"),
        mutableListOf("G", "Q", "C", "F"),
    )
    val moveCrateData = gameData.drop(10).map { it.split("from", "to", "move", ",", " ").filter { it.isNotEmpty() } }
    val amountOfCratesToMove = moveCrateData.map { it[0].toInt() }
    val fromPositionCrate = moveCrateData.map { it[1].toInt() }
    val toPositionCrate = moveCrateData.map { it[2].toInt() }
    var i = 0
    var loopstop = true
    fun partOneSolution() {
        while (loopstop) {
            for (countAdd in range(0, amountOfCratesToMove[i])) { //Add item to destination
                boardSetUp[toPositionCrate[i] - 1].add(0, boardSetUp[fromPositionCrate[i] - 1][countAdd])
            }
            for (countRemove in range(0, amountOfCratesToMove[i])) { //Remove items from crate
                boardSetUp[fromPositionCrate[i] - 1].removeAt(0)
            }
            i++
            if (i == moveCrateData.size) loopstop = false
        }
        val answerPartOne: MutableList<String> = mutableListOf()
        for (f in range(0, 9)) { //Part one Answer
            answerPartOne.add(boardSetUp[f][0])
        }
        println(answerPartOne)
    }
//    partOneSolution()

    fun partTwoSolution() {
        while (loopstop) {
            boardSetUp[toPositionCrate[i] - 1].addAll(
                0,
                boardSetUp[fromPositionCrate[i] - 1].take(amountOfCratesToMove[i])
            )
            for (countRemove in range(0, amountOfCratesToMove[i])) { //Remove items from crate
                boardSetUp[fromPositionCrate[i] - 1].removeAt(0)
            }
            i++
            if (i == moveCrateData.size) loopstop = false
        }
        val answerPartTwo: MutableList<String> = mutableListOf()
        for (f in range(0, 9)) { //Part Two Answer
            answerPartTwo.add(boardSetUp[f][0])
        }
        println(answerPartTwo)
    }
//    partTwoSolution()
}


