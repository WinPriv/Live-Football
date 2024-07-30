package com.anythink.core.common.e;

import android.text.TextUtils;
import com.anythink.core.c.d;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class ah {
    public static final String O = "ofm_tid_key";
    public static final int P = 1;
    public static final int Q = 2;
    public static final int R = 3;
    public static final int S = 4;
    public static final int T = 5;
    public static final int U = 6;
    public static final int V = 7;
    public static final int W = 8;
    public static final int X = 10;
    public static final int Y = 0;
    public static final int Z = 1;

    /* renamed from: aa, reason: collision with root package name */
    public static final int f5478aa = 2;

    /* renamed from: ab, reason: collision with root package name */
    public static final int f5479ab = 3;

    /* renamed from: ac, reason: collision with root package name */
    public static final int f5480ac = 4;

    /* renamed from: ad, reason: collision with root package name */
    public static final int f5481ad = 5;
    public static final int ae = 8;
    public static final String af = "0";
    public static final String ag = "1";
    public static final String ah = "2";
    public static final String ai = "3";
    public static final String aj = "4";

    /* renamed from: a, reason: collision with root package name */
    private String f5482a;
    protected String ak;
    protected String al;
    protected String am;
    protected String an;
    public String ao;
    public int ap;
    public int aq;
    protected String ar;
    protected int as;
    protected int at;
    protected int au;
    protected int av = -1;

    /* renamed from: b, reason: collision with root package name */
    private String f5483b;

    /* renamed from: c, reason: collision with root package name */
    private int f5484c;

    private int a() {
        return this.au;
    }

    private int b() {
        return this.as;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c() {
        return this.ao;
    }

    private int d() {
        return this.ap;
    }

    private int e() {
        return this.aq;
    }

    public JSONObject A(int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", i10);
            jSONObject.put("pl_id", this.ak);
            jSONObject.put("req_id", this.al);
            if (!TextUtils.isEmpty(this.am)) {
                jSONObject.put("format", Integer.parseInt(this.am));
            }
            jSONObject.put("ps_id", com.anythink.core.common.b.n.a().r());
            String g6 = com.anythink.core.common.b.n.a().g(this.ak);
            if (!TextUtils.isEmpty(g6)) {
                jSONObject.put("sessionid", g6);
            }
            int i11 = this.av;
            if (i11 != -1) {
                jSONObject.put("traffic_group_id", i11);
            }
            if (this.au == 1) {
                jSONObject.put("ofm_tid", this.at);
                jSONObject.put("ofm_system", this.as);
                jSONObject.put(com.anythink.core.common.g.c.M, this.au);
            }
            jSONObject.put("asid", this.an);
            jSONObject.put(d.a.U, this.f5482a);
            jSONObject.put(com.anythink.core.common.g.c.am, this.f5483b);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    public final void B(int i10) {
        this.f5484c = i10;
    }

    public final void C(int i10) {
        this.au = i10;
    }

    public final void D(int i10) {
        this.at = i10;
    }

    public final void E(int i10) {
        this.av = i10;
    }

    public final int O() {
        return this.f5484c;
    }

    public final String P() {
        return this.f5482a;
    }

    public final String Q() {
        return this.f5483b;
    }

    public final void R() {
        this.as = 1;
    }

    public final int S() {
        return this.at;
    }

    public final String T() {
        return this.ar;
    }

    public final int U() {
        return this.av;
    }

    public final String V() {
        return this.an;
    }

    public final String W() {
        return this.ak;
    }

    public final String X() {
        return this.al;
    }

    public final String Y() {
        return this.am;
    }

    public final String Z() {
        String str = this.am;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    c10 = 0;
                    break;
                }
                break;
            case 49:
                if (str.equals("1")) {
                    c10 = 1;
                    break;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    c10 = 2;
                    break;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    c10 = 3;
                    break;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return com.anythink.expressad.foundation.g.a.f.f9813a;
            case 1:
                return "reward";
            case 2:
                return com.anythink.expressad.foundation.g.a.f.f9817e;
            case 3:
                return "inter";
            case 4:
                return com.anythink.expressad.foundation.g.a.f.f;
            default:
                return "none";
        }
    }

    public final void t(String str) {
        this.f5482a = str;
    }

    public final void u(String str) {
        this.f5483b = str;
    }

    public final void v(String str) {
        this.ar = str;
    }

    public final void w(String str) {
        this.an = str;
    }

    public final void x(String str) {
        this.ak = str;
    }

    public final void y(String str) {
        this.al = str;
    }

    public final void z(String str) {
        this.am = str;
    }

    private void a(String str) {
        this.ao = str;
    }

    private void b(int i10) {
        this.aq = i10;
    }

    private void a(int i10) {
        this.ap = i10;
    }
}
