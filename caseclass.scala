
import math.{ sqrt, pow }

object caseclass{
 def main(args:Array[String]){
  val x1=new Points(2.0,3.0)
  val x2=new Points(3.0,0.0)
  val x3=x1.move(2,5)


  val x4=x1+x2
  println(x4)
  println(x3)
  val x5=x1.distance(x2)
  println(x5)
  
}


case class Points(p:Double,q:Double){
  def x:Double=p
  def y:Double=q
   
  def move(dx:Double,dy:Double)=Points(this.x+dx,this.y+dy) 
  
  def +(that:Points)=Points(this.x+that.x,this.y+that.y)    

  def distance(other: Points):Double=sqrt(pow(x - other.x, 2) + pow(y - other.y, 2)) 

}
}