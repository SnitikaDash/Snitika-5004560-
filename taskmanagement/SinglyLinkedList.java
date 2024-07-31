package taskmanagement;

public class SinglyLinkedList {
	private class Node {
        Task task;
        Node next;

        public Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head;

    public SinglyLinkedList() {
        head = null;
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Task searchTask(String taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId().equals(taskId)) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    public void deleteTask(String taskId) {
        if (head == null) {
            return;
        }

        if (head.task.getTaskId().equals(taskId)) {
            head = head.next;
            return;
        }

        Node current = head;
        Node previous = null;
        while (current != null && !current.task.getTaskId().equals(taskId)) {
            previous = current;
            current = current.next;
        }

        if (current != null) {
            previous.next = current.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList taskList = new SinglyLinkedList();

        Task t1 = new Task("T001", "Task 1", "Pending");
        Task t2 = new Task("T002", "Task 2", "Completed");
        Task t3 = new Task("T003", "Task 3", "In Progress");

        taskList.addTask(t1);
        taskList.addTask(t2);
        taskList.addTask(t3);

        System.out.println("Tasks in the list:");
        taskList.traverseTasks();

        System.out.println("\nSearching for Task T002:");
        Task searchResult = taskList.searchTask("T002");
        if (searchResult != null) {
            System.out.println("Found: " + searchResult);
        } else {
            System.out.println("Task not found.");
        }

        System.out.println("\nDeleting Task T002:");
        taskList.deleteTask("T002");
        taskList.traverseTasks();
    }
}
