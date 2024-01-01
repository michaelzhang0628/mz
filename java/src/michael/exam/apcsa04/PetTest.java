package michael.exam.apcsa04;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class PetTest {

    @Test
    void testCat() {
        assertEquals("meow", new Cat("fluff").speak());
    }

    @Test
    void testDog() {
        assertEquals("dog-sound", new Dog("bark").speak());
    }

    @Test
    void testKennel() {
        ArrayList<Pet> l = new ArrayList<Pet>();
        l.add(new Cat("cat"));
        l.add(new Dog("dog"));
        l.add(new LoudDog("louddog"));
        l.add(new Cat("tiger"));
        Kennel k = new Kennel(l);
        assertEquals("cat meow\ndog dog-sound\nlouddog dog-sounddog-sound\ntiger meow\n", k.allSpeakString());
    }
}
