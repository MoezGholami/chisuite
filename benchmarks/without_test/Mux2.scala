// See LICENSE.txt for license details.
package TutorialSolutions

import Chisel._
import scala.math._

class Mux2 extends Module {
  val io = new Bundle {
    val sel = Bits(INPUT,  1)
    val in0 = Bits(INPUT,  1)
    val in1 = Bits(INPUT,  1)
    val out = Bits(OUTPUT, 1)
  }
  io.out := (io.sel & io.in1) | (~io.sel & io.in0)
}
