public class Book {
    private int pages;
    private int year;
    private Author author;

    public Book(Author author,int pages, int year) {
        this.author = author;
        this.pages = pages;
        this.year = year;
    }

    public int getPages() {
        return this.pages;
    }

    public int getYear() {

        return this.year;
    }
    public String getAuthor() {
        return author.getFirstName() + author.getSurname();
    }
    public void setYear(int year) {

        this.year = year;
    }
}