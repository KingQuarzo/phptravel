package co.com.phptravels.test.models;

public class Categories {

    private String categoryName;
    private String vietnamese;
    private String russian;
    private String arabic;
    private String farsi;
    private String turkish;
    private String french;
    private String spanish;
    private String german;

    public String getCategoryName() {
        return categoryName;
    }

    public String getVietnamese() {
        return vietnamese;
    }

    public String getRussian() {
        return russian;
    }

    public String getArabic() {
        return arabic;
    }

    public String getFarsi() {
        return farsi;
    }

    public String getTurkish() {
        return turkish;
    }

    public String getFrench() {
        return french;
    }

    public String getSpanish() {
        return spanish;
    }

    public String getGerman() {
        return german;
    }

    public Categories(String categoryName, String vietnamese, String russian, String arabic, String farsi, String turkish, String french, String spanish, String german) {
        this.categoryName = categoryName;
        this.vietnamese = vietnamese;
        this.russian = russian;
        this.arabic = arabic;
        this.farsi = farsi;
        this.turkish = turkish;
        this.french = french;
        this.spanish = spanish;
        this.german = german;
    }
}
