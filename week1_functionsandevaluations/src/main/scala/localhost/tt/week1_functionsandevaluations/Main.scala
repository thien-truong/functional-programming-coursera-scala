package localhost.tt.week1_functionsandevaluations

object Main {

  def main (args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Implement (x && y) without using &&
   * In the case that x is false, y should be passed as an expression (passed by name)
   * instead of as a value - in case y is non-terminating.
   * Illustrate: short circuit evaluation.
   */

  def and(x: Boolean, y: => Boolean): Boolean = {
    if (x) y else false
  }

  /**
   * Implement (x || y) without using ||
  */

  def or(x: Boolean, y: => Boolean): Boolean = {
    if (x) true else y
  }

  def gcdEuclid(a: Int, b: Int): Int = {
    if (b == 0) a else gcdEuclid(b, a % b)
  }

  def factorial(n: Int): Int = {
    if (n == 0) 1 else n * factorial(n - 1)
  }

  def factorialTailRecursion(n: Int): Int = {
    def loop(accumulator: Int, n: Int): Int = {
      if (n == 0) accumulator
      else loop(accumulator * n, n - 1)
    }
    loop(1, n)
  }

  def pascal(column: Int, row: Int): Int = {
    factorial(row) / (factorial(column) * factorial(row - column))
  }

  /**
   * Pascal triangle in "n choose k" form (n is row number, k is column number)
   *             (0 0)
   *          (1 0) (1 1)
   *       (2 0) (2 1) (2 2)
   *    (3 0) (3 1) (3 2) (3 3)
   * (4 0) (4 1) (4 2) (4 3) (4 4)
   *
   * Ex:pascalRecursion(column, row)
   *   p(2, 4)
   * = p(1, 3) + p(2, 3)
   * = p(0, 2) + p(1, 2) + p(1, 2) + p(2, 2)
   * = 1 + p(0, 1) + p(1, 1) + p(0, 1) + p(1, 1) + 1
   * = 1 + 1 + 1 + 1 + 1 + 1
   * = 6
   */

  def pascalRecursion(column: Int, row: Int): Int = {
    if (column == 0 || column == row) 1
    else pascalRecursion(column - 1, row - 1) + pascalRecursion(column, row - 1)
  }

  def detectBalancedParentheses(chars: List[Char]): Boolean = {
    val parenthesesMatcherTracker = new StringBuilder

    def loop(chars: List[Char], numberOfOpeningParentheses: Int, numberOfClosingParentheses: Int): Boolean = {
      var currentNumberOfOpeningParentheses: Int = numberOfOpeningParentheses
      var currentNumberOfClosingParentheses: Int = numberOfClosingParentheses

      if (chars.head == '(') {
        currentNumberOfOpeningParentheses += 1
        parenthesesMatcherTracker.append('(')
      }

      if (chars.head == ')') {
        currentNumberOfClosingParentheses += 1
        if (parenthesesMatcherTracker.isEmpty) return false
        else parenthesesMatcherTracker.deleteCharAt(parenthesesMatcherTracker.length - 1)
      }

      if (chars.tail.isEmpty) {
        if (currentNumberOfClosingParentheses == currentNumberOfClosingParentheses && parenthesesMatcherTracker.isEmpty)
          true else false
      } else {
        loop(chars.tail, currentNumberOfOpeningParentheses, currentNumberOfClosingParentheses)
      }

    }

    loop(chars, 0, 0)
  }

  /**
   * Dynamic Programming
   * Integer Partition
   */

  def countNumberOfWaysToMakeChange(money: Int, coinDenominations: List[Int]): Int = {

    def count(money: Int, coinDenominations: List[Int]): Int = {
      if (money == 0) return 1
      if (money < 0 || coinDenominations.isEmpty) return 0

      count(money, coinDenominations.tail) +
      count(money - coinDenominations.head, coinDenominations)
    }

    if (money == 0) 0
    else count(money, coinDenominations)
  }

}
