public class Main {
    public static void main(String[] args) {
        // Задание по теме "Объекты и классы"
        System.out.println("Задание по теме Объекты и классы");

        Author firstAuthor = new Author("Федор", "Достоевский");
        Author secondAuthor = new Author("Николай", "Гоголь");

        Book firstBook = new Book("Преступление и наказание", firstAuthor, 2010);
        Book secondBook = new Book("Ревизор", secondAuthor, 2005);

        System.out.println("Книга 1: " + firstBook.getBookName() + ". Автор: " + firstAuthor.toString() + ". Год публикации: " + firstBook.getPublishingYear());
        System.out.println("Книга 2: " + secondBook.getBookName() + ". Автор: " + secondAuthor.toString() + ". Год публикации: " + secondBook.getPublishingYear());

        firstBook.setPublishingYear(2015);
        System.out.println("Новый год публикации книги 1 - " + firstBook.getPublishingYear());

        // Задание по теме "Методы объектов"
        System.out.println("Задание по теме Методы объектов");
        System.out.println(firstBook);
        System.out.println(secondBook);

        System.out.println(firstAuthor);
        System.out.println(secondAuthor);

        System.out.println(firstBook.equals(secondBook));
        System.out.println(firstAuthor.equals(secondAuthor));

        System.out.println(firstBook.hashCode());
        System.out.println(secondBook.hashCode());
        System.out.println(firstAuthor.hashCode());
        System.out.println(secondAuthor.hashCode());
    }
}