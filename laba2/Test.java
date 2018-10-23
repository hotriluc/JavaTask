public class Test {


    public static void main(String []args){

        //task1

        byte b = 1;
        short s = 2;
        int i = 0;
        long l = 40000000;
        float f = 2f;
        double d = 2.5;
        boolean bl = false ;
        char c = 'A';


        System.out.println("=====Printing with println=====\nThis byte variable ="+b);
        System.out.println("This short variable = "+s);
        System.out.println("This int variable = "+i);
        System.out.println("This long variable = "+l);
        System.out.println("This float variable = "+f);
        System.out.println("This double variable = "+d);
        System.out.println("This boolean variable = "+bl);
        System.out.println("This char variable = "+c+"\n");


        System.out.printf("=====Printting with printf=====\nThis byte variable = %d\nThis short variable",b,s);
        System.out.printf("This long variable = %d\nThis float variable = %f\n This double variable = %1.3f\n",l,f,d );
        System.out.printf("This boolean variable = %b\nThis float variable = %s\n",b,c );


        System.out.println("\n====Converting====");
        System.out.printf("HEX FORMAT\nfor byte variable = %s" +
                        "\nshort variable = %s\nint variable = %s\nlong variable = %s"
                ,Integer.toHexString(b),Integer.toHexString(s),Integer.toHexString(i),Long.toHexString(l));
    }
}
