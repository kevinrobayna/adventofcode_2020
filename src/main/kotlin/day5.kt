import java.util.stream.Collectors

data class BoardingPass(
    val row: List<String>,
    val seat: List<String>
) {
    companion object {
        const val LEFT = "L"
        const val RIGHT = "R"
        const val BACK = "B"
        const val FRONT = "F"
    }
}

fun day5ProblemReader(string: String): List<BoardingPass> {
    return string.split("\n").stream().map { line ->
        val row = mutableListOf<String>()
        val seat = mutableListOf<String>()
        line.split("").forEach {
            if (it == BoardingPass.LEFT || it == BoardingPass.RIGHT) {
                seat.add(it)
            } else if (it == BoardingPass.BACK || it == BoardingPass.FRONT) {
                row.add(it)
            }
        }
        BoardingPass(row, seat)
    }.collect(Collectors.toList())
}


// https://adventofcode.com/2020/day/5
class Day5(
    private val boardingPasses: List<BoardingPass>,
) {
    fun solve(): Long {
        return boardingPasses
            .stream()
            .map { calculateSeatId(it) }
            .sorted()
            .collect(Collectors.toList())[0]
    }

    private fun calculateSeatId(boardingPass: BoardingPass): Long {
        return calculateColumnNumber(boardingPass) * calculateRowNumber(boardingPass)
    }

    private fun calculateRowNumber(boardingPass: BoardingPass): Long {
        if (boardingPass.row.isEmpty()){
            return 1
        }
        return boardingPasses.stream().count()
    }

    private fun calculateColumnNumber(boardingPass: BoardingPass): Long {
        if (boardingPass.seat.isEmpty()){
            return 1
        }
        return boardingPasses.stream().count()
    }
}


fun main() {
    val problem = day5ProblemReader(Day4::class.java.getResource("day5.txt").readText())
    println("solution = ${Day5(problem).solve()}")
}