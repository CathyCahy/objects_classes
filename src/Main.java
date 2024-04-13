public class Main {
    public static void main(String[] args) {
        Author chekhov = new  Author("Антон","Чехов");
        Book firstBook = new Book("Вишневый сад", chekhov, 1983);
        Author pushkin = new Author("Александр","Пушкин");
        Book secondBook = new Book("Евгений Онегин", pushkin, 2005);
        firstBook.setBookDate(2003);
        System.out.println("chekhov = " + chekhov.getFirstName() + " " + chekhov.getLastName());
        System.out.println("firstBook = " + firstBook.getBookName());
        System.out.println("pushkin = " + pushkin.getFirstName() + " " + pushkin.getLastName());
        System.out.println("secondBook = " + secondBook.getBookName());
        System.out.println("Год выпуска книги " + firstBook.getBookName() + " " +firstBook.getBookDate());


    }
}
