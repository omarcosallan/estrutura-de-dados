public class Main {
    public static void main(String[] args) {
        // 1. Criando um vetor com capacidade 5
        System.out.println("1. Criando um vetor com capacidade 5...");
        Vector<Integer> vect = new Vector<>(5);
        System.out.println("Vetor criado. Tamanho: " + vect.size() + ". Está vazio? " + vect.isEmpty());
        System.out.println(vect);

        // 2. Testando add()
        System.out.println("\n2. Inserindo elementos...");
        System.out.println("   - Inserindo 10");
        vect.add(10);
        System.out.println(vect);

        System.out.println("   - Inserindo 20");
        vect.add(20);
        System.out.println(vect);

        System.out.println("   - Inserindo 30");
        vect.add(30);
        System.out.println(vect);

        System.out.println("   - Inserindo 40");
        vect.add(40);
        System.out.println(vect);

        System.out.println("   - Inserindo 50");
        vect.add(50);
        System.out.println(vect);

        // 3. Testando add(index, element)
        System.out.println("\n3. Tentando inserir por index...");
        System.out.println("   - Inserindo 9 no index 0");
        vect.add(0, 9);
        System.out.println(vect);

        System.out.println("   - Inserindo 19 no index 2");
        vect.add(2, 19);
        System.out.println(vect);

        System.out.println("\nVetor atualizado. Tamanho: " + vect.size() + ". Está vazio? " + vect.isEmpty());
        System.out.println(vect);

        // 4. Testando get(index)
        System.out.println("\n4. Acessando elementos por index...");
        System.out.println("   - Elemento no index 2 (deve ser 19): " + vect.get(2));
        System.out.println("   - Elemento no index 5 (deve ser 40): " + vect.get(5));
        try {
            System.out.println("   - Elemento no index 7 (deve lançar exceção): " + vect.get(7));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("   - Elemento no index 7 (deve lançar exceção): " + e.getMessage());
        }

        // 5. Testando contains(element)
        System.out.println("\n5. Verificando se existe elemento...");
        System.out.println("   - Contém 10: " + vect.contains(10));
        System.out.println("   - Contém 39: " + vect.contains(39));

        // 6. Testando getFirst(), getLast()
        System.out.println("\n6. Verificando primeiro e último elemento...");
        System.out.println("   - Primeiro elemento: " + vect.getFirst());
        System.out.println("   - Último elemento: " + vect.getLast());

        // 7. Testando remove(index)
        System.out.println("\n7. Removendo elemento...");
        System.out.println("   - Elemento no index 0 (deve ser 9): " + vect.remove(0));
        System.out.println("   - Elemento no index 1 (deve ser 19): " + vect.remove(1));
        System.out.println("\nVetor atualizado. Tamanho: " + vect.size() + ". Está vazio? " + vect.isEmpty());
        System.out.println(vect);

        // 8. Testando clear()
        System.out.println("\n8. Limpando o vetor...");
        vect.clear();
        System.out.println(vect);
    }
}