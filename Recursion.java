
package recursion;


public class Recursion {
    
   static  void reverseString(String s, int i){
        if(i==s.length())return;
        reverseString(s, i+1);
        System.out.print((s.charAt(i)-'0')*2+"\t");
    }
   
   
   static int getNumberOfStebs(int n){
       if(n==1)
           return 1;
       if(n%2==0)
             return 1+getNumberOfStebs(n/2);
       else
            return 1+getNumberOfStebs(3*n+1);
       
   }
  static int getPower(int n){
       if(n==0)
           return 1;
       return 2*getPower(n-1);
   }

  
  
static int fastPower(int a,int b){
   if(b==0 )return 1;
   int ret=fastPower(a,b/2);
   return((b%2==0)?ret*ret:ret*ret*a);
}  


static int pascaltringle(int row,int column){
    if(column==0 ||column==row)return 1;
    
    return pascaltringle(row-1, column)+pascaltringle(row-1, column-1);
}

   
    public static void main(String[] args) {
        //reverseString( "0123456", 0);
//        System.out.println("Number of steps for this Number in series is : "+getNumberOfStebs(24)+"\n");
//        System.out.println(getPower(5));
//        System.out.println("fastPower :"+fastPower(2, 5)+"\n");

        System.out.println("pascal triangle of the give row and column is : "+pascaltringle(4, 3));
    }
    
}
