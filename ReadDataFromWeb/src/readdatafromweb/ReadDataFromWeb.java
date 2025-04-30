package readdatafromweb;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadDataFromWeb {

    public static void main(String[] args) {
//        File file =new File(pathname);

        Scanner s = new Scanner(System.in);

        try {

            System.out.println("Enter File Name...");
            String fileName = s.next();

            PrintWriter pw = new PrintWriter("C:\\Users\\user\\Desktop\\Java Store\\FileClass\\" + fileName + ".html");

            System.out.println("Enter Web Address...");
            String web = s.next();

            URL url = new URL("https://www." + web);
            Scanner scOut = new Scanner(url.openStream());
//            System.out.println(scOut.nextLine());

//            Pattern Match
//            Pattern pattern = Pattern.compile("<[^>]+>");
//
            while (scOut.hasNext()) {
                String x = scOut.nextLine();

//                Matcher matcher = pattern.matcher(x);
//
//                while (matcher.find()) {
//                    pw.println(matcher.group());
//                    System.out.println(matcher.group());
//                }
//
                pw.write(x);
                System.out.println(x);
            }

            pw.close();
            s.close();
        } catch (MalformedURLException ex) {
            Logger.getLogger(ReadDataFromWeb.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadDataFromWeb.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadDataFromWeb.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
