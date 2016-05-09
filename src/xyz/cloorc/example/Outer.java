package xyz.cloorc.example;

import xyz.cloorc.example.Inner.*;

public class Outer {

  public static void main (String args []) throws Exception {
	  InnerDefault id = (new Inner()).new InnerDefault();
	  InnerPublic ip = (new Inner()).new InnerPublic();
	  InnerStatic is = new InnerStatic();
  }
}