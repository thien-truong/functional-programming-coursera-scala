package localhost.tt.week1_functionsandevaluations

import org.scalatest.{Matchers, FunSpec}

class gcdEuclidSpec extends FunSpec with Matchers {
  describe("Main") {
    it("finds the greatest common divisor of two integers using Euclid's algorithm") {
      Main.gcdEuclid(270, 192) shouldBe 6
    }
  }
}
