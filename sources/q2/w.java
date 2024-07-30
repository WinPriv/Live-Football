package q2;

import android.graphics.Rect;
import com.huawei.hms.ads.gl;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentTemplateRecord;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import r2.c;

/* compiled from: LottieCompositionMoshiParser.java */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f34617a = c.a.a("w", "h", "ip", "op", com.anythink.expressad.video.dynview.a.a.Z, "v", "layers", ContentTemplateRecord.ASSETS, "fonts", "chars", "markers");

    /* renamed from: b, reason: collision with root package name */
    public static final c.a f34618b = c.a.a("id", "layers", "w", "h", com.anythink.core.common.g.c.W, "u");

    /* renamed from: c, reason: collision with root package name */
    public static final c.a f34619c = c.a.a("list");

    /* renamed from: d, reason: collision with root package name */
    public static final c.a f34620d = c.a.a("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0046. Please report as an issue. */
    public static g2.h a(r2.d dVar) throws IOException {
        float f;
        HashMap hashMap;
        ArrayList arrayList;
        q.j<l2.d> jVar;
        int i10;
        q.f<o2.e> fVar;
        float f10;
        float f11;
        boolean z10;
        int i11;
        float f12;
        q.f<o2.e> fVar2;
        float f13;
        float f14;
        float f15;
        HashMap hashMap2;
        ArrayList arrayList2;
        q.j<l2.d> jVar2;
        float f16;
        float f17;
        q.f<o2.e> fVar3;
        float c10 = s2.g.c();
        q.f<o2.e> fVar4 = new q.f<>();
        ArrayList arrayList3 = new ArrayList();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        q.j<l2.d> jVar3 = new q.j<>();
        g2.h hVar = new g2.h();
        dVar.c();
        int i12 = 0;
        float f18 = gl.Code;
        float f19 = gl.Code;
        float f20 = gl.Code;
        int i13 = 0;
        while (dVar.g()) {
            float f21 = f18;
            switch (dVar.P(f34617a)) {
                case 0:
                    f15 = c10;
                    hashMap2 = hashMap5;
                    arrayList2 = arrayList4;
                    jVar2 = jVar3;
                    f16 = f19;
                    f17 = f20;
                    fVar3 = fVar4;
                    i13 = dVar.j();
                    fVar4 = fVar3;
                    f18 = f21;
                    c10 = f15;
                    f19 = f16;
                    arrayList4 = arrayList2;
                    f20 = f17;
                    hashMap5 = hashMap2;
                    jVar3 = jVar2;
                    break;
                case 1:
                    f15 = c10;
                    hashMap2 = hashMap5;
                    arrayList2 = arrayList4;
                    jVar2 = jVar3;
                    f16 = f19;
                    f17 = f20;
                    fVar3 = fVar4;
                    i12 = dVar.j();
                    fVar4 = fVar3;
                    f18 = f21;
                    c10 = f15;
                    f19 = f16;
                    arrayList4 = arrayList2;
                    f20 = f17;
                    hashMap5 = hashMap2;
                    jVar3 = jVar2;
                    break;
                case 2:
                    f = c10;
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    jVar = jVar3;
                    i10 = i12;
                    fVar = fVar4;
                    f19 = (float) dVar.i();
                    f18 = f21;
                    fVar4 = fVar;
                    c10 = f;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    jVar3 = jVar;
                    i12 = i10;
                    break;
                case 3:
                    f = c10;
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    jVar = jVar3;
                    i10 = i12;
                    fVar = fVar4;
                    f20 = ((float) dVar.i()) - 0.01f;
                    f18 = f21;
                    fVar4 = fVar;
                    c10 = f;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    jVar3 = jVar;
                    i12 = i10;
                    break;
                case 4:
                    f = c10;
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    jVar = jVar3;
                    i10 = i12;
                    fVar = fVar4;
                    f18 = (float) dVar.i();
                    fVar4 = fVar;
                    c10 = f;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    jVar3 = jVar;
                    i12 = i10;
                    break;
                case 5:
                    f = c10;
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    jVar = jVar3;
                    i10 = i12;
                    f10 = f19;
                    f11 = f20;
                    fVar = fVar4;
                    String[] split = dVar.k().split("\\.");
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    int parseInt3 = Integer.parseInt(split[2]);
                    if (parseInt >= 4 && (parseInt > 4 || (parseInt2 >= 4 && (parseInt2 > 4 || parseInt3 >= 0)))) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        hVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    f18 = f21;
                    f19 = f10;
                    f20 = f11;
                    fVar4 = fVar;
                    c10 = f;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    jVar3 = jVar;
                    i12 = i10;
                    break;
                case 6:
                    f = c10;
                    q.f<o2.e> fVar5 = fVar4;
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    jVar = jVar3;
                    i10 = i12;
                    f10 = f19;
                    f11 = f20;
                    dVar.b();
                    int i14 = 0;
                    while (dVar.g()) {
                        o2.e a10 = v.a(dVar, hVar);
                        if (a10.f33577e == 3) {
                            i14++;
                        }
                        arrayList3.add(a10);
                        q.f<o2.e> fVar6 = fVar5;
                        fVar6.f(a10.f33576d, a10);
                        if (i14 > 4) {
                            s2.c.b("You have " + i14 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        fVar5 = fVar6;
                    }
                    fVar = fVar5;
                    dVar.d();
                    f18 = f21;
                    f19 = f10;
                    f20 = f11;
                    fVar4 = fVar;
                    c10 = f;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    jVar3 = jVar;
                    i12 = i10;
                    break;
                case 7:
                    arrayList = arrayList4;
                    f10 = f19;
                    f11 = f20;
                    dVar.b();
                    while (dVar.g()) {
                        ArrayList arrayList5 = new ArrayList();
                        q.f fVar7 = new q.f();
                        dVar.c();
                        HashMap hashMap6 = hashMap5;
                        String str = null;
                        String str2 = null;
                        int i15 = 0;
                        int i16 = 0;
                        while (dVar.g()) {
                            q.j<l2.d> jVar4 = jVar3;
                            int P = dVar.P(f34618b);
                            if (P != 0) {
                                i11 = i12;
                                if (P != 1) {
                                    if (P != 2) {
                                        if (P != 3) {
                                            if (P != 4) {
                                                if (P != 5) {
                                                    dVar.Q();
                                                    dVar.S();
                                                    f12 = c10;
                                                    fVar2 = fVar4;
                                                } else {
                                                    dVar.k();
                                                }
                                            } else {
                                                str2 = dVar.k();
                                            }
                                        } else {
                                            i16 = dVar.j();
                                        }
                                    } else {
                                        i15 = dVar.j();
                                    }
                                } else {
                                    dVar.b();
                                    while (dVar.g()) {
                                        o2.e a11 = v.a(dVar, hVar);
                                        fVar7.f(a11.f33576d, a11);
                                        arrayList5.add(a11);
                                        c10 = c10;
                                        fVar4 = fVar4;
                                    }
                                    f12 = c10;
                                    fVar2 = fVar4;
                                    dVar.d();
                                }
                                c10 = f12;
                                jVar3 = jVar4;
                                i12 = i11;
                                fVar4 = fVar2;
                            } else {
                                i11 = i12;
                                str = dVar.k();
                            }
                            jVar3 = jVar4;
                            i12 = i11;
                        }
                        float f22 = c10;
                        q.f<o2.e> fVar8 = fVar4;
                        q.j<l2.d> jVar5 = jVar3;
                        int i17 = i12;
                        dVar.e();
                        if (str2 != null) {
                            hashMap4.put(str, new g2.b0(i15, i16, str, str2));
                        } else {
                            hashMap3.put(str, arrayList5);
                        }
                        c10 = f22;
                        hashMap5 = hashMap6;
                        jVar3 = jVar5;
                        i12 = i17;
                        fVar4 = fVar8;
                    }
                    f = c10;
                    hashMap = hashMap5;
                    jVar = jVar3;
                    i10 = i12;
                    dVar.d();
                    fVar = fVar4;
                    f18 = f21;
                    f19 = f10;
                    f20 = f11;
                    fVar4 = fVar;
                    c10 = f;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    jVar3 = jVar;
                    i12 = i10;
                    break;
                case 8:
                    f10 = f19;
                    f11 = f20;
                    dVar.c();
                    while (dVar.g()) {
                        if (dVar.P(f34619c) != 0) {
                            dVar.Q();
                            dVar.S();
                        } else {
                            dVar.b();
                            while (dVar.g()) {
                                c.a aVar = n.f34601a;
                                dVar.c();
                                String str3 = null;
                                String str4 = null;
                                String str5 = null;
                                while (dVar.g()) {
                                    int P2 = dVar.P(n.f34601a);
                                    if (P2 != 0) {
                                        ArrayList arrayList6 = arrayList4;
                                        if (P2 != 1) {
                                            if (P2 != 2) {
                                                if (P2 != 3) {
                                                    dVar.Q();
                                                    dVar.S();
                                                } else {
                                                    dVar.i();
                                                }
                                            } else {
                                                str5 = dVar.k();
                                            }
                                        } else {
                                            str4 = dVar.k();
                                        }
                                        arrayList4 = arrayList6;
                                    } else {
                                        str3 = dVar.k();
                                    }
                                }
                                dVar.e();
                                hashMap5.put(str4, new l2.c(str3, str4, str5));
                                arrayList4 = arrayList4;
                            }
                            dVar.d();
                        }
                    }
                    arrayList = arrayList4;
                    dVar.e();
                    f = c10;
                    hashMap = hashMap5;
                    jVar = jVar3;
                    i10 = i12;
                    fVar = fVar4;
                    f18 = f21;
                    f19 = f10;
                    f20 = f11;
                    fVar4 = fVar;
                    c10 = f;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    jVar3 = jVar;
                    i12 = i10;
                    break;
                case 9:
                    f10 = f19;
                    f11 = f20;
                    dVar.b();
                    while (dVar.g()) {
                        c.a aVar2 = m.f34599a;
                        ArrayList arrayList7 = new ArrayList();
                        dVar.c();
                        double d10 = 0.0d;
                        String str6 = null;
                        String str7 = null;
                        char c11 = 0;
                        while (dVar.g()) {
                            int P3 = dVar.P(m.f34599a);
                            if (P3 != 0) {
                                if (P3 != 1) {
                                    if (P3 != 2) {
                                        if (P3 != 3) {
                                            if (P3 != 4) {
                                                if (P3 != 5) {
                                                    dVar.Q();
                                                    dVar.S();
                                                } else {
                                                    dVar.c();
                                                    while (dVar.g()) {
                                                        if (dVar.P(m.f34600b) != 0) {
                                                            dVar.Q();
                                                            dVar.S();
                                                        } else {
                                                            dVar.b();
                                                            while (dVar.g()) {
                                                                arrayList7.add((n2.n) h.a(dVar, hVar));
                                                            }
                                                            dVar.d();
                                                        }
                                                    }
                                                    dVar.e();
                                                }
                                            } else {
                                                str7 = dVar.k();
                                            }
                                        } else {
                                            str6 = dVar.k();
                                        }
                                    } else {
                                        d10 = dVar.i();
                                    }
                                } else {
                                    dVar.i();
                                }
                            } else {
                                c11 = dVar.k().charAt(0);
                            }
                        }
                        dVar.e();
                        l2.d dVar2 = new l2.d(arrayList7, c11, d10, str6, str7);
                        jVar3.d(dVar2.hashCode(), dVar2);
                    }
                    dVar.d();
                    f = c10;
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    jVar = jVar3;
                    i10 = i12;
                    fVar = fVar4;
                    f18 = f21;
                    f19 = f10;
                    f20 = f11;
                    fVar4 = fVar;
                    c10 = f;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    jVar3 = jVar;
                    i12 = i10;
                    break;
                case 10:
                    dVar.b();
                    while (dVar.g()) {
                        dVar.c();
                        String str8 = null;
                        float f23 = gl.Code;
                        float f24 = gl.Code;
                        while (dVar.g()) {
                            int P4 = dVar.P(f34620d);
                            if (P4 != 0) {
                                f13 = f20;
                                if (P4 != 1) {
                                    if (P4 != 2) {
                                        dVar.Q();
                                        dVar.S();
                                    } else {
                                        f14 = f19;
                                        f24 = (float) dVar.i();
                                    }
                                } else {
                                    f14 = f19;
                                    f23 = (float) dVar.i();
                                }
                                f19 = f14;
                            } else {
                                f13 = f20;
                                str8 = dVar.k();
                            }
                            f20 = f13;
                        }
                        dVar.e();
                        arrayList4.add(new l2.h(str8, f23, f24));
                        f19 = f19;
                        f20 = f20;
                    }
                    f10 = f19;
                    f11 = f20;
                    dVar.d();
                    f = c10;
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    jVar = jVar3;
                    i10 = i12;
                    fVar = fVar4;
                    f18 = f21;
                    f19 = f10;
                    f20 = f11;
                    fVar4 = fVar;
                    c10 = f;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    jVar3 = jVar;
                    i12 = i10;
                    break;
                default:
                    f = c10;
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    jVar = jVar3;
                    i10 = i12;
                    f10 = f19;
                    f11 = f20;
                    fVar = fVar4;
                    dVar.Q();
                    dVar.S();
                    f18 = f21;
                    f19 = f10;
                    f20 = f11;
                    fVar4 = fVar;
                    c10 = f;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    jVar3 = jVar;
                    i12 = i10;
                    break;
            }
        }
        float f25 = c10;
        hVar.f28414j = new Rect(0, 0, (int) (i13 * f25), (int) (i12 * f25));
        hVar.f28415k = f19;
        hVar.f28416l = f20;
        hVar.f28417m = f18;
        hVar.f28413i = arrayList3;
        hVar.f28412h = fVar4;
        hVar.f28408c = hashMap3;
        hVar.f28409d = hashMap4;
        hVar.f28411g = jVar3;
        hVar.f28410e = hashMap5;
        hVar.f = arrayList4;
        return hVar;
    }
}
