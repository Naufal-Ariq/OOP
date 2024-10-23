
package com.mycompany.inheritance;

public class Inheritance {

    public static void main(String[] args) {
     animal.cat();
     animal.lion();
     animal.Tiger();
     jenis.cat();
    }
}

class animal {
    static void cat() {
        System.out.println("Suara Kucing : miaww");
        
    }
    static void lion() {
            System.out.println("Suara Singa : aummm");
    
     }
    static void Tiger() {
        System.out.println("Suara Harimau : rawrrrrrrr");
    }
}
        
 class jenis extends animal {
     static void cat() {
         System.out.println("Jenis Kucing : anggora");
         System.out.println("Jenis Kucing : arabic");
     }
}
