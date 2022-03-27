import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class MainClass {
    public static void main(String[] args){

        ServerSocket serverSocket = null; // 레퍼런스 변수를 미리만들어줌
        Socket socket = null;

        try{
            serverSocket = new ServerSocket(9000);
            System.out.println("클라이언트 맞을 준비 완료!!");

            socket = serverSocket.accept();
            System.out.println("클라이언트 연결!!");
            System.out.println("socket이 뭔데 : " + socket);

        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            try{
                if(socket != null) socket.close();
                if(serverSocket != null) serverSocket.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
