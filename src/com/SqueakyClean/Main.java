public class Main {
    public static void main(String[] args) {
        System.out.println("test");
        System.out.println(clean3("my\0Id"));
    }

    public static String clean(String identifier) {
        return identifier.replaceAll(" ", "_");

    }

    public static String clean2(String identifier) {
        return identifier.replaceAll("/my/g", "CTRL");
    }

    public static String clean3(String identifier) {
        var result = identifier.replace(' ', '_')
                .replaceAll("[α-ω]", "")
                .replaceAll("\0", "CTRL")
                .replaceAll("[^\\p{L}\\p{P}]", "");
        return result;
    }
}