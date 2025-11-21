class Node {
    private int value;
    private Node[] children = null;

    public Node(int value) {
        this.Node(value, 2);
    }

    public Node(int value, int numberChilds) {
        if (numberChilds > 0) {
            children = new Node[numberChilds];
        }
        this.value = value;
    }
}