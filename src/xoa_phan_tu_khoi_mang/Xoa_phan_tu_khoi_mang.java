import java.util.Scanner;

public class Xoa_phan_tu_khoi_mang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước.
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Bước 2: Nhập X là phần tử cần xoá
        System.out.print("Nhập phần tử cần xoá: ");
        int x = input.nextInt();

        //Bước 3: Tìm X xem có xuất hiện trong mảng không. Nếu xuất hiện chỉ ra vị trí của X.
        int index_del = -1; //khởi tạo biến lưu vị trí cần xoá, mặc định là -1 để kiểm tra xem có tìm thấy phần tử trong mảng hay không
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                index_del = i;
                break;
            }
        }

        //Nếu không tìm thấy phần tử trong mảng, in ra thông báo và kết thúc chương trình
        if (index_del == -1) {
            System.out.println("Không tìm thấy phần tử trong mảng");
            return;
        }

        //Bước 4: Thực hiện xoá phần tử X khỏi mảng
        for (int i = index_del; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0; //gán giá trị 0 cho phần tử cuối mảng

        //Bước 5: In ra mảng sau khi xoá phần tử
        System.out.print("Mảng sau khi xoá " + x + " là: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
