package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId(){
        Job firstJob = new Job();
        Job secondJob = new Job();
        assertNotEquals(firstJob.getId(), secondJob.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields(){
       Job productTester = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(productTester.getName() instanceof String);
        assertEquals("Product tester", productTester.getName());

        assertTrue(productTester.getEmployer() instanceof Employer);
        assertEquals("ACME", productTester.getEmployer().getValue());

        assertTrue(productTester.getLocation() instanceof Location);
        assertEquals("Desert", productTester.getLocation().getValue());

        assertTrue(productTester.getPositionType() instanceof PositionType);
        assertEquals("Quality control", productTester.getPositionType().getValue());

        assertTrue(productTester.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", productTester.getCoreCompetency().getValue());
    }
@Test
    public void testJobsForEquality(){
    Job productTester = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job productTester2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertNotEquals(productTester, productTester2);
    }
}
