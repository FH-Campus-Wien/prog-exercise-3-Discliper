package at.ac.fhcampuswien;

public class App {

    // Implement all methods as public static
    public static void oneMonthCalendar(int Monthdays, int Weekdays){              //https://www.w3schools.com/java/java_methods_param.asp

        int g=1;

        for (int i=0;i<5;i++){
            for (int j=0;j<7;j++) {
                //----------------------------------------------formatting
                if (j < Weekdays-1 && i == 0){
                    System.out.print("   ");
                }else if(g < 9 && i <= 1){
                    System.out.print(" "+ g++ + " ");
                }else if (g >= 10 && j == 0){
                    System.out.print(g++);
                }else if (g >= 9 && j == 6) {
                    System.out.print(" " + g++ + " ");
                }else {
                    System.out.print(" "+ g++);
                }
                //----------------------------------------------
                if (g == Monthdays+1 && j != 6){
                    System.out.print(" ");
                    break;
                }
                //----------------------------------------------ending with a breakpoint
            }
            System.out.println();
        }
    }

    public static int checkDigit(int[] input){
        //Array mit Werte 0 und 9
        //Prüfziffer als INT ausgeben
        //---------------------------
        //Jede Ziffer = Position Array + 2
        //Das dann aufsummieren
        //Summe / 11 und Rest speichern
        //Differenz = 11 - Rest = Prüfz
        //--------------------------
        //Wenn Differenz = 10 dann Prüfz. 0
        //Wenn Differenz = 11 dann Prüfz. 5

        int Prufziffer;
        int Summe = 0;
        int Rest;

        for (int i=0;i<input.length;i++){
            Summe = Summe + (i+2) * input[i];
        }

        Rest = Summe % 11;
        Prufziffer = 11 - Rest;

        if(Prufziffer == 10){
            Prufziffer = 0;
        } else if (Prufziffer == 11) {
            Prufziffer = 5;
        }

        return Prufziffer;
    }

    public static boolean swapArrays(int[] Array1, int[] Array2){

                                                                    //https://www.codespeedy.com/swap-two-elements-in-an-array-in-java/
        if(Array1.length == Array2.length) {
            int[] temp = new int[Array1.length];

            for (int i = 0; i < Array1.length; i++) {
                temp[i] = Array1[i];
                Array1[i] = Array2[i];
                Array2[i] = temp[i];
            }
            return true;
        }else {
            return false;
        }
    }
    static public void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.

        int[] input = {3, 9, 1, 5, 8};
        int[] Array1 = {1,2,3,4,5};
        int[] Array2 = {100,99,60,44,2};

        oneMonthCalendar(31,3);
        checkDigit(input);
        swapArrays(Array1,Array2);
    }
}

