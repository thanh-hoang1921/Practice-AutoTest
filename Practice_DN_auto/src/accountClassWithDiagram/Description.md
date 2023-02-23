1. Khởi tạo Class Account gồm các thông tin: id (String), name (String), balance(int)
2. KHởi tạo 1 constructor có tham số cho class bên trên
3. Khởi tạo các method thực hiện yêu cầu bên dưới
- credit(amount: int): Nạp tiền vào tài khoản, tài khoản sẽ được cộng lên một khoản amount và thông báo thành công. Kiểm tra tham số là số dương.

- debit(amount: int): Thanh toán tiền, tài khoản sẽ được trừ một số tiền amount. Nếu số tiền thanh toán lớn hơn số tiền trong tài khoản thì thông báo thanh toán không thành công. Nếu tham số là âm thì báo lỗi invalid param

- tranferTo(account: Account, int amount): Chuyển tiền từ tài khoản này cho tài khoản khác. Kiểm tra nếu chuyển số tiền nhiều hơn tài khoản hiện A có thông báo lỗi chuyển tiền không thành công.

Ví dụ Account A có balance = 50, B có balance = 10. A.tranferTo(B, 10) => A (balance = 40), B (balance = 20).