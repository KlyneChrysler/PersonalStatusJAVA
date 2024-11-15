import java.util.Scanner;

public class BioData {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner ( System.in );

        String name, status, sex;
        //char sex;
        int age;

        System.out.print("ENTER NAME: ");
        name = scan.nextLine();
        System.out.print("ENTER AGE: ");
        age = scan.nextInt();
        scan.nextLine();
        System.out.print("ENTER SEX (M or F): ");
        sex = scan.nextLine(); //in.next().charAt(0);
        //in.nextLine();
        System.out.print("ENTER MARITAL STATUS (SINGLE, MARRIED, SEPARATED, DIVORCED, WIDOWED): ");
        status = scan.nextLine();

        if ( sex.equals("f") || sex.equals("F") ) {
            System.out.print("SHE WILL WORK ONLY IN URBAN AREAS.");
        } else if ( sex.equals("m") || sex.equals("M") ) {
            if ( age >= 20 && age <= 40 ) {
                System.out.print("HE MAY WORK ANYWHERE.");
            } else if ( age > 40 && age <= 60 ) {
                System.out.print("HE MAY WORK IN URBAN AREAS ONLY.");
            } else {
                System.out.print("ERROR");
            }
        }
    }
}