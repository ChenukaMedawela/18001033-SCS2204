object Q4 extends App{
  val p1= point(1,5);
  val p2= point(3,9);

  println(p1.move());
  println(p2.move());
}

case class point(a:Int,b:Int){
  def x:Int = a;
  def y:Int = b;

  def move() = point(this.y,this.x);
}