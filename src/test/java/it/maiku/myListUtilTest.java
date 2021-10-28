package it.maiku;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
@RunWith(value = Parameterized.class)
public class myListUtilTest {

    int order = 0;
    ArrayList<Integer> data;

    @Parameters
    public static Iterable<Object[]> testData(){
        return Arrays.asList(new Object[][]{
                {0, new ArrayList<Integer>( Arrays.asList(1, 2 ,6, 0, 5)) },
                {1, new ArrayList<Integer>( Arrays.asList(1, 2 ,6, 0, 5))},
                {0, new ArrayList<Integer>()},
                {1, new ArrayList<Integer>( Arrays.asList(0, 0 ,1, 0, 0))},

        });
    }

    public myListUtilTest(int inpOrder, ArrayList<Integer> inpData) {
        order = inpOrder;
        data = inpData;
    }

    @Before
    public void stampaBef(){
        System.out.println("inizio case: " + new DateTime().toString());
    }
    @After
    public void stampaAft(){
        System.out.println("--fine case: " + new DateTime().toString());
    }


    @Test
    public void completeTest()
    {
        //ordino dataset su lista di appoggio ...
        ArrayList<Integer> ordData = new ArrayList<Integer>(data);
        if(order == 0) Collections.sort(ordData);
        else Collections.sort(ordData,Collections.reverseOrder());

        //check sul testcase ...
        Assert.assertEquals(myListUtil.sort(data,order),ordData);
    }
}
