public class Test2{
    public static void main(String[] args) {
        System.out.println("hello World!");

        for(int i = args.length-1; i>=0; i--){
            System.out.println(args[i]);
        }

        (System.getProperties()).list(System.out);
        System.out.println("-----");
        System.out.println(System.getProperty("java.home"));
        System.out.println("-----");
        System.out.println(System.getenv("JAVA_HOME"));
    }
}