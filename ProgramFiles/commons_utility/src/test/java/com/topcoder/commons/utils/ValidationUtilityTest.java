package com.topcoder.commons.utils;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.io.File;
import java.util.*;

/** 
* ValidationUtility Tester. 
* 
* @author <Authors name> 
* @since <pre>10�� 14, 2019</pre> 
* @version 1.0 
*/ 
public class ValidationUtilityTest { 

@Before
public void before() {
} 

@After
public void after() {
} 

/** 
* 
* Method: checkNotNull(Object value, String name, Class<T> exceptionClass) 
* 
*/ 
@Test
public void testCheckNotNull() {
    String name = "Integer";
    Object object = new Integer(1024);
    Class<Exception> exceptionClass = Exception.class;
    try {
        ValidationUtility.checkNotNull(object, name, exceptionClass);
    } catch (Exception e) {
        Assert.fail();
    }
}


    @Test
    public void testCheckNotNull2() {
        String name = "Integer";
        Object object = null;
        Class<Exception> exceptionClass = Exception.class;
        try {
            ValidationUtility.checkNotNull(object, name, exceptionClass);
        } catch (Exception e) {
            return;
        }
        Assert.fail();
    }
    /**
* 
* Method: checkNotEmpty(String value, String name, Class<T> exceptionClass) 
* 
*/ 
@Test
public void testCheckNotEmpty() {
//TODO: Test goes here...
    String name = "String";
    String value = "1024";
    Class<Exception> exceptionClass = Exception.class;
    try {
        ValidationUtility.checkNotEmpty(value, name, exceptionClass);
    } catch (Exception e) {
        Assert.fail();
    }
}

    @Test
    public void testCheckNotEmpty2() {
        String name = "String";
//        String value = "";
        Class<Exception> exceptionClass = Exception.class;
        try {
            ValidationUtility.checkNotEmpty("", name, exceptionClass);
        } catch (Exception e) {
            return;
        }
        Assert.fail();
    }
    /**
* 
* Method: checkNotEmptyAfterTrimming(String value, String name, Class<T> exceptionClass) 
* 
*/ 
@Test
public void testCheckNotEmptyAfterTrimming() {
    String name = "String";
    String value = "java";
    Class<Exception> exceptionClass = Exception.class;
    try {
        ValidationUtility.checkNotEmptyAfterTrimming(value, name, exceptionClass);
    } catch (Exception e) {
        Assert.fail();
    }
}

    @Test
    public void testCheckNotEmptyAfterTrimming2()  {
        String name = "String";
        Class<Exception> exceptionClass = Exception.class;
        try {
            ValidationUtility.checkNotEmptyAfterTrimming("", name, exceptionClass);
        } catch (Exception e) {
            return;
        }
        Assert.fail();
    }
    /**
* 
* Method: checkNotNullNorEmpty(String value, String name, Class<T> exceptionClass) 
* 
*/ 
@Test
public void testCheckNotNullNorEmpty()  {
    String name = "String";
    String value = "java";
    Class<Exception> exceptionClass = Exception.class;
    try {
        ValidationUtility.checkNotNullNorEmpty(value, name, exceptionClass);
    } catch (Exception e) {
        Assert.fail();
    }
}

    @Test
    public void testCheckNotNullNorEmpty2()  {
//TODO: Test goes here...
        String name = "String";
        Class<Exception> exceptionClass = Exception.class;
        try {
            ValidationUtility.checkNotNullNorEmpty("", name, exceptionClass);
        } catch (Exception e) {
            return;
        }
        Assert.fail();
    }

    @Test
    public void testCheckNotNullNorEmpty3()  {
//TODO: Test goes here...
        String name = "String";
        String value = null;
        Class<Exception> exceptionClass = Exception.class;
        try {
            ValidationUtility.checkNotNullNorEmpty(value, name, exceptionClass);
        } catch (Exception e) {
            return;
        }
        Assert.fail();
    }
    /**
* 
* Method: checkNotNullNorEmptyAfterTrimming(String value, String name, Class<T> exceptionClass) 
* 
*/ 
@Test
public void testCheckNotNullNorEmptyAfterTrimming() {
//TODO: Test goes here...
    String name = "String";
    String value = "java";
    Class<Exception> exceptionClass = Exception.class;
    try {
        ValidationUtility.checkNotNullNorEmptyAfterTrimming(value, name, exceptionClass);
    } catch (Exception e) {
        Assert.fail();
    }
}


