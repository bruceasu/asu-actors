# Background
Learn the actor model.

# Quick start
- actor
```java
class SomeActor extends me.asu.actor.impl.AbstractActor 
{
	protected void loopBody(Message m)
	{
		// do something
	}
}
class SomeActor2 extends me.asu.actor.impl.AbstractActor 
{
	protected void loopBody(Message m)
	{
		// do something
	}
}
```
- manager
```java
class Main
{
	public static void main(String[] args){
		me.asu.actor.Manager manager = me.asu.actor.impl.ActorManager.getInstance();	  
		Actor actorFrom = manager.createAndStartActor(SomeActor.class, "some-actor");
		actorFrom.setCategory("group1");
		Actor actorTo = manager.createAndStartActor(SomeActor2.class, "some-actor2");
		actorTo.setCategory("group2");
		Message message = new ActorMessage("test");
		
		manager.send(message, actorFrom, actorTo);
		manager.send(message, actorFrom, "group2");
	}
}

```
