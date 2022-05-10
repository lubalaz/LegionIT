package Pages;

import java.sql.SQLOutput;

public class Page {
    public int getPageId() {
        return pageId;
    }

    private int pageId =54;
    private String pageName;

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    private String URL;

  //  public Page(String pageName, int pageId, String URL){
  //  this.pageName = pageName;
   // this.pageId = pageId;
  //  this.URL = URL;
   // }

    public Page() {

    }

    public void setPageId(int pageId){
  //      this.pageId = pageId;
   // }


    public String getURL() {
        return URL;
    }

    public void openPage(){
        System.out.println(String.format ("Page %s was opened", pageName));
    }
    public void closePage(){
        System.out.println(String.format ("Page %s was closed", pageName));
    }
    public void clickButton(String buttonName){
            System.out.println(String.format ("button %s was clicked", buttonName));
        }


       // public abstract void getDeveloperName();

        }


