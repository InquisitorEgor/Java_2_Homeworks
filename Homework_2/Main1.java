package Homework_2;

public class Main1 {
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"1", "2", "4", "4"}, {"y", "2", "2", "3"}, {"1", "2", "2", "2"}, {"2", "2", "2", "2"}};
        try {
            try {
                int result = Checking(arr);
                System.out.println("The result is " + result);
            } catch (MyArrayLengthException e) {
                //e.printStackTrace();
                System.out.println("Wrong array size");
            }

        } catch (MyArrayDataException e) {
            System.out.println("Wrong Data");
            System.out.println("Mistake is in: " + e.i + " " + e.j);
            System.out.println("The incorrect symbol is : "+e.temp);
        }  finally {
            System.out.println("The end");
        }
    }

    private static int Checking(String[][] arr) throws MyArrayLengthException, MyArrayDataException {
        if (arr.length != 4) throw new MyArrayLengthException();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length !=4) throw new MyArrayLengthException();
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    String temp = arr[i][j];
                    throw new MyArrayDataException(i, j, temp);
                }
            }
        }
        return count;
    }
}
