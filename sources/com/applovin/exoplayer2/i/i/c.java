package com.applovin.exoplayer2.i.i;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import com.huawei.openalliance.ad.constant.w;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f15814a = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f15815b = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: c, reason: collision with root package name */
    private final y f15816c = new y();

    /* renamed from: d, reason: collision with root package name */
    private final StringBuilder f15817d = new StringBuilder();

    private static String b(y yVar, StringBuilder sb2) {
        b(yVar);
        if (yVar.a() < 5 || !"::cue".equals(yVar.f(5))) {
            return null;
        }
        int c10 = yVar.c();
        String a10 = a(yVar, sb2);
        if (a10 == null) {
            return null;
        }
        if ("{".equals(a10)) {
            yVar.d(c10);
            return "";
        }
        String d10 = "(".equals(a10) ? d(yVar) : null;
        if (")".equals(a(yVar, sb2))) {
            return d10;
        }
        return null;
    }

    public static void c(y yVar) {
        do {
        } while (!TextUtils.isEmpty(yVar.C()));
    }

    private static String d(y yVar) {
        int c10 = yVar.c();
        int b10 = yVar.b();
        boolean z10 = false;
        while (c10 < b10 && !z10) {
            int i10 = c10 + 1;
            z10 = ((char) yVar.d()[c10]) == ')';
            c10 = i10;
        }
        return yVar.f((c10 - 1) - yVar.c()).trim();
    }

    private static boolean e(y yVar) {
        char a10 = a(yVar, yVar.c());
        if (a10 != '\t' && a10 != '\n' && a10 != '\f' && a10 != '\r' && a10 != ' ') {
            return false;
        }
        yVar.e(1);
        return true;
    }

    private static boolean f(y yVar) {
        int c10 = yVar.c();
        int b10 = yVar.b();
        byte[] d10 = yVar.d();
        if (c10 + 2 <= b10) {
            int i10 = c10 + 1;
            if (d10[c10] == 47) {
                int i11 = i10 + 1;
                if (d10[i10] != 42) {
                    return false;
                }
                while (true) {
                    int i12 = i11 + 1;
                    if (i12 < b10) {
                        if (((char) d10[i11]) == '*' && ((char) d10[i12]) == '/') {
                            i11 = i12 + 1;
                            b10 = i11;
                        } else {
                            i11 = i12;
                        }
                    } else {
                        yVar.e(b10 - yVar.c());
                        return true;
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public List<d> a(y yVar) {
        this.f15817d.setLength(0);
        int c10 = yVar.c();
        c(yVar);
        this.f15816c.a(yVar.d(), yVar.c());
        this.f15816c.d(c10);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String b10 = b(this.f15816c, this.f15817d);
            if (b10 == null || !"{".equals(a(this.f15816c, this.f15817d))) {
                return arrayList;
            }
            d dVar = new d();
            a(dVar, b10);
            String str = null;
            boolean z10 = false;
            while (!z10) {
                int c11 = this.f15816c.c();
                String a10 = a(this.f15816c, this.f15817d);
                boolean z11 = a10 == null || "}".equals(a10);
                if (!z11) {
                    this.f15816c.d(c11);
                    a(this.f15816c, dVar, this.f15817d);
                }
                str = a10;
                z10 = z11;
            }
            if ("}".equals(str)) {
                arrayList.add(dVar);
            }
        }
    }

    private static String c(y yVar, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int c10 = yVar.c();
            String a10 = a(yVar, sb2);
            if (a10 == null) {
                return null;
            }
            if (!"}".equals(a10) && !w.aG.equals(a10)) {
                sb3.append(a10);
            } else {
                yVar.d(c10);
                z10 = true;
            }
        }
        return sb3.toString();
    }

    private static String d(y yVar, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int c10 = yVar.c();
        int b10 = yVar.b();
        while (c10 < b10 && !z10) {
            char c11 = (char) yVar.d()[c10];
            if ((c11 < 'A' || c11 > 'Z') && ((c11 < 'a' || c11 > 'z') && !((c11 >= '0' && c11 <= '9') || c11 == '#' || c11 == '-' || c11 == '.' || c11 == '_'))) {
                z10 = true;
            } else {
                c10++;
                sb2.append(c11);
            }
        }
        yVar.e(c10 - yVar.c());
        return sb2.toString();
    }

    public static void b(y yVar) {
        while (true) {
            for (boolean z10 = true; yVar.a() > 0 && z10; z10 = false) {
                if (!e(yVar) && !f(yVar)) {
                }
            }
            return;
        }
    }

    private static void a(y yVar, d dVar, StringBuilder sb2) {
        b(yVar);
        String d10 = d(yVar, sb2);
        if (!"".equals(d10) && w.bE.equals(a(yVar, sb2))) {
            b(yVar);
            String c10 = c(yVar, sb2);
            if (c10 == null || "".equals(c10)) {
                return;
            }
            int c11 = yVar.c();
            String a10 = a(yVar, sb2);
            if (!w.aG.equals(a10)) {
                if (!"}".equals(a10)) {
                    return;
                } else {
                    yVar.d(c11);
                }
            }
            if (com.anythink.expressad.foundation.h.i.f10126d.equals(d10)) {
                dVar.a(com.applovin.exoplayer2.l.f.b(c10));
                return;
            }
            if ("background-color".equals(d10)) {
                dVar.b(com.applovin.exoplayer2.l.f.b(c10));
                return;
            }
            boolean z10 = true;
            if ("ruby-position".equals(d10)) {
                if ("over".equals(c10)) {
                    dVar.d(1);
                    return;
                } else {
                    if ("under".equals(c10)) {
                        dVar.d(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(d10)) {
                if (!"all".equals(c10) && !c10.startsWith("digits")) {
                    z10 = false;
                }
                dVar.d(z10);
                return;
            }
            if ("text-decoration".equals(d10)) {
                if ("underline".equals(c10)) {
                    dVar.a(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(d10)) {
                dVar.d(c10);
                return;
            }
            if ("font-weight".equals(d10)) {
                if ("bold".equals(c10)) {
                    dVar.b(true);
                }
            } else if ("font-style".equals(d10)) {
                if ("italic".equals(c10)) {
                    dVar.c(true);
                }
            } else if ("font-size".equals(d10)) {
                a(c10, dVar);
            }
        }
    }

    public static String a(y yVar, StringBuilder sb2) {
        b(yVar);
        if (yVar.a() == 0) {
            return null;
        }
        String d10 = d(yVar, sb2);
        if (!"".equals(d10)) {
            return d10;
        }
        return "" + ((char) yVar.h());
    }

    private static char a(y yVar, int i10) {
        return (char) yVar.d()[i10];
    }

    private static void a(String str, d dVar) {
        Matcher matcher = f15815b.matcher(Ascii.toLowerCase(str));
        if (!matcher.matches()) {
            q.c("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) com.applovin.exoplayer2.l.a.b(matcher.group(2));
        str2.getClass();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case 37:
                if (str2.equals("%")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3240:
                if (str2.equals("em")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3592:
                if (str2.equals("px")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                dVar.c(3);
                break;
            case 1:
                dVar.c(2);
                break;
            case 2:
                dVar.c(1);
                break;
            default:
                throw new IllegalStateException();
        }
        dVar.a(Float.parseFloat((String) com.applovin.exoplayer2.l.a.b(matcher.group(1))));
    }

    private void a(d dVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = f15814a.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                dVar.c((String) com.applovin.exoplayer2.l.a.b(matcher.group(1)));
            }
            str = str.substring(0, indexOf);
        }
        String[] a10 = ai.a(str, "\\.");
        String str2 = a10[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            dVar.b(str2.substring(0, indexOf2));
            dVar.a(str2.substring(indexOf2 + 1));
        } else {
            dVar.b(str2);
        }
        if (a10.length > 1) {
            dVar.a((String[]) ai.a(a10, 1, a10.length));
        }
    }
}
