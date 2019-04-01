package org.vaadin.goran;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;

import java.util.function.Consumer;

@Tag("todo-component")
public class TodoComponent extends Component implements HasStyle, HasComponents {

    private Todo todo;

    public TodoComponent(Todo todo, Consumer<TodoComponent> deleteHandler) {
        this.todo = todo;

        // description
        Span description = new Span(todo.getDescription());

        description.addClassName("todo-description");

        add(description);

        // done button
        Button doneBtn = new Button();

        doneBtn.addClassName("todo-action");

        doneBtn.setIcon(new Icon(VaadinIcon.CHECK));

        doneBtn.addClickListener(event -> {
            todo.setDone(true);
            doneBtn.setEnabled(false);
            addClassName("done");

        });

        add(doneBtn);

        // delete button
    }

    public final Todo getTodo() {
        return todo;
    }
}
