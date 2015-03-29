

public class HelloWorld {
	
	import java.io.IOException;
	 
	import javax.xml.parsers.DocumentBuilder;
	import javax.xml.parsers.DocumentBuilderFactory;
	import javax.xml.parsers.ParserConfigurationException;
	 
	import org.w3c.dom.Document;
	import org.w3c.dom.Element;
	import org.xml.sax.SAXException;
	 
	 
	    private void parseNow() throws ParserConfigurationException, SAXException,
	            IOException {
	        // Tạo một đối tượng DocumentBuilderFactory từ method tĩnh của nó
	        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	 
	        // Sét đặt việc kiểm tra tính hợp lệ của tài liệu sẽ phân tích sau này.
	        factory.setValidating(true);
	 
	        // Tạo đối tượng DocumentBuilder
	        DocumentBuilder builder = factory.newDocumentBuilder();
	 
	        // Lay ra nut Document (mo ta toan bo tai lieu xml cua file xmlFile.xml
	        Document xmlDoc = builder.parse("xmlFile.xml");
	        // Tu nut Document xmlDoc co the lay ra phan tu goc cua tai lieu XML
	        Element root = (Element) xmlDoc.getDocumentElement();
	        // In ra man hinh ten cua phan tu goc cua tai lieu XML xmlFile.xml la gi
	        System.out.println("Root name:" + root.getNodeName());
	    }
	 
	    public static void main(String[] args) {
	        BeginDOMDemo f = new BeginDOMDemo();
	        try {
	            f.parseNow();
	        } catch (ParserConfigurationException e) {
	            e.printStackTrace();
	        } catch (SAXException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }


	//public static void main(String[] args) 
		// TODO Auto-generated method stub
		/*
		 * System.out.println("...Chuong trinh in chuoi nguoc..."); try {
		 * System.out.println("Nhap ten cua ban:"); BufferedReader in = new
		 * BufferedReader(new InputStreamReader(System.in)); String myStr =
		 * in.readLine(); System.out.println("Chuoi vua nhap la:" + myStr);
		 * System.out.println("Day chuoi nghich dao la:"); for(int i =
		 * myStr.length() - 1; i >= 0; i--) System.out.print(myStr.charAt(i));
		 * if(myStr == (String)"Thanh"||myStr == (String)"thanh")
		 * System.out.println("I love you. Moa moa......=))"); else
		 * System.out.println("I don't know who you are =(("); }
		 * catch(IOException e) { System.out.println(e.toString()); }
		 */
	//}
}
