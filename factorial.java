import java.util.*;
public class factorial{
    public static void main(String[]args){
    int init;
    Scanner input = new Scanner(System.in);
    System.out.println("Say a number");
    init = input.nextInt();
    for(int i = init-1,i >= ;i--){
        init = init*i;
        System.out.println(init);
        System.out.println(i);
    }
    System.out.println("This is the number factorlized: " + init);
}
}