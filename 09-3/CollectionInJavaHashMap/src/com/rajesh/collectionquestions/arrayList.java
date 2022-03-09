package com.rajesh.collectionquestions;

import java.util.ArrayList;

public class arrayList {

    public static void main(String[] a){
                  
                  ArrayList<String> al = new ArrayList<String>();
                  al.add("JAVA");
                  al.add("C++");
                  al.add("PERL");
                  al.add("PHP");
                  System.out.println(al);
                  al.add(2,"PLAY");
                  System.out.println(al);
    }
}
