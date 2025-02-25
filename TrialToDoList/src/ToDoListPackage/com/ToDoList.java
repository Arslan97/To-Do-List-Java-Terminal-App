package ToDoListPackage.com;

import java.util.ArrayList;

public class ToDoList {
    private final ArrayList<Task> tasks; // Generic type declaration,,,it ensures type safety, meaning you cannot add
                                        //objects of a different type (e.g., String, Integer) to this list.

    // Constructor,,,, Must pass an existing list Manually in the argument field
    public ToDoList(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    // Constructor to initialize the task list,,,,No need to pass an existing list
    public ToDoList() {
        this.tasks = new ArrayList<>(); // The reference is set once and cannot be changed
    }

    // Add a new task to the list
    public void addTask(String description) {
        Task newTask = new Task(description); //create an object named by newTask
        tasks.add(newTask); //Array List Built-In "add" method
        System.out.println("Added: " + description);
    }

    // View all tasks in the list
    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No Tasks Available");
        }else {
            System.out.println("Here are your tasks: ");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + " " + tasks.get(i));
            }
        }
    }

    // Mark a task as done based on its position (index)
    public void markTaskAsDone(int taskIndex) {
        if (taskIndex < 0 || taskIndex >= tasks.size()) { // Negative numbers are not allowed...The index is out of range
            System.out.println("Invalid Task Number.");
        }else {
            tasks.get(taskIndex).markAsDone(); //Retrieves the task from the ArrayList at the given index.
                                            //Calls the markAsDone() method from the ""Task"" class, setting isDone = true
            System.out.println("Marked task " + (taskIndex + 1) + " as done.");
        }
    }

    //Delete a Task from the list
    public void deleteTask(int taskIndex){
        if (taskIndex < 0 || taskIndex >= tasks.size()) { // Negative numbers are not allowed...The index is out of range
            System.out.println("Invalid Task Number.");
        } else {
            System.out.println("Deleted task: " + tasks.get(taskIndex).getDescription());
            tasks.remove(taskIndex);
        }
    }

}
