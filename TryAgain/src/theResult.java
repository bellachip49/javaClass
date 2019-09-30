public class theResult {
    public static void main(String[] args) {
        String original = "software";
        StringBuilder result = new StringBuilder("hi");
        int index = original.indexOf('a');

        /*1*/   result.setCharAt(0, original.charAt(0)); //si
        System.out.println(result);
        /*2*/   result.setCharAt(1, original.charAt(original.length()-1)); //se
        System.out.println(result);
        /*3*/   result.insert(1, original.charAt(4)); //swe
        System.out.println(result);
        /*4*/   result.append(original.substring(1,4)); //ftswe
        System.out.println(result);
        /*5*/   result.insert(3, (original.substring(index, index+2) + " ")); //ftsr we

        System.out.println(result);
    }
}
