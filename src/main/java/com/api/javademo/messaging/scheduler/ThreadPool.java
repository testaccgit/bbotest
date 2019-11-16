package com.api.javademo.messaging.scheduler;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;

import com.api.javademo.messaging.scheduler.operation.IMessagingOp;

public class ThreadPool implements Scheduler {

	private PriorityBlockingQueue<IMessagingOp> queue = new PriorityBlockingQueue<IMessagingOp>();
	private List<Thread> threadList = null;
	private int maxThreads;
			
	public ThreadPool(int maxThreads) {
		this.maxThreads = maxThreads;
		this.threadList =  new ArrayList<Thread>(maxThreads);
		initThreadPool();
	}

	private void initThreadPool() {
		for (int i = 0; i < maxThreads; i++) {
			QueueDispatcher worker = new QueueDispatcher(queue);
			threadList.add(worker);
			worker.start();
		}
	}
	
    public void scheduleOperation(IMessagingOp op) {
    	//As the number of error getting thrown from the system is minimal , 
    	//No need to set a max size for Queue.
		queue.put(op);
    }
}
