object volume{
def main(args:Array[String]){
val PI=3.14;
def power(y:Int):Int={
y*y*y;
}
 def getVolume(x:Int):Double={
 (4*PI*x)/3;      //calculate the volume
 }
println("------------------------------------------");
println("Volume Of Sphere:"+getVolume(power(5)));
println("------------------------------------------");

 }

}
