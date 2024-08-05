package com.gimhae;

class MyList{
	int[] arr;
	public MyList() {
		arr = new int[0];
	}
	public void add(int su) {
		int cnt = arr.length+1;
		int[] temp = new int[cnt];
		// ������ ���� -> �ϳ��� �迭�� ���� �����.
		System.arraycopy(arr,0,temp,0,cnt-1);
		arr = temp;
		arr[cnt-1] = su;
	}
	public int size() {
		return arr.length;
	}
	public int get(int idx) {
		return arr[idx];
	}
}
public class Ex15 {

	public static void main(String[] args) {
		MyList list = new MyList();
		// �� ������ ���� ������� -> ���ο� �迭�� ���� �� �������� �����ϸ� �迭�� �þ��(���� �迭)
		list.add(1111);
		list.add(2222);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		}
 
	}


