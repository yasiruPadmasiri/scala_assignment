object cost{
def main(args:Array[String]){
 def bookPrice(x:Int)=x*24.95;

 def discount(x:Double)=x*.4;
 def shippingCost(x:Int)={
 if(x<=50){
 3;
 }
 else{
 3+(x-50)*.75;
 }
 }
 var totalCost:Double=bookPrice(60)+shippingCost(60)-discount(bookPrice(60));
 println("Cost is:"+totalCost);
}
}
