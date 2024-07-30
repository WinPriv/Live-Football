package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Message;
import c6.h;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import d6.g0;
import j5.d0;
import j5.e0;
import java.io.IOException;
import java.util.TreeMap;
import k4.i0;
import k4.z0;
import p4.w;

/* compiled from: PlayerEmsgHandler.java */
/* loaded from: classes2.dex */
public final class d implements Handler.Callback {
    public boolean A;

    /* renamed from: s, reason: collision with root package name */
    public final c6.b f20178s;

    /* renamed from: t, reason: collision with root package name */
    public final b f20179t;

    /* renamed from: x, reason: collision with root package name */
    public n5.c f20183x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f20184z;

    /* renamed from: w, reason: collision with root package name */
    public final TreeMap<Long, Long> f20182w = new TreeMap<>();

    /* renamed from: v, reason: collision with root package name */
    public final Handler f20181v = g0.k(this);

    /* renamed from: u, reason: collision with root package name */
    public final e5.a f20180u = new e5.a();

    /* compiled from: PlayerEmsgHandler.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f20185a;

        /* renamed from: b, reason: collision with root package name */
        public final long f20186b;

        public a(long j10, long j11) {
            this.f20185a = j10;
            this.f20186b = j11;
        }
    }

    /* compiled from: PlayerEmsgHandler.java */
    /* loaded from: classes2.dex */
    public interface b {
    }

    /* compiled from: PlayerEmsgHandler.java */
    /* loaded from: classes2.dex */
    public final class c implements w {

        /* renamed from: a, reason: collision with root package name */
        public final e0 f20187a;

        /* renamed from: b, reason: collision with root package name */
        public final j1.a f20188b = new j1.a(4, 0);

        /* renamed from: c, reason: collision with root package name */
        public final c5.c f20189c = new c5.c();

        /* renamed from: d, reason: collision with root package name */
        public long f20190d = com.anythink.expressad.exoplayer.b.f7291b;

        public c(c6.b bVar) {
            this.f20187a = new e0(bVar, null, null);
        }

        @Override // p4.w
        public final void b(i0 i0Var) {
            this.f20187a.b(i0Var);
        }

        @Override // p4.w
        public final void c(long j10, int i10, int i11, int i12, w.a aVar) {
            long g6;
            long j11;
            this.f20187a.c(j10, i10, i11, i12, aVar);
            while (true) {
                boolean z10 = false;
                if (!this.f20187a.r(false)) {
                    break;
                }
                c5.c cVar = this.f20189c;
                cVar.h();
                if (this.f20187a.v(this.f20188b, cVar, 0, false) == -4) {
                    cVar.k();
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    long j12 = cVar.f33324w;
                    Metadata a10 = d.this.f20180u.a(cVar);
                    if (a10 != null) {
                        EventMessage eventMessage = (EventMessage) a10.f19997s[0];
                        String str = eventMessage.f20002s;
                        String str2 = eventMessage.f20003t;
                        if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                            z10 = true;
                        }
                        if (z10) {
                            try {
                                j11 = g0.M(g0.m(eventMessage.f20006w));
                            } catch (z0 unused) {
                                j11 = -9223372036854775807L;
                            }
                            if (j11 != com.anythink.expressad.exoplayer.b.f7291b) {
                                a aVar2 = new a(j12, j11);
                                Handler handler = d.this.f20181v;
                                handler.sendMessage(handler.obtainMessage(1, aVar2));
                            }
                        }
                    }
                }
            }
            e0 e0Var = this.f20187a;
            d0 d0Var = e0Var.f29713a;
            synchronized (e0Var) {
                int i13 = e0Var.f29729s;
                if (i13 == 0) {
                    g6 = -1;
                } else {
                    g6 = e0Var.g(i13);
                }
            }
            d0Var.b(g6);
        }

        @Override // p4.w
        public final int d(h hVar, int i10, boolean z10) throws IOException {
            return this.f20187a.a(hVar, i10, z10);
        }

        @Override // p4.w
        public final void e(int i10, d6.w wVar) {
            this.f20187a.f(i10, wVar);
        }
    }

    public d(n5.c cVar, DashMediaSource.c cVar2, c6.b bVar) {
        this.f20183x = cVar;
        this.f20179t = cVar2;
        this.f20178s = bVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.A) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        long j10 = aVar.f20185a;
        TreeMap<Long, Long> treeMap = this.f20182w;
        long j11 = aVar.f20186b;
        Long l10 = treeMap.get(Long.valueOf(j11));
        if (l10 == null) {
            treeMap.put(Long.valueOf(j11), Long.valueOf(j10));
        } else if (l10.longValue() > j10) {
            treeMap.put(Long.valueOf(j11), Long.valueOf(j10));
        }
        return true;
    }
}
