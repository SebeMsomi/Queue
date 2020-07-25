package org.example;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class QueueTest {
    @Test
    public void addingOneItemAndRemovingFromQueueWillReturnThatItem() throws Exception {
        QueueClass queue = new QueueClass();
        queue.enqueue("Item 1");
        assertThat(queue.dequeue(), is("Item 1"));
    }
    @Test
    public void multipleAddsAndRemovesInCorrectOrder() throws Exception {
        QueueClass queue = new QueueClass();
        queue.enqueue("Item 1");
        queue.enqueue("Item 2");
        assertThat(queue.dequeue(), is("Item 1"));

        queue.enqueue("Item 3");

        assertThat(queue.dequeue(), is("Item 2"));
        queue.enqueue("Item 4");
        queue.enqueue("Item 5");
        queue.enqueue("Item 6");

        assertThat(queue.dequeue(), is("Item 3"));
        assertThat(queue.dequeue(), is("Item 4"));

        System.out.println("The enqueue: " + queue);
    }
}
