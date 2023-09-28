
import io.circe.generic.auto._
import io.circe.parser.decode
import io.circe.syntax._

import scala.language.implicitConversions
import scala.util.Using




object CountriesIssueJsoniter extends App {
  import model._

  val fromFileString = scala.io.Source.fromFile("src/main/resources/countries.json")

  val result = Using(fromFileString) { src =>
    val decoded = decode[List[Country]](src.mkString)

    decoded match {
      case Right(value) => println(value)
      case Left(value) => ???
    }
  }

  println(result)




}
