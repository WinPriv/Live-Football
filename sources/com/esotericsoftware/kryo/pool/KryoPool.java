package com.esotericsoftware.kryo.pool;

import com.esotericsoftware.kryo.Kryo;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public interface KryoPool {

    /* loaded from: classes.dex */
    public static class Builder {
        private final KryoFactory factory;
        private Queue<Kryo> queue = new ConcurrentLinkedQueue();
        private boolean softReferences;

        public Builder(KryoFactory kryoFactory) {
            if (kryoFactory != null) {
                this.factory = kryoFactory;
                return;
            }
            throw new IllegalArgumentException("factory must not be null");
        }

        public KryoPool build() {
            Queue queue;
            if (this.softReferences) {
                queue = new SoftReferenceQueue(this.queue);
            } else {
                queue = this.queue;
            }
            return new KryoPoolQueueImpl(this.factory, queue);
        }

        public Builder queue(Queue<Kryo> queue) {
            if (queue != null) {
                this.queue = queue;
                return this;
            }
            throw new IllegalArgumentException("queue must not be null");
        }

        public Builder softReferences() {
            this.softReferences = true;
            return this;
        }

        public String toString() {
            return getClass().getName() + "[queue.class=" + this.queue.getClass() + ", softReferences=" + this.softReferences + "]";
        }
    }

    Kryo borrow();

    void release(Kryo kryo);

    <T> T run(KryoCallback<T> kryoCallback);
}
