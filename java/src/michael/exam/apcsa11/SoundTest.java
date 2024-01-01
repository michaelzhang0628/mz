package michael.exam.apcsa11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SoundTest {

    @Test
    void testLimitAmplitude() {
        int[] samples = new int[] {40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223};
        Sound s = new Sound(samples);
        assertEquals(5, s.limitAmplitude(2000));
        assertEquals(2000, samples[1]);
        assertEquals(-2000, samples[3]);
        assertEquals(-2000, samples[5]);
        assertEquals(2000, samples[12]);
        assertEquals(2000, samples[13]);
    }
    
    @Test
    void testLimitAmplitudeNegative() {
        int[] samples = new int[] {40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223};
        Sound s = new Sound(samples);
        assertEquals(5, s.limitAmplitude(-2000));
        assertEquals(2000, samples[1]);
        assertEquals(-2000, samples[3]);
        assertEquals(-2000, samples[5]);
        assertEquals(2000, samples[12]);
        assertEquals(2000, samples[13]);
    }
    
    @Test
    void testLimitAmplitudeZero() {
        int[] samples = new int[] {40, -420, 0, 15, 0};
        Sound s = new Sound(samples);
        assertEquals(3, s.limitAmplitude(0));
        assertEquals(0, samples[0]);
        assertEquals(0, samples[1]);
        assertEquals(0, samples[2]);
        assertEquals(0, samples[3]);
        assertEquals(0, samples[4]);
    }
    
    @Test
    void testTrimSilenceFromBeginning() {
        int[] samples = new int[] {0, 0, 0, 0, -14, 0, -35, -39, 0, -7, 16, 32, 37, 29, 0, 0};
        Sound s = new Sound(samples);
        s.trimSilenceFromBeginning();
        samples = s.getSamples();
        assertEquals(-14, samples[0]);
        assertEquals(0, samples[1]);
        assertEquals(-35, samples[2]);
        assertEquals(-39, samples[3]);
        assertEquals(0, samples[4]);
        assertEquals(-7, samples[5]);
        assertEquals(16, samples[6]);
        assertEquals(32, samples[7]);
        assertEquals(37, samples[8]);
        assertEquals(29, samples[9]);
        assertEquals(0, samples[10]);
        assertEquals(0, samples[11]);
    }

}
