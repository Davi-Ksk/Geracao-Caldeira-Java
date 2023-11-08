import java.util.Scanner;
import java.util.Stack;

public class Books {

    Scanner scanner = new Scanner(System.in);

    private String title;
    private String category;

    Stack<String> bookStack = new Stack<>();

    public Books(String title, String category){
        this.title = title;
        this.category = category;
    }

    public void addBook(){
        System.out.print("Digite o titulo do livro:");
        this.title = scanner.nextLine();
        System.out.print("Digite a categoria do livro:");
        this.category = scanner.nextLine();

        String book = title + " - " + category;
        bookStack.push(book);

        System.out.println("Livro adicionado com sucesso!");
    }

    public void removeBook(){
        System.out.println("Retirando livro: " + bookStack.peek() + "...");
        bookStack.pop();
        System.out.println("Livro retirado com sucesso!");
        System.out.println("Pilha de livros:" + bookStack);
    }

    public void listBooks(){
        if (bookStack.isEmpty()){
            System.out.println("Pilha de livros vazia!");
        } else {
            System.out.println("Livros:");
            System.out.println(bookStack);
        }
    }

    public void clearBooksStack(){
        bookStack.clear();
        System.out.println("Pilha de livros limpa com sucesso!");
    }

}
