public class Main {
    public static void main(String[] args) {
        Author chekhov = new  Author("Антон","Чехов");
        Book firstBook = new Book("Вишневый сад", chekhov, 1983);
        Author pushkin = new Author("Александр","Пушкин");
        Book secondBook = new Book("Евгений Онегин", pushkin, 1999);
        Book thirdBook = new Book("Евгений Онегин", pushkin, 2003);
        secondBook.setBookDate(2003);
        System.out.println(firstBook);
        System.out.println(secondBook);
        System.out.println(pushkin);
        System.out.println(chekhov.equals(pushkin));
        System.out.println(secondBook.equals(thirdBook));
        System.out.println(firstBook.hashCode());
        System.out.println(pushkin.hashCode());


    }
}
