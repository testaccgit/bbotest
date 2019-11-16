package com.api.javademo.messaging.scheduler;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

import com.api.javademo.messaging.scheduler.operation.IMessagingOp;

public class QueueDispatcher extends Thread {

	private PriorityBlockingQueue<IMessagingOp> queue = null;

	protected AtomicBoolean running = new AtomicBoolean(true);

	public QueueDispatcher(PriorityBlockingQueue<IMessagingOp> queue) {
		this.queue = queue;
	}
	
	public void run() {
		while (running.get()) {
			IMessagingOp op = queue.poll();
			if(op != null) {
				op.execute();
			}
		}
	}
}
