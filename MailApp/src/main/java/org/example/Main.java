package org.example;

import org.example.email.GEmailSender;

public class Main {
    public static void main(String[] args){
        GEmailSender gEmailSender = new GEmailSender();
        String to = "chuwduminer@gmail.com";
        String from = "stratabp@gmail.com";
        String subject = "That's the example of the subject to send";
        String text = "That's the example of the text to send";
        boolean b = gEmailSender.sendEmail(to,from,subject,text);
        if(b){
            System.out.println("Email is sent successfully");
        }else {
            System.out.println("There is problem in sending email");
        }
    }
}