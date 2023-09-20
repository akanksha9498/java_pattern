public class Pattern20 {
    public static void main(String[] args){
        int n = 7;
        int sp = n/2;
        int st = 1;
        for(int row=1; row<=n; row++){
            for(int i=1; i<=sp; i++){
                System.out.print(" ");
            }
            for(int i=1; i<=st; i++){
                if(i==1 || i==st){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            if(row<=n/2){
                sp--;
                st+=2;
            }
            else{
                sp++;
                st-=2;
            }
            System.out.println();
        }
    }
}
