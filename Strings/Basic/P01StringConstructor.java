/**
 * P01StringConstructor
 */
public class P01StringConstructor {
    public static void main(String[] args) {
        char[] ch={'S','t','r','i','n','g','3'};
        char[] by={65,70,45,92,42,106,88};
        String s1 = "String1";    //s1 is holding a reference to the object "String1"
        String s2 = new String("String2"); // Passing a String literal to the string constructor
        String s3 = new String(ch); // Passing an array of charecters to the string constructor to make a String
        String s4 = new String(by); // Passing an array of bytes to the string constructor to make a String from the ascii values
        System.out.println(s1+"\n"+s2+"\n"+s3+"\n"+s4);
    }
}