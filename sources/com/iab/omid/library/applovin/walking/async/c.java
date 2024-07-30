package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f24339a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f24340b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f24341c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private b f24342d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f24339a = linkedBlockingQueue;
        this.f24340b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b poll = this.f24341c.poll();
        this.f24342d = poll;
        if (poll != null) {
            poll.a(this.f24340b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f24341c.add(bVar);
        if (this.f24342d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.a
    public void a(b bVar) {
        this.f24342d = null;
        a();
    }
}
