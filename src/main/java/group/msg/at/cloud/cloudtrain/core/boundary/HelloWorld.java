package group.msg.at.cloud.cloudtrain.core.boundary;

import group.msg.at.cloud.cloudtrain.core.entity.Message;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.transaction.Transactional;

import java.util.Locale;
import java.util.UUID;

/**
 * Simple {@code Boundary} that returns welcome messages.
 */
@ApplicationScoped
@Transactional
public class HelloWorld {

    public Message getHelloMessage() {
        Message result = new Message(UUID.randomUUID());
        result.setCode("hello");
        result.setText("Welcome to Cloud Native Java with Quarkus!");
        result.setLocale(Locale.GERMAN);
        return result;
    }
}
