import scala.io.StdIn.readDouble;

object SalaryCalculator {

  def wage(wh: Double) = wh * 150;

  def ot(oh: Double) = oh * 75;

  def income(wh: Double, oh: Double) = wage(wh) + ot(oh);

  def tax(income: Double) = income * 0.1;

  def takeHome(wh: Double, oh: Double) = income(wh, oh) - tax(income(wh, oh));

  def main(args: Array[String]) {
    println("Enter Working Hours :");
    var wh: Double = readDouble();
    println("Enter OT hours :");
    var oh: Double = readDouble();

    printf("Salary per week : " + takeHome(wh, oh));

  }
}