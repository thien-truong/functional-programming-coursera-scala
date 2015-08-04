package localhost.tt.week1_functionsandevaluations

import org.scalatest.{Matchers, FunSpec}

class andSpec extends FunSpec with Matchers {
  describe("Main") {
    it("evaluates that true && false is false") {
      Main.and(true, false) shouldBe false
    }

    it("evaluates that false && loop is false") {
      Main.and(false, true) shouldBe false
    }
  }

}
