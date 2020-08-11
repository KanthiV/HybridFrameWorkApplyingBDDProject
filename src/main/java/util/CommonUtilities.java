package util;

public class CommonUtilities {

 public static void assertionEquals(String reason, String actual, String expected) {
	 
     if (!actual.equalsIgnoreCase(expected) ) {
    	 throw new RuntimeException(reason);
     }
 
 }


}
