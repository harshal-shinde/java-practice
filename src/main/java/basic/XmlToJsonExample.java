package basic;

import org.json.JSONObject;
import org.json.XML;


public class XmlToJsonExample {
  public static void main(String[] args) throws Exception {
    String blobDataXML = "<SpinT>20</SpinT><bBet>5</bBet>";
    System.out.println(blobDataXML);
    String outputJson = convertXMLToJson(blobDataXML);
    System.out.println(outputJson);
    sampleMethod();

  }
  public static String convertXMLToJson(String blobDataXML) {
    if (blobDataXML == null || blobDataXML.isEmpty()) return null;
    return  "'" + XML.toJSONObject(blobDataXML) +"'";
  }

  public static void sampleMethod() {
    String blobDataXML = "<SpinT>20</SpinT><bBet>5</bBet>";
    JSONObject xmlJson = XML.toJSONObject("<root>" + blobDataXML + "</root>").getJSONObject("root");
    JSONObject orderedJson = new JSONObject();
    orderedJson.put("bBet", xmlJson.getInt("bBet"));
    orderedJson.put("SpinT", xmlJson.getInt("SpinT"));
    System.out.println(orderedJson.toString());
  }

  public static String convertXMLToJson(String blob) {
    if (blob == null || blob.isEmpty()) return null;
    JSONObject json = XML.toJSONObject(blob);
    String jsonString = json.toString();
    return StringEscapeUtils.escapeJson(jsonString);
  }
}
