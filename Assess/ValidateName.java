
public class ValidateName {

    @FunctionalInterface
    public interface Validate {
        public boolean validateName(String name);
    }

  
    public static Validate validateEmployeeName() {
        return employeeName -> employeeName.matches("[a-zA-Z\s]{5,20}");
    }

   
    public static Validate validateProductName() {
        return productName -> productName.matches("[a-zA-Z]{1}[\\d]{5}");
    }

    public static void main(String[] args) {
        boolean isValidEmployeeName = ValidateName.validateEmployeeName().validateName("Pinky Rose");
        System.out.println(isValidEmployeeName);

        boolean isValidProductName = ValidateName.validateProductName().validateName("A8546");
        System.out.println(isValidProductName);
    } }