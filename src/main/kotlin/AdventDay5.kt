import java.io.File

fun main() {
    val fileName = "C:\\Users\\Tony\\IdeaProjects\\Hello_Kotlin\\AdventCode\\src\\main\\kotlin\\DataDay5"
    val gameData = File(fileName).readLines()
    var positionOne = mutableListOf<String>("G", "B", "D", "C", "P", "R")
    var positionTwo = mutableListOf<String>("G", "V", "H")
    var positionThree = mutableListOf<String>("M", "P", "J", "D", "Q", "S", "N")
    var positionFour = mutableListOf<String>("M", "N", "C", "D", "G", "L", "S", "P")
    var positionFive = mutableListOf<String>("S", "L", "F", "P", "C", "N", "B", "J")
    var positionSix = mutableListOf<String>("S", "T", "G", "V", "Z", "D", "B", "Q")
    var positionSeven = mutableListOf<String>("Q", "T", "F", "H", "M", "Z", "B")
    var positionEight = mutableListOf<String>("F", "B", "D", "M", "C")
    var positionNine = mutableListOf<String>("G", "Q", "C", "F")

    var boardSetUp: MutableList<MutableList<String>> = mutableListOf(
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
    /*
        Example of movements:
        First move based on current structure
        move 1 from 7 to 4: positionSeven moves 1 item to positionFour
        yields -> positionSeven = T,F,H,M,Z,B positionFour = Q M N C D G L S P
            moveCrateData[i][0] //Amount of items to move
            moveCrateData[i][1] //From position
            moveCrateData[i][2] //Destination position

     */
    val moveCrateData = gameData.drop(10).map { it.split("from", "to", "move", ","," ").filter { it.isNotEmpty() } }
    val amountOfCratesToMove = moveCrateData.map{ it.first().toInt()}
    val fromPositionCrate = moveCrateData.map {it[1].toInt()}
    val toPositionCrate = moveCrateData.map { it[2].toInt() }
    var i = 0
    var loopstop = true

//    while(loopstop){
//        boardSetUp[toPositionCrate[i]-1].addAll(0, setOf(boardSetUp[fromPositionCrate[i]-1][amountOfCratesToMove[i]]))
//
////        boardSetUp[fromPositionCrate[i]-1] = boardSetUp[fromPositionCrate[i]-1].drop(amountOfCratesToMove[i]) as MutableList<String>
//        i++
////        if (i == moveCrateData.size) loopstop = false
//        if (i == 5) loopstop = false
//    }

//    println(boardSetUp[0])
//    boardSetUp[0].addAll(0, setOf("C","B","A"))
//    println(boardSetUp[0])
//    println(boardSetUp)


    //boardSetup[0][i-1].
//    println(boardSetUp[3])
    boardSetUp[3].add(index = 0,boardSetUp[6][0])
    boardSetUp[3].add(index = 0,boardSetUp[6][0])
    boardSetUp[3].add(index = 0,boardSetUp[6][0])
    boardSetUp[3].add(index = 0,boardSetUp[6][0])
    boardSetUp[3].add(index = 0,boardSetUp[6][0])
    println(boardSetUp[3])
//    println(boardSetUp[6])
//    println(moveCrateData[9][0].toInt())
//    println(boardSetUp[6].drop(1))
//    println(boardSetUp)
//    println(boardSetUp[6])


}


