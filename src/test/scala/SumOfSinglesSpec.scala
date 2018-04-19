import org.scalatest._

class SumOfSinglesSpec extends WordSpec with MustMatchers {


  "SingleSum" must {

    "return 15 when given List(4, 5, 7, 5, 4, 8)" in {

      SumOfSingles.SingleSum(List(4, 5, 7, 5, 4, 8)) mustEqual 15
    }

    "return 9 when given List(1, 1, 2, 2, 3, 3, 4, 5)" in {

      SumOfSingles.SingleSum(List(1, 1, 2, 2, 3, 3, 4, 5)) mustEqual 9
    }
  }

}
