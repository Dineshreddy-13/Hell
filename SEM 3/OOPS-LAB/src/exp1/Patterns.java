package exp1;
public class Patterns {
    public static void main(String[] args) {
        System.out.println("<---------------------------->\n| DINESH REDDY - URK23CS1263 |\n<---------------------------->\n");

        for (int i=1; i<=4; i++){
            for (int j=3; j>=i; j--){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

}
}
