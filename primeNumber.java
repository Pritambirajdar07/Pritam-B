public class primeNumber {
    public static void main(String[] args) {
        int n=17,i,m;
        boolean isPrime= true;
        m=n/2;
            for(i=2;i<=m;i++){
                if(n%m==0){
                  isPrime=false;
                  break;  
                }
            }
          if(isPrime)
          System.out.println("Prime number");  
        else
System.out.println("Not Prime number");  

    }
    
}
