public class ClassNameTest {
    private static ClassName className;
    public static final String[] validClassName = new String[] {"C0223G", "A0323K"};
    public static final String[] inValidClassName = new String[] {"M0318G","P0323A"};

    public static void main(String[] args) {
        className = new ClassName();
        for (String e : validClassName) {
            boolean isValid = className.validate(e);
            System.out.println("Name is " + e + " is Valid " + isValid);
        }
        for (String e : inValidClassName) {
            boolean isValid = className.validate(e);
            System.out.println("Name is " + e + " is Valid " + isValid);
        }
    }
}
