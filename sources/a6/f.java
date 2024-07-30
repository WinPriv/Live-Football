package a6;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.anythink.expressad.exoplayer.k.p;
import d6.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: WebvttCueParser.java */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f323a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f324b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Map<String, Integer> f325c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map<String, Integer> f326d;

    /* compiled from: WebvttCueParser.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final com.applovin.exoplayer2.g.f.e f327c = new com.applovin.exoplayer2.g.f.e(3);

        /* renamed from: a, reason: collision with root package name */
        public final b f328a;

        /* renamed from: b, reason: collision with root package name */
        public final int f329b;

        public a(b bVar, int i10) {
            this.f328a = bVar;
            this.f329b = i10;
        }
    }

    /* compiled from: WebvttCueParser.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f330a;

        /* renamed from: b, reason: collision with root package name */
        public final int f331b;

        /* renamed from: c, reason: collision with root package name */
        public final String f332c;

        /* renamed from: d, reason: collision with root package name */
        public final Set<String> f333d;

        public b(String str, int i10, String str2, Set<String> set) {
            this.f331b = i10;
            this.f330a = str;
            this.f332c = str2;
            this.f333d = set;
        }
    }

    /* compiled from: WebvttCueParser.java */
    /* loaded from: classes2.dex */
    public static final class c implements Comparable<c> {

        /* renamed from: s, reason: collision with root package name */
        public final int f334s;

        /* renamed from: t, reason: collision with root package name */
        public final a6.d f335t;

        public c(int i10, a6.d dVar) {
            this.f334s = i10;
            this.f335t = dVar;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            return Integer.compare(this.f334s, cVar.f334s);
        }
    }

    /* compiled from: WebvttCueParser.java */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f338c;

        /* renamed from: a, reason: collision with root package name */
        public long f336a = 0;

        /* renamed from: b, reason: collision with root package name */
        public long f337b = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f339d = 2;

        /* renamed from: e, reason: collision with root package name */
        public float f340e = -3.4028235E38f;
        public int f = 1;

        /* renamed from: g, reason: collision with root package name */
        public int f341g = 0;

        /* renamed from: h, reason: collision with root package name */
        public float f342h = -3.4028235E38f;

        /* renamed from: i, reason: collision with root package name */
        public int f343i = Integer.MIN_VALUE;

        /* renamed from: j, reason: collision with root package name */
        public float f344j = 1.0f;

        /* renamed from: k, reason: collision with root package name */
        public int f345k = Integer.MIN_VALUE;

        /* JADX WARN: Code restructure failed: missing block: B:52:0x0070, code lost:
        
            if (r7 == 0) goto L43;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0070  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final r5.a.C0471a a() {
            /*
                Method dump skipped, instructions count: 177
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: a6.f.d.a():r5.a$a");
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(p.f9095b, p.f9095b, p.f9095b)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, p.f9095b, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, p.f9095b, p.f9095b)));
        hashMap.put("red", Integer.valueOf(Color.rgb(p.f9095b, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(p.f9095b, p.f9095b, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(p.f9095b, 0, p.f9095b)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, p.f9095b)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f325c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(p.f9095b, p.f9095b, p.f9095b)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, p.f9095b, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, p.f9095b, p.f9095b)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(p.f9095b, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(p.f9095b, p.f9095b, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(p.f9095b, 0, p.f9095b)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, p.f9095b)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f326d = Collections.unmodifiableMap(hashMap2);
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, b bVar, String str, List list, List list2) {
        char c10;
        char c11;
        char c12;
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14 = bVar.f331b;
        int length = spannableStringBuilder.length();
        String str2 = bVar.f330a;
        str2.getClass();
        int hashCode = str2.hashCode();
        int i15 = -1;
        if (hashCode != 0) {
            if (hashCode != 105) {
                if (hashCode != 3314158) {
                    if (hashCode != 3511770) {
                        if (hashCode != 98) {
                            if (hashCode != 99) {
                                if (hashCode != 117) {
                                    if (hashCode == 118 && str2.equals("v")) {
                                        c10 = 5;
                                    }
                                    c10 = 65535;
                                } else {
                                    if (str2.equals("u")) {
                                        c10 = 4;
                                    }
                                    c10 = 65535;
                                }
                            } else {
                                if (str2.equals("c")) {
                                    c10 = 2;
                                }
                                c10 = 65535;
                            }
                        } else {
                            if (str2.equals("b")) {
                                c10 = 1;
                            }
                            c10 = 65535;
                        }
                    } else {
                        if (str2.equals("ruby")) {
                            c10 = 7;
                        }
                        c10 = 65535;
                    }
                } else {
                    if (str2.equals("lang")) {
                        c10 = 6;
                    }
                    c10 = 65535;
                }
            } else {
                if (str2.equals(com.anythink.basead.d.i.f3957a)) {
                    c10 = 3;
                }
                c10 = 65535;
            }
        } else {
            if (str2.equals("")) {
                c10 = 0;
            }
            c10 = 65535;
        }
        switch (c10) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i14, length, 33);
                break;
            case 2:
                for (String str3 : bVar.f333d) {
                    Map<String, Integer> map = f325c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str3).intValue()), i14, length, 33);
                    } else {
                        Map<String, Integer> map2 = f326d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str3).intValue()), i14, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i14, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i14, length, 33);
                break;
            case 7:
                int c13 = c(list2, str, bVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, a.f327c);
                int i16 = bVar.f331b;
                int i17 = 0;
                int i18 = 0;
                while (i17 < arrayList.size()) {
                    if ("rt".equals(((a) arrayList.get(i17)).f328a.f330a)) {
                        a aVar = (a) arrayList.get(i17);
                        int c14 = c(list2, str, aVar.f328a);
                        if (c14 == i15) {
                            if (c13 != i15) {
                                c14 = c13;
                            } else {
                                c14 = 1;
                            }
                        }
                        int i19 = aVar.f328a.f331b - i18;
                        int i20 = aVar.f329b - i18;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i19, i20);
                        spannableStringBuilder.delete(i19, i20);
                        spannableStringBuilder.setSpan(new v5.c(subSequence.toString(), c14), i16, i19, 33);
                        i18 = subSequence.length() + i18;
                        i16 = i19;
                    }
                    i17++;
                    i15 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList b10 = b(list2, str, bVar);
        for (int i21 = 0; i21 < b10.size(); i21++) {
            a6.d dVar = ((c) b10.get(i21)).f335t;
            if (dVar != null) {
                int i22 = dVar.f315l;
                if (i22 == -1 && dVar.f316m == -1) {
                    i10 = -1;
                } else {
                    if (i22 == 1) {
                        c11 = 1;
                    } else {
                        c11 = 0;
                    }
                    if (dVar.f316m == 1) {
                        c12 = 2;
                    } else {
                        c12 = 0;
                    }
                    i10 = c12 | c11;
                }
                if (i10 != -1) {
                    int i23 = dVar.f315l;
                    if (i23 == -1 && dVar.f316m == -1) {
                        i13 = -1;
                    } else {
                        if (i23 == 1) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        if (dVar.f316m == 1) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        i13 = i11 | i12;
                    }
                    a0.a.g0(spannableStringBuilder, new StyleSpan(i13), i14, length);
                }
                if (dVar.f313j == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    spannableStringBuilder.setSpan(new StrikethroughSpan(), i14, length, 33);
                }
                if (dVar.f314k == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i14, length, 33);
                }
                if (dVar.f310g) {
                    if (dVar.f310g) {
                        a0.a.g0(spannableStringBuilder, new ForegroundColorSpan(dVar.f), i14, length);
                    } else {
                        throw new IllegalStateException("Font color not defined");
                    }
                }
                if (dVar.f312i) {
                    if (dVar.f312i) {
                        a0.a.g0(spannableStringBuilder, new BackgroundColorSpan(dVar.f311h), i14, length);
                    } else {
                        throw new IllegalStateException("Background color not defined.");
                    }
                }
                if (dVar.f309e != null) {
                    a0.a.g0(spannableStringBuilder, new TypefaceSpan(dVar.f309e), i14, length);
                }
                int i24 = dVar.f317n;
                if (i24 != 1) {
                    if (i24 != 2) {
                        if (i24 == 3) {
                            a0.a.g0(spannableStringBuilder, new RelativeSizeSpan(dVar.o / 100.0f), i14, length);
                        }
                    } else {
                        a0.a.g0(spannableStringBuilder, new RelativeSizeSpan(dVar.o), i14, length);
                    }
                } else {
                    a0.a.g0(spannableStringBuilder, new AbsoluteSizeSpan((int) dVar.o, true), i14, length);
                }
                if (dVar.f319q) {
                    spannableStringBuilder.setSpan(new v5.a(), i14, length, 33);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, b bVar) {
        int i10;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            a6.d dVar = (a6.d) list.get(i11);
            String str2 = bVar.f330a;
            if (dVar.f305a.isEmpty() && dVar.f306b.isEmpty() && dVar.f307c.isEmpty() && dVar.f308d.isEmpty()) {
                i10 = TextUtils.isEmpty(str2);
            } else {
                int a10 = a6.d.a(a6.d.a(a6.d.a(0, 1073741824, dVar.f305a, str), 2, dVar.f306b, str2), 4, dVar.f308d, bVar.f332c);
                if (a10 != -1) {
                    if (bVar.f333d.containsAll(dVar.f307c)) {
                        i10 = a10 + (dVar.f307c.size() * 4);
                    }
                }
                i10 = 0;
            }
            if (i10 > 0) {
                arrayList.add(new c(i10, dVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List<a6.d> list, String str, b bVar) {
        ArrayList b10 = b(list, str, bVar);
        for (int i10 = 0; i10 < b10.size(); i10++) {
            int i11 = ((c) b10.get(i10)).f335t.f318p;
            if (i11 != -1) {
                return i11;
            }
        }
        return -1;
    }

    public static e d(String str, Matcher matcher, w wVar, ArrayList arrayList) {
        d dVar = new d();
        try {
            String group = matcher.group(1);
            group.getClass();
            dVar.f336a = h.c(group);
            String group2 = matcher.group(2);
            group2.getClass();
            dVar.f337b = h.c(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, dVar);
            StringBuilder sb2 = new StringBuilder();
            String e10 = wVar.e();
            while (!TextUtils.isEmpty(e10)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(e10.trim());
                e10 = wVar.e();
            }
            dVar.f338c = f(str, sb2.toString(), arrayList);
            return new e(dVar.a().a(), dVar.f336a, dVar.f337b);
        } catch (NumberFormatException unused) {
            d6.p.f("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0099, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c6, code lost:
    
        if (r7.equals("start") == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0084, code lost:
    
        switch(r15) {
            case 0: goto L45;
            case 1: goto L45;
            case 2: goto L44;
            case 3: goto L43;
            case 4: goto L42;
            case 5: goto L41;
            default: goto L40;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0087, code lost:
    
        d6.p.f("WebvttCueParser", "Invalid alignment value: ".concat(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0091, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x009a, code lost:
    
        r19.f339d = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0093, code lost:
    
        r3 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0095, code lost:
    
        r3 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0097, code lost:
    
        r3 = 3;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x00f9. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.lang.String r18, a6.f.d r19) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.f.e(java.lang.String, a6.f$d):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01f3, code lost:
    
        switch(r13) {
            case 0: goto L140;
            case 1: goto L139;
            case 2: goto L138;
            case 3: goto L137;
            default: goto L136;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01f6, code lost:
    
        d6.p.f("WebvttCueParser", "ignoring unsupported entity: '&" + r7 + ";'");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x021e, code lost:
    
        if (r9 != r12) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0220, code lost:
    
        r3.append((java.lang.CharSequence) " ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0223, code lost:
    
        r7 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x020f, code lost:
    
        r3.append(' ');
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0213, code lost:
    
        r3.append('&');
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0217, code lost:
    
        r3.append('<');
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x021b, code lost:
    
        r3.append('>');
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannedString f(java.lang.String r16, java.lang.String r17, java.util.List<a6.d> r18) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.f.f(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static void g(String str, d dVar) {
        int indexOf = str.indexOf(44);
        char c10 = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.getClass();
            int i10 = 2;
            switch (substring.hashCode()) {
                case -1364013995:
                    if (substring.equals("center")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals("end")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                    i10 = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i10 = 0;
                    break;
                default:
                    d6.p.f("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i10 = Integer.MIN_VALUE;
                    break;
            }
            dVar.f341g = i10;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            dVar.f340e = h.b(str);
            dVar.f = 0;
        } else {
            dVar.f340e = Integer.parseInt(str);
            dVar.f = 1;
        }
    }
}
