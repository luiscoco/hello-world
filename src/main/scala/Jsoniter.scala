

import scala.io.Source
import scala.util.{Failure, Success, Try, Using}


object Jsoniter extends App {

  case class Device(id: Int, model: String)
  case class User(name: String, devices: Seq[Device])

  import com.github.plokhotnyuk.jsoniter_scala.macros._
  import com.github.plokhotnyuk.jsoniter_scala.core._

  implicit val codec: JsonValueCodec[User] = JsonCodecMaker.make


  val inputJson = """{"devices":[{"id":1,"model":"HTC One X"}]}"""

  val value = "src/main/resources/countries.json"

  val triedString: Try[User] = Using(Source.fromFile(value)) { source =>
    readFromString[User](source.mkString)
  }

  private val either: Either[Throwable, User] = triedString.toEither

  either match {
    case Right(value) => println(s"JSON valid: $value")
    case Left(ex) => println(s"Exception: $ex")
  }

//  val jsonValid: Either[String, User] = triedString.toEither.left.map(_.getMessage)
  val jsonValid: Either[String, User] = triedString match {
    case Failure(exception) => Left(exception.getMessage) // save to error log
    case Success(value)     => Right(value) // continue to process
  }



//  println(user)


//  val json = writeToString(User("John", Seq(Device(2, "iPhone X"))))




}
