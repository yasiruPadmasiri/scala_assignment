object CaesarCipher1{

//main 
def main(args:Array[String])={

val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";  //alphabet

val En=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size);  

val De=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key)%a.size);   


val s = scala.io.StdIn.readLine("Enter string : ");      //get user input string
        
printf("\n\n");

val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a));  //cipher function

val Encrypt_string=cipher(En,s,5,alphabet);   
printf("Encrypted_string :"+Encrypt_string);     
printf("\n");

val Decrypt_string=cipher(De,Encrypt_string,5,alphabet);   
printf("Decrypted_string :"+Decrypt_string);             
printf("\n\n");
}
}