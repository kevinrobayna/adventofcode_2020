import org.junit.Assert
import kotlin.test.Test

class Day5Test {

    private val problemString = Day5Test::class.java.getResource("example_day5.txt").readText()
    private val problem = day5ProblemReader(Day5Test::class.java.getResource("example_day5.txt").readText())

    @Test
    fun problem_is_read_correctly() {
        val problem = day5ProblemReader(problemString)

        Assert.assertEquals(3, problem.size)
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
        val seatId = Day5(problem).calculateSeatId(problem[0])

        Assert.assertEquals(567, seatId)
    }

    @Test
    fun boarding_pass_2_is_calculated_properly() {
        val seatId = Day5(problem).calculateSeatId(problem[0])

        Assert.assertEquals(119, seatId)
    }

    @Test
    fun boarding_pass_3_is_calculated_properly() {
        val seatId = Day5(problem).calculateSeatId(problem[0])

        Assert.assertEquals(820, seatId)
    }

    @Test
    fun example_problem_is_solved_correctly() {
        val highestSeatId = Day5(problem).solve()

        Assert.assertEquals(820, highestSeatId)
    }

}