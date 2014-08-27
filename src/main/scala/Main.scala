object Main {
  def main(args: Array[String]) {
    val input = List("a", "b", "c")
    val output = for {
      x <- input
      y <- List(x)
    } yield y
    println(output)
    /* input.flatMap(x => List(x).map(y => y))
     * |-> input.flatMap(x => List(y))
     * |-> input
     */
    // IMPORTANT -> the last one is a "map", not a "flatmap"
  }
}
