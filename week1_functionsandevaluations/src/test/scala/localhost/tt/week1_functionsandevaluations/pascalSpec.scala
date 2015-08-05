package localhost.tt.week1_functionsandevaluations

import org.scalatest.{Matchers, FunSpec}

class pascalSpec extends FunSpec with Matchers {
 describe("Main") {
   it("finds the value of the pascal triangle at position of column 0 and row 2") {
     Main.pascal(0, 2) shouldBe 1
   }

   it("finds the value of the pascal triangle at position of column 0 and row 2 using recursion") {
     Main.pascalRecursion(0, 2) shouldBe 1
   }

   it("finds the value of the pascal triangle at position of column 2 and row 4 using recursion") {
     Main.pascalRecursion(2, 4) shouldBe 6
   }
 }

}
