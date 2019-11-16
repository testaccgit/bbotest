package com.api.javademo.messaging.scheduler;

import com.api.javademo.messaging.scheduler.operation.IMessagingOp;

public interface Scheduler {

	public void scheduleOperation(IMessagingOp op);
}
