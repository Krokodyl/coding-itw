package lists;

public class ArbitraryNode {
    
    int value;
    ArbitraryNode next;
    ArbitraryNode arbitraty;

    public ArbitraryNode getNext() {
        return next;
    }

    public void setNext(ArbitraryNode next) {
        this.next = next;
    }

    public ArbitraryNode getArbitraty() {
        return arbitraty;
    }

    public void setArbitraty(ArbitraryNode arbitraty) {
        this.arbitraty = arbitraty;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("Node{%s,%s}",value,arbitraty.getValue());
    }
}
