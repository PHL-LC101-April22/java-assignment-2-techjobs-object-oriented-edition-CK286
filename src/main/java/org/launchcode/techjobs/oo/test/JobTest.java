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
  public void testSettingJobId() {
    Job myJob = new Job();
    Job yourJob = new Job();
    assertNotEquals(myJob.getId(), yourJob.getId());
  }

  @Test
  public void testJobConstructorSetsAllFields() {
    Job TJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    assertEquals("Product tester", TJob.getName());

    assertEquals("ACME", TJob.getEmployer().getValue());
    assertTrue(TJob.getEmployer() instanceof Employer);

    assertEquals("Desert", TJob.getLocation().getValue());
    assertTrue(TJob.getLocation() instanceof Location);

    assertEquals("Quality control", TJob.getPositionType().getValue());
    assertTrue(TJob.getPositionType() instanceof PositionType);

    assertEquals("Persistence", TJob.getCoreCompetency().getValue());
    assertTrue(TJob.getCoreCompetency() instanceof CoreCompetency);

  }

  @Test
  public void testJobsForEquality() {
    Job equalJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job sameJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertFalse(equalJob.equals(sameJob));
  }

  @Test
  public void testToStringStartsAndEndsWithNewLine() {
    Job sJob = new Job("String tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    String str = sJob.toString();
    String expected = "\n";
    String actual = String.valueOf(str.charAt(str.length()-1));
    assertEquals(expected,actual);
  }
  @Test
  public void testToStringContainsCorrectLabelsAndData() {
    Job fieldJob = new Job("Field tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    String fieldStr = fieldJob.toString();

    String output = String.format("\nID: %d\n" +
                    "Name: %s\n" +
                    "Employer: %s\n" +
                    "Location: %s\n" +
                    "Position Type: %s\n" +
                    "Core Competency: %s\n", fieldJob.getId(), fieldJob.getName(), fieldJob.getEmployer(), fieldJob.getLocation(),
            fieldJob.getPositionType(), fieldJob.getCoreCompetency());
    assertEquals(output, fieldJob.toString());

  }
}