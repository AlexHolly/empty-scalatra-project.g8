/**
 * Created by alex on 11.11.15.
 */

import de.alexholly.util.JettyServer
import de.alexholly.util.http.HttpAsync
import de.alexholly.util.http.HttpSync
import $package$.logic.$service_name$

import org.json4s.DefaultFormats
import org.json4s.jackson.JsonMethods._
import org.scalatest._
import scala.concurrent.duration._
import play.api.libs.ws.WSResponse
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
    $service_name$.reset()
  }

  test("Test 1") {
  }
}
