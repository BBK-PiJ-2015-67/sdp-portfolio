package flyweight

class ScalaPlatform extends Platform {

  println("ScalaPlatform object created")

  override def execute(code: Code): Unit =
    println(s"Compiling and executing ${code.code}")
}
