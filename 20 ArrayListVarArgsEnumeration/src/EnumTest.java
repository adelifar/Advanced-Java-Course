public class EnumTest {
    public static void main(String[] args) {
        SizeEnum sizeEnum = SizeEnum.MEDIUM;
        sizeEnum = SizeEnum.valueOf("LARGE");
        System.out.println(sizeEnum.getAbb());
        System.out.println(sizeEnum);
        SizeEnum[] enums = SizeEnum.values();
        for (SizeEnum sizeEnum1:
             enums) {
            System.out.println(sizeEnum1);
        }
        System.out.println(SizeEnum.MEDIUM.ordinal());
    }
}
