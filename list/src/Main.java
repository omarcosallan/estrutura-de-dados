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

        // 3. Buscando elementos por index
        System.out.println("\n3. Buscando elementos por index...");
        try {
            System.out.println(list.get(0));
            System.out.println(list.get(1));
            System.out.println(list.get(2));
            System.out.println(list.get(3));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // 4. Buscando index do elemento
        System.out.println("\n4. Buscando index do elemento...");
        System.out.println(list.indexOf(10));
        System.out.println(list.indexOf(20));
        System.out.println(list.indexOf(30));

        // 5. Inserindo por posição
        System.out.println("\n5. Inserindo por posição...");
        System.out.println("   - Inserindo 30 no index 2");
        list.add(2, 30);
        System.out.println(list);

        // 6. Removendo primeiro elemento
        System.out.println("\n6. Removendo primeiro elemento...");
        System.out.println("   - Removendo primeiro elemento (10)");
        list.removeFirst();
        System.out.println(list);

        // 7. Removendo último elemento
        System.out.println("\n7. Removendo último elemento...");
        System.out.println("   - Removendo último elemento (5)");
        list.removeLast();
        System.out.println(list);

        // 8. Removendo qualquer elemento
        System.out.println("\n8. Removendo qualquer elemento...");
        System.out.println("   - Removendo qualquer elemento");
        list.remove(0);
        System.out.println(list);

        // 9. Limpando elementos
        System.out.println("\n9. Limpando elementos...");
        list.clear();
        System.out.println(list);
    }
}