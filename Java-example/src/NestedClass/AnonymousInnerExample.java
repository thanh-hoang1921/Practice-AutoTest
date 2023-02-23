package NestedClass;

import PRACTICEs.Interface.Animal.DongVat;
/*
 * sử dụng loại Inner Class này khi bạn muốn ghi đè phương thức của lớp hoặc Interface
 */
public class AnonymousInnerExample {
	public static void main(String args[]) {

		// phan code khai bao va khoi tao mot lop Inner Class
		DongVat conNgua = new DongVat() {
			
			@Override
			public void chay() {
				System.out.println("toi co the chay");
				
			}
		};// phan ket thuc

		conNgua.chay();
	}
}
