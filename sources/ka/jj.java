package ka;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class jj {

    /* renamed from: g, reason: collision with root package name */
    public static jj f31348g;

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f31349h = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public int f31350a;

    /* renamed from: b, reason: collision with root package name */
    public int f31351b;

    /* renamed from: c, reason: collision with root package name */
    public int f31352c;

    /* renamed from: d, reason: collision with root package name */
    public int f31353d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f31354e = new ArrayList();
    public boolean f = false;

    public static jj a() {
        jj jjVar;
        synchronized (f31349h) {
            if (f31348g == null) {
                f31348g = new jj();
            }
            jjVar = f31348g;
        }
        return jjVar;
    }

    public final void b() {
        if (this.f) {
            n7.b("RewardTimer", "oneMississippi stop.");
            return;
        }
        int i10 = this.f31352c - 1;
        this.f31352c = i10;
        ArrayList arrayList = this.f31354e;
        if (i10 <= 0) {
            n7.b("RewardTimer", "reward time reached.");
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((cj) arrayList.get(i11)).g();
            }
        }
        int i12 = this.f31353d - 1;
        this.f31353d = i12;
        if (i12 <= 0) {
            n7.b("RewardTimer", "close btn show time reached.");
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((cj) arrayList.get(i13)).h();
            }
        }
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            ((cj) arrayList.get(i14)).f();
        }
    }
}
