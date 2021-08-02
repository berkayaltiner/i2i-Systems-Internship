package com.akkahomework;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.actor.Actor;
public class RunSystem {

	public static void main(String[] args) {
		ActorSystem create = ActorSystem.create("actor-system");
        ActorRef mainActor = create.actorOf(Props.create(MainActor.class));
        ActorRef secondActor = create.actorOf(Props.create(Actor2.class));
        
        mainActor.tell(("Main Actor Message"), Actor.noSender());
        secondActor.tell("Message from Main Actor to Actor2 ", mainActor);
        secondActor.tell("Actor2 Message ", Actor.noSender());
	}

}
