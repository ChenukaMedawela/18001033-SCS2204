object Q1 extends App{
  val p1= point(1,5);
  val p2= point(3,9);

  println(p1);
  println(p2);
  println(p1+p2);
}

case class point(a:Int,b:Int){
  def x:Int = a;
  def y:Int = b;
  def +(that:point) = (this.x+that.x,this.y+that.y);
}