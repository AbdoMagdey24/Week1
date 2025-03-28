fun isValidSudoku(sudoku: List<List<Char>>): Boolean {
    return checkRows(sudoku) && checkColumns(sudoku) && checkBoxes(sudoku)
}

fun checkRows(sudoku: List<List<Char>>): Boolean {
    for ((rowIndex, row) in sudoku.withIndex()) {
        val duplicate = getDuplicateOrNull(row)
        if (duplicate != null){
              println("First Duplicate '$duplicate' found at row ${rowIndex + 1}")
            return false
        }
    }
    return true
}

 fun checkColumns(sudoku: List<List<Char>>): Boolean {
    for (col in 0 until sudoku.size) {
        val columnValues = mutableListOf<Char>()
        for (row in 0 until sudoku.size) {
            columnValues.add(sudoku[row][col])
        }
        val duplicate = getDuplicateOrNull(columnValues)
        if (duplicate != null) {
               println("First Duplicate '$duplicate' found at column ${col + 1}")
            return false
        }
    }
    return true
}

 fun checkBoxes(sudoku: List<List<Char>>): Boolean {
     val n = sudoku.size
     val sqrtN = Math.sqrt(n.toDouble()).toInt()
     if (sqrtN * sqrtN != n) return false

    for (boxRow in 0 until n step sqrtN) {
        for (boxCol in 0 until n step sqrtN) {
            val boxValues = mutableListOf<Char>()
            for (i in 0 until sqrtN) {
                for (j in 0 until sqrtN) {
                    boxValues.add(sudoku[boxRow + i][boxCol + j])
                }
            }
            val duplicate = getDuplicateOrNull(boxValues)
            if (duplicate != null) {
                 println("First Duplicate '$duplicate' found at box start at(${boxRow+1},${boxCol+1})")
                return false
            }
        }
    }
    return true
}

private fun getDuplicateOrNull(numbers: List<Char>): Char? {
    val seen = mutableSetOf<Char>()
    for (num in numbers) {
        if (num != '.' && num in seen) return num
        seen.add(num)
    }
    return null
}
