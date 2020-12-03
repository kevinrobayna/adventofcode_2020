import org.junit.Assert
import kotlin.test.Test

class Day3Test {

    private val problem = buildMapFromString(Day3Test::class.java.getResource("example_day3.txt").readText())

    @Test
    fun next_from_start_returns_expected_value() {
        val day3 = Day3(problem)
        val next = day3.next(0, 0)
        Assert.assertEquals(1, next.first)
        Assert.assertEquals(3, next.second)
        Assert.assertFalse(day3.isTree(next.first, next.second))
    }

    @Test
    fun second_jump_should_return_tree() {
        val day3 = Day3(problem)
        val firstJump = day3.next(0, 0)
        val secondJump = day3.next(firstJump.first, firstJump.second)
        Assert.assertEquals(2, secondJump.first)
        Assert.assertEquals(6, secondJump.second)
        Assert.assertTrue(day3.isTree(secondJump.first, secondJump.second))
    }

    @Test
    fun third_jump_should_return_open() {
        val day3 = Day3(problem)
        val nextJump = day3.next(2, 6)
        Assert.assertEquals(3, nextJump.first)
        Assert.assertEquals(9, nextJump.second)
        Assert.assertFalse(day3.isTree(nextJump.first, nextJump.second))
    }

    @Test
    fun forth_jump_should_return_tree_as_it_will_start_from_start() {
        val day3 = Day3(problem)
        val nextJump = day3.next(3, 9)
        Assert.assertEquals(4, nextJump.first)
        Assert.assertEquals(1, nextJump.second)
        Assert.assertTrue(day3.isTree(nextJump.first, nextJump.second))
    }

    @Test
    fun fifth_jump_should_return_tree() {
        val day3 = Day3(problem)
        val nextJump = day3.next(4, 1)
        Assert.assertEquals(5, nextJump.first)
        Assert.assertEquals(4, nextJump.second)
        Assert.assertTrue(day3.isTree(nextJump.first, nextJump.second))
    }

    @Test
    fun example_problem_returns_expected_count_of_trees() {
        val day3 = Day3(problem)
        Assert.assertEquals(7, day3.solve())
    }
}