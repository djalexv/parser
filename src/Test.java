import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Test {
    private static final String URL_SQL_RU = "https://www.sql.ru/forum/job-offers/";

    public static void main(String[] args) throws IOException {
        final String curDir = System.getProperty("user.dir");
//        System.out.println("current dir = " + dir);

        File inputFile = new File(curDir,"input.html");
        if (inputFile.exists()) inputFile.delete();
        inputFile.createNewFile();
//        Document doc = Jsoup.connect(URL_SQL_RU).get();
        Document doc = Jsoup.parse(inputFile, "UTF-8", URL_SQL_RU);
//        Elements listNews = doc.select("div#news_panel_new.news__panel.mix-tabber-slide2__panel");
//        System.out.println(doc.));

    }
}
