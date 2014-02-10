import com.lib.Calculator;

/**
 * Created by sergey on 09.02.14.
 */
public class first {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        Calculator myCalc = new Calculator();
        myCalc.setName("Sergey");
        System.out.println(myCalc.getName());
        System.out.println(myCalc.getSum(20, 30));
    }
}
