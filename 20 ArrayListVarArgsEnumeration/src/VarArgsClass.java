public class VarArgsClass {
    public static void main(String[] args) {
        System.out.printf("%s %d %s %d", "Mehdi", 12, "adeli", 52);
        System.out.printf("\n%s", "sddfw");
        System.out.println(findMax(2));
        System.out.println(findMax(2,3,4,5,6,15,22,15,100,41,56));
    }

    public static Integer findMax(Integer... numbers) {
        if (numbers.length > 0) {

            int max = numbers[0];
            for (int i = 0; i < numbers.length; i++) {

            }
            return max;
        }
        return 0;
    }
}
