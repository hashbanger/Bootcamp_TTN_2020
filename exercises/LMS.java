package exercises;

import java.util.Scanner;

public class LMS implements Library{

    GetBookDetail getBookDetail;

    @Override
    public boolean addBook(GetBookDetail detail) {
        getBookDetail=detail;
        return true;
    }

    @Override
    public boolean showBookinfo() {
        System.out.println("Book id :" +getBookDetail.getBookID());
        System.out.println("Book Name :"+getBookDetail.getTitle());
        System.out.println("Book author :"+getBookDetail.getAuthor());
        System.out.println("Book Publisher :"+getBookDetail.getPublisher());
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LMS m = new LMS();
        while (true) {
        System.out.println("Library managent system");

        System.out.println("1. Add books");
        System.out.println("2. Display book info");
        System.out.println("press the key to continue");
        int n = sc.nextInt();
        sc.nextLine();

            switch (n) {
                case 1:
                    // sc.next();
                    System.out.println("please enter book id");
                    String id = sc.nextLine();
                    System.out.println("please enter book name");
                    String name = sc.nextLine();
                    System.out.println("please enter book author");
                    String author = sc.nextLine();
                    System.out.println("please enter book publisher");
                    String publisher = sc.nextLine();
                    GetBookDetail getBookDetail = new GetBookDetail(id, name, author, publisher);
                    m.addBook(getBookDetail);
                    System.out.println("Book added sucessfully");
                    break;
                case 2:
                    m.showBookinfo();
                    break;
                default:
                    break;
            }

        }
    }

}