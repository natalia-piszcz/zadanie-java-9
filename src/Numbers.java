//Napisz program, w którym stworzysz tablice 5 liczb całkowitych. Wyświetl sumę powstałą
// z dodania pierwszej, trzeciej i piątej liczby.

public class Numbers {
    public static void main(String[] args) {
        int [] numbers = new int [] {1,2,4,5,6};
        int sum = numbers[0] + numbers [2] + numbers [4];
        System.out.println(sum);
    }
}
