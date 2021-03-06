/**
 * Created by alex on 11.11.15.
 */
import de.alexholly.util.JettyServer
import $package$.logic.$service_name;format="Camel"$

import org.json4s.DefaultFormats
import org.json4s.jackson.JsonMethods._
import org.scalatest._
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

class $service_name$Test extends FunSuite with BeforeAndAfter {

  //JSON stuff
  implicit val jsonFormats = DefaultFormats

  //Debugging stuff
  val BODY_MESSAGE = " BODY EMPTY?"
  val JSON_MESSAGE = " JSON ERROR"
  val EMPTY_MESSAGE = " SHOULD BE EMPTY"
  val TIMEOUT = 10 seconds

  var server = JettyServer().startOnFreePort()
  var default_url = "http://localhost:" + server.port

  after {
    $service_name;format="Camel"$.reset()
  }

  test("Test 1") {
  }
}
