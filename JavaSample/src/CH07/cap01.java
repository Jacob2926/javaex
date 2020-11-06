package CH07;


 	
class cap01{
	public static void main(String args[]) {
		capsionch ctv = new capsionch();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		ctv.caption = true;
		ctv.displayCaption("Hello, World");
	}
}