    @Test
    public void testCheckNotNullNorEmptyAfterTrimming3() {
        String name = "String";
        Class<Exception> exceptionClass = Exception.class;
        try {
            ValidationUtility.checkNotNullNorEmptyAfterTrimming("", name, exceptionClass);
        } catch (Exception e) {
            return;
        }
        Assert.fail();
    }

    @Test
    public void testCheckNotNullNorEmptyAfterTrimming2() {
        String name = "String";
        String value = null;
        Class<Exception> exceptionClass = Exception.class;
        try {
            ValidationUtility.checkNotNullNorEmptyAfterTrimming(value, name, exceptionClass);
        } catch (Exception e) {
            return;
        }
        Assert.fail();
    }
    /**
* 
* Method: checkInstance(Object value, Class<?> expectedType, String name, Class<T> exceptionClass) 
* 
*/ 
@Test
public void testCheckInstance() {
//TODO: Test goes here...
    String value = "java";
    Class<String> expectedType = String.class;
    String name = "value";
    Class<Exception> exceptionClass = Exception.class;
    try {
        ValidationUtility.checkInstance(value, expectedType, name, exceptionClass);
    } catch (Exception e) {
        Assert.fail();
    }
}

    @Test
    public void testCheckInstance2() {
//TODO: Test goes here...
        Integer value = new Integer(1024);
        Class<String> expectedType = String.class;
        String name = "value";
        Class<Exception> exceptionClass = Exception.class;
        try {
            ValidationUtility.checkInstance(value, expectedType, name, exceptionClass);
        } catch (Exception e) {
           return;
        }
        Assert.fail();
    }

    /**
* 
* Method: checkNullOrInstance(Object value, Class<?> expectedType, String name, Class<T> exceptionClass) 
* 
*/ 
@Test
public void testCheckNullOrInstance() {
//TODO: Test goes here...
    String value = "java";
    Class<String> expectedType = String.class;
    String name = "value";
    Class<Exception> exceptionClass = Exception.class;
    try {
        ValidationUtility.checkNullOrInstance(value, expectedType, name, exceptionClass);
    } catch (Exception e) {
        Assert.fail();
    }
}

