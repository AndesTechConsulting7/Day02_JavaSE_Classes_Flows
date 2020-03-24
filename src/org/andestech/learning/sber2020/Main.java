package org.andestech.learning.sber2020;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int N = 9;
        for (int i = 0; i < N ; i++) {
            //..
            if(i%2 != 0) continue;
            System.out.print("i="+i+", ");
            //..
            //..
        }
        System.out.print("\b\b.\n");

        for (int i = 0; i < N ; i++) {
            //..
            if(i%2 == 0) {
                System.out.print("i=" + i + ( (i>=N-2)?"." : ", ") ) ;
                //..
                //..
            }
        }
        //System.out.print("\b\b.\n");
        // (boolean)?(true result):(false result)   // ternary if instruction
        System.out.println();
        boolean flag = true;
        System.out.println("Hello, " + (!flag?"Trainer!":"Student!"));

        double profit=1;
        if(flag) profit = 1.01; else profit = 1.02;
        double res2 = 20.0 * profit;

        double res = 20.0 * (flag?1.01:1.02);
        System.out.println("res="+ res);

        //labels
        block2: {
        block1: {
            System.out.println("block1");
            int a = 12;
            int res3 = 12;
            if(a==12) break block2;

        }
            System.out.println("block2");
        }



      outer:  for (int i = 0; i < 9; i++) {
            //...
         middle:   for (int j = 0; j <9 ; j++) {
                //..
                for (int k = 0; k <9 ; k++) {
                    //....
                    if(k*j*i == 8*7*4)
                    {
                        //System.out.println("+++ Found!!");
                        System.out.printf("+++ Found, i=%d, j=%d, k=%d\n",i,j,k);
                        break middle;

                    }

                }

            }
        }



    }
}
