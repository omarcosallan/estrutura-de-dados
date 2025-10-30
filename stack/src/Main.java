import java.util.EmptyStackException;

public class Main {
    public static void main(String[] args) {

        // 1. Criando uma pilha com capacidade inicial 3
        System.out.println("1. Criando uma pilha com capacidade 3...");
        Stack<Integer> pilha = new Stack<>(3);
        System.out.println("Pilha criada. Tamanho: " + pilha.size() + ", Vazia? " + pilha.isEmpty());

        // 2. Testando push(elemento)
        System.out.println("\n2. Empilhando 3 elementos (10, 20, 30)...");
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Tamanho atual: " + pilha.size());
        System.out.println("Elemento no topo: " + pilha.peek());

        // 3. Testando o redimensionamento (resize)
        System.out.println("\n3. Empilhando mais um elemento (40) para forçar o resize...");
        pilha.push(40);

        System.out.println("Tamanho após resize: " + pilha.size());
        System.out.println("Elemento no topo: " + pilha.peek());

        // 4. Testando pop()
        System.out.println("\n4. Desempilhando elementos...");
        System.out.println("Elemento removido: " + pilha.pop());
        System.out.println("Tamanho atual: " + pilha.size());
        System.out.println("Elemento no topo: " + pilha.peek());

        System.out.println("\nDesempilhando mais dois elementos...");
        System.out.println("Elemento removido: " + pilha.pop());
        System.out.println("Elemento removido: " + pilha.pop());
        System.out.println("Novo topo: " + pilha.peek());
        System.out.println("Tamanho atual: " + pilha.size());

        // 5. Esvaziando a pilha
        System.out.println("\n5. Esvaziando a pilha...");
        System.out.println("Elemento removido: " + pilha.pop());
        System.out.println("Pilha vazia? " + pilha.isEmpty());
        System.out.println("Tamanho final: " + pilha.size());

        // 6. Testando exceções em pilha vazia
        System.out.println("\n6. Testando operacoes em pilha vazia (deve lancar exceçãoo)...");
        try {
            pilha.pop();
        } catch (EmptyStackException e) {
            System.out.println("  - Tentativa de pop() em pilha vazia: " + e.getMessage());
        }

        try {
            pilha.peek();
        } catch (EmptyStackException e) {
            System.out.println("  - Tentativa de top() em pilha vazia: " + e.getMessage());
        }
    }
}