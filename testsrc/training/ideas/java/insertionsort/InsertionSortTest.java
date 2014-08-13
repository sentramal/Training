package training.ideas.java.insertionsort;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idntam on 8/4/2014.
 */
public class InsertionSortTest {

    @Test
    public void given_random_numbers_to_sort_using_insertion_sort_in_ascending_order()
    {
        int inputNumbers[]={9,3,12,1,8};
        int expectedNumbers[]={1,3,8,9,12};
        Assert.assertArrayEquals(expectedNumbers, InsertionSort.asc(inputNumbers));
    }

    @Test
    public void given_mixed_integers_to_sort_using_insertion_sort_in_ascending()
    {
        int inputNumbers[]={9,3,12,-5,1,8,-99,205};
        int expectedNumbers[] ={-99,-5,1,3,8,9,12,205};
        Assert.assertArrayEquals(expectedNumbers,InsertionSort.asc(inputNumbers));
    }

    @Test
    public void given_negative_integers_to_sort_using_selection_sort_in_ascending()
    {
        int inputNumbers[]={-9,-3,-12,-5,-1,-8};
        int expectedNumbers[] ={-12,-9,-8,-5,-3,-1};
        Assert.assertArrayEquals(expectedNumbers,InsertionSort.asc(inputNumbers));
    }

    @Test
    public void given_random_numbers_to_sort_using_insertion_sort_in_descending_order()
    {
        int inputNumbers[]={9,3,12,1,8};
        int expectedNumbers[]={12,9,8,3,1};
        Assert.assertArrayEquals(expectedNumbers,InsertionSort.desc(inputNumbers));
    }

    @Test
    public void given_mixed_integers_to_sort_using_insertion_sort_in_descending()
    {
        int inputNumbers[]={9,3,12,-5,1,8,-99,205};
        int sortingAscendingOrder[] ={205,12,9,8,3,1,-5,-99};
        Assert.assertArrayEquals(sortingAscendingOrder,InsertionSort.desc(inputNumbers));
    }

    @Test
    public void given_negative_integers_to_sort_using_insertion_sort_in_descending()
    {
        int inputNumbers[]={-9,-3,-12,-5,-1,-8};
        int sortingAscendingOrder[] ={-1,-3,-5,-8,-9,-12};
        Assert.assertArrayEquals(sortingAscendingOrder,InsertionSort.desc(inputNumbers));
    }


}
