import org.scalatest.{ FlatSpec, Matchers }


class HelloTest extends FlatSpec with Matchers {

  "A HelloWorld case class" should "be instantiated" in {
    val hello = HelloWorld("Hello", 49)

    hello.message shouldBe "Hello"
    hello.volume shouldBe 49
  }
}
