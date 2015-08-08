package localhost.tt.week1_functionsandevaluations

import org.scalatest.{Matchers, FunSpec}

class countNumberOfWaysToMakeChangeSpec extends FunSpec with Matchers {
  describe("Main") {
    it("counts number of ways to make change for 2 given a list of coin denominations of 1 and 2") {
      Main.countNumberOfWaysToMakeChange(2, List(1, 2)) shouldBe 2
    }

    it("counts number of ways to make change for 4 given a list of coin denominations of 1, 2, and 3") {
      Main.countNumberOfWaysToMakeChange(4, List(1, 2, 3)) shouldBe 4
    }

    it("counts number of ways to make change for 4 given a list of coin denominations of 1 and 2") {
      Main.countNumberOfWaysToMakeChange(4, List(1, 2)) shouldBe 3
    }

    it("counts number of ways to make change for 4 given a list of coin denominations of 1, 2, 3, 4") {
      Main.countNumberOfWaysToMakeChange(4, List(1, 2, 3, 4)) shouldBe 5
    }

    it("counts number of ways to make change for 0 given a list of coin denominations of 1, 2, 3, 4") {
      Main.countNumberOfWaysToMakeChange(0, List(1, 3, 4, 2)) shouldBe 0
    }
  }

}
