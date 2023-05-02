
/* 
Тестирование метода hasNext() для пустой коллекции
*/
@Test
public void testEmptyCollectionHasNext() {
    Collection collection = new Collection("");
    Iterator iterator = collection.getIterator();
    assertFalse(iterator.hasNext());
}

/*
Тестирование метода hasnext() для коллекции с одним изображением
*/
public void testSingleImageCollectionHasNext() {
    Collection collection = new Collection("test_images/image");
    Iterator iterator = collection.getIterator();
    assertTrue(iterator.hasNext());
    assertEquals("file:test_images/image1.png", iterator.next());
    assertFalse(iterator.hasNext());
}
/*
Тестирование метода next() для коллекции с одним изображением:
*/


@Test
public void testSingleImageCollectionNext() {
    Collection collection = new Collection("test_images/image");
    Iterator iterator = collection.getIterator();
    assertTrue(iterator.hasNext());
    assertEquals("file:test_images/image1.png", iterator.next());
    assertFalse(iterator.hasNext());
    assertNull(iterator.next());
}

/*Тестирование метода hasNext() для коллекции с несколькими изображениями
*/

@Test
public void testMultipleImageCollectionHasNext() {
    Collection collection = new Collection("test_images/image");
    Iterator iterator = collection.getIterator();
    assertTrue(iterator.hasNext());
    assertEquals("file:test_images/image1.png", iterator.next());
    assertTrue(iterator.hasNext());
    assertEquals("file:test_images/image2.png", iterator.next());
    assertTrue(iterator.hasNext());
    assertEquals("file:test_images/image3.png", iterator.next());
    assertTrue(iterator.hasNext());
    assertEquals("file:test_images/image4.png", iterator.next());
    assertFalse(iterator.hasNext());
}

/*
* Тестирование метода next() для коллекции с несколькими изображениями:
*/

@Test
public void testMultipleImageCollectionNext() {
    Collection collection = new Collection("test_images/image");
    Iterator iterator = collection.getIterator();
    assertTrue(iterator.hasNext());
    assertEquals("file:test_images/image1.png", iterator.next());
    assertTrue(iterator.hasNext());
    assertEquals("file:test_images/image2.png", iterator.next());
    assertTrue(iterator.hasNext());
    assertEquals("file:test_images/image3.png", iterator.next());
    assertTrue(iterator.hasNext());
    assertEquals("file:test_images/image4.png", iterator.next());
    assertFalse(iterator.hasNext());
    assertNull(iterator.next());
}

/* 
* Тестирование метода preview() для коллекции с несколькими изображениями
*/

@Test
public void testMultipleImageCollectionPreview() {
    Collection collection = new Collection("test_images/image");
    Iterator iterator = collection.getIterator();
    assertTrue(iterator.hasNext());
    assertEquals("file:test_images/image1.png", iterator.next());
    assertTrue(iterator.hasNext());
    assertEquals("file:test_images/image2.png", iterator.next());
    assertTrue(iterator.hasNext());
    assertEquals("file:test_images/image3.png", iterator.next());
    assertTrue(iterator.hasNext());
    assertEquals("file:test_images/image4.png", iterator.next());
    assertTrue(iterator.hasNext());
    assertEquals("file:test_images/image3.png", iterator.preview());
    assertTrue(iterator.hasNext());
    assertEquals("file:test_images/image2.png", iterator.preview());
    assertTrue(iterator.hasNext());
    assertEquals("file:test_images/image1.png", iterator.preview());
    assertTrue(iterator.hasNext());
    assertEquals("file:test_images/image4.png", iterator.preview());
    assertFalse(iterator.hasNext());
}
/*
* Тестирование метода hasNext() и next() после достижения конца коллекции и вызова метода preview()
*/
@Test
public void testNextAfterEndAndPreview() {
    Collection collection = new Collection("test_images/image");
    Iterator iterator = collection.getIterator();
    assertTrue(iterator.hasNext());
    assertEquals("file:test_images/image1.png", iterator.next());
    assertTrue(iterator.hasNext());
    assertEquals("file:test_images/image2.png", iterator.next());
    assertTrue(iterator.hasNext());
    assertEquals("file:test_images/image3.png", iterator.next());
    assertTrue(iterator.hasNext());
    assertEquals("file:test_images/image4.png", iterator.next());
    assertFalse(iterator.hasNext());
    assertEquals("file:test_images/image3.png", iterator.preview());
    assertTrue(iterator.hasNext());
    assertEquals("file:test_images/image2.png", iterator.next());
    assertTrue(iterator.hasNext());
    assertEquals("file:test_images/image3.png", iterator.preview());
    assertTrue(iterator.hasNext());
    assertEquals("file:test_images/image1.png", iterator.next());
}






