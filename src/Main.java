import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        // FUNKCIJOS

        System.out.println("=========== 1 uzduotis=============");
        // 1.	Sukurkite Funkciją kuri priima du int tipo kintamuosius. Juos susumuoja ir atspausdina.

        sumNmb(3,5);


        System.out.println("=========== 2 uzduotis=============");

        // Sukurkite Funkciją kuri vadinasi PISq. Funkcija gražina double tipo reikšmę. Reikšmė yra : 9.8596;
        // Gautą reikšmę atspausdinkite.


        System.out.println( PISq() ); // spausdinam reiksme

        System.out.println("=========== 3 uzduotis=============");
        // Sukurkite Funkciją kuri priima du int tipo kintamuosius. Funkcija gražina skaičių sandaugą.;
        // Gautą reikšmę atspausdinkite.


        System.out.println(multipInt(3,5));

        System.out.println("=========== 4 uzduotis=============");

        // Sukurkite Funkciją kuri priima int[], prasuka ciklą ir atspausdina kiekvieną skaičių.

        int [] test4 = {1,2,5,6,7,6,9};
        arrayPrt(test4);

        System.out.println();

        System.out.println("=========== 5 uzduotis=============");
        // Sukurkite Funkciją kuri sugeneruotų 5-ių random int skaičių masyvą ir jį gražintų.
        // intervalą(min, max sugalvokite patys)

        int [] test5 = arrRandom();

        for (int i = 0; i < test5.length; i++) { // atspausdinu masyvo turini vienoje eiluteje su tarpais
            System.out.print(test5[i] + " ");
        }


        System.out.println();

        System.out.println("=========== 6 uzduotis=============");

        // Sukurkite Funkciją kuri panaudotų 5tos užduoties masyvą (priimtų kaip kintamąjį), susumuotų ir gražintų reikšmę.

        int result =  sumArr(test5);
        System.out.println(result);


        System.out.println("=========== 7 uzduotis=============");
        // Sukurkite Funkciją kuri priimtų 5tos užduoties masyvą ir gražintų jos skaičių vidurkį (double).

        double result7 = averageArr(test5);
        System.out.println(result7);

        System.out.println("=========== 8 uzduotis=============");
        // Sukurkite Funkciją kuri priimtų du int skaičius ir atspausdintų stačiakampį užpildytą žvaigždutėmis.
        // Pirmas int - išoriniam ciklui, antras vidiniam.

        square(15,15);

        System.out.println();

        System.out.println("=========== 9 uzduotis=============");
        // Sukurkite Funkciją kuri priimtų sakinį kaip kintamąjį ir atspausdintų kiek jame yra raidžių ir tarpų.
        // Sakinys - “Šiandien labai graži diena”. (kodas turi veikti padavus bet kokį sakinį)



        String txt9 = "Šiandien labai graži diena";
        countString(txt9);


        System.out.println("=========== 10 uzduotis=============");
        // Sukurkite Funkciją kuri priimtų sakinį, jį užkoduotų ir grąžintų. Kodavimas - sakinį apsukame iš kitos pusės.
        // Pvz “Naglis” turi gautis “silgaN”.


        String vardas = "Naglis";
        System.out.println(reverseString(vardas));



        //=============== End of the file

    }
    public static void sumNmb (int a, int b) {
        System.out.println(a+b);
    }

    public static double PISq () {
        double PISq = 9.8596;
        return PISq;
    }

    public static int multipInt (int a, int b){
        return (a*b);
    }

    public static void arrayPrt (int [] name){
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] + " ");
        }
    }


    public static int[] arrRandom () {
        int[] arrRandom = new int[5];
        Random randomNumb = new Random();
        for (int i = 0; i < arrRandom.length; i++) {
            arrRandom [i] = randomNumb.nextInt(5, 15); // uzpildo masyva atsitiktiniais skaiciais nuo 0 (isk) iki 15 (neisk)
        }
        return arrRandom;

    }

// Funkcija kuri panaudotų 5tos užduoties masyvą (priimtų kaip kintamąjį), susumuotų ir gražintų reikšmę.

    public static int sumArr (int[] name){
        int sum = 0;
        for (int i = 0; i < name.length; i++) {
            sum = sum + name[i];
        }
        return sum;
    }

// Funkciją kuri priimtų 5tos užduoties masyvą ir gražintų jos skaičių vidurkį (double). Sum = sum/number of elements

    public static double averageArr (int[] name) {
        int sum = 0;
        int count7 = 0;
        for (int i = 0; i < name.length; i++) {
            sum = sum + name[i];
            count7++;
        }
        return (sum/count7);
    }


    // Staciakampis

    public static void square (int a8,int b8) {
        for (int i = 0; i < a8; i++) {
            for (int j = 0; j < b8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


    // Sukurkite Funkciją kuri priimtų sakinį kaip kintamąjį ir atspausdintų kiek jame yra raidžių ir tarpų.


    public static void countString (String txt) {
        int textLength = txt.length();// teksto su tarpais ilgis
        String textNoSpace = txt.replace(" ", "");
        int textNoSpaceLength = textNoSpace.length();
        System.out.println("Tekste raidziu: " + textNoSpaceLength + " o, tarpu: " + (textLength - textNoSpaceLength));
    }

    // Funkciją kuri priimtų sakinį, jį užkoduotų ir grąžintų. Kodavimas - sakinį apsukame iš kitos pusės.

    public static String reverseString (String txt){
        txt = new StringBuilder(txt).reverse().toString();
        return txt;
    }




    //================ pabaiga

}