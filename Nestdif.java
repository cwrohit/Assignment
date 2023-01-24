class Nestdif
{
public static void main(String[]abc)
{
String address = "kolkata, India";

if(address.endsWith("India"))
{
if(address.contains("Dunlop"))
{
System.out.println("your city is dunlop");
}

else if(address.contains("Newtown"))
{
System.out.println("YOur city is Newtown");
}
else {
System.out.println(address.split(",")[0]);
}
}
else {
System.out.println("You are not living in india");
}
}
}