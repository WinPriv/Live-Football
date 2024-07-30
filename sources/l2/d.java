package l2;

import e0.i;
import java.util.ArrayList;
import java.util.List;
import n2.n;

/* compiled from: FontCharacter.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List<n> f32336a;

    /* renamed from: b, reason: collision with root package name */
    public final char f32337b;

    /* renamed from: c, reason: collision with root package name */
    public final double f32338c;

    /* renamed from: d, reason: collision with root package name */
    public final String f32339d;

    /* renamed from: e, reason: collision with root package name */
    public final String f32340e;

    public d(ArrayList arrayList, char c10, double d10, String str, String str2) {
        this.f32336a = arrayList;
        this.f32337b = c10;
        this.f32338c = d10;
        this.f32339d = str;
        this.f32340e = str2;
    }

    public final int hashCode() {
        return this.f32339d.hashCode() + i.b(this.f32340e, this.f32337b * 31, 31);
    }
}
