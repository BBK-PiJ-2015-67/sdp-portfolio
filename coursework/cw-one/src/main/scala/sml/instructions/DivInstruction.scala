package sml.instructions

import sml.Machine

/**
  * Divide the value at op1 by op2 and store
  * result in specified register
  */
case class DivInstruction(label: String, opcode: String, result: Int, op1: Int, op2: Int) extends MathInstruction {

  /**
    * @see Instruction#execute(m: Machine)
    */
  override def execute(m: Machine): Unit =
    m.regs(result) = m.regs(op1) / m.regs(op2)

  /**
    * @see Instruction#toString()
    */
  override def toString: String =
    super.toString + s" $op1 / $op2 to $result \n"
}

object DivInstruction {
  def apply(label: String, result: Int, op1: Int, op2: Int): MathInstruction =
    new DivInstruction(label, "div", result, op1, op2)
}
