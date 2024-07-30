package com.applovin.exoplayer2.a;

import android.os.Bundle;
import android.util.Log;
import com.applovin.exoplayer2.a.b;
import com.applovin.exoplayer2.c.i;
import com.applovin.exoplayer2.e.a;
import com.applovin.exoplayer2.l.p;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import d6.o;
import h4.b;
import java.io.IOException;
import java.util.List;
import k4.e1;
import n4.h;
import org.jsoup.helper.Consumer;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.NodeVisitor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements p.a, a.d, i.a, b.a, o.a, h.a, o0.d, OnSuccessListener, Continuation, NodeVisitor {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13015s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f13016t;

    public /* synthetic */ x(Object obj, int i10) {
        this.f13015s = i10;
        this.f13016t = obj;
    }

    @Override // h4.b.a
    public final Object execute() {
        return ((g4.c) this.f13016t).d();
    }

    @Override // org.jsoup.select.NodeVisitor
    public final void head(Node node, int i10) {
        Consumer consumer = (Consumer) this.f13016t;
        List<Element> list = Element.f33981z;
        if (node instanceof Element) {
            consumer.accept((Element) node);
        }
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        int i10 = this.f13015s;
        Object obj2 = this.f13016t;
        switch (i10) {
            case 0:
                a.p((b.a) obj2, (b) obj);
                return;
            case 5:
                ((e1.c) obj).Q(k4.a0.this.O);
                return;
            default:
                ((l4.b) obj).getClass();
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f13016t;
        i8.d0 d0Var = (i8.d0) obj;
        com.google.firebase.messaging.a aVar = FirebaseMessaging.f21279n;
        FirebaseMessaging.a aVar2 = firebaseMessaging.f21286g;
        synchronized (aVar2) {
            aVar2.a();
            Boolean bool = aVar2.f21294c;
            if (bool != null) {
                z11 = bool.booleanValue();
            } else {
                n7.e eVar = FirebaseMessaging.this.f21281a;
                eVar.a();
                h8.a aVar3 = eVar.f33463g.get();
                synchronized (aVar3) {
                    z10 = aVar3.f28789b;
                }
                z11 = z10;
            }
        }
        if (z11) {
            if (d0Var.f29256h.a() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                synchronized (d0Var) {
                    z13 = d0Var.f29255g;
                }
                if (!z13) {
                    d0Var.f(0L);
                }
            }
        }
    }

    @Override // com.applovin.exoplayer2.c.i.a
    public final void releaseOutputBuffer(com.applovin.exoplayer2.c.i iVar) {
        ((com.applovin.exoplayer2.i.d) this.f13016t).a((com.applovin.exoplayer2.i.d) iVar);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        ((i8.o) this.f13016t).getClass();
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null || (string = bundle.getString("unregistered")) != null) {
                return string;
            }
            String string2 = bundle.getString("error");
            if (!"RST".equals(string2)) {
                if (string2 != null) {
                    throw new IOException(string2);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            throw new IOException("INSTANCE_ID_RESET");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    @Override // com.applovin.exoplayer2.e.a.d
    public final long timeUsToTargetTime(long j10) {
        return ((com.applovin.exoplayer2.e.p) this.f13016t).a(j10);
    }
}
