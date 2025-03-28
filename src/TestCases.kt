fun check(name: String, result: Boolean, correct: Boolean) {
    if (result == correct) {
        println("success - $name")
    } else {
        println("failed - $name")
    }
}

fun returnFalseIfRowHasDuplicate(sudoku: List<List<Char>>) {
    check(
        name = "return false if row has duplicate",
        result = isValidSudoku(sudoku),
        correct = false
    )
}

fun returnFalseIfColumnHasDuplicate(sudoku: List<List<Char>>) {
    check(
        name = "return false if column has duplicate",
        result = isValidSudoku(sudoku),
        correct = false
    )
}

fun returnFalseIfBoxHasDuplicate(sudoku: List<List<Char>>) {
    check(
        name = "return false if box has duplicate",
        result = isValidSudoku(sudoku),
        correct = false
    )
}

fun returnTrueForValidSudoku(sudoku: List<List<Char>>) {
    check(
        name = "return true if sudoku has no duplicate",
        result = isValidSudoku(sudoku),
        correct = true
    )
}

val validSudoku = listOf(
    listOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
    listOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
    listOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
    listOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
    listOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
    listOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
    listOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
    listOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
    listOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
)

val invalidSudokuBox = listOf(
    listOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
    listOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
    listOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
    listOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
    listOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
    listOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
    listOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
    listOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
    listOf('.', '.', '.', '.', '8', '.', '.', '7', '8') //  Duplicate 8 in 3x3 box
)

val invalidSudokuColumn = listOf(
    listOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
    listOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
    listOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
    listOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
    listOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
    listOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
    listOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
    listOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
    listOf('5', '.', '.', '.', '8', '.', '.', '7', '9') //  Duplicate 5 in column
)

val invalidSudokuRow = listOf(
    listOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
    listOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
    listOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
    listOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
    listOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
    listOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
    listOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
    listOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
    listOf('.', '.', '.', '.', '8', '.', '.', '7', '7') //  Duplicate 7 in row
)

val validSudoku4x4 = listOf(
    listOf('1', '2', '3', '4'),
    listOf('3', '4', '1', '2'),
    listOf('2', '1', '4', '3'),
    listOf('4', '3', '2', '1')
)

val invalidSudoku4x4Row = listOf(
    listOf('1', '2', '.', '1'),
    listOf('.', '4', '1', '2'),
    listOf('2', '.', '4', '3'),
    listOf('4', '3', '2', '1')
)

val invalidSudoku4x4Column = listOf(
    listOf('1', '2', '3', '.'),
    listOf('.', '4', '1', '2'),
    listOf('2', '1', '4', '3'),
    listOf('4', '2', '.', '1')
)

val invalidSudoku4x4Box = listOf(
    listOf('1', '2', '3', '4'),
    listOf('3', '.', '1', '2'),
    listOf('2', '1', '4', '3'),
    listOf('4', '3', '1', '2')
)

fun main() {
    returnTrueForValidSudoku(validSudoku)
    returnFalseIfBoxHasDuplicate(invalidSudokuBox)
    returnFalseIfRowHasDuplicate(invalidSudokuRow)
    returnFalseIfColumnHasDuplicate(invalidSudokuColumn)
    println("-----------------------------")
    returnTrueForValidSudoku(validSudoku4x4)
    returnFalseIfBoxHasDuplicate(invalidSudoku4x4Box)
    returnFalseIfRowHasDuplicate(invalidSudoku4x4Row)
    returnFalseIfColumnHasDuplicate(invalidSudoku4x4Column)
}