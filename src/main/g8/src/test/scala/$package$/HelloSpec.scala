package $package$

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class HelloSpec extends AnyFlatSpec with Matchers {
  "Hello" should "say hello!" in {
    val hello = new Hello()
    
    assert(hello.say == "hello!")
  }
}
