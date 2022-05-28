package org.system;

public class Desktop extends Computer {
	
	public void desktopSize(String Desktop) {
		
		System.out.println("Size of the Desktop : "+ Desktop);
	}
	

	public static void main(String[] args) {
		
		Desktop dt=new Desktop();
		dt.desktopSize("11.6 inch");
		dt.computerModel("HP Envy 13");
		
}

}
