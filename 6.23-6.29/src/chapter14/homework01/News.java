package chapter14.homework01;

/**
 * @author Zxc
 * @version 1.0
 */
public class News {

    private String headline;
    private String newsBody;

    public News(String headline) {
        this.headline = headline;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getNewsBody() {
        return newsBody;
    }

    public void setNewsBody(String newsBody) {
        this.newsBody = newsBody;
    }

    @Override
    public String toString() {
        return "标题='" + headline;
    }
}

