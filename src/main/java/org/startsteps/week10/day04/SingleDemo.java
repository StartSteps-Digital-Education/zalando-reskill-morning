package org.startsteps.week10.day04;

public class SingleDemo {

    public static void main(String[] args) {
        Book book = new Book("The Alchemist", "Paulo Coelho", "");
        BookPrinter bookPrinter = new BookPrinter();
        bookPrinter.printTextToConsole(book.toString());
    }
}


class Book {

    private String name;
    private String author;
    private String text;

    public Book(String name, String author, String text) {
        this.name = name;
        this.author = author;
        this.text = text;
    }


    // methods that directly relate to the book properties
    public String replaceWordInText(String word, String replacementWord){
        return text.replaceAll(word, replacementWord);
    }

    public boolean isWordInText(String word){
        return text.contains(word);
    }
}

class BookPrinter {

    // methods for outputting text
    void printTextToConsole(String text){
        //our code for formatting and printing the text
    }

    void printTextToAnotherMedium(String text){
        // code for writing to any other location..
    }
}
