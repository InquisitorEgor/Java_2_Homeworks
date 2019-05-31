package Homework_2;

public class MyArrayDataException extends Exception {
    public int i,j;
    public String temp;

    public MyArrayDataException(int i, int j, String temp ) {
        this.i = i;
        this.j = j;
        this.temp = temp;
    }
}
