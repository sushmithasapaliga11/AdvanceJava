/* Develop a java program for performing various string operations with different string
handling functions directed as follows
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String
Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
contains( ) and startsWith() and endsWith()
*/
package String;

public class String_operations {
	public static void main(String[] args) {
		// Basic String Creation
		System.out.println("=== String Creation and Basic Operations ===");
		String str1 = "Sushmitha";
		String str2 = new String("Sapaliga");
		System.out.println("Original strings:");
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		// Length and Character Access
		System.out.println("\n=== Length and Character Access ===");
		System.out.println("Length of str1: " + str1.length());
		System.out.println("Character at index 4 in str1: " + str1.charAt(4));
		// String Comparison
		System.out.println("\n=== String Comparison ===");
		String str3 = "sushmitha sapaliga";
		System.out.println("str1 equals str3: " + str1.equals(str3));
		System.out.println("str1 equals str3 (ignore case): " + str1.equalsIgnoreCase(str3));
		System.out.println("str1 compareTo str3: " + str1.compareTo(str3));
		// Searching in Strings
		System.out.println("\n=== String Searching ===");
		System.out.println("Index of 'Sushmitha' in str1: " + str1.indexOf("Sushmitha"));
		System.out.println("Last index of 'a' in str1: " + str1.lastIndexOf('a'));
		System.out.println("str1 contains 'Sushmitha': " + str1.contains("Sushmitha"));
		// Substring Operations
		System.out.println("\n=== Substring Operations ===");
		System.out.println("Substring of str1 (7 to end): " + str1.substring(7));
		System.out.println("Substring of str1 (0 to 5): " + str1.substring(0, 5));
		// String Modification
		System.out.println("\n=== String Modification ===");
		System.out.println("Uppercase: " + str1.toUpperCase());
		System.out.println("Lowercase: " + str1.toLowerCase());
		// Whitespace Handling
		System.out.println("\n=== Whitespace Handling ===");
		String spacedString = " I'm Sushmitha ";
		System.out.println("Original: '" + spacedString + "'");
		System.out.println("After trim: '" + spacedString.trim() + "'");
		// String Concatenation
		System.out.println("\n=== String Concatenation ===");
		String concat1 = "Sushmitha";
		String concat2 = "Sapaliga";
		System.out.println("Using + operator: " + concat1 + " " + concat2);
		System.out.println("Using concat(): " + concat1.concat(" ").concat(concat2));
		// String Splitting
		System.out.println("\n=== String Splitting ===");
		String csvText = "CC,ADJ,ML";
		System.out.println("Original CSV: " + csvText);
		String[] languages = csvText.split(",");
		System.out.println("After splitting:");
		for (int i = 0; i < languages.length; i++) {
		System.out.println("Subjects " + (i + 1) + ": " + languages[i]);
		}
		// String Building with StringBuilder
		System.out.println("\n=== StringBuilder Demo ===");
		StringBuilder builder = new StringBuilder();
		builder.append("heyy ");
		builder.append("good ");
		builder.append("morning");
		System.out.println("StringBuilder result: " + builder.toString());
		builder.insert(9, "all ");
		System.out.println("After insert: " + builder.toString());
		builder.reverse();
		System.out.println("After reverse: " + builder.toString());
		// String Formatting
		System.out.println("\n=== String Formatting ===");
		String formatted = String.format("Name: %s, Age: %d, Height: %.2f", "Sushmitha", 20, 55.65);
		System.out.println("Formatted string: " + formatted);
		// Checking String Properties
		System.out.println("\n=== String Properties ===");
		String testString = "Sushmitha11";
		System.out.println("Is empty: " + testString.isEmpty());
		System.out.println("Starts with 'Su': " + testString.startsWith("Su"));
		System.out.println("Ends with '11': " + testString.endsWith("11"));
		// Practical Example: Email Validation
		System.out.println("\n=== Practical Example: Email Validation ===");

		String email = "sushmitha11@gmail.com";
		boolean isValidEmail = validateEmail(email);
		System.out.println("Email: " + email);
		System.out.println("Is valid: " + isValidEmail);
		}
		// Helper method for email validation
		private static boolean validateEmail(String email) {
		// Basic email validation
		return email != null &&
		email.contains("@") &&
		email.contains(".") &&
		email.indexOf("@") < email.lastIndexOf(".") &&
		!email.startsWith("@") &&
		!email.endsWith(".") &&
		email.length() >= 5;
		}
}
