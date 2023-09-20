public class Pattern22 {
    public static void main(String[] args){
        int n = 5;
        int st = n, sp = -1;
        for(int row=1; row<=n; row++){
            for(int i=1; i<=st; i++){
                System.out.print("* ");
            }
            for(int i=1; i<=sp; i++){
                System.out.print("  ");
            }
            for(int i=1; i<=st; i++){
                if(row==1 && i==st){
                    continue;
                }
                System.out.print("* ");
            }
            st--;sp+=2;
            System.out.println();
        }
    }
}
