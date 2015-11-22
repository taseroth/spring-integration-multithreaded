package test;

import org.springframework.stereotype.Service;

/**
 * @author Bert.radke <bert.radke@t-systems.com>
 */
@Service("messageCreator")
public class MessageCreator {

    private int cnt = 0;

    public String createMessage() {
        String message = "test-" + cnt++;
        System.out.printf("Thread: %s creating message: %s\n", Thread.currentThread().getName(), message);
        return message;
    }
}
