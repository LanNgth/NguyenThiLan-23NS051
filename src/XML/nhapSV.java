package XML;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class nhapSV {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập thông tin sinh viên:");
		System.out.print("ID= ");
		String id = scanner.nextLine();
		System.out.print("Name= ");
		String name = scanner.nextLine();
		System.out.print("Address= ");
		String address = scanner.nextLine();
		System.out.print("Day= ");
		String dayOfBirth = scanner.nextLine();

		saveStudentToXML(id, name, address, dayOfBirth);
	}

	private static void saveStudentToXML(String id, String name, String address, String dayOfBirth) {
		try {

			Document doc = XMLUtil.createDocument();

			Element studentElement = doc.createElement("student");
			studentElement.setAttribute("id", id);

			Element nameElement = doc.createElement("name");
			nameElement.appendChild(doc.createTextNode(name));

			Element addressElement = doc.createElement("address");
			addressElement.appendChild(doc.createTextNode(address));

			Element dayOfBirthElement = doc.createElement("dayOfBirth");
			dayOfBirthElement.appendChild(doc.createTextNode(dayOfBirth));

			studentElement.appendChild(nameElement);
			studentElement.appendChild(addressElement);
			studentElement.appendChild(dayOfBirthElement);

			doc.appendChild(studentElement);

			FileWriter writer = new FileWriter("student.xml");
			XMLUtil.transformDOMSourceToStreamResult(doc, writer);
			writer.close();

			System.out.println("Đã lưu thông tin vào file student.xml.");
			System.out.println();
		} catch (ParserConfigurationException | TransformerException | IOException e) {
			e.printStackTrace();
		}
	}
}
