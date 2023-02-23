package PRACTICEs.UsingInterfaceAndAbstract;

import java.util.ArrayList;
import java.util.List;

public class RunTest {

	public static void main(String[] args) {
		List<DongVat> soThu = new ArrayList<>();

		ConMeo conMeo = new ConMeo("Meo con", 1);

		Ngua conNgua = new Ngua("Con ngua", 2);

		SuTu suTu = new SuTu("Con Su Tu", 3, 4);
		
		ChoCon cn1 = new ChoCon("cho" , 1);

		soThu.add(conMeo);
		soThu.add(conNgua);
		soThu.add(suTu);
		soThu.add(cn1);

		for (DongVat dongVat : soThu) {
			dongVat.hienThiTT();

			System.out.println("Gio Cho An:   " + dongVat.gioChoAn());
			if (dongVat instanceof DVAnCo) {
				DVAnCo dv = (DVAnCo) dongVat;
				dv.tamRua();
				
				dv.chupHinh();
			}

			if (dongVat instanceof ThuNuoi) {
				ThuNuoi dv = (ThuNuoi) dongVat;
				dv.tamRua();
				
				if (dv instanceof ChoCon) {
					ChoCon cv = (ChoCon) dv;
					cv.chupHinh();

				}
			}

			System.out.println("\n\n");
		}
	}

}
