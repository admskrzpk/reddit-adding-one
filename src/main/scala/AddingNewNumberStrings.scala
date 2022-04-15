object AddingNewNumberStrings extends App {
  def addingNewNumber(n: Int): Int = {
    if (n >= 0)
      n.toString.split("").map(_.toInt + 1).foldLeft("")(_ + _).toInt
    else n.abs.toString.split("").map(_.toInt + 1).foldLeft("-")(_ + _).toInt
  }
}

