import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit = 0;
        boolean done = false;
        String trash = "";

        System.out.println("Now running Fahrenheit to Celsius Calculator");
        do {
            System.out.print("Input the temperature in celsius that you wish to convert to fahrenheit: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                celsius = celsius * 1.8;
                fahrenheit = celsius + 32;
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You input " + trash + " for the temperature in celsius");
                System.out.println("Please enter a valid number!");
            }
        }
        while (!done);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        FuelCost(args); //calls next program
    }

    public static void FuelCost(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double mpg = 0;
        double pricePerGal = 0;
        double costPer100 = 0;
        double carGoMiles = 0;
        String trash = "";
        boolean donegal = false;
        boolean doneMpg = false;
        boolean donePPG = false;

        System.out.println("Now running Fuel Cost");

        do {
            System.out.print("Input the number of gallons currently in your gas tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                donegal = true;
            } else {
                trash = in.nextLine();
                System.out.println("You input " + trash + " for the gallons in your tank");
                System.out.println("Please enter a valid number!");
            }
        }
        while (!donegal);

        do {
            System.out.print("Input the number miles you get per gallon: ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine();
                doneMpg = true;
            } else {
                trash = in.nextLine();
                System.out.println("You input " + trash + " for the miles per gallon");
                System.out.println("Please enter a valid number!");
            }
        }
        while (!doneMpg);

        do {
            System.out.print("Input the price per gallon of gas: ");
            if (in.hasNextDouble()) {
                pricePerGal = in.nextDouble();
                in.nextLine();
                donePPG = true;
            } else {
                trash = in.nextLine();
                System.out.println("You input " + trash + " for the price per gallon");
                System.out.println("Please enter a valid number!");
            }
        }
        while (!donePPG);
        costPer100 = (pricePerGal / mpg) * 100;
        System.out.println("The cost to drive 100 miles is: $" + costPer100);
        carGoMiles = gallons * mpg;
        System.out.println("You can go " + carGoMiles + " miles with your current tank");
        RectangleInfo(args);
    }
    public static void RectangleInfo(String[] args) {
        Scanner in = new Scanner(System.in);
        double length = 0;
        double width = 0;
        double area = 0;
        double per = 0;
        double diag = 0;
        boolean doneLen = false;
        boolean doneWid = false;
        String trash = "";

        System.out.println("Now running Rectangle Info");

        do {
            System.out.print("Input the length of the rectangle: ");
            if (in.hasNextDouble()) {
                length = in.nextDouble();
                in.nextLine();
                doneLen = true;
            } else {
                trash = in.nextLine();
                System.out.println("You input " + trash + " for the length");
                System.out.println("Please enter a valid number!");
            }
        }
        while (!doneLen);

        do {
            System.out.print("Input the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                doneWid = true;
            } else {
                trash = in.nextLine();
                System.out.println("You input " + trash + " for the width");
                System.out.println("Please enter a valid number!");
            }
        }
        while (!doneWid);
        area = length * width;
        System.out.println("The area of this rectangle is: " + area);
        per = length + length + width + width;
        System.out.println("The perimeter of this rectangle is: " + per);
        diag = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
        System.out.println("The length of the diagonal of this rectangle is: " + diag);
        MetricConverter(args);
    }
    public static void MetricConverter(String[] args){
        Scanner in = new Scanner(System.in);
        double meters = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;
        boolean donemet = false;
        String trash = "";

        System.out.println("Now running Metric Converter");

        do {
            System.out.print("Input the number of meters you would like to convert to the imperial system: ");
            if (in.hasNextDouble()) {
                meters = in.nextDouble();
                in.nextLine();
                donemet = true;
            } else {
                trash = in.nextLine();
                System.out.println("You input " + trash + " for the number of meters");
                System.out.println("Please enter a valid number!");
            }
        }
        while (!donemet);
        feet = meters * 3.28084;
        inches = feet * 12;
        miles = feet / 5280;
        System.out.println(meters + " meters is " + feet + " feet");
        System.out.println(meters + " meters is " + inches + " inches");
        System.out.println(meters + " meters is " + miles + " miles");
    }
}