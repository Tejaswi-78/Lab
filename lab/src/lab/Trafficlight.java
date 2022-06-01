package lab;

public class Trafficlight
{
	public static void main(String[]args)
	{
	String colour = "red";
     switch(colour)
     {
    	 case "red":System.out.println("stop");break;
    	 case "yellow":System.out.println("ready");break;
    	 case "green":System.out.println("go");break;
    	 default:System.out.println("invalid colour");
     }
	}

}
