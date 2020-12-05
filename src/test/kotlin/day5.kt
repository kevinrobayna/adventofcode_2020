import org.junit.Assert
import kotlin.test.Test

class Day5Test {

    private val problemString = Day5Test::class.java.getResource("example_day5.txt").readText()
    private val problem = day5ProblemReader(Day5Test::class.java.getResource("example_day5.txt").readText())

    @Test
    fun problem_is_read_correctly() {
        val problem = day5ProblemReader(problemString)

        Assert.assertEquals(4, problem.size)
        // BFFFBBFRRR
        Assert.assertEquals(
            listOf(
                BoardingPass.BACK,
                BoardingPass.FRONT,
                BoardingPass.FRONT,
                BoardingPass.FRONT,
                BoardingPass.BACK,
                BoardingPass.BACK,
                BoardingPass.FRONT
            ), problem[0].row
        )
        Assert.assertEquals(
            listOf(
                BoardingPass.RIGHT,
                BoardingPass.RIGHT,
                BoardingPass.RIGHT
            ), problem[0].seat
        )
    }

    @Test
    fun boarding_pass_1_is_calculated_properly() {
        val seatId = Day5(listOf(problem[0])).solve()

        Assert.assertEquals(567, seatId)
    }

    @Test
    fun boarding_pass_2_is_calculated_properly() {
        val seatId = Day5(listOf(problem[1])).solve()

        Assert.assertEquals(119, seatId)
    }

    @Test
    fun boarding_pass_3_is_calculated_properly() {
        val seatId = Day5(listOf(problem[2])).solve()

        Assert.assertEquals(820, seatId)
    }

    @Test
    fun example_problem_is_solved_correctly() {
        val highestSeatId = Day5(problem).solve()

        Assert.assertEquals(820, highestSeatId)
    }

    @Test
    fun boarding_pass_4_is_calculated_properly() {
        val seatId = Day5(listOf(problem[3])).solve()

        Assert.assertEquals(357, seatId)
    }

    @Test
    fun example_rowNumber_is_calculated_correctly() {
        // FBFBBFF-RLR
        val boardingPass = BoardingPass(
            listOf(
                BoardingPass.FRONT,
                BoardingPass.BACK,
                BoardingPass.FRONT,
                BoardingPass.BACK,
                BoardingPass.BACK,
                BoardingPass.FRONT,
                BoardingPass.FRONT
            ),
            listOf()
        )

        val rowNumber = Day5(listOf(boardingPass)).solve()
        Assert.assertEquals(44, rowNumber)
        Assert.assertEquals(
            listOf(
                BoardingPass.RIGHT,
                BoardingPass.RIGHT,
                BoardingPass.RIGHT
            ), problem[0].seat
        )
    }

    @Test
    fun example_columnNumber_is_calculated_correctly() {
        // FBFBBFF-RLR
        val boardingPass = BoardingPass(
            listOf(),
            listOf(
                BoardingPass.RIGHT,
                BoardingPass.LEFT,
                BoardingPass.RIGHT
            )
        )

        val columnNumber = Day5(listOf(boardingPass)).solve()
        Assert.assertEquals(5, columnNumber)
    }

}