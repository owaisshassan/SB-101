package sprint3.Evaluation.Ques1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Main {

	public static void main(String[] args) throws IOException {
		
		File f=new File("student.txt");
		try {
			if(f.exists()) {
				System.out.println("");
			}else {
				f.createNewFile();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		

      
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        	bw.write("Ram");
        	bw.write("\n");
            bw.write(68);
            bw.write("\n");
            bw.write(74);
            bw.write("\n");
            bw.write(59);
            bw.write("\n");
            bw.write(88);
            bw.write("\n");
            bw.write(65);
            bw.write("\n");
            
            bw.write("Sam");
            bw.write("\n");
            bw.write(86);
            bw.write("\n");
            bw.write(46);
            bw.write("\n");
            bw.write(23);
            bw.write("\n");
            bw.write(15);
            bw.write("\n");
            bw.write(96);
            bw.write("\n");
            bw.flush();
        
        bw.close();

        File f2=new File("reportCard.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f2)));
		
		
		for(int i=0;i<2;i++) {
			int sum=0;
			String naam=br.readLine();
			sum+=br.read();
			br.readLine();
			sum+=br.read();
			br.readLine();
			sum+=br.read();
			br.readLine();
			sum+=br.read();
			br.readLine();
			sum+=br.read();
			br.readLine();
			
			FileWriter fw2 = new FileWriter(f2);
	        BufferedWriter bw2 = new BufferedWriter(fw2);
	        bw2.write(naam+" total mark = "+sum +" and Average = "+(sum/5));
			System.out.println(naam+" total mark = "+sum +" and Average = "+(sum/5));
		}
        System.exit(0);  
      
		
		
	}
}
