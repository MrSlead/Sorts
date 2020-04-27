package algoritmic;

public class SortArrayWork implements SortArray {

	public void sortByShakerInteger(Integer[] array) {
		int left = 0; // ����� �������
        int right = array.length - 1; // ������ �������
        do
        {
            //�������� � ����� ������� "������� ��������"
            for (int i = left; i < right; i++)
            {
                if(array[i] > array[i+1])
                {
                    array[i] ^= array[i+1];
                    array[i+1] ^= array[i];
                    array[i] ^= array[i+1];
                }
            }
            right--; // ��������� ������ �������
            //�������� � ������ ������� "������ ��������"
            for (int i = right; i > left ; i--)
            {
                if(array[i] < array[i-1])
                {
                    array[i] ^= array[i-1];
                    array[i-1] ^= array[i];
                    array[i] ^= array[i-1];
                }
            }
            left++; // ����������� ����� �������
        } while (left <= right);
	}
}
