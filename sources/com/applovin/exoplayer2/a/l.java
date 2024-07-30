package com.applovin.exoplayer2.a;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.am;
import com.applovin.exoplayer2.ax;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.d.h;
import com.applovin.exoplayer2.g;
import com.applovin.exoplayer2.j.c;
import com.applovin.exoplayer2.l.p;
import com.google.android.exoplayer2.drm.e;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import d6.o;
import g4.o;
import j5.m0;
import j7.j0;
import j7.v1;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import k4.a1;
import k4.e1;
import k4.f;
import k4.h1;
import k4.i0;
import k4.n0;
import k4.q1;
import k5.a;
import k8.f;
import okhttp3.Authenticator;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements p.b, g.a, com.applovin.exoplayer2.l.h, h.a, o.a, o.a, f.a, d6.f, f.a, Continuation, Authenticator, s7.e {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12974s;

    public /* synthetic */ l(int i10) {
        this.f12974s = i10;
    }

    @Override // com.applovin.exoplayer2.l.h, d6.f
    public void accept(Object obj) {
        switch (this.f12974s) {
            case 5:
                ((g.a) obj).c();
                return;
            default:
                ((e.a) obj).a();
                return;
        }
    }

    @Override // g4.o.a
    public Object apply(Object obj) {
        switch (this.f12974s) {
            case 11:
                w3.b bVar = g4.o.f28502x;
                return (List) g4.o.k(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new com.applovin.exoplayer2.d.w(5));
            case 12:
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            default:
                Cursor cursor = (Cursor) obj;
                w3.b bVar2 = g4.o.f28502x;
                if (!cursor.moveToNext()) {
                    return null;
                }
                return Long.valueOf(cursor.getLong(0));
        }
    }

    @Override // okhttp3.Authenticator
    public Request authenticate(Route route, Response response) {
        return Authenticator.a(route, response);
    }

    @Override // k8.f.a
    public String c(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        if (i10 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
            return "embedded";
        }
        return "";
    }

    @Override // s7.e
    public Object d(s7.v vVar) {
        switch (this.f12974s) {
            case 0:
                return ExecutorsRegistrar.f21265c.get();
            case 1:
                return TransportRegistrar.a(vVar);
            case 2:
                return FirebaseInstallationsRegistrar.a(vVar);
            default:
                Set e10 = vVar.e(s7.u.a(k8.d.class));
                k8.c cVar = k8.c.f30895b;
                if (cVar == null) {
                    synchronized (k8.c.class) {
                        cVar = k8.c.f30895b;
                        if (cVar == null) {
                            cVar = new k8.c();
                            k8.c.f30895b = cVar;
                        }
                    }
                }
                return new k8.b(e10, cVar);
        }
    }

    @Override // com.applovin.exoplayer2.g.a
    public com.applovin.exoplayer2.g fromBundle(Bundle bundle) {
        com.applovin.exoplayer2.m.o a10;
        switch (this.f12974s) {
            case 1:
                return ab.b(bundle);
            case 2:
                return am.b(bundle);
            case 3:
                return ax.c(bundle);
            case 4:
                return ba.b(bundle);
            case 5:
            case 6:
            default:
                return com.applovin.exoplayer2.v.b(bundle);
            case 7:
                return c.e.b(bundle);
            case 8:
                a10 = com.applovin.exoplayer2.m.o.a(bundle);
                return a10;
        }
    }

    @Override // d6.o.a
    public void invoke(Object obj) {
        ((e1.c) obj).onSeekProcessed();
    }

    @Override // com.applovin.exoplayer2.d.h.a
    public void release() {
        h.a.b();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Object obj = i8.k.f29280c;
        return -1;
    }

    @Override // k4.f.a
    /* renamed from: fromBundle, reason: collision with other method in class */
    public k4.f mo0fromBundle(Bundle bundle) {
        v1 a10;
        switch (this.f12974s) {
            case 15:
                n0.h.a aVar = new n0.h.a();
                aVar.f30641a = (Uri) bundle.getParcelable(n0.h.f30636v);
                aVar.f30642b = bundle.getString(n0.h.f30637w);
                aVar.f30643c = bundle.getBundle(n0.h.f30638x);
                return new n0.h(aVar);
            case 16:
                String str = a1.f30358v;
                d6.a.a(bundle.getInt(h1.f30485s, -1) == 1);
                float f = bundle.getFloat(a1.f30358v, -1.0f);
                return f == -1.0f ? new a1() : new a1(f);
            case 17:
            case 19:
            case 22:
            default:
                return new e6.n(bundle.getInt(e6.n.f27843x, 0), bundle.getInt(e6.n.y, 0), bundle.getInt(e6.n.f27844z, 0), bundle.getFloat(e6.n.A, 1.0f));
            case 18:
                Bundle bundle2 = bundle.getBundle(q1.c.M);
                n0 n0Var = bundle2 != null ? (n0) n0.E.mo0fromBundle(bundle2) : n0.y;
                long j10 = bundle.getLong(q1.c.N, com.anythink.expressad.exoplayer.b.f7291b);
                long j11 = bundle.getLong(q1.c.O, com.anythink.expressad.exoplayer.b.f7291b);
                long j12 = bundle.getLong(q1.c.P, com.anythink.expressad.exoplayer.b.f7291b);
                boolean z10 = bundle.getBoolean(q1.c.Q, false);
                boolean z11 = bundle.getBoolean(q1.c.R, false);
                Bundle bundle3 = bundle.getBundle(q1.c.S);
                n0.e eVar = bundle3 != null ? (n0.e) n0.e.D.mo0fromBundle(bundle3) : null;
                boolean z12 = bundle.getBoolean(q1.c.T, false);
                long j13 = bundle.getLong(q1.c.U, 0L);
                long j14 = bundle.getLong(q1.c.V, com.anythink.expressad.exoplayer.b.f7291b);
                int i10 = bundle.getInt(q1.c.W, 0);
                int i11 = bundle.getInt(q1.c.X, 0);
                long j15 = bundle.getLong(q1.c.Y, 0L);
                q1.c cVar = new q1.c();
                cVar.b(q1.c.K, n0Var, null, j10, j11, j12, z10, z11, eVar, j13, j14, i10, i11, j15);
                cVar.D = z12;
                return cVar;
            case 20:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(m0.f29799x);
                if (parcelableArrayList == null) {
                    j0.b bVar = j0.f30006t;
                    a10 = v1.f30113w;
                } else {
                    a10 = d6.b.a(i0.J0, parcelableArrayList);
                }
                return new m0(bundle.getString(m0.y, ""), (i0[]) a10.toArray(new i0[0]));
            case 21:
                long j16 = bundle.getLong(a.C0418a.A);
                int i12 = bundle.getInt(a.C0418a.B);
                int i13 = bundle.getInt(a.C0418a.H);
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(a.C0418a.C);
                int[] intArray = bundle.getIntArray(a.C0418a.D);
                long[] longArray = bundle.getLongArray(a.C0418a.E);
                long j17 = bundle.getLong(a.C0418a.F);
                boolean z13 = bundle.getBoolean(a.C0418a.G);
                if (intArray == null) {
                    intArray = new int[0];
                }
                return new a.C0418a(j16, i12, i13, intArray, parcelableArrayList2 == null ? new Uri[0] : (Uri[]) parcelableArrayList2.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j17, z13);
            case 23:
                return new e6.b(bundle.getInt(e6.b.f27757x, -1), bundle.getInt(e6.b.y, -1), bundle.getInt(e6.b.f27758z, -1), bundle.getByteArray(e6.b.A));
        }
    }

    @Override // com.applovin.exoplayer2.l.p.b
    public void invoke(Object obj, com.applovin.exoplayer2.l.m mVar) {
        a.i0((b) obj, mVar);
    }
}
