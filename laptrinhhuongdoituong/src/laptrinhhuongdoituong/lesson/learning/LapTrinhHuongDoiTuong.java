package laptrinhhuongdoituong.lesson.learning;

import mypackage.lesson.learning.Example;
import mypackage.lesson.learning.Student;

class LapTrinhHuongDoiTuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4};
		
		Student studentA = new Student("Teo", 21, 1.76f, "University of Technology");
		
		studentA.getInfo();
		studentA.study();
		studentA.speak();
		LapTrinhHuongDoiTuong.print(studentA.gpaCalculation(8.5f, 9.3f));
		
		Example exampleA = new Example();
		exampleA.setArray(arr);
		exampleA.displayArray();
		
		try {
			int[] a = {1, 2, 3, 4};
			
			System.out.println(a[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static <T> void print(T input) {
		System.out.println(input);
	}

}
