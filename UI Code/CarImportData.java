package AutomotiveDealer;

import java.io.*;
import java.io.FileReader;
import java.util.ArrayList;

public class CarImportData 
{
	public static void main(String[] args) throws IOException 
	{
		ArrayList<VehicleDetailsObj> list = new ArrayList<VehicleDetailsObj>();
		File csv = new File(".\\VehicleDataCSV_t.csv");
		BufferedReader br = new BufferedReader(new FileReader(csv));
		String line = "";
		while((line = br.readLine()) != null)
		{
			String[] count = line.split(",");
			//System.out.println(count[0]+"  "+count[1]+"  "+count[2]+"  "+count[3]+"  "+count[4]+"  "+count[5]+"  "+count[6]+"  "+count[7]+"  "+count[8]);
			VehicleDetailsObj o = new VehicleDetailsObj();
			o.setVehicleId(count[0]);
			o.setCategory(count[1]);
			o.setYear(Integer.valueOf(count[2]));
			o.setMake(count[3]);
			o.setModel(count[4]);
			o.setType(count[5]);
			o.setSeatCount(Integer.valueOf(count[6]));
			o.setMileage(Float.parseFloat(count[7]));
			o.setPrice(count[8]);
			list.add(o);
			
		}
		
		
		
		
		System.out.println(list.get(0).getVehicleId());
	}
	
}