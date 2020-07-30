object Que2
{
	def main(args:Array[String])
	{

		println("\tSubstraction-->X-Y-Z\n");
	
		val rat1=new rationalNumber(3,4);
		val rat2=new rationalNumber(5,8);
		val rat3=new rationalNumber(2,7);
		val rat4=rat1-rat2-rat3;
		println("X-Y-Z = "+rat4);

		println("\n-------------------------------------");
	}

}


class rationalNumber(n:Int,d:Int)
{
	require(d>0,"d must be greater than zero");
    def numer=n/gcd(n,d);
    def denom=d/gcd(n,d);
    def this(n:Int)=this(n,1);
    private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b);
    def +(r:rationalNumber)=new rationalNumber(this.numer*r.denom + this.denom*r.numer,this.denom*r.denom);
    def neg=new rationalNumber(-this.numer,this.denom);
    def -(r:rationalNumber)=this+r.neg;
    override def toString= numer+"/"+denom;
}

