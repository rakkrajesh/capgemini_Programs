package com.rajesh.collectionquestions;

import java.util.HashSet;
import java.util.Iterator;

public class collection {
public static void main(String[] args) {
                        HashSet <Integer> h = new HashSet <Integer> ();
                        h.add(14);
                        h.add(59);
                        Iterator<Integer> r =h.iterator();
                        while(r.hasNext()) {
                                    System.out.println(r.next());
                        } } }
