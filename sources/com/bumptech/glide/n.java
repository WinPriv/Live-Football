package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: RequestBuilder.java */
/* loaded from: classes.dex */
public final class n<TranscodeType> extends p3.a<n<TranscodeType>> {
    public final Context S;
    public final o T;
    public final Class<TranscodeType> U;
    public final h V;
    public p<?, ? super TranscodeType> W;
    public Object X;
    public ArrayList Y;
    public n<TranscodeType> Z;

    /* renamed from: c0, reason: collision with root package name */
    public n<TranscodeType> f19830c0;

    /* renamed from: d0, reason: collision with root package name */
    public final boolean f19831d0 = true;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f19832e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f19833f0;

    /* compiled from: RequestBuilder.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19834a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f19835b;

        static {
            int[] iArr = new int[j.values().length];
            f19835b = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19835b[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19835b[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19835b[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f19834a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19834a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19834a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19834a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19834a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19834a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19834a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19834a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
    }

    @SuppressLint({"CheckResult"})
    public n(b bVar, o oVar, Class<TranscodeType> cls, Context context) {
        p3.g gVar;
        this.T = oVar;
        this.U = cls;
        this.S = context;
        Map<Class<?>, p<?, ?>> map = oVar.f19836s.f19719u.f;
        p pVar = map.get(cls);
        if (pVar == null) {
            for (Map.Entry<Class<?>, p<?, ?>> entry : map.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    pVar = entry.getValue();
                }
            }
        }
        this.W = pVar == null ? h.f19723k : pVar;
        this.V = bVar.f19719u;
        Iterator<p3.f<Object>> it = oVar.A.iterator();
        while (it.hasNext()) {
            q((p3.f) it.next());
        }
        synchronized (oVar) {
            gVar = oVar.B;
        }
        r(gVar);
    }

    @Override // p3.a
    public final p3.a a(p3.a aVar) {
        androidx.activity.n.n0(aVar);
        return (n) super.a(aVar);
    }

    @Override // p3.a
    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (super.equals(nVar)) {
                if (Objects.equals(this.U, nVar.U) && this.W.equals(nVar.W) && Objects.equals(this.X, nVar.X) && Objects.equals(this.Y, nVar.Y) && Objects.equals(this.Z, nVar.Z) && Objects.equals(this.f19830c0, nVar.f19830c0) && this.f19831d0 == nVar.f19831d0 && this.f19832e0 == nVar.f19832e0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p3.a
    public final int hashCode() {
        return t3.l.g(t3.l.g(t3.l.f(t3.l.f(t3.l.f(t3.l.f(t3.l.f(t3.l.f(t3.l.f(super.hashCode(), this.U), this.W), this.X), this.Y), this.Z), this.f19830c0), null), this.f19831d0), this.f19832e0);
    }

    public final n<TranscodeType> q(p3.f<TranscodeType> fVar) {
        if (this.N) {
            return clone().q(fVar);
        }
        if (fVar != null) {
            if (this.Y == null) {
                this.Y = new ArrayList();
            }
            this.Y.add(fVar);
        }
        j();
        return this;
    }

    public final n<TranscodeType> r(p3.a<?> aVar) {
        androidx.activity.n.n0(aVar);
        return (n) super.a(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p3.d s(int i10, int i11, j jVar, p pVar, p3.a aVar, p3.e eVar, q3.g gVar, Object obj) {
        p3.b bVar;
        p3.e eVar2;
        p3.i y;
        int i12;
        p pVar2;
        j jVar2;
        int i13;
        int i14;
        if (this.f19830c0 != null) {
            eVar2 = new p3.b(obj, eVar);
            bVar = eVar2;
        } else {
            bVar = 0;
            eVar2 = eVar;
        }
        n<TranscodeType> nVar = this.Z;
        if (nVar != null) {
            if (!this.f19833f0) {
                p<?, ? super TranscodeType> pVar3 = nVar.W;
                if (nVar.f19831d0) {
                    pVar2 = pVar;
                } else {
                    pVar2 = pVar3;
                }
                if (p3.a.e(nVar.f34238s, 8)) {
                    jVar2 = this.Z.f34241v;
                } else {
                    int ordinal = jVar.ordinal();
                    if (ordinal != 0 && ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                jVar2 = j.NORMAL;
                            } else {
                                throw new IllegalArgumentException("unknown priority: " + this.f34241v);
                            }
                        } else {
                            jVar2 = j.HIGH;
                        }
                    } else {
                        jVar2 = j.IMMEDIATE;
                    }
                }
                j jVar3 = jVar2;
                n<TranscodeType> nVar2 = this.Z;
                int i15 = nVar2.C;
                int i16 = nVar2.B;
                if (t3.l.h(i10, i11)) {
                    n<TranscodeType> nVar3 = this.Z;
                    if (!t3.l.h(nVar3.C, nVar3.B)) {
                        i14 = aVar.C;
                        i13 = aVar.B;
                        p3.j jVar4 = new p3.j(obj, eVar2);
                        p3.i y10 = y(i10, i11, jVar, pVar, aVar, jVar4, gVar, obj);
                        this.f19833f0 = true;
                        n<TranscodeType> nVar4 = this.Z;
                        p3.d s10 = nVar4.s(i14, i13, jVar3, pVar2, nVar4, jVar4, gVar, obj);
                        this.f19833f0 = false;
                        jVar4.f34275c = y10;
                        jVar4.f34276d = s10;
                        y = jVar4;
                    }
                }
                i13 = i16;
                i14 = i15;
                p3.j jVar42 = new p3.j(obj, eVar2);
                p3.i y102 = y(i10, i11, jVar, pVar, aVar, jVar42, gVar, obj);
                this.f19833f0 = true;
                n<TranscodeType> nVar42 = this.Z;
                p3.d s102 = nVar42.s(i14, i13, jVar3, pVar2, nVar42, jVar42, gVar, obj);
                this.f19833f0 = false;
                jVar42.f34275c = y102;
                jVar42.f34276d = s102;
                y = jVar42;
            } else {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
        } else {
            y = y(i10, i11, jVar, pVar, aVar, eVar2, gVar, obj);
        }
        if (bVar == 0) {
            return y;
        }
        n<TranscodeType> nVar5 = this.f19830c0;
        int i17 = nVar5.C;
        int i18 = nVar5.B;
        if (t3.l.h(i10, i11)) {
            n<TranscodeType> nVar6 = this.f19830c0;
            if (!t3.l.h(nVar6.C, nVar6.B)) {
                int i19 = aVar.C;
                i12 = aVar.B;
                i17 = i19;
                n<TranscodeType> nVar7 = this.f19830c0;
                p3.d s11 = nVar7.s(i17, i12, nVar7.f34241v, nVar7.W, nVar7, bVar, gVar, obj);
                bVar.f34247c = y;
                bVar.f34248d = s11;
                return bVar;
            }
        }
        i12 = i18;
        n<TranscodeType> nVar72 = this.f19830c0;
        p3.d s112 = nVar72.s(i17, i12, nVar72.f34241v, nVar72.W, nVar72, bVar, gVar, obj);
        bVar.f34247c = y;
        bVar.f34248d = s112;
        return bVar;
    }

    @Override // p3.a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final n<TranscodeType> clone() {
        n<TranscodeType> nVar = (n) super.clone();
        nVar.W = (p<?, ? super TranscodeType>) nVar.W.clone();
        if (nVar.Y != null) {
            nVar.Y = new ArrayList(nVar.Y);
        }
        n<TranscodeType> nVar2 = nVar.Z;
        if (nVar2 != null) {
            nVar.Z = nVar2.clone();
        }
        n<TranscodeType> nVar3 = nVar.f19830c0;
        if (nVar3 != null) {
            nVar.f19830c0 = nVar3.clone();
        }
        return nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(android.widget.ImageView r5) {
        /*
            r4 = this;
            t3.l.a()
            androidx.activity.n.n0(r5)
            int r0 = r4.f34238s
            r1 = 2048(0x800, float:2.87E-42)
            boolean r0 = p3.a.e(r0, r1)
            if (r0 != 0) goto L71
            boolean r0 = r4.F
            if (r0 == 0) goto L71
            android.widget.ImageView$ScaleType r0 = r5.getScaleType()
            if (r0 == 0) goto L71
            int[] r0 = com.bumptech.glide.n.a.f19834a
            android.widget.ImageView$ScaleType r1 = r5.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            switch(r0) {
                case 1: goto L61;
                case 2: goto L4f;
                case 3: goto L3d;
                case 4: goto L3d;
                case 5: goto L3d;
                case 6: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L71
        L2b:
            com.bumptech.glide.n r0 = r4.clone()
            h3.l$c r2 = h3.l.f28703b
            h3.j r3 = new h3.j
            r3.<init>()
            p3.a r0 = r0.f(r2, r3)
            r0.Q = r1
            goto L72
        L3d:
            com.bumptech.glide.n r0 = r4.clone()
            h3.l$e r2 = h3.l.f28702a
            h3.q r3 = new h3.q
            r3.<init>()
            p3.a r0 = r0.f(r2, r3)
            r0.Q = r1
            goto L72
        L4f:
            com.bumptech.glide.n r0 = r4.clone()
            h3.l$c r2 = h3.l.f28703b
            h3.j r3 = new h3.j
            r3.<init>()
            p3.a r0 = r0.f(r2, r3)
            r0.Q = r1
            goto L72
        L61:
            com.bumptech.glide.n r0 = r4.clone()
            h3.l$d r1 = h3.l.f28704c
            h3.i r2 = new h3.i
            r2.<init>()
            p3.a r0 = r0.f(r1, r2)
            goto L72
        L71:
            r0 = r4
        L72:
            com.bumptech.glide.h r1 = r4.V
            androidx.activity.n r1 = r1.f19726c
            r1.getClass()
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            java.lang.Class<TranscodeType> r2 = r4.U
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L89
            q3.b r1 = new q3.b
            r1.<init>(r5)
            goto L96
        L89:
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L9a
            q3.d r1 = new q3.d
            r1.<init>(r5)
        L96:
            r4.v(r1, r0)
            return
        L9a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unhandled class: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = ", try .as*(Class).transcode(ResourceTranscoder)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.n.u(android.widget.ImageView):void");
    }

    public final void v(q3.g gVar, p3.a aVar) {
        boolean z10;
        androidx.activity.n.n0(gVar);
        if (this.f19832e0) {
            Object obj = new Object();
            p<?, ? super TranscodeType> pVar = this.W;
            p3.d s10 = s(aVar.C, aVar.B, aVar.f34241v, pVar, aVar, null, gVar, obj);
            p3.d f = gVar.f();
            if (s10.d(f)) {
                if (!aVar.A && f.i()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    androidx.activity.n.n0(f);
                    if (!f.isRunning()) {
                        f.h();
                        return;
                    }
                    return;
                }
            }
            this.T.i(gVar);
            gVar.d(s10);
            o oVar = this.T;
            synchronized (oVar) {
                oVar.f19841x.f19829s.add(gVar);
                com.bumptech.glide.manager.p pVar2 = oVar.f19839v;
                pVar2.f19806a.add(s10);
                if (!pVar2.f19808c) {
                    s10.h();
                } else {
                    s10.clear();
                    if (Log.isLoggable("RequestTracker", 2)) {
                        Log.v("RequestTracker", "Paused, delaying request");
                    }
                    pVar2.f19807b.add(s10);
                }
            }
            return;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    public final n<TranscodeType> w(p3.f<TranscodeType> fVar) {
        if (this.N) {
            return clone().w(fVar);
        }
        this.Y = null;
        return q(fVar);
    }

    public final n<TranscodeType> x(Object obj) {
        if (this.N) {
            return clone().x(obj);
        }
        this.X = obj;
        this.f19832e0 = true;
        j();
        return this;
    }

    public final p3.i y(int i10, int i11, j jVar, p pVar, p3.a aVar, p3.e eVar, q3.g gVar, Object obj) {
        Context context = this.S;
        Object obj2 = this.X;
        Class<TranscodeType> cls = this.U;
        ArrayList arrayList = this.Y;
        h hVar = this.V;
        return new p3.i(context, hVar, obj, obj2, cls, aVar, i10, i11, jVar, gVar, arrayList, eVar, hVar.f19729g, pVar.f19846s);
    }
}
