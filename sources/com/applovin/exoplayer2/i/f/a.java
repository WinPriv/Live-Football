package com.applovin.exoplayer2.i.f;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.i.d;
import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.r;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f15731a = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f15732b = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: c, reason: collision with root package name */
    private final StringBuilder f15733c;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<String> f15734d;

    public a() {
        super("SubripDecoder");
        this.f15733c = new StringBuilder();
        this.f15734d = new ArrayList<>();
    }

    public static float b(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return 0.92f;
                }
                throw new IllegalArgumentException();
            }
            return 0.5f;
        }
        return 0.08f;
    }

    @Override // com.applovin.exoplayer2.i.d
    public f a(byte[] bArr, int i10, boolean z10) {
        String str;
        ArrayList arrayList = new ArrayList();
        r rVar = new r();
        y yVar = new y(bArr, i10);
        while (true) {
            String C = yVar.C();
            int i11 = 0;
            if (C == null) {
                break;
            }
            if (C.length() != 0) {
                try {
                    Integer.parseInt(C);
                    String C2 = yVar.C();
                    if (C2 == null) {
                        q.c("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f15731a.matcher(C2);
                    if (matcher.matches()) {
                        rVar.a(a(matcher, 1));
                        rVar.a(a(matcher, 6));
                        this.f15733c.setLength(0);
                        this.f15734d.clear();
                        for (String C3 = yVar.C(); !TextUtils.isEmpty(C3); C3 = yVar.C()) {
                            if (this.f15733c.length() > 0) {
                                this.f15733c.append("<br>");
                            }
                            this.f15733c.append(a(C3, this.f15734d));
                        }
                        Spanned fromHtml = Html.fromHtml(this.f15733c.toString());
                        while (true) {
                            if (i11 >= this.f15734d.size()) {
                                str = null;
                                break;
                            }
                            str = this.f15734d.get(i11);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            }
                            i11++;
                        }
                        arrayList.add(a(fromHtml, str));
                        arrayList.add(com.applovin.exoplayer2.i.a.f15505a);
                    } else {
                        q.c("SubripDecoder", "Skipping invalid timing: ".concat(C2));
                    }
                } catch (NumberFormatException unused) {
                    q.c("SubripDecoder", "Skipping invalid index: ".concat(C));
                }
            }
        }
        return new b((com.applovin.exoplayer2.i.a[]) arrayList.toArray(new com.applovin.exoplayer2.i.a[0]), rVar.b());
    }

    private String a(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb2 = new StringBuilder(trim);
        Matcher matcher = f15732b.matcher(trim);
        int i10 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i10;
            int length = group.length();
            sb2.replace(start, start + length, "");
            i10 += length;
        }
        return sb2.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private com.applovin.exoplayer2.i.a a(Spanned spanned, String str) {
        char c10;
        char c11;
        a.C0175a a10 = new a.C0175a().a(spanned);
        if (str == null) {
            return a10.e();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0 || c10 == 1 || c10 == 2) {
            a10.b(0);
        } else if (c10 != 3 && c10 != 4 && c10 != 5) {
            a10.b(1);
        } else {
            a10.b(2);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        if (c11 == 0 || c11 == 1 || c11 == 2) {
            a10.a(2);
        } else if (c11 != 3 && c11 != 4 && c11 != 5) {
            a10.a(1);
        } else {
            a10.a(0);
        }
        return a10.a(b(a10.c())).a(b(a10.b()), 0).e();
    }

    private static long a(Matcher matcher, int i10) {
        String group = matcher.group(i10 + 1);
        long parseLong = (Long.parseLong((String) com.applovin.exoplayer2.l.a.b(matcher.group(i10 + 3))) * 1000) + (Long.parseLong((String) com.applovin.exoplayer2.l.a.b(matcher.group(i10 + 2))) * 60 * 1000) + (group != null ? Long.parseLong(group) * 60 * 60 * 1000 : 0L);
        String group2 = matcher.group(i10 + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }
}
