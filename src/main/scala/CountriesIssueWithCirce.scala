import scala.io.{BufferedSource, Source}
import scala.util.{Failure, Success, Try, Using}

object CountriesIssueWithCirce extends App {

  /**
  *
   * Read json file with countries and select 10 countries with the biggest area in africa region
   * - official name
   * - area
   * - capital
   * - region
   *
   * Json can not contain the field "area" for some countries
   *
   *
   *
  * */

  val source: BufferedSource = Source.fromFile("src/main/resources/countries.json")

  import model._
  import com.github.plokhotnyuk.jsoniter_scala.macros._
  import com.github.plokhotnyuk.jsoniter_scala.core._


  Using(source) { src =>
    implicit val codec = JsonCodecMaker.make[List[Country]]
    readFromString(src.mkString)
  } match {
    case Success(value) => println(value)
    case Failure(exception) => ???
  }






}
