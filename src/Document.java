//Dorin Tihon
public class Document implements Turner{
    private int page;
    private int lastPage;

    private String date;
    private String ID;

    public Document() {
        page = 0;
        lastPage = 0;
        ID = "0000";
        date = "No date";

    }

    public Document(int page, int lastPage, String ID, String date) {
        this.page = page;
        this.lastPage = lastPage;
        this.ID = ID;
        this.date = date;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLastPage() {
        return lastPage;
    }

    public void setLastPage(int lastPage) {
        this.lastPage = lastPage;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String returnIdDate(){
        return "ID: " + ID + "\n" + "Date: " + date;
    }


    @Override
    public boolean turn() {
        page = page + 1;
        if (page == lastPage){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Current document page: " + page + '\n' +
                "Document pages: " + lastPage + "\n" +
                "Document ID: " + ID + "\n" +
                "Date of publishing: " + date + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (this.getClass() == obj.getClass()) {
            Document other = (Document) obj;
            return page == other.getPage() &&
                    lastPage == other.getLastPage() &&
                    ID.equals(other.getID()) &&
                    date.equals(other.getDate());
        }
        return false;
    }
}
