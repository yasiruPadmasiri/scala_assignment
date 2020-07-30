
object rational_number {
  def main(args:Array[String]){
  val p1=new Rational(3,4)
  val p2=new Rational(5,8)
  val p3=new Rational(2,7)
  println("..............	Q1. negetive.............................")
  println(p1.neg)
  println(p2.neg)
  println("...............Q2. substraction.........................")
  val s1=p1-p2
  val s2=s1-p3
  println("p1="+p1)
  println("p2="+p2)
  println("p3="+p3)
  println("p1-p2-p3 ="+s2)
  
  }
  
  
  class Rational(n:Int,d:Int)
{ 
  require(d>0,"d must be grater than 0")
  def numer=n/gcd(Math.abs(n),d)
  def denom=d/gcd(Math.abs(n),d)
  def this(n:Int)=this(n,1)
  private def gcd(a:Int,b:Int):Int =if(b==0)a else gcd(b,a%b)
  def +(r:Rational)=new Rational(this.numer*r.denom+ this.denom*r.numer,this.denom*r.denom)
  def neg=new Rational(-this.numer,this.denom)
  def -(r:Rational)=this+r.neg
  override def toString=numer+"/"+denom
  
}

}