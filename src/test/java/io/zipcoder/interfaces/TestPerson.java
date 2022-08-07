package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructors(){
        //Given
        Person person = new Person(8,"Sally");

        //When

    String str  = person.getName();
    long lon = person.getId();

        // Then
        Assert.assertEquals(8,lon);
        Assert.assertEquals("Sally", str);
    }
    @Test
    public  void testSetName(){
     //Given
    Person person = new Person(0,"");
     //When
    person.setName("Annie");
    String s = person.getName();
     //Then
      Assert.assertEquals("Annie",s);

    }


}
