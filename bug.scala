```scala
class MyClass(val name: String) {
  def printName(): Unit = {
    println(s"Name: $name")
  }
}

object MainObject {
  def main(args: Array[String]): Unit = {
    val myObject = new MyClass(null)
    myObject.printName()
  }
}
```