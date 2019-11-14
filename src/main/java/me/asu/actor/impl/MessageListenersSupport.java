package me.asu.actor.impl;

import java.util.LinkedList;
import java.util.List;
import me.asu.actor.*;

/**
 * Created by Administrator on 2019/11/14.
 *
 * @author Victor
 * @date 2019-11-14
 */
public class MessageListenersSupport implements MessageListenerFireable
{

	protected List<MessageListener> listeners = new LinkedList<MessageListener>();

	public void addMessageListener(MessageListener l) {
		if (!listeners.contains(l)) {
			listeners.add(l);
		}
	}

	public void removeMessageListener(MessageListener l) {
		listeners.remove(l);
	}

	@Override
	public void fireMessageListeners(MessageEvent e) {
		for(MessageListener l : listeners) {
			l.onMessage(e);
		}
	}
}
