import java.io.File
import java.util.stream.IntStream.range

fun main() {
    val fileName = "C:\\Users\\Tony\\IdeaProjects\\Hello_Kotlin\\AdventCode\\src\\main\\kotlin\\DataDay6"
    val gameData = File(fileName).readText()
    val testCase = "mjqjpqmgbljsphdztnvjfqwrcgsmlb"
    var subTestCase = listOf("")
    fun partOneSolution() {
        for (i in range(0, gameData.length - 4)) {
            subTestCase = listOf(gameData.substring(i, i + 4)).map { it.toSet().toString() }
            if (subTestCase[0].length == 12) {
                println(i + 4) //Prints position of signal
                break
            }
        }
    }
//    partOneSolution()

    fun partTwoSolution() {
        for (i in range(0, gameData.length - 14)) {
            subTestCase = listOf(gameData.substring(i, i + 14)).map { it.toSet().toString() }
            if (subTestCase[0].length == 42) {
                println(i + 14) //Prints position of message
                break
            }
        }
    }
    partOneSolution()
    println(subTestCase[0])
}