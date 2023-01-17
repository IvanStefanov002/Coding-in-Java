import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		Socket socket = null;
		InputStreamReader inputStreamReader = null;
		OutputStreamWriter outputStreamWriter = null;
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		ServerSocket serverSocket = null;
		
		serverSocket = new ServerSocket(4567);
		
		while(true) {
			try {
				System.out.println("Server is listening...");
				socket = serverSocket.accept();
				System.out.println("Client connected!");
				
				inputStreamReader = new InputStreamReader(socket.getInputStream());
				outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
				
				bufferedReader = new BufferedReader(inputStreamReader);
				bufferedWriter = new BufferedWriter(outputStreamWriter);
				
				while(true) {
					String msgFromClient = bufferedReader.readLine();
					
					System.out.println("Client said: "+msgFromClient);
					bufferedWriter.write("MSG received");
					bufferedWriter.newLine();
					bufferedWriter.flush();
					
					if(msgFromClient.equalsIgnoreCase("BYE")) {
						System.out.println("Client disconnected!");
						break;
					}
				}
				
				socket.close();
				inputStreamReader.close();
				outputStreamWriter.close();
				bufferedReader.close();
				bufferedWriter.close();
				
			}catch (IOException e){
				e.printStackTrace();
			}
		}
	}

}
