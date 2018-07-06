import java.io.*;
import java.io.IOException;
import java.net.*;

public class Server {
	public static void main(String[] args)
	{
		ServerSocket socket = null;
		Socket clientSocket = null;
		PrintWriter out = null;
		InputStreamReader in = null;
		BufferedReader inReader = null;
		BufferedReader txtReader = null;
		try {
			
			socket = new ServerSocket(3000);
			System.out.println("Server Waiting for Connection");
			clientSocket = socket.accept();
			System.out.println("Connection is successful waiting for commands");
			out = new PrintWriter(clientSocket.getOutputStream());
			out.flush();
			in = new InputStreamReader(clientSocket.getInputStream());
			inReader = new BufferedReader(in);
			String filename = inReader.readLine();
			String username = inReader.readLine();
			System.out.println("Filename: " + filename);
			System.out.println("Username: " + username);
			txtReader = new BufferedReader(new FileReader(filename));
			String line ="";
            if(!filename.equals("Server/database.txt"))
            {
                throw new FileNotFoundException("");
            }
            else out.println("Found");
            out.flush();
			boolean found = false;
			while(true){
				line = txtReader.readLine();
                if(line == null) break;
				if(line.contains(';'+username+';')) {
                    found = true;
                    break;
                }
			}
			if(!found)
            {
                out.println("InputNotFoundException");
                out.flush();
            }

			else
			{
                out.println("Found");
                out.flush();
				int printIndex = 2+username.length();
				String lastname = line.substring(line.indexOf(';', printIndex)+1, line.indexOf(';', printIndex+1));
				System.out.println("LastName: " + lastname );
				out.println(lastname);
                out.flush();
				printIndex += lastname.length();
				String firstname = line.substring(line.indexOf(';', printIndex)+1, line.lastIndexOf(';'));
				System.out.println("FirstName: " + firstname);
                out.flush();
				out.println(firstname);
				printIndex += firstname.length();
				String marks = line.substring(line.lastIndexOf(';')+1);
				System.out.println("Marks: " + marks);
				out.println(marks);
                out.flush();
				
				
			}
			inReader.close();
			txtReader.close();
			out.close();
			clientSocket.close();
			socket.close();

			
		} catch (FileNotFoundException e) {
			out.println("FileNotFoundException");
            out.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally
		{
		}
	}
}
