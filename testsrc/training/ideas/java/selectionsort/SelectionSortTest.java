package training.ideas.java.selectionsort;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idntam on 8/4/2014.
 */
public class SelectionSortTest {

    @Test
    public void given_random_integers_to_sort_using_selection_sort_in_ascending()
    {
        int inputNumbers[]={9,3,12,1,8};
        int expectedNumbers[] ={1,3,8,9,12};
        Assert.assertArrayEquals(expectedNumbers, SelectionSort.asc(inputNumbers));
    }


    @Test
    public void given_mixed_integers_to_sort_using_selection_sort_in_ascending()
    {
        int inputNumbers[]={9,3,12,-5,1,8,-99,205};
        int expectedNumbers[] ={-99,-5,1,3,8,9,12,205};
        Assert.assertArrayEquals(expectedNumbers,SelectionSort.asc(inputNumbers));
    }

    @Test
    public void given_negative_integers_to_sort_using_selection_sort_in_ascending()
    {
        int inputNumbers[]={-9,-3,-12,-5,-1,-8};
        int expectedNumbers[] ={-12,-9,-8,-5,-3,-1};
        Assert.assertArrayEquals(expectedNumbers,SelectionSort.asc(inputNumbers));
    }

      @Test
      public void given_random_integers_to_sort_using_selection_sort_in_descending()
    {
        int inputNumbers[]={9,3,12,1,8};
        int expectedNumbers[] ={12,9,8,3,1};
        Assert.assertArrayEquals(expectedNumbers,SelectionSort.desc(inputNumbers));
    }

    @Test
    public void given_mixed_integers_to_sort_using_selection_sort_in_descending()
    {
        int inputNumbers[]={9,3,12,-5,1,8,-99,205};
        int sortingAscendingOrder[] ={205,12,9,8,3,1,-5,-99};
        Assert.assertArrayEquals(sortingAscendingOrder,SelectionSort.desc(inputNumbers));
    }

    @Test
    public void given_negative_integers_to_sort_using_selection_sort_in_descending()
    {
        int inputNumbers[]={-9,-3,-12,-5,-1,-8};
        int sortingAscendingOrder[] ={-1,-3,-5,-8,-9,-12};
        Assert.assertArrayEquals(sortingAscendingOrder,SelectionSort.desc(inputNumbers));
    }

}
