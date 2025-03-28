fun isValidSudoku(sudoku: List<List<Char>>): Boolean {
    val n = sudoku.size
    val sqrtN = Math.sqrt(n.toDouble()).toInt()

    return checkRows(sudoku) && checkColumns(sudoku, n) && checkBoxes(sudoku, n, sqrtN)
}

private fun checkRows(sudoku: List<List<Char>>): Boolean {
    for (row in sudoku) {
        if (hasDuplicate(row)) return false
    }
    return true
}

private fun checkColumns(sudoku: List<List<Char>>, n: Int): Boolean {
    for (col in 0 until n) {
        val columnValues = mutableListOf<Char>()
        for (row in 0 until n) {
            columnValues.add(sudoku[row][col])
        }
        if (hasDuplicate(columnValues)) return false
    }
    return true
}

private fun checkBoxes(sudoku: List<List<Char>>, n: Int, sqrtN: Int): Boolean {
    if (sqrtN * sqrtN != n) return false

    for (boxRow in 0 until n step sqrtN) {
        for (boxCol in 0 until n step sqrtN) {
            val boxValues = mutableListOf<Char>()
            for (i in 0 until sqrtN) {
                for (j in 0 until sqrtN) {
                    boxValues.add(sudoku[boxRow + i][boxCol + j])
                }
            }
            if (hasDuplicate(boxValues)) return false
        }
    }
    return true
}

private fun hasDuplicate(numbers: List<Char>): Boolean {
    val seen = mutableSetOf<Char>()
    for (num in numbers) {
        if (num != '.' && num in seen) return true
        seen.add(num)
    }
    return false
}
