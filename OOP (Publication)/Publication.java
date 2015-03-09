import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Дмитрий on 03.03.2015.
 */
public class Publication {
    Publication [] arr;
    static DateFormat date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    static Calendar cal = Calendar.getInstance();
    static String publicationText ;
    String name;

     public static void publish( Publication [] arr ){
        for ( int i=0;i<arr.length;i++){
            if(arr[i] instanceof News){
                System.out.println("                    -----------------NEWS-----------------");
                System.out.println(publicationText = " This is publication text " + "\n" + ">" + "\n" + ">" + "\n" + ">" + "\n" + ">" + "\n" + ">" );
                System.out.println(" Was print on " + date.format(cal.getTime()));

            }



             else if (arr[i] instanceof Announcement){
                System.out.println("                    -----------------Announcement-----------------");
                System.out.println(publicationText);
                System.out.println(" Was print on " + date.format(cal.getTime()));

            }
             else if(arr[i] instanceof Article){
                System.out.println("                    -----------------Article-----------------");
                System.out.println(publicationText);
                System.out.println(" Was print on " + date.format(cal.getTime()));

            }
        }

    }

}
