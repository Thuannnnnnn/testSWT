/**
 * class: SE1711
 * Tran Quoc Thuan
 * CE171329
 */
package j1.s.p0020.tranquocthuan.ce171329;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Analyze {

    String input;
    Scanner sc = new Scanner(System.in);
  

    /**
     * Phương thức input được sử dụng cho người dùng nhập đầu vào của dữ liệu nó
     * sẽ kiểm tra xem người dùng có nhập hay không nếu đầu vào trống sẽ dùng
     * do-while yêu cầu người dùng nhập lại!
     */
    public void input() {
        boolean check = true;
        System.out.println("==== Analysis String ==== ");
        //vòng lập cho phép người dùng nhập input đầu vào
        do {
            System.out.print("Input String: ");
            input = sc.nextLine().trim();
            check = true;
            //nếu đầu vào rỗng sẽ báo lỗi và cho người dùng nhập lại
            if (input.isEmpty()) {
                check = false;
                System.out.println("Input String can't empty!");
            }
            //vòng lập sẽ dừng nếu không chạy vào if
        } while (!check);
    }

    /**
     * phương thức Uppercase dùng ArrayList để thêm các kí tự đã được xử lí vào
     * list tên s và in ra màng hình list chứa các ký tự in hoa
     */
    public void Uppercase() {
       
        //khởi tạo list
       String s = " ";
        //vòng lập để duyệt qua các phần tử trong input 
        for (char c : input.toCharArray()) {
            //điều kiện nếu kí tự đó là in hoa sẽ thêm vào list
            if (Character.isUpperCase(c)) {
                s+=c;
                
            }
        }
        //nếu có ít nhất 1 kí tự in hoa sẽ in ra list
        if (!s.isEmpty()) {
            System.out.print("Uppercase Characters:");
            System.out.println(s);
        }
    }

    /**
     * phương thức Lowercase dùng ArrayList để thêm các kí tự đã được xử lí vào
     * list tên s và in ra màng hình list chứa các ký tự in thường
     */
    public void Lowercase() {
        //khởi tạo list
       String s = " ";
        //vòng lập để duyệt qua các phần tử trong input 
        for (char c : input.toCharArray()) {
            //điều kiện nếu kí tự đó là in thường sẽ thêm vào list
            if (Character.isLowerCase(c)) {
                s+= c;

            }
        }
        //nếu có ít nhất 1 kí tự in thường sẽ in ra list
        if (!s.isEmpty()) {
            System.out.print("Lowercase Characters:");
            System.out.println(s);
        }

    }

    /**
     * phương thức Lowercase dùng ArrayList để thêm các kí tự đã được xử lí vào
     * list tên s và in ra màng hình list chứa các ký tự đặc biệt
     */
    public void Special() {

        //khởi tạo list
        String s = " ";
        //vòng lập để duyệt qua các phần tử trong input 
        for (char c : input.toCharArray()) {
            //điều kiện nếu kí tự đó là ký tự đặt biệt sẽ thêm vào list
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                s+=c;

            }
        }
        //nếu có ít nhất 1 kí tự đặt biệt sẽ in ra list
        if (!s.isEmpty()) {
            System.out.print("Special Characters:");
            System.out.println(s);
        }
    }

    /**
     * phương thức AllChar sẽ dùng các điều kiện để check các ký tự nếu nó là kí
     * tự sẽ cộng vào chuỗi s
     */
    public void AllChar() {
        String s = " ";
        //vòng lập để duyệt qua các phần tử trong input 
        for (char c : input.toCharArray()) {
            //điều kiện nếu là kí tự sẽ cộng chuỗi
            if (Character.isLowerCase(c) || Character.isUpperCase(c)
                    || !Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                s += c;

            }
        }
        //nếu có ít nhất 1 kí tự sẽ in ra chuỗi
        if (!s.isEmpty()) {
            System.out.print("All Characters:");
            System.out.println(s);
        }
    }
    /**
     *  phương thức sẽ tìm và lưu trữ tất cả các số nguyên trong đầu vào.
     * nó sử dụng biểu thức chính quy (\\d+) để tìm kiếm các chuỗi số trong đầu vào. 
     * Sau đó, nó chuyển đổi các chuỗi số thành các số nguyên và thêm chúng vào danh sách numbers. 
     */
    public void Numbers() {
        // Tạo danh sách để lưu trữ các số nguyên
        List<Integer> numbers = new ArrayList<>();
         // Tạo một biểu thức chính quy để tìm các chuỗi số trong đầu vào
        Pattern pattern = Pattern.compile("\\d+");
        // Tạo một matcher để tìm kiếm các chuỗi số trong đầu vào
        Matcher matcher = pattern.matcher(input);
        // Duyệt qua tất cả các kết quả phù hợp được tìm thấy
        while (matcher.find()) {
            // Chuyển đổi chuỗi số thành số nguyên
            int number = Integer.parseInt(matcher.group());
            // Thêm số nguyên vào danh sách numbers
            numbers.add(number);
        }
        // Kiểm tra nếu danh sách numbers không trống thì sẽ in ra 
        if (!numbers.isEmpty()) { 
            System.out.print("All Numbers: "); 
            System.out.println(numbers); 
        }
    }
     /**
     *  phương thức sẽ tìm và lưu trữ tất cả các số nguyên chẵn trong đầu vào.
     * nó sử dụng biểu thức chính quy (\\d+) để tìm kiếm các chuỗi số trong đầu vào. 
     * Sau đó, nó kiểm tra có phải số chắn hay không nếu có sẽ
     * chuyển đổi các chuỗi số thành các số nguyên và thêm chúng vào danh sách numbers. 
     */
  public void evenNumbers() {
// Tạo danh sách để lưu trữ các số nguyên chẵn
    List<Integer> numbers = new ArrayList<>(); 
// Tạo một biểu thức chính quy để tìm các chuỗi số trong đầu vào
    Pattern pattern = Pattern.compile("\\d+"); 
    // Tạo một matcher để tìm kiếm các chuỗi số trong đầu vào
    Matcher matcher = pattern.matcher(input); 
    // Duyệt qua tất cả các kết quả phù hợp được tìm thấy
    while (matcher.find()) {
        // Chuyển đổi chuỗi số thành số nguyên
        int number = Integer.parseInt(matcher.group()); 
        // Kiểm tra số nguyên có phải là số chẵn không
        if (number % 2 == 0) { 
            // Thêm số nguyên chẵn vào danh sách numbers
            numbers.add(number); 
        }
    }
    // Kiểm tra nếu danh sách numbers không trống in ra danh sách các số nguyên chẵn
    if (!numbers.isEmpty()) { 
        System.out.print("Even Numbers: "); 
        System.out.println(numbers); 
    }
}
 /**
     *  phương thức sẽ tìm và lưu trữ tất cả các số nguyên lẻ trong đầu vào.
     * nó sử dụng biểu thức chính quy (\\d+) để tìm kiếm các chuỗi số trong đầu vào. 
     * Sau đó, nó kiểm tra có phải số lẻ hay không nếu có sẽ
     * chuyển đổi các chuỗi số thành các số nguyên và thêm chúng vào danh sách numbers. 
     */
