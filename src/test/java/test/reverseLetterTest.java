package test.java.test;
import com.example.util.StringUtil;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class reverseLetterTest {
 @Test
    public void happyPath() {
        String phrase = "J@va the be$t!123";
        String result =  StringUtil.reverseLetters(phrase);;
     assertEquals(
             "t@eb eht av$J!123",
             result,
             "Must be t@eb eht av$J!123"
     );
     @Test
     public void happyPath() {
         String phrase = "J@va the be$t!123";
         String result =  StringUtil.reverseLetters(phrase);;
         assertEquals(
                 "t@eb eht av$J!123",
                 result,
                 "Must be t@eb eht av$J!123"
         );
    }
}
