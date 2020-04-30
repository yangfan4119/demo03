package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

public class TemplateTest {

    //模板六 prsf
    private static final Customer CUSTOMER = new Customer();

    //psf
    public static final int NUM = 1;
    //psfi psfs
//    public static final int

//    public static final String
    //模板1:psvm
    public static void main(String[] args) {
        //模板2:sout
        System.out.println("hello");
        //变形：soutp/soutm/soutv/xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplateTest.main");
        System.out.println("args = " + args);
        int num1 = 10;
        System.out.println(num1);


        //模板3：fori
        String[] arr = new String[]{"1","2","3"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //变形iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }


        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(12);
        list.add(12);
        list.add(12);
        for (Object o : list) {
            System.out.println(o);
        }
        //变形list.fori  list.forr
        for (int i = 0; i < list.size(); i++) {

        }
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        //模板五：ifn
        ArrayList list1 = new ArrayList();
        list.add(12);
        list.add(12);
        list.add(12);
        if (list1 == null) {

        }
        //变形:inn
        if (list1 != null) {

        }
        //xxx.nn
        if (list1 != null) {

        }
        //xxx.null
        if (list1 == null) {

        }

    }

}
