/*
 * Copyright 2013-2018 QAPROSOFT (http://qaprosoft.com/).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.qaprosoft.carina.demo.regression.dataprovider;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.regression.DataproviderRetryTest;

/**
 * This sample test DataProvider with retries and it's registration in Zafira.
 * It just generate failure in 50% of cases and on retry should improve statistic
 *
 * @author qpsdemo
 */
public class DataproviderRetryTest1 extends AbstractTest {

    /**
     * Parametrization using TestNG dataproviders:
     * <p>
     * 1. Create data-provider method that returns Object[][] and set DataProvider annotation. 2. Specify data-provider
     * name in @Test annotation.
     */
    @Test(dataProvider = "DP1", dataProviderClass=DataproviderRetryTest.class)
    @MethodOwner(owner = "qpsdemo")
    public void testDataproviderRetry1(String testRailColumn, int a, int b, int c) {
        boolean isPassed = (new Random().nextInt(4) == 1) ? true : false;
        Assert.assertTrue(isPassed);
        
        setCases(testRailColumn.split(","));
        int actual = a * b;
        int expected = c;
        Assert.assertEquals(actual, expected, "Invalid sum result!");
    }



}