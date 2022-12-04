import java.io.File


fun main() {
    var lineCounter = 0
    val fileName = "C:\\Users\\Tony\\IdeaProjects\\Hello_Kotlin\\src\\main\\kotlin\\input.txt"
    var listOfCalories: List<String>
    listOfCalories = File(fileName).readLines()
    var listOfCaloriesInt = listOfCalories.map { it.toIntOrNull() }
    val updatedListOfCalories = mutableListOf<Int>()
    var calorieAcc: Int? = 0
    fun getMaxCalories(elfList: MutableList<Int> = mutableListOf<Int>()) {
        var i = 0
        var loopstop = true
        while (loopstop) {
            calorieAcc = calorieAcc?.plus(elfList[i])
            i++
            if (elfList[i] == null) {
                elfList[i] = 0
            }
            if (elfList[i] == 0) {
                updatedListOfCalories.add(calorieAcc!!)
                lineCounter += 1
                calorieAcc = 0
            }
            if (i == elfList.size - 1) {
                loopstop = false
            }
        }
        println(updatedListOfCalories.max())
        println(updatedListOfCalories.sortedDescending().take(3).sum())
        println(updatedListOfCalories.indexOf(updatedListOfCalories.max()))
    }
    getMaxCalories(listOfCaloriesInt as MutableList<Int>)
}