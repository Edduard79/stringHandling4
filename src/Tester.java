public class Tester {
    public Tester(){
    }
    public static void main(String[] args){

        String veryLongString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        System.out.println(veryLongString.replace("um","HUM"));

        String[] parts = veryLongString.split("(?<=aliquip)");

        String sub1 = parts[0];
        String sub2 = parts[1];

        //System.out.println(sub1); Prova

        System.out.println(sub1.trim() + "\n" + sub2.trim());
        //System.out.println(sub1.contains("est") + "\n" +sub2.contains("est"));
        System.out.println(sub1.contains("est") ^ sub2.contains("est"));



    }
}
