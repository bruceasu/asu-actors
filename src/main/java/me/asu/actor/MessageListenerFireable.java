package me.asu.actor;

/**
 * Created by Administrator on 2019/11/14.
 *
 * @author Victor
 * @date 2019-11-14
 */
public interface MessageListenerFireable
{
	void fireMessageListeners(MessageEvent e);
}
