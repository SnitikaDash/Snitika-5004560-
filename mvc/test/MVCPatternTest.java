package mvc.test;

import mvc.controller.StudentController;
import mvc.model.Student;
import mvc.view.StudentView;

public class MVCPatternTest {
	public static void main(String[] args) {
        // Fetch student record from the database
        Student model = retrieveStudentFromDatabase();

        // Create a view : to write student details on console
        StudentView view = new StudentView();

        // Create controller
        StudentController controller = new StudentController(model, view);

        // Display initial details
        controller.updateView();

        // Update model data
        controller.setStudentName("Snitika");
        controller.setStudentGrade("A");

        // Display updated details
        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        return new Student("1", "Aani", "B");
    }
}
