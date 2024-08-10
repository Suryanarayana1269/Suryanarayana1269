//"appendCodePoint()"" method is in a "StringBuffer" class and this StringBuffer class is in "java.lang" package.
/*appendCodePoint is used to concate the "ASCII" values to the end of the String.
 * --->appendCodePoint() Method
 *  -->StringBuffer Class
 *   ->java.lang  Package
*/
import java.util.Scanner;
public class StirngBufferCodepoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer(s);
        System.out.println("Sample Name is: "+s);
        sb.appendCodePoint(66);
        System.out.println("After Appending the Ascii Value to name: "+sb);
       }
       catch(Exception e){
        System.out.println("Exception Raised");
       }
       finally{
        sc.close();
       }
    }
}