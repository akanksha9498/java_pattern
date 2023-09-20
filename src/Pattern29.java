public class Pattern29 {
    public static void main(String[] args){
        int n = 5;
        int st=1,sp=n-1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sp; j++){
                System.out.print("  ");
            }
            int val=i;
            for(int j=1; j<=st; j++){
                if(j==1 || j==st)
                System.out.print(val+" ");
                 else{
                     System.out.print("0"+" ");
                }
            }
            st+=2;
            sp--;
            System.out.println();

        }
    }
}
