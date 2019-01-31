package insertNode;

/*
* A node in a linked list can be thought of as divided into two parts.
* One part contains the data which can be anything that we want to store. It may
* be of primitive type, like int, double, etcetera. Or it can be an object reference,
* which may point to some object.
* The other part of the node holds the reference to the nextNode. That is,
* it points to the nextNode. And if it is the last element of the sequence which is null.
* */

public class Node {
    private int data;
    private Node nextNode;

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getNextNode() {
        return nextNode;
    }
}
