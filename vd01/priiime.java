public class priiime {
public static void main(String[] args)  {
int count = 0;
for(int i = 100 ; i< 150; i++)   {

boolean isPrime = true;

for(int j = 2; j<=Math.sqrt(i); j++){
if(i%j == 0){

isPrime = false;
break;
}
}
if(isPrime){
count++;
System.out.print(count);
System.out.println("print the prime number" +i);
}
}
}
}