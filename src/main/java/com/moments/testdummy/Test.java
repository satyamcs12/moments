package com.moments.testdummy;

public class Test {

  public static void main(String[] args) {
    Entity entity = new Entity<Integer>();
    entity.setEntityVal("string");
    entity.process();
  }

  static class Entity<T> {
    T entityVal;

    public T getEntityVal() {
      return entityVal;
    }

    public void setEntityVal(T entityVal) {
      this.entityVal = entityVal;
    }

    public void process() {
      System.out.println(entityVal);
    }
  }
}
