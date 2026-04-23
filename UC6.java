public class HelloApp {
    public static void main(String[] args) {
        // Check if no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Use StringBuilder for efficient string concatenation
            StringBuilder nameBuilder = new StringBuilder();

            // Enhanced for loop to iterate through all arguments
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Check length to avoid exceptions, then remove trailing ", " 
            if (nameBuilder.length() > 0) {
                String formattedNames = nameBuilder.substring(0, nameBuilder.length() - 2);
                System.out.println("Hello, " + formattedNames + "!");
            }
        }
    }
}
