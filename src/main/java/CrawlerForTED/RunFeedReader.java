package CrawlerForTED;

public class RunFeedReader {

    public static void main(String[] args) {
        String feedUrl = "https://ted.europa.eu/TED/rss/en/RSS_agfo_all.xml#";
        ParserRSS parser = new ParserRSS(feedUrl);
        Feed feed = parser.readFeed();
        System.out.println(feed);
        AddFeedToDB adder= new AddFeedToDB();
        adder.persist(feed);
        for (FeedMessage message : feed.getMessages()) {
             System.out.println(message.toString());

        }

    }
}