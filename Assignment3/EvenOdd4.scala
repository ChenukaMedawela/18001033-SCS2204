 import scala.io.StdIn.readInt

  object EvenOdd4 {

    def isEven(numb:Int):Boolean= numb match{
      case 0 => true;
      case _ => isOdd(numb-1);

    }

    def isOdd(numb:Int):Boolean = !(isEven(numb));

    def checker(numb:Int):Int={
      println("Insert the Number");
      var numb:Int=readInt();

      if(isOdd(numb)){
        println(numb+" is a Odd number");

      }
      else
      {
        println(numb+" is a even number");
      }
      checker(1);
    }


    def main(args:Array[String]){
      checker(1);

    }
  }


