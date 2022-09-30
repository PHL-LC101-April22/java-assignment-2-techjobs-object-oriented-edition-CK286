package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.Job;

import static org.junit.Assert.assertNotEquals;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
  @Test
    public  void  testSettingJobId() {
      Job myJob = new Job();
      Job yourJob = new Job();
      assertNotEquals(myJob.getId(),yourJob.getId());
  }

}
