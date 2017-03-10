package org.romankushmiruk.germes.app.infra.util;

import org.junit.Test;
import org.romankushmiruk.germes.app.infra.exception.flow.InvalidParameterException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

/**
 * Verifies functionality of {@link Checks} class
 * @author RomanKushmiruk
 *
 */
public class ChecksTest {
    @Test
    public void testCheckParameterGetException() {
        try {
            Checks.checkParameter(false, "test");

            assertTrue(false);
        } catch (Exception ex) {
            assertSame(ex.getClass(), InvalidParameterException.class);
            assertEquals(ex.getMessage(), "test");
        }
    }

    @Test
    public void testCheckParameterNoException() {
        Checks.checkParameter(true, "test");
        assertTrue(true);
    }
}
