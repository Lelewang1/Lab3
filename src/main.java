public class main {
    public static void main(String[] args) {
        //System.out.println(WebScraping.urlToString("http://erdani.com/tdpl/hamlet.txt"));

        System.out.println(wordCount("Leisure time on an average day\n" +
                "\n" +
                "\t\t\t\t\t\tMinutes\n" +
                "\n" +
                "Watching TV\t\t\t\t\t167 (2.8 hours)"));


    }

    public static int wordCount(final String url) {
        String[] line = url.split("\n");
        String[] words;
        int number = 0;
        /*for (int i = 0; i < url.length(); i++) {
            if (text[i].startsWith("\n")) {

            }
        }*/
        for (int i = 0; i <= line.length - 1; i++) {
             words = line[i].split(" ");
             number = words.length;
        }

        return number;
    }
}
