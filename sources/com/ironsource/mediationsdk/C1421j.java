package com.ironsource.mediationsdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.mediationsdk.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1421j {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<String, ArrayList<a>> f25507a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    public final int f25508b;

    /* renamed from: com.ironsource.mediationsdk.j$a */
    /* loaded from: classes2.dex */
    public enum a {
        ISAuctionPerformanceDidntAttemptToLoad,
        ISAuctionPerformanceFailedToLoad,
        ISAuctionPerformanceLoadedSuccessfully,
        ISAuctionPerformanceFailedToShow,
        ISAuctionPerformanceShowedSuccessfully,
        ISAuctionPerformanceNotPartOfWaterfall
    }

    public C1421j(List<String> list, int i10) {
        this.f25508b = i10;
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.f25507a.put(it.next(), new ArrayList<>());
        }
    }

    public final String a(String str) {
        ArrayList<a> arrayList = this.f25507a.get(str);
        String str2 = "";
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<a> it = arrayList.iterator();
            StringBuilder sb2 = new StringBuilder("");
            while (true) {
                sb2.append(it.next().ordinal());
                str2 = sb2.toString();
                if (!it.hasNext()) {
                    break;
                }
                sb2 = com.ironsource.adapters.facebook.a.j(com.ironsource.adapters.facebook.a.h(str2, ","));
            }
        }
        return str2;
    }

    public final void a(ConcurrentHashMap<String, a> concurrentHashMap) {
        int i10 = this.f25508b;
        if (i10 == 0) {
            return;
        }
        ConcurrentHashMap<String, ArrayList<a>> concurrentHashMap2 = this.f25507a;
        for (String str : concurrentHashMap2.keySet()) {
            a aVar = a.ISAuctionPerformanceNotPartOfWaterfall;
            if (concurrentHashMap.containsKey(str)) {
                aVar = concurrentHashMap.get(str);
            }
            ArrayList<a> arrayList = concurrentHashMap2.get(str);
            if (i10 != -1 && arrayList.size() == i10) {
                arrayList.remove(0);
            }
            arrayList.add(aVar);
        }
    }
}
