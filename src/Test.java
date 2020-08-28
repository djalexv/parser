import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://yandex.ru/")
                .userAgent("Chrome/84.0.4147.135 Safari/537.36")
                .referrer("http://www.google.com")
                .get();
        Elements listNews = doc.select("div#news_panel_new.news__panel.mix-tabber-slide2__panel");
        System.out.println(listNews.size());

    }
}
