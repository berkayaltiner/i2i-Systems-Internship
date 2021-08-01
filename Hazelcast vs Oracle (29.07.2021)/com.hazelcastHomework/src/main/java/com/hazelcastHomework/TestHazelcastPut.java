package com.hazelcastHomework;

import java.util.Random;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

public class TestHazelcastPut {
	
	   public static void main(String[] args) {
		
			 HazelcastInstance instance = Hazelcast.newHazelcastInstance();
		     IMap<Object,Object> map = instance.getMap("mapTest");

		     Random random = new Random();
		     long startTime = System.nanoTime();
		     for (int i =0; i < 100000; i++){
		         map.put(i,random.nextInt(100000));
		     }
		     long endTime = System.nanoTime() - startTime;
		     double seconds = (double)endTime / 1000000000.0;
		     System.out.println("Hazelcast 100000 Entry Insert Time = "+seconds);
	}

}
