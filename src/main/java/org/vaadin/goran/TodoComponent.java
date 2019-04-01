package org.vaadin.goran;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.Tag;

import java.util.function.Consumer;

@Tag("todo-component")
public class TodoComponent extends Component implements HasStyle, HasComponents {

    private Todo todo;

    public TodoComponent(Todo todo, Consumer<TodoComponent> deleteHandler) {
        this.todo = todo;

        // description

        // done button

        // delete button
    }

    public final Todo getTodo() {
        return todo;
    }
}
