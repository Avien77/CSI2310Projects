

import textbook.StackWork;

public class packetSelector {
	// Define packets, and initialize it to null.
	private static StackWork packets;
	
	public static void main(String[] args) {
		
		System.out.println("Packet selector is now running...\n");
		
		packets = new StackWork(10, 10, 10);
		
		packets.Push(0, 95);
		packets.Push(0, 103);
		packets.Push(0, 81);
		packets.Push(0, 120);
		packets.Push(0, 74);
		packets.Push(0, 134);
		packets.Push(0, 62);
		packets.Push(0, 101);
		packets.Push(0, 59);
		packets.Push(0, 148);
		
		packets.displayStackData();
		
		reorganizeNetworkTraffic(1);
		
		packets.displayStackData();
		
	}
	
	
	// Precondition: The StackWork object packets is different than null.
	// Postcondition: The elements of the stack S0 that are equal to, or less than 100, are inserted in the stack S1.
	// The elements of the stack S0 that are greater than 100 are inserted in the stack S2.
        // The argument flg is flipped. In other words, if the caller passes 1, flg is set to 0. Similarly, if the caller passes 0, flg is set to 1. No further action is taken on flg. 
	public static void reorganizeNetworkTraffic(int flg)   
	{
		int currentElement;
		switch (flg) {
		case 0: 
			flg = 1;
		case 1:
			flg = 0;
		}
		for (int i = 0; i< 10; i++ ) {
			currentElement=packets.Pop(0);
			 if (currentElement > 100) {
				packets.Push(2,currentElement );
			 }
			 else {
				packets.Push(1, currentElement);
			 }
		 }
	} 
	
}       

