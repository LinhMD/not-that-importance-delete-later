/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinhMD;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class MathUltilTest {
    
    //viết ra những việt những tình huống xài hàm getFactorial()
    //kiểm tra xem actual==expected hay ko
    //show ra màu xanh đỏ
    //ngoài ra nó còn dùng cho việc 
    /*
    CI - Continuous Integration
    CD - Continuous Delivery
    CT - Continuous Regression Test
    DevOps - Development & Operation
    */
    // app liên tục kiểm tra chất lượng
    //đẩy lên 1 server trung gian - STAGING ENVIROMENT để cho nhóm test sẵn sàng test ký
    // sau đó có thể đẩy thẳng lên PRODUCTION SERVER, MÁY CHẠY THẬT Ở NƠI KHÁC HÀNG
    //mọi thứ tự động ko cần con người can thiệp
    @Test //từ khóa này biến hàm này thành main()
    //trong hàm này sẽ show ra mầu xanh đỏ
    // đựa trên sự khác nhau giữa excepted với actual
    // đựa qua hàm assertEquals() mà thư viện cung cấp
    // assert...() đủ các loại hàm assert trên cuộc đời 
    public void getFactorial_RunsWell_IfValidArgument(){
        
    }
}
