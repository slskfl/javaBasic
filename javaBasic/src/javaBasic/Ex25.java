package javaBasic;

public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체를 참조하는 배열
		/*String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println( strArray[0] == strArray[1] );
		System.out.println( strArray[0] == strArray[2] );
		System.out.println( strArray[0].equals(strArray[2]) );*/
		
		//배열 복사
		int[] oldIntArr = { 1, 2, 3};
		int[] newIntArr = new int[5];
		
		for(int i=0; i<oldIntArr.length; i++) {
			newIntArr[i] = oldIntArr[i];
		}
		
		for(int i=0; i<newIntArr.length; i++) {
			System.out.print(newIntArr[i] + ",");
		}
		System.out.println();
		
		String[] oldStrArr = { "java", "array", "copy" };
		String[] newStrArr = new String[5];
		
		System.arraycopy(oldStrArr, 0, newStrArr, 0, oldStrArr.length);
		
		for( int i=0; i<newIntArr.length; i++) {
			System.out.print(newStrArr[i] + ",");
		}
		
	}

}
