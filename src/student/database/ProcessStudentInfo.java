package student.database;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import xml.reader.Student;
import xml.reader.XmlReader;

public class ProcessStudentInfo {

		/*
		 * Under XmlReader class, the parseData() will return list of Student Info which will contain Student first name, last name and score.
		 * You need to write a method which will convert score into Grade in letter('A'for90 to 100,'B'for 80 to 89 and 
		 * 'C' for 70 to 79.Then print this to the console.
		 * Do any necessary steps that require for below successful output.
		 * .................................................
		 * Student (id= 1) "Marc" "Carp"   Grade= B
		 * Student (id= 2) "Israt" "Khan"   Grade= A
		 * Student (id= 3) "Mohi" "Uddin"   Grade= A
		 * Student (id= 4) "Abrar" "Hossain"   Grade= B
		 * Student (id= 5) "Abida" "Sultana"   Grade= B
		 * .................................................
		 * 
		 * 
		 */
			public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
				String pathSelenium  = "C:\\Users\\PeopleNTech\\workspace\\InClassCodingExam\\src\\xml\\reader\\data.xml";
				String pathQtp = "C:\\Users\\PeopleNTech\\workspace\\InClassCodingExam\\src\\xml\\reader\\qtp.xml";
				String tag = "id";
				Map<String, List<Student>> map = new LinkedHashMap<String, List<Student>>();
				List<Student> listSelenium = new ArrayList<Student>();
				List<Student> listQtp = new ArrayList<Student>();
				XmlReader reader = new XmlReader();
				listSelenium = reader.parseData(tag,pathSelenium);
				listQtp = reader.parseData(tag,pathQtp);
				map.put("Selenium", listSelenium);
				map.put("QTP", listQtp);
		      		
				for(Map.Entry<String,List<Student>> entry:map.entrySet()){
					System.out.println(entry.getKey()+"  "+entry.getValue());
				}
				
			}

}
