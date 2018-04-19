object SumOfSingles extends App {

  def SingleSum (input : List[Int]) : Int = {

    val distinctList = input.diff(input.distinct)

    input.filterNot(x => distinctList.contains(x)).sum

  }

}
