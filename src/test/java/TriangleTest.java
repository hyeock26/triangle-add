import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

    @Test
    void testEquilateral() {
        Triangle t = new Triangle(3, 3, 3);
        assertEquals("equilateral", t.classify());
    }
    @Test
    void testIsoscelesDifferentOrder() {
        Triangle t = new Triangle(3, 4, 3);
        assertEquals("isosceles", t.classify());
    }
}// 333 통과 343 실패 : side1 == side3 인 경우 찾지 못함 => 코드수정
