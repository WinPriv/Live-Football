package com.applovin.impl.a.a.b.a;

import android.app.Activity;
import android.content.Context;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.d.e;
import com.applovin.impl.sdk.p;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class b extends d {

    /* renamed from: a, reason: collision with root package name */
    private p f16918a;

    /* renamed from: b, reason: collision with root package name */
    private List<com.applovin.impl.a.a.a.a> f16919b;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f16920d;

    /* renamed from: e, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.ui.d.c> f16921e;

    /* loaded from: classes.dex */
    public enum a {
        RECENT_ADS,
        COUNT
    }

    public b(Context context) {
        super(context);
        this.f16920d = new AtomicBoolean();
        this.f16921e = new ArrayList();
    }

    public void a() {
        this.f16920d.compareAndSet(true, false);
    }

    public boolean b() {
        return this.f16921e.size() == 0;
    }

    public p c() {
        return this.f16918a;
    }

    public List<com.applovin.impl.a.a.a.a> d() {
        return this.f16919b;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public int e() {
        return a.COUNT.ordinal();
    }

    public String toString() {
        return "CreativeDebuggerListAdapter{isInitialized=" + this.f16920d.get() + "}";
    }

    public void a(List<com.applovin.impl.a.a.a.a> list, p pVar) {
        Activity x10;
        this.f16918a = pVar;
        this.f16919b = list;
        if (!(this.f18168c instanceof Activity) && (x10 = pVar.x()) != null) {
            this.f18168c = x10;
        }
        if (list != null && this.f16920d.compareAndSet(false, true)) {
            this.f16921e = a(this.f16919b);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.a.a.b.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                b.this.notifyDataSetChanged();
            }
        });
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public com.applovin.impl.mediation.debugger.ui.d.c b(int i10) {
        return new e("RECENT ADS");
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public List<com.applovin.impl.mediation.debugger.ui.d.c> c(int i10) {
        return this.f16921e;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public int a(int i10) {
        return this.f16921e.size();
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> a(List<com.applovin.impl.a.a.a.a> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<com.applovin.impl.a.a.a.a> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.applovin.impl.a.a.b.a.a.a(it.next(), this.f18168c));
        }
        return arrayList;
    }
}
