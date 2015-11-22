package test;

import org.springframework.stereotype.Service;

/**
 * @author Bert.radke <bert.radke@t-systems.com>
 */
@Service("messageParser")
public class MessageParser {

    public void parse(String message) {
        System.out.printf("Thread: %s received: %s\n", Thread.currentThread().getName(), message);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("closing");
        }
    }

}
