package com.esotericsoftware.kryo.pool;

import com.esotericsoftware.kryo.Kryo;
import java.util.Queue;

/* loaded from: classes.dex */
class KryoPoolQueueImpl implements KryoPool {
    private final KryoFactory factory;
    private final Queue<Kryo> queue;

    public KryoPoolQueueImpl(KryoFactory kryoFactory, Queue<Kryo> queue) {
        this.factory = kryoFactory;
        this.queue = queue;
    }

    @Override // com.esotericsoftware.kryo.pool.KryoPool
    public Kryo borrow() {
        Kryo poll = this.queue.poll();
        if (poll != null) {
            return poll;
        }
        return this.factory.create();
    }

    public void clear() {
        this.queue.clear();
    }

    @Override // com.esotericsoftware.kryo.pool.KryoPool
    public void release(Kryo kryo) {
        this.queue.offer(kryo);
    }

    @Override // com.esotericsoftware.kryo.pool.KryoPool
    public <T> T run(KryoCallback<T> kryoCallback) {
        Kryo borrow = borrow();
        try {
            return kryoCallback.execute(borrow);
        } finally {
            release(borrow);
        }
    }

    public int size() {
        return this.queue.size();
    }
}
