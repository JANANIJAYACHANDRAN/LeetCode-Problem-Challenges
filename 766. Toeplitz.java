class Solution {
    public boolean isToeplitzMatrix(int[][] arr) {
         int r;
		int c;
		int safe;
		
	
		int mr;
		int mc;
		for( r = 0; r < arr.length ; r+=1)
		{
		   safe = arr [ r ] [ 0 ];
		   // loop
		   for( mr = r+1, mc = 1; mr < arr.length && mc < arr[0].length ; mr+=1, mc+=1)
		   {
			   if ( arr [ mr ] [ mc ] != safe )
				   return false;
		   }
		}
		
		// upper triangle
		r = 0;
		for( c = 1 ; c < arr [0].length; c+=1)
		{
		  safe = arr [ 0 ] [ c ]; 
		   // loop
		   for( mr = 1, mc = c+1; mr < arr.length && mc < arr[0].length ; mr+=1, mc+=1)
		   {
			   if ( arr [ mr ] [ mc ] != safe )
				   return false;
		   }
		}
		return true;


	}
        
    }
