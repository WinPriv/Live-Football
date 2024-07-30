package m5;

import android.os.SystemClock;
import android.util.Pair;
import d6.g0;
import j7.b1;
import j7.j0;
import j7.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* compiled from: BaseUrlExclusionList.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f32892a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f32893b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f32894c;

    /* renamed from: d, reason: collision with root package name */
    public final Random f32895d;

    public a() {
        Random random = new Random();
        this.f32894c = new HashMap();
        this.f32895d = random;
        this.f32892a = new HashMap();
        this.f32893b = new HashMap();
    }

    public static void a(Object obj, long j10, HashMap hashMap) {
        if (hashMap.containsKey(obj)) {
            Long l10 = (Long) hashMap.get(obj);
            int i10 = g0.f27302a;
            j10 = Math.max(j10, l10.longValue());
        }
        hashMap.put(obj, Long.valueOf(j10));
    }

    public static void c(HashMap hashMap, long j10) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            hashMap.remove(arrayList.get(i10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList b(j0 j0Var) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.f32892a;
        c(hashMap, elapsedRealtime);
        HashMap hashMap2 = this.f32893b;
        c(hashMap2, elapsedRealtime);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < j0Var.size(); i10++) {
            n5.b bVar = (n5.b) j0Var.get(i10);
            if (!hashMap.containsKey(bVar.f33351b) && !hashMap2.containsKey(Integer.valueOf(bVar.f33352c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public final n5.b d(j0 j0Var) {
        ArrayList b10 = b(j0Var);
        if (b10.size() < 2) {
            return (n5.b) b1.c(b10.iterator(), null);
        }
        Collections.sort(b10, new k0.d(2));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = ((n5.b) b10.get(0)).f33352c;
        int i12 = 0;
        while (true) {
            if (i12 >= b10.size()) {
                break;
            }
            n5.b bVar = (n5.b) b10.get(i12);
            if (i11 != bVar.f33352c) {
                if (arrayList.size() == 1) {
                    return (n5.b) b10.get(0);
                }
            } else {
                arrayList.add(new Pair(bVar.f33351b, Integer.valueOf(bVar.f33353d)));
                i12++;
            }
        }
        HashMap hashMap = this.f32894c;
        n5.b bVar2 = (n5.b) hashMap.get(arrayList);
        if (bVar2 == null) {
            List subList = b10.subList(0, arrayList.size());
            int i13 = 0;
            for (int i14 = 0; i14 < subList.size(); i14++) {
                i13 += ((n5.b) subList.get(i14)).f33353d;
            }
            int nextInt = this.f32895d.nextInt(i13);
            int i15 = 0;
            while (true) {
                if (i10 < subList.size()) {
                    n5.b bVar3 = (n5.b) subList.get(i10);
                    i15 += bVar3.f33353d;
                    if (nextInt < i15) {
                        bVar2 = bVar3;
                        break;
                    }
                    i10++;
                } else {
                    bVar2 = (n5.b) r.B(subList);
                    break;
                }
            }
            hashMap.put(arrayList, bVar2);
        }
        return bVar2;
    }
}
