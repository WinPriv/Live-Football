package com.applovin.exoplayer2.l;

import android.os.Handler;
import android.os.Message;
import com.applovin.exoplayer2.l.o;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ae implements o {

    /* renamed from: a, reason: collision with root package name */
    private static final List<a> f16262a = new ArrayList(50);

    /* renamed from: b, reason: collision with root package name */
    private final Handler f16263b;

    public ae(Handler handler) {
        this.f16263b = handler;
    }

    @Override // com.applovin.exoplayer2.l.o
    public o.a b(int i10) {
        return a().a(this.f16263b.obtainMessage(i10), this);
    }

    @Override // com.applovin.exoplayer2.l.o
    public boolean c(int i10) {
        return this.f16263b.sendEmptyMessage(i10);
    }

    @Override // com.applovin.exoplayer2.l.o
    public void d(int i10) {
        this.f16263b.removeMessages(i10);
    }

    /* loaded from: classes.dex */
    public static final class a implements o.a {

        /* renamed from: a, reason: collision with root package name */
        private Message f16264a;

        /* renamed from: b, reason: collision with root package name */
        private ae f16265b;

        private a() {
        }

        private void b() {
            this.f16264a = null;
            this.f16265b = null;
            ae.b(this);
        }

        public a a(Message message, ae aeVar) {
            this.f16264a = message;
            this.f16265b = aeVar;
            return this;
        }

        public boolean a(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) com.applovin.exoplayer2.l.a.b(this.f16264a));
            b();
            return sendMessageAtFrontOfQueue;
        }

        @Override // com.applovin.exoplayer2.l.o.a
        public void a() {
            ((Message) com.applovin.exoplayer2.l.a.b(this.f16264a)).sendToTarget();
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(a aVar) {
        List<a> list = f16262a;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(aVar);
            }
        }
    }

    @Override // com.applovin.exoplayer2.l.o
    public boolean a(int i10) {
        return this.f16263b.hasMessages(i10);
    }

    @Override // com.applovin.exoplayer2.l.o
    public o.a a(int i10, Object obj) {
        return a().a(this.f16263b.obtainMessage(i10, obj), this);
    }

    @Override // com.applovin.exoplayer2.l.o
    public o.a a(int i10, int i11, int i12) {
        return a().a(this.f16263b.obtainMessage(i10, i11, i12), this);
    }

    @Override // com.applovin.exoplayer2.l.o
    public o.a a(int i10, int i11, int i12, Object obj) {
        return a().a(this.f16263b.obtainMessage(i10, i11, i12, obj), this);
    }

    @Override // com.applovin.exoplayer2.l.o
    public boolean a(o.a aVar) {
        return ((a) aVar).a(this.f16263b);
    }

    @Override // com.applovin.exoplayer2.l.o
    public boolean a(int i10, long j10) {
        return this.f16263b.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // com.applovin.exoplayer2.l.o
    public void a(Object obj) {
        this.f16263b.removeCallbacksAndMessages(obj);
    }

    @Override // com.applovin.exoplayer2.l.o
    public boolean a(Runnable runnable) {
        return this.f16263b.post(runnable);
    }

    private static a a() {
        a remove;
        List<a> list = f16262a;
        synchronized (list) {
            if (list.isEmpty()) {
                remove = new a();
            } else {
                remove = list.remove(list.size() - 1);
            }
        }
        return remove;
    }
}
