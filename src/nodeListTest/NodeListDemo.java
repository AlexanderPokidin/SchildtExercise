package nodeListTest;

public class NodeListDemo {
    public static void main(String[] args) {
        NodeList nodeList = new NodeList();
        try {
            nodeList.insert(0,3);
            nodeList.insert(0,3);
            nodeList.insert(0,3);
            nodeList.insert(0,5);
            nodeList.insert(2,7);
            nodeList.insert(5, 9);
            nodeList.insert(-3,5);
        }catch (IndexOutOfBoundsException exc){
            System.out.println(exc);
        }


    }
}
