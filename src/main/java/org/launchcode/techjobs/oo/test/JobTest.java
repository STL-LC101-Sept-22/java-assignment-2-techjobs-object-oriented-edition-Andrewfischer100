package org.launchcode.techjobs.oo.test;

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
    public void testJobConstructorSetsAllFields(){
      Job myJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(Job.getName(), "Product tester");
        assertEquals(myJob.getEmployer().getValue(), "ACME");
        assertEquals(myJob.getLocation().getValue(), "Desert");
        assertEquals(myJob.getPositionType().getValue(), "Quality control");
        assertEquals(myJob.getCoreCompetency().getValue(), "Persistence");
        assertTrue(myJob.getEmployer() instanceof Employer);



    }

}
