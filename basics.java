public class basics
{
    public static void main(String[] args){
        System.out.println("Hello World!");
        System.out.println("I am learning Java.");
        //System.out.println("It is awesome!");
        System.out.println(50000 + 10);
        
        //Variables
        //int tre = 45630;
        short sh = 42;
        //char character = 'c';
        //float floating = 3.14;
        //boolean bool =true;

        //chaine de caracteres incluant une tabulation
        String str = "Formation\tJava";

        System.out.println(str);

        //short test = null;


        //exmple d'operations

        short n1 =2;
        short n2 =8;
        int result = n1 + n2;
        System.out.println(result);
        System.out.println("age:" + sh); //concatenation


        int x, y, z;
        x = y = z = 50;
        y = 10;
        System.out.println(x + y + z);

        //explicit casting
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9

        int accu = 4;
        accu += 2 ;
        System.out.println(accu);

        //Boolean bool_test = 4 > 3;

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        if (true) {
            // block of code to be executed if the condition is true
            System.out.println("il est vrai que est vrai");
          }


          int day = 4;
            switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            }
            // Outputs "Thursday" (day 4)

            //iteration
            int u = 0;
            while (u < 5) {
              System.out.println(u);
              u++;
            }

            //for loop
            for (int j = 0; j < 5; j++) {
                System.out.println(j);
              }



              String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
                for (String car : cars) {
                System.out.println(car);
                }
            
                for (int k = 0; k < 10; k++) {
                    if (k == 4) {
                      break;
                    }
                    System.out.println(k);
                  }
                  
                  
    int[] myNum = {10, 20, 30, 40};
    for(int n : myNum){
        System.out.println(n * n);
    }

    // positionnal args
    
    String arg1 = args[0];
    System.out.println("arg1: " + arg1);



            








        




    }
}