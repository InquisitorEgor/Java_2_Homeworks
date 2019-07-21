package Homework2;

public class Main {

    public static void main(String[] args) {
        String str = "1 3 1 2\n2 3 2 2\n5 6 7 1\n3 3 1 0";

        try {
            int i = divide(str);
            System.out.println("The result is: " + i);
        } catch (MyArrayLengthException e) {
            e.info();
        } catch (MyArrayDataException e) {
            e.info();
        } finally {
            System.out.println("The end");
        }


    }

    private static int divide(String str) throws MyArrayLengthException, MyArrayDataException {

        String[][] str2 = new String[4][4];
        String[] str1 = str.split("\n");
        int count = 0;
        for (int i = 0; i < str2.length; i++) {
            String[] temp = str1[i].split(" ");

            if ((temp.length != 4) || (str1.length != 4)) throw new MyArrayLengthException();

            for (int j = 0; j < str2[i].length; j++) {
                str2[i][j] = temp[j];
                try {
                    count = count + Integer.parseInt(str2[i][j]);
                } catch (NumberFormatException e) {
                    String temp1 = str2[i][j];
                    throw new MyArrayDataException(i, j, temp1, str);
                }
            }
        }
        display(str2);

        return count / 2;
    }

    private static void display(String[][] str2) {
        for (int i = 0; i < str2.length; i++) {
            for (int j = 0; j < str2[i].length; j++) {
                System.out.print(str2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
