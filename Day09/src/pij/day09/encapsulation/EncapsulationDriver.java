package pij.day09.encapsulation;

import java.util.ArrayList;
import java.util.List;

/**
 * Driver class to show that getters that return mutable fields are problematic:
 * they break encapsulation by introducing "aliases" that allow for accessing
 * objects referenced from private fields /directly/. Similar issues arise
 * with constructor/setter parameters of mutable classes!
 */
public class EncapsulationDriver {
    public static void sneaky(UnsafeClass u) {
        List<String> list = u.getEntries(); // alias of u.entries!
        list.clear(); // now u.entries has length 0
        list.add(null); // now u has a null entry
    }

    public static void sneaky(SafeClass s) {
        List<String> list = s.getEntries();
        list.clear(); // s is not affected!
        list.add(null);
    }

    public static void sneaky(ImmutableSafeClass i) {
        List<String> list = i.getEntries();
        list.clear(); // also i is not affected!
        list.add(null);
    }

    public static List<String> makeExampleList() {
        return new ArrayList<>(List.of("Programming", "in", "Java"));
    }

    public static void main(String[] args) {
        // With UnsafeClass, the sneaky method can affect our instance of
        // UnsafeClass through /aliasing/ of the field unsafe.entries.
        List<String> unsafeInput = makeExampleList();
        UnsafeClass unsafe = new UnsafeClass(unsafeInput, "Unsafe!");
        IO.println("unsafe before add: " + unsafe.getEntries());
        unsafeInput.add("muhahaha");
        IO.println("unsafe before sneaky: " + unsafe.getEntries());
        sneaky(unsafe);
        IO.println("unsafe after sneaky: " + unsafe.getEntries());

        // With SafeClass, no harm is done: no mutable data from inside the
        // object is returned that could be "corrupted" by the sneaky method.
        List<String> safeInput = makeExampleList();
        SafeClass safe = new SafeClass(safeInput, "Safe!");
        IO.println("safe before add: " + safe.getEntries());
        safeInput.add("muhahaha");
        IO.println("safe before sneaky: " + safe.getEntries());
        sneaky(safe);
        IO.println("safe after sneaky: " + safe.getEntries());

        // With ImmutableSafeClass, no harm is done either: no mutable data
        // from inside the object is returned that could be "corrupted" by
        // the sneaky method.
        List<String> immutableSafeInput = makeExampleList();
        SafeClass immutableSafe = new SafeClass(immutableSafeInput, "Safe!");
        IO.println("immutable safe before add: " + immutableSafe.getEntries());
        immutableSafeInput.add("muhahaha");
        IO.println("immutable safe before sneaky: " + immutableSafe.getEntries());
        sneaky(immutableSafe);
        IO.println("immutable safe after sneaky: " + immutableSafe.getEntries());
    }
}
