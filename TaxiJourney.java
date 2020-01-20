/**
 * The Following Class Program Code is an implementation of a prototype of taxi booking Application that is implemented in real life Examples.
 * the Class Program implements a super class "TaxiJourney"and sub classes "Driver" & "Passanger".
 * The Concept Behind using multiple classes is to demonstrate the concept of inheritance and encapsulation for the measures of Information security
 * And to Point out the concept of Polymorphism,Abstraction,Inheritance,Encapsulation.
 * 
 * The class program takes data variables or fields required for the journey or taxing booking concept to be complete and also taxi booking concept
 * is not valid if the passenger name and contact number is not associated wit the booking and along with the Driver name, Taxi model, and Taxi number
 * for identification purposes by the passenger.
 * 
 * Then the class implements Methods or behaviors for the variables to get the specified calculated fare for the booking based on time and date concepts
 *  To be specific the calculation of fare is based on the time and date of the booking data and time.
 *  if the booking time is after 8pm or 20.00 pm in evening then the fare calculated will be based on the charges set for night time journey or regular dates
 *  if the booking time if before 8pm or 20.00 pm in evening then the fare calculated will be based on the charges set for day time journey on regular dates.
 *  and if the journey booking date is on 25th December or 1st January then holiday fares will be calculated based on holiday charges set for booking specifications.
 * 
 * @author Anurag Jena / P2512726 / Msc Information Systems / De-Montfort University
 * @version 1.0 build 29 November 10, 2019
 * 
 */






// The Code of the class program starts from here //
/* As Specified by the criteria the class name is chosen as TaxiJourney*/


public class TaxiJourney {
	
	//Fields or Data Variables needed for the concept
/** @param.userinput Passenger City/Town Location intended for offers or discount prevailing in that city/town*/
	public String city_town;
/** @param.userinput Starting point or Pick up location of the Journey*/
	public  String start_location; 
/** @param.userinput Destination or End Point of Journey or Journey end stop.*/
	public  String end_location;				
/** @param.userinput The Starting Point or Pickup point location Post code intended for driver for better routing  and calculation of distance*/ 
	public  String start_location_postcode;		
/** @param.userinput The End point or Drop point Location Post code intended for driver to calculate distance of the journey.*/
	public  String end_location_postcode;		
/** @param.userinput Total Journey distance from the Pickup point to the drop point */
	public  double journey_distance_in_miles;	
	
/** @param.predefined The Base Fare that is Charged once booking is confirmed irrespective of the distance because
if the passenger intends no to take the booking still the resources of the booking will be used
therefore the base charge will encounter those charges on regular dates when no holidays occur */
	public double flat_fare;					
/** @param.predefined the charge per half mile during the time of day from 6 am to 8 pm */
	public  double day_base_fare_per_half_mile;		
/** @param.predefined the charge per mile during the time of the day from 6 am to 8 pm */
	public  double day_base_fare_per_mile;			
/** @param.predefined the charge per additional mile induced if the journey distance gets an increment in miles of traveling in day time from 6am to 8pm */
	public  double day_fare_per_additional_mile;	
/** @param.predefined the charge per half mile during the time of night from 8 pm to 6 am */
	public  double night_base_fare_per_half_mile;	
/** @param.predefined the charge per mile during the time of the night from 8 pm to 6 am */
	public  double night_base_fare_per_mile;		
/** @param.predefined the charge per additional mile induced if the journey distance gets an increment in miles of traveling in night time from 8pm to 6am */
	public  double night_fare_per_additional_mile;	
/** @param.predefined The Base Fare that is Charged once booking is confirmed irrespective of the distance because
if the passenger intends no to take the booking still the resources of the booking will be used
therefore the base charge will encounter those charges on the dates 25 December Christmas or 1st January New Year */
	public  double holiday_flat_fare;				
/** @param.predefined the charges set per half mile of journey distance on holidays 25th December or 1st January */
	public  double holiday_fare_per_half_mile;		
/** @param.predefined the charges set per mile of journey distance on holidays 25th December or 1st January */
	public  double holiday_fare_per_one_mile;		
/** @param.predefined the charge per additional mile induced if the journey distance gets an increment in miles of traveling on holidays 25th December or 1st January */
	public  double holiday_fare_per_additional_mile; 
/** @param.predefined the charges per minute waiting time of taxi for the passenger */
	public  double cost_per_minute;					
/** @param.userinput the approximate waiting time the customer intends for the taxi to wait */
	public  double taxi_waiting_time;					
/** @return.calculated the calculated fare based on the journey distance is greater than 1 mile during time 6am to 8pm */
	public  double day_fare;						
/** @return.calculated the calculated fare based on the journey distance is less than 1 mile during time 6am to 8pm */
	public  double day_fare_2;						
/** @return.calculated the calculated fare based on the journey distance is greater than 1 mile during time 8pm to 6am */
	public  double night_fare;						
/** @return.calculated the calculated fare based on the journey distance is less than 1 mile during time 8pm to 6am */
	public  double night_fare_2;					
/** @return.calculated the calculated fare based on the journey distance is greater than 1 mile during holidays 25th December or 1st January */
	public  double holiday_fare;					
/** @return.calculated the calculated fare based on the journey distance is less than 1 mile during holidays 25th December or 1st January */
	public  double holiday_fare_2;						
/** @param.userinput if the passenger wants to book a taxi for a future date */
	public  String future_date;						
/** @param.userinput the booking confirmation that enables the passenger to agree to the terms and conditions */
	public String confirm;							
	
