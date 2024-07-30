package com.ironsource.mediationsdk.utils;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f25946a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f25947b = new HashMap();

    /* loaded from: classes2.dex */
    public interface a {
        int j();

        String k();
    }

    public n(List<a> list) {
        for (a aVar : list) {
            this.f25946a.put(aVar.k(), 0);
            this.f25947b.put(aVar.k(), Integer.valueOf(aVar.j()));
        }
    }

    public final void a(a aVar) {
        synchronized (this) {
            String k10 = aVar.k();
            if (this.f25946a.containsKey(k10)) {
                HashMap hashMap = this.f25946a;
                hashMap.put(k10, Integer.valueOf(((Integer) hashMap.get(k10)).intValue() + 1));
            }
        }
    }

    public final boolean b(a aVar) {
        synchronized (this) {
            String k10 = aVar.k();
            boolean z10 = false;
            if (!this.f25946a.containsKey(k10)) {
                return false;
            }
            if (((Integer) this.f25946a.get(k10)).intValue() >= aVar.j()) {
                z10 = true;
            }
            return z10;
        }
    }

    public final boolean a() {
        HashMap hashMap = this.f25947b;
        for (String str : hashMap.keySet()) {
            if (((Integer) this.f25946a.get(str)).intValue() < ((Integer) hashMap.get(str)).intValue()) {
                return false;
            }
        }
        return true;
    }
}
