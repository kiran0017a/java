
class abc{
public static void main(String[] args){
int a=7;

if(isPrime(a)){
System.out.println(a + "is a prime number.");
}else{
System.out.println(a +"is not  a prime number.");
}
}
public static boolean isPrime(int a){
if(a<=1){
return false;
}

for(int i=2;i<=a/2;i++){
if(a%i==0){
return false;
}
}
return true;
}
}
