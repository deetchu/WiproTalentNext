import java.util.*;
public class Prime10To99
    public static void main(String[] args) {
        int x= 10, y=99;

        while (x < y) {
            boolean f= false;
	    for(int i = 2; i <= x/2; ++i) {
                if(x% i == 0) {
                    f= true;
                    break;
                }
            }

            if (!f && x != 0 && x != 1)
                System.out.print(x + " ");

            ++x;
        }
    }
}