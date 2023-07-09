public class StudentClass {
    //constants
    public static final int MY_CONSTANT=788;
    private int number;
    private static int staticNumber;

    public StudentClass() {
       staticNumber++;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public  int getStaticNumber() {
        return staticNumber;
    }

    public  void setStaticNumber(int nn) {
        StudentClass.staticNumber = nn;
    }

    public static int addNumbers(int a,int b){
//        this.number error
//        number=788 error
//        staticNumber=741 OK
        int c = a + b;
        return c;
    }
    //factory method
    public static StudentClass getNewClass(){
        StudentClass aClass = new StudentClass();
        aClass.setStaticNumber(41);
        aClass.setNumber(12);
        return aClass;
    }
}
