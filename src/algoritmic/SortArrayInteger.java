package algoritmic;


public class SortArrayInteger implements SortArray {
	private long count;
	
	public void sortByShakerInteger(int[] array) {
		count = 0;
		int left = 0; // ����� �������
        int right = array.length - 1; // ������ �������
        do
        {
            //�������� � ����� ������� "������� ��������"
            for (int i = left; i < right; i++)
            {
            	count = count + 1;
                if(array[i] > array[i+1])
                {
                    array[i] ^= array[i+1];
                    array[i+1] ^= array[i];
                    array[i] ^= array[i+1];
                    count = count + 3;
                }
            }
            right--; // ��������� ������ �������
            //�������� � ������ ������� "������ ��������"
            for (int i = right; i > left ; i--)
            {
            	count = count + 1;
                if(array[i] < array[i-1])
                {
                    array[i] ^= array[i-1];
                    array[i-1] ^= array[i];
                    array[i] ^= array[i-1];
                    count = count + 3;
                }
            }
            left++; // ����������� ����� �������
            count = count + 1;
        } while (left <= right);
	}
	
	public void sortByBubble(int[] array) {
		count = 0;
		int i = 0; 
		boolean flag;
		do {
			flag = false;
			for(int j = array.length - 2; j >= i; j--) {
				count = count + 1;
				if(array[j] > array[j+1]) {
					int c = array[j];
					array[j] = array[j+1];
					array[j+1] = c;
					count = count + 3;
					flag = true;
				}
			}
			i++;
			count = count + 1;
		}while(flag);
	}
	
	public long getCount() {
		return count;
	}
}
