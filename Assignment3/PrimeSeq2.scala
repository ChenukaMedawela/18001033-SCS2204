import scala.io.StdIn.readInt;

object PrimeSeq2 {
  def gcd(a:Int,b:Int):Int=b match{
    case 0 => a
    case b if (b>a) => gcd(b,a)
    case _ => gcd(b,a%b)
  }

  def primeCheck(p:Int,n:Int=2):Boolean=n match{
    case x if(x==p) => true
    case x if(gcd(p,x)>1) => false
    case x => primeCheck(p,x+1)
  }

  def printSeq(numb:Int):Unit={
    if(numb>1){
      if(primeCheck(numb)==true){
        print(numb+"\t");
        printSeq(numb-1);
      }
      else{
        printSeq(numb-1);
      }

    }

  }

  def main(args:Array[String]){
    println("Insert the Number upper limt ofsequence : ");
    var numb:Int=readInt();

    println("Prime Sequence until "+numb+" :" );
    printSeq(numb);

  }
}
     