import scala.io.StdIn.readInt

object Sum3 {

  def sumOfn(numb:Int):Int={
    if(numb==1)
      1
    else
      numb+sumOfn(numb-1)
  }

  def main(args:Array[String]){
    println("Insert the Number : ");
    var numb:Int=readInt();

    println("Summation from 0 to "+numb+" :"+sumOfn(numb));
  }
}