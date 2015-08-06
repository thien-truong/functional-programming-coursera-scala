package localhost.tt.week1_functionsandevaluations

import org.scalatest.{Matchers, FunSpec}

class detectBalancedParenthesesSpec extends FunSpec with Matchers {
  describe("Main") {
    it("detect balanced parentheses") {
      Main.detectBalancedParentheses("()".toList) shouldBe true
    }

    it("detect unbalanced parentheses") {
      Main.detectBalancedParentheses(":-)".toList) shouldBe false
    }

    it("detect another unbalanced parentheses") {
      Main.detectBalancedParentheses(("(())(").toList) shouldBe false
    }
  }
}
