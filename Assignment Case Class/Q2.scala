object Q2 extends App{
  val p1= point(1,5);
  val p2= p1.move(3,9);

  println(p1);
  println(p2);
}

case class point(a:Int,b:Int){
  def x:Int = a;
  def y:Int = b;
  def move(dx:Int,dy:Int) = point(this.x+dx,this.y+dy);
}