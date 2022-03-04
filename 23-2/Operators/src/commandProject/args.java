class args{
public static void main(String[] args)
{
	System.out.println("hello this is india");
	int message1 =Integer.parseInt(args[0]);
	int message2 =Integer.parseInt(args[1]);
	System.out.println("arguments passed from command line= " + (message1+message2));
	
}
}