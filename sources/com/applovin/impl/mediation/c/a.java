package com.applovin.impl.mediation.c;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.List;

/* loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.e.a {

    /* renamed from: a, reason: collision with root package name */
    private final List<com.applovin.impl.mediation.a.f> f17770a;

    /* renamed from: b, reason: collision with root package name */
    private final Activity f17771b;

    /* renamed from: com.applovin.impl.mediation.c.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0204a extends com.applovin.impl.sdk.e.a {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.mediation.a.f f17774a;

        /* renamed from: b, reason: collision with root package name */
        private final List<com.applovin.impl.mediation.a.f> f17775b;

        /* renamed from: c, reason: collision with root package name */
        private final Activity f17776c;

        @Override // java.lang.Runnable
        public void run() {
            if (y.a()) {
                this.f18839h.b(this.f18838g, "Auto-initing " + this.f17774a + "...");
            }
            this.f.ao().a(this.f17774a, this.f17776c, new Runnable() { // from class: com.applovin.impl.mediation.c.a.a.1
                @Override // java.lang.Runnable
                public void run() {
                    y unused = ((com.applovin.impl.sdk.e.a) C0204a.this).f18839h;
                    if (y.a()) {
                        ((com.applovin.impl.sdk.e.a) C0204a.this).f18839h.b(((com.applovin.impl.sdk.e.a) C0204a.this).f18838g, "Initialization task for adapter '" + C0204a.this.f17774a.X() + "' finished");
                    }
                    int indexOf = C0204a.this.f17775b.indexOf(C0204a.this.f17774a);
                    if (indexOf >= C0204a.this.f17775b.size() - 1) {
                        y unused2 = ((com.applovin.impl.sdk.e.a) C0204a.this).f18839h;
                        if (y.a()) {
                            ((com.applovin.impl.sdk.e.a) C0204a.this).f18839h.b(((com.applovin.impl.sdk.e.a) C0204a.this).f18838g, "Finished initializing adapters");
                            return;
                        }
                        return;
                    }
                    com.applovin.impl.mediation.a.f fVar = (com.applovin.impl.mediation.a.f) C0204a.this.f17775b.get(indexOf + 1);
                    ((com.applovin.impl.sdk.e.a) C0204a.this).f.M().a(new C0204a(fVar, C0204a.this.f17775b, ((com.applovin.impl.sdk.e.a) C0204a.this).f, C0204a.this.f17776c), o.a.MAIN, fVar.ak());
                }
            });
        }

        private C0204a(com.applovin.impl.mediation.a.f fVar, List<com.applovin.impl.mediation.a.f> list, p pVar, Activity activity) {
            super("TaskSequentialInitAdapter:" + fVar.W(), pVar, true);
            this.f17776c = activity;
            this.f17774a = fVar;
            this.f17775b = list;
        }
    }

    public a(List<com.applovin.impl.mediation.a.f> list, Activity activity, p pVar) {
        super("TaskAutoInitAdapters", pVar, true);
        this.f17770a = list;
        this.f17771b = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        try {
            if (this.f17770a.size() > 0) {
                if (y.a()) {
                    y yVar = this.f18839h;
                    String str2 = this.f18838g;
                    StringBuilder sb2 = new StringBuilder("Auto-initing ");
                    sb2.append(this.f17770a.size());
                    sb2.append(" adapters");
                    if (this.f.av().a()) {
                        str = " in test mode";
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    sb2.append("...");
                    yVar.b(str2, sb2.toString());
                }
                if (TextUtils.isEmpty(this.f.s())) {
                    this.f.d(AppLovinMediationProvider.MAX);
                } else if (!this.f.f()) {
                    y.i("AppLovinSdk", "Auto-initing adapters for non-MAX mediation provider: " + this.f.s());
                }
                if (this.f17771b == null) {
                    y.i("AppLovinSdk", "\n**********\nAttempting to init 3rd-party SDKs without an Activity instance.\n**********\n");
                }
                if (((Boolean) this.f.a(com.applovin.impl.sdk.c.a.P)).booleanValue()) {
                    com.applovin.impl.mediation.a.f fVar = this.f17770a.get(0);
                    this.f.M().a(new C0204a(fVar, this.f17770a, this.f, this.f17771b), o.a.MAIN, fVar.ak());
                } else {
                    for (final com.applovin.impl.mediation.a.f fVar2 : this.f17770a) {
                        this.f.M().a(new Runnable() { // from class: com.applovin.impl.mediation.c.a.1
                            @Override // java.lang.Runnable
                            public void run() {
                                y unused = ((com.applovin.impl.sdk.e.a) a.this).f18839h;
                                if (y.a()) {
                                    ((com.applovin.impl.sdk.e.a) a.this).f18839h.b(((com.applovin.impl.sdk.e.a) a.this).f18838g, "Auto-initing adapter: " + fVar2);
                                }
                                ((com.applovin.impl.sdk.e.a) a.this).f.ao().a(fVar2, a.this.f17771b);
                            }
                        });
                    }
                }
            }
        } catch (Throwable th) {
            if (y.a()) {
                this.f18839h.b(this.f18838g, "Failed to auto-init adapters", th);
            }
        }
    }
}
