package com.applovin.exoplayer2.ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import com.applovin.exoplayer2.common.a.u;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.ui.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f16786a = Pattern.compile("(&#13;)?&#10;");

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f16787a;

        /* renamed from: b, reason: collision with root package name */
        public final Map<String, String> f16788b;

        private a(String str, Map<String, String> map) {
            this.f16787a = str;
            this.f16788b = map;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: e, reason: collision with root package name */
        private static final Comparator<b> f16789e = new Comparator() { // from class: com.applovin.exoplayer2.ui.n
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int b10;
                b10 = h.b.b((h.b) obj, (h.b) obj2);
                return b10;
            }
        };
        private static final Comparator<b> f = new Comparator() { // from class: com.applovin.exoplayer2.ui.o
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int a10;
                a10 = h.b.a((h.b) obj, (h.b) obj2);
                return a10;
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final int f16790a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16791b;

        /* renamed from: c, reason: collision with root package name */
        public final String f16792c;

        /* renamed from: d, reason: collision with root package name */
        public final String f16793d;

        private b(int i10, int i11, String str, String str2) {
            this.f16790a = i10;
            this.f16791b = i11;
            this.f16792c = str;
            this.f16793d = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(b bVar, b bVar2) {
            int compare = Integer.compare(bVar2.f16790a, bVar.f16790a);
            if (compare != 0) {
                return compare;
            }
            int compareTo = bVar2.f16792c.compareTo(bVar.f16792c);
            return compareTo != 0 ? compareTo : bVar2.f16793d.compareTo(bVar.f16793d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int b(b bVar, b bVar2) {
            int compare = Integer.compare(bVar2.f16791b, bVar.f16791b);
            if (compare != 0) {
                return compare;
            }
            int compareTo = bVar.f16792c.compareTo(bVar2.f16792c);
            return compareTo != 0 ? compareTo : bVar.f16793d.compareTo(bVar2.f16793d);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final List<b> f16794a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final List<b> f16795b = new ArrayList();
    }

    private static String a(int i10) {
        return i10 != 2 ? "over right" : "under left";
    }

    public static a a(CharSequence charSequence, float f) {
        if (charSequence == null) {
            return new a("", u.a());
        }
        if (!(charSequence instanceof Spanned)) {
            return new a(a(charSequence), u.a());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            hashMap.put(e.a(a3.l.i("bg_", intValue)), ai.a("background-color:%s;", e.a(intValue)));
        }
        SparseArray<c> a10 = a(spanned, f);
        StringBuilder sb2 = new StringBuilder(spanned.length());
        int i11 = 0;
        while (i10 < a10.size()) {
            int keyAt = a10.keyAt(i10);
            sb2.append(a(spanned.subSequence(i11, keyAt)));
            c cVar = a10.get(keyAt);
            Collections.sort(cVar.f16795b, b.f);
            Iterator it2 = cVar.f16795b.iterator();
            while (it2.hasNext()) {
                sb2.append(((b) it2.next()).f16793d);
            }
            Collections.sort(cVar.f16794a, b.f16789e);
            Iterator it3 = cVar.f16794a.iterator();
            while (it3.hasNext()) {
                sb2.append(((b) it3.next()).f16792c);
            }
            i10++;
            i11 = keyAt;
        }
        sb2.append(a(spanned.subSequence(i11, spanned.length())));
        return new a(sb2.toString(), hashMap);
    }

    private static SparseArray<c> a(Spanned spanned, float f) {
        SparseArray<c> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String a10 = a(obj, f);
            String a11 = a(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (a10 != null) {
                com.applovin.exoplayer2.l.a.b(a11);
                b bVar = new b(spanStart, spanEnd, a10, a11);
                a(sparseArray, spanStart).f16794a.add(bVar);
                a(sparseArray, spanEnd).f16795b.add(bVar);
            }
        }
        return sparseArray;
    }

    private static String a(Object obj, float f) {
        float size;
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return ai.a("<span style='color:%s;'>", e.a(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return ai.a("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof com.applovin.exoplayer2.i.d.a) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            if (absoluteSizeSpan.getDip()) {
                size = absoluteSizeSpan.getSize();
            } else {
                size = absoluteSizeSpan.getSize() / f;
            }
            return ai.a("<span style='font-size:%.2fpx;'>", Float.valueOf(size));
        }
        if (obj instanceof RelativeSizeSpan) {
            return ai.a("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return ai.a("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (obj instanceof com.applovin.exoplayer2.i.d.c) {
            int i10 = ((com.applovin.exoplayer2.i.d.c) obj).f15694b;
            if (i10 == -1) {
                return "<ruby style='ruby-position:unset;'>";
            }
            if (i10 == 1) {
                return "<ruby style='ruby-position:over;'>";
            }
            if (i10 != 2) {
                return null;
            }
            return "<ruby style='ruby-position:under;'>";
        }
        if (obj instanceof UnderlineSpan) {
            return "<u>";
        }
        if (!(obj instanceof com.applovin.exoplayer2.i.d.e)) {
            return null;
        }
        com.applovin.exoplayer2.i.d.e eVar = (com.applovin.exoplayer2.i.d.e) obj;
        return ai.a("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", a(eVar.f15695a, eVar.f15696b), a(eVar.f15697c));
    }

    private static String a(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof com.applovin.exoplayer2.i.d.a) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof com.applovin.exoplayer2.i.d.e)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (obj instanceof com.applovin.exoplayer2.i.d.c) {
                return a3.l.p(new StringBuilder("<rt>"), a((CharSequence) ((com.applovin.exoplayer2.i.d.c) obj).f15693a), "</rt></ruby>");
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    private static String a(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        if (i11 == 1) {
            sb2.append("filled ");
        } else if (i11 == 2) {
            sb2.append("open ");
        }
        if (i10 == 0) {
            sb2.append("none");
        } else if (i10 == 1) {
            sb2.append("circle");
        } else if (i10 == 2) {
            sb2.append("dot");
        } else if (i10 != 3) {
            sb2.append("unset");
        } else {
            sb2.append("sesame");
        }
        return sb2.toString();
    }

    private static c a(SparseArray<c> sparseArray, int i10) {
        c cVar = sparseArray.get(i10);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        sparseArray.put(i10, cVar2);
        return cVar2;
    }

    private static String a(CharSequence charSequence) {
        return f16786a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
