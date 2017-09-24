/**
 * Created by chenglinwu on 22/09/2017.
 */
import java.util.*;
public class question3 {
    public long fibonacci(int K) {
        long a = 0;
        long b = 1;
        if (K <= 0) {
            return 0;
        }
        while (K > 1) {
            long temp = a + b;
            a = b;
            b = temp;
            K--;
            System.out.println(temp);
        }
        return b;
    }
}

