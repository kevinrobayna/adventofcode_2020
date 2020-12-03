import org.junit.Assert
import kotlin.test.Test

class Day1Test {

    @Test
    fun example_solution() {
        val solution = Day1(listOf(1721, 979, 366, 299, 675, 1456)).solve()
        Assert.assertEquals(514579, solution.first * solution.second)
    }

    @Test
    fun example_part2_solution() {
        val solution = Day1Part2(listOf(1721, 979, 366, 299, 675, 1456)).solve()
        Assert.assertEquals(241861950, solution.first * solution.second * solution.third)
    }
}