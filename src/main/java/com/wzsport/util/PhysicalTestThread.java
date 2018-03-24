/**
 * 
 */
package com.wzsport.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wzsport.model.PhysicalTest;
import com.wzsport.service.PhysicalTestService;

/**
 * @author wenky
 *
 */
public class PhysicalTestThread implements Runnable{
	
	private static PhysicalTestService physicalTestService;

	public List<PhysicalTest> physicalTests;
	
	public PhysicalTestThread(List<PhysicalTest> physicalTests) {
		this.physicalTests = physicalTests;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (PhysicalTest physicalTest:physicalTests) {
			physicalTestService.updatePhysicalTest(physicalTest);
			System.out.println(physicalTest.getClassName());
		}
	}
	
	@Autowired(required = true)
	public void setPhysicalTestService(PhysicalTestService physicalTestService) {
		PhysicalTestThread.physicalTestService = physicalTestService;
	}
	
	
}
