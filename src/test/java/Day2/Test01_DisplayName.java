package Day2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test01_DisplayName {
    //method ismine destan yazmamak ama okununca da tam analışsın istersem diye
    @Test
// test_parseInt_If_it_is_throwing_for_non_digit_value
@DisplayName("parseInt() metoduna nümeric olmayan argüman gönderildiğinde fırlatılan exception ı test eden method")
void testException(){

    String str ="Merhaba";

    assertThrows(NumberFormatException.class, ()->{
        Integer.parseInt(str);
    });

}
}
