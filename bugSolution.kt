fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    mutableList.clear() // Clear the original list
    mutableList.addAll(list.map {it * 2 })
    println(mutableList) // Output: [2, 4, 6, 8, 10] // Correctly modified

    //Alternative using mapIndexed
    val anotherMutableList = mutableListOf(1,2,3,4,5)
    anotherMutableList.mapIndexed { index, i -> anotherMutableList[index] = i * 2 }
    println(anotherMutableList) //Output: [2, 4, 6, 8, 10] //Correctly modified
} 