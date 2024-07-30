package com.applovin.impl.mediation.nativeAds.a;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.m;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Collection;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final m<Integer> f18379a = new m<>();

    /* renamed from: b, reason: collision with root package name */
    private final TreeSet<Integer> f18380b = new TreeSet<>();

    /* renamed from: c, reason: collision with root package name */
    private final Map<Integer, MaxAd> f18381c = CollectionUtils.map();

    /* renamed from: d, reason: collision with root package name */
    private int f18382d;

    /* renamed from: e, reason: collision with root package name */
    private int f18383e;

    public a(MaxAdPlacerSettings maxAdPlacerSettings) {
        a(maxAdPlacerSettings);
    }

    private void a(MaxAdPlacerSettings maxAdPlacerSettings) {
        if (!maxAdPlacerSettings.hasValidPositioning()) {
            y.i("MaxAdPlacerData", "No positioning info was provided with ad placer settings. You must set at least (1) one or more fixed positions or (2) a repeating interval greater than or equal to 2 for the ad placer to determine where to position ads.");
            return;
        }
        this.f18379a.addAll(maxAdPlacerSettings.getFixedPositions());
        if (!maxAdPlacerSettings.isRepeatingEnabled()) {
            return;
        }
        int repeatingInterval = maxAdPlacerSettings.getRepeatingInterval();
        if (this.f18379a.isEmpty()) {
            this.f18379a.add((m<Integer>) Integer.valueOf(repeatingInterval - 1));
        }
        int intValue = this.f18379a.a().intValue();
        while (true) {
            intValue += repeatingInterval;
            if (this.f18379a.size() >= maxAdPlacerSettings.getMaxAdCount()) {
                return;
            } else {
                this.f18379a.add((m<Integer>) Integer.valueOf(intValue));
            }
        }
    }

    public boolean b(int i10) {
        return this.f18380b.contains(Integer.valueOf(i10));
    }

    public MaxAd c(int i10) {
        return this.f18381c.get(Integer.valueOf(i10));
    }

    public Collection<Integer> d(int i10) {
        return new TreeSet((SortedSet) this.f18380b.tailSet(Integer.valueOf(i10), false));
    }

    public int e(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 + a(i10 - 1, false);
    }

    public int f(int i10) {
        return i10 + a(i10, false);
    }

    public int g(int i10) {
        if (a(i10)) {
            return -1;
        }
        return i10 - a(i10, true);
    }

    public void h(int i10) {
        int c10 = this.f18379a.c(Integer.valueOf(i10));
        for (int size = this.f18379a.size() - 1; size >= c10; size--) {
            Integer a10 = this.f18379a.a(size);
            int intValue = a10.intValue() + 1;
            c(a10.intValue(), intValue);
            this.f18379a.a(size, Integer.valueOf(intValue));
        }
    }

    public void i(int i10) {
        int c10 = this.f18379a.c(Integer.valueOf(i10));
        if (a(i10)) {
            this.f18381c.remove(Integer.valueOf(i10));
            this.f18380b.remove(Integer.valueOf(i10));
            this.f18379a.b(c10);
        }
        while (c10 < this.f18379a.size()) {
            Integer a10 = this.f18379a.a(c10);
            int intValue = a10.intValue() - 1;
            c(a10.intValue(), intValue);
            this.f18379a.a(c10, Integer.valueOf(intValue));
            c10++;
        }
    }

    public Collection<Integer> b() {
        return new TreeSet((SortedSet) this.f18380b);
    }

    public void c() {
        this.f18381c.clear();
        this.f18380b.clear();
    }

    public void b(int i10, int i11) {
        i(i10);
        h(i11);
    }

    private void c(int i10, int i11) {
        if (this.f18381c.containsKey(Integer.valueOf(i10))) {
            this.f18381c.put(Integer.valueOf(i11), this.f18381c.get(Integer.valueOf(i10)));
            this.f18380b.add(Integer.valueOf(i11));
            this.f18381c.remove(Integer.valueOf(i10));
            this.f18380b.remove(Integer.valueOf(i10));
        }
    }

    public boolean a(int i10) {
        return this.f18379a.contains(Integer.valueOf(i10));
    }

    public int a() {
        int i10 = this.f18382d;
        if (i10 != -1 && this.f18383e != -1) {
            while (i10 <= this.f18383e) {
                if (a(i10) && !b(i10)) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    public void a(int i10, int i11) {
        this.f18382d = i10;
        this.f18383e = i11;
    }

    public void a(MaxAd maxAd, int i10) {
        this.f18381c.put(Integer.valueOf(i10), maxAd);
        this.f18380b.add(Integer.valueOf(i10));
    }

    public void a(Collection<Integer> collection) {
        for (Integer num : collection) {
            this.f18381c.remove(num);
            this.f18380b.remove(num);
        }
    }

    private int a(int i10, boolean z10) {
        int d10 = this.f18379a.d(Integer.valueOf(i10));
        if (!z10) {
            int i11 = i10 + d10;
            while (d10 < this.f18379a.size() && i11 >= this.f18379a.a(d10).intValue()) {
                i11++;
                d10++;
            }
        }
        return d10;
    }
}
