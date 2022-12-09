public class Pattern {
    public static void main(String[] args) {
        int numberofRows = 6;
        int i, j;
        for (i=1; i<= numberofRows; i++) {
            for (j=1; j<=numberofRows - i; j++){
                System.out.print(" ");
            }
            for (j = 1; j <= i * 2 - 1; j++){
              System.out.print("*");
             }
            System.out.println();
        }
        for (i = numberofRows - 1; i>0;i--){
            for (j=1;j<=numberofRows -i;j++){
                System.out.print(" ");
            }
        for (j=1;j<=1*2-1;j++){
            System.out.print("*");
        }
            System.out.println();
        }
    }
}
