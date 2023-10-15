package view;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.mockito.Mockito.*;


public class ViewTest {

    ViewGeneral viewGeneral = mock(ViewGeneral.class);

    @Test
    void viewMainTest () {
        viewGeneral.viewMain();
        verify(viewGeneral, times(1)).viewMain();
    }
    @Test
    void exitMenuTest () {
        try {
            Method method = ViewGeneral.class.getDeclaredMethod("exitMenu", int.class);
            method.setAccessible(true);
            method.invoke(viewGeneral, 2);
        } catch (NoSuchMethodException
                 | InvocationTargetException
                 | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
