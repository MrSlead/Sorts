package algoritmic;


public class SortArrayInteger implements SortArray {
	private long count;
	
	
	public void sortQuick(int[] array, int low, int high) {
		if(getCount() != 0) count = 0;
		sortQuickAlgoritm(array, low, high);
	}
	
	private void sortQuickAlgoritm(int[] array, int low, int high) {
		count++;
        if (array.length == 0)
            return;
        
        count++;
        if (low >= high)
            return;
 
       
        int middle = low + (high - low) / 2;
        int opora = array[middle];
 
      
        int i = low, j = high;
        while (i <= j) {
        	count++;
            while (array[i] < opora) {
                i++;
                count++;
            }
 
            while (array[j] > opora) {
            	count++;
                j--;
            }
            
            count++;
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                count += 3;
                i++;
                j--;
            }
        }
 
        count++;
        if (low < j)
        	sortQuickAlgoritm(array, low, j);
        count++;
        if (high > i)
        	sortQuickAlgoritm(array, i, high);
    }
	
	
	 public void sortDirectSelection(int[] array) {
		 count = 0;
		 for (int i = 0; i < array.length; i++, count++) {   
			 	count += 2;
	         	int pos = i;
	            int min = array[i];

	            for (int j = i + 1; j < array.length; j++, count++) {
	            	count++;
	                if (array[j] < min) {
	                    pos = j;  
	                    min = array[j];
	                    count += 2;
	                }
	            }
	            count += 2;
	            array[pos] = array[i];
	            array[i] = min;  
	        }
	    }
	
	public long getCount() {
		return count;
	}
}
