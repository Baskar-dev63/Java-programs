
public class polymorphism {
    void method(){
        System.out.println("default method ");
    }

    void method(int a){
        System.out.println("method overloaded by one parameter that is just an integer."+a);
    }

    void method(int a,int b){
        System.out.println("Again method overloaded by two parameters ,just adding the numbers:"+(a+b));
    }
    void method(String a){
        System.out.println("this method overloaded by one parameter different type:that is just an string."+a);
    }
}


public class main {
    public static void main(String[] args) {
        polymorphism obj1=new polymorphism();
        obj1.method();
        obj1.method(6);
        obj1.method(8,9);//here we add an extra different kinds of parameters also.
        obj1.method("string");//This all example for polymorphism Method OverLoading...
    }
             /*Method OverRiding in polymorphism that is unimplemented method 
                implemented in Antoher__ Class is a Example for Method Overriding...*/
                             
}
