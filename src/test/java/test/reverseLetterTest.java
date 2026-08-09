package test.java.test;
import com.example.util.StringUtil;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class reverseLetterTest {
 @Test
    public void happyPath() {
     String phrase = "J@va the be$t!123";
     String result = StringUtil.reverseLetters(phrase);
     ;
     assertEquals(
             "t@eb eht av$J!123",
             result,
             "Must be t@eb eht av$J!123"
     );
     System.out.println(result);
 }
     @Test
     public void emptyString() {
         String phrase = "    ";
         String result =  StringUtil.reverseLetters(phrase);;
         assertEquals(
                 "    ",
                 result
         );
         System.out.println(result);
    }
    @Test
    public void oneLetter() {
        String phrase = "a";
        String result = StringUtil.reverseLetters(phrase);
        ;
        assertEquals(
                "a",
                result
        );
        System.out.println(result);
    }
    @Test
    public void noLetters() {
        String phrase = "123 !@#";
        String result = StringUtil.reverseLetters(phrase);
        ;
        assertEquals(
                "123 !@#",
                result
        );
        System.out.println(result);
    }
}
