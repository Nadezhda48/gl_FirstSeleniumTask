import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ExampleClass {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Run this code before all Tests");
    }

    @Test
    public void print(){
        System.out.println("Hello");
    }

    @Test
    public void print2(){
        System.out.println("World!");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Run this code after all Tests");
}
}