	// Default constructor wit the predefined values for fixed charges variable (Referenced and Source https://www.nidirect.gov.uk/articles/taxi-fares)
	/** @defaultpredefinedConstructor */
	public TaxiJourney()
	{
		this.flat_fare=5.00;
		this.day_base_fare_per_half_mile=3.00;
		this.day_base_fare_per_mile=3.80;
		this.day_fare_per_additional_mile=1.60;
		this.night_base_fare_per_half_mile=3.40;
		this.night_base_fare_per_mile=4.20;
		this.night_fare_per_additional_mile=1.60;
		this.holiday_flat_fare=7.00;
		this.holiday_fare_per_half_mile=4.80;
		this.holiday_fare_per_one_mile=6.20;
		this.holiday_fare_per_additional_mile=2.80;
		this.cost_per_minute=0.20;
		this.day_fare=0.0;
		this.day_fare_2=0.0;
		this.night_fare=0.0;
		this.night_fare_2=0.0;
		this.holiday_fare=0.0;
		this.holiday_fare_2=0.0;
	}
	
	//Parameterized Constructor or Custom Constructor that enables the data entered by the user to be stored in variables defined.
	/** @customconstructor*/
	public TaxiJourney(String future_date,String city_town,String start_location,String end_location,String start_location_postcode,String end_location_postcode,double journey_distance_in_kms,double journey_distance_in_miles,double day_base_fare_per_half_mile,double day_base_fare_per_mile,double day_fare_per_additional_mile,double regular_day_fare,double night_base_fare_per_half_mile,double night_base_fare_per_mile,double night_fare_per_additional_mile,double holiday_fare_per_half_mile,double holiday_fare_per_one_mile,double holiday_fare_per_additional_mile,double cost_per_minute,double taxi_waiting_time,double day_fare,double day_fare_2,double night_fare,double night_fare_2,double holiday_fare,double holiday_fare_2, String confirm, double flat_fare, double holiday_flat_fare) {
		this.future_date=future_date;
		this.city_town=city_town;
		this.start_location=start_location;
		this.end_location=end_location;
		this.start_location_postcode=start_location_postcode;
		this.end_location_postcode=end_location_postcode;
		this.journey_distance_in_miles=journey_distance_in_miles;
		
	
		this.confirm=confirm;
	}

	// Auto Generated constructed to match the super call of Driver class to its Parent Class TaxiJourney for reference.
	/**@SuperCall*/
	public TaxiJourney(String driver_name, String taxi_model, String taxi_number, String driver_licence) {
		// Auto-generated constructor stub
	}
	// Auto Generated constructed to match the super call of passanger class to its Parent Class Driver for reference.
	/**@SuperCall*/
	public TaxiJourney(String passanger_name, long passanger_mobile_number) {
		// Auto-generated constructor stub
	}

