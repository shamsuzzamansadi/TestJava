import java.util.Scanner;
public class Test1{
    static final int maxChar = 256;

    public static void getOccuringCount(String str){
        int count[] = new int[maxChar];

        int len = str.length();
        // char[] stringToCharArray = str.toCharArray();
        for(int i = 0; i < len; i++){
        // for(char i : stringToCharArray){
            count[str.charAt(i)]++;
        }

        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++){
            ch[i] = str.charAt(i);
            int find = 0;
            for(int j = 0; j<= i; j++){
                if(str.charAt(i) == ch[j]){
                    find++;
                }
            }
            if(find == 1){
                System.out.println("Number of Occurence of " +
                str.charAt(i)+ " is: " + count[str.charAt(i)]);
            }
        }
    }


    public static void add(int x, int y){
        int z = x + y;
        System.out.println("The new value of the number is: " + z);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput;
        int x = 0;

        System.out.println("Enter a number:");
        x = scan.nextInt();
        add(x,1);
        

        System.out.println("Enter your String: ");
        userInput = scan.next();
        scan.close();
        getOccuringCount(userInput);
        
    }
}
