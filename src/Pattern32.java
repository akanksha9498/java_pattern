public class Pattern32 {
    public static void main(String[] args){
        int n = 5;
         int st = 1,count=1;
         for(int i=1; i<=2*n-1; i++){
             for(int j=1; j<=st; j++){
                 if(j%2==1){
                     System.out.print(count+" ");
                 }
                 else
                 System.out.print("* ");
             }
             if(i<=n-1){
             st+=2;
             count++;
             }
             else{
                 st-=2;
                 count--;
             }
             System.out.println();
         }
    }
}
