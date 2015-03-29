

public class HelloWorld {
	
	import java.io.IOException;
	 
	import javax.xml.parsers.DocumentBuilder;
	import javax.xml.parsers.DocumentBuilderFactory;
	import javax.xml.parsers.ParserConfigurationException;
	 
	import org.w3c.dom.Document;
	import org.w3c.dom.Element;
	import org.xml.sax.SAXException;

	public static void main(String[] args) {
		 TODO Auto-generated method stub
		
		 System.out.println("...Chuong trinh in chuoi nguoc..."); try {
		 System.out.println("Nhap ten cua ban:"); BufferedReader in = new
		 BufferedReader(new InputStreamReader(System.in)); String myStr =
		 in.readLine(); System.out.println("Chuoi vua nhap la:" + myStr);
		 System.out.println("Day chuoi nghich dao la:"); for(int i =
		 myStr.length() - 1; i >= 0; i--) System.out.print(myStr.charAt(i));
		 if(myStr == (String)"Thanh"||myStr == (String)"thanh")
		 System.out.println("I love you. Moa moa......=))"); else
		 System.out.println("I don't know who you are =(("); }
		 catch(IOException e) { System.out.println(e.toString()); }
	}
}
