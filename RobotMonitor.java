public class RobotMonitor
{
   	// constant (ensure you have at least MAX)
   	public static final int MAX = 6;
	public static final int MIN = 1;

	// attributes   
   	private int row;
	private int col;
	private Move move;

	// invariant
	public boolean inv() 
   	{
            // code here    
			return (inRange(row) && inRange(col) && move == null || move != null);
   	}
   	
   	// initialisation
   	public RobotMonitor()
   	{
           row = 1;
		   col = 1;
		   move = null;
   	}

	public boolean inRange(int num) {
		if(num >= MIN && num <= MAX) {
			return true;
		} else return false;
	}
   
   	//operations
   	public int GetCol()
	{
            // code here
			return col;
	}
	
	public int GetRow()
	{
            // code here
			return row;
	}
        
        public Move GetMove()
        {
            // DO NOT MODIFY if you are sticking to the simple Robot model
            return move;
        }
	
   	public void MoveRight() 
   	{
            /*
                CHECK precondtion
                IMPLEMENT postcondition
                CHECK invariant 
            */
			if (col >= MIN && col < MAX && move != move.LEFT) {
				col += 1;
				move = move.RIGHT;
			} else {
				throw new VDMException("precondition error");
			}

			if (!inv()) {
				throw new VDMException("Invariant broken");
			}
	}
	
	
	public void MoveLeft() 
   	{
            // code here    
			if (col > MIN && col <= MAX && move != move.RIGHT) {
				col -= 1;
				move = move.LEFT;
			} else {
				throw new VDMException("precondition error");
			}

			if (!inv()) {
				throw new VDMException("Invariant broken");
			}
	}
	
	public void MoveDown() 
   	{
            // code here     
			if (row >= MIN && row < MAX && move != move.UP) {
				row += 1;
				move = move.DOWN;
			} else {
				throw new VDMException("precondition error");
			}

			if (!inv()) {
				throw new VDMException("Invariant broken");
			}
	}
	
	public void MoveUp() 
   	{
            // code here   
			if (row > MIN && row <= MAX && move != move.DOWN) {
				row -= 1;
				move = move.UP;
			} else {
				throw new VDMException("precondition error");
			}

			if (!inv()) {
				throw new VDMException("Invariant broken");
			}         
	}
	
	public void Exit()
   	{
            // code here 
			if(row == MAX && col == MAX) {
				row = MIN;
				col = MIN;
			} else {
				throw new VDMException("precondition error");
			}

			if (!inv()) {
				throw new VDMException("Invariant broken");
			}
   	}
        
        // toString method added
        public String toString()
        {
            // modify if you are using the text based tester
            return " ";
        }
}