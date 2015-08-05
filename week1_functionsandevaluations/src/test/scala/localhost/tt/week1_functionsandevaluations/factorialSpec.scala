package localhost.tt.week1_functionsandevaluations

import org.scalatest.{Matchers, FunSpec}

class factorialSpec extends FunSpec with Matchers {
  describe("Main") {
    it("computes the factorial of an integer") {
      Main.factorial(5) shouldBe 120
    }

    it("computes the factorial of an integer using Tail-recursion") {
      Main.factorialTailRecursion(5) shouldBe 120
    }
  }
}
