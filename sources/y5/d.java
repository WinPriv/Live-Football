package y5;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import r5.a;

/* compiled from: TtmlNode.java */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f36726a;

    /* renamed from: b, reason: collision with root package name */
    public final String f36727b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f36728c;

    /* renamed from: d, reason: collision with root package name */
    public final long f36729d;

    /* renamed from: e, reason: collision with root package name */
    public final long f36730e;
    public final f f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f36731g;

    /* renamed from: h, reason: collision with root package name */
    public final String f36732h;

    /* renamed from: i, reason: collision with root package name */
    public final String f36733i;

    /* renamed from: j, reason: collision with root package name */
    public final d f36734j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap<String, Integer> f36735k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap<String, Integer> f36736l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f36737m;

    public d(String str, String str2, long j10, long j11, f fVar, String[] strArr, String str3, String str4, d dVar) {
        boolean z10;
        this.f36726a = str;
        this.f36727b = str2;
        this.f36733i = str4;
        this.f = fVar;
        this.f36731g = strArr;
        if (str2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f36728c = z10;
        this.f36729d = j10;
        this.f36730e = j11;
        str3.getClass();
        this.f36732h = str3;
        this.f36734j = dVar;
        this.f36735k = new HashMap<>();
        this.f36736l = new HashMap<>();
    }

    public static d a(String str) {
        return new d(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), com.anythink.expressad.exoplayer.b.f7291b, com.anythink.expressad.exoplayer.b.f7291b, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            a.C0471a c0471a = new a.C0471a();
            c0471a.f34901a = new SpannableStringBuilder();
            treeMap.put(str, c0471a);
        }
        CharSequence charSequence = ((a.C0471a) treeMap.get(str)).f34901a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final d b(int i10) {
        ArrayList arrayList = this.f36737m;
        if (arrayList != null) {
            return (d) arrayList.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f36737m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet<Long> treeSet, boolean z10) {
        boolean z11;
        String str = this.f36726a;
        boolean equals = com.anythink.core.common.g.c.W.equals(str);
        boolean equals2 = "div".equals(str);
        if (z10 || equals || (equals2 && this.f36733i != null)) {
            long j10 = this.f36729d;
            if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f36730e;
            if (j11 != com.anythink.expressad.exoplayer.b.f7291b) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f36737m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f36737m.size(); i10++) {
            d dVar = (d) this.f36737m.get(i10);
            if (!z10 && !equals) {
                z11 = false;
            } else {
                z11 = true;
            }
            dVar.d(treeSet, z11);
        }
    }

    public final boolean f(long j10) {
        long j11 = this.f36729d;
        long j12 = this.f36730e;
        if ((j11 == com.anythink.expressad.exoplayer.b.f7291b && j12 == com.anythink.expressad.exoplayer.b.f7291b) || ((j11 <= j10 && j12 == com.anythink.expressad.exoplayer.b.f7291b) || ((j11 == com.anythink.expressad.exoplayer.b.f7291b && j10 < j12) || (j11 <= j10 && j10 < j12)))) {
            return true;
        }
        return false;
    }

    public final void g(long j10, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f36732h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j10) && "div".equals(this.f36726a) && (str2 = this.f36733i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i10 = 0; i10 < c(); i10++) {
            b(i10).g(j10, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0023 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(long r18, java.util.Map r20, java.util.Map r21, java.lang.String r22, java.util.TreeMap r23) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.d.h(long, java.util.Map, java.util.Map, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j10, boolean z10, String str, TreeMap treeMap) {
        String str2;
        boolean z11;
        HashMap<String, Integer> hashMap = this.f36735k;
        hashMap.clear();
        HashMap<String, Integer> hashMap2 = this.f36736l;
        hashMap2.clear();
        String str3 = this.f36726a;
        if ("metadata".equals(str3)) {
            return;
        }
        String str4 = this.f36732h;
        if ("".equals(str4)) {
            str2 = str;
        } else {
            str2 = str4;
        }
        if (this.f36728c && z10) {
            SpannableStringBuilder e10 = e(str2, treeMap);
            String str5 = this.f36727b;
            str5.getClass();
            e10.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str3) && z10) {
            e(str2, treeMap).append('\n');
            return;
        }
        if (f(j10)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((a.C0471a) entry.getValue()).f34901a;
                charSequence.getClass();
                hashMap.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean equals = com.anythink.core.common.g.c.W.equals(str3);
            for (int i10 = 0; i10 < c(); i10++) {
                d b10 = b(i10);
                if (!z10 && !equals) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                b10.i(j10, z11, str2, treeMap);
            }
            if (equals) {
                SpannableStringBuilder e11 = e(str2, treeMap);
                int length = e11.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (e11.charAt(length) == ' ');
                if (length >= 0 && e11.charAt(length) != '\n') {
                    e11.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((a.C0471a) entry2.getValue()).f34901a;
                charSequence2.getClass();
                hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
