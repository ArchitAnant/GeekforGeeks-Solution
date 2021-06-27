package google.interview;

public class count_nodes_of_linked_list {
    public static int getCount(Node head)
    {
        Node temp = head;
        int count = 0;
        while (temp!=null){
            count++;
            temp = temp.next;
        }
        return count;

    }
}
