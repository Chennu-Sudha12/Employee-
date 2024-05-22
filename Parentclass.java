class Parent {
    int x = 10;
}class Child extends Parent {
        int x = 20;
    }
    public class InheritanceExample{
        public static void main(String[] args){
            Child child = new Child();
            System.out.println(child.x);
            System.out.println(((Parent)child).x);
        }
        }
