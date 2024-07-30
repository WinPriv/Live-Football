package com.iab.omid.library.vungle.walking.a;

import com.iab.omid.library.vungle.walking.a.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f24565a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f24566b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f24567c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private b f24568d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f24565a = linkedBlockingQueue;
        this.f24566b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b poll = this.f24567c.poll();
        this.f24568d = poll;
        if (poll != null) {
            poll.a(this.f24566b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f24567c.add(bVar);
        if (this.f24568d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.vungle.walking.a.b.a
    public void a(b bVar) {
        this.f24568d = null;
        a();
    }
}
