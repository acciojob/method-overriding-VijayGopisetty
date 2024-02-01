package com.driver;

public class Main {
  B obj1=new B();
  String str=obj1.meth();
  B obj2=new B();
  String str2= obj2.meth();
}
class A{
  public String meth(){
    return "Invoking method from class A";
  }
}
class B extends A{
  @Override
  public String meth(){
    return "Method is overridden in Extendend class B";
  }
}
