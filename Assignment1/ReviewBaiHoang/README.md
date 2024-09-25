
Bài tập của: Nguyễn Minh Hoàng
Link github: https://github.com/ngminhoang/vietis-BaiTapBuoi1.git
Người đánh giá: Nguyễn Văn Tuấn

Bài 1:
Vi phạm các nguyên tắc:
- 1 - Single Responsibility:  Interface Vehicle hiện tại có nhiều trách nhiệm khác nhau: Quản lý tên, điều khiển phương tiện, và cả hàm mặc định isNameUpperCase không trực tiếp tới trách nhiệm chính của 1 phương tiện.
- 3 - Liskov substitution: Các class Bike và Car khi thực thi các hành động có ném ra các exception, làm thay đổi tính đúng đắn của class cha (các hành động của class cha hiện hiện đánh dấu là sẽ không xảy ra lỗi).
- 4 - Interface Segregation: Các class Bike và Car phải implement những hành động mà nó không dùng tới như fly().

Khắc phục:
- 1: Nên tách isNameUpperCase làm một cái NameUtility riêng ở ngoài, là 1 phương thức tiện ích.
- 3: Tất cả phương thức trong Bike và Car hiện đều có thể throw ra Exception thì có thể đánh dấu vào interface Vehicle ở các hành động có thể sẽ throw ra exception để đảm bảo tính đúng đắn của chương trình.
- 4: Tách ra 1 interface nữa là Flyable có phương thức fly(), sau này nếu có thêm vehicle như airplane thì sẽ implement thêm cái này.

Bài 2:
Vi phạm các nguyên tắc:
- 1 - Single Responsibility: 
 + 1.1: Store hiện tại có nhiều trách nhiệm như quản lý sách, quản lý khách hàng, hiển thị sách, hiển thị khách hàng, và xử lý thanh toán.
 + 1.2: Lớp Order hiện tại có hai trách nhiệm là xử lý đơn hàng và gửi thông báo xác nhận, vi phạm SRP vì một lớp chỉ nên có một lý do để thay đổi.

Khắc phục:
- 1.1: Tách Store thành các lớp riêng biệt, BookStore chịu trách nhiệm quản lý sách, CustomerStore chịu trách nhiệm quản lý khách hàng, Store chỉ chịu trách nhiệm xử lý thanh toán.
- 1.2: Thực hiện tách việc gửi thông báo xác nhận ra khỏi lớp Order, lớp Order chỉ chịu trách nhiệm xử lý đơn hàng, còn lớp OrderProcessor chỉ chịu trách nhiệm gửi thông báo xác nhận.