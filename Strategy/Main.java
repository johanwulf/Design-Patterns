package Strategy.List;

public class Main {
    public static void main(String[] args) {
        List<String> prefixList = new List<String>();

        /**
         * No prefix
         */
        prefixList.add("Hello");
        prefixList.add("World");
        prefixList.add("!");

        System.out.println(prefixList.toString());

        /**
         * Star prefix
         */
        prefixList.setPrefix(new Star());
        System.out.println(prefixList.toString());

        /**
         * Number prefix
         */
        prefixList.setPrefix(new Numbered());
        System.out.println(prefixList.toString());
    }
}
