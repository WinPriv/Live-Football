package com.anythink.core.common.k.a;

import android.view.View;
import com.anythink.core.common.k.a.f;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final f f6089a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<View, b> f6090b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<View, d<b>> f6091c;

    /* renamed from: d, reason: collision with root package name */
    private final f.b f6092d;

    /* renamed from: e, reason: collision with root package name */
    private f.d f6093e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c() {
        /*
            r6 = this;
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.WeakHashMap r1 = new java.util.WeakHashMap
            r1.<init>()
            com.anythink.core.common.k.a.f$b r2 = new com.anythink.core.common.k.a.f$b
            r2.<init>()
            com.anythink.core.common.k.a.f r3 = new com.anythink.core.common.k.a.f
            r3.<init>()
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            r4.<init>(r5)
            r6.<init>(r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.k.a.c.<init>():void");
    }

    @Deprecated
    private f.d c() {
        return this.f6093e;
    }

    public final void b() {
        a();
        this.f6089a.b();
        this.f6093e = null;
    }

    public final void a(View view, b bVar) {
        if (this.f6090b.get(view) == bVar) {
            return;
        }
        a(view);
        if (bVar.isImpressionRecorded()) {
            return;
        }
        this.f6090b.put(view, bVar);
        f fVar = this.f6089a;
        int impressionMinPercentageViewed = bVar.getImpressionMinPercentageViewed();
        fVar.a(view, view, impressionMinPercentageViewed, impressionMinPercentageViewed, bVar.getImpressionMinVisiblePx());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(int r6) {
        /*
            r5 = this;
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.WeakHashMap r1 = new java.util.WeakHashMap
            r1.<init>()
            com.anythink.core.common.k.a.f$b r2 = new com.anythink.core.common.k.a.f$b
            r2.<init>()
            com.anythink.core.common.k.a.f r3 = new com.anythink.core.common.k.a.f
            r3.<init>(r6)
            android.os.Handler r6 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r6.<init>(r4)
            r5.<init>(r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.k.a.c.<init>(int):void");
    }

    private void b(View view) {
        this.f6091c.remove(view);
    }

    private c(Map<View, b> map, Map<View, d<b>> map2, f.b bVar, f fVar) {
        this.f6090b = map;
        this.f6091c = map2;
        this.f6092d = bVar;
        this.f6089a = fVar;
        f.d dVar = new f.d() { // from class: com.anythink.core.common.k.a.c.1
            @Override // com.anythink.core.common.k.a.f.d
            public final void a(List<View> list) {
                for (View view : list) {
                    b bVar2 = (b) c.this.f6090b.get(view);
                    if (bVar2 == null) {
                        c.this.a(view);
                    } else {
                        bVar2.recordImpression(view);
                        bVar2.setImpressionRecorded();
                    }
                }
            }
        };
        this.f6093e = dVar;
        fVar.a(dVar);
    }

    public final void a(View view) {
        this.f6090b.remove(view);
        b(view);
        this.f6089a.a(view);
    }

    public final void a() {
        this.f6090b.clear();
        this.f6091c.clear();
        this.f6089a.a();
    }
}
