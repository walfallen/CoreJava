
package wildCard;

public class Node<T> {

    public T data;

    public Node(T data) {
        this.data = data;
    }

    public void setData(T data) {
        System.out.println("Node.setData");
        this.data = data;
    }
}

public class MyNode extends Node<Integer> {

    public MyNode(Interger data) {
        super(data);
    }

    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }
}

public class typeErasure {

    public static void main(String[] args) {
        MyNode mn = new MyNode(5);
        Node n = mn;
        n.setData("Hello");
        Integer x = mn.data;
    }
}
