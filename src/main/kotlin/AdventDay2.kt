import java.io.File


fun main() {
    var lineCounter = 0
    val fileName = "C:\\Users\\Tony\\IdeaProjects\\Hello_Kotlin\\AdventCode\\src\\main\\kotlin\\DataDay2"
    val gameData = File(fileName).readLines()
    val Rock = 1
    val Paper = 2
    val Scissor = 3
    val loss = 0
    val draw = 3
    val win = 6
    var userScore: Int = 0
    var opScore: Int = 0
    val A = "Rock"
    val B = "Paper"
    val C = "Scissor"
    val X = "Rock"
    val Y = "Paper"
    val Z = "Scissor"
    /*
    Examples:
    "C Z" -> Scissor(op) vs Scissor(you) Draw 3+3 = 6 points for you
    "A Y" -> Rock vs Paper Win 6+1 = 7 points for you
     */

    fun winCheck(data: String): Int {
        when (data[0].toString()) {
            //Rock Win Loss condition
            "A" -> {
                if (data[2].toString() == "X") {
                    return loss + Scissor
                }
                return if (data[2].toString() == "Y") {
                    draw + Rock
                } else {
                    win + Paper
                }
            }
            //Paper Win Loss Condition
            "B" -> {
                if (data[2].toString() == "X") {
                    return loss + Rock
                }
                return if (data[2].toString() == "Y") {
                    draw + Paper
                } else {
                    win + Scissor
                }
            }
            // Scissor Win Loss Condition
            else -> {
                if (data[2].toString() == "X") {
                    return loss + Paper
                }
                return if (data[2].toString() == "Y") {
                    draw + Scissor
                } else {
                    win + Rock
                }
            }
        }
    }

    fun dataParse(rpsDataSet: MutableList<String>) {
        var i = 0
        var loopstop = true
        // Loop through whole list
        while (loopstop) {
            userScore += winCheck(rpsDataSet[i])
            i++
            if (i == rpsDataSet.size) {
                loopstop = false
            }
        }
        println(userScore)
    }

    dataParse(gameData as MutableList<String>)

}