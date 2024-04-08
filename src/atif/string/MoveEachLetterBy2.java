package atif.string;

//move each letter by 2 letter
public class MoveEachLetterBy2 {
    public static void main(String[] args) {
        String s = "Hello world";
        s = s.replace(" ", "");
        System.out.println(s);
        String finalString = "";
        for(char c : s.toCharArray()){
            if(c == 'y' || c == 'Y' || c == 'Z' || c == 'z' )
                c-= 26;
            c+=2;
            finalString = finalString + c;
        }
        System.out.println(finalString);
    }
}
