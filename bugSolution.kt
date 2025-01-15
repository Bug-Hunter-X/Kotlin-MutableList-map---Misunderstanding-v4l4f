fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    mutableList.map { it * 2 } //This doesn't modify mutableList
    println(mutableList) // Output: [1, 2, 3, 4, 5]

    // Correct way to modify mutableList using map
    mutableList.clear() //Clear the existing elements
    mutableList.addAll(mutableList.map { it * 2 })
    println(mutableList) // Output: [2, 4, 6, 8, 10]
    
    //Alternative using mapIndexedTo
    val anotherMutableList = mutableListOf(1,2,3,4,5)
    anotherMutableList.mapIndexedTo(anotherMutableList){index,i -> i*2}
    println(anotherMutableList) // Output: [2, 4, 6, 8, 10]
} 