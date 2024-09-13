package com.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryAnaliser implements IRetryAnalyzer{
int count=0;
int maxcount=3;
	@Override
	public boolean retry(ITestResult result) {
		if(count<maxcount) {
			count++;
			return true;
		}
		return false;
	}

}