    @Test
    public void testCheckNullOrInstance2() {
//TODO: Test goes here...
        String value = null;
        Class<String> expectedType = String.class;
        String name = "value";
        Class<Exception> exceptionClass = Exception.class;
        try {
            ValidationUtility.checkNullOrInstance(value, expectedType, name, exceptionClass);
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckNullOrInstance3() {
//TODO: Test goes here...
        Integer value =new Integer(1024);
        Class<String> expectedType = String.class;
        String name = "value";
        Class<Exception> exceptionClass = Exception.class;
        try {
            ValidationUtility.checkNullOrInstance(value, expectedType, name, exceptionClass);
        } catch (Exception e) {
            return;
        }
        Assert.fail();
    }
    /**
* 
* Method: checkExists(File file, String name, Class<T> exceptionClass) 
* 
*/ 
@Test
public void testCheckExists() {
//TODO: Test goes here...
    File file = new File(getClass().getClassLoader().getResource("log4j.properties").getPath());
    String name = "log4j.properties";
    Class<Exception> exceptionClass = Exception.class;
    try {
        ValidationUtility.checkExists(file, name, exceptionClass);
    } catch (Exception e) {
        Assert.fail();
    }
}

    /**
     * test
     */
    @Test
    public void testCheckExists2() {
//TODO: Test goes here...
        File file = new File("1223");
        String name = "log4j.properties";
        Class<Exception> exceptionClass = Exception.class;
        try {
            ValidationUtility.checkExists(file, name, exceptionClass);
        } catch (Exception e) {
            return;
        }
        Assert.fail();
    }
    /**
* 
* Method: checkIsFile(File file, String name, Class<T> exceptionClass) 
* 
*/ 
@Test
public void testCheckIsFile() throws Exception {
//TODO: Test goes here...
    File file = new File(getClass().getClassLoader().getResource("log4j.properties").getPath());
    String name = "log4j.properties";
    Class<Exception> exceptionClass = Exception.class;
    try {
        ValidationUtility.checkIsFile(file, name, exceptionClass);
    } catch (Exception e) {
        Assert.fail();
    }
}

    @Test
    public void testCheckIsFile2() {
//TODO: Test goes here...
        File file = new File("1213");
        String name = "log4j.properties";
        Class<Exception> exceptionClass = Exception.class;
        try {
            ValidationUtility.checkIsFile(file, name, exceptionClass);
        } catch (Exception e) {
           return;
        }
        Assert.fail();
    }

    /**
* 
* Method: checkIsDirectory(File file, String name, Class<T> exceptionClass) 
* 
*/ 
@Test
public void testCheckIsDirectory() {
//TODO: Test goes here...
    File file = new File(getClass().getClassLoader().getResource(".").getPath());
    String name = ".";
    Class<Exception> exceptionClass = Exception.class;
    try {
        ValidationUtility.checkIsDirectory(file, name, exceptionClass);
    } catch (Exception e) {
        Assert.fail();
    }
}

    @Test
    public void testCheckIsDirectory2() {
//TODO: Test goes here...
        File file = new File("jivcox");
        String name = "log4j.properties";
        Class<Exception> exceptionClass = Exception.class;
        try {
            ValidationUtility.checkIsDirectory(file, name, exceptionClass);
        } catch (Exception e) {
           return;
        }
        Assert.fail();
    }

    /**
* 
* Method: checkNotEmpty(Collection<?> collection, String name, Class<T> exceptionClass) 
* 
*/ 
@Test
public void testCheckNotEmptyForCollectionName()  {
//TODO: Test goes here...
    Collection<String> collection = new ArrayList<String>();
    String name = ".";
    Class<Exception> exceptionClass = Exception.class;
    collection.add("1");
    collection.add("2");
    collection.add("3");
    try {
        ValidationUtility.checkNotEmpty(collection, name, exceptionClass);
    } catch (Exception e) {
        Assert.fail();
    }
}

    @Test
    public void testCheckNotEmptyForCollectionName2()  {
//TODO: Test goes here...
        Collection<String> collection = new ArrayList<String>();
        String name = "log4j.properties";
        Class<Exception> exceptionClass = Exception.class;
        try {
            ValidationUtility.checkNotEmpty(collection, name, exceptionClass);
        } catch (Exception e) {
            return;
        }
        Assert.fail();
    }

    /**
* 
* Method: checkNotNullNorEmpty(Collection<?> collection, String name, Class<T> exceptionClass) 
* 
*/ 
@Test
public void testCheckNotNullNorEmptyForCollection() {
//TODO: Test goes here...
    Collection<String> collection = new ArrayList<String>();
    String name = ".";
    Class<Exception> exceptionClass = Exception.class;
    collection.add("1");
    collection.add("2");
    collection.add("3");
    try {
        ValidationUtility.checkNotNullNorEmpty(collection, name, exceptionClass);
    } catch (Exception e) {
        Assert.fail();
    }
}

    @Test
    public void testCheckNotNullNorEmptyForCollection2() {
//TODO: Test goes here...
        Collection<String> collection = new ArrayList<String>();
        String name = ".";
        Class<Exception> exceptionClass = Exception.class;
        try {
            ValidationUtility.checkNotNullNorEmpty(collection, name, exceptionClass);
        } catch (Exception e) {
            return;
        }
        Assert.fail();
    }
    /**
* 
* Method: checkNotEmpty(Map<?, ?> map, String name, Class<T> exceptionClass) 
* 
*/ 
@Test
public void testCheckNotEmptyForMap() {
//TODO: Test goes here...
    Map<String, String> map = new HashMap<String, String>();
    String name = ".";
    Class<Exception> exceptionClass = Exception.class;
    map.put("1", "11");
    map.put("2", "22");
    try {
        ValidationUtility.checkNotEmpty(map, name, exceptionClass);
    } catch (Exception e) {
        Assert.fail();
    }
}

    @Test
    public void testCheckNotEmptyForMap2() {
//TODO: Test goes here...
        Map<String, String> map = new HashMap<String, String>();
        String name = ".";
        Class<Exception> exceptionClass = Exception.class;
        try {
            ValidationUtility.checkNotEmpty(map, name, exceptionClass);
        } catch (Exception e) {
            return;
        }
        Assert.fail();
    }

    /**
* 
* Method: checkNotNullNorEmpty(Map<?, ?> map, String name, Class<T> exceptionClass) 
* 
*/ 
@Test
public void testCheckNotNullNorEmptyForMap() {
//TODO: Test goes here...
    Map<String, String> map = new HashMap<String, String>();
    String name = ".";
    Class<Exception> exceptionClass = Exception.class;
    map.put("1", "11");
    map.put("2", "22");
    try {
        ValidationUtility.checkNotNullNorEmpty(map, name, exceptionClass);
    } catch (Exception e) {
        Assert.fail();
    }
}

    @Test
    public void testCheckNotNullNorEmptyForMap2() {
//TODO: Test goes here...
        Map<String, String> map = new HashMap<String, String>();
        String name = ".";
        Class<Exception> exceptionClass = Exception.class;
        try {
            ValidationUtility.checkNotNullNorEmpty(map, name, exceptionClass);
        } catch (Exception e) {
            return;
        }
        Assert.fail();
    }

    /**
* 
* Method: checkNotNullElements(Collection<?> collection, String name, Class<T> exceptionClass) 
* 
*/ 
@Test
public void testCheckNotNullElements() {
    Collection<String> collection = new ArrayList<String>();
    String name = ".";
    Class<Exception> exceptionClass = Exception.class;
    collection.add("1");
    collection.add("2");
    collection.add("3");
    try {
        ValidationUtility.checkNotNullElements(collection, name, exceptionClass);
    } catch (Exception e) {
        Assert.fail();
    }
}

    @Test
    public void testCheckNotNullElements2() {
        Collection<String> collection = new ArrayList<String>();
        String name = ".";
        Class<Exception> exceptionClass = Exception.class;
        collection.add("1");
        collection.add(null);
        collection.add("3");
        try {
            ValidationUtility.checkNotNullElements(collection, name, exceptionClass);
        } catch (Exception e) {
            return;
        }
        Assert.fail();
    }

    @Test
    public void testCheckNotNullElements3() {
        Collection<String> collection = null;
        String name = ".";
        Class<Exception> exceptionClass = Exception.class;
        try {
            ValidationUtility.checkNotNullElements(collection, name, exceptionClass);
        } catch (Exception e) {
            return;
        }
    }
    /**
* 
* Method: checkNotEmptyElements(Collection<?> collection, boolean trimStrings, String name, Class<T> exceptionClass) 
* 
*/ 
@Test
public void testCheckNotEmptyElements() {
    Collection<String> collection = new ArrayList<String>();
    String name = ".";
    Class<Exception> exceptionClass = Exception.class;
    collection.add("1");
    collection.add("2");
    collection.add("3");
    try {
        ValidationUtility.checkNotEmptyElements(collection, true,name, exceptionClass);
    } catch (Exception e) {
        return;
    }
}

    @Test
    public void testCheckNotEmptyElements2() {
        Collection<String> collection = new ArrayList<String>();
        String name = ".";
        Class<Exception> exceptionClass = Exception.class;
        Collection<String> element = new ArrayList<String>();
        try {
            ValidationUtility.checkNotEmptyElements(collection, true, name, exceptionClass);
        } catch (Exception e) {
            return;
        }
    }

    @Test
    public void testCheckNotEmptyElements3() {
        Collection<String> collection = new ArrayList<String>();
        String name = ".";
        String str1 = "hello";
        String str2 = "you";
        String str3 = "today";
        Class<Exception> exceptionClass = Exception.class;
        collection.add(str1);
        collection.add(str2);
        collection.add(str3);
        Boolean trimStrings = true;
       try{
           ValidationUtility.checkNotEmptyElements(collection, trimStrings, name, exceptionClass);
       }catch (Exception e){
           return;
       }
    }
    /**
* 
* Method: checkNotNullKeys(Map<?, ?> map, String name, Class<T> exceptionClass) 
* 
*/ 
@Test
public void testCheckNotNullKeys() {
    Map<String, String> map1 = new HashMap<String, String>();
    map1.put("1", "123");
    map1.put("2", "456");
    Map<String, String> map2 = new HashMap<String, String>();
    map2.put("1", "123");
    map2.put(null, "456");
    String name = "12341231";
    Class<Exception> exceptionClass = Exception.class;
    try {
        ValidationUtility.checkNotNullKeys(map1, name, exceptionClass);
    } catch (Exception e) {
        Assert.fail();
    }
    try {
        ValidationUtility.checkNotNullKeys(map2, name, exceptionClass);
    } catch (Exception e) {
        return;
    }
    try {
        ValidationUtility.checkNotNullKeys(null, name, exceptionClass);
    } catch (Exception e) {
        return;
    }
    Assert.fail();
} 

/** 
* 
* Method: checkNotNullValues(Map<?, ?> map, String name, Class<T> exceptionClass) 
* 
*/ 
@Test
public void testCheckNotNullValues() {
    Map<String, String> map1 = new HashMap<String, String>();
    map1.put("1", "123");
    map1.put("2", "456");
    Map<String, String> map2 = new HashMap<String, String>();
    map2.put("1", "123");
    map2.put("2", null);
    String name = "java";
    Class<Exception> exceptionClass = Exception.class;
    try {
        ValidationUtility.checkNotNullValues(map1, name, exceptionClass);
    } catch (Exception e) {
        Assert.fail();
    }
    try {
        ValidationUtility.checkNotNullValues(map2, name, exceptionClass);
    } catch (Exception e) {
        return;
    }
    try {
        ValidationUtility.checkNotNullValues(null, name, exceptionClass);
    } catch (Exception e) {
        return;
    }
    Assert.fail();
} 

/** 
* 
* Method: checkNotEmptyKeys(Map<?, ?> map, boolean trimStrings, String name, Class<T> exceptionClass) 
* 
*/ 
@Test
public void testCheckNotEmptyKeys() {
    Map<String, String> map1 = new HashMap<String, String>();
    map1.put("1", "123");
    map1.put("2", "456");
    Map<String, String> map2 = new HashMap<String, String>();
    map2.put("1", "123");
    map2.put("", "456");
    String name = "java";
    Class<Exception> exceptionClass = Exception.class;
    try {
        ValidationUtility.checkNotEmptyKeys(map1, true, name, exceptionClass);
    } catch (Exception e) {
        Assert.fail();
    }
    try {
        ValidationUtility.checkNotEmptyKeys(map2, true, name, exceptionClass);
    } catch (Exception e) {
        return;
    }
    try {
        ValidationUtility.checkNotEmptyKeys(null, true, name, exceptionClass);
    } catch (Exception e) {
        return;
    }
    Assert.fail();
}

/** 
* 
* Method: checkNotEmptyValues(Map<?, ?> map, boolean trimStrings, String name, Class<T> exceptionClass) 
* 
*/ 
@Test
public void testCheckNotEmptyValues() {
    Map<String, String> map1 = new HashMap<String, String>();
    map1.put("1", "123");
    map1.put("2", "456");
    Map<String, String> map2 = new HashMap<String, String>();
    map2.put("1", "123");
    map2.put("2", "");
    String name = "java";
    Class<Exception> exceptionClass = Exception.class;
    try {
        ValidationUtility.checkNotEmptyValues(map1, true, name, exceptionClass);
    } catch (Exception e) {
        Assert.fail();
    }
    try {
        ValidationUtility.checkNotEmptyValues(map2, true, name, exceptionClass);
    } catch (Exception e) {
        return;
    }
    try {
        ValidationUtility.checkNotEmptyValues(null, true, name, exceptionClass);
    } catch (Exception e) {
        return;
    }
    Assert.fail();
}

/** 
* 
* Method: checkNegative(double value, String name, Class<T> exceptionClass) 
* 
*/ 
@Test
public void testCheckNegative() {
    double value1 = -3;
    double value2 = 1;
    String name = "testCheckNegative";
    Class<Exception> exceptionClass = Exception.class;
    try {
        ValidationUtility.checkNegative(value1, name, exceptionClass);
    } catch (Exception e) {
        Assert.fail();
    }
    try {
        ValidationUtility.checkNegative(value2, name, exceptionClass);
    } catch (Exception e) {
        return;
    }
    Assert.fail();
} 

/** 
* 
* Method: checkPositive(double value, String name, Class<T> exceptionClass) 
* 
*/ 
@Test
public void testCheckPositive() {
    double value1 = 1;
    double value2 = -1;
    String name = "testCheckPositive";
    Class<Exception> exceptionClass = Exception.class;
    try {
        ValidationUtility.checkPositive(value1, name, exceptionClass);
    } catch (Exception e) {
        Assert.fail();
    }
    try {
        ValidationUtility.checkPositive(value2, name, exceptionClass);
    } catch (Exception e) {
        return;
    }
    Assert.fail();
}

/** 
* 
* Method: checkNotNegative(double value, String name, Class<T> exceptionClass) 
* 
*/ 
@Test
public void testCheckNotNegative() {
    double value1 = 0;
    double value2 = -1;
    String name = "testCheckNotPositive";
    Class<Exception> exceptionClass = Exception.class;
    try {
        ValidationUtility.checkNotNegative(value1, name, exceptionClass);
    } catch (Exception e) {
        Assert.fail();
    }
    try {
        ValidationUtility.checkNotNegative(value2, name, exceptionClass);
    } catch (Exception e) {
        return;
    }
    Assert.fail();
} 

/** 
* 
* Method: checkNotPositive(double value, String name, Class<T> exceptionClass) 
* 
*/ 
@Test
public void testCheckNotPositive() throws Exception {
    double value1 = 0;
    double value2 = 1;
    String name = "testCheckNotPositive";
    Class<Exception> exceptionClass = Exception.class;
    try {
        ValidationUtility.checkNotPositive(value1, name, exceptionClass);
    } catch (Exception e) {
        Assert.fail();
    }
    try {
        ValidationUtility.checkNotPositive(value2, name, exceptionClass);
    } catch (Exception e) {
        return;
    }
    Assert.fail();
} 

/** 
* 
* Method: checkNotZero(double value, String name, Class<T> exceptionClass) 
* 
*/ 
@Test
public void testCheckNotZero() throws Exception {
    double value1 = 1;
    double value2 = 0;
    String name = "testCheckNotZero";
    Class<Exception> exceptionClass = Exception.class;
    try {
        ValidationUtility.checkNotZero(value1, name, exceptionClass);
    } catch (Exception e) {
        Assert.fail();
    }
    try {
        ValidationUtility.checkNotZero(value2, name, exceptionClass);
    } catch (Exception e) {
        return;
    }
    Assert.fail();
}

/** 
* 
* Method: checkGreaterThan(double value, double number, boolean inclusive, String name, Class<T> exceptionClass) 
* 
*/ 
@Test
public void testCheckGreaterThan() throws Exception {
    long value1 = -3;
    long number = 0;
    String name = "testCheckGreaterThan";
    Class<Exception> exceptionClass = Exception.class;
    try {
        ValidationUtility.checkGreaterThan(value1, number, true, name, exceptionClass);
    } catch (Exception e) {
       return;
    }
    Assert.fail();
}

    @Test
    public void testCheckGreaterThan2() {
        long  value1 = 0;
        long  number = 0;
        String name = "testCheckGreaterThan";
        Class<Exception> exceptionClass = Exception.class;
        try{
            ValidationUtility.checkGreaterThan(value1, number, false, name, exceptionClass);
        }catch (Exception e){
           return;
        }
        Assert.fail();
    }

    /**
* 
* Method: checkLessThan(double value, double number, boolean inclusive, String name, Class<T> exceptionClass) 
* 
*/ 
@Test
public void testCheckLessThan() throws Exception {
    long  value = 3;
    long  number = 1;
    String name = "testCheckLessThan";
    Class<Exception> exceptionClass = Exception.class;
    try {
        ValidationUtility.checkLessThan(value, number, true, name, exceptionClass);
    } catch (Exception e) {
        return;
//        Assert.fail();
    }
}

    @Test
    public void testCheckLessThan2() throws Exception {
        long  value = 1;
        long  number = 1;
        String name = "testCheckLessThan";
        Class<Exception> exceptionClass = Exception.class;
        try {
            ValidationUtility.checkLessThan(value, number, false, name, exceptionClass);
        } catch (Exception e) {
            return;
        }
        Assert.fail();
    }
    /**
* 
* Method: checkInRange(double value, double from, double to, boolean fromInclusive, boolean toInclusive, String name, Class<T> exceptionClass) 
* 
*/ 
@Test
public void testCheckInRange() {
    double   value1 = 3;
    double  value2 = 2;
    double  value3 = 1;
    String name = "testCheckInRange";
    Class<Exception> exceptionClass = Exception.class;
    try {
        ValidationUtility.checkInRange(value2, value1,value2,true,true,name, exceptionClass);
    } catch (Exception e) {
        return;
    }
    try {
        ValidationUtility.checkInRange(value2, value1, value3, false, true, name, exceptionClass);
    } catch (Exception e) {
        Assert.fail();
    }
    try {
        ValidationUtility.checkInRange(value2, value1, value3, true, false, name, exceptionClass);
    } catch (Exception e) {
        Assert.fail();
    }
    try {
        ValidationUtility.checkInRange(value2, value1, value3, false, false, name, exceptionClass);
    } catch (Exception e) {
        Assert.fail();
    }
    try {
        ValidationUtility.checkInRange(value1, value1, value3, false, false, name, exceptionClass);
    } catch (Exception e) {
        return;
    }
    Assert.fail();
}
}


