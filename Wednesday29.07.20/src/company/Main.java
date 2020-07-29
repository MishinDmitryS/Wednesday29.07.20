package company;

public class Main {
    public static void main(String[] args) {
        LList ll = new LList();
        ll.add("Test 1");
        ll.add("Test 2");
        ll.add("Test 3");
        int cout = ll.size();
        System.out.println(cout);

        Object JJ = ll.get(3);

        System.out.println(JJ);
    }
}

class Node{
    Object data;
    Node next;

    public Node(Object item){
        this.data = item;
    }
}

class LList{
    Node root;

    public void add(Object obj){
        if(obj == null){
            return;
        }
        Node node = new Node(obj);
        Node last = findLast();

        if(last == null){
            root = node;
        } else {
            last.next = node;
        }
    }

    public int size(){
        if(root == null){
            return 0;
        }
        int count = 1;
        Node currentNode = root;

        while(currentNode.next != null){
            currentNode = currentNode.next;
            count++;
        }

        return count;
    }

    public Object get(int id){
        if(root == null){
            return 0;
        } else {
            Node currentNode = root;
            int i = 0;

            while (currentNode.next != null) {
                if(i == id){
                    return currentNode.data;
                }
                currentNode = currentNode.next;
                i++;
            }
        }
        return 0;
    }

    private Node findLast(){
        if(root == null){
            return null;
        } else {
            Node currentNode = root;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }

            return currentNode;
        }
    }

}
