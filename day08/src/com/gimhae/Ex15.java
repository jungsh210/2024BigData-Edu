package com.gimhae;

class MyList{
	int[] arr;
	public MyList() {
		arr = new int[0];
	}
	public void add(int su) {
		int cnt = arr.length+1;
		int[] temp = new int[cnt];
		// 기존값 복사 -> 하나의 배열를 새로 만든다.
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
		// 맨 마지막 값만 살아있음 -> 새로운 배열을 만든 후 기존값을 복사하면 배열이 늘어난다(동적 배열)
		list.add(1111);
		list.add(2222);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		}
 
	}


