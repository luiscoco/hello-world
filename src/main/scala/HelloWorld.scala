

import java.io.File
case class Config(
                   url: String = "-1",
                   table: String = "-1",
                   schema: String = "-1",
)

/**
* 1) env: prod uat, dev
 *
 * 2)
*
* */


object HelloWorld extends App {


  Set(1,2,3).map(_ + 1)

  import scopt.OParser
  val builder = OParser.builder[Config]
  val parser1: OParser[Unit, Config] = {
    import builder._
    OParser.sequence(
      programName("scopt"),
      head("scopt", "4.x"),
      opt[String]('u', "url")
        .action((x, c) => c.copy(url = x))
        .text("foo is an integer property"),
      opt[String]('t', "table")
        .action((x, c) => c.copy(table = x))
        .text("foo is an integer property"),
      opt[String]('s', "schema")
        .action((x, c) => c.copy(schema = x))
        .text("foo is an integer property"),
      checkConfig( c => success)
    )
  }

  OParser.parse(parser1, args, Config()) match {
    case Some(config) =>

      println(s"${args.length} arguments")
      println(s"URL for JDBC, ${config.url}!")
      println(s"Table Name is, ${config.table}!")
      println(s"Schema, ${config.schema}!")


    case _ =>
    // arguments are bad, error message will have been displayed
  }





}
