// See LICENSE.txt for license details.
package TutorialSolutions

import Chisel._

class VecShiftRegisterParam(val n: Int, val w: Int) extends Module {
  val io = new Bundle {
    val in  = UInt(INPUT,  w)
    val out = UInt(OUTPUT, w)
  }
  val delays = Reg(init = Vec(n, UInt(0, width = w)))
  for (i <- n-1 to 1 by -1)
    delays(i) := delays(i-1) 
  delays(0) := io.in
  io.out := delays(n-1)
}
