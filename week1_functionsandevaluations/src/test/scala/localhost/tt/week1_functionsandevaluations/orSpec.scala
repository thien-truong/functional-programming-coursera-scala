package localhost.tt.week1_functionsandevaluations

import org.scalatest.{Matchers, FunSpec}

class orSpec extends FunSpec with Matchers {
  describe("Main") {
    it("evaluates (true || false) to false") {
      Main.or(true, false) shouldBe true
    }

    it("evaluates (false || true) to true") {
      Main.or(false, true) shouldBe true
    }

    it("evaluates (false || false) to false") {
      Main.or(false, false) shouldBe false
    }
  }
}
