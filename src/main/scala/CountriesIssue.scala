import scala.io.{BufferedSource, Source}

object CountriesIssue extends App {

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

  println(source.mkString)


}
