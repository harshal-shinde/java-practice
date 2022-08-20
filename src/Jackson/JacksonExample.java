package Jackson;

public class JacksonExample {
	
	public class Car {
		private String color;
		private String type;
	};

	//Java Object to JSON
//	ObjectMapper objectMapper = new ObjectMapper();
//	Car car  = new Car();
//	objectMapper.writeValue(new File("target/car.json"));
	
	//output will be
	//{"color" : "yellow", "type": "renault"}
}
