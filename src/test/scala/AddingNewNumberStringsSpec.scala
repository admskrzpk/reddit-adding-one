import org.scalatest.flatspec.AnyFlatSpec

class AddingNewNumberStringsSpec extends AnyFlatSpec{
import AddingNewNumberStrings.addingNewNumber

  "n = 998" should "give 10109" in {
    assert(addingNewNumber(998) == 10109)
  }
  "n = 9" should "give 10" in {
    assert(addingNewNumber(9) == 10)
  }

  "n = -1" should "give 0" in {
    assert(addingNewNumber(-1) == -2)
  }

}
