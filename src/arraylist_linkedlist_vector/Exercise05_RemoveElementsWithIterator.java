package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Exercise05_RemoveElementsWithIterator {
    public static void main(String[] args) {

        ArrayList<String> object = new ArrayList<>(Arrays.asList(
                "Pen",
                "Pencil",
                "Book",
                "NoteBook",
                "MacBook Pro"
        ));

        Iterator<String> objectIterator = object.iterator();

        while(objectIterator.hasNext()){
            String objects = objectIterator.next();
            if (objects.toLowerCase().contains("book")){
                objectIterator.remove();
            }

        }
        System.out.println(objectIterator);
    }
}
