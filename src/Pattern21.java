public class Pattern21 {
    public static void main(String[] args){
        int n = 5;
        int st = 1, sp = n+2;
        for(int row=1; row<=n; row++){
            for(int i=1; i<=st; i++){
                System.out.print("* ");
            }
            for(int i=1; i<=sp; i++){
                System.out.print("  ");
            }
            for(int i=1; i<=st; i++){
                if(row==n && i==st){
                    continue;
                }
                System.out.print("* ");
            }
            st++;sp-=2;
            System.out.println();
        }
    }
}
