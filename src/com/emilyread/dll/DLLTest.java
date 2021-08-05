package com.emilyread.dll;

public class DLLTest {

	public static void main(String[] args) {
		DoublyLinkedLists DLL= new DoublyLinkedLists();
		
		DLL.push(12);
		DLL.push(13);
		DLL.push(14);
		DLL.push(13);
		DLL.push(12);
		
//		DLL.printForward();
//		DLL.printBackward();
		
//		DLL.pop();
//		DLL.pop();
//		DLL.pop();
//		DLL.pop();
//		DLL.pop();
		
//		DLL.printForward();
		
//		DLL.contains(12);
//		DLL.contains(16);
//		DLL.contains(20);
		
//		DLL.size();
//		DLL.pop();
//		DLL.size();
		
		DLL.insertAt(20, 3);
//		DLL.insertAt(20, 0);
//		DLL.printForward();
//		DLL.printBackward();
		
		DLL.removeAt(3);
//		DLL.printForward();
//		DLL.printBackward();
		
		DLL.isPalindrome();

	}

}
