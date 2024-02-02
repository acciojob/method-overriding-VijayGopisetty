package com.driver;

public class Main {
  public static class A{
    public String meth(){
      return "Invoking method from class A";
    }
  }
  public static class B extends A{
    public String meth(){
      return "Method is overridden in Extendend class B";
    }
  }

  B obj1=new B();
  String str=obj1.meth();
  B obj2=new B();
  String str2= obj2.meth();
}

