import java.util.Arrays;
	public class StringMethodsExample {
    public static void main(String[] args) {
        String text = "We realizes that while our workers were thriving,the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain - I knew I wanted to do more for these families who were risking their lives for lack of an alternative. The alternative mentioned here is the Tata Nano, which soon after came as the world's cheapest car on retail at a starting price of only Rs 1 lakh.";
        // charAt()
        char firstChar = text.charAt(0);
        System.out.println("First character: " + firstChar);

        // compareTo()
        String otherText = "We realize that while our workers were thriving, the surrounding villages were still suffering.";
        int comparison = text.compareTo(otherText);
        System.out.println("Comparison result: " + comparison);

        // concat()
        String concatText = text.concat(" This is additional text.");
        System.out.println("Concatenated text: " + concatText);

        // contains()
        boolean contains = text.contains("Tata Nano");
        System.out.println("Contains 'Tata Nano': " + contains);

        // endsWith()
        boolean endsWith = text.endsWith("1 lakh.");
        System.out.println("Ends with '1 lakh.': " + endsWith);

        // equals()
        boolean equals = text.equals(otherText);
        System.out.println("Equals: " + equals);

        // equalsIgnoreCase()
        boolean equalsIgnoreCase = text.equalsIgnoreCase(otherText);
        System.out.println("Equals ignore case: " + equalsIgnoreCase);

        // format()
        String formattedText = String.format("The text starts with '%s' and ends with '%s'.", firstChar, "1 lakh.");
        System.out.println("Formatted text: " + formattedText);

        // getBytes()
        byte[] bytes = text.getBytes();
        System.out.println("Bytes: " + bytes);

        // getChars()
        char[] chars = new char[10];
        text.getChars(0, 10, chars, 0);
        System.out.println("Chars: " + chars);

        // indexOf()
        int indexOf = text.indexOf("Tata Nano");
        System.out.println("Index of 'Tata Nano': " + indexOf);

        // intern()
        String internedText = text.intern();
        System.out.println("Interned text: " + internedText);

        // isEmpty()
        boolean isEmpty = text.isEmpty();
        System.out.println("Is empty: " + isEmpty);

        // join()
        String[] words = text.split(" ");
        String joinedText = String.join("-", words);
        System.out.println("Joined text: " + joinedText);

        // lastIndexOf()
        int lastIndexOf = text.lastIndexOf("Tata Nano");
        System.out.println("Last index of 'Tata Nano': " + lastIndexOf);

        // length()
        int length = text.length();
        System.out.println("Length: " + length);

        // replace()
        String replacedText = text.replace("Tata Nano", "Nano");
        System.out.println("Replaced text: " + replacedText);

        // replaceAll()
        String replacedAllText = text.replaceAll("Tata Nano", "Nano");
        System.out.println("Replaced all text: " + replacedAllText);

        // split()
        String[] splitText = text.split(" ");
        System.out.println("Split text: " + Arrays.toString(splitText));

        // startsWith()
        boolean startsWith = text.startsWith("We realizes");
        System.out.println("Starts with 'We realizes': " + startsWith);

        // substring()
        String substring = text.substring(0, 10);
        System.out.println("Substring: " + substring);

        // toCharArray()
        char[] charArray = text.toCharArray();
        System.out.println("Char array: " + Arrays.toString(charArray));

        // toLowerCase()
        String lowerCase = text.toLowerCase();
        System.out.println("Lower case: " + lowerCase);

        // toUpperCase()
        String upperCase = text.toUpperCase();
        System.out.println("Upper case: " + upperCase);

        // trim()
        String trimmedText = text.trim();
        System.out.println("Trimmed text: " + trimmedText);

        // valueOf()
        String valueOfFirstChar = String.valueOf(firstChar);
        System.out.println("Value of first char: " + valueOfFirstChar);
    }
}