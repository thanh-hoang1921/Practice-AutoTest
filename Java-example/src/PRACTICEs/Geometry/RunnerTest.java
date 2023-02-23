package PRACTICEs.Geometry;

import java.util.Scanner;

public class RunnerTest {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

		Rectangle hcn = new Rectangle();
		hcn.inputData(sn);
		hcn.displayResult(hcn.tinhDienTich(), hcn.tinhChuVi());
		
		System.out.println("======*======");
		
		Pediment htg = new Pediment();
		htg.inputData(sn);
		htg.displayResult(htg.tinhDienTich(), htg.tinhChuVi());
		
		System.out.println("======*======");
	}
}
