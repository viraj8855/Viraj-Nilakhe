package collection; //21//8-2-23

import java.util.ArrayList;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Collection2
{
	public static void main(String[] args) 
	{
		ArrayList x = new ArrayList();
		x.add(10);  //0
		x.add(20);  //1
		x.add(30);  //2
		x.add('A');  //3
		x.add("Viraj");  //4
		x.add(10.12);    //5
		
		System.out.println(x);
		System.out.println(x.size());  // GET SIZE size starts from 1, //index from 0
		System.out.println(x.get(4));  // GET SPECIFIC DATA
		
		x.set(3, 's');     //REPLACE DATA---> SET METHOD
		System.out.println(x);
		
		 x.remove(3);    // Remove data
		 System.out.println(x);
		 
		 System.out.println(x.size());
		 
		 x.add("virajn4140@gmail");    //6 // Add data
		 System.out.println(x);
		 System.out.println("new size is -->"+ x.size());

	}

}
