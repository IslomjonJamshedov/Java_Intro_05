package homeworks;

import java.util.*;

public class Homework07 {
    public static void main(String[] args) {

        System.out.println("\n----------TASK-1------------\n");

        ArrayList<Integer> num1 = new ArrayList<>();

        num1.add(10);
        num1.add(23);
        num1.add(67);
        num1.add(23);
        num1.add(78);

        System.out.println(num1.get(3));
        System.out.println(num1.get(0));
        System.out.println(num1.get(2));
        System.out.println(num1);

        System.out.println("\n----------TASK-2------------\n");

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Brown");
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Purple");

        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);


        System.out.println("\n----------TASK-3------------\n");

        ArrayList<Integer> num2 = new ArrayList<>();

        num2.add(23);
        num2.add(-34);
        num2.add(-56);
        num2.add(0);
        num2.add(89);
        num2.add(100);

        System.out.println(num2);
        Collections.sort(num2);
        System.out.println(num2);

        System.out.println("\n----------TASK-4------------\n");

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Paris");

        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);

        System.out.println("\n----------TASK-5------------\n");

        ArrayList<String> characters = new ArrayList<>();

        characters.add("Spider Man");
        characters.add("Iron Man");
        characters.add("Black Panther");
        characters.add("Deadpool");
        characters.add("Captain America");


        System.out.println(characters);
        System.out.println(characters.contains("Wolwerine"));

        System.out.println("\n----------TASK-6------------\n");

        ArrayList<String> Avengers = new ArrayList<>();

        Avengers.add("Black Widow");
        Avengers.add("Captain America");
        Avengers.add("Hulk");
        Avengers.add("Iron Man");

        Collections.sort(Avengers);
        System.out.println(Avengers);

        for (int i = 0; i < Avengers.size(); i++) {
            if (colors.get(i).contains("Hulk") && colors.get(i).contains("Iron Man")){
            }else System.out.println("false");
        }System.out.println("true");

        System.out.println("\n----------TASK-7------------\n");

        ArrayList<Character> chars = new ArrayList<>();

        chars.add('A');
        chars.add('x');
        chars.add('$');
        chars.add('%');
        chars.add('9');
        chars.add('*');
        chars.add('+');
        chars.add('F');
        chars.add('G');

        System.out.println(chars);

        for (int i = 0; i < chars.size(); i++) {
            System.out.println(chars.get(i));
        }

        System.out.println("\n----------TASK-8------------\n");

        ArrayList<String> objects = new ArrayList<>(Arrays.asList("Desk", "Laptop", "Mouse", "Monitor",
                "Mouse-Pad", "Adapter"));

        int countM = 0;
        int count2 = 0;

        for (int i = 0; i < objects.size(); i++) {
            if (objects.get(i).toLowerCase().contains("m")){
                countM++;
            } else if (objects.get(i).toLowerCase().contains("a") && objects.get(i).toLowerCase().contains("e")) {
                count2++;
            }
        }
        System.out.println(objects);
        Collections.sort(objects);
        System.out.println(objects);

        System.out.println(countM);
        System.out.println(count2);

        System.out.println("\n----------TASK-9------------\n");

        ArrayList<String> kitchen = new ArrayList<>(Arrays.asList("Plate", "spoon", "fork", "Knife", "cup", "Mixer"));

        int upperC = 0;
        int lower = 0;
        int hasP = 0;
        int endsP = 0;

        for (int i = 0; i < kitchen.size(); i++) {

            if (Character.isUpperCase(kitchen.get(i).charAt(0))) {
                upperC++;
            } if (Character.isUpperCase(kitchen.get(i).charAt(0))){
                lower++;
            }
            if (kitchen.get(i).toLowerCase().contains("p")) {
                hasP++;
            }   if (kitchen.get(i).toLowerCase().startsWith("p") || kitchen.get(i).toLowerCase().endsWith("p")){
                endsP++;
            }
        }

        System.out.println("Elements starts with uppercase = " + upperC);
        System.out.println("Elements starts with lowercase = " + lower);
        System.out.println("Elements having P or p = " + hasP);
        System.out.println("Elements starting or ending with P or p = " + endsP);

        System.out.println("\n----------TASK-10------------\n");


        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3,5,7,10,0,20,17,10,23,56,78));

        System.out.println(nums);
        System.out.println("Elements that can be divided by 10 = " + nums.stream().filter(x -> x % 10 == 0).count());
        System.out.println("Elements that are even and greater than = " + nums.stream().filter(x -> x > 15 & x % 2 == 0).count());
        System.out.println("Elements that are odd and less than 20 = " + nums.stream().filter(x -> x < 20 & x % 2 == 1).count());
        System.out.println("Elements that less than 15 or greater than 50 = " + nums.stream().filter(x -> x < 15 | x > 50).count());


    }
}
