import javax.swing.*;
import java.util.Calendar;
public class Main {
    public static void main(String[] args) {
        System.out.println(upg88());
    }
    public static String upg88(){
        String date = Calendar.getInstance().getTime().toString();
        String[] datearray = date.split(" ");

       String  day = datearray[2];
       String  year = datearray[5];
       String[] monthArray = {("Jan"), ("Feb"), ("Mar"), ("Apr"), ("May"), ("Jun"), ("Jul"), ("Aug"), ("Sep"), ("Oct"), ("Nov"), ("Dec")};

       String month = null;

       for(int i = 0; i<12; i++){
           if(date.contains(monthArray[i])){
               i++;
               if(i<10){
                   month = ("0" + i);
               }
               else {
                   month = String.valueOf(i);
               }
           }
       }
        return(year + "-" + month + "-" + day);
    }
}