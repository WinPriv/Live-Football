package n5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: AdaptationSet.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f33345a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33346b;

    /* renamed from: c, reason: collision with root package name */
    public final List<j> f33347c;

    /* renamed from: d, reason: collision with root package name */
    public final List<e> f33348d;

    /* renamed from: e, reason: collision with root package name */
    public final List<e> f33349e;
    public final List<e> f;

    public a(int i10, int i11, ArrayList arrayList, List list, List list2, List list3) {
        this.f33345a = i10;
        this.f33346b = i11;
        this.f33347c = Collections.unmodifiableList(arrayList);
        this.f33348d = Collections.unmodifiableList(list);
        this.f33349e = Collections.unmodifiableList(list2);
        this.f = Collections.unmodifiableList(list3);
    }
}
