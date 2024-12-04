package algo_2024;

public class Cursor {
private StackNodeMitG links;
private StackNodeMitG rechts;
public Cursor(StackNodeMitG links, StackNodeMitG rechts) {
super();
this.links = links;
this.rechts = rechts;
}
public void moveLeft() {
rechts.push(links.top());
links.pop();
}
public void moveRight() {
links.push(rechts.top());
rechts.pop();
}
public void delete() {
links.pop();
}
public void type(char c) {
links.push(c);
}
}