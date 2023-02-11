package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import javax.naming.Name;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId(){
        assertNotEquals(new Job(), new Job());

    }
    @Test
    public void testJobConstructorSetsAllFields() {
        Job myJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(Job.getName(), "Product tester");
        assertEquals(myJob.getEmployer().getValue(), "ACME");
        assertEquals(myJob.getLocation().getValue(), "Desert");
        assertEquals(myJob.getPositionType().getValue(), "Quality control");
        assertEquals(myJob.getCoreCompetency().getValue(), "Persistence");
        assertTrue(myJob instanceof Job);
        assertTrue(myJob.getEmployer() instanceof Employer);
        assertTrue(myJob.getLocation() instanceof Location);
        assertTrue(myJob.getPositionType() instanceof PositionType);
        assertTrue(myJob.getCoreCompetency() instanceof CoreCompetency);

    }

        @Test
        public void testJobsForEquality(){
        Job newJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job newJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(newJob1.equals(newJob2));
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job newJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        char firstLetter = newJob1.toString().charAt(0);

        assertEquals("\n", String.valueOf(firstLetter));
        assertEquals(newJob1.toString().charAt(newJob1.toString().length()-1), newJob1.toString().charAt(0));

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job newJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        //Labels
        System.out.println(newJob1);

        assertEquals("","");
        assertTrue(newJob1.toString().contains("ID: "));
        assertTrue(newJob1.toString().contains("Name: "));
        assertTrue(newJob1.toString().contains("Employer: "));
        assertTrue(newJob1.toString().contains("Location: "));
        assertTrue(newJob1.toString().contains("Position Type: "));
        assertTrue(newJob1.toString().contains("Core Competency: "));
        //data

        assertTrue(newJob1.toString().contains(newJob1.numToString()));
        assertTrue(newJob1.toString().contains(Job.getName()));
        assertTrue(newJob1.toString().contains(newJob1.getEmployer().getValue()));
        assertTrue(newJob1.toString().contains(newJob1.getLocation().getValue()));
        assertTrue(newJob1.toString().contains(newJob1.getPositionType().getValue()));
        assertTrue(newJob1.toString().contains(newJob1.getCoreCompetency().getValue()));
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job newJob1 = new Job("", new Employer(), new Location(), new PositionType(), new CoreCompetency());
        System.out.println(newJob1);;

        assertEquals("Data not available", Job.getName());
        assertEquals("Data not available", newJob1.getEmployer().getValue());
        assertEquals("Data not available", newJob1.getLocation().getValue());
        assertEquals("Data not available", newJob1.getPositionType().getValue());
        assertEquals("Data not available", newJob1.getCoreCompetency().getValue());

    }


}
