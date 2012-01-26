package akskscala.no29.s99

import org.scalatest._
import org.scalatest.matchers._
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P01Spec extends Spec with ShouldMatchers {

  describe("P01") {
    it("should be available") {
      P01.isInstanceOf[Singleton] should equal(true)
    }
  }

}