public void oddNumbers() {
     // Tạo danh sách để lưu trữ các số nguyên lẻ
    List<Integer> numbers = new ArrayList<>();
    // Tạo một biểu thức chính quy để tìm các chuỗi số trong đầu vào
    Pattern pattern = Pattern.compile("\\d+"); 
     // Tạo một matcher để tìm kiếm các chuỗi số trong đầu vào
    Matcher matcher = pattern.matcher(input);
    // Duyệt qua tất cả các kết quả phù hợp được tìm thấy
    while (matcher.find()) { 
         // Chuyển đổi chuỗi số thành số nguyên
        int number = Integer.parseInt(matcher.group());
        // Kiểm tra số nguyên có phải là số lẻ không
        if (number % 2 != 0) { 
            // Thêm số nguyên lẻ vào danh sách numbers
            numbers.add(number); 
        }
    }
    // Kiểm tra nếu danh sách numbers không trống in ra danh sách các số nguyên lẻ
    if (!numbers.isEmpty()) { 
        System.out.print("Odd Numbers: ");
        System.out.println(numbers); 
    }
}
 /**
     *  phương thức sẽ tìm và lưu trữ tất cả các số nguyên chính phương trong đầu vào.
     * nó sử dụng biểu thức chính quy (\\d+) để tìm kiếm các chuỗi số trong đầu vào. 
     * Sau đó, nó kiểm tra có phải số chính phương hay không nếu có sẽ
     * chuyển đổi các chuỗi số thành các số nguyên và thêm chúng vào danh sách numbers. 
     */
public void squareNumbers() {
    // Tạo danh sách để lưu trữ các số nguyên bình phương
    List<Integer> numbers = new ArrayList<>(); 
    // Tạo một biểu thức chính quy để tìm các chuỗi số trong đầu vào
    Pattern pattern = Pattern.compile("\\d+"); 
     // Tạo một matcher để tìm kiếm các chuỗi số trong đầu vào
    Matcher matcher = pattern.matcher(input);
     // Duyệt qua tất cả các kết quả phù hợp được tìm thấy
    while (matcher.find()) {
        // Chuyển đổi chuỗi số thành số nguyên
        int number = Integer.parseInt(matcher.group());
        // Tính căn bậc hai của số nguyên
        double sqrt = (int)Math.sqrt(number); 
         // Kiểm tra số nguyên có là số bình phương hay không
        if (sqrt*sqrt == number) {
            // Thêm số nguyên bình phương vào danh sách numbers
            numbers.add(number); 
        }
    }
    // Kiểm tra nếu danh sách numbers không trống in ra danh sách các số nguyên bình phương
    if (!numbers.isEmpty()) { 
        System.out.print("Square Numbers: "); 
        System.out.println(numbers); 
    }
}
    /**
     * phương thức dùng để gọi các phương thức kiểm tra ở trên và show ra màn hình
     */
    public void show() {
        System.out.println("-----Result Analysis------");
        squareNumbers();
        oddNumbers();
        evenNumbers();
        Numbers();
        Uppercase();
        Lowercase();
        Special();
        AllChar();

    }
}
