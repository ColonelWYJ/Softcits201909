package catchup_5;


import java.util.*;

public class TreeSetTest
{
	public static void main(String[] args)
	{
		TreeSet nums = new TreeSet();
		// ��TreeSet������ĸ�Integer����
		nums.add(5);
		nums.add(2);
		nums.add(10);
		nums.add(-9);
		// �������Ԫ�أ���������Ԫ���Ѿ���������״̬
		System.out.println(nums);
		// ���������ĵ�һ��Ԫ��
		System.out.println(nums.first()); // ���-9
		// �������������һ��Ԫ��
		System.out.println(nums.last());  // ���10

	}
}
