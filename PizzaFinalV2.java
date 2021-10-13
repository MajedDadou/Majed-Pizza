import java.util.Scanner;
// Tester Benjamin
public class PizzaFinalV2 {

    public static void main(String[] args) {
        //Price for the Pizza
        double pPrice = 0;

        System.out.println("-----------------------------------------------------------");
        System.out.println("Welcome to Pizza Ordering System, What can I get for you?");
        System.out.println("-----------------------------------------------------------\n\n\n");


        System.out.println("***********************************************************************\nTo Order Please Insert the number of the desired Pizza from the list\n***********************************************************************\n");

        System.out.println(" 1.   Karry Kylling Pizza:  Med tomat, ost, kyllingstrimler, majs, karrysauce og oregano.");
        System.out.println(" 2.   BBQ Kylling Pizza:  Med tomat, ost, kyllingstrimler, løg, BBQ sauce og oregano.");
        System.out.println(" 3.   Pommes: Pizza Kylling  Tomatsauce, ost, peberfrugt, løg, pommes frites, kylling");
        System.out.println(" 4.   Pommes: Pizza Kebab  Tomatsauce, ost, peberfrugt, løg, pommes frites, kebab");
        System.out.println(" 5.   Falafel: Pizza  Med tomatsauce, ost, falafel, tomatskiver, peberfrugt, champignon, løg, cremefraiche, mix max og oregano");
        System.out.println(" 6.   Margarita:  Med tomatsauce, ost og oregano");
        System.out.println(" 7.   Mozerilla:  Tomatsauce, ost, fetaost, sherrytomater");
        System.out.println(" 8.   Hawaii:  Tomatsauce, ost, kalkunskinke, ananas og oregano");
        System.out.println(" 9.   Napoli:  Tomatsauce, ost, kalkunskinke, rejer og oregano");
        System.out.println(" 10.  Pepperoni:  Tomatsauce, ost, pepperoni, tomatskiver, peberfrugt, hvidløg og oregano\n");

//Pizza Number
        Scanner Pizza = new Scanner(System.in);
        int pNumber = Pizza.nextInt();

        switch (pNumber) {

            case 1:
                System.out.println(" Great You Chose Nr 1 price is 125kr");
                pPrice = 125;
                break;
            case 2:
                System.out.println(" Great You Chose Nr 2 price is 155kr");
                pPrice = 155;
                break;
            case 3:
                System.out.println(" Great You Chose Nr 3 price is 100kr");
                pPrice = 100;
                break;
            case 4:
                System.out.println(" Great You Chose Nr 4 price is 40kr");
                pPrice = 40;
                break;
            case 5:
                System.out.println(" Great You Chose Nr 5 price is 45kr");
                pPrice = 45;
                break;

            case 6:
                System.out.println(" Great You Chose Nr 6 price is 75kr");
                pPrice = 75;
                break;
            case 7:
                System.out.println(" Great You Chose Nr 7 price is 85kr");
                pPrice = 85;
                break;
            case 8:
                System.out.println(" Great You Chose Nr 8 price is 60kr");
                pPrice = 60;
                break;
            case 9:
                System.out.println(" Great You Chose Nr 9 price is 144kr");
                pPrice = 144;
                break;
            case 10:
                System.out.println(" Great You Chose Nr 10 price is 199kr");
                pPrice = 199;
                break;

            default:
                System.out.println(" INVALID input please rerun");
                return;

        }
//Pizza Size
        System.out.println(" Please select the desired size\n Press: \n 1  for Child\n 2  for Standard\n 3  for Family");
        int pSize = Pizza.nextInt();
        switch (pSize){

            case 1:
                pPrice = pPrice * 0.75;
                System.out.println("Child Size Selected, current total price is "+pPrice);
                break;

            case 2:
                System.out.println("Standard Size Selected, current total price is "+pPrice);
                break;

            case 3:
                pPrice = pPrice * 1.5;
                System.out.println("Family Size Selected, current total price is "+pPrice);
                break;
            default:
                System.out.println(" INVALID input please rerun");
                return;
        }
        //Toppings
        System.out.println(" Please select the desired Topping, Extra Topping cost 15kr. \n Press: \n 1  for Extra Tasty Cheese\n 2  for Mushrooms\n 3  for Kalkun Kød\n 4  no Topping needed");
        int pTopping = Pizza.nextInt();
        switch (pTopping){
            case 1:
                pPrice = pPrice + 15;
                System.out.println("Extra Tasty Cheese :)");
                break;
            case 2:
                pPrice = pPrice + 15;
                System.out.println("Mushrooms :)");
                break;
            case 3:
                pPrice = pPrice + 15;
                System.out.println("Kalkun Kød :)");
                break;
            case 4:
                System.out.println("No topping");
                break;
            default:
                System.out.println(" INVALID input please rerun");
                return;

        }
        System.out.println("Order Confirmed,  \n\nreceipt will be Printed in a moment");
        System.out.println("You have ordered pizza Nr "+ pNumber+" and Size "+pSize+" and Topping "+pTopping +" the total price Now is "+pPrice+"kr Please Pay in the shop");
        System.out.println("\n***********************************************************************\nThanks For Shopping using our New Pizza Ordering System.              *\n***********************************************************************");


    }


}











