package Set;

// A는
class A {
    int data;
    public A(int data) {
        this.data = data;
    }
}
class B {
    int data;
    public B(int data) {
        this.data = data;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof B) {
            this.data = ((B) obj).data;
            return true;
        }else {
            return false;
        }
    }
}

public class HashSet_2 {

}
