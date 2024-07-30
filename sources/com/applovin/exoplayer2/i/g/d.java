package com.applovin.exoplayer2.i.g;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.applovin.exoplayer2.i.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f15760a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15761b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15762c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15763d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15764e;
    public final g f;

    /* renamed from: g, reason: collision with root package name */
    public final String f15765g;

    /* renamed from: h, reason: collision with root package name */
    public final String f15766h;

    /* renamed from: i, reason: collision with root package name */
    public final d f15767i;

    /* renamed from: j, reason: collision with root package name */
    private final String[] f15768j;

    /* renamed from: k, reason: collision with root package name */
    private final HashMap<String, Integer> f15769k;

    /* renamed from: l, reason: collision with root package name */
    private final HashMap<String, Integer> f15770l;

    /* renamed from: m, reason: collision with root package name */
    private List<d> f15771m;

    private d(String str, String str2, long j10, long j11, g gVar, String[] strArr, String str3, String str4, d dVar) {
        boolean z10;
        this.f15760a = str;
        this.f15761b = str2;
        this.f15766h = str4;
        this.f = gVar;
        this.f15768j = strArr;
        if (str2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f15762c = z10;
        this.f15763d = j10;
        this.f15764e = j11;
        this.f15765g = (String) com.applovin.exoplayer2.l.a.b(str3);
        this.f15767i = dVar;
        this.f15769k = new HashMap<>();
        this.f15770l = new HashMap<>();
    }

    public static d a(String str) {
        return new d(null, f.a(str), com.anythink.expressad.exoplayer.b.f7291b, com.anythink.expressad.exoplayer.b.f7291b, null, null, "", null, null);
    }

    public long[] b() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i10 = 0;
        a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }

    public String[] c() {
        return this.f15768j;
    }

    public static d a(String str, long j10, long j11, g gVar, String[] strArr, String str2, String str3, d dVar) {
        return new d(str, null, j10, j11, gVar, strArr, str2, str3, dVar);
    }

    public boolean a(long j10) {
        long j11 = this.f15763d;
        return (j11 == com.anythink.expressad.exoplayer.b.f7291b && this.f15764e == com.anythink.expressad.exoplayer.b.f7291b) || (j11 <= j10 && this.f15764e == com.anythink.expressad.exoplayer.b.f7291b) || ((j11 == com.anythink.expressad.exoplayer.b.f7291b && j10 < this.f15764e) || (j11 <= j10 && j10 < this.f15764e));
    }

    public void a(d dVar) {
        if (this.f15771m == null) {
            this.f15771m = new ArrayList();
        }
        this.f15771m.add(dVar);
    }

    public d a(int i10) {
        List<d> list = this.f15771m;
        if (list != null) {
            return list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int a() {
        List<d> list = this.f15771m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    private void a(TreeSet<Long> treeSet, boolean z10) {
        boolean equals = com.anythink.core.common.g.c.W.equals(this.f15760a);
        boolean equals2 = "div".equals(this.f15760a);
        if (z10 || equals || (equals2 && this.f15766h != null)) {
            long j10 = this.f15763d;
            if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f15764e;
            if (j11 != com.anythink.expressad.exoplayer.b.f7291b) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f15771m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f15771m.size(); i10++) {
            this.f15771m.get(i10).a(treeSet, z10 || equals);
        }
    }

    public List<com.applovin.exoplayer2.i.a> a(long j10, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        ArrayList arrayList = new ArrayList();
        a(j10, this.f15765g, arrayList);
        TreeMap treeMap = new TreeMap();
        a(j10, false, this.f15765g, (Map<String, a.C0175a>) treeMap);
        a(j10, map, map2, this.f15765g, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                e eVar = (e) com.applovin.exoplayer2.l.a.b(map2.get(pair.first));
                arrayList2.add(new a.C0175a().a(decodeByteArray).a(eVar.f15773b).b(0).a(eVar.f15774c, 0).a(eVar.f15776e).b(eVar.f).c(eVar.f15777g).d(eVar.f15780j).e());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) com.applovin.exoplayer2.l.a.b(map2.get(entry.getKey()));
            a.C0175a c0175a = (a.C0175a) entry.getValue();
            a((SpannableStringBuilder) com.applovin.exoplayer2.l.a.b(c0175a.a()));
            c0175a.a(eVar2.f15774c, eVar2.f15775d);
            c0175a.a(eVar2.f15776e);
            c0175a.a(eVar2.f15773b);
            c0175a.b(eVar2.f);
            c0175a.b(eVar2.f15779i, eVar2.f15778h);
            c0175a.d(eVar2.f15780j);
            arrayList2.add(c0175a.e());
        }
        return arrayList2;
    }

    private void a(long j10, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f15765g)) {
            str = this.f15765g;
        }
        if (a(j10) && "div".equals(this.f15760a) && this.f15766h != null) {
            list.add(new Pair<>(str, this.f15766h));
            return;
        }
        for (int i10 = 0; i10 < a(); i10++) {
            a(i10).a(j10, str, list);
        }
    }

    private void a(long j10, boolean z10, String str, Map<String, a.C0175a> map) {
        this.f15769k.clear();
        this.f15770l.clear();
        if ("metadata".equals(this.f15760a)) {
            return;
        }
        if (!"".equals(this.f15765g)) {
            str = this.f15765g;
        }
        if (this.f15762c && z10) {
            a(str, map).append((CharSequence) com.applovin.exoplayer2.l.a.b(this.f15761b));
            return;
        }
        if ("br".equals(this.f15760a) && z10) {
            a(str, map).append('\n');
            return;
        }
        if (a(j10)) {
            for (Map.Entry<String, a.C0175a> entry : map.entrySet()) {
                this.f15769k.put(entry.getKey(), Integer.valueOf(((CharSequence) com.applovin.exoplayer2.l.a.b(entry.getValue().a())).length()));
            }
            boolean equals = com.anythink.core.common.g.c.W.equals(this.f15760a);
            for (int i10 = 0; i10 < a(); i10++) {
                a(i10).a(j10, z10 || equals, str, map);
            }
            if (equals) {
                f.a(a(str, map));
            }
            for (Map.Entry<String, a.C0175a> entry2 : map.entrySet()) {
                this.f15770l.put(entry2.getKey(), Integer.valueOf(((CharSequence) com.applovin.exoplayer2.l.a.b(entry2.getValue().a())).length()));
            }
        }
    }

    private static SpannableStringBuilder a(String str, Map<String, a.C0175a> map) {
        if (!map.containsKey(str)) {
            a.C0175a c0175a = new a.C0175a();
            c0175a.a(new SpannableStringBuilder());
            map.put(str, c0175a);
        }
        return (SpannableStringBuilder) com.applovin.exoplayer2.l.a.b(map.get(str).a());
    }

    private void a(long j10, Map<String, g> map, Map<String, e> map2, String str, Map<String, a.C0175a> map3) {
        int i10;
        if (a(j10)) {
            String str2 = "".equals(this.f15765g) ? str : this.f15765g;
            Iterator<Map.Entry<String, Integer>> it = this.f15770l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int intValue = this.f15769k.containsKey(key) ? this.f15769k.get(key).intValue() : 0;
                int intValue2 = next.getValue().intValue();
                if (intValue != intValue2) {
                    a(map, (a.C0175a) com.applovin.exoplayer2.l.a.b(map3.get(key)), intValue, intValue2, ((e) com.applovin.exoplayer2.l.a.b(map2.get(str2))).f15780j);
                }
            }
            while (i10 < a()) {
                a(i10).a(j10, map, map2, str2, map3);
                i10++;
            }
        }
    }

    private void a(Map<String, g> map, a.C0175a c0175a, int i10, int i11, int i12) {
        g a10 = f.a(this.f, this.f15768j, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c0175a.a();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            c0175a.a(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (a10 != null) {
            f.a(spannableStringBuilder2, i10, i11, a10, this.f15767i, map, i12);
            if (com.anythink.core.common.g.c.W.equals(this.f15760a)) {
                if (a10.i() != Float.MAX_VALUE) {
                    c0175a.d((a10.i() * (-90.0f)) / 100.0f);
                }
                if (a10.m() != null) {
                    c0175a.a(a10.m());
                }
                if (a10.n() != null) {
                    c0175a.b(a10.n());
                }
            }
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder) {
        for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
        }
        for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
            if (spannableStringBuilder.charAt(i10) == ' ') {
                int i11 = i10 + 1;
                int i12 = i11;
                while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                    i12++;
                }
                int i13 = i12 - i11;
                if (i13 > 0) {
                    spannableStringBuilder.delete(i10, i13 + i10);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
            if (spannableStringBuilder.charAt(i14) == '\n') {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
            if (spannableStringBuilder.charAt(i16) == ' ') {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i17) == '\n') {
                    spannableStringBuilder.delete(i16, i17);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }
}
