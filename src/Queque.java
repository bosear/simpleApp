import java.util.NoSuchElementException;

/**
 * Created by Артём on 08.05.2017.
 */
public class Queque {
    private Node head = null;
    private int lastInd = -1;

    public void add(String description) {
        if (head == null) {
            head = new Node(description);
            ++lastInd;
        } else {
            get(lastInd).setPointer(new Node(description));
            ++lastInd;
        }
    }

    public void remove(int index) {
        Node wanted = get(index);

        if (wanted == head) {
            head = wanted.getPointer();
            --lastInd;
            wanted = null;
            return;
        }

        get(index - 1).setPointer(wanted.getPointer());
        wanted = null;
        --lastInd;
    }

    public int length() {
        return lastInd + 1;
    }

    public Node get(int index) {
        Node pointer = head;
        int number = 0;

        if (pointer == null)
            throw new IllegalStateException();

        while (pointer.getPointer() != null && number != index) {
            pointer = pointer.getPointer();
            ++number;
        }

        if (number == index)
            return pointer;
        else
            throw new NoSuchElementException();
    }

    public Iterator iterator() {
        return new Iterator();
    }

    public static class Node {
        String description;
        Node pointer = null;

        public Node(String description) {
            this.description = description;

        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Node getPointer() {
            return pointer;
        }

        public void setPointer(Node pointer) {
            this.pointer = pointer;
        }
    }

    public class Iterator implements java.util.Iterator {
        private int currentInd = 0;

        @Override
        public boolean hasNext() {
            return currentInd > lastInd ? false : true;
        }

        @Override
        public Object next() {
            return get(currentInd++);
        }

        @Override
        public void remove() {
            Queque.this.remove(currentInd--);
        }
    }
}
