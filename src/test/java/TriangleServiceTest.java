import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleServiceTest {

    TriangleService service = new TriangleService();

    @Test
    void validTriangle_equilateralIsosceles() {

        Triangle mockTriangle = mock(Triangle.class);

        when(mockTriangle.getTypeFlags())
                .thenReturn("equilateral,isosceles");

        assertEquals("equilateral,isosceles",
                service.analyze(mockTriangle));
    }

    @Test
    void validTriangle_rightAndScalene() {

        Triangle mockTriangle = mock(Triangle.class);

        when(mockTriangle.getTypeFlags())
                .thenReturn("right-angled,scalene");

        assertEquals("right-angled,scalene",
                service.analyze(mockTriangle));
    }

    @Test
    void boundary_impossible() {

        Triangle mockTriangle = mock(Triangle.class);

        when(mockTriangle.getTypeFlags())
                .thenReturn("impossible");

        assertEquals("impossible",
                service.analyze(mockTriangle));
    }

    @Test
    void boundary_isosceles() {

        Triangle mockTriangle = mock(Triangle.class);

        when(mockTriangle.getTypeFlags())
                .thenReturn("isosceles");

        assertEquals("isosceles",
                service.analyze(mockTriangle));
    }
}