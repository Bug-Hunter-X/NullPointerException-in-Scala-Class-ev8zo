```scala
class MyClass(val name: String) {
  def printName(): Unit = {
    println(s"Name: "+Option(name).getOrElse("Unknown"))
  }
}

object MainObject {
  def main(args: Array[String]): Unit = {
    val myObject = new MyClass(null)
    myObject.printName() //Prints "Name: Unknown"
    val myObject2 = new MyClass("John Doe")
    myObject2.printName() //Prints "Name: John Doe"
  }
}
```