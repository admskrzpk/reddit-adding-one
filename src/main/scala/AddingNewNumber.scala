object AddingNewNumber {
def addingNewNumber(n: Int): Int = {
  n.toString.split("").map(_.toInt + 1).mkString.foldLeft("")(_ + _).toInt
}
}
