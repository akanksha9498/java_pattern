public class Pattern25 {
    public static void main(String[] args){
        int n=5,idx=1;
        for(int i=1; i<=n; i++){
            for(int j=1;j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print(idx+" ");
                idx++;
            }
            System.out.println();
        }
    }
}