	/** Parent Class TaxiJourney() getters methods */
	
/*The Method that includes the Function that calculates the journey fare if the distance is more than or equal to 1 mile during time 6am to 8pm on regular or no holiday dates stored and returned in the variable day_fare
 * the Formula being for Calculation : Base Fare + (Cost per mile * ride distance) + (Cost per minute * time in taxi while taxi is standing still or traveling very slowly) = Your Fare*/
	
	/** @methodreturn returns the calculated fare based on the time of the day from 6am to 8pm on non holidays if distance is more than or equal to 1 mile*/
	public double getday_fare_per_mile() {

		this.day_fare = flat_fare+(day_base_fare_per_mile*journey_distance_in_miles)+(cost_per_minute*taxi_waiting_time);
		return day_fare;
	}
	/*The Method that includes the Function that calculates the journey fare if the distance is less than 1 mile during time 6am to 8pm on regular or no holiday dates stored and returned in the variable day_fare_2
	 * the Formula being for Calculation : Base Fare + (Cost per mile * ride distance) + (Cost per minute * time in taxi while taxi is standing still or traveling very slowly) = Your Fare*/
	/** @methodreturn returns the calculated fare based on the time of the day from 6am to 8pm on non holidays if distance is less than 1 mile*/
	public double getday_fare_per_half_mile( ) {
	
		this.day_fare_2 = flat_fare+(day_base_fare_per_half_mile*journey_distance_in_miles)+(cost_per_minute*taxi_waiting_time);
		return day_fare_2;
	}
	/*The Method that includes the Function that calculates the journey fare if the distance is more than or equal to 1 mile during time 8pm to 6am on regular or no holiday dates stored and returned in the variable night_fare
	 * the Formula being for Calculation : Base Fare + (Cost per mile * ride distance) + (Cost per minute * time in taxi while taxi is standing still or traveling very slowly) = Your Fare*/
	/** @methodreturn returns the calculated fare based on the time of the night from 8pm to 6am on non holidays if distance is more than or equal to 1 mile*/
	public double getnight_fare_per_mile() {
	
		this.night_fare = flat_fare+(night_base_fare_per_mile*journey_distance_in_miles)+(cost_per_minute*taxi_waiting_time);
		return night_fare;
	}
	/*The Method that includes the Function that calculates the journey fare if the distance is less than 1 mile during time 8pm to 6am on regular or no holiday dates stored and returned in the variable night_fare_2
	 * the Formula being for Calculation : Base Fare + (Cost per mile * ride distance) + (Cost per minute * time in taxi while taxi is standing still or traveling very slowly) = Your Fare*/
	/** @methodreturn returns the calculated fare based on the time of the night from 8pm to 6am on non holidays if distance is less than 1 mile*/
	public double getnight_fare_per_half_mile( ) {

		this.night_fare_2 = flat_fare+(night_base_fare_per_half_mile*journey_distance_in_miles)+(cost_per_minute*taxi_waiting_time);
		return night_fare_2;
	}
	/*The Method that includes the Function that calculates the journey fare if the distance is more than or equal to 1 mile on holiday dates 25 December or 1st January stored and returned in the variable holiday_fare
	 * the Formula being for Calculation : Base Fare + (Cost per mile * ride distance) + (Cost per minute * time in taxi while taxi is standing still or traveling very slowly) = Your Fare*/
	/** @methodreturn returns the calculated fare based on holidays 25th December Christmas or 1st January New Year if distance is more than or equal to 1 mile*/
	public double getholiday_fare_per_mile() {

		this.holiday_fare = holiday_flat_fare+(holiday_fare_per_one_mile*journey_distance_in_miles)+(cost_per_minute*taxi_waiting_time);
		return holiday_fare;
	}
	/*The Method that includes the Function that calculates the journey fare if the distance is less than 1 mile on holiday dates 25 December or 1st January stored and returned in the variable holiday_fare_2
	 * the Formula being for Calculation : Base Fare + (Cost per mile * ride distance) + (Cost per minute * time in taxi while taxi is standing still or traveling very slowly) = Your Fare*/
	/** @methodreturn returns the calculated fare based on holidays 25th December Christmas or 1st January New Year if distance is less than 1 mile*/
	public double getholiday_fare_per_half_mile( ) {

		this.holiday_fare_2 = holiday_flat_fare+(holiday_fare_per_half_mile*journey_distance_in_miles)+(cost_per_minute*taxi_waiting_time);
		return holiday_fare_2;
	}
	/* Method Returning the journey details entered by the Passenger to be output as the booking details when booking is confirmed.  
	 */
	/** @methodreturn*/
	public String getTaxiJourney() {
		String journey_details="Journey Details\n Start Location:" + start_location + ",\n Destination:" +end_location+ ",Source Postcode:"+start_location_postcode+",Destination Postcode:"+end_location_postcode+",Distance in Miles:"+journey_distance_in_miles;
			return journey_details;
	}

}


