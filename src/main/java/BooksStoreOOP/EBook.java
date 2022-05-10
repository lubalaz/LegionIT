package BooksStoreOOP;

public class EBook extends Book{

    String downloadUrl;

    public EBook(String name, String authorName, int id, double price, boolean isAvailable,String Url) {
        super(name, authorName, id, price, isAvailable);
        this.downloadUrl= Url;
    }


    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    @Override
    public void printBookDetails() {
        super.printBookDetails();
        System.out.println("Url:" + downloadUrl);
    }
}
