package com.applovin.exoplayer2.i.i;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.exoplayer.k.p;
import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.i.i.f;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import com.huawei.hms.ads.gl;
import com.huawei.openalliance.ad.constant.w;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f15836a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f15837b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, Integer> f15838c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, Integer> f15839d;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final Comparator<a> f15840a = new Comparator() { // from class: com.applovin.exoplayer2.i.i.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int a10;
                a10 = f.a.a((f.a) obj, (f.a) obj2);
                return a10;
            }
        };

        /* renamed from: b, reason: collision with root package name */
        private final b f15841b;

        /* renamed from: c, reason: collision with root package name */
        private final int f15842c;

        private a(b bVar, int i10) {
            this.f15841b = bVar;
            this.f15842c = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(a aVar, a aVar2) {
            return Integer.compare(aVar.f15841b.f15844b, aVar2.f15841b.f15844b);
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements Comparable<c> {

        /* renamed from: a, reason: collision with root package name */
        public final int f15847a;

        /* renamed from: b, reason: collision with root package name */
        public final com.applovin.exoplayer2.i.i.d f15848b;

        public c(int i10, com.applovin.exoplayer2.i.i.d dVar) {
            this.f15847a = i10;
            this.f15848b = dVar;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return Integer.compare(this.f15847a, cVar.f15847a);
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f15851c;

        /* renamed from: a, reason: collision with root package name */
        public long f15849a = 0;

        /* renamed from: b, reason: collision with root package name */
        public long f15850b = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f15852d = 2;

        /* renamed from: e, reason: collision with root package name */
        public float f15853e = -3.4028235E38f;
        public int f = 1;

        /* renamed from: g, reason: collision with root package name */
        public int f15854g = 0;

        /* renamed from: h, reason: collision with root package name */
        public float f15855h = -3.4028235E38f;

        /* renamed from: i, reason: collision with root package name */
        public int f15856i = Integer.MIN_VALUE;

        /* renamed from: j, reason: collision with root package name */
        public float f15857j = 1.0f;

        /* renamed from: k, reason: collision with root package name */
        public int f15858k = Integer.MIN_VALUE;

        private static float a(float f, int i10) {
            if (f == -3.4028235E38f || i10 != 0 || (f >= gl.Code && f <= 1.0f)) {
                return f != -3.4028235E38f ? f : i10 == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        private static int b(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 3) {
                return 2;
            }
            if (i10 != 4) {
                return i10 != 5 ? 1 : 2;
            }
            return 0;
        }

        private static Layout.Alignment c(int i10) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                a3.k.y("Unknown textAlignment: ", i10, "WebvttCueParser");
                                return null;
                            }
                        }
                    }
                    return Layout.Alignment.ALIGN_OPPOSITE;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float a(int i10) {
            return i10 != 4 ? i10 != 5 ? 0.5f : 1.0f : gl.Code;
        }

        public a.C0175a b() {
            float f = this.f15855h;
            if (f == -3.4028235E38f) {
                f = a(this.f15852d);
            }
            int i10 = this.f15856i;
            if (i10 == Integer.MIN_VALUE) {
                i10 = b(this.f15852d);
            }
            a.C0175a d10 = new a.C0175a().a(c(this.f15852d)).a(a(this.f15853e, this.f), this.f).a(this.f15854g).a(f).b(i10).b(Math.min(this.f15857j, a(i10, f))).d(this.f15858k);
            CharSequence charSequence = this.f15851c;
            if (charSequence != null) {
                d10.a(charSequence);
            }
            return d10;
        }

        public e a() {
            return new e(b().e(), this.f15849a, this.f15850b);
        }

        private static float a(int i10, float f) {
            if (i10 == 0) {
                return 1.0f - f;
            }
            if (i10 == 1) {
                return f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
            }
            if (i10 == 2) {
                return f;
            }
            throw new IllegalStateException(String.valueOf(i10));
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
        f15838c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(p.f9095b, p.f9095b, p.f9095b)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, p.f9095b, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, p.f9095b, p.f9095b)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(p.f9095b, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(p.f9095b, p.f9095b, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(p.f9095b, 0, p.f9095b)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, p.f9095b)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f15839d = Collections.unmodifiableMap(hashMap2);
    }

    public static e a(y yVar, List<com.applovin.exoplayer2.i.i.d> list) {
        String C = yVar.C();
        if (C == null) {
            return null;
        }
        Pattern pattern = f15836a;
        Matcher matcher = pattern.matcher(C);
        if (matcher.matches()) {
            return a((String) null, matcher, yVar, list);
        }
        String C2 = yVar.C();
        if (C2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(C2);
        if (matcher2.matches()) {
            return a(C.trim(), matcher2, yVar, list);
        }
        return null;
    }

    private static void b(String str, d dVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            dVar.f15854g = b(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            dVar.f15853e = h.b(str);
            dVar.f = 0;
        } else {
            dVar.f15853e = Integer.parseInt(str);
            dVar.f = 1;
        }
    }

    private static void c(String str, d dVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            dVar.f15856i = c(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        dVar.f15855h = h.b(str);
    }

    private static int d(String str) {
        str.getClass();
        if (!str.equals("lr")) {
            if (!str.equals("rl")) {
                q.c("WebvttCueParser", "Invalid 'vertical' value: ".concat(str));
                return Integer.MIN_VALUE;
            }
            return 1;
        }
        return 2;
    }

    private static int e(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c10 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c10 = 3;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c10 = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 1;
            default:
                q.c("WebvttCueParser", "Invalid alignment value: ".concat(str));
                return 2;
        }
    }

    private static boolean f(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 98:
                if (str.equals("b")) {
                    c10 = 0;
                    break;
                }
                break;
            case 99:
                if (str.equals("c")) {
                    c10 = 1;
                    break;
                }
                break;
            case 105:
                if (str.equals(com.anythink.basead.d.i.f3957a)) {
                    c10 = 2;
                    break;
                }
                break;
            case 117:
                if (str.equals("u")) {
                    c10 = 3;
                    break;
                }
                break;
            case 118:
                if (str.equals("v")) {
                    c10 = 4;
                    break;
                }
                break;
            case 3650:
                if (str.equals("rt")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3314158:
                if (str.equals("lang")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3511770:
                if (str.equals("ruby")) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    private static String g(String str) {
        String trim = str.trim();
        com.applovin.exoplayer2.l.a.a(!trim.isEmpty());
        return ai.b(trim, "[ \\.]")[0];
    }

    private static int c(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1842484672:
                if (str.equals("line-left")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1276788989:
                if (str.equals("line-right")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c10 = 3;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c10 = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 5:
                return 0;
            case 1:
            case 3:
                return 1;
            case 2:
            case 4:
                return 2;
            default:
                q.c("WebvttCueParser", "Invalid anchor value: ".concat(str));
                return Integer.MIN_VALUE;
        }
    }

    public static a.C0175a a(String str) {
        d dVar = new d();
        a(str, dVar);
        return dVar.b();
    }

    private static int b(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c10 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c10 = 2;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 0;
            default:
                q.c("WebvttCueParser", "Invalid anchor value: ".concat(str));
                return Integer.MIN_VALUE;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f15843a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15844b;

        /* renamed from: c, reason: collision with root package name */
        public final String f15845c;

        /* renamed from: d, reason: collision with root package name */
        public final Set<String> f15846d;

        private b(String str, int i10, String str2, Set<String> set) {
            this.f15844b = i10;
            this.f15843a = str;
            this.f15845c = str2;
            this.f15846d = set;
        }

        public static b a(String str, int i10) {
            String str2;
            String trim = str.trim();
            com.applovin.exoplayer2.l.a.a(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] a10 = ai.a(trim, "\\.");
            String str3 = a10[0];
            HashSet hashSet = new HashSet();
            for (int i11 = 1; i11 < a10.length; i11++) {
                hashSet.add(a10[i11]);
            }
            return new b(str3, i10, str2, hashSet);
        }

        public static b a() {
            return new b("", 0, "", Collections.emptySet());
        }
    }

    private static List<c> b(List<com.applovin.exoplayer2.i.i.d> list, String str, b bVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.applovin.exoplayer2.i.i.d dVar = list.get(i10);
            int a10 = dVar.a(str, bVar.f15843a, bVar.f15846d, bVar.f15845c);
            if (a10 > 0) {
                arrayList.add(new c(a10, dVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static com.applovin.exoplayer2.i.a a(CharSequence charSequence) {
        d dVar = new d();
        dVar.f15851c = charSequence;
        return dVar.b().e();
    }

    public static SpannedString a(String str, String str2, List<com.applovin.exoplayer2.i.i.d> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < str2.length()) {
            char charAt = str2.charAt(i10);
            if (charAt == '&') {
                i10++;
                int indexOf = str2.indexOf(59, i10);
                int indexOf2 = str2.indexOf(32, i10);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    a(str2.substring(i10, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i10 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i10++;
            } else {
                int i11 = i10 + 1;
                if (i11 < str2.length()) {
                    boolean z10 = str2.charAt(i11) == '/';
                    i11 = a(str2, i11);
                    int i12 = i11 - 2;
                    boolean z11 = str2.charAt(i12) == '/';
                    int i13 = i10 + (z10 ? 2 : 1);
                    if (!z11) {
                        i12 = i11 - 1;
                    }
                    String substring = str2.substring(i13, i12);
                    if (!substring.trim().isEmpty()) {
                        String g6 = g(substring);
                        if (f(g6)) {
                            if (!z10) {
                                if (!z11) {
                                    arrayDeque.push(b.a(substring, spannableStringBuilder.length()));
                                }
                            }
                            while (!arrayDeque.isEmpty()) {
                                b bVar = (b) arrayDeque.pop();
                                a(str, bVar, arrayList, spannableStringBuilder, list);
                                if (!arrayDeque.isEmpty()) {
                                    arrayList.add(new a(bVar, spannableStringBuilder.length()));
                                } else {
                                    arrayList.clear();
                                }
                                if (bVar.f15843a.equals(g6)) {
                                    break;
                                }
                            }
                        }
                    }
                }
                i10 = i11;
            }
        }
        while (!arrayDeque.isEmpty()) {
            a(str, (b) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        a(str, b.a(), (List<a>) Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static e a(String str, Matcher matcher, y yVar, List<com.applovin.exoplayer2.i.i.d> list) {
        d dVar = new d();
        try {
            dVar.f15849a = h.a((String) com.applovin.exoplayer2.l.a.b(matcher.group(1)));
            dVar.f15850b = h.a((String) com.applovin.exoplayer2.l.a.b(matcher.group(2)));
            a((String) com.applovin.exoplayer2.l.a.b(matcher.group(3)), dVar);
            StringBuilder sb2 = new StringBuilder();
            String C = yVar.C();
            while (!TextUtils.isEmpty(C)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(C.trim());
                C = yVar.C();
            }
            dVar.f15851c = a(str, sb2.toString(), list);
            return dVar.a();
        } catch (NumberFormatException unused) {
            q.c("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    private static void a(String str, d dVar) {
        Matcher matcher = f15837b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) com.applovin.exoplayer2.l.a.b(matcher.group(1));
            String str3 = (String) com.applovin.exoplayer2.l.a.b(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    b(str3, dVar);
                } else if ("align".equals(str2)) {
                    dVar.f15852d = e(str3);
                } else if ("position".equals(str2)) {
                    c(str3, dVar);
                } else if (ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE.equals(str2)) {
                    dVar.f15857j = h.b(str3);
                } else if ("vertical".equals(str2)) {
                    dVar.f15858k = d(str3);
                } else {
                    q.c("WebvttCueParser", "Unknown cue setting " + str2 + w.bE + str3);
                }
            } catch (NumberFormatException unused) {
                q.c("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    private static int a(String str, int i10) {
        int indexOf = str.indexOf(62, i10);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    private static void a(String str, SpannableStringBuilder spannableStringBuilder) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3309:
                if (str.equals("gt")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3464:
                if (str.equals("lt")) {
                    c10 = 1;
                    break;
                }
                break;
            case 96708:
                if (str.equals("amp")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3374865:
                if (str.equals("nbsp")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                spannableStringBuilder.append('>');
                return;
            case 1:
                spannableStringBuilder.append('<');
                return;
            case 2:
                spannableStringBuilder.append('&');
                return;
            case 3:
                spannableStringBuilder.append(' ');
                return;
            default:
                q.c("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                return;
        }
    }

    private static void a(String str, b bVar, List<a> list, SpannableStringBuilder spannableStringBuilder, List<com.applovin.exoplayer2.i.i.d> list2) {
        int i10 = bVar.f15844b;
        int length = spannableStringBuilder.length();
        String str2 = bVar.f15843a;
        str2.getClass();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c10 = 0;
                    break;
                }
                break;
            case 98:
                if (str2.equals("b")) {
                    c10 = 1;
                    break;
                }
                break;
            case 99:
                if (str2.equals("c")) {
                    c10 = 2;
                    break;
                }
                break;
            case 105:
                if (str2.equals(com.anythink.basead.d.i.f3957a)) {
                    c10 = 3;
                    break;
                }
                break;
            case 117:
                if (str2.equals("u")) {
                    c10 = 4;
                    break;
                }
                break;
            case 118:
                if (str2.equals("v")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i10, length, 33);
                break;
            case 2:
                a(spannableStringBuilder, bVar.f15846d, i10, length);
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                break;
            case 7:
                a(spannableStringBuilder, str, bVar, list, list2);
                break;
            default:
                return;
        }
        List<c> b10 = b(list2, str, bVar);
        for (int i11 = 0; i11 < b10.size(); i11++) {
            a(spannableStringBuilder, b10.get(i11).f15848b, i10, length);
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, String str, b bVar, List<a> list, List<com.applovin.exoplayer2.i.i.d> list2) {
        int a10 = a(list2, str, bVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, a.f15840a);
        int i10 = bVar.f15844b;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if ("rt".equals(((a) arrayList.get(i12)).f15841b.f15843a)) {
                a aVar = (a) arrayList.get(i12);
                int a11 = a(a(list2, str, aVar.f15841b), a10, 1);
                int i13 = aVar.f15841b.f15844b - i11;
                int i14 = aVar.f15842c - i11;
                CharSequence subSequence = spannableStringBuilder.subSequence(i13, i14);
                spannableStringBuilder.delete(i13, i14);
                spannableStringBuilder.setSpan(new com.applovin.exoplayer2.i.d.c(subSequence.toString(), a11), i10, i13, 33);
                i11 = subSequence.length() + i11;
                i10 = i13;
            }
        }
    }

    private static int a(List<com.applovin.exoplayer2.i.i.d> list, String str, b bVar) {
        List<c> b10 = b(list, str, bVar);
        for (int i10 = 0; i10 < b10.size(); i10++) {
            com.applovin.exoplayer2.i.i.d dVar = b10.get(i10).f15848b;
            if (dVar.k() != -1) {
                return dVar.k();
            }
        }
        return -1;
    }

    private static int a(int i10, int i11, int i12) {
        if (i10 != -1) {
            return i10;
        }
        if (i11 != -1) {
            return i11;
        }
        if (i12 != -1) {
            return i12;
        }
        throw new IllegalArgumentException();
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i10, int i11) {
        for (String str : set) {
            Map<String, Integer> map = f15838c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str).intValue()), i10, i11, 33);
            } else {
                Map<String, Integer> map2 = f15839d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str).intValue()), i10, i11, 33);
                }
            }
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, com.applovin.exoplayer2.i.i.d dVar, int i10, int i11) {
        if (dVar == null) {
            return;
        }
        if (dVar.a() != -1) {
            com.applovin.exoplayer2.i.d.d.a(spannableStringBuilder, new StyleSpan(dVar.a()), i10, i11, 33);
        }
        if (dVar.b()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (dVar.c()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (dVar.f()) {
            com.applovin.exoplayer2.i.d.d.a(spannableStringBuilder, new ForegroundColorSpan(dVar.e()), i10, i11, 33);
        }
        if (dVar.h()) {
            com.applovin.exoplayer2.i.d.d.a(spannableStringBuilder, new BackgroundColorSpan(dVar.g()), i10, i11, 33);
        }
        if (dVar.d() != null) {
            com.applovin.exoplayer2.i.d.d.a(spannableStringBuilder, new TypefaceSpan(dVar.d()), i10, i11, 33);
        }
        int i12 = dVar.i();
        if (i12 == 1) {
            com.applovin.exoplayer2.i.d.d.a(spannableStringBuilder, new AbsoluteSizeSpan((int) dVar.j(), true), i10, i11, 33);
        } else if (i12 == 2) {
            com.applovin.exoplayer2.i.d.d.a(spannableStringBuilder, new RelativeSizeSpan(dVar.j()), i10, i11, 33);
        } else if (i12 == 3) {
            com.applovin.exoplayer2.i.d.d.a(spannableStringBuilder, new RelativeSizeSpan(dVar.j() / 100.0f), i10, i11, 33);
        }
        if (dVar.l()) {
            spannableStringBuilder.setSpan(new com.applovin.exoplayer2.i.d.a(), i10, i11, 33);
        }
    }
}
