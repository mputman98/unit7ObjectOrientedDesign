


public class StringReverse
{
    /** description of instance variable x (add comment for each instance variable) */
   public static String reverse( String text){
       if(text.length() == 0 ){
           return"";
       }
       
       char c = text.charAt(0);
       String rest  = text.substring(1);
       String reverseText = reverse(rest) + c;
       return reverseText;
   }
   
   public static void main( String[] args){
       System.out.println( StringReverse.reverse("Hello"));
       System.out.println( StringReverse.reverse("expected: olleH"));
       
       System.out.println( StringReverse.reverse("Odd"));
       System.out.println( StringReverse.reverse("expected: ddO"));
   }
}