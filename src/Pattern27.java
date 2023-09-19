public class Pattern27 {
    public static void main(String[] args){
        int n=5;

        for(int i=1; i<=n; i++){
            int idx=1;
            for(int j=1;j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(idx+" ");
                idx++;
            }
            for(int j=i-1; j>=1; j--){
                System.out.print(idx-2+" ");
                idx--;
            }
            System.out.println();
        }
    }
}
