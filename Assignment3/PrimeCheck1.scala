import scala.io.StdIn.readInt;

object PrimeCheck1 {

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

  def main(args:Array[String]){
    println("Insert the Number that want to check : ");
    var numb:Int=readInt();

    if(primeCheck(numb)){
      println(numb+" is a prime Number")
    }
    else {
      println(numb+" is not a prime Number")
    }

  }
}