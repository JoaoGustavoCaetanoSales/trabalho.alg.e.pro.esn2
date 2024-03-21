import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pontuacao = 0;

        String[] questoes = {
            "1. Qual classe é usada para ler entrada do usuário em Java?",
            "2. Qual classe em Java implementa a estrutura de dados de pilha?",
            "3. Qual interface em Java representa uma fila?",
            "4. Qual é a principal diferença entre ArrayList e LinkedList em Java?",
            "5. Qual método é usado para adicionar um elemento a uma ArrayList em Java?",
            "6. Qual método é usado para remover o último elemento de uma pilha em Java?",
            "7. Em uma Queue, qual método é usado para remover e retornar o próximo elemento?",
            "8. Qual classe Java representa uma estrutura de dados de fila (Queue)?",
            "9. Em qual posição o método peek() retorna o elemento em uma pilha?",
            "10. Qual método em Java é usado para verificar se uma ArrayList está vazia?",
            "11. Qual estrutura de dados em Java é uma implementação de fila?",
            "12. Em qual estrutura de dados a remoção de um elemento ocorre na frente?",
            "13. O que acontece quando uma pilha está cheia e tentamos adicionar mais elementos?",
            "14. Qual método é usado para remover um elemento específico de uma ArrayList?",
            "15. Em uma Queue, qual método é usado para adicionar um elemento?",
        };

        String[][] opcoes = {
            {"A) BufferedReader", "B) Scanner", "C) InputStreamReader", "D) System.in", "E) FileReader"},
            {"A) Stack", "B) LinkedList", "C) ArrayList", "D) PriorityQueue", "E) HashSet"},
            {"A) Stack", "B) ArrayList", "C) Queue", "D) LinkedList", "E) Set"},
            {"A) ArrayList é uma lista encadeada, enquanto LinkedList é uma lista de array.",
             "B) ArrayList é mais eficiente para operações de adição e remoção no meio da lista.",
             "C) LinkedList é mais eficiente para operações de adição e remoção no início e final da lista.",
             "D) ArrayList é uma fila, enquanto LinkedList é uma pilha.",
             "E) Não há diferença entre ArrayList e LinkedList."},
            {"A) add()", "B) insert()", "C) append()", "D) push()", "E) put()"},
            {"A) pop()", "B) remove()", "C) delete()", "D) dequeue()", "E) poll()"},
            {"A) pop()", "B) remove()", "C) dequeue()", "D) poll()", "E) next()"},
            {"A) Stack", "B) PriorityQueue", "C) LinkedList", "D) ArrayDeque", "E) Vector"},
            {"A) Top", "B) Bottom", "C) Meio", "D) Último", "E) Primeiro"},
            {"A) isEmpty()", "B) isNull()", "C) hasElements()", "D) hasData()", "E) hasContent()"},
            {"A) Stack", "B) ArrayList", "C) Queue", "D) LinkedList", "E) HashSet"},
            {"A) ArrayList", "B) LinkedList", "C) Stack", "D) PriorityQueue", "E) Set"},
            {"A) NullPointerException é lançada.", "B) Uma exceção de estouro de pilha é lançada.",
             "C) O elemento é descartado silenciosamente.", "D) O programa entra em um loop infinito.",
             "E) Uma exceção de estouro de memória é lançada."},
            {"A) delete()", "B) remove()", "C) erase()", "D) deleteAt()", "E) deleteElement()"},
            {"A) push()", "B) add()", "C) insert()", "D) enqueue()", "E) append()"},
        };

        String[] resposta = {"B", "A", "D", "C", "A", "A", "D", "D", "A", "A", "D", "B", "E", "B", "D"};

        // Loop para exibir perguntas e obter respostas
        for (int i = 0; i < questoes.length; i++) {
            System.out.println(questoes[i]);
            for (String opçao : opcoes[i]) {
                System.out.println(opçao);
            }
            System.out.print("Sua resposta: ");
            String userResposta = scanner.nextLine().toUpperCase();

            if (userResposta.equals(resposta[i])) {
                System.out.println("Resposta correta!\n");
                pontuacao++;
            } else {
                System.out.println("Resposta incorreta! A resposta correta é: " + resposta[i] + "\n");
            }
        }

        // Exibindo o resultado final
        System.out.println("Você acertou " + pontuacao + " de " + questoes.length + " perguntas.\n");
    }
}
