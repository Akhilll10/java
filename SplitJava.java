public class SplitJava {
    public static void main(String[] args) {
        String input = "N124567-Akhilesh Maurya-4";

        try {
            String[] parts = input.split("-");

            String memberId = parts[0];
            String name = parts[1];
            String number = parts[2];

            System.out.println(memberId);
            System.out.println(name);
            System.out.println(number);
        }
        catch (Exception e){
            System.out.println("Error while getting seprate feilds");
        }
    }
}