/**
 *  @inheritedclass
 * Driver Subclass extending the Class TaxiJourney demonstrating the concept of inheritance and encapsulation
 * the concept for such an approach is that the taxi journey should include the driver and taxi details as a part of the booking
 * @author Anurag Jena / P2512726 / Msc Information Systems / De-Montfort University
 * @version 1.0 build 29 November 10, 2019
 */

class Driver extends TaxiJourney {
	
	/* Driver name is declared as private as its a unique entity and therefore it must be secure as no other class should be accessing it publicly */
/** @paraminput Name of Driver that will be the Taxi Driver for the passenger on the journey (String Type Data) */
	private  String driver_name; 		
/** @paraminput What type of Car (mini/Sedan/suv ,Color, Model ) will be dispatched for journey (String Type Data) */
	public  String taxi_model;			
	/* Taxi Number is declared as private as its a unique entity and therefore it must be secure as no other class should be accessing it publicly */
/** @paraminput Taxi Registration number that is mapped to the journey so that the passenger can easily identify the taxi (String Type Data) */
	private  String taxi_number;		
	/* Driver's Licence  is declared as private as its a unique entity and therefore it must be secure as no other class should be accessing it publicly */
/** @paraminput Not mandatory but the passenger should know the details of driver license for safety and Trust effectiveness. (String Type Data) */
	private  String driver_licence;		
	
	
	/** @DefaultConstructor for the class Driver
	 * */
	public Driver() {
		super (); // default super call to the parent class Taxi Journey for Reference and Validation of Relationship
		driver_name="";
		taxi_model="";
		taxi_number="";
		driver_licence="";		
	}
/** @ParameterizedConstructor or Custom Constructor for Driver Class implementation defining the variables data to be input by the user 
 * */
		public Driver(String driver_name,String taxi_model,String taxi_number,String driver_licence) {
			super (driver_name,taxi_model,taxi_number,driver_licence); // Super call to the parent class Constructor TaxiJourney()
			this.driver_name=driver_name;
			this.taxi_model=taxi_model;
			this.taxi_number=taxi_number;
			this.driver_licence=driver_licence;
}

/* Auto generated Constructor call to match the super call by sub class Passanger 
 * */
		/**@SuperCall*/
		public Driver(String passanger_name, long passanger_mobile_number) {
			super (passanger_name,passanger_mobile_number); // super call to reference the parent class Driver 
			// Auto-generated constructor stub
		}
/** @Overriding of the parent Class Method getTaxiJourney() with additional details of the subclass driver
 * Concept demonstrating Polymorphism
 * */
		@Override
		public String getTaxiJourney() {
			String journey_details="Driver Name:"+driver_name+",\n Taxi Model:"+taxi_model+",\n Taxi Number:"+taxi_number+",\n Driver Licence:"+driver_licence+",\nJourney Details\n Start Location:" + start_location + ",\n Destination:" +end_location+ ",Source Postcode:"+start_location_postcode+",Destination Postcode:"+end_location_postcode+",Distance in Kms:"+",Distance in Miles:"+journey_distance_in_miles;
				return journey_details;
		}

/* implicit conversion of data types to string format that is called by the overridden method getTaxiJourney() for output
 * */
		@Override
		public String toString() {
			String journey_details="Driver Name:"+driver_name+",\n Taxi Model:"+taxi_model+",\n Taxi Number:"+taxi_number+",\n Driver Licence:"+driver_licence;
				return journey_details;
		}
		
/** Subclass Driver getters() */
		
