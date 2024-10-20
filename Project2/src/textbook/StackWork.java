package textbook;

public class StackWork
{
   private int[] S0;
   private int S0top;   
   private int S0length;
   
   private int[] S1;
   private int S1top;   
   private int S1length;
   
   private int[] S2;
   private int S2top;   
   private int S2length;   
   
   // Precondition: S0size, S1size, and S2size are greater than 0.
   // Postcondition: The stacks S0, S1, and S2, are created, and their respective lengths are initialized.
   public StackWork(int S0size, int S1size, int S2size)
   {
      this.S0length = S0size;
	   this.S1length = S1size;
	   this.S2length = S2size;
	   
	   this.S0 = new int[S0size];
	   this.S1 = new int[S1size];
	   this.S2 = new int[S2size];

      this.S0top = -1;
      this.S1top = -1;
      this.S2top = -1;
   }

   // Precondition: StackSelector is equal to 0, 1, or 2.
   // Postcondition: If StackSelector is 0, then the new element x is inserted in stack S0. If StackSelector is 1, 
   // then the new element x is inserted in stack S1. If StackSelector is 2, then the new element x is inserted 
   // in stack S2.
   public void Push(int StackSelector, int x)
   {
	   switch (StackSelector) {
	   		case 0:
            if (S0top < S0length -1){
	   			this.S0[++S0top] = x;
               break;
            }
            else{System.out.println("S2 Stack is full"); break;}      
	   		case 1:
            if (S1top < S1length -1){
               this.S1[++this.S1top] = x;
               break;
            }
            else{System.out.println("S2 Stack is full"); break;}      
	   		case 2:
            if (S2top < S2length -1){
               this.S2[++this.S2top] = x;
               break;
            }
            else{System.out.println("S2 Stack is full"); break;}   
	   		default:
               System.out.println("Invalid StackSelector.");
	   			break;
	   }
   }
   

   // Precondition: StackSelector is equal to 0, 1, or 2.
   // Postcondition: If StackSelector is 0, then an element is taken out of stack S0 and is returned to the caller. 
   // If StackSelector is 1, then an element is taken out of stack S1 and is returned to the caller.
   // If StackSelector is 2, then an element is taken out of stack S2 and is returned to the caller.
 
   public int Pop(int StackSelector)
   {
      //Takes last element of array and assigns it to poppedElement 
      int poppedElement;
	   switch (StackSelector) {
  		case 0:
         poppedElement = this.S0[this.S0top];
         this.S0[this.S0top] = 0;
  			S0top--;
         return poppedElement;
  		case 1:
        poppedElement = this.S1[this.S1top];
  			S1top--;
         return poppedElement;
  		case 2:
        poppedElement = this.S2[this.S2top];
  			S2top--;
         return poppedElement;
      default:
         System.out.println("Invalid stack.");
         return -1;
  }
   }
   
   
   // Precondition: 
   // Postcondition: The elements of the stack S0 are displayed, followed by the elements of the stack S1, and in the end
   // the elements of the Stack S2.
   public void displayStackData()
   {
      System.out.println("");
      System.out.println("Data in S0:");
	 for (int num : this.S0) {
      if (num != 0){
		 System.out.print(num +", ");
      }
	 }
    System.out.println("");
    System.out.println("Data in S1:");
	 for (int num : this.S1) {
      if (num != 0){
		 System.out.print(num +", ");
	 }
   }
    System.out.println("");
    System.out.println("Data in S2:");
	 for (int num : this.S2) {
      if (num != 0){
		 System.out.print(num +", ");
	 }
   }
   }

      
   // Precondition: The StackWork object exists.
   // Postcondition: The instance variable S0top is returned.
   public int getS0top()   
   {
	return this.S0top;   
   }
   
}	