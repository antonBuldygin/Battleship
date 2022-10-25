package battleship;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static boolean checkWhenNumbersEquel(int num1, int num2, char l1, char l2, char[][] array) {

        if (num1 != 1 && num2 != 10) {

            if (l1 != 'A' && l2 != 'J') {
                for (int i = l1; i <= l2; i++) {
                    if (array[i - 65][num1 - 1] == 'O' || array[i - 65][num1 - 2] == 'O' || array[i - 65][num1] == 'O') {
                        return false;
                    }
                }
                if (array[l2 - 65 + 1][num1 - 1] == 'O' || array[l2 - 65 + 1][num1 - 2] == 'O' || array[l2 - 65 + 1][num1] == 'O') {
                    return false;
                }
                if (array[l1 - 65 - 1][num1 - 1] == 'O' || array[l1 - 65 - 1][num1 - 2] == 'O' || array[l1 - 65 - 1][num1] == 'O') {
                    return false;
                }
            }
            if (l1 != 'A' && l2 == 'J') {
                for (int i = l1; i <= l2; i++) {
                    if (array[i - 65][num1 - 1] == 'O' || array[i - 65][num1 - 2] == 'O' || array[i - 65][num1] == 'O') {
                        return false;
                    }
                }

                if (array[l1 - 65 - 1][num1 - 1] == 'O' || array[l1 - 65 - 1][num1 - 2] == 'O' || array[l1 - 65 - 1][num1] == 'O') {
                    return false;
                }
            }
            if (l1 == 'A' && l2 != 'J') {
                for (int i = l1; i <= l2; i++) {
                    if (array[i - 65][num1 - 1] == 'O' || array[i - 65][num1 - 2] == 'O' || array[i - 65][num1] == 'O') {
                        return false;
                    }
                }
                if (array[l2 - 65 + 1][num1 - 1] == 'O' || array[l2 - 65 + 1][num1 - 2] == 'O' || array[l2 - 65 + 1][num1] == 'O') {
                    return false;
                }
            }
        }

        if (num1 == 1 && l1 != 'A' && l2 != 'J') {
            for (int i = l1; i <= l2; i++) {
                if (array[i - 65][num1 - 1] == 'O' || array[i - 65][num1] == 'O') {
                    return false;
                }
            }
            if (array[l2 - 65 + 1][num1 - 1] == 'O' || array[l2 - 65 + 1][num1] == 'O') {
                return false;
            }
            if (array[l1 - 65 - 1][num1 - 1] == 'O' || array[l1 - 65 - 1][num1] == 'O') {
                return false;
            }
        }

        if (num1 == 1 && l1 != 'A' && l2 == 'J') {
            for (int i = l1; i <= l2; i++) {
                if (array[i - 65][num1 - 1] == 'O' || array[i - 65][num1] == 'O') {
                    return false;
                }
            }

            if (array[l1 - 65 - 1][num1 - 1] == 'O' || array[l1 - 65 - 1][num1] == 'O') {
                return false;
            }

        }

        if (num1 == 1 && l1 == 'A' && l2 != 'J') {
            for (int i = l1; i <= l2; i++) {
                if (array[i - 65][num1 - 1] == 'O' || array[i - 65][num1] == 'O') {
                    return false;
                }
            }
            if (array[l2 - 65 + 1][num1 - 1] == 'O' || array[l2 - 65 + 1][num1] == 'O') {
                return false;
            }

        }

        if (num2 == 10 && l1 != 'A' && l2 != 'J') {

            for (int i = l1; i <= l2; i++) {
                if (array[i - 65][num1 - 1] == 'O' || array[i - 65][num1 - 2] == 'O') {
                    return false;
                }
            }
            if (array[l2 - 65 + 1][num1 - 1] == 'O' || array[l2 - 65 + 1][num1 - 2] == 'O') {
                return false;
            }
            if (array[l1 - 65 - 1][num1 - 1] == 'O' || array[l1 - 65 - 1][num1 - 2] == 'O') {
                return false;
            }
        }

        if (num2 == 10 && l1 == 'A' && l2 != 'J') {

            for (int i = l1; i <= l2; i++) {
                if (array[i - 65][num1 - 1] == 'O' || array[i - 65][num1 - 2] == 'O') {
                    return false;
                }
            }
            if (array[l2 - 65 + 1][num1 - 1] == 'O' || array[l2 - 65 + 1][num1 - 2] == 'O') {
                return false;
            }

        }
        if (num2 == 10 && l1 != 'A' && l2 == 'J') {

            for (int i = l1; i <= l2; i++) {
                if (array[i - 65][num1 - 1] == 'O' || array[i - 65][num1 - 2] == 'O') {
                    return false;
                }
            }

            if (array[l1 - 65 - 1][num1 - 1] == 'O' || array[l1 - 65 - 1][num1 - 2] == 'O') {
                return false;
            }
        }
        return true;

    }

    public static boolean checkWhenLettersEquel(int num1, int num2, char l1, char l2, char[][] array) {

        if (num1 != 1 && num2 != 10) {

            if (l1 != 'A' && l2 != 'J') {
                for (int i = num1; i <= num2; i++) {
                    if (array[l1 - 65][i - 1] == 'O' || array[l1 - 65 + 1][i - 1] == 'O' || array[l1 - 65 - 1][i - 1] == 'O') {
                        return false;
                    }
                }
                if (array[l2 - 65 + 1][num1 - 2] == 'O' || array[l2 - 65 - 1][num1 - 2] == 'O' || array[l2 - 65][num1 - 2] == 'O') {
                    return false;
                }
                if (array[l2 - 65 + 1][num2] == 'O' || array[l2 - 65 - 1][num2] == 'O' || array[l2 - 65][num2] == 'O') {
                    return false;
                }
            }
            if (l2 == 'J') {
                for (int i = num1; i <= num2; i++) {
                    if (array[l2 - 65][i - 1] == 'O' || array[l2 - 65 - 1][i - 1] == 'O') {
                        return false;
                    }
                }

                if (array[l2 - 65 - 1][num1 - 2] == 'O' || array[l2 - 65][num1 - 2] == 'O') {
                    return false;
                }
                if (array[l2 - 65 - 1][num2] == 'O' || array[l2 - 65][num2] == 'O') {
                    return false;
                }
            }
            if (l1 == 'A') {
                for (int i = num1; i <= num2; i++) {
                    if (array[l1 - 65][i - 1] == 'O'
                            || array[(l1 - 65) + 1][i - 1] == 'O') {
                        return false;
                    }
                }
                if (array[l1 - 65 + 1][num1 - 2] == 'O' || array[l2 - 65][num1 - 2] == 'O') {
                    return false;
                }
                if (array[l1 - 65 + 1][num2] == 'O' || array[l2 - 65][num2] == 'O') {
                    return false;
                }
            }
        }
// ship is laying on the edge 1
        if (num1 == 1 && l1 != 'A' && l2 != 'J') {
            for (int i = num1; i <= num2; i++) {
                if (array[l1 - 65][i - 1] == 'O' || array[l1 - 65 + 1][i - 1] == 'O' || array[l1 - 65 - 1][i - 1] == 'O') {
                    return false;
                }
            }
//            if (array[l2 - 65 + 1][num1 - 1] == 'O' || array[l2 - 65 - 1][num1 - 1] == 'O' || array[l2 - 65][num1 - 1] == 'O') {
//                return false;
//            }
            if (array[l2 - 65 + 1][num2] == 'O' || array[l2 - 65 - 1][num2] == 'O' || array[l2 - 65][num2] == 'O') {
                return false;
            }
        }

        if (num1 == 1 && l1 != 'A' && l2 == 'J') {
            for (int i = num1; i <= num2; i++) {
                if (array[l1 - 65][i - 1] == 'O' || array[l1 - 65 - 1][i - 1] == 'O') {
                    return false;
                }
            }

            if (array[l2 - 65 - 1][num2] == 'O' || array[l2 - 65][num2] == 'O') {
                return false;
            }

        }

        if (num1 == 1 && l1 == 'A' && l2 != 'J') {
            for (int i = num1; i <= num2; i++) {
                if (array[l1 - 65][i - 1] == 'O' || array[l1 - 65 + 1][i - 1] == 'O') {
                    return false;
                }
            }
            if (array[l2 - 65 + 1][num2] == 'O' || array[l2 - 65][num2] == 'O') {
                return false;
            }

        }
// ship is laying on the edge 10
        if (num2 == 10 && l1 != 'A' && l2 != 'J') {

            for (int i = l1; i <= l2; i++) {
                if (array[i - 65][num1 - 1] == 'O' || array[i - 65][num1 - 2] == 'O') {
                    return false;
                }
            }
            if (array[l2 - 65 + 1][num1 - 1] == 'O' || array[l2 - 65 + 1][num1 - 2] == 'O') {
                return false;
            }
            if (array[l1 - 65 - 1][num1 - 1] == 'O' || array[l1 - 65 - 1][num1 - 2] == 'O') {
                return false;
            }
        }

        if (num2 == 10 && l1 == 'A' && l2 != 'J') {

            for (int i = num1; i <= num2; i++) {
                if (array[l1 - 65][i - 1] == 'O' || array[l1 - 65 + 1][i - 1] == 'O') {
                    return false;
                }
            }
            if (array[l2 - 65 + 1][num1 - 2] == 'O' || array[l2 - 65][num1 - 2] == 'O') {
                return false;
            }

        }
        if (num2 == 10 && l1 != 'A' && l2 == 'J') {

            for (int i = num1; i <= num2; i++) {
                if (array[l1 - 65][i - 1] == 'O' || array[l1 - 65 - 1][i - 1] == 'O') {
                    return false;
                }
            }
            if (array[l2 - 65 - 1][num1 - 2] == 'O' || array[l2 - 65][num1 - 2] == 'O') {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {

        // Write your code here
        char[][] array = getChars();
        char[][] fog = getChars();
        char[][] array1 = getChars();
        char[][] fog1 = getChars();

        boolean person1 = true;
        boolean person2 = true;

        System.out.println("Player 1, place your ships on the game field\n");
        printThefield(array);
        System.out.println();
        //fillTheships
        fillTheships(array);

        System.out.println("Press Enter and pass the move to another player\n");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("Player 2, place your ships to the game field\n");

        printThefield(array1);
        System.out.println();
        fillTheships1(array1);
        // GAME
        System.out.println("Press Enter and pass the move to another player\n");


        while (true) {
            if (person1 ) {
                scanner.nextLine();
                printThefield(fog1);
                System.out.println("---------------------");
                printThefield(array);
                System.out.println();
                System.out.print("Player 1, it's your turn:");
                person1 = game(array1, fog1, 1);
                person2= true;
            }
            if (!person1) {
                scanner.nextLine();

                printThefield(fog);
                System.out.println("---------------------");
                printThefield(array1);
                System.out.println();

                System.out.print("Player 2, it's your turn:");
                person2 = game(array, fog, 1);
                person1 = true;
            }

        }

    }

    private static char[][] getChars() {
        char[][] array = new char[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = '~';
            }
        }
        return array;
    }


    private static boolean game(char[][] array, char[][] fog, int i) {
        boolean flag1 = true;
        String first = null;
        Integer number1 = null;
        char letter1 = 'z';
        Scanner scanner = new Scanner(System.in);
//        System.out.println("The game starts!");
        System.out.println();
//        printThefield(fog);
//        System.out.println();
        while (flag1) {

//            System.out.println("Take a shot!");
            System.out.println();
            first = scanner.next();


            number1 = Integer.parseInt(Arrays.stream(first.split("\\D")).filter(x -> !x.equals("")).findAny().get());
            letter1 = Arrays.stream(first.split("\\d")).filter(x -> !x.equals("")).findAny().get().charAt(0);

            if (letter1 <= 'J' && letter1 >= 'A' && number1 >= 1 && number1 <= 10) {
                if (array[letter1 - 65][number1 - 1] == 'O' || array[letter1 - 65][number1 - 1] == 'X') {
                    array[letter1 - 65][number1 - 1] = 'X';
                    fog[letter1 - 65][number1 - 1] = 'X';
//                    printThefield(fog);
//                    System.out.println();

                    if (i == 1) {
                        if (lastShipSank()) {
                            System.out.println("You sank the last ship. You won. Congratulations!");
//                        printThefield(array);
                            break;
                        } else {
                            if (shipSank(letter1, number1)) {
                                if (lastShipSank()) {
                                    System.out.println("You sank the last ship. You won. Congratulations!");
//                                printThefield(array);
                                    break;
                                } else {
                                    System.out.println("You sank a ship!\n" +
                                            "Press Enter and pass the move to another player\n" +
                                            "...");
                                    return false;
                                }
                            } else {
                                System.out.println("You hit a ship!\n" +
                                        "Press Enter and pass the move to another player\n" +
                                        "...");

                                return false;
                            }
                        }

                    }

                    if (i == 2) {
                        if (lastShipSank1()) {
                            System.out.println("You sank the last ship. You won. Congratulations!");
//                        printThefield(array);
                            break;
                        } else {
                            if (shipSank1(letter1, number1)) {
                                if (lastShipSank1()) {
                                    System.out.println("You sank the last ship. You won. Congratulations!");
//                                printThefield(array);
                                    break;
                                } else {
                                    System.out.println("You sank a ship!\n" +
                                            "Press Enter and pass the move to another player\n" +
                                            "...");
                                    return false;
                                }
                            } else {
                                System.out.println("You hit a ship!\n" +
                                        "Press Enter and pass the move to another player\n" +
                                        "...");

                                return false;
                            }
                        }


                    }

//                    printThefield(array);
//                    System.out.println();

                } else {
//                    if (shipSank(letter1, number1)) {
//                        System.out.println("You sank a ship! Specify a new target:");
//                    }
                    array[letter1 - 65][number1 - 1] = 'M';
                    fog[letter1 - 65][number1 - 1] = 'M';
//                    printThefield(fog);
                    System.out.println();
                    System.out.println("You missed!\n" +
                            "Press Enter and pass the move to another player\n" +
                            "...");

//                    printThefield(array);
                    System.out.println();
                    return false;

                }
            } else {
                System.out.println("Error! You entered the wrong coordinates! Try again:\n");
            }
        }
        return true;
    }

    private static void fillTheships(char[][] array) {
        for (Ships ships : Ships.values()) {
            String first = null;
            String second = null;
            Integer number1 = null;
            Integer number2 = null;
            char letter1 = '0';
            char letter2 = '0';
            boolean flag = true;
            Scanner scanner = new Scanner(System.in);

            System.out.printf("Enter the coordinates of the  %s  (%s cells):\n", ships.getShip(), ships.getCells());
            while (flag) {


                first = scanner.next();
                second = scanner.next();


                number1 = Integer.parseInt(Arrays.stream(first.split("\\D")).filter(x -> !x.equals("")).findAny().get());
                letter1 = Arrays.stream(first.split("\\d")).filter(x -> !x.equals("")).findAny().get().charAt(0);
                number2 = Integer.parseInt(Arrays.stream(second.split("\\D")).filter(x -> !x.equals("")).findAny().get());
                letter2 = Arrays.stream(second.split("\\d")).filter(x -> !x.equals("")).findAny().get().charAt(0);

                //Horizontalships
                if (letter2 == letter1) {
                    if ((Math.abs(number2 - number1) - ships.cells) != -1) {

                        System.out.printf("Error! Wrong length of the %s! Try again:\n", ships.getShip());
                        flag = true;
                    } else flag = false;

                    if (number2 > number1 && flag == false) {
                        if (!Main.checkWhenLettersEquel(number1, number2, letter1, letter2, array)) {
                            System.out.println("Error! You placed it too close to another one. Try again:");
                            flag = true;

                        } else {
                            for (int i = number1; i <= number2; i++) {

                                array[letter1 - 65][i - 1] = 'O';
                                ships.getList().add(letter1 + "" + i);
                            }
                        }
                    }
                    if (number1 > number2 && flag == false) {
                        if (!Main.checkWhenLettersEquel(number2, number1, letter2, letter1, array)) {
                            System.out.println("Error! You placed it too close to another one. Try again:");
                            flag = true;

                        } else {
                            for (int i = number2; i <= number1; i++) {
                                array[letter1 - 65][i - 1] = 'O';
                                ships.getList().add(letter1 + "" + i);
                            }
                        }
                    }
                }

                //Vertical ships
                if (number2 == number1) {
                    if ((Math.abs(letter2 - letter1) - ships.cells) != -1) {

                        System.out.printf("Error! Wrong length of the %s! Try again:\n", ships.getShip());
                        flag = true;
                    } else flag = false;

                    if (letter2 > letter1 && flag == false) {
                        if (!Main.checkWhenNumbersEquel(number1, number2, letter1, letter2, array)) {
                            System.out.println("Error! You placed it too close to another one. Try again:");
                            flag = true;

                        } else {
                            for (int i = letter1; i <= letter2; i++) {

                                array[i - 65][number1 - 1] = 'O';
                                ships.getList().add((char) i + "" + number1);
                            }
                        }
                    }
                    if (letter1 > letter2 && flag == false) {
                        if (!Main.checkWhenNumbersEquel(number1, number2, letter2, letter1, array)) {
                            System.out.println("Error! You placed it too close to another one. Try again:");
                            flag = true;

                        } else {
                            for (int i = letter2; i <= letter1; i++) {
                                array[i - 65][number1 - 1] = 'O';
                                ships.getList().add((char) i + "" + number1);
                            }
                        }
                    }
                }

                if (letter2 != letter1 && number2 != number1) {
                    System.out.printf("Error! Wrong ship location! Try again:\n", ships.getShip());
                    flag = true;
                }
            }


            System.out.println();

            printThefield(array);
            System.out.println();
        }
    }

    private static void printThefield(char[][] array) {
        for (int i = '@'; i <= 'J'; i++) {
            if (i == '@') System.out.print(" ");
            if (i != '@') System.out.print((char) i);

            for (int j = 1; j < 11; j++) {

                if (i == '@') {
                    System.out.print(" " + j);
                }
                if (i != '@') {
                    System.out.print(" " + array[i - 65][j - 1]);
                }
            }
            System.out.println();
        }
    }

    private static boolean shipSank(char letter, int num) {
        boolean res = false;
        for (Ships ships : Ships.values()) {
            if (ships.getList().contains(letter + "" + num)) {
                for (int i = 0; i < ships.getList().size(); i++) {
                    if (ships.getList().get(i).equals(letter + "" + num)) {
//                        System.out.println(ships.getList().get(i));
                        ships.getList().set(i, "qw");
                    }
                    if (ships.getList().get(i).equals("qw")) {
//                        System.out.println(ships.getList().get(i));
                        res = true;
                        continue;

                    } else {
                        res = false;
                    }
                }
            }
        }

        return res;
    }

    private static boolean lastShipSank() {

        for (Ships ships : Ships.values()) {
            for (int i = 0; i < ships.getList().size(); i++) {
                if (!ships.getList().get(i).equals("qw")) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void fillTheships1(char[][] array) {
        for (Ships1 ships : Ships1.values()) {
            String first = null;
            String second = null;
            Integer number1 = null;
            Integer number2 = null;
            char letter1 = '0';
            char letter2 = '0';
            boolean flag = true;
            Scanner scanner = new Scanner(System.in);

            System.out.printf("Enter the coordinates of the  %s  (%s cells):\n", ships.getShip(), ships.getCells());
            while (flag) {


                first = scanner.next();
                second = scanner.next();


                number1 = Integer.parseInt(Arrays.stream(first.split("\\D")).filter(x -> !x.equals("")).findAny().get());
                letter1 = Arrays.stream(first.split("\\d")).filter(x -> !x.equals("")).findAny().get().charAt(0);
                number2 = Integer.parseInt(Arrays.stream(second.split("\\D")).filter(x -> !x.equals("")).findAny().get());
                letter2 = Arrays.stream(second.split("\\d")).filter(x -> !x.equals("")).findAny().get().charAt(0);

                //Horizontalships
                if (letter2 == letter1) {
                    if ((Math.abs(number2 - number1) - ships.cells) != -1) {

                        System.out.printf("Error! Wrong length of the %s! Try again:\n", ships.getShip());
                        flag = true;
                    } else flag = false;

                    if (number2 > number1 && flag == false) {
                        if (!Main.checkWhenLettersEquel(number1, number2, letter1, letter2, array)) {
                            System.out.println("Error! You placed it too close to another one. Try again:");
                            flag = true;

                        } else {
                            for (int i = number1; i <= number2; i++) {

                                array[letter1 - 65][i - 1] = 'O';
                                ships.getList().add(letter1 + "" + i);
                            }
                        }
                    }
                    if (number1 > number2 && flag == false) {
                        if (!Main.checkWhenLettersEquel(number2, number1, letter2, letter1, array)) {
                            System.out.println("Error! You placed it too close to another one. Try again:");
                            flag = true;

                        } else {
                            for (int i = number2; i <= number1; i++) {
                                array[letter1 - 65][i - 1] = 'O';
                                ships.getList().add(letter1 + "" + i);
                            }
                        }
                    }
                }

                //Vertical ships
                if (number2 == number1) {
                    if ((Math.abs(letter2 - letter1) - ships.cells) != -1) {

                        System.out.printf("Error! Wrong length of the %s! Try again:\n", ships.getShip());
                        flag = true;
                    } else flag = false;

                    if (letter2 > letter1 && flag == false) {
                        if (!Main.checkWhenNumbersEquel(number1, number2, letter1, letter2, array)) {
                            System.out.println("Error! You placed it too close to another one. Try again:");
                            flag = true;

                        } else {
                            for (int i = letter1; i <= letter2; i++) {

                                array[i - 65][number1 - 1] = 'O';
                                ships.getList().add((char) i + "" + number1);
                            }
                        }
                    }
                    if (letter1 > letter2 && flag == false) {
                        if (!Main.checkWhenNumbersEquel(number1, number2, letter2, letter1, array)) {
                            System.out.println("Error! You placed it too close to another one. Try again:");
                            flag = true;

                        } else {
                            for (int i = letter2; i <= letter1; i++) {
                                array[i - 65][number1 - 1] = 'O';
                                ships.getList().add((char) i + "" + number1);
                            }
                        }
                    }
                }

                if (letter2 != letter1 && number2 != number1) {
                    System.out.printf("Error! Wrong ship location! Try again:\n", ships.getShip());
                    flag = true;
                }
            }


            System.out.println();

            printThefield(array);
            System.out.println();
        }
    }

    private static boolean shipSank1(char letter, int num) {
        boolean res = false;
        for (Ships1 ships : Ships1.values()) {
            if (ships.getList().contains(letter + "" + num)) {
                for (int i = 0; i < ships.getList().size(); i++) {
                    if (ships.getList().get(i).equals(letter + "" + num)) {
//                        System.out.println(ships.getList().get(i));
                        ships.getList().set(i, "qw");
                    }
                    if (ships.getList().get(i).equals("qw")) {
//                        System.out.println(ships.getList().get(i));
                        res = true;
                        continue;

                    } else {
                        res = false;
                    }
                }
            }
        }

        return res;
    }

    private static boolean lastShipSank1() {

        for (Ships1 ships : Ships1.values()) {
            for (int i = 0; i < ships.getList().size(); i++) {
                if (!ships.getList().get(i).equals("qw")) {
                    return false;
                }
            }
        }
        return true;
    }

}
