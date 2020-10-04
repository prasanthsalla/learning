import java.util.HashSet;

public class isunique {

    static public boolean isUnique(String str) {
            HashSet<Character> set =  new HashSet<Character>();
            for(int i = 0; i < str.length(); i++) {
                Character c = str.charAt(i);
                // System.out.println(c);
                if(set.contains(c))
                    return false;
                else
                    set.add(c);
            }
            return true;
        }

    public static void main(String[] args) {
        String original = new String("A" + "\u265c" + "\u265c" + "\u00fc" + "C");
        System.out.println(original);
        System.out.println(original.charAt(0));
        System.out.println(original.charAt(1));
        System.out.println(original.charAt(2));
        System.out.println(original.charAt(3));
        System.out.println(original.charAt(4));

        //byte[] array = original.getBytes();

        //Integer[] array = Integer.valueOf(original);
        //for( int b : array) {
        //    System.out.println(b);
        //}



        boolean ret = isUnique(original);
        System.out.println(ret);

    }
}
