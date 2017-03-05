package sml.instructions

import sml.{Instruction, Machine}

trait Mul extends Instruction

case class MulInstruction(label: String, opcode: String, result: Int, op1: Int, op2: Int) extends Mul {

  override def execute(m: Machine): Unit =
    m.regs(result) = m.regs(op1) * m.regs(op2)

  override def toString: String =
    super.toString + s" $op1 * $op2 to $result \n"
}

object MulInstruction {
  def apply(label: String, result: Int, op1: Int, op2: Int): MulInstruction =
    MulInstruction(label, "mul", result, op1, op2)
}