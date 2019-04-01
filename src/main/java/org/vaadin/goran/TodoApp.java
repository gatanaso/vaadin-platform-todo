package org.vaadin.goran;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
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

    public TodoApp() {
        // input field and controls for adding new tasks

        // existing tasks container

        // add to view
    }

}
