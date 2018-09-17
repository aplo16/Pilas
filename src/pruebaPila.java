public class pruebaPila
{
    public static void main(String[] args) {
        Pila stack = new Pila();
        stack.push(5);
        stack.push(10);
        stack.push(30);
        stack.push(15);
        stack.pop();
        stack.imprimePila();
    }
}
