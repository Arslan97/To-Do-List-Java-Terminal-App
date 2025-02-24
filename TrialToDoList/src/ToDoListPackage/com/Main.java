package ToDoListPackage.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList todoList = new ToDoList(); // Create a new To-Do List
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to Your To-Do List App!");

        while (running) {
            System.out.println("\n---MENU---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Done");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");

            System.out.println("Enter your choice (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter Task Description");
                    String description = scanner.nextLine();
                    todoList.addTask(description);
                    break;
                case 2:
                    todoList.viewTasks();
                    break;
                case 3:
                    todoList.viewTasks();
                    System.out.println("Enter a task number to mark as done: ");
                    int doneIndex = scanner.nextInt() - 1;
                    todoList.markTaskAsDone(doneIndex);
                    break;
                case 4:
                    todoList.viewTasks();
                    System.out.print("Enter task number to delete: ");
                    int deleteIndex = scanner.nextInt() - 1;
                    todoList.deleteTask(deleteIndex);
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting To-Do List App. Goodbye! 👋");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1-5.");
            }
        }

        scanner.close();
    }
}