public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Федор", "Достоевский");
        Author secondAuthor = new Author("Николай", "Гоголь");

        Book firstBook = new Book("Преступление и наказание", firstAuthor, 2010);
        Book secondBook = new Book("Ревизор", secondAuthor, 2005);

        System.out.println("Книга 1: " + firstBook.getBookName() + ". Автор: " + firstAuthor.getAuthor() + ". Год публикации: " + firstBook.getPublishingYear());
        System.out.println("Книга 2: " + secondBook.getBookName() + ". Автор: " + secondAuthor.getAuthor() + ". Год публикации: " + secondBook.getPublishingYear());

        firstBook.setPublishingYear(2015);
        System.out.println("Новый год публикации книги 1 - " + firstBook.getPublishingYear());
    }
}