# OOP-Project
Bài tập OOP:
Bài 01: Hãy cài đặt Class VanDongVien với các thông tin sau:
- Thuộc tính: Hoten (String), Tuoi (int), CanNang (Float), ChieuCao (Float)
- PhuongThuc: SoSanh(VanDongVien obj)  - Một vận động viên là lớn hơn nếu chiều cao lớn hơn. Trong TH chiều cao bằng nhau thì xét tới cân nặng.
Xuất phát từ lớp VanDongVien ở trên, hãy xây dựng một lớp CauThu kế thừa từ lớp VanDongVien với các thông tin thêm như sau:
-Thuoc tinh: Caulacbo (String), LuongTuan (int)
-PhuongThuc: SoSanh(CauThu obj) - Một cầu thủ là lớn hơn nếu họ nhận lương cao hơn. Trong trường hợp lương bằng nhau sẽ xét tới các tiêu chí như vận động viên cơ bản.

Xây dựng chương trình chính:
•	Khai báo p là đối tượng lớp Vandongvien (sử dụng hàm thiết lập 5 tham số), hiển thị thông tin của p ra màn hình.
•	Nhập vào một mảng gồm n cầu thủ.
•	Hiển thị danh sách đã nhập ra màn hình.
•	Sắp xếp mảng đã nhập theo thứ tự tăng dần, hiển thị danh sách đã sắp ra màn hình.

Bài 02: Hãy vận dụng lý thuyết về interface, xây dựng một giải thuật ghi log với 3 loại gồm: Log2Screen, Log2Email, Log2File. 
Trong mỗi loại có phương thức Write để đưa message vào vị trí mong muốn. 
Log2Screen sẽ ghi content ra màn hình, Log2Email sẽ gửi nội dung vào Email đã cấu hình, Log2File sẽ ghi content ra file. 
Việc ghi log theo loại nào hoàn toàn do cấu hình chương trình quyết định và có thể thay đổi trong quá trình sử dụng qua setting mà ko cần phải sửa code.
