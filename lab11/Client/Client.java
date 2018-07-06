import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client {
	public static void main(String[] args){
		Socket socket = null;
		try {
			Scanner scan = new Scanner(System.in);
			socket = new Socket("localhost",3000);
			System.out.println("Input a filename:");
			PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
			PrintStream fw = new PrintStream(new File("Client/info.txt"));
			pw.println(scan.nextLine());
			pw.flush();
			System.out.println("Input a username:");
			pw.println(scan.nextLine());
			pw.flush();
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String line =  "";
            line = br.readLine();
			if(line.equals("FileNotFoundException"))
				throw new FileNotFoundException("File does not exist");
			line = br.readLine();
			if(line == null) throw new InfoNotFoundException("Your information was not on file");
            else if(line.equals("InputNotFoundException"))
				throw new InfoNotFoundException("Your information was not on file");
			fw.println("Lastname: " + br.readLine());
			fw.println("Firstname: " + br.readLine());
			fw.println("Marks: " + br.readLine());
			fw.flush();
			pw.close();
			socket.close();
			scan.close();			
		}	catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}	catch (InfoNotFoundException e) {
			System.out.println(e.getMessage());
		}	catch (IOException e) {
			e.printStackTrace();
		}
	}
}
