import java.util.*;

class Book {
  String booktitle;
  String author;
  int no_of_pages;
  double price;
  Scanner sc = new Scanner(System.in);

  Book() {
    System.out.print("Enter book title: ");
    booktitle = sc.nextLine();
    System.out.print("Enter the author name: ");
    author = sc.nextLine();
    System.out.print("Enter the price: ");
    price = sc.nextDouble();
    System.out.print("Enter the pages: ");
    no_of_pages = sc.nextInt();
  }

  public String toString() {
    return (" Book name = " + booktitle + " Author = " + author + " Price = " + price + " Pages = " + no_of_pages);
  }
}

class Books {
  public static void main(String[] args) {
    int n, i;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter number of books: ");
    n = in.nextInt();
    Book[] b = new Book[n];
    for (i = 0; i < n; i++) {
      System.out.println("Enter details of Book: " + (i + 1));
      b[i] = new Book();
    }
    for (i = 0; i < n; i++) {
      System.out.println(b[i]);
    }
  }
}