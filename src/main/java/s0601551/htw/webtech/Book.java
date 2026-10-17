package s0601551.htw.webtech;

public class Book {
    private Long id;
    private String title;
    private String author;
    private String genre;
    private int totalPages;
    private int currentPage;
    private String status;

    public Book(Long id, String title, String author, String genre, int totalPages, int currentPage, String status) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.totalPages = totalPages;
        this.currentPage = currentPage;
        this.status = status;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() {  return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public int getTotalPages() { return totalPages; }
    public void setTotalPages(int totalPages) { this.totalPages = totalPages; }

    public int getCurrentPage() { return currentPage; }
    public void setCurrentPage(int currentPage) { this.currentPage = currentPage; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
