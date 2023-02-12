package LabTask2;
public class Book {
    
    public String title;
    public String author;
    public String isbn;
    public int pages;   
    
    public Book(String title, String author, String isbn, int pages) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;               
    }    
    public void summary() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Number of pages: " + pages);
    }        
}
