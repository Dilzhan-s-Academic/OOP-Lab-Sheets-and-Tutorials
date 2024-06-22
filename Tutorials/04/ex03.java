public class ex03 {
    
    public static void validateAge(int age) throws AgeValidationException {
        if (age < 0 || age > 120) {
            throw new AgeValidationException("Age " + age + " is not within the valid range (0 to 120).");
        }
    }

    public static void main(String[] args) {
        int[] testAges = {-5, 25, 130};
        
        for (int age : testAges) {
            try {
                validateAge(age);
                System.out.println("Age " + age + " is valid.");
            } catch (AgeValidationException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }
    }
}


public class AgeValidationException extends Exception {
    
    public AgeValidationException(String message) {
        super(message);
    }
}