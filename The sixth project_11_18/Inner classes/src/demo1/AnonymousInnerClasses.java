package demo1;

interface Inter {
    public void show();
    public void method();
}
class Outer  {
    public void function() {
        Inter ot = new Inter(){
          public void show() {
              System.out.println("show");
          }
          public void method() {
              System.out.println("method");
          }
        };
        ot.show();
        ot.method();
    }
}

