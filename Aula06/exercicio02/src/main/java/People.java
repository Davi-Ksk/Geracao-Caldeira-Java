import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class People {

    private String name;
    private int age;

    Scanner scanner = new Scanner(System.in);

    Map<String, Integer> peopleMap = new HashMap<>();

    public People(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void defaultPeople(){
        peopleMap.put("Davi", 22);
        peopleMap.put("João", 20);
        peopleMap.put("Ana", 25);
        peopleMap.put("Maria", 88);
        peopleMap.put("Pedro", 70);
    }

    public void addPerson(){
        System.out.print("Digite o nome da pessoa que deseja adicionar: ");
        this.name = scanner.nextLine();
        System.out.print("Digite a idade da pessoa que deseja adicionar: ");
        this.age = scanner.nextInt();

        peopleMap.put(this.name, this.age);
        scanner.nextLine();

        System.out.println("Pessoa adicionada com sucesso!");
    }

    public void removePerson(){
        System.out.print("Digite o nome da pessoa que deseja remover: ");
        this.name = scanner.nextLine();
        peopleMap.remove(this.name);

        scanner.nextLine();
        System.out.println("Pessoa removida com sucesso!");
    }

    public void showPeople(){
        System.out.println("Lista de pessoas:");
        System.out.println(peopleMap);
    }

    public void showElderPeople(){
        System.out.println("Lista de pessoas com idade acima de 60 anos:");
        for (Map.Entry<String, Integer> entry : peopleMap.entrySet()) {
            String name = entry.getKey();
            int age = entry.getValue();

            if (age > 60) {
                System.out.println(name + " - " + age);
            }
        }
    }

}
