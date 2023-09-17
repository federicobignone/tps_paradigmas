package queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

  public static final String SOMETHING = "Something";
  public static final String FIRST = "First";
  public static final String SECOND = "Second";
  public static final String QUEUE_IS_EMPTY = "Queue is empty";

  @Test public void test01QueueShouldBeEmptyWhenCreated() {
    assertTrue( new Queue().isEmpty() );
  }

  @Test public void test02AddElementsToTheQueue() {
    assertFalse( new Queue().add(SOMETHING).isEmpty() );
  }

  @Test public void test03AddedElementsIsAtHead() {
    assertEquals(SOMETHING, new Queue().add(SOMETHING).head() );
  }

  @Test public void test04TakeRemovesElementsFromTheQueue() {
    Queue queue = new Queue().add(SOMETHING);
    queue.take();
    
    assertTrue( queue.isEmpty() );
  }

  @Test public void test05TakeReturnsLastAddedObject() {
    Queue queue = getQueue();
    String addedObject = SOMETHING;
    queue.add( addedObject );
    
    assertEquals( addedObject, queue.take() );
  }

  @Test public void test06QueueBehavesFIFO() {
    Queue queue = getQueue();
    String firstAddedObject = FIRST;
    String secondAddedObject = SECOND;

    queue.add( firstAddedObject );
    queue.add( secondAddedObject );

    assertEquals( queue.take(), firstAddedObject );
    assertEquals( queue.take(), secondAddedObject );
    assertTrue( queue.isEmpty() );
  }


  @Test public void test07HeadReturnsFirstAddedObject() {
    Queue queue = getQueue();
    String firstAddedObject = FIRST;

    queue.add( firstAddedObject );
    queue.add(SECOND);

    assertEquals( queue.head(), firstAddedObject );
  }

  @Test public void test08HeadDoesNotRemoveObjectFromQueue() {
    Queue queue = getQueue();
    queue.add(SOMETHING);
    assertEquals( 1, queue.size() );
    queue.head();
    assertEquals( 1, queue.size() );
  }

  @Test public void test09SizeRepresentsObjectInTheQueue() {
    assertEquals( 2, new Queue().add(FIRST).add(SECOND).size() );
  }

  @Test public void test10CanNotTakeWhenThereAreNoObjectsInTheQueue() {
    Queue queue = getQueue();
    assertEquals(QUEUE_IS_EMPTY, assertThrows(Error.class,() -> queue.take()).getMessage());

  }

  @Test public void test09CanNotTakeWhenThereAreNoObjectsInTheQueueAndTheQueueHadObjects() {
    Queue queue = getQueue();
    queue.add(SOMETHING);
    queue.take();
    assertEquals(QUEUE_IS_EMPTY, assertThrows(Error.class,() -> queue.take()).getMessage());

  }

  @Test public void test10CanNotHeadWhenThereAreNoObjectsInTheQueue() {
    Queue queue = getQueue();
    assertEquals(QUEUE_IS_EMPTY, assertThrows(Error.class,() -> queue.head()).getMessage());
    }
  private static Queue getQueue() {
    Queue queue = new Queue();
    return queue;
  }

}