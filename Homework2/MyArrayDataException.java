package Homework2;

public class MyArrayDataException extends Exception {
    public int i,j;
    public String temp, temp1;

    public MyArrayDataException(int i, int j, String temp, String str ) {
        this.i = i;
        this.j = j;
        this.temp = temp;
        this.temp1 = str;
    }
    void info(){
        System.out.println("Wrong Data");
        System.out.println("Mistake is on : " + (i+1)+" line " + "in the " + (j+1)+ " position");
        System.out.println(temp1);
        System.out.println("The incorrect symbol is : "+temp);

    }
}
