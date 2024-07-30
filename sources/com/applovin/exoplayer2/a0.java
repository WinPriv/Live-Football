package com.applovin.exoplayer2;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.Layout;
import b6.e;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.g;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.f;
import com.google.android.exoplayer2.metadata.Metadata;
import d6.o;
import g4.o;
import java.util.ArrayList;
import k4.a1;
import k4.e1;
import k4.f;
import k4.h1;
import k4.i0;
import k4.n0;
import k4.n1;
import k4.o0;
import k4.p1;
import r5.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements g.a, com.applovin.exoplayer2.l.h, o.a, f.a, o.a, f.b {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13023s;

    public /* synthetic */ a0(int i10) {
        this.f13023s = i10;
    }

    @Override // com.applovin.exoplayer2.l.h, d6.f
    public final void accept(Object obj) {
        ((g.a) obj).a();
    }

    @Override // g4.o.a
    public final Object apply(Object obj) {
        boolean z10 = false;
        switch (this.f13023s) {
            case 12:
                w3.b bVar = g4.o.f28502x;
                throw new h4.a("Timed out while trying to acquire the lock.", (Throwable) obj);
            case 13:
                w3.b bVar2 = g4.o.f28502x;
                if (((Cursor) obj).getCount() > 0) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            default:
                Cursor cursor = (Cursor) obj;
                w3.b bVar3 = g4.o.f28502x;
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                while (cursor.moveToNext()) {
                    byte[] blob = cursor.getBlob(0);
                    arrayList.add(blob);
                    i10 += blob.length;
                }
                byte[] bArr = new byte[i10];
                int i11 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    byte[] bArr2 = (byte[]) arrayList.get(i12);
                    System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
                    i11 += bArr2.length;
                }
                return bArr;
        }
    }

    @Override // com.applovin.exoplayer2.g.a
    public final g fromBundle(Bundle bundle) {
        o a10;
        switch (this.f13023s) {
            case 0:
                return ab.c.b(bundle);
            case 1:
                return an.a.b(bundle);
            case 2:
                return com.applovin.exoplayer2.b.d.b(bundle);
            case 3:
                return ba.a.b(bundle);
            case 4:
            default:
                return x.c(bundle);
            case 5:
                return com.applovin.exoplayer2.h.a.a.b(bundle);
            case 6:
                return com.applovin.exoplayer2.h.ad.b(bundle);
            case 7:
                return com.applovin.exoplayer2.i.a.b(bundle);
            case 8:
                return com.applovin.exoplayer2.j.i.b(bundle);
            case 9:
                a10 = o.a(bundle);
                return a10;
        }
    }

    @Override // d6.o.a
    public final void invoke(Object obj) {
        int i10 = k4.a0.f30317l0;
        ((e1.c) obj).x(new k4.m(2, new k4.h0(1), 1003));
    }

    @Override // k4.f.a
    /* renamed from: fromBundle */
    public final k4.f mo0fromBundle(Bundle bundle) {
        n0.e eVar;
        k4.o0 o0Var;
        n0.c cVar;
        n0.h hVar;
        Bundle bundle2;
        Bundle bundle3;
        int i10 = 0;
        switch (this.f13023s) {
            case 17:
                k4.i0 i0Var = k4.i0.f30495c0;
                i0.a aVar = new i0.a();
                if (bundle != null) {
                    ClassLoader classLoader = d6.b.class.getClassLoader();
                    int i11 = d6.g0.f27302a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(k4.i0.f30496d0);
                k4.i0 i0Var2 = k4.i0.f30495c0;
                String str = i0Var2.f30518s;
                if (string == null) {
                    string = str;
                }
                aVar.f30525a = string;
                String string2 = bundle.getString(k4.i0.f30497e0);
                if (string2 == null) {
                    string2 = i0Var2.f30519t;
                }
                aVar.f30526b = string2;
                String string3 = bundle.getString(k4.i0.f30498f0);
                if (string3 == null) {
                    string3 = i0Var2.f30520u;
                }
                aVar.f30527c = string3;
                aVar.f30528d = bundle.getInt(k4.i0.f30499g0, i0Var2.f30521v);
                aVar.f30529e = bundle.getInt(k4.i0.f30500h0, i0Var2.f30522w);
                aVar.f = bundle.getInt(k4.i0.f30501i0, i0Var2.f30523x);
                aVar.f30530g = bundle.getInt(k4.i0.f30502j0, i0Var2.y);
                String string4 = bundle.getString(k4.i0.f30503k0);
                if (string4 == null) {
                    string4 = i0Var2.A;
                }
                aVar.f30531h = string4;
                Metadata metadata = (Metadata) bundle.getParcelable(k4.i0.f30504l0);
                if (metadata == null) {
                    metadata = i0Var2.B;
                }
                aVar.f30532i = metadata;
                String string5 = bundle.getString(k4.i0.f30505m0);
                if (string5 == null) {
                    string5 = i0Var2.C;
                }
                aVar.f30533j = string5;
                String string6 = bundle.getString(k4.i0.f30506n0);
                if (string6 == null) {
                    string6 = i0Var2.D;
                }
                aVar.f30534k = string6;
                aVar.f30535l = bundle.getInt(k4.i0.f30507o0, i0Var2.E);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle.getByteArray(k4.i0.d(i10));
                    if (byteArray == null) {
                        aVar.f30536m = arrayList;
                        aVar.f30537n = (DrmInitData) bundle.getParcelable(k4.i0.f30509q0);
                        aVar.o = bundle.getLong(k4.i0.f30510r0, i0Var2.H);
                        aVar.f30538p = bundle.getInt(k4.i0.f30511s0, i0Var2.I);
                        aVar.f30539q = bundle.getInt(k4.i0.f30512t0, i0Var2.J);
                        aVar.f30540r = bundle.getFloat(k4.i0.f30513u0, i0Var2.K);
                        aVar.f30541s = bundle.getInt(k4.i0.f30514v0, i0Var2.L);
                        aVar.f30542t = bundle.getFloat(k4.i0.f30515w0, i0Var2.M);
                        aVar.f30543u = bundle.getByteArray(k4.i0.f30516x0);
                        aVar.f30544v = bundle.getInt(k4.i0.y0, i0Var2.O);
                        Bundle bundle4 = bundle.getBundle(k4.i0.f30517z0);
                        if (bundle4 != null) {
                            aVar.f30545w = (e6.b) e6.b.B.mo0fromBundle(bundle4);
                        }
                        aVar.f30546x = bundle.getInt(k4.i0.A0, i0Var2.Q);
                        aVar.y = bundle.getInt(k4.i0.B0, i0Var2.R);
                        aVar.f30547z = bundle.getInt(k4.i0.C0, i0Var2.S);
                        aVar.A = bundle.getInt(k4.i0.D0, i0Var2.T);
                        aVar.B = bundle.getInt(k4.i0.E0, i0Var2.U);
                        aVar.C = bundle.getInt(k4.i0.F0, i0Var2.V);
                        aVar.D = bundle.getInt(k4.i0.H0, i0Var2.W);
                        aVar.E = bundle.getInt(k4.i0.I0, i0Var2.X);
                        aVar.F = bundle.getInt(k4.i0.G0, i0Var2.Y);
                        return new k4.i0(aVar);
                    }
                    arrayList.add(byteArray);
                    i10++;
                }
            case 18:
                String string7 = bundle.getString(k4.n0.f30573z, "");
                string7.getClass();
                Bundle bundle5 = bundle.getBundle(k4.n0.A);
                if (bundle5 == null) {
                    eVar = n0.e.f30617x;
                } else {
                    eVar = (n0.e) n0.e.D.mo0fromBundle(bundle5);
                }
                n0.e eVar2 = eVar;
                Bundle bundle6 = bundle.getBundle(k4.n0.B);
                if (bundle6 == null) {
                    o0Var = k4.o0.f30662c0;
                } else {
                    o0Var = (k4.o0) k4.o0.K0.mo0fromBundle(bundle6);
                }
                k4.o0 o0Var2 = o0Var;
                Bundle bundle7 = bundle.getBundle(k4.n0.C);
                if (bundle7 == null) {
                    cVar = n0.c.E;
                } else {
                    cVar = (n0.c) n0.b.D.mo0fromBundle(bundle7);
                }
                n0.c cVar2 = cVar;
                Bundle bundle8 = bundle.getBundle(k4.n0.D);
                if (bundle8 == null) {
                    hVar = n0.h.f30635u;
                } else {
                    hVar = (n0.h) n0.h.y.mo0fromBundle(bundle8);
                }
                return new k4.n0(string7, cVar2, null, eVar2, o0Var2, hVar);
            case 19:
                o0.a aVar2 = new o0.a();
                aVar2.f30692a = bundle.getCharSequence(k4.o0.f30663d0);
                aVar2.f30693b = bundle.getCharSequence(k4.o0.f30664e0);
                aVar2.f30694c = bundle.getCharSequence(k4.o0.f30665f0);
                aVar2.f30695d = bundle.getCharSequence(k4.o0.f30666g0);
                aVar2.f30696e = bundle.getCharSequence(k4.o0.f30667h0);
                aVar2.f = bundle.getCharSequence(k4.o0.f30668i0);
                aVar2.f30697g = bundle.getCharSequence(k4.o0.f30669j0);
                byte[] byteArray2 = bundle.getByteArray(k4.o0.f30672m0);
                String str2 = k4.o0.F0;
                Integer valueOf = bundle.containsKey(str2) ? Integer.valueOf(bundle.getInt(str2)) : null;
                aVar2.f30700j = byteArray2 != null ? (byte[]) byteArray2.clone() : null;
                aVar2.f30701k = valueOf;
                aVar2.f30702l = (Uri) bundle.getParcelable(k4.o0.f30673n0);
                aVar2.f30713x = bundle.getCharSequence(k4.o0.y0);
                aVar2.y = bundle.getCharSequence(k4.o0.f30684z0);
                aVar2.f30714z = bundle.getCharSequence(k4.o0.A0);
                aVar2.C = bundle.getCharSequence(k4.o0.D0);
                aVar2.D = bundle.getCharSequence(k4.o0.E0);
                aVar2.E = bundle.getCharSequence(k4.o0.G0);
                aVar2.G = bundle.getBundle(k4.o0.J0);
                String str3 = k4.o0.f30670k0;
                if (bundle.containsKey(str3) && (bundle3 = bundle.getBundle(str3)) != null) {
                    aVar2.f30698h = (h1) h1.f30486t.mo0fromBundle(bundle3);
                }
                String str4 = k4.o0.f30671l0;
                if (bundle.containsKey(str4) && (bundle2 = bundle.getBundle(str4)) != null) {
                    aVar2.f30699i = (h1) h1.f30486t.mo0fromBundle(bundle2);
                }
                String str5 = k4.o0.f30674o0;
                if (bundle.containsKey(str5)) {
                    aVar2.f30703m = Integer.valueOf(bundle.getInt(str5));
                }
                String str6 = k4.o0.f30675p0;
                if (bundle.containsKey(str6)) {
                    aVar2.f30704n = Integer.valueOf(bundle.getInt(str6));
                }
                String str7 = k4.o0.f30676q0;
                if (bundle.containsKey(str7)) {
                    aVar2.o = Integer.valueOf(bundle.getInt(str7));
                }
                String str8 = k4.o0.I0;
                if (bundle.containsKey(str8)) {
                    aVar2.f30705p = Boolean.valueOf(bundle.getBoolean(str8));
                }
                String str9 = k4.o0.f30677r0;
                if (bundle.containsKey(str9)) {
                    aVar2.f30706q = Boolean.valueOf(bundle.getBoolean(str9));
                }
                String str10 = k4.o0.f30678s0;
                if (bundle.containsKey(str10)) {
                    aVar2.f30707r = Integer.valueOf(bundle.getInt(str10));
                }
                String str11 = k4.o0.f30679t0;
                if (bundle.containsKey(str11)) {
                    aVar2.f30708s = Integer.valueOf(bundle.getInt(str11));
                }
                String str12 = k4.o0.f30680u0;
                if (bundle.containsKey(str12)) {
                    aVar2.f30709t = Integer.valueOf(bundle.getInt(str12));
                }
                String str13 = k4.o0.f30681v0;
                if (bundle.containsKey(str13)) {
                    aVar2.f30710u = Integer.valueOf(bundle.getInt(str13));
                }
                String str14 = k4.o0.f30682w0;
                if (bundle.containsKey(str14)) {
                    aVar2.f30711v = Integer.valueOf(bundle.getInt(str14));
                }
                String str15 = k4.o0.f30683x0;
                if (bundle.containsKey(str15)) {
                    aVar2.f30712w = Integer.valueOf(bundle.getInt(str15));
                }
                String str16 = k4.o0.B0;
                if (bundle.containsKey(str16)) {
                    aVar2.A = Integer.valueOf(bundle.getInt(str16));
                }
                String str17 = k4.o0.C0;
                if (bundle.containsKey(str17)) {
                    aVar2.B = Integer.valueOf(bundle.getInt(str17));
                }
                String str18 = k4.o0.H0;
                if (bundle.containsKey(str18)) {
                    aVar2.F = Integer.valueOf(bundle.getInt(str18));
                }
                return new k4.o0(aVar2);
            case 20:
            case 23:
            case 24:
            case 26:
            default:
                e.c cVar3 = e.c.K0;
                return new e.c(new e.c.a(bundle));
            case 21:
                int i12 = bundle.getInt(h1.f30485s, -1);
                if (i12 == 0) {
                    return (h1) k4.j0.y.mo0fromBundle(bundle);
                }
                if (i12 == 1) {
                    return (h1) a1.f30359w.mo0fromBundle(bundle);
                }
                if (i12 == 2) {
                    return (h1) n1.y.mo0fromBundle(bundle);
                }
                if (i12 == 3) {
                    return (h1) p1.y.mo0fromBundle(bundle);
                }
                throw new IllegalArgumentException(a3.l.i("Unknown RatingType: ", i12));
            case 22:
                String str19 = p1.f30738w;
                d6.a.a(bundle.getInt(h1.f30485s, -1) == 3);
                if (bundle.getBoolean(p1.f30738w, false)) {
                    return new p1(bundle.getBoolean(p1.f30739x, false));
                }
                return new p1();
            case 25:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(j5.n0.f29812w);
                if (parcelableArrayList == null) {
                    return new j5.n0(new j5.m0[0]);
                }
                return new j5.n0((j5.m0[]) d6.b.a(j5.m0.f29800z, parcelableArrayList).toArray(new j5.m0[0]));
            case 27:
                r5.a aVar3 = r5.a.J;
                a.C0471a c0471a = new a.C0471a();
                CharSequence charSequence = bundle.getCharSequence(r5.a.K);
                if (charSequence != null) {
                    c0471a.f34901a = charSequence;
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(r5.a.L);
                if (alignment != null) {
                    c0471a.f34903c = alignment;
                }
                Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(r5.a.M);
                if (alignment2 != null) {
                    c0471a.f34904d = alignment2;
                }
                Bitmap bitmap = (Bitmap) bundle.getParcelable(r5.a.N);
                if (bitmap != null) {
                    c0471a.f34902b = bitmap;
                }
                String str20 = r5.a.O;
                if (bundle.containsKey(str20)) {
                    String str21 = r5.a.P;
                    if (bundle.containsKey(str21)) {
                        float f = bundle.getFloat(str20);
                        int i13 = bundle.getInt(str21);
                        c0471a.f34905e = f;
                        c0471a.f = i13;
                    }
                }
                String str22 = r5.a.Q;
                if (bundle.containsKey(str22)) {
                    c0471a.f34906g = bundle.getInt(str22);
                }
                String str23 = r5.a.R;
                if (bundle.containsKey(str23)) {
                    c0471a.f34907h = bundle.getFloat(str23);
                }
                String str24 = r5.a.S;
                if (bundle.containsKey(str24)) {
                    c0471a.f34908i = bundle.getInt(str24);
                }
                String str25 = r5.a.U;
                if (bundle.containsKey(str25)) {
                    String str26 = r5.a.T;
                    if (bundle.containsKey(str26)) {
                        float f10 = bundle.getFloat(str25);
                        int i14 = bundle.getInt(str26);
                        c0471a.f34910k = f10;
                        c0471a.f34909j = i14;
                    }
                }
                String str27 = r5.a.V;
                if (bundle.containsKey(str27)) {
                    c0471a.f34911l = bundle.getFloat(str27);
                }
                String str28 = r5.a.W;
                if (bundle.containsKey(str28)) {
                    c0471a.f34912m = bundle.getFloat(str28);
                }
                String str29 = r5.a.X;
                if (bundle.containsKey(str29)) {
                    c0471a.o = bundle.getInt(str29);
                    c0471a.f34913n = true;
                }
                if (!bundle.getBoolean(r5.a.Y, false)) {
                    c0471a.f34913n = false;
                }
                String str30 = r5.a.Z;
                if (bundle.containsKey(str30)) {
                    c0471a.f34914p = bundle.getInt(str30);
                }
                String str31 = r5.a.f34892c0;
                if (bundle.containsKey(str31)) {
                    c0471a.f34915q = bundle.getFloat(str31);
                }
                return c0471a.a();
        }
    }

    @Override // com.google.android.exoplayer2.drm.f.b
    public final void release() {
    }
}
