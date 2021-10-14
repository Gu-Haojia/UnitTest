package org.apache.commons.lang3;

import org.apache.commons.lang3.util.MyArrayUtilsTestJ5;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;



@RunWith(Suite.class)

@Suite.SuiteClasses(
        {
                MyArrayUtilsTest.class,
                MyRangeTest.class,
                MyCharUtilsTest.class
        }
)
public abstract class AllTests {

}