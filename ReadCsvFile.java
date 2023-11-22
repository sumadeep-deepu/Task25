import java.io.*;
import java.util.Scanner;
public class ReadCsvFile {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        String fileName=sc.nextLine();

        File csFile=new File("C:/Users/sumadeep/Desktop/"+fileName);

        BufferedWriter bfr=new BufferedWriter(new FileWriter(csFile));
        bfr.write("Name, Age, City\n");
        String [] names={"sumadeep","charan","deepak"};
        int[] ages={21,22,23};
        String[] cities={"tpt","nlr","mas"};

        for(int i=0;i<names.length;i++){
            bfr.write(names[i]+", "+ages[i]+", "+cities[i]+"\n");
        }
        bfr.close();
        sc.close();


        File file=new File("C:/Users/sumadeep/Desktop/sumadeep.csv");
        FileReader fr=new FileReader(file);

        BufferedReader br=new BufferedReader(fr);

        String line="";

        while ((line=br.readLine())!=null) {
            String [] row=line.split(",");

            for (String index : row) {
                System.out.printf("%-9s",index);
            }
            System.out.println();
        }
        br.close();
    }
    
}
