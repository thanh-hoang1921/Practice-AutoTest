package QuanLyNhanVien;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary; // lương cơ bản mỗi tuần

	/**
	 * six-argument constructor
	 * 
	 * @param first first name of employee
	 * @param last last name of employee
	 * @param ssn SSN
	 * @param sales tổng doanh thu
	 * @param rate tỷ lệ hoa hồng
	 * @param salary lương cơ bản
	 */
	public BasePlusCommissionEmployee(String first, String last, String ssn, double sales, double rate, double salary) {
		super(first, last, ssn, sales, rate);
		setBaseSalary(salary); // xác nhận và lưu trữ tiền lương cơ bản
	}

	public void setBaseSalary(double salary) {
		if (salary >= 0.0)
			baseSalary = salary;
		else
			throw new IllegalArgumentException("Base salary must be >= 0.0");
	}

	public double getBaseSalary() {
		return baseSalary;
	} // end method getBaseSalary

	/**
	 * tính toán trả tiền; override method getPaymentAmount trong CommissionEmployee
	 * 
	 * @return trả lương cho nhân viên
	 */
	@Override
	public double getPaymentAmount() {
		return getBaseSalary() + super.getPaymentAmount();
	} 

	/**
	 * return String đại diện of BasePlusCommissionEmployee object
	 * 
	 * @return String representation of BasePlusCommissionEmployee object
	 */
	@Override
	public String toString() {
		return String.format("%s %s; %s: $%,.2f", "base-salaried", super.toString(), "base salary", getBaseSalary());
	}
}
