package innerclasses;

public class Outer {
    private String out = "out";
    private static String staticOut = "staticOut";

    private Inner inner = new Inner();

    public void testInnerIsVisibleInOuter() {
        IO.println("From method in Outer class - print fields from static Inner class:");
        IO.println(inner.in);         // access to private field in Inner class
        IO.println(Inner.staticIn);   // access to private static field in Inner class
        IO.println();

        inner.testOuterIsVisibleInInner();
    }

    public static class Inner { // obs: static
        private String in = "in";
        private static String staticIn = "staticIn";

        public void testOuterIsVisibleInInner() {
            IO.println("From method in static Inner class - print fields from Outer class:");
            // IO.println(out);        // access to private field in Outer class
            // Compile error: Non-static field out cannot be referenced from a static context
            IO.println(staticOut);  // access to private static field in Outer class
        }
    }

    //-----------------------------------------------------

    private Nested nested = new Nested();

    public void testNestedIsVisibleInOuter() {
        IO.println("From method in Outer class - print fields from non-static Nested class:");
        IO.println(nested.nest);         // access to private field in Inner class
        IO.println(Nested.staticNest);   // access to private static field in Inner class
        IO.println();

        nested.testOuterIsVisibleInNested();
    }

    private class Nested { // OBS: non-static
        private String nest = "nest";
        private static String staticNest = "staticNest";

        public void testOuterIsVisibleInNested() {
            IO.println("From method in non-static Nested class - print fields from Outer class:");
            IO.println(out);        // access to private field in Outer class
            IO.println(staticOut);  // access to private static field in Outer class
        }
    }

    void main() {
        Outer outer = new Outer();
        outer.testInnerIsVisibleInOuter();
        IO.println();
        outer.testNestedIsVisibleInOuter();
    }
}
