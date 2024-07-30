package io.paperdb;

import a3.k;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;

/* loaded from: classes2.dex */
class KeyLocker {
    private ConcurrentMap<String, Semaphore> semaphoreMap = new ConcurrentHashMap();
    private Semaphore global = new Semaphore(1, true);

    public void acquire(String str) {
        if (this.global.availablePermits() == 0) {
            this.global.acquireUninterruptibly();
            this.global.release();
        }
        if (str != null) {
            if (!this.semaphoreMap.containsKey(str)) {
                this.semaphoreMap.put(str, new Semaphore(1, true));
            }
            this.semaphoreMap.get(str).acquireUninterruptibly();
            return;
        }
        throw new IllegalArgumentException("Key couldn't be null");
    }

    public void acquireGlobal() {
        this.global.acquireUninterruptibly();
        Iterator<Semaphore> it = this.semaphoreMap.values().iterator();
        while (it.hasNext()) {
            it.next().acquireUninterruptibly();
        }
    }

    public void release(String str) {
        if (str != null) {
            Semaphore semaphore = this.semaphoreMap.get(str);
            if (semaphore != null) {
                semaphore.release();
                return;
            }
            throw new IllegalStateException(k.l("Couldn't release semaphore. The acquire() with the same key '", str, "' has to be called prior to calling release()"));
        }
        throw new IllegalArgumentException("Key couldn't be null");
    }

    public void releaseGlobal() {
        Iterator<Semaphore> it = this.semaphoreMap.values().iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        this.global.release();
    }
}
