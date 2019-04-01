package org.vaadin.goran;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

import java.util.ArrayList;
import java.util.List;

/**
 * The app entry point.
 */
@Route("")
@Tag("todo-app")
@HtmlImport("frontend://styles/shared-styles.html")
public class TodoApp extends VerticalLayout {

    private List<Todo> tasks = new ArrayList<>();

    private TextField todoInput;

    public TodoApp() {
        // input field and controls for adding new tasks
        todoInput = new TextField();
        todoInput.setPlaceholder("Add todo...");
        todoInput.addClassName("todo-input");
        todoInput.addKeyUpListener(Key.ENTER, e -> Notification.show("not yet implemented"));

        Button addTodo = new Button("Add");
        addTodo.addClickListener(event -> Notification.show("not yet implemented"));

        // existing tasks container

        // add to view
    }

}
