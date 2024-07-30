package m8;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import m8.b;
import m8.v;
import m8.x;

/* compiled from: GsonBuilder.java */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Excluder f32928a = Excluder.f21314x;

    /* renamed from: b, reason: collision with root package name */
    public final v.a f32929b = v.f32944s;

    /* renamed from: c, reason: collision with root package name */
    public final b.a f32930c = b.f32910s;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f32931d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f32932e = new ArrayList();
    public final ArrayList f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final int f32933g = 2;

    /* renamed from: h, reason: collision with root package name */
    public final int f32934h = 2;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f32935i = true;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f32936j = true;

    /* renamed from: k, reason: collision with root package name */
    public final x.a f32937k = x.f32946s;

    /* renamed from: l, reason: collision with root package name */
    public final x.b f32938l = x.f32947t;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedList<w> f32939m = new LinkedList<>();

    public final i a() {
        int i10;
        b0 b0Var;
        b0 b0Var2;
        ArrayList arrayList = this.f32932e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z10 = com.google.gson.internal.sql.a.f21428a;
        a.AbstractC0240a.C0241a c0241a = a.AbstractC0240a.f21405b;
        int i11 = this.f32933g;
        if (i11 != 2 && (i10 = this.f32934h) != 2) {
            b0 a10 = c0241a.a(i11, i10);
            if (z10) {
                b0Var = com.google.gson.internal.sql.a.f21430c.a(i11, i10);
                b0Var2 = com.google.gson.internal.sql.a.f21429b.a(i11, i10);
            } else {
                b0Var = null;
                b0Var2 = null;
            }
            arrayList3.add(a10);
            if (z10) {
                arrayList3.add(b0Var);
                arrayList3.add(b0Var2);
            }
        }
        return new i(this.f32928a, this.f32930c, new HashMap(this.f32931d), this.f32935i, this.f32936j, this.f32929b, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, this.f32937k, this.f32938l, new ArrayList(this.f32939m));
    }
}
