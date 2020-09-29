object assignment3{

def main(args:Array[String])={

//Question1
printf("\t*****Question 1 prime number*****\n\n");
printf("Enter number:");
var nu=scala.io.StdIn.readInt();
def gcd(x:Int,y:Int):Int={
if(y==0) x
else if(y>x) gcd(y,x)
else gcd(y,x%y)
}

def prime(p:Int,n:Int=2):String={
if(p==n) true.toString
else if(gcd(p,n)>1) false.toString
else prime(p,n+1)
}
printf(prime(nu))
printf("\n---------------------------\n");



//Question3
printf("\t*****Question 3 calculate sum*****\n\n");
def sum(n:Int):Int=if(n==1) 1 else n+sum(n-1);
printf("Enter number:");
var num=scala.io.StdIn.readInt();
printf("Sum 1 to %d:%d",num,sum(num));
printf("\n---------------------------\n");


//Question4
printf("\t*****Question 4 Odd or Even*****\n\n");
printf("Enter number:");
var numb=scala.io.StdIn.readInt();

def even(n:Int):Boolean={
if(n==0) true
else ((n % 10) % 2 ==0) && even(n/10)
}
even(numb)
if(even(numb)==true) printf("number is even")
else printf("number is odd")

printf("\n---------------------------\n");


//Question5
var sm=0;
printf("\t*****Question 5 Addition of Even*****\n\n");
printf("Enter number:");
var numbr=scala.io.StdIn.readInt();

def even1(n:Int):Boolean={
if(n==0) true
else ((n % 10) % 2 ==0) && even1(n/10)
}

for(k <-0 to numbr){
even1(k)
if(even1(k)==true)
sm=sm+k
}
printf("Sum:"+sm)


printf("\n---------------------------\n");

//Question 6
printf("\t*****Question 6 Fibonacci Numbers*****\n\n");
printf("Enter number:");
var fnumber=scala.io.StdIn.readInt();

def fibonacci(n: Int): Int =
if (n ==0) 0
else if (n==1) 1
else fibonacci(n - 1) + fibonacci(n - 2)

for (i <-0 to fnumber)
print(fibonacci(i) + ", ")
println("...")


}
}
