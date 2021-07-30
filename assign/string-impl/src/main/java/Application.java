public class Application {

    public static void main(String[] args) {
        //StringFunctions class is from <string-api> sub-module
        String name ="Assignment of maven";
        int size = StringFunctions.sizeofString(name);
        String reversed_string = StringFunctions.reverseString(name);
        System.out.println("Size od string = "+size+"\nReversed String = "+reversed_string);
    }
}
