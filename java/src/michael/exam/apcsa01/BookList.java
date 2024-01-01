package michael.exam.apcsa01;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    private int myCount;
    private List<Book> myList;

    public BookList() {
        super();
        this.myCount = 0;
        this.myList = new ArrayList<Book> ();
    }

    public int getMyCount() {
        return myCount;
    }

    public List<Book> getMyList() {
        return myList;
    }

    public void insertOne(Book bk) {  
        int index = 0;
        for (index = 0; index < this.myCount; index++) {
            if (bk.lessThan(myList.get(index))) {
                break;
            }
        }
        myList.add(index, bk);
        myCount++;
    }
    
    public void insertMany(List<Book> second) {
        for (Book b : second) {
            insertOne(b);
        }
    }
}
