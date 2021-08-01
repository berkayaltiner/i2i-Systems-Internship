package com.hazelcastHomework;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

public class TestHazelcastGet {

	public static void main(String[] args) {
		
		HazelcastInstance _hazelcastInstance = Hazelcast.newHazelcastInstance();
		IMap<Object, Object> map = _hazelcastInstance.getMap("mapTest");
		
		Object random = 0;
		long startTime = System.nanoTime();
		for(int i= 0; i < 100000; i++)
		{
			random = map.get(i);
		}
		long endTime = System.nanoTime()- startTime;
		double seconds = (double)endTime / 1000000000.0;
		System.out.print("Hazelcast 100000 Entry Select Time = "+seconds);
	}
}
