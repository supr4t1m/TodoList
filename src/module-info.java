module TodoList {
    requires javafx.fxml;
    requires javafx.controls;
    /* module name cannot have '-', '.', '_' */
    /*removing underscore from the jar file solves the errors
    * the module name then will be the part without hyphen numbers and dots. */
    requires jlfgr;

    opens org.supratim.todoList;
}