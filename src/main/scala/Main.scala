import scala.io.StdIn.readLine

trait Answer(question: String, yes: Option[Answer] = None, no: Option[Answer] = None)

case class Yes(question: String, yes: Option[Answer] = None, no: Option[Answer] = None) extends Answer(question, yes, no)

case class No(question: String, yes: Option[Answer] = None, no: Option[Answer] = None) extends Answer(question, yes , no)

case class Question(question: String, yes: Option[Answer], no: Option[Answer]) extends Answer(question, yes, no)

case class LearnAnimal() extends Answer (question = "Qual animal você pensou")

case class LearnAbility() extends Answer (question = "O que o animal faz, que um animalAntigo não")

case class Win() extends Answer (question = "Ganhei novamente")


@main def hello: Unit = {
  while
    val line = readLine()
    println(s"Read: $line")
    line != ""
  do ()

  println("Hello world!")
  
}



