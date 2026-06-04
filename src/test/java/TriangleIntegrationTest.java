import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TriangleIntegrationTest {

    TriangleService service = new TriangleService();

    // =========================
    // 1. 정상 삼각형 통합 테스트
    // =========================

    @Test
    void integration_equilateral() {
        Triangle t = new Triangle(3, 3, 3);

        String result = service.analyze(t);

        assertEquals("equilateral,isosceles", result);
    }

    @Test
    void integration_rightAngled_scalene() {
        Triangle t = new Triangle(3, 4, 5);

        String result = service.analyze(t);

        assertEquals("right-angled,scalene", result);
    }

    @Test
    void integration_isosceles() {
        Triangle t = new Triangle(3, 3, 4);

        String result = service.analyze(t);

        assertEquals("isosceles", result);
    }

    @Test
    void integration_scalene() {
        Triangle t = new Triangle(4, 5, 6);

        String result = service.analyze(t);

        assertEquals("scalene", result);
    }

    // =========================
    // 2. 경계값 통합 테스트
    // =========================

    @Test
    void integration_impossible_smallSum() {
        Triangle t = new Triangle(1, 2, 10);

        String result = service.analyze(t);

        assertEquals("impossible", result);
    }

    @Test
    void integration_boundary_equalSum() {
        Triangle t = new Triangle(1, 2, 3); // 경계 (1+2=3)

        String result = service.analyze(t);

        assertEquals("impossible", result);
    }
}