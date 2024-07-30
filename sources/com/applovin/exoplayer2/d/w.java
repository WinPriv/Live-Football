package com.applovin.exoplayer2.d;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Base64;
import b5.q;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.g;
import com.applovin.exoplayer2.g.e.g;
import com.applovin.exoplayer2.j.c;
import com.google.android.exoplayer2.drm.e;
import com.google.firebase.components.ComponentRegistrar;
import d6.o;
import g4.o;
import j5.e0;
import j5.m0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import k4.e1;
import k4.f;
import k4.h1;
import k4.j0;
import k4.n0;
import k4.q1;
import k5.a;
import k8.f;
import l7.a;
import p4.f;
import z3.j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements com.applovin.exoplayer2.l.h, g.a, g.a, o.a, o.a, f.a, d6.f, f.a.InterfaceC0458a, q.f, f.a, s7.f {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f14061s;

    public /* synthetic */ w(int i10) {
        this.f14061s = i10;
    }

    @Override // p4.f.a.InterfaceC0458a
    public final Constructor a() {
        int[] iArr = p4.f.f34317t;
        return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(p4.h.class).getConstructor(new Class[0]);
    }

    @Override // com.applovin.exoplayer2.l.h, d6.f
    public final void accept(Object obj) {
        switch (this.f14061s) {
            case 0:
                ((g.a) obj).b();
                return;
            case 11:
                ((e.a) obj).b();
                return;
            case 12:
                ((e.a) obj).c();
                return;
            default:
                ((e0.b) obj).f29740b.release();
                return;
        }
    }

    @Override // g4.o.a
    public final Object apply(Object obj) {
        byte[] decode;
        switch (this.f14061s) {
            case 4:
                Cursor cursor = (Cursor) obj;
                w3.b bVar = g4.o.f28502x;
                if (cursor.moveToNext()) {
                    return Long.valueOf(cursor.getLong(0));
                }
                return 0L;
            case 5:
                Cursor cursor2 = (Cursor) obj;
                w3.b bVar2 = g4.o.f28502x;
                ArrayList arrayList = new ArrayList();
                while (cursor2.moveToNext()) {
                    j.a a10 = z3.s.a();
                    a10.b(cursor2.getString(1));
                    a10.c(j4.a.b(cursor2.getInt(2)));
                    String string = cursor2.getString(3);
                    if (string == null) {
                        decode = null;
                    } else {
                        decode = Base64.decode(string, 0);
                    }
                    a10.f36945b = decode;
                    arrayList.add(a10.a());
                }
                return arrayList;
            default:
                j8.b bVar3 = (j8.b) obj;
                bVar3.getClass();
                y7.g gVar = i8.s.f29299a;
                gVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    gVar.a(bVar3, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
        }
    }

    @Override // s7.f
    public final List b(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // k8.f.a
    public final String c(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.minSdkVersion);
        }
        return "";
    }

    @Override // com.applovin.exoplayer2.g.e.g.a
    public final boolean evaluate(int i10, int i11, int i12, int i13, int i14) {
        return com.applovin.exoplayer2.g.e.g.c(i10, i11, i12, i13, i14);
    }

    @Override // com.applovin.exoplayer2.g.a
    public final com.applovin.exoplayer2.g fromBundle(Bundle bundle) {
        com.applovin.exoplayer2.m.b a10;
        switch (this.f14061s) {
            case 2:
                return c.C0183c.d(bundle);
            default:
                a10 = com.applovin.exoplayer2.m.b.a(bundle);
                return a10;
        }
    }

    @Override // b5.q.f
    public final int getScore(Object obj) {
        Pattern pattern = b5.q.f2985a;
        return ((b5.m) obj).f2945a.startsWith("OMX.google") ? 1 : 0;
    }

    @Override // d6.o.a
    public final void invoke(Object obj) {
        ((e1.c) obj).X();
    }

    @Override // k4.f.a
    /* renamed from: fromBundle */
    public final k4.f mo0fromBundle(Bundle bundle) {
        List c0438a;
        k5.a aVar;
        a.C0418a[] c0418aArr;
        switch (this.f14061s) {
            case 7:
                String str = j0.f30554w;
                d6.a.a(bundle.getInt(h1.f30485s, -1) == 0);
                if (bundle.getBoolean(j0.f30554w, false)) {
                    return new j0(bundle.getBoolean(j0.f30555x, false));
                }
                return new j0();
            case 8:
                return new n0.e(bundle.getLong(n0.e.y, com.anythink.expressad.exoplayer.b.f7291b), bundle.getLong(n0.e.f30618z, com.anythink.expressad.exoplayer.b.f7291b), bundle.getLong(n0.e.A, com.anythink.expressad.exoplayer.b.f7291b), bundle.getFloat(n0.e.B, -3.4028235E38f), bundle.getFloat(n0.e.C, -3.4028235E38f));
            case 10:
                int i10 = bundle.getInt(q1.b.f30753z, 0);
                long j10 = bundle.getLong(q1.b.A, com.anythink.expressad.exoplayer.b.f7291b);
                long j11 = bundle.getLong(q1.b.B, 0L);
                boolean z10 = bundle.getBoolean(q1.b.C, false);
                Bundle bundle2 = bundle.getBundle(q1.b.D);
                if (bundle2 != null) {
                    aVar = (k5.a) k5.a.E.mo0fromBundle(bundle2);
                } else {
                    aVar = k5.a.y;
                }
                k5.a aVar2 = aVar;
                q1.b bVar = new q1.b();
                bVar.h(null, null, i10, j10, j11, aVar2, z10);
                return bVar;
            case 16:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(k5.a.A);
                if (parcelableArrayList == null) {
                    c0418aArr = new a.C0418a[0];
                } else {
                    a.C0418a[] c0418aArr2 = new a.C0418a[parcelableArrayList.size()];
                    for (int i11 = 0; i11 < parcelableArrayList.size(); i11++) {
                        c0418aArr2[i11] = (a.C0418a) a.C0418a.I.mo0fromBundle((Bundle) parcelableArrayList.get(i11));
                    }
                    c0418aArr = c0418aArr2;
                }
                return new k5.a(null, c0418aArr, bundle.getLong(k5.a.B, 0L), bundle.getLong(k5.a.C, com.anythink.expressad.exoplayer.b.f7291b), bundle.getInt(k5.a.D, 0));
            default:
                Bundle bundle3 = bundle.getBundle(b6.j.f3068u);
                bundle3.getClass();
                m0 m0Var = (m0) m0.f29800z.mo0fromBundle(bundle3);
                int[] intArray = bundle.getIntArray(b6.j.f3069v);
                intArray.getClass();
                if (intArray.length == 0) {
                    c0438a = Collections.emptyList();
                } else {
                    c0438a = new a.C0438a(intArray, 0, intArray.length);
                }
                return new b6.j(m0Var, c0438a);
        }
    }
}
