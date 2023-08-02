//package java8;
//import java.io.FileWriter;
//import java.util.Arrays;
//import java.io.Writer;
//import java.util.List;
//import java.nio.*;
//
//public class JMeterExample {
//
//	//Default separator
//	char SEPARATOR = ',';
//	//function write line in csv
//	public void writeLine(FileWriter writer, String[] params, char separator)
//	{
//	   boolean firstParam = true;
//	   StringBuilder stringBuilder = new StringBuilder();
//	   String param = "";
//	   
//	   for (int i = 0; i < params.length; i++)
//	   {
//	      //get param
//	      param = params[i];
//	      log.info("this is for param check -----" +i);
//	      log.info(param.getClass().getSimpleName());
//	      log.info(param);
//	      log.info("----");
//	       
//	         //if the first param in the line, separator is not needed
//	       if (!firstParam) 
//	       {
//	           stringBuilder.append(separator);
//	       }
//	         //Add param to line
//	       stringBuilder.append(param);
//	      
//	       firstParam = false;
//	   }
//	   //prepare file to next line
//	   stringBuilder.append("\n");
//	   //add to file the line
//	   log.info(stringBuilder.toString());
//	   writer.append(stringBuilder.toString());
//	}
//	
//	
//	
//	String GameConfigResponse=vars.get("GameConfigResponse");
//	String WiconfResponse=vars.get("WiconfResponse");
//	String GameConfigEnabled=vars.get("GameConfigEnabled");
//	String GameConfiglossLimit=vars.get("GameConfiglossLimit");
//	String GameConfigstopOnWin=vars.get("GameConfigstopOnWin");
//	String maxAutoPlay=vars.get("maxAutoPlay");
//	String partnercode=vars.get("partnercode");
//	String opid=vars.get("opid");
//	log.info("this is opid " +opid);
//	
//	//get path of csv file (creates new one if its not exists)
//	String csvFile = "C:/Users/vinay.badave/Documents/result.csv"; // for example '/User/Downloads/blabla.csv'
//	log.info(csvFile + "created");
//	String[] params = {opid,partnercode,WiconfResponse,GameConfigResponse,GameConfigEnabled,maxAutoPlay,GameConfiglossLimit,GameConfigstopOnWin};
//	
//	FileWriter fileWriter = new FileWriter(csvFile,true);
//	
//	boolean flag = true;
//	if(flag) {
//		fileWriter.append("opid,partnercode,WiconfResponse,GameConfigResponse,GameConfigEnabled,maxAutoPlay,GameConfiglossLimit,GameConfigstopOnWin");
//		fileWriter.append("\n"); 
//		flag = false;
//		
//		'"' + WiconfResponse + '"';
//	}
//	
//	writeLine(fileWriter, params, SEPARATOR);
//	
//	
//	//proper close to file
//	fileWriter.flush();
//	fileWriter.close(); 
//	
//}
