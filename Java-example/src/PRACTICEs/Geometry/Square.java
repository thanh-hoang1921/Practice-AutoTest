package PRACTICEs.Geometry;

public class Square extends Rectangle {

	public Square(int canh1, int canh2) {
		super(canh1, canh2);
	}

	public Square(int canh) {
		canh1 = canh2 = canh;
	}

	public double tinhChuVi() {
		return canh1*4;
	}


}
