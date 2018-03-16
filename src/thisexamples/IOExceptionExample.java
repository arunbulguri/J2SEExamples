package thisexamples;

 
import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;

 

public class IOExceptionExample {

 
    private static String filepath = "C:\\Users\\nikos\\Desktop\\TestFiles\\testFile2.txt";
     

    public static void main(String[] args) {

         

        BufferedReader br = null;
        String curline;

        try {

            br = new BufferedReader(new FileReader(filepath));

 

            while ((curline = br.readLine()) != null) {

                System.out.println(curline);

            }

 

        } catch (IOException e) {

         

            System.err.println("An IOException was caught :"+e.getMessage());

         

        }finally{

             

            try {

                 

                if(br != null)

                    br.close();
             

            } catch (IOException e) {

                 

                e.printStackTrace();

            }

        }
}
    }
