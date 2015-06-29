
//This is a case class
//
//Case classes are a special feature of Scala
//
//They have built in .equals methods, toString methods and hashCode methods which makes them easy to use
//This is Bonnie making a change!

case class HelloWorld(message : String, volume : Int)

object HelloWorld {

  def greet(hello : HelloWorld) : String = hello.message

  def isQuiet(hello : HelloWorld) : Boolean = {
    hello.volume < 50
  }

}
