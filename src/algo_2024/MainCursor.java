package algo_2024;

public class MainCursor {

public static void main(String[] args) {
Stack links = new Stack();
Stack rechts = new Stack();

Cursor c = new Cursor(links, rechts);
String aString = "Hallo wält!";
char[] b = aString.toCharArray();
for (int i = 0; i < b.length; i++) {
c.type(b[i]);
//System.out.print(b[i]);
}

// while(!links.isEmpty()) {
// System.out.print(links.top());
// links.pop();
// }

for (int i = 0; i < 3; i++) {
c.moveLeft();
}

// while(!links.isEmpty()) {
// System.out.print(links.top());
// links.pop();
// }
// System.out.print(" ");
// while(!rechts.isEmpty()) {
// System.out.print(rechts.top());
// rechts.pop();
// }
//
c.delete();
c.type('e');
c.moveLeft();
// while(!links.isEmpty()) {
// System.out.print(links.top());
// links.pop();
// }
// System.out.print(" ");
// while(!rechts.isEmpty()) {
// System.out.print(rechts.top());
// rechts.pop();
// }
while(!links.isEmpty()) {
c.moveLeft();
}

while(!rechts.isEmpty()) {
System.out.print(rechts.top());
rechts.pop();
}
}
}