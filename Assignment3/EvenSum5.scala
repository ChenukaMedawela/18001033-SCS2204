import scala.io.StdIn.readInt;

object EvenSum5 {

  def isEven(numb:Int):Boolean = numb match{
    case 0 => true;
    case _ => isOdd(numb-1);
  }

  def isOdd(numb:Int):Boolean = !(isEven(numb));

  def sumOfEven(numb:Int):Int = numb match{
    case 0 => 0;
    case x if(!isEven(x)) => sumOfEven(x-1);
    case x if(isEven(x)) => x + sumOfEven(x-1);
  }

  def main(args:Array[String]){
    print("Enter the number: ");
    val numb:Int=readInt();
    printf("The addition of even number until "+numb+" is: "+sumOfEven(numb-1));

  }
}