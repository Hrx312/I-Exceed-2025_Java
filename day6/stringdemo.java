public class stringdemo {
    public static void main(String[] args) {

        // ===== 1. STRING METHODS =====
        String str = "Hello Java";
        System.out.println("Original String: " + str);

        System.out.println("length(): " + str.length());
        System.out.println("charAt(1): " + str.charAt(1));
        System.out.println("substring(0,5): " + str.substring(0,5));
        System.out.println("contains(\"Java\"): " + str.contains("Java"));
        System.out.println("equals(\"Hello Java\"): " + str.equals("Hello Java"));
        System.out.println("equalsIgnoreCase(\"hello java\"): " + str.equalsIgnoreCase("hello java"));
        System.out.println("compareTo(\"Hello World\"): " + str.compareTo("Hello World"));
        System.out.println("toUpperCase(): " + str.toUpperCase());
        System.out.println("toLowerCase(): " + str.toLowerCase());
        System.out.println("trim(): " + "   padded text   ".trim());
        System.out.println("replace('a','@'): " + str.replace('a','@'));
        String[] words = str.split(" ");
        System.out.println("split(\" \"): " + java.util.Arrays.toString(words));
        System.out.println("concat(\" Rocks\"): " + str.concat(" Rocks"));

        System.out.println("\n-------------------------\n");

        // ===== 2. STRINGBUFFER METHODS =====
        StringBuffer sbuf = new StringBuffer("Hello");
        System.out.println("Original StringBuffer: " + sbuf);

        sbuf.append(" Java");
        System.out.println("append(): " + sbuf);

        sbuf.insert(5, " World");
        System.out.println("insert(): " + sbuf);

        sbuf.replace(0, 5, "Hi");
        System.out.println("replace(): " + sbuf);

        sbuf.delete(2, 7);
        System.out.println("delete(): " + sbuf);

        sbuf.deleteCharAt(1);
        System.out.println("deleteCharAt(): " + sbuf);

        sbuf.reverse();
        System.out.println("reverse(): " + sbuf);

        System.out.println("capacity(): " + sbuf.capacity());
        sbuf.ensureCapacity(50);
        System.out.println("ensureCapacity(50): " + sbuf.capacity());

        sbuf.setCharAt(0, 'Z');
        System.out.println("setCharAt(): " + sbuf);

        System.out.println("length(): " + sbuf.length());

        System.out.println("\n-------------------------\n");

        // ===== 3. STRINGBUILDER METHODS =====
        StringBuilder sbld = new StringBuilder("Hello");
        System.out.println("Original StringBuilder: " + sbld);

        sbld.append(" Java");
        System.out.println("append(): " + sbld);

        sbld.insert(5, " World");
        System.out.println("insert(): " + sbld);

        sbld.replace(0, 5, "Hi");
        System.out.println("replace(): " + sbld);

        sbld.delete(2, 7);
        System.out.println("delete(): " + sbld);

        sbld.deleteCharAt(1);
        System.out.println("deleteCharAt(): " + sbld);

        sbld.reverse();
        System.out.println("reverse(): " + sbld);

        System.out.println("capacity(): " + sbld.capacity());
        sbld.ensureCapacity(50);
        System.out.println("ensureCapacity(50): " + sbld.capacity());

        sbld.setCharAt(0, 'Z');
        System.out.println("setCharAt(): " + sbld);

        System.out.println("length(): " + sbld.length());
    }
}
