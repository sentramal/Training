package training.ideas.java.bubblesort;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idntam on 8/4/2014.
 */
public class BubbleSortTest {

  @Test
  public void given_random_numbers_to_sort_using_bubble_sorting_in_ascending_order() {

     int inputNumbers[]={5,3,25,15,1};
     int expectedNumbers[]={1,3,5,15,25};
      Assert.assertArrayEquals(expectedNumbers, BubbleSort.asc(inputNumbers));
    }

    @Test
    public void given_mixed_numbers_to_sort_using_bubble_sort_in_ascending_order()
    {
        int inputNumbers[]={1,-6,9,-25,5};
        int sortedNumbers[]={-25,-6,1,5,9};
        Assert.assertArrayEquals(sortedNumbers,BubbleSort.asc(inputNumbers));
    }

    @Test
    public void given_negative_numbers_to_sort_using_bubble_sort_in_ascending_order()
    {
        int inputNumbers[]={-9,-3,-12,-5,-1,-8};
        int sortedNumbers[]={-12,-9,-8,-5,-3,-1};
        Assert.assertArrayEquals(sortedNumbers,BubbleSort.asc(inputNumbers));
    }

    @Test
    public void given_random_numbers_to_sort_using_bubble_sorting_in_descending_order() {

        int inputNumbers[]={5,3,25,15,1};
        int expectedNumbers[]={25,15,5,3,1};
        Assert.assertArrayEquals(expectedNumbers,BubbleSort.desc(inputNumbers));
    }

    @Test
    public void given_mixed_numbers_to_sort_using_bubble_sort_in_descending_order()
    {
        int inputNumbers[]={1,-6,9,-25,5};
        int sortedNumbers[]={9,5,1,-6,-25};
        Assert.assertArrayEquals(sortedNumbers,BubbleSort.desc(inputNumbers));
    }

    @Test
    public void given_negative_numbers_to_sort_using_bubble_sort_in_descending_order() {
        int inputNumbers[] = {-9, -3, -12, -5, -1, -8};
        int sortedNumbers[] = {-1,-3,-5,-8,-9,-12};
        Assert.assertArrayEquals(sortedNumbers,BubbleSort.desc(inputNumbers));
    }
}
