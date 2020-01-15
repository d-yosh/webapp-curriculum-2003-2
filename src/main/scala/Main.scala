object Main extends App {
  val f1: Option[Int => Int] = Some(x => x * 2)
  val f2: Option[Int => Int] = Some(x => x + 10)
  val f3: Option[Int => Int] = Some(x => x / 3)

  val result = for {
    f <- f1
    g <- f2
    h <- f3
  } yield f.andThen(g).andThen(h)
  println(result.map(_(15)))
}
