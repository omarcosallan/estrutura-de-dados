public class Main {
    public static void main(String[] args) {
        // 1. Criando uma árvore
        System.out.println("1. Criando uma árvore...");
        Tree<Integer> tree = new Tree<>(50);

        // 2. Inserindo elementos
        System.out.println("\n2. Inserindo elementos...");
        System.out.println("   - Inserindo 30 a esquerda de 50");
        tree.add(30);
        System.out.println("   - Inserindo 70 a direita de 50");
        tree.add(70);
        System.out.println("   - Inserindo 20 a esquerda de 30");
        tree.add(20);
        System.out.println("   - Inserindo 40 a direita de 30");
        tree.add(40);
        System.out.println("   - Inserindo 60 a esquerda de 70");
        tree.add(60);
        System.out.println("   - Inserindo 80 a direita de 70");
        tree.add(80);

        System.out.println("\nEstrutura da árvore:");
        System.out.println("      50");
        System.out.println("     /  \\");
        System.out.println("   30    70");
        System.out.println("  / \\   / \\");
        System.out.println(" 20 40 60 80\n");

        tree.inorder();

        // 3. Buscando subarvore
        System.out.println("\n\n3. Buscando subarvore...");
        Tree<Integer> search = tree.search(30);
        search.inorder();

        // 4. Buscando mínimo
        System.out.println("\n\n4. Buscando mínimo...");
        Integer min = tree.min();
        System.out.println("   - Mínimo deve ser 20: " + min);

        // 5. Buscando máximo
        System.out.println("\n5. Buscando máximo...");
        Integer max = tree.max();
        System.out.println("   - Máximo deve ser 80: " + max);
    }
}