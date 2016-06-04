/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.userrepo;

import java.awt.datatransfer.DataFlavor;

public class Student {

    private static final String SEPARATOR = ",";

    private String name;
    private String lastName;
    private String telNumber;
    private String address;
    private int markFiest;
    private int markSecond;
    private int markThird;
    private int markPracticl;

    public Student() {
    }

    public Student(String name, String lastName, String telNumber, String address, int markFiest, int markSecond, int markThird, int markPracticl) {
        this.name = name;
        this.lastName = lastName;
        this.telNumber = telNumber;
        this.address = address;
        this.markFiest = markFiest;
        this.markSecond = markSecond;
        this.markThird = markThird;
        this.markPracticl = markPracticl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarkPracticl(int markPracticl) {
        this.markPracticl = markPracticl;
    }

    public static String getSEPARATOR() {
        return SEPARATOR;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public String getAddress() {
        return address;
    }

    public int getMarkFiest() {
        return markFiest;
    }

    public int getMarkSecond() {
        return markSecond;
    }

    public int getMarkThird() {
        return markThird;
    }

    public int getMarkPracticl() {
        return markPracticl;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMarkFiest(int markFiest) {
        this.markFiest = markFiest;
    }

    public void setMarkSecond(int markSecond) {
        this.markSecond = markSecond;
    }

    public void setMarkThird(int markThird) {
        this.markThird = markThird;
    }

    public boolean czyZaliczyl() {
        return this.markFiest > 2 && this.markSecond > 2 && this.markThird > 2 && this.markPracticl > 2;
    }

    @Override
    public String toString() {
        return this.name + SEPARATOR + this.lastName + SEPARATOR + this.telNumber + SEPARATOR + this.address + SEPARATOR + this.markFiest + SEPARATOR + markSecond + SEPARATOR + markThird + SEPARATOR + markPracticl;
    }

}
