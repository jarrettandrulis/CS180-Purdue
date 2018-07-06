import java.util.Scanner;
/**
 * CS180 - Lab 05
 *
 * Restaurant class , used to recommend a restaurant based off of one's preferences
 *
 * @author Jarrett Andrulis, jandruli@purdue.edu, section B09
 *
 * @version 09/20/16
 */
public class Restaurant {
    public static final String ON_CAMPUS_VEGAN = "Purdue Dining Courts\nFlatbreads";
    public static final String ON_CAMPUS_VEGETARIAN = ON_CAMPUS_VEGAN + "\nOasis Cafe\nAh*Z\nFreshens";
    public static final String ON_CAMPUS_GLUTEN_FREE = "Purdue Dining Courts\nFlatbreads\nOasis Cafe\nPappy's " +
            "Sweet Shop";
    public static final String ON_CAMPUS_BURGERS = "Pappy's Sweet Shop\nCary Knight Spot";
    public static final String ON_CAMPUS_SANDWICHES = "Flatbreads\nOasis Cafe\nErbert & Gerbert's";
    public static final String ON_CAMPUS_OTHERS = "Purdue Dining Courts\nAh*Z\nFreshens\nLemongrass";
    public static final String ON_CAMPUS_ALL = ON_CAMPUS_BURGERS + "\n" + ON_CAMPUS_SANDWICHES + "\n" +
            ON_CAMPUS_OTHERS;

    // Off campus
    public static final String OFF_CAMPUS_VEGAN = "Chipotle\nQdoba\nNine Irish Brothers\nFive Guys\n Puccini's " +
            "Smiling Teeth\nPanera Bread";
    public static final String OFF_CAMPUS_VEGETARIAN = OFF_CAMPUS_VEGAN + "\nWendy's\nBruno's Pizza\nJimmy " +
            "John's\nPotbelly Sandwich Shop\nBasil Thai\nIndia Mahal";
    public static final String OFF_CAMPUS_GLUTEN_FREE = "Chipotle\nQdoba\nNine Irish Brothers\nPuccini's Smiling " +
            "Teeth\nWendy's\nScotty's Brewhouse\nPanera Bread\nBasil Thai";
    public static final String OFF_CAMPUS_BURGERS = "Five Guys\nWendy's\nTriple XXX\nScotty's Brewhouse";
    public static final String OFF_CAMPUS_SANDWICHES ="Panera Bread\nJimmy John's\nPotbelly Sandwich Shop";
    public static final String OFF_CAMPUS_PIZZAS = "Puccini's Smiling Teeth\nMad Mushroom Pizza\nBruno's Pizza\n";
    public static final String OFF_CAMPUS_OTHERS = "Chipotle\nQdoba\nNine Irish Brothers\nFamous Frank's\n Von's " +
            "Dough Shack\nBuffalo Wild Wings\nBasil Thai\nMaru Sushi\nIndia Mahal\nHappy China\nYori";
    public static final String offCampusAll = OFF_CAMPUS_BURGERS + "\n" + OFF_CAMPUS_SANDWICHES + "\n" +
            OFF_CAMPUS_PIZZAS + OFF_CAMPUS_OTHERS;

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Type '1' for on campus and '2' for off campus");
        String campus = input.next(); //On campus or no
        System.out.println("Type 'Y' if you have dietary restrictions and 'N' if you don't");
        String restrictions = input.next(); //Dietary restrictions or not
        if(restrictions.toUpperCase().equals("Y") )
        {
            System.out.println("Type '1' for Vegan, '2' for Vegetarian, and '3' for Gluten-Free");
            restrictions = input.next();
            if(campus.equals("1")) {
                switch (restrictions) {
                    case "1":
                        System.out.println(ON_CAMPUS_VEGAN);
                        break;
                    case "2":
                        System.out.println(ON_CAMPUS_VEGETARIAN);
                        break;
                    case "3":
                        System.out.println(ON_CAMPUS_GLUTEN_FREE);
                        break;
                }
            }
            else if(campus.equals("2")) {
                switch (restrictions) {
                    case "1":
                        System.out.println(OFF_CAMPUS_VEGAN);
                        break;
                    case "2":
                        System.out.println(OFF_CAMPUS_VEGETARIAN);
                        break;
                    case "3":
                        System.out.println(OFF_CAMPUS_GLUTEN_FREE);
                        break;
                }
            }

        }
        else if(restrictions.toUpperCase().equals("N"))
        {
            System.out.println("Type 'Y' if you have a food preference and 'N' if you don't");
            String foodpref = input.next();
            if(foodpref.toUpperCase().equals("Y")) {
                System.out.println("Type '1' for Burgers, '2' for Sandwiches, and '3' for Other");
                restrictions = input.next();
                if (campus.equals("1")) {
                    switch (restrictions) {
                        case "1":
                            System.out.println(ON_CAMPUS_BURGERS);
                            break;
                        case "2":
                            System.out.println(ON_CAMPUS_SANDWICHES);
                            break;
                        case "3":
                            System.out.println(ON_CAMPUS_OTHERS);
                            break;
                    }
                } else if (campus.equals("2")) {
                    switch (restrictions) {
                        case "1":
                            System.out.println(OFF_CAMPUS_BURGERS);
                            break;
                        case "2":
                            System.out.println(OFF_CAMPUS_SANDWICHES);
                            break;
                        case "3":
                            System.out.println(OFF_CAMPUS_OTHERS);
                            break;
                    }
                }
            }
            else if(foodpref.toUpperCase().equals("N"))
            {
                if (campus.equals("1"))
                    System.out.println("On Campus All");
                else if(campus.equals("2"))
                    System.out.println("Off Campus All");
            }
        }
    }
}
