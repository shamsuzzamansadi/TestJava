import java.util.Scanner;
import java.util.HashMap;

public class Test1{
    // static final int maxChar = 256;
    private static void charAppeared(String inStr) {
        // int [] count = new int[maxChar];
        // int len = inStr.length();

        // for (int i = 0; i < len; i++) {
		// 	count[inStr.charAt(i)]++;
		// }
 
		// char[] ch = new char[inStr.length()];
		// for (int i = 0; i < len; i++) {
		// 	ch[i] = inStr.charAt(i);
		// 	int find = 0;
		// 	for (int j = 0; j <= i; j++) {
		// 		if (inStr.charAt(i) == ch[j])
		// 			find++;
		// 	}
 
		// 	if (find == 1) {
		// 		System.out.println("Number of Occurrence of " + inStr.charAt(i) + " letter is:" + count[inStr.charAt(i)]);
        //     }
        // }
        HashMap<String, Integer> counter = new HashMap();
		for(char c : inStr.toCharArray()){
			String str = c+"";
			if(!counter.containsKey(str)){
				counter.put(str, 1);
			}else{
				counter.put(str, counter.get(str)+1);
			}
		}
		System.out.println(counter);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  
        String userInput = new String();
        
        System.out.print("Enter your Name: ");
        userInput = scan.nextLine();
        scan.close();

        charAppeared(userInput);
    }

    
} 