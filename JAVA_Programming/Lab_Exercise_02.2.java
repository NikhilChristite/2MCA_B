public class StringBufferExample {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // append()
        sb.append(" World");
        System.out.println("After append: " + sb);

        // insert()
        sb.insert(5, " there,");
        System.out.println("After insert: " + sb);

        // replace()
        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb);

        // delete()
        sb.delete(5, 11);
        System.out.println("After delete: " + sb);

        // charAt()
        char ch = sb.charAt(0);
        System.out.println("First character: " + ch);

        // setCharAt()
        sb.setCharAt(0, 'h');
        System.out.println("After setCharAt: " + sb);

        // length()
        int len = sb.length();
        System.out.println("Length: " + len);

        // capacity()
        int cap = sb.capacity();
        System.out.println("Capacity: " + cap);

        // ensureCapacity()
        sb.ensureCapacity(20);
        System.out.println("After ensureCapacity: " + sb.capacity());

        // toString()
        String str = sb.toString();
        System.out.println("String: " + str);

        // substring(int start)
        String sub1 = sb.substring(6);
        System.out.println("Substring from index 6: " + sub1);

        // substring(int start, int end)
        String sub2 = sb.substring(6, 10);
        System.out.println("Substring from index 6 to 10: " + sub2);
    }
}