import scala.util.Using

object Monads extends App {
  case class Passenger(name: String, age: Int)

  List(Passenger("Jack", 44), Passenger("Jane", 22), Passenger("Daniel", 24)).find(_.name.startsWith("X")) match {
    case Some(value) => ???
    case None => ???
  }

  Using


}
