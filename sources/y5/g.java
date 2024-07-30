package y5;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import d6.g0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import r5.a;

/* compiled from: TtmlSubtitle.java */
/* loaded from: classes2.dex */
public final class g implements r5.g {

    /* renamed from: s, reason: collision with root package name */
    public final d f36764s;

    /* renamed from: t, reason: collision with root package name */
    public final long[] f36765t;

    /* renamed from: u, reason: collision with root package name */
    public final Map<String, f> f36766u;

    /* renamed from: v, reason: collision with root package name */
    public final Map<String, e> f36767v;

    /* renamed from: w, reason: collision with root package name */
    public final Map<String, String> f36768w;

    public g(d dVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f36764s = dVar;
        this.f36767v = hashMap2;
        this.f36768w = hashMap3;
        this.f36766u = Collections.unmodifiableMap(hashMap);
        TreeSet<Long> treeSet = new TreeSet<>();
        int i10 = 0;
        dVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        this.f36765t = jArr;
    }

    @Override // r5.g
    public final int a(long j10) {
        long[] jArr = this.f36765t;
        int b10 = g0.b(jArr, j10, false);
        if (b10 >= jArr.length) {
            return -1;
        }
        return b10;
    }

    @Override // r5.g
    public final long b(int i10) {
        return this.f36765t[i10];
    }

    @Override // r5.g
    public final List<r5.a> c(long j10) {
        Map<String, f> map = this.f36766u;
        Map<String, e> map2 = this.f36767v;
        d dVar = this.f36764s;
        dVar.getClass();
        ArrayList arrayList = new ArrayList();
        dVar.g(j10, dVar.f36732h, arrayList);
        TreeMap treeMap = new TreeMap();
        dVar.i(j10, false, dVar.f36732h, treeMap);
        dVar.h(j10, map, map2, dVar.f36732h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = this.f36768w.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                e eVar = map2.get(pair.first);
                eVar.getClass();
                a.C0471a c0471a = new a.C0471a();
                c0471a.f34902b = decodeByteArray;
                c0471a.f34907h = eVar.f36739b;
                c0471a.f34908i = 0;
                c0471a.f34905e = eVar.f36740c;
                c0471a.f = 0;
                c0471a.f34906g = eVar.f36742e;
                c0471a.f34911l = eVar.f;
                c0471a.f34912m = eVar.f36743g;
                c0471a.f34914p = eVar.f36746j;
                arrayList2.add(c0471a.a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = map2.get(entry.getKey());
            eVar2.getClass();
            a.C0471a c0471a2 = (a.C0471a) entry.getValue();
            CharSequence charSequence = c0471a2.f34901a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), (CharSequence) "");
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
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            c0471a2.f34905e = eVar2.f36740c;
            c0471a2.f = eVar2.f36741d;
            c0471a2.f34906g = eVar2.f36742e;
            c0471a2.f34907h = eVar2.f36739b;
            c0471a2.f34911l = eVar2.f;
            c0471a2.f34910k = eVar2.f36745i;
            c0471a2.f34909j = eVar2.f36744h;
            c0471a2.f34914p = eVar2.f36746j;
            arrayList2.add(c0471a2.a());
        }
        return arrayList2;
    }

    @Override // r5.g
    public final int d() {
        return this.f36765t.length;
    }
}
