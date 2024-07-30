package com.iab.omid.library.ironsrc.walking.async;

import com.iab.omid.library.ironsrc.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f24457a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f24458b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f24459c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private b f24460d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f24457a = linkedBlockingQueue;
        this.f24458b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b poll = this.f24459c.poll();
        this.f24460d = poll;
        if (poll != null) {
            poll.a(this.f24458b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f24459c.add(bVar);
        if (this.f24460d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.b.a
    public void a(b bVar) {
        this.f24460d = null;
        a();
    }
}
