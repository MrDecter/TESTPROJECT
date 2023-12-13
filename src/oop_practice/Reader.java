package oop_practice;

import java.util.Arrays;


public class Reader {
    private String first_name,last_name,faculty,ticket_number,birthday,phone;

    String[] person_info = new String[6];

    public String getFirst_name() {return first_name;}
    public void setFirst_name(String first_name) {this.first_name = first_name;}
    public String getLast_name() {return last_name;}
    public void setLast_name(String last_name) {this.last_name = last_name;}
    public String getFaculty() {return faculty;}
    public void setFaculty(String faculty) {this.faculty = faculty;}
    public String getTicket_number() {return ticket_number;}
    public void setTicket_number(String ticket_number) {this.ticket_number = ticket_number;}
    public String getBirthday() {return birthday;}
    public void setBirthday(String birthday) {this.birthday = birthday;}
    public String getPhone() {return phone;}
    public void setPhone(String phone) {this.phone = phone;}
    public String[] getPerson_info() {return person_info;}
    public void setPerson_info(String[] person_info) {this.person_info = person_info;}



    public Reader(String first_name, String last_name, String faculty, String ticket_number, String birthday, String phone){
        this.first_name = first_name;
        this.last_name = last_name;
        this.faculty = faculty;
        this.ticket_number = ticket_number;
        this.birthday = birthday;
        this.phone = phone;

        this.person_info[0] = first_name;
        this.person_info[1] = last_name;
        this.person_info[2] = faculty;
        this.person_info[3] = ticket_number;
        this.person_info[4] = birthday;
        this.person_info[5] = phone;
    }
    public void all_info(){
        System.out.println(Arrays.toString(person_info));
    }
   public void take_book(String first_name, String last_name){
        System.out.println("Читатель: " + first_name + " " + last_name + "\nНомер билета: " + ticket_number);
   }
   public void return_book(){

   }

}