		//Method to get driver name 
		/** @methodreturn*/
		public String getdrivername( ) {
			return driver_name;
		}
		//Method to get Taxi model
		/** @methodreturn*/
		public String gettaximodel( ) {
			return taxi_model;
		}
		//Method to get taxi registration number
		/** @methodreturn*/
		public String gettaxinumber( ) {
			return taxi_number;
		}
		//Method to get Driver's Licence Number
		/** @methodreturn*/
		public String getdriverlicence( ) {
			return driver_licence;
		}
		
}
/** Creation of another sub class Passenger extending the class Driver and demonstration the concept of inheritance
 * the idea behind such an approach is every taxi booking will be having a taxi and driver which is mandatory
 * and every taxi journey and driver will need a passenger to complete the task intended for the taxi journey to be meaning full
 * 
 * The concept of Abstraction could be shown here but that would the make the concept a bit confusing
 * as abstract classes cannot have custom constructors and methods or in simple means no details on how the class is implemented
 * therefore rather a simple approach of re-extending the class is done.
 * 
 * @inheritedclass
 * @author Anurag Jena / P2512726 / Msc Information Systems / De-Montfort University
 * @version 1.0 build 29 November 10, 2019
 *
 */
class Passanger extends Driver {
	
/*Passenger name being being a unique entity therefore is defined as private and static for the method of accessing the variable using the class name
demonstrating encapsulation and ensuring privacy and security as no other class can access it.
the same concept is used for passenger mobile number */
	
/** @paramuserinput  Name of the Passenger or Customer who is booking the taxi for journey */
	private static String passanger_name; 			
/** @paramuserinput Mobile number of the Passenger for the details to be sent and identification purposes */
	private static long passanger_mobile_number;	
	
/** @CustomConstructor or Parameterized  for the passanger class defining the initial data and data type for the variables
 * that will hold corresponding user input
 long data type is used for passanger mobile number as the mobile number is 10 digit number*/	
	
	public Passanger(String passanger_name, long passanger_mobile_number) {
		passanger_name="";
		passanger_mobile_number=0;
		
	}
	/**@SuperCall*/
/* super initiated parameterized constructor to match up the call of super by sub class passanger to super class Driver */
	public Passanger(String passanger_name,long passanger_mobile_number,String driver_name,String taxi_model,String taxi_number,String driver_licence,String future_date,String city_town,String start_location,String end_location,String start_location_postcode,String end_location_postcode,double journey_distance_in_kms,double journey_distance_in_miles,double day_base_fare_per_half_mile,double day_base_fare_per_mile,double day_fare_per_additional_mile,double regular_day_fare,double night_base_fare_per_half_mile,double night_base_fare_per_mile,double night_fare_per_additional_mile,double holiday_fare_per_half_mile,double holiday_fare_per_one_mile,double holiday_fare_per_additional_mile,double cost_per_minute,double taxi_waiting_time,double day_fare,double day_fare_2,double night_fare,double night_fare_2,double holiday_fare,double holiday_fare_2, String journey_date) {
		super (passanger_name,passanger_mobile_number); // super call to reference the passanger class is inherited from driver class to validate inheritance by constructors
		Passanger.passanger_name=passanger_name;
		Passanger.passanger_mobile_number=passanger_mobile_number;

		
}
	/**Passenger class getters methods */
	
	/* Method to get Passanger name*/
	/**@methodreturn*/
	public String getpassangername( ) {
		return Passanger.passanger_name;
	}
	/* Method to get Passanger Mobile Number*/
	/**@methodreturn*/
	public long getpassangermobilenumber( ) {
		return Passanger.passanger_mobile_number;
	}
	
	/** @Overriding of the getTaxiJourney method defined in the driver class and TaxiJourney class with additional details
	 * of the passenger class as passenger name and passenger mobile number*/
	
	@Override
	public String getTaxiJourney() {
		String journey_details="Booking Details\n Name:"+passanger_name+",\n Mobile Number:"+passanger_mobile_number+",\nJourney Details\n Start Location:" + start_location + ",\n Destination:" +end_location+ ",Source Postcode:"+start_location_postcode+",Destination Postcode:"+end_location_postcode+",Distance in Kms:"+",Distance in Miles:"+journey_distance_in_miles;
			return journey_details;
	}
	

}