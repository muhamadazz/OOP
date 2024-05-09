public class App {
    public static void main(String[] args) throws Exception {
        String name = "NUGRAHA";

        for(int i = name.length(); i > 0; i--){
            System.out.println(name.substring(0,i) +"*".repeat(name.length()-i) );
        }
        System.out.println();
        System.out.println();

        for(int i = 0; i < name.length(); i++){
            System.out.println("*".repeat(i)+name.charAt(i)+"*".repeat(name.length()-i-1));
        }
        System.out.println();
        System.out.println();
        

        for(int i = 0 ; i < name.length(); i++){
            if (i == name.length()/ 2) {
                // System.out.println(name.substring(0, 1 + i) +"*".repeat(name.length()) );
                System.out.println(name);
            } else{
                System.out.println("***"+name.charAt(i)+"***");
                
            }
        }
    }

}