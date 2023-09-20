public class Pattern28 {
    public static void main(String[] args){
        int n = 5;
        int st=1,sp=n-1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sp; j++){
                System.out.print("  ");
            }
            int val=i;
            for(int j=1; j<=st; j++){
                System.out.print(val+" ");
                if(j<=st/2)
                val++;
                else{
                    val--;
                }
            }
            st+=2;
            sp--;
            System.out.println();

        }
    }
}
