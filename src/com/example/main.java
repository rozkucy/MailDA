package com.example;
import com.example.EmailSessionBean;

/**
 * Created with IntelliJ IDEA.
 * User: Szymon Średziński
 * Date: 26.03.13
 * Time: 14:40
 * To change this template use File | Settings | File Templates.
 */
public class main {
    public static void main(String[]args){
        EmailSessionBean Obiekt = new EmailSessionBean();
        Obiekt.sendEmail("szymek.s@gmail.com", "Tygodniówka", "W tym tygodniu modlisz się za: ...");
    }

}
