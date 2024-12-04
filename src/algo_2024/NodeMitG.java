package algo_2024;


public class NodeMitG {
private T wert;
private NodeMitG next;
public NodeMitG(T wert, NodeMitG next) {
super();
this.wert = wert;
this.next = next;
}
public T getWert() {
return wert;
}
public void setWert(T wert) {
this.wert = wert;
}
public NodeMitG getNext() {
return next;
}
public void setNext(NodeMitG next) {
this.next = next;
}
}