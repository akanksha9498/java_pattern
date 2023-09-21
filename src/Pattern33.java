public class Pattern33 {
    public static void main(String[] args){
        int n = 10;
        int st=0,sp=n-1;
        for(int i=n; i>=1; i--){
            int count=i;
            for(int j=1; j<=sp; j++){
                System.out.print("  ");
            }

            for(int j=1; j<=st; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.print(0+" ");
            int cnt=n-1;
            for(int j=1; j<=st; j++){
                System.out.print(cnt+" ");
                cnt--;
            }
            st++;
            sp--;

            System.out.println();

        }
    }
}
