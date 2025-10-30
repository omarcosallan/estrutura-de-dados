public class Main {
    public static void main(String[] args) {
        // 1. Criando uma fila com capacidade inicial 3
        System.out.println("1. Criando uma fila com capacidade 3...");
        Queue<Character> fila = new Queue<>(3);
        System.out.println("Fila criada. Tamanho: " + fila.size() + ", Vazia? " + fila.isEmpty());

        // 2. Testando offer()
        System.out.println("\n2. Enfileirando 3 elementos (A, B, C)...");
        fila.offer('A');
        fila.offer('B');
        fila.offer('C');

        System.out.println("Tamanho atual: " + fila.size());
        System.out.println("Primeiro elemento: " + fila.peek());

        // 3. Testando o redimensionamento (resize)
        System.out.println("\n3. Enfileirando mais um elemento (D) para forçar o resize...");
        fila.offer('D');

        System.out.println("Tamanho apos resize: " + fila.size());
        System.out.println("Primeiro elemento (deve ser A): " + fila.peek());

        // 4. Testando pool()
        System.out.println("\n4. Desenfileirando elementos...");
        System.out.println("Elemento removido: " + fila.pool());
        System.out.println("Novo primeiro elemento: " + fila.peek());
        System.out.println("Tamanho atual: " + fila.size());

        System.out.println("\nDesenfileirando mais um elemento...");
        System.out.println("Elemento removido: " + fila.pool());
        System.out.println("Novo primeiro elemento: " + fila.peek());
        System.out.println("Tamanho atual: " + fila.size());

        // 5. Testando comportamento circular
        System.out.println("\n5. Testando comportamento circular (adicionando E, F, G)...");
        fila.offer('E');
        fila.offer('F');
        fila.offer('G');
        System.out.println("Tamanho atual: " + fila.size());
        System.out.println("Primeiro elemento (ainda C): " + fila.peek());

        // 6. Esvaziando a fila
        System.out.println("\n6. Esvaziando a fila completamente...");
        System.out.println("Removido: " + fila.pool()); // C
        System.out.println("Removido: " + fila.pool()); // D
        System.out.println("Removido: " + fila.pool()); // E
        System.out.println("Removido: " + fila.pool()); // F
        System.out.println("Removido: " + fila.pool()); // G

        System.out.println("Fila vazia? " + fila.isEmpty());
        System.out.println("Tamanho final: " + fila.size());

        // 7. Testando exceções em fila vazia
        System.out.println("\n7. Testando operacoes em fila vazia (deve lançar exceção)...");
        try {
            fila.pool();
        } catch (RuntimeException e) {
            System.out.println("  - Tentativa de pool() em fila vazia: " + e.getMessage());
        }

        try {
            fila.peek();
        } catch (RuntimeException e) {
            System.out.println("  - Tentativa de peek() em fila vazia: " + e.getMessage());
        }
    }
}