package com.akkahomework;

import akka.actor.AbstractActor;

public class Actor2 extends AbstractActor{



	@Override
	public Receive createReceive() {
		return receiveBuilder().match(String.class, msg -> { System.out.println(msg+ sender());}).build();
	}

	

}
