package DesignPatterns.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

class Book {
    private int bid;
    private String bname;

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                '}';
    }
    public String getBname() {
        return bname;
    }
    public Book setBname(String bname) {
        this.bname = bname;
        return this;
    }

    public int getBid() {
        return bid;
    }

    public Book setBid(int bid) {
        this.bid = bid;
        return this;
    }
}

class BookShop implements Cloneable{
    private String ShopName;
    List<Book> books = new ArrayList<>();

    public String getShopName() {
        return ShopName;
    }

    public BookShop setShopName(String shopName) {
        ShopName = shopName;
        return this;
    }

    public List<Book> getBooks() {
        return books;
    }

    public BookShop setBooks(List<Book> books) {
        this.books = books;
        return this;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "ShopName='" + ShopName + '\'' +
                ", books=" + books +
                '}';
    }
    public void loadData(){
        for (int i =1;i<=10;i++){
            Book b = new Book();
            b.setBid(i);
            b.setBname("BOOK" +i);
            getBooks().add(b);
        }
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop shop = new BookShop();
        for (Book b :
            this.getBooks()) {
            shop.getBooks().add(b);
        }
        return shop;
    }
}

public class Prototype{
    public static void main(String[] args) throws CloneNotSupportedException{
        BookShop bs = new BookShop();
        bs.setShopName("Grand");
        bs.loadData();

        BookShop bs1 = bs.clone();
        bs.getBooks().remove(2);
        bs1.setShopName("Roman Roland");
        bs1.loadData();

        System.out.println(bs);
        System.out.println(bs1);
    }
}
