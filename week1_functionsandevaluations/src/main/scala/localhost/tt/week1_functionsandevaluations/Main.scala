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
   * In the case that x is false, y should be passed as an expression
   * instead of as a value - in case y is non-terminating
   * short circuit evaluation.
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

  def pascal(column: Int, row: Int): Int = ???

  def balance(chars: List[Char]): Boolean = ???

  def countChange(money: Int, coins: List[Int]): Int = ???

}
