package algo_2024;

public class StackArrMitG  {
private Object [] arr ;
private int index= -1;

public StackArrMitG(int size) {
super();
this.arr = new Object[size];
}
@Override
public void push(T element) {
if(index == arr.length-1) {
throw new IllegalStateException();
}
index++;
arr[index]=element;
}

public void pop() {
if(index == arr.length-1) {
throw new IllegalStateException();
}
arr[index]=null;
index--;
}

public T top() {
if(isEmty()) {
throw new NoSuchElementException();
}
return (T) arr[index];
}

public boolean isEmty() {
return index == -1;
}
}