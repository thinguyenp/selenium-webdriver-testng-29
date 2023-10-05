package javaTester;

import java.util.Random;

public class Topic_03_Random {
    //Java builtin ( cc san, lay ra su dung)
    // Java libraries ( do ca nhan, to chu viet ra)

    public static void main (String [] args)
    {
        Random rand= new Random();
        System.out.println(rand.nextInt(99999));
        System.out.println(rand.nextInt(99999));
        System.out.println(rand.nextInt(99999));
        System.out.println("automation" + rand.nextInt(9999)+"@gmail.com");
    }
}
