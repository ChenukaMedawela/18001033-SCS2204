import scala.io.StdIn.readInt;


object Theater {

  def attendees(price:Int)=120+(15-price)/5*20;

  def revenue(price:Int)=attendees(price)*price;

  def cost(price:Int)=500+attendees(price)*3;

  def profit(price:Int)=revenue(price)-cost(price);


  def main(args: Array[String]){
    println("Enter ticket Price in Rs.  :" );
    var price:Int=readInt();

    println(" Profit of the theater :"+profit(5));

  }

}