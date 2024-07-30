package com.anythink.expressad.foundation.d;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.expressad.foundation.h.t;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class r {
    public static final int A = 22;
    public static final int B = 21;
    public static final int C = 10;
    public static final int D = 11;
    public static final int E = 12;
    public static final String F = "1";
    public static final String G = "2";
    public static final int H = 1;
    public static final int I = 2;
    public static final int J = 3;
    public static final int K = 0;
    public static final int L = 1;
    public static final int M = 2;
    public static final int N = 3;
    public static final int O = 4;
    public static final int P = 5;
    public static final int Q = 6;
    public static final int R = 1;
    public static final int S = 2;
    public static final int T = 3;
    public static final int U = 4;
    public static final String V = "key";
    public static final String W = "network_type";
    public static final String X = "network_str";
    public static final String Y = "is_complete_view";
    public static final String Z = "watched_millis";

    /* renamed from: a, reason: collision with root package name */
    public static final String f9696a = "2000020";
    public static final String aA = "ad_type";
    public static final String aB = "resource_type";
    public static final String aC = "devid";
    public static final String aD = "creative";
    public static final String aE = "mraid_type";
    public static final String aF = "adspace_t";
    public static final String aG = "1";
    public static final String aH = "2";
    public static final String aI = "1";
    public static final String aJ = "2";
    public static final String aK = "3";
    public static final String aL = "4";
    public static final String aM = "5";
    public static final String aN = "6";
    public static final String aO = "7";
    public static final String aP = "8";
    public static int aQ = 1;
    public static int aR = 0;
    private static final String aS = "VideoReportData";

    /* renamed from: aa, reason: collision with root package name */
    public static final String f9697aa = "video_length";

    /* renamed from: ab, reason: collision with root package name */
    public static final String f9698ab = "offer_url";

    /* renamed from: ac, reason: collision with root package name */
    public static final String f9699ac = "reason";

    /* renamed from: ad, reason: collision with root package name */
    public static final String f9700ad = "case";
    public static final String ae = "time";
    public static final String af = "platform";
    public static final String ag = "duration";
    public static final String ah = "result";
    public static final String ai = "video_size";
    public static final String aj = "ctype";
    public static final String ak = "unit_id";
    public static final String al = "cid";
    public static final String am = "endscreen_type";
    public static final String an = "error";
    public static final String ao = "template_url";
    public static final String ap = "template";
    public static final String aq = "aback";
    public static final String ar = "event";
    public static final String as = "layout";
    public static final String at = "type";
    public static final String au = "endcard_url";
    public static final String av = "video_url";
    public static final String aw = "template_url";
    public static final String ax = "rid";
    public static final String ay = "rid_n";
    public static final String az = "image_url";

    /* renamed from: b, reason: collision with root package name */
    public static final String f9701b = "2000021";

    /* renamed from: c, reason: collision with root package name */
    public static final String f9702c = "2000054";

    /* renamed from: d, reason: collision with root package name */
    public static final String f9703d = "2000022";

    /* renamed from: e, reason: collision with root package name */
    public static final String f9704e = "2000023";
    public static final String f = "2000024";

    /* renamed from: g, reason: collision with root package name */
    public static final String f9705g = "2000025";

    /* renamed from: h, reason: collision with root package name */
    public static final String f9706h = "2000030";

    /* renamed from: i, reason: collision with root package name */
    public static final String f9707i = "2000037";

    /* renamed from: j, reason: collision with root package name */
    public static final String f9708j = "2000039";

    /* renamed from: k, reason: collision with root package name */
    public static final String f9709k = "2000043";

    /* renamed from: l, reason: collision with root package name */
    public static final String f9710l = "2000044";

    /* renamed from: m, reason: collision with root package name */
    public static final String f9711m = "2000045";

    /* renamed from: n, reason: collision with root package name */
    public static final String f9712n = "2000060";
    public static final String o = "2000059";

    /* renamed from: p, reason: collision with root package name */
    public static final String f9713p = "2000063";

    /* renamed from: q, reason: collision with root package name */
    public static final String f9714q = "2000061";

    /* renamed from: r, reason: collision with root package name */
    public static final String f9715r = "2000062";

    /* renamed from: s, reason: collision with root package name */
    public static final String f9716s = "2000073";

    /* renamed from: t, reason: collision with root package name */
    public static final String f9717t = "2000074";

    /* renamed from: u, reason: collision with root package name */
    public static final String f9718u = "2000075";

    /* renamed from: v, reason: collision with root package name */
    public static final String f9719v = "2000076";

    /* renamed from: w, reason: collision with root package name */
    public static final int f9720w = 14;

    /* renamed from: x, reason: collision with root package name */
    public static final int f9721x = 2;
    public static final int y = 3;

    /* renamed from: z, reason: collision with root package name */
    public static final int f9722z = 20;
    private String aT;
    private String aU;
    private String aV;
    private String aW;
    private int aX;
    private String aY;
    private int aZ;
    private String bA;
    private int bB;
    private int bC;

    /* renamed from: ba, reason: collision with root package name */
    private int f9723ba;

    /* renamed from: bb, reason: collision with root package name */
    private int f9724bb;

    /* renamed from: bc, reason: collision with root package name */
    private String f9725bc;

    /* renamed from: bd, reason: collision with root package name */
    private String f9726bd;
    private int be;
    private int bf;
    private String bg;
    private long bh;
    private int bi;
    private int bj;
    private String bk;
    private String bl;
    private String bm;
    private String bn;
    private int bo;
    private String bp;
    private String bq;
    private String br;
    private String bs;
    private String bt;
    private String bu;
    private String bv;
    private String bw;
    private String bx;
    private String by;
    private String bz;

    private r(String str, int i10, int i11, int i12, int i13, String str2, String str3, int i14, String str4, int i15, String str5) {
        this.bj = 0;
        this.bB = 0;
        this.aW = str;
        this.aX = i10;
        this.aY = str5;
        this.aZ = i11;
        this.f9723ba = i12;
        this.f9724bb = i13;
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.f9725bc = URLEncoder.encode(str2, com.anythink.expressad.foundation.g.a.bN);
            }
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
        this.f9726bd = str3;
        this.bf = i14;
        this.bg = str4;
        this.bh = i15;
    }

    private int A() {
        return this.f9723ba;
    }

    private int B() {
        return this.f9724bb;
    }

    private String C() {
        return this.f9725bc;
    }

    private String D() {
        if (TextUtils.isEmpty(this.f9726bd)) {
            return "";
        }
        return this.f9726bd;
    }

    private String E() {
        return this.bg;
    }

    private long F() {
        return this.bh;
    }

    private int G() {
        return this.aX;
    }

    private String H() {
        return this.aY;
    }

    private int I() {
        return this.aZ;
    }

    private int J() {
        return this.bf;
    }

    private int a() {
        return this.be;
    }

    private String b() {
        return this.aT;
    }

    private String c() {
        return this.aU;
    }

    private String d() {
        return this.aV;
    }

    private void e(int i10) {
        this.be = i10;
    }

    private String f() {
        return this.by;
    }

    private String g() {
        return this.bx;
    }

    private String h() {
        return this.bw;
    }

    private String i() {
        return this.bA;
    }

    private int j() {
        return this.bj;
    }

    private void k(String str) {
        this.aT = str;
    }

    private void l(String str) {
        this.aU = str;
    }

    private void m(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.aV = URLEncoder.encode(str);
    }

    private void n(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.bz = URLEncoder.encode(str, com.anythink.expressad.foundation.g.a.bN);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void o(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.by = URLEncoder.encode(str, com.anythink.expressad.foundation.g.a.bN);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void p(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.bx = URLEncoder.encode(str, com.anythink.expressad.foundation.g.a.bN);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void q(String str) {
        this.bw = str;
    }

    private void r(String str) {
        this.bs = str;
    }

    private void s(String str) {
        this.bq = str;
    }

    private void t(String str) {
        this.bt = str;
    }

    private void u(String str) {
        this.bu = str;
    }

    private void v(String str) {
        this.bv = str;
    }

    private String w() {
        return this.bm;
    }

    private String x() {
        return this.bn;
    }

    private int y() {
        return this.bo;
    }

    private String z() {
        return this.aW;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RewardReportData [key=");
        sb2.append(this.aW);
        sb2.append(", networkType=");
        sb2.append(this.aX);
        sb2.append(", isCompleteView=");
        sb2.append(this.aZ);
        sb2.append(", watchedMillis=");
        sb2.append(this.f9723ba);
        sb2.append(", videoLength=");
        sb2.append(this.f9724bb);
        sb2.append(", offerUrl=");
        sb2.append(this.f9725bc);
        sb2.append(", reason=");
        sb2.append(this.f9726bd);
        sb2.append(", result=");
        sb2.append(this.bf);
        sb2.append(", duration=");
        sb2.append(this.bg);
        sb2.append(", videoSize=");
        return a3.l.n(sb2, this.bh, "]");
    }

    private String e() {
        return this.bz;
    }

    private void f(int i10) {
        this.bj = i10;
    }

    private void g(int i10) {
        this.bi = i10;
    }

    private void h(int i10) {
        this.bo = i10;
    }

    private void i(int i10) {
        this.f9723ba = i10;
    }

    private void j(int i10) {
        this.f9724bb = i10;
    }

    private int k() {
        return this.bi;
    }

    private String l() {
        return this.bp;
    }

    private String q() {
        return this.bu;
    }

    private String r() {
        return this.bv;
    }

    private int s() {
        return this.bB;
    }

    private int t() {
        return this.bC;
    }

    private String u() {
        return this.bk;
    }

    private String v() {
        return this.bl;
    }

    private void w(String str) {
        this.f9725bc = str;
    }

    private void x(String str) {
        this.bg = str;
    }

    public final void a(String str) {
        this.bA = str;
    }

    public final void b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.bp = URLEncoder.encode(str, com.anythink.expressad.foundation.g.a.bN);
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
    }

    public final void c(String str) {
        this.br = str;
    }

    public final void d(String str) {
        this.bk = str;
    }

    private void k(int i10) {
        this.bh = i10;
    }

    private void l(int i10) {
        this.aZ = i10;
    }

    private String m() {
        return this.br;
    }

    public final void a(int i10) {
        this.bB = i10;
    }

    public final void c(int i10) {
        this.aX = i10;
    }

    public final void d(int i10) {
        this.bf = i10;
    }

    public final void e(String str) {
        this.bl = str;
    }

    public final void f(String str) {
        this.bm = str;
    }

    public final void g(String str) {
        this.bn = str;
    }

    public final void h(String str) {
        this.aW = str;
    }

    public final void i(String str) {
        this.f9726bd = str;
    }

    public final void j(String str) {
        this.aY = str;
    }

    private static String a(List<r> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (r rVar : list) {
            StringBuilder m10 = com.ironsource.adapters.facebook.a.m(new StringBuilder("key="), rVar.aW, ContainerUtils.FIELD_DELIMITER, stringBuffer, "result=");
            m10.append(rVar.bf);
            m10.append(ContainerUtils.FIELD_DELIMITER);
            stringBuffer.append(m10.toString());
            StringBuilder m11 = com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(new StringBuilder("duration="), rVar.bg, ContainerUtils.FIELD_DELIMITER, stringBuffer, "endcard_url="), rVar.bx, ContainerUtils.FIELD_DELIMITER, stringBuffer, "cid="), rVar.bn, ContainerUtils.FIELD_DELIMITER, stringBuffer, "unit_id="), rVar.bm, ContainerUtils.FIELD_DELIMITER, stringBuffer, "reason="), rVar.D(), ContainerUtils.FIELD_DELIMITER, stringBuffer, "ad_type="), rVar.bA, ContainerUtils.FIELD_DELIMITER, stringBuffer, "rid="), rVar.bk, ContainerUtils.FIELD_DELIMITER, stringBuffer, "rid_n="), rVar.bl, ContainerUtils.FIELD_DELIMITER, stringBuffer, "type="), rVar.bw, ContainerUtils.FIELD_DELIMITER, stringBuffer, "adspace_t=");
            m11.append(rVar.bC);
            stringBuffer.append(m11.toString());
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    private static String c(r rVar) {
        if (rVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder m10 = com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(new StringBuilder("key="), rVar.aW, ContainerUtils.FIELD_DELIMITER, stringBuffer, "cid="), rVar.bn, ContainerUtils.FIELD_DELIMITER, stringBuffer, "unit_id="), rVar.bm, ContainerUtils.FIELD_DELIMITER, stringBuffer, "network_type=");
        m10.append(rVar.aX);
        m10.append(ContainerUtils.FIELD_DELIMITER);
        stringBuffer.append(m10.toString());
        stringBuffer.append("mraid_type=" + rVar.bB + ContainerUtils.FIELD_DELIMITER);
        StringBuilder m11 = com.ironsource.adapters.facebook.a.m(new StringBuilder("rid_n="), rVar.bl, ContainerUtils.FIELD_DELIMITER, stringBuffer, "rid=");
        m11.append(rVar.bk);
        stringBuffer.append(m11.toString());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    private static String d(r rVar) {
        if (rVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder m10 = com.ironsource.adapters.facebook.a.m(new StringBuilder("key="), rVar.aW, ContainerUtils.FIELD_DELIMITER, stringBuffer, "result=");
        m10.append(rVar.bf);
        m10.append(ContainerUtils.FIELD_DELIMITER);
        stringBuffer.append(m10.toString());
        StringBuilder m11 = com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(new StringBuilder("duration="), rVar.bg, ContainerUtils.FIELD_DELIMITER, stringBuffer, "cid="), rVar.bn, ContainerUtils.FIELD_DELIMITER, stringBuffer, "reason="), rVar.D(), ContainerUtils.FIELD_DELIMITER, stringBuffer, "ad_type="), rVar.bA, ContainerUtils.FIELD_DELIMITER, stringBuffer, "unit_id="), rVar.bm, ContainerUtils.FIELD_DELIMITER, stringBuffer, "devid="), rVar.aU, ContainerUtils.FIELD_DELIMITER, stringBuffer, "mraid_type=");
        m11.append(rVar.bB);
        m11.append(ContainerUtils.FIELD_DELIMITER);
        stringBuffer.append(m11.toString());
        stringBuffer.append("network_type=" + rVar.aX + ContainerUtils.FIELD_DELIMITER);
        if (!TextUtils.isEmpty(rVar.bx)) {
            stringBuffer.append("endcard_url=" + rVar.bx + ContainerUtils.FIELD_DELIMITER);
        }
        if (!TextUtils.isEmpty(rVar.bw)) {
            stringBuffer.append("type=" + rVar.bw + ContainerUtils.FIELD_DELIMITER);
        }
        if (rVar.aT != null) {
            stringBuffer.append("resource_type=" + rVar.aT + ContainerUtils.FIELD_DELIMITER);
        }
        StringBuilder m12 = com.ironsource.adapters.facebook.a.m(new StringBuilder("rid_n="), rVar.bl, ContainerUtils.FIELD_DELIMITER, stringBuffer, "rid=");
        m12.append(rVar.bk);
        stringBuffer.append(m12.toString());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    private static String e(r rVar) {
        if (rVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder m10 = com.ironsource.adapters.facebook.a.m(new StringBuilder("key="), rVar.aW, ContainerUtils.FIELD_DELIMITER, stringBuffer, "result=");
        m10.append(rVar.bf);
        m10.append(ContainerUtils.FIELD_DELIMITER);
        stringBuffer.append(m10.toString());
        StringBuilder m11 = com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(new StringBuilder("duration="), rVar.bg, ContainerUtils.FIELD_DELIMITER, stringBuffer, "cid="), rVar.bn, ContainerUtils.FIELD_DELIMITER, stringBuffer, "unit_id="), rVar.bm, ContainerUtils.FIELD_DELIMITER, stringBuffer, "reason="), rVar.D(), ContainerUtils.FIELD_DELIMITER, stringBuffer, "ad_type="), rVar.bA, ContainerUtils.FIELD_DELIMITER, stringBuffer, "rid="), rVar.bk, ContainerUtils.FIELD_DELIMITER, stringBuffer, "rid_n="), rVar.bl, ContainerUtils.FIELD_DELIMITER, stringBuffer, "network_type=");
        m11.append(rVar.aX);
        m11.append(ContainerUtils.FIELD_DELIMITER);
        stringBuffer.append(m11.toString());
        stringBuffer.append("mraid_type=" + rVar.bB + ContainerUtils.FIELD_DELIMITER);
        stringBuffer.append("devid=" + rVar.aU + ContainerUtils.FIELD_DELIMITER);
        if (rVar.aT != null) {
            stringBuffer.append("resource_type=" + rVar.aT + ContainerUtils.FIELD_DELIMITER);
        }
        if (!TextUtils.isEmpty(rVar.bx)) {
            stringBuffer.append("endcard_url=" + rVar.bx + ContainerUtils.FIELD_DELIMITER);
        }
        stringBuffer.append("type=" + rVar.bw);
        return stringBuffer.toString();
    }

    private static String f(r rVar) {
        if (rVar == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder m10 = com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(new StringBuilder("key="), rVar.aW, ContainerUtils.FIELD_DELIMITER, stringBuffer, "cid="), rVar.bn, ContainerUtils.FIELD_DELIMITER, stringBuffer, "rid="), rVar.bk, ContainerUtils.FIELD_DELIMITER, stringBuffer, "rid_n="), rVar.bl, ContainerUtils.FIELD_DELIMITER, stringBuffer, "unit_id="), rVar.bm, ContainerUtils.FIELD_DELIMITER, stringBuffer, "network_type=");
        m10.append(rVar.aX);
        m10.append(ContainerUtils.FIELD_DELIMITER);
        stringBuffer.append(m10.toString());
        stringBuffer.append("mraid_type=" + rVar.bB + ContainerUtils.FIELD_DELIMITER);
        stringBuffer.append("platform=1");
        return stringBuffer.toString();
    }

    private static String g(r rVar) {
        if (rVar == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder m10 = com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(new StringBuilder("key="), rVar.aW, ContainerUtils.FIELD_DELIMITER, stringBuffer, "cid="), rVar.bn, ContainerUtils.FIELD_DELIMITER, stringBuffer, "rid="), rVar.bk, ContainerUtils.FIELD_DELIMITER, stringBuffer, "rid_n="), rVar.bl, ContainerUtils.FIELD_DELIMITER, stringBuffer, "unit_id="), rVar.bm, ContainerUtils.FIELD_DELIMITER, stringBuffer, "reason="), rVar.D(), ContainerUtils.FIELD_DELIMITER, stringBuffer, "case=");
        m10.append(rVar.be);
        m10.append(ContainerUtils.FIELD_DELIMITER);
        stringBuffer.append(m10.toString());
        stringBuffer.append("network_type=" + rVar.aX);
        return stringBuffer.toString();
    }

    private String n() {
        return this.bs;
    }

    private String o() {
        return this.bq;
    }

    private String p() {
        return this.bt;
    }

    public final void b(int i10) {
        this.bC = i10;
    }

    private static String b(r rVar) {
        if (rVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder m10 = com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(new StringBuilder("key="), rVar.aW, ContainerUtils.FIELD_DELIMITER, stringBuffer, "cid="), rVar.bn, ContainerUtils.FIELD_DELIMITER, stringBuffer, "unit_id="), rVar.bm, ContainerUtils.FIELD_DELIMITER, stringBuffer, "network_type=");
        m10.append(rVar.aX);
        m10.append(ContainerUtils.FIELD_DELIMITER);
        stringBuffer.append(m10.toString());
        StringBuilder m11 = com.ironsource.adapters.facebook.a.m(com.ironsource.adapters.facebook.a.m(new StringBuilder("rid="), rVar.bk, ContainerUtils.FIELD_DELIMITER, stringBuffer, "rid_n="), rVar.bl, ContainerUtils.FIELD_DELIMITER, stringBuffer, "reason=");
        m11.append(rVar.D());
        stringBuffer.append(m11.toString());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    public r() {
        this.bj = 0;
        this.bB = 0;
    }

    private r(String str, int i10, int i11, String str2, int i12, int i13, String str3) {
        this.bj = 0;
        this.bB = 0;
        this.aW = str;
        this.aX = i10;
        this.aY = str3;
        this.f9724bb = i11;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f9725bc = URLEncoder.encode(str2, com.anythink.expressad.foundation.g.a.bN);
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        this.bi = i12;
        this.bj = i13;
    }

    private r(String str, int i10, int i11, int i12, int i13, String str2, int i14, String str3) {
        this.bj = 0;
        this.bB = 0;
        this.aW = str;
        this.aY = str3;
        this.aX = i10;
        this.aZ = i11;
        this.f9723ba = i12;
        this.f9724bb = i13;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f9725bc = URLEncoder.encode(str2, com.anythink.expressad.foundation.g.a.bN);
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        this.bj = i14;
    }

    private r(String str, int i10, String str2, String str3, String str4) {
        this.bj = 0;
        this.bB = 0;
        this.aW = str;
        this.aY = str4;
        this.aX = i10;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f9725bc = URLEncoder.encode(str2, com.anythink.expressad.foundation.g.a.bN);
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        this.f9726bd = str3;
    }

    private static String b(List<r> list) {
        if (list == null) {
            return null;
        }
        try {
            if (list.size() <= 0) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<r> it = list.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next().bv);
                stringBuffer.append("\n");
            }
            return stringBuffer.toString();
        } catch (Throwable th) {
            com.anythink.expressad.foundation.h.o.b(aS, th.getMessage(), th);
            return null;
        }
    }

    private r(String str, int i10, int i11, String str2, int i12, String str3, int i13, String str4) {
        this.bj = 0;
        this.bB = 0;
        this.aW = str;
        this.aX = i10;
        this.aY = str4;
        this.f9724bb = i11;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f9725bc = URLEncoder.encode(str2, com.anythink.expressad.foundation.g.a.bN);
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        this.bf = i12;
        this.bg = str3;
        this.bh = i13;
    }

    private r(Context context, c cVar, int i10, String str, long j10, int i11) {
        this.bj = 0;
        this.bB = 0;
        if (i11 == 1) {
            this.aW = f9703d;
        } else if (i11 == 287 || i11 == 94) {
            this.aW = f9703d;
        } else if (i11 == 95) {
            this.aW = f9705g;
        }
        int a10 = com.anythink.expressad.foundation.h.k.a();
        this.aX = a10;
        this.aY = com.anythink.expressad.foundation.h.k.a(context, a10);
        this.f9724bb = cVar.bi();
        this.bk = cVar.Z();
        this.bl = cVar.aa();
        if (!TextUtils.isEmpty(this.f9725bc)) {
            try {
                this.f9725bc = URLEncoder.encode(cVar.ah() == null ? cVar.ad() : cVar.ah(), com.anythink.expressad.foundation.g.a.bN);
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        this.bf = i10;
        this.bg = str;
        this.bh = j10 == 0 ? cVar.T() : j10;
    }

    private r(String str, String str2, String str3, String str4, int i10, String str5, int i11, String str6) {
        this.bj = 0;
        this.bB = 0;
        this.aW = str;
        this.bk = str2;
        this.bl = str3;
        this.bm = str4;
        this.aX = i10;
        this.aY = str6;
        this.bn = str5;
        this.bo = i11;
    }

    public static String a(r rVar) {
        String str;
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=" + rVar.aW + ContainerUtils.FIELD_DELIMITER);
            stringBuffer.append("error=" + t.c(rVar.br) + ContainerUtils.FIELD_DELIMITER);
            stringBuffer.append("template_url=" + t.c(rVar.bp) + ContainerUtils.FIELD_DELIMITER);
            stringBuffer.append("unit_id=" + t.c(rVar.bm) + ContainerUtils.FIELD_DELIMITER);
            stringBuffer.append("cid=" + t.c(rVar.bn) + ContainerUtils.FIELD_DELIMITER);
            String str2 = "";
            if (TextUtils.isEmpty(rVar.aY)) {
                str = "";
            } else {
                str = "network_str=" + rVar.aY + ContainerUtils.FIELD_DELIMITER;
            }
            stringBuffer.append(str);
            if (!TextUtils.isEmpty(rVar.aY)) {
                str2 = "network_type=" + rVar.aX;
            }
            stringBuffer.append(str2);
            return stringBuffer.toString();
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public r(String str, String str2, String str3, String str4, String str5, String str6, int i10, String str7) {
        this.bj = 0;
        this.bB = 0;
        this.aW = str;
        this.bt = str2;
        this.bq = str3;
        this.bu = str4;
        this.bm = str5;
        this.bn = str6;
        this.aX = i10;
        this.aY = str7;
    }

    private r(String str) {
        this.bj = 0;
        this.bB = 0;
        this.bv = str;
    }

    public r(String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.bj = 0;
        this.bB = 0;
        this.aW = str;
        this.bf = i10;
        this.bg = str2;
        try {
            if (!TextUtils.isEmpty(str3)) {
                this.bx = URLEncoder.encode(str3, com.anythink.expressad.foundation.g.a.bN);
            }
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
        this.bn = str4;
        this.bm = str5;
        this.f9726bd = str6;
        this.bw = str7;
        if (Integer.valueOf(str2).intValue() > com.anythink.expressad.foundation.g.a.cq) {
            this.bf = 2;
        }
    }

    public r(String str, String str2, String str3, String str4, String str5, int i10) {
        this.bj = 0;
        this.bB = 0;
        this.aW = str;
        this.bn = str2;
        this.bk = str3;
        this.bl = str4;
        this.bm = str5;
        this.aX = i10;
    }

    public r(String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6) {
        this.bj = 0;
        this.bB = 0;
        this.aW = str;
        this.bn = str2;
        this.bk = str3;
        this.bl = str4;
        this.bm = str5;
        this.aX = i10;
        this.f9726bd = str6;
        this.be = i11;
    }
}
