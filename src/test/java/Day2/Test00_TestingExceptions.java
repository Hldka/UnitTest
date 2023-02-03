package Day2;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test00_TestingExceptions {
    //!!test ettgimiz kodunu bizim bekledigimiz exception firlatma durumunu kontrol ediyoruz
    @Test
    void testException(TestInfo info){


        String str ="Merhaba JUnit";

        assertThrows(NullPointerException.class , () -> {
            System.out.println(info.getDisplayName()+" testException çalıştı");
            str.length();
        });
    }
    //Baska bir örnek

    @Test
    void testException2(){
        int sayi1=5;
        int sayi2=0;
        // parent'i olan RuntimeException da koysak çalısır
        assertThrows(ArithmeticException.class,()-> {
            System.out.println(sayi1/sayi2);
        });
    }
    @Test
    void testException3(){
        int sayi1 = 1;
        int sayi2 = 0;

        assertThrows(ArithmeticException.class, ()-> divide(sayi1,sayi2));

    }

    // testException3() de kullanılacak method
    private int divide(int sayi1 , int sayi2) {
        return sayi1/sayi2;
    }

}
