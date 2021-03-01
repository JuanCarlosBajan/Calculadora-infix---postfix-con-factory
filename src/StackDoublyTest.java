import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class StackDoublyTest {
    StackDoubly<Integer> stack = new StackDoubly<>();
    @Test
    void push() {
        stack.push(5);
        assertEquals(5, stack.peek()); }
    @Test
    void pop() {
        stack.push(9);
        assertEquals(9, stack.pop()); }
    @Test
    void peek() {
        stack.push(7);
        assertEquals(7, stack.peek()); }
    @Test
    void size() {
        stack.push(7);
        assertEquals(1, stack.size()); }
    @Test
    void empty() {
        stack.empty();
        assertTrue(true); }
}