package bardzo_WAŻNE_DO_PRACY.collectionsWAŻNE.listSetMapQeDe;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

//kolejeki:
//FIFO - first in first out
//LiFO - Last in First out (stosy)

//kolejki utrzymują kolejność dodawania
public class DequeColletionMain {

    public static void main(String[] args) {

        //Queue - FIFO
        //Deque - LIFO (queue + 3 metody)
        //implementacja :
        //Linkedlist(żadko) i ArrayDeque(często)[raczej tgo używamy]

        //Queue - FIFO
        Queue<Person> queue = new ArrayDeque<>();
        queue.add(new Person("Person1",1));
        queue.add(new Person("Person2",2));

        System.out.println("queue = " + queue);

        //Wyciąga pierwszy element z kolejki (najstarszy - czyli dodany najwcześniej)
        Person oldestQueueElement = queue.remove();
        System.out.println("oldestQueueElement = " + oldestQueueElement);
        System.out.println("queue = " + queue);

        System.out.println("====================================");


        //Deque - LIFO
        Deque<Person> deque = new ArrayDeque<>();
        //.addLast nie .add
        deque.addLast(new Person("Person1",1));
        deque.addLast(new Person("Person2",1));

        System.out.println("deque = " + deque);

        //wyciąga ostatni dodany element
        Person lastElement = deque.removeLast();
        System.out.println("lastElement = " + lastElement);
        System.out.println("deque = " + deque);


    }
}
