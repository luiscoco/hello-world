object model {

  case class Country(
                      name: Name,
                      capital: List[String],
                      area: Option[Double],
                      region: Option[String])

  case class Name(common: String)

}
