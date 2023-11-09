package org.startsteps.week10.day04.exercises.dependency;

public class Exerecise2 {

    public static void main(String[] args) {
        Readable book = new Book("Book content.");
        Readable magazine = new Magazine("Magazine content.");
        Readable newspaper = new Newspaper("Newspaper content.");

        BookReader reader = new BookReader();
        reader.readFromSource(book);
        reader.readFromSource(magazine);
        reader.readFromSource(newspaper);
    }

}


interface Readable {
    String read();
}

class Book implements Readable {
    private String content;

    public Book(String content) {
        this.content = content;
    }

    @Override
    public String read() {
        return content;
    }
}

class Magazine implements Readable {
    private String content;

    public Magazine(String content) {
        this.content = content;
    }

    @Override
    public String read() {
        return content;
    }
}

class Newspaper implements Readable {
    private String content;

    public Newspaper(String content) {
        this.content = content;
    }

    @Override
    public String read() {
        return content;
    }
}

class BookReader {
    public void readFromSource(Readable readable) {
        System.out.println(readable.read());
    }
}
