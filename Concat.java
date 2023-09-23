public class Concat {
    public static void main(String[] args){
        String firstname = "Ken";
        String lastname = "Smith";
        String concatonate = (firstname + " " + lastname);
        System.out.println(concatonate);
        System.out.println(firstname.concat(lastname));

        /* WARNING!

Java uses the + operator for both addition and concatenation.

Numbers are added. Strings are concatenated.  */
    }
}
