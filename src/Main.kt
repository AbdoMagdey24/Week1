fun isValidSudoku(sudoku: List<List<Char>>): Boolean {
    return checkRows(sudoku) && checkColumns(sudoku) && checkBoxes(sudoku)
}

private fun checkRows(sudoku: List<List<Char>>): Boolean {
    for (row in sudoku) {
        if (hasDuplicate(row)) return false
    }
    return true
}

private fun checkColumns(sudoku: List<List<Char>>): Boolean {
    for (col in 0 until 9) {
        val columnValues = mutableListOf<Char>()
        for (row in 0 until 9) {
            columnValues.add(sudoku[row][col])
        }
        if (hasDuplicate(columnValues)) return false
    }
    return true
}

private fun checkBoxes(sudoku: List<List<Char>>): Boolean {
    for (boxRow in 0 until 9 step 3) {
        for (boxCol in 0 until 9 step 3) {
            val boxValues = mutableListOf<Char>()
            for (i in 0 until 3) {
                for (j in 0 until 3) {
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
