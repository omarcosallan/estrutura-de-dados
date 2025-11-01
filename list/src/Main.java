public class Main {
    public static void main(String[] args) {
        // 1. Criando uma lista
        System.out.println("1. Criando uma lista...");
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Lista criada. Tamanho: " + list.getSize());
        System.out.println(list);

        // 2. Inserindo elementos
        System.out.println("\n2. Inserindo elementos...");
        System.out.println("   - Inserindo 10 no final (add)");
        list.add(10);
        System.out.println(list);

        System.out.println("   - Inserindo 20 no final (add)");
        list.add(20);
        System.out.println(list);

        System.out.println("   - Inserindo 5 no final (add)");
        list.add(5);
        System.out.println(list);

        // 3. Limpando elementos
        System.out.println("\n3. Limpando elementos...");
        list.clear();
        System.out.println(list);
    }
}