package com.anythink.expressad.foundation.d;

import android.net.Uri;
import android.text.TextUtils;
import com.anythink.basead.b.a;
import com.anythink.expressad.a.c;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.foundation.h.w;
import com.anythink.expressad.foundation.h.x;
import com.huawei.openalliance.ad.ppskit.db.bean.AppDownloadRecord;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c extends h {
    public static final int A = -2;
    public static final int B = 1;
    public static final String C = "id";
    public static final String D = "unitId";
    public static final String E = "title";
    public static final String F = "desc";
    public static final String G = "package_name";
    public static final String H = "icon_url";
    public static final String I = "image_url";
    public static final String J = "image_size";
    public static final String K = "app_size";
    public static final String L = "impression_url";
    public static final String M = "click_url";
    public static final String N = "wtick";
    public static final String O = "deep_link";
    public static final String P = "user_activation";
    public static final String Q = "notice_url";
    public static final String R = "template";
    public static final String S = "ad_source_id";
    public static final String T = "fca";
    public static final String U = "fcb";
    public static final String V = "click_mode";
    public static final String W = "landing_type";
    public static final String X = "link_type";
    public static final String Y = "rating";
    public static final String Z = "number_rating";

    /* renamed from: a, reason: collision with root package name */
    public static final String f9447a = "c";
    public static final String aA = "vctn_t";
    public static final String aB = "vck_t";
    public static final String aC = "rs_ignc_r";
    public static final int aD = 1;
    public static final int aE = 2;
    public static final String aF = "rw_pl";
    public static final String aG = "jm_pd";
    public static final String aI = "oc_type";
    public static final String aJ = "oc_time";
    public static final String aK = "t_list";
    public static final String aL = "adchoice";
    public static final String aM = "omid";
    public static final String aN = "ia_icon";
    public static final String aO = "ia_rst";
    public static final String aP = "ia_url";
    public static final String aQ = "ia_ori";
    public static final String aR = "ad_type";
    public static final String aS = "ia_ext1";
    public static final String aT = "ia_ext2";
    public static final String aU = "is_download_zip";
    public static final String aV = "ia_cache";
    public static final String aW = "imp_ua";
    public static final String aX = "c_ua";
    public static final int aY = 1;
    public static final int aZ = 1;

    /* renamed from: aa, reason: collision with root package name */
    public static final String f9448aa = "ctatext";

    /* renamed from: ab, reason: collision with root package name */
    public static final String f9449ab = "c_ct";

    /* renamed from: ac, reason: collision with root package name */
    public static final String f9450ac = "video_url";

    /* renamed from: ad, reason: collision with root package name */
    public static final String f9451ad = "video_length";
    public static final String ae = "video_size";
    public static final String af = "video_resolution";
    public static final String ag = "watch_mile";
    public static final String ah = "endcard_click_result";
    public static final String ai = "ctype";
    public static final String aj = "adv_imp";
    public static final String ak = "t_imp";
    public static final String al = "sec";
    public static final String am = "url";
    public static final String an = "guidelines";
    public static final String ao = "offer_type";
    public static final String ap = "reward_amount";
    public static final String aq = "reward_name";
    public static final String ar = "md5_file";
    public static final String as = "c_toi";
    public static final int at = 2;
    public static final String au = "5";
    public static final String av = "rtins_type";
    public static final String aw = "ad_url_list";
    public static final String ax = "retarget_offer";
    public static final String ay = "flb";
    public static final String az = "flb_skiptime";

    /* renamed from: b, reason: collision with root package name */
    public static final String f9452b = "ad_tpl_url";
    public static final int bA = 9;
    public static final int bB = 12;
    public static final String bC = "video_end_type";
    public static final int bD = 1;
    public static final int bE = 2;
    public static final int bF = 3;
    public static final int bG = 4;
    public static final int bH = 5;
    public static final int bI = 100;
    public static final int bJ = 2;
    public static final String bL = "ready_rate";
    public static final String bM = "tmp_ids";
    public static final String bN = "ext_data";
    public static final String bO = "endcard_url";
    public static final String bP = "playable_ads_without_video";
    public static final int bQ = 1;
    public static final int bR = 2;
    public static final String bS = "impression";
    public static final String bT = "start";
    public static final String bU = "first_quartile";
    public static final String bV = "midpoint";
    public static final String bW = "third_quartile";
    public static final String bX = "complete";
    public static final String bY = "mute";
    public static final String bZ = "unmute";

    /* renamed from: ba, reason: collision with root package name */
    public static final String f9453ba = "iex";

    /* renamed from: bb, reason: collision with root package name */
    public static final String f9454bb = "ts";

    /* renamed from: bc, reason: collision with root package name */
    public static final String f9455bc = "nv_t2";

    /* renamed from: bd, reason: collision with root package name */
    public static final String f9456bd = "impression_t2";
    public static final String be = "gif_url";
    public static final String bf = "dropout_track";
    public static final String bg = "plycmpt_track";
    public static final String bh = "aks";
    public static final String bi = "k";
    public static final String bj = "q";
    public static final String bk = "r";
    public static final String bl = "al";
    public static final String bm = "mp";
    public static final String bn = "pv_urls";
    public static final int bo = 3;
    public static final int bp = 4;
    public static final int bq = 1;
    public static final int br = 2;
    public static final int bs = 3;
    public static final int bt = 1;
    public static final int bu = 2;
    public static final int bv = 1;
    public static final int bw = 2;
    public static final int bx = 3;
    public static final int by = 4;
    public static final int bz = 8;

    /* renamed from: c, reason: collision with root package name */
    public static final String f9457c = "ad_html";

    /* renamed from: ca, reason: collision with root package name */
    public static final String f9458ca = "click";

    /* renamed from: cb, reason: collision with root package name */
    public static final String f9459cb = "pause";

    /* renamed from: cc, reason: collision with root package name */
    public static final String f9460cc = "resume";

    /* renamed from: cd, reason: collision with root package name */
    public static final String f9461cd = "error";
    public static final String ce = "endcard";
    public static final String cf = "close";
    public static final String cg = "video_click";
    public static final String ch = "endcard_show";
    public static final String ci = "play_percentage";
    public static final String cj = "ad_tracking";
    public static final String ck = "rv";
    public static final int cl = -1;
    public static final int cm = 1;

    /* renamed from: cn, reason: collision with root package name */
    public static final int f9462cn = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final String f9463d = "cmpt=1";
    private static final long dP = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final String f9464e = "tp_offer";
    private static final int eS = 100;
    public static final String f = "fac";

    /* renamed from: g, reason: collision with root package name */
    public static final String f9465g = "at_cd_rate";

    /* renamed from: h, reason: collision with root package name */
    public static final String f9466h = "plct";

    /* renamed from: i, reason: collision with root package name */
    public static final String f9467i = "plctb";

    /* renamed from: j, reason: collision with root package name */
    public static final String f9468j = "banner_url";

    /* renamed from: k, reason: collision with root package name */
    public static final String f9469k = "banner_html";

    /* renamed from: l, reason: collision with root package name */
    public static final String f9470l = "creative_id";

    /* renamed from: m, reason: collision with root package name */
    public static final String f9471m = "mraid";

    /* renamed from: n, reason: collision with root package name */
    public static final String f9472n = "mraid_src";
    public static final String o = "timestamp";

    /* renamed from: p, reason: collision with root package name */
    public static final String f9473p = "hb";

    /* renamed from: q, reason: collision with root package name */
    public static final String f9474q = "maitve";

    /* renamed from: r, reason: collision with root package name */
    public static final String f9475r = "maitve_src";

    /* renamed from: s, reason: collision with root package name */
    public static final String f9476s = "vcn";

    /* renamed from: t, reason: collision with root package name */
    public static final String f9477t = "token_r";

    /* renamed from: u, reason: collision with root package name */
    public static final String f9478u = "encrypt_p";

    /* renamed from: v, reason: collision with root package name */
    public static final String f9479v = "view_com_time";

    /* renamed from: w, reason: collision with root package name */
    public static final String f9480w = "adspace_t";

    /* renamed from: x, reason: collision with root package name */
    public static final String f9481x = "cbd";
    public static final String y = "vst";

    /* renamed from: z, reason: collision with root package name */
    public static final int f9482z = -2;
    public p aH;
    private List<String> cZ;
    private String dA;
    private int dB;
    private String dC;
    private int dD;
    private int dE;
    private String dF;
    private String dG;
    private int dH;
    private String dI;
    private a dJ;
    private int dL;
    private String dM;
    private String dR;

    /* renamed from: da, reason: collision with root package name */
    private long f9483da;

    /* renamed from: dd, reason: collision with root package name */
    private int f9486dd;
    private boolean dl;
    private int du;
    private int dv;
    private int dw;
    private int dx;
    private int dy;
    private int dz;
    private int eA;
    private String eB;
    private int eC;
    private String eD;
    private HashMap<String, String> eE;
    private String eF;
    private String eG;
    private String eH;
    private String eI;
    private String eJ;
    private boolean eK;
    private String eM;
    private boolean eN;
    private boolean eO;
    private int eQ;
    private String eT;
    private String eV;
    private String eW;
    private int eX;
    private String eY;

    /* renamed from: eb, reason: collision with root package name */
    private int f9489eb;

    /* renamed from: ec, reason: collision with root package name */
    private int f9490ec;

    /* renamed from: ed, reason: collision with root package name */
    private int f9491ed;
    private String ee;
    private String ef;
    private String eg;
    private String eh;
    private int ei;
    private boolean ej;
    private boolean el;
    private int em;
    private int eo;
    private String ep;
    private int eq;
    private int er;
    private String es;
    private int et;
    private int eu;
    private int ev;
    private String ew;
    private int ex;
    private String ey;
    private String ez;
    private String fA;
    private int fC;

    /* renamed from: fb, reason: collision with root package name */
    private String f9493fb;

    /* renamed from: fd, reason: collision with root package name */
    private n f9495fd;
    private String fe;
    private String ff;
    private int fg;
    private long fh;
    private String fi;
    private String fj;
    private int fk;
    private String fl;
    private int fm;
    private b fn;
    private C0119c fo;
    private c.b fp;
    private int fs;
    private ArrayList<Integer> fu;
    private int cV = 1;
    private String cW = "";
    private String cX = "";
    private boolean cY = false;

    /* renamed from: db, reason: collision with root package name */
    private int f9484db = 0;

    /* renamed from: dc, reason: collision with root package name */
    private int f9485dc = 0;

    /* renamed from: de, reason: collision with root package name */
    private int f9487de = -2;
    private int df = -2;
    private long dg = 0;
    private long dh = 0;
    private String di = "";
    private String dj = "";
    private long dk = 0;
    private int dm = 0;
    private int dn = 0;

    /* renamed from: do, reason: not valid java name */
    private String f1do = "";
    private boolean dp = false;
    private int dq = 0;
    private boolean dr = false;
    private int ds = 0;
    private int dt = -1;
    private int dK = 0;
    private int dN = 1;
    private int dO = 1;
    private int dQ = 6;
    private int dS = -1;
    private String dT = "";
    private String dU = "";
    private String dV = "";
    private int dW = 0;
    private String dX = "";
    private boolean dY = false;
    private String dZ = "";

    /* renamed from: ea, reason: collision with root package name */
    private String f9488ea = "";
    private boolean ek = false;
    private String en = "";
    private String eL = "";
    private int eP = 2;
    public String bK = "";
    private int eR = -1;
    private int eU = 1;
    private int eZ = 0;

    /* renamed from: fa, reason: collision with root package name */
    private int f9492fa = 2;

    /* renamed from: fc, reason: collision with root package name */
    private int f9494fc = 1;
    private boolean fq = false;
    private String fr = null;
    private String ft = "";
    private int fv = 2;
    private int fw = 1;
    private int fx = -1;
    private boolean fy = false;
    private boolean fz = false;
    private int fB = 0;

    /* loaded from: classes.dex */
    public static final class a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public static final String f9496a = "ad_logo_link";

        /* renamed from: b, reason: collision with root package name */
        public static final String f9497b = "adchoice_link";

        /* renamed from: c, reason: collision with root package name */
        public static final String f9498c = "adchoice_icon";

        /* renamed from: d, reason: collision with root package name */
        public static final String f9499d = "adchoice_size";

        /* renamed from: e, reason: collision with root package name */
        public static final String f9500e = "platform_name";
        public static final String f = "platform_logo";

        /* renamed from: g, reason: collision with root package name */
        public static final String f9501g = "adv_name";

        /* renamed from: h, reason: collision with root package name */
        public static final String f9502h = "adv_logo";

        /* renamed from: i, reason: collision with root package name */
        private String f9503i = "";

        /* renamed from: j, reason: collision with root package name */
        private String f9504j = "";

        /* renamed from: k, reason: collision with root package name */
        private String f9505k = "";

        /* renamed from: l, reason: collision with root package name */
        private String f9506l = "";

        /* renamed from: m, reason: collision with root package name */
        private String f9507m = "";

        /* renamed from: n, reason: collision with root package name */
        private String f9508n = "";
        private String o = "";

        /* renamed from: p, reason: collision with root package name */
        private String f9509p = "";

        /* renamed from: q, reason: collision with root package name */
        private int f9510q = 0;

        /* renamed from: r, reason: collision with root package name */
        private int f9511r = 0;

        /* renamed from: s, reason: collision with root package name */
        private String f9512s = "";

        private void a(int i10) {
            this.f9510q = i10;
        }

        private void b(int i10) {
            this.f9511r = i10;
        }

        private void c(String str) {
            this.f9503i = str;
        }

        private void d(String str) {
            this.f9504j = str;
        }

        private int e() {
            return this.f9510q;
        }

        private int f() {
            return this.f9511r;
        }

        private String g() {
            return this.f9503i;
        }

        private String h() {
            return this.f9507m;
        }

        private String i() {
            return this.f9508n;
        }

        private String j() {
            return this.o;
        }

        private String k() {
            return this.f9509p;
        }

        private boolean l() {
            return (TextUtils.isEmpty(this.f9504j) || TextUtils.isEmpty(this.f9506l) || TextUtils.isEmpty(this.f9505k)) ? false : true;
        }

        private void b(String str) {
            this.f9512s = str;
        }

        private void e(String str) {
            this.f9505k = str;
        }

        private void f(String str) {
            this.f9506l = str;
        }

        private void g(String str) {
            this.f9507m = str;
        }

        private void h(String str) {
            this.f9508n = str;
        }

        private void i(String str) {
            this.o = str;
        }

        private void j(String str) {
            this.f9509p = str;
        }

        private static int k(String str) {
            String[] split;
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            try {
                if (str.contains("x") && (split = str.split("x")) != null && split.length > 1) {
                    return Integer.parseInt(split[1]);
                }
            } catch (NumberFormatException | Exception unused) {
            }
            return 0;
        }

        public final String a() {
            return this.f9512s;
        }

        public final String c() {
            return this.f9505k;
        }

        public final String d() {
            return this.f9506l;
        }

        public static a a(String str) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                return a(new JSONObject(str));
            } catch (Exception e10) {
                if (com.anythink.expressad.a.f6552a) {
                    e10.printStackTrace();
                }
                return null;
            } catch (Throwable th) {
                if (com.anythink.expressad.a.f6552a) {
                    th.printStackTrace();
                }
                return null;
            }
        }

        private static int l(String str) {
            String[] split;
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            try {
                if (str.contains("x") && (split = str.split("x")) != null && split.length > 0) {
                    return Integer.parseInt(split[0]);
                }
            } catch (NumberFormatException | Exception unused) {
            }
            return 0;
        }

        public final String b() {
            return this.f9504j;
        }

        private static a a(JSONObject jSONObject) {
            a aVar = null;
            try {
                a aVar2 = new a();
                try {
                    aVar2.f9505k = jSONObject.optString("adchoice_icon");
                    aVar2.f9504j = jSONObject.optString("adchoice_link");
                    String optString = jSONObject.optString("adchoice_size");
                    aVar2.f9506l = optString;
                    aVar2.f9503i = jSONObject.optString(f9496a);
                    aVar2.f9509p = jSONObject.optString(f9502h);
                    aVar2.o = jSONObject.optString(f9501g);
                    aVar2.f9508n = jSONObject.optString("platform_logo");
                    aVar2.f9507m = jSONObject.optString("platform_name");
                    aVar2.f9511r = k(optString);
                    aVar2.f9510q = l(optString);
                    aVar2.f9512s = jSONObject.toString();
                    return aVar2;
                } catch (Exception e10) {
                    e = e10;
                    aVar = aVar2;
                    if (com.anythink.expressad.a.f6552a) {
                        e.printStackTrace();
                    }
                    return aVar;
                } catch (Throwable th) {
                    th = th;
                    aVar = aVar2;
                    if (com.anythink.expressad.a.f6552a) {
                        th.printStackTrace();
                    }
                    return aVar;
                }
            } catch (Exception e11) {
                e = e11;
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public boolean f9513a = false;

        /* renamed from: b, reason: collision with root package name */
        public boolean f9514b = false;

        /* renamed from: c, reason: collision with root package name */
        public boolean f9515c = false;

        /* renamed from: d, reason: collision with root package name */
        public boolean f9516d = false;

        /* renamed from: e, reason: collision with root package name */
        public boolean f9517e = false;
        public boolean f = false;

        /* renamed from: g, reason: collision with root package name */
        public boolean f9518g = false;

        /* renamed from: h, reason: collision with root package name */
        public boolean f9519h = false;

        /* renamed from: i, reason: collision with root package name */
        public boolean f9520i = false;

        /* renamed from: j, reason: collision with root package name */
        public boolean f9521j = false;

        /* renamed from: k, reason: collision with root package name */
        public boolean f9522k = false;

        /* renamed from: l, reason: collision with root package name */
        public Map<Integer, String> f9523l;
    }

    /* renamed from: com.anythink.expressad.foundation.d.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0119c implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public static final String f9524a = "video_template";

        /* renamed from: b, reason: collision with root package name */
        public static final String f9525b = "template_url";

        /* renamed from: c, reason: collision with root package name */
        public static final String f9526c = "orientation";

        /* renamed from: d, reason: collision with root package name */
        public static final String f9527d = "paused_url";

        /* renamed from: e, reason: collision with root package name */
        public static final String f9528e = "image";
        private static final int f = 1;

        /* renamed from: g, reason: collision with root package name */
        private String f9529g;

        /* renamed from: h, reason: collision with root package name */
        private int f9530h;

        /* renamed from: i, reason: collision with root package name */
        private int f9531i;

        /* renamed from: j, reason: collision with root package name */
        private String f9532j;

        /* renamed from: k, reason: collision with root package name */
        private String f9533k;

        /* renamed from: l, reason: collision with root package name */
        private List<a> f9534l;

        /* renamed from: com.anythink.expressad.foundation.d.c$c$a */
        /* loaded from: classes.dex */
        public static final class a implements Serializable {

            /* renamed from: a, reason: collision with root package name */
            public String f9535a;

            /* renamed from: b, reason: collision with root package name */
            public List<String> f9536b = new ArrayList();
        }

        private C0119c(String str) {
            this.f9529g = str;
        }

        private void b(String str) {
            this.f9529g = str;
        }

        public final int c() {
            return this.f9531i;
        }

        public final String d() {
            return this.f9532j;
        }

        public final String e() {
            return this.f9533k;
        }

        public final List<a> f() {
            return this.f9534l;
        }

        private void c(String str) {
            this.f9532j = str;
        }

        private static C0119c d(String str) {
            try {
                if (w.b(str)) {
                    return a(new JSONObject(str));
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        public final String a() {
            return this.f9529g;
        }

        public final int b() {
            return this.f9530h;
        }

        private void a(int i10) {
            this.f9530h = i10;
        }

        private void b(int i10) {
            this.f9531i = i10;
        }

        public final void a(String str) {
            this.f9533k = x.c(str);
        }

        private void a(List<a> list) {
            this.f9534l = list;
        }

        public static C0119c a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            try {
                if (!w.b(jSONObject.toString())) {
                    return null;
                }
                C0119c c0119c = new C0119c(jSONObject.toString());
                c0119c.f9530h = jSONObject.optInt(f9524a, 1);
                c0119c.a(jSONObject.optString("template_url"));
                c0119c.f9531i = jSONObject.optInt("orientation");
                c0119c.f9532j = jSONObject.optString(f9527d);
                JSONObject optJSONObject = jSONObject.optJSONObject(f9528e);
                if (optJSONObject != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys != null && keys.hasNext()) {
                        String next = keys.next();
                        List<String> a10 = t.a(optJSONObject.optJSONArray(next));
                        if (a10 != null && a10.size() > 0) {
                            a aVar = new a();
                            aVar.f9535a = next;
                            aVar.f9536b.addAll(a10);
                            arrayList.add(aVar);
                        }
                    }
                    c0119c.f9534l = arrayList;
                }
                return c0119c;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    private void A(int i10) {
        this.dH = i10;
    }

    private void B(int i10) {
        this.dz = i10;
    }

    private void C(String str) {
        this.dM = str;
    }

    private void D(String str) {
        this.dI = str;
    }

    private void E(int i10) {
        this.dw = i10;
    }

    private void F(int i10) {
        this.dQ = i10;
    }

    private void G(String str) {
        this.eG = str;
    }

    private void H(String str) {
        this.eH = str;
    }

    private void I(String str) {
        this.eI = str;
    }

    private void J(String str) {
        this.eJ = str;
    }

    private void K(String str) {
        this.eL = str;
    }

    private void L(String str) {
        this.bK = str;
    }

    private void M(String str) {
        this.fe = str;
    }

    private void N(String str) {
        this.eD = str;
    }

    private void O(String str) {
        this.fi = str;
    }

    private void P(String str) {
        this.fj = str;
    }

    private void Q(String str) {
        this.ew = str;
    }

    private void R(String str) {
        this.eB = str;
    }

    private void S(String str) {
        this.es = str;
    }

    private void T(String str) {
        this.en = str;
    }

    private void V(int i10) {
        this.em = i10;
    }

    private void ak(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String[] split = str.split(",");
        if (split.length > 0) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (String str2 : split) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str2)));
            }
            this.fu = arrayList;
        }
    }

    private int bA() {
        return this.dD;
    }

    private int bB() {
        return this.dz;
    }

    private int bC() {
        return this.dw;
    }

    private int bD() {
        return this.dx;
    }

    private int bE() {
        return this.dy;
    }

    private int bF() {
        return this.ev;
    }

    private String bG() {
        return this.eF;
    }

    private String bH() {
        return this.eG;
    }

    private String bI() {
        return this.eH;
    }

    private String bJ() {
        return this.eI;
    }

    private String bK() {
        return this.eJ;
    }

    private String bL() {
        return this.bK;
    }

    private String bM() {
        return this.fe;
    }

    private String bN() {
        return this.eD;
    }

    private String bO() {
        return this.fi;
    }

    private String bP() {
        return this.fj;
    }

    private int bQ() {
        return this.fg;
    }

    private long bR() {
        return this.fh;
    }

    private b bS() {
        return this.fn;
    }

    private int bT() {
        return this.eC;
    }

    private String bU() {
        return this.ew;
    }

    private String bV() {
        return this.ey;
    }

    private int bW() {
        return this.eA;
    }

    private String bX() {
        return this.eB;
    }

    private int bY() {
        return this.er;
    }

    private String bZ() {
        return this.es;
    }

    private int bj() {
        return this.cV;
    }

    private String bk() {
        return this.f1do;
    }

    private int bl() {
        int i10 = this.dn;
        if (i10 == 1) {
            return i10;
        }
        return 0;
    }

    private int bm() {
        int i10 = this.dm;
        if (i10 > 0) {
            return i10;
        }
        return 1;
    }

    private void bn() {
        this.dp = true;
    }

    private long bo() {
        return this.dh;
    }

    private p bp() {
        return this.aH;
    }

    private int bq() {
        return this.dK;
    }

    private int br() {
        return this.dL;
    }

    private String bs() {
        return this.dM;
    }

    private String bt() {
        return this.dI;
    }

    private int bu() {
        return this.dH;
    }

    private String bv() {
        return this.dF;
    }

    private String bw() {
        return this.dG;
    }

    private String bx() {
        return this.dA;
    }

    private int by() {
        return this.dB;
    }

    private String bz() {
        return this.dC;
    }

    private int ca() {
        return this.et;
    }

    private int cb() {
        return this.eq;
    }

    private int cc() {
        return this.em;
    }

    private boolean cd() {
        return this.ek;
    }

    private int ce() {
        return this.ei;
    }

    private int cf() {
        return this.f9490ec;
    }

    private int cg() {
        return this.f9491ed;
    }

    private int ch() {
        return this.dS;
    }

    private boolean ci() {
        return this.dY;
    }

    private int cj() {
        return this.f9489eb;
    }

    private String ck() {
        return this.f9488ea;
    }

    private String cl() {
        return this.eT;
    }

    private String cm() {
        return this.eY;
    }

    private int cn() {
        return this.fk;
    }

    private String co() {
        return this.fl;
    }

    private String cp() {
        return this.fr;
    }

    private String cq() {
        return this.ft;
    }

    private long cr() {
        return this.f9483da;
    }

    private String cs() {
        ArrayList<Integer> arrayList = this.fu;
        if (arrayList != null && arrayList.size() > 0) {
            StringBuilder sb2 = new StringBuilder();
            try {
                Iterator<Integer> it = this.fu.iterator();
                while (it.hasNext()) {
                    sb2.append(it.next());
                    sb2.append(",");
                }
                if (sb2.length() > 0) {
                    sb2.delete(sb2.length() - 1, sb2.length());
                }
                if (!TextUtils.isEmpty(sb2)) {
                    return sb2.toString();
                }
                return "";
            } catch (Throwable th) {
                com.anythink.expressad.foundation.h.o.d(f9447a, th.getMessage());
                return "";
            }
        }
        return "";
    }

    private int ct() {
        return this.fv;
    }

    private int cu() {
        return this.fx;
    }

    private boolean cv() {
        return this.fz;
    }

    private int cw() {
        return this.fC;
    }

    private void r(int i10) {
        this.f9484db = i10;
    }

    private void s(int i10) {
        this.f9485dc = i10;
    }

    private void t(int i10) {
        this.f9486dd = i10;
    }

    private void u(int i10) {
        this.f9487de = i10;
    }

    private void v(int i10) {
        this.dq = t.a(i10);
    }

    private void w(int i10) {
        this.du = i10;
    }

    private void x(int i10) {
        this.dv = i10;
    }

    private void y(int i10) {
        this.dK = i10;
    }

    private void z(int i10) {
        this.dL = i10;
    }

    public final String U() {
        return this.ep;
    }

    public final boolean W() {
        return this.el;
    }

    public final void X() {
        this.el = true;
    }

    public final int Y() {
        return this.f9492fa;
    }

    public final String Z() {
        try {
            if (!TextUtils.isEmpty(this.eg)) {
                return this.eg;
            }
            if (TextUtils.isEmpty(this.dZ)) {
                return null;
            }
            Uri parse = Uri.parse(this.dZ);
            if (parse != null) {
                this.eg = parse.getQueryParameter("k");
            }
            return this.eg;
        } catch (Exception unused) {
            return null;
        }
    }

    public final int a() {
        return this.f9484db;
    }

    public final boolean aA() {
        return super.b(this);
    }

    public final ArrayList<Integer> aB() {
        return this.fu;
    }

    public final int aC() {
        return this.fw;
    }

    public final boolean aD() {
        return this.fy;
    }

    public final String aE() {
        return this.fA;
    }

    public final int aF() {
        return this.fB;
    }

    public final String aa() {
        try {
            if (!TextUtils.isEmpty(this.eh)) {
                return this.eh;
            }
            if (TextUtils.isEmpty(this.dU)) {
                return "";
            }
            Uri parse = Uri.parse(this.dU);
            if (parse != null) {
                this.eh = parse.getQueryParameter("k");
            }
            return this.eh;
        } catch (Exception unused) {
            return "";
        }
    }

    public final String ab() {
        return this.ee;
    }

    public final String ac() {
        return this.ef;
    }

    public final String ad() {
        return this.dV;
    }

    public final int ae() {
        return this.dW;
    }

    public final String af() {
        return this.dX;
    }

    public final String ag() {
        return this.dT;
    }

    public final String ah() {
        return this.dU;
    }

    public final String ai() {
        return this.dZ;
    }

    @Override // com.anythink.expressad.foundation.d.h
    public final c.b aj() {
        return this.fp;
    }

    public final List<String> al() {
        Exception e10;
        ArrayList arrayList;
        String str = this.eD;
        try {
        } catch (Exception e11) {
            e10 = e11;
            arrayList = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONArray jSONArray = new JSONArray(str);
        arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                arrayList.add(jSONArray.optString(i10));
            } catch (Exception e12) {
                e10 = e12;
                e10.printStackTrace();
                return arrayList;
            }
        }
        return arrayList;
    }

    public final boolean am() {
        return this.eO;
    }

    public final void an() {
        this.eO = true;
    }

    public final int ao() {
        return this.eR;
    }

    public final int ap() {
        return this.eU;
    }

    public final String aq() {
        return this.eV;
    }

    public final String ar() {
        return this.eW;
    }

    public final int as() {
        return this.eX;
    }

    public final boolean at() {
        return this.cY;
    }

    public final void au() {
        this.cY = true;
    }

    public final int av() {
        return this.eZ;
    }

    public final boolean aw() {
        return this.fq;
    }

    public final void ax() {
        this.fq = true;
    }

    public final boolean ay() {
        if (!TextUtils.isEmpty(this.fr) && !TextUtils.isEmpty(com.anythink.expressad.a.f6576w)) {
            return true;
        }
        return false;
    }

    public final int az() {
        return this.fs;
    }

    public final int b() {
        return this.f9485dc;
    }

    public final String c() {
        return this.cW;
    }

    public final String d() {
        return this.cX;
    }

    public final List<String> e() {
        return this.cZ;
    }

    public final int f() {
        return this.f9486dd;
    }

    public final int g() {
        return this.f9487de;
    }

    public final int h() {
        return this.df;
    }

    public final int i() {
        return this.ds;
    }

    public final boolean j() {
        return this.dp;
    }

    public final int k() {
        return this.dq;
    }

    public final boolean l() {
        return this.dr;
    }

    public final void m() {
        this.dr = true;
    }

    public final int n() {
        return this.dt;
    }

    public final long o() {
        return this.dg;
    }

    public final String p() {
        return this.di;
    }

    public final String q() {
        return this.dj;
    }

    private void C(int i10) {
        this.dx = i10;
    }

    private void D(int i10) {
        this.dy = i10;
    }

    private void E(String str) {
        this.dR = str;
    }

    private void F(String str) {
        this.eF = str;
    }

    private void G(int i10) {
        this.eQ = i10;
    }

    private void H(int i10) {
        this.dN = i10;
    }

    private void I(int i10) {
        this.dO = i10;
    }

    private void J(int i10) {
        this.eP = i10;
    }

    private void K(int i10) {
        this.f9494fc = i10;
    }

    private void R(int i10) {
        this.er = i10;
    }

    private void S(int i10) {
        this.et = i10;
    }

    private void U(String str) {
        this.ep = str;
    }

    private void W(int i10) {
        this.ei = i10;
    }

    private void X(int i10) {
        this.f9492fa = i10;
    }

    private void Y(String str) {
        this.ef = str;
    }

    private void ab(int i10) {
        this.dW = i10;
    }

    private void ac(int i10) {
        this.f9489eb = i10;
    }

    private static n ad(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                n nVar = new n();
                nVar.r(a(jSONObject.optJSONArray("impression")));
                nVar.g(a(jSONObject.optJSONArray("start")));
                nVar.h(a(jSONObject.optJSONArray(bU)));
                nVar.i(a(jSONObject.optJSONArray("midpoint")));
                nVar.j(a(jSONObject.optJSONArray(bW)));
                nVar.k(a(jSONObject.optJSONArray("complete")));
                nVar.a(b(jSONObject.optJSONArray(ci)));
                nVar.l(a(jSONObject.optJSONArray("mute")));
                nVar.m(a(jSONObject.optJSONArray("unmute")));
                nVar.n(a(jSONObject.optJSONArray("click")));
                nVar.o(a(jSONObject.optJSONArray(f9459cb)));
                nVar.p(a(jSONObject.optJSONArray("resume")));
                nVar.q(a(jSONObject.optJSONArray("error")));
                nVar.s(a(jSONObject.optJSONArray(ce)));
                nVar.u(a(jSONObject.optJSONArray("close")));
                nVar.t(a(jSONObject.optJSONArray(ch)));
                nVar.v(a(jSONObject.optJSONArray("video_click")));
                nVar.f(a(jSONObject.optJSONArray(f9456bd)));
                nVar.d(a(jSONObject.optJSONArray(bf)));
                nVar.e(a(jSONObject.optJSONArray(bg)));
                nVar.a(a(jSONObject.optJSONArray(h.cK)));
                nVar.b(a(jSONObject.optJSONArray(h.cL)));
                nVar.c(a(jSONObject.optJSONArray(h.cM)));
                return nVar;
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    private static Map<Integer, String> ae(String str) {
        HashMap hashMap = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 0) {
                return null;
            }
            HashMap hashMap2 = new HashMap();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                    int optInt = optJSONObject.optInt(al);
                    hashMap2.put(Integer.valueOf(optInt), optJSONObject.optString("url"));
                } catch (Exception e10) {
                    e = e10;
                    hashMap = hashMap2;
                    e.printStackTrace();
                    return hashMap;
                }
            }
            return hashMap2;
        } catch (Exception e11) {
            e = e11;
        }
    }

    private void af(String str) {
        this.eT = str;
    }

    private void ag(String str) {
        this.eW = str;
    }

    private void ah(String str) {
        this.fl = str;
    }

    private void ai(String str) {
        this.fr = str;
    }

    private void aj(String str) {
        this.ft = str;
    }

    public final boolean A() {
        return this.eK;
    }

    public final String B() {
        return this.eL;
    }

    public final n L() {
        return this.f9495fd;
    }

    public final C0119c M() {
        return this.fo;
    }

    public final int N() {
        return this.fm;
    }

    public final int O() {
        return this.ex;
    }

    public final String P() {
        return this.ez;
    }

    public final int Q() {
        return this.eu;
    }

    public final int T() {
        return this.eo;
    }

    public final boolean V() {
        return this.ej;
    }

    public final void a(String str) {
        this.cW = str;
        boolean e10 = t.e(str);
        int g6 = t.g(str);
        if (e10) {
            this.dp = true;
            v(g6);
        }
    }

    public final void b(String str) {
        this.cX = str;
    }

    public final void c(String str) {
        this.f1do = str;
    }

    public final void d(int i10) {
        this.dm = i10;
    }

    public final void e(int i10) {
        this.dt = i10;
    }

    public final void f(int i10) {
        this.dE = i10;
    }

    public final void g(String str) {
        this.dG = str;
    }

    public final void h(String str) {
        this.dA = str;
    }

    public final void i(String str) {
        this.dC = str;
    }

    public final void j(String str) {
        this.eM = str;
    }

    public final void k(String str) {
        C0119c c0119c;
        this.f9493fb = str;
        if (TextUtils.isEmpty(this.eV) && (((c0119c = this.fo) == null || TextUtils.isEmpty(c0119c.f9533k)) && !TextUtils.isEmpty(str) && str.contains(f9463d))) {
            this.eW = str;
        }
        this.fz = t.d(str);
    }

    public final void l(String str) {
        this.ff = str;
    }

    public final void m(String str) {
        this.ey = str;
    }

    public final void n(String str) {
        this.ez = x.c(str);
    }

    @Override // com.anythink.expressad.out.j
    public final void o(String str) {
        if (TextUtils.isEmpty(str)) {
            str = this.eu != 2 ? "Learn more" : "Install";
        }
        super.o(str);
    }

    public final void p(String str) {
        this.dV = str;
    }

    public final void q(String str) {
        this.dU = str;
    }

    public final long r() {
        return this.dk;
    }

    public final boolean s() {
        return this.dl;
    }

    public final int t() {
        return this.du;
    }

    public final int u() {
        return this.dv;
    }

    public final a v() {
        return this.dJ;
    }

    public final int w() {
        return this.dE;
    }

    public final int x() {
        return this.dQ;
    }

    public final String y() {
        return this.dR;
    }

    public final HashMap<String, String> z() {
        return this.eE;
    }

    private void L(int i10) {
        this.fg = i10;
    }

    private void M(int i10) {
        this.fm = i10;
    }

    private void N(int i10) {
        this.eC = i10;
    }

    private void O(int i10) {
        this.ex = i10;
    }

    private void P(int i10) {
        this.eA = i10;
    }

    private void Q(int i10) {
        this.eu = i10;
    }

    private void T(int i10) {
        this.eo = i10;
    }

    private void U(int i10) {
        this.eq = i10;
    }

    private void V(String str) {
        this.eg = str;
    }

    private void W(String str) {
        this.eh = str;
    }

    private void X(String str) {
        this.ee = str;
    }

    private void Y(int i10) {
        this.f9490ec = i10;
    }

    private void ab(String str) {
        this.dZ = str;
    }

    private void ac(String str) {
        this.f9488ea = str;
    }

    private void af(int i10) {
        this.fk = i10;
    }

    private void ag(int i10) {
        if (i10 <= 2 && i10 > 0) {
            this.fv = i10;
        } else {
            this.fv = 2;
        }
    }

    private void ah(int i10) {
        if (i10 <= 2 && i10 > 0) {
            this.fw = i10;
        } else {
            this.fw = 1;
        }
    }

    private void ai(int i10) {
        this.fx = i10;
    }

    private void aj(int i10) {
        this.fC = i10;
    }

    public final int C() {
        return this.eQ;
    }

    public final int D() {
        return this.dN;
    }

    public final int E() {
        return this.dO;
    }

    public final int F() {
        return this.eP;
    }

    public final String G() {
        return this.eM;
    }

    public final boolean H() {
        return this.eN;
    }

    public final String I() {
        if (!TextUtils.isEmpty(this.f9493fb)) {
            return a3.l.p(new StringBuilder(), this.f9493fb, "&n_logo=0");
        }
        return this.f9493fb;
    }

    public final int J() {
        return this.f9494fc;
    }

    public final String K() {
        return this.ff;
    }

    public final Map<Integer, String> R() {
        return ae(this.es);
    }

    public final String S() {
        return this.en;
    }

    public final void b(int i10) {
        this.ds = i10;
    }

    public final void c(int i10) {
        this.dn = i10;
    }

    public final void d(String str) {
        this.di = x.c(str);
    }

    public final void e(String str) {
        this.dj = str;
    }

    public final void f(String str) {
        this.dF = str;
    }

    public final void g(int i10) {
        this.dB = i10;
    }

    public final void h(int i10) {
        this.dD = i10;
    }

    public final void i(int i10) {
        this.ev = i10;
    }

    public final void j(int i10) {
        this.eU = i10;
    }

    public final void l(int i10) {
        this.eZ = i10;
    }

    public final void m(int i10) {
        this.fs = i10;
    }

    public final void n(int i10) {
        this.fB = i10;
    }

    public final void r(String str) {
        this.eV = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.eW = str;
        boolean e10 = t.e(str);
        int g6 = t.g(str);
        if (e10) {
            this.dp = true;
            v(g6);
        }
        this.fy = t.d(str);
    }

    public final void s(String str) {
        this.eY = str;
    }

    public final void t(String str) {
        this.fA = str;
    }

    private void b(long j10) {
        this.dg = j10;
    }

    private void c(long j10) {
        this.dh = j10;
    }

    private void d(long j10) {
        this.dk = j10;
    }

    private void e(long j10) {
        this.fh = j10;
    }

    private void f(boolean z10) {
        this.dY = z10;
    }

    private void g(long j10) {
        this.f9483da = j10;
    }

    private void h(boolean z10) {
        this.fz = z10;
    }

    private void d(boolean z10) {
        this.eK = z10;
    }

    private void e(boolean z10) {
        this.ek = z10;
    }

    private boolean f(long j10) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.dg > 0) {
            return (this.dg * 1000) + bg() >= currentTimeMillis;
        }
        return bg() + j10 >= currentTimeMillis;
    }

    private void g(boolean z10) {
        this.fy = z10;
    }

    public final void b(boolean z10) {
        this.eN = z10;
    }

    public final void c(boolean z10) {
        this.ej = z10;
    }

    public static c b(JSONObject jSONObject) {
        c cVar;
        ArrayList arrayList;
        c cVar2 = null;
        if (jSONObject != null) {
            try {
                cVar = new c();
            } catch (Exception e10) {
                e = e10;
            }
            try {
                cVar.v(jSONObject.optString("id"));
                cVar.x(jSONObject.optString("title"));
                cVar.y(jSONObject.optString("desc"));
                cVar.w(jSONObject.optString("package_name"));
                cVar.ev = jSONObject.optInt(av);
                cVar.z(jSONObject.optString("icon_url"));
                cVar.A(jSONObject.optString("image_url"));
                cVar.B(jSONObject.optString(K));
                cVar.f9488ea = jSONObject.optString(J);
                cVar.dT = jSONObject.optString(L);
                cVar.dV = jSONObject.optString("click_url");
                cVar.aH = p.a(jSONObject.optString(aF));
                cVar.dW = jSONObject.optInt(N);
                cVar.dX = jSONObject.optString(O);
                cVar.dY = jSONObject.optBoolean(P, false);
                cVar.dU = jSONObject.optString("notice_url");
                cVar.f9489eb = jSONObject.optInt("template");
                cVar.p(jSONObject.optInt("ad_source_id", 1));
                cVar.f9490ec = jSONObject.optInt(T);
                cVar.f9491ed = jSONObject.optInt(U);
                cVar.eQ = jSONObject.optInt(ah);
                if (!TextUtils.isEmpty(jSONObject.optString(Y))) {
                    cVar.a(Double.parseDouble(jSONObject.optString(Y, "0")));
                }
                if (!TextUtils.isEmpty(jSONObject.optString(Z))) {
                    cVar.o(jSONObject.optInt(Z, 333333));
                }
                cVar.ee = jSONObject.optString("click_mode");
                cVar.ef = jSONObject.optString("landing_type");
                cVar.eu = jSONObject.optInt("link_type", 4);
                cVar.ei = jSONObject.optInt(f9449ab);
                cVar.o(jSONObject.optString(f9448aa));
                cVar.eD = jSONObject.optString(aw);
                cVar.fm = jSONObject.optInt(ax, 2);
                cVar.en = jSONObject.optString("video_url");
                cVar.q(jSONObject.optInt("video_length"));
                cVar.eo = jSONObject.optInt("video_size");
                cVar.ep = jSONObject.optString(af);
                cVar.eq = jSONObject.optInt(ag);
                cVar.a(System.currentTimeMillis());
                cVar.er = jSONObject.optInt("ctype");
                cVar.es = jSONObject.optString(aj);
                cVar.et = jSONObject.optInt(ak);
                cVar.ey = jSONObject.optString(d.f);
                cVar.n(jSONObject.optString(d.f9546k));
                cVar.ew = jSONObject.optString(an);
                cVar.ex = jSONObject.optInt("offer_type");
                cVar.eB = jSONObject.optString("reward_name");
                cVar.eA = jSONObject.optInt("reward_amount");
                try {
                    String optString = jSONObject.optString(cj);
                    if (!TextUtils.isEmpty(optString)) {
                        cVar.fe = optString;
                        cVar.f9495fd = ad(optString);
                    }
                } catch (Exception unused) {
                }
                try {
                    cVar.eR = jSONObject.optInt("ready_rate", -1);
                    JSONObject optJSONObject = jSONObject.optJSONObject(bN);
                    if (optJSONObject != null) {
                        cVar.eT = optJSONObject.toString();
                    }
                    cVar.eX = jSONObject.optInt(d.G);
                    cVar.r(jSONObject.optString(d.F));
                    cVar.eU = jSONObject.optInt(d.E);
                    new JSONArray();
                    JSONArray optJSONArray = jSONObject.optJSONArray("pv_urls");
                    if (optJSONArray == null || optJSONArray.length() <= 0) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(optJSONArray.length());
                        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                            arrayList.add(optJSONArray.optString(i10));
                        }
                    }
                    cVar.cZ = arrayList;
                    JSONObject optJSONObject2 = jSONObject.optJSONObject(d.H);
                    if (optJSONObject2 != null) {
                        cVar.eY = optJSONObject2.toString();
                    }
                } catch (Exception unused2) {
                }
                cVar.eP = jSONObject.optInt(bC, 2);
                if (a(cVar, jSONObject.optString("endcard_url"))) {
                    return null;
                }
                cVar.f9494fc = jSONObject.optInt(bP, 1);
                if (jSONObject.has(ar)) {
                    cVar.bK = jSONObject.optString(ar);
                }
                if (jSONObject.has(f9455bc)) {
                    cVar.dQ = jSONObject.optInt(f9455bc);
                }
                if (jSONObject.has(be)) {
                    cVar.dR = jSONObject.optString(be);
                }
                cVar.a(C0119c.a(jSONObject.optJSONObject(ck)));
                cVar.f9492fa = jSONObject.optInt(as, 2);
                cVar.dN = jSONObject.optInt(aW, 1);
                cVar.dO = jSONObject.optInt(aX, 1);
                cVar.dw = jSONObject.optInt(aG);
                cVar.dA = jSONObject.optString("ia_icon");
                cVar.dB = jSONObject.optInt("ia_rst");
                cVar.dC = jSONObject.optString("ia_url");
                cVar.dD = jSONObject.optInt("ia_ori");
                cVar.dE = jSONObject.optInt("ad_type");
                cVar.f9484db = jSONObject.optInt(f9464e);
                cVar.f9485dc = jSONObject.optInt(f);
                cVar.dF = jSONObject.optString(aS);
                cVar.dG = jSONObject.optString(aT);
                cVar.dH = jSONObject.optInt(aU);
                cVar.dI = jSONObject.optString(aV);
                cVar.dL = jSONObject.optInt(aJ);
                cVar.dK = jSONObject.optInt(aI);
                cVar.dM = jSONObject.optString(aK);
                cVar.dJ = a.a(jSONObject.optString(aL, ""));
                cVar.dg = jSONObject.optLong("plct");
                cVar.dh = jSONObject.optLong("plctb");
                JSONArray optJSONArray2 = jSONObject.optJSONArray(aM);
                if (optJSONArray2 == null) {
                    if (!TextUtils.isEmpty(jSONObject.optString(aM))) {
                        cVar.fr = jSONObject.optString(aM);
                    } else {
                        cVar.fr = null;
                    }
                } else {
                    cVar.fr = optJSONArray2.toString();
                }
                cVar.dk = jSONObject.optInt("creative_id");
                String optString2 = jSONObject.optString("cam_tpl_url");
                Uri parse = Uri.parse(optString2);
                if (!TextUtils.isEmpty(parse.getPath()) && (parse.getPath().endsWith(".zip") || parse.getPath().endsWith(".ZIP"))) {
                    cVar.a(optString2);
                } else {
                    cVar.d(optString2);
                }
                cVar.dj = jSONObject.optString("cam_html");
                cVar.cX = jSONObject.optString("cam_html");
                cVar.ff = jSONObject.optString("unitId");
                String optString3 = jSONObject.optString(f9471m);
                if (TextUtils.isEmpty(optString3)) {
                    optString3 = jSONObject.optString(f9472n);
                }
                if (!TextUtils.isEmpty(optString3)) {
                    cVar.eN = true;
                    cVar.eM = optString3;
                } else if (!TextUtils.isEmpty(cVar.cX) && !cVar.cX.contains("<MBTPLMARK>")) {
                    cVar.eN = true;
                } else {
                    cVar.eN = false;
                }
                try {
                    String optString4 = jSONObject.optString(d.f9542g);
                    if (!TextUtils.isEmpty(optString4)) {
                        cVar.dZ = optString4;
                        Uri parse2 = Uri.parse(optString4);
                        if (parse2 != null) {
                            cVar.eg = parse2.getQueryParameter("k");
                        }
                    }
                    String optString5 = jSONObject.optString("notice_url");
                    if (!TextUtils.isEmpty(optString5)) {
                        cVar.dU = optString5;
                        Uri parse3 = Uri.parse(optString5);
                        if (parse3 != null) {
                            cVar.eh = parse3.getQueryParameter("k");
                        }
                    }
                } catch (Exception unused3) {
                }
                cVar.eK = jSONObject.optBoolean("hb", false);
                cVar.fk = jSONObject.optInt(f9474q);
                cVar.fl = jSONObject.optString(f9475r);
                cVar.du = jSONObject.optInt(ay);
                cVar.dv = jSONObject.optInt(az);
                cVar.f9487de = jSONObject.optInt(f9481x, -2);
                cVar.df = jSONObject.optInt(y, -2);
                cVar.f9486dd = jSONObject.optInt("adspace_t", 1);
                cVar2 = h.a(jSONObject, cVar);
                cVar2.dm = jSONObject.optInt("vcn");
                cVar2.dn = jSONObject.optInt("token_r");
                cVar2.f1do = jSONObject.optString("encrypt_p");
                cVar2.ds = jSONObject.optInt(f9479v);
                cVar2.ag(jSONObject.optInt(aB, 2));
                cVar2.ah(jSONObject.optInt(aA, 1));
                JSONArray optJSONArray3 = jSONObject.optJSONArray(aC);
                if (optJSONArray3 != null && optJSONArray3.length() > 0) {
                    ArrayList<Integer> arrayList2 = new ArrayList<>();
                    for (int i11 = 0; i11 < optJSONArray3.length(); i11++) {
                        arrayList2.add(Integer.valueOf(optJSONArray3.optInt(i11)));
                    }
                    if (arrayList2.size() > 0) {
                        cVar2.fu = arrayList2;
                    }
                }
                cVar2.fC = jSONObject.optInt(f9465g, 0);
                return cVar2;
            } catch (Exception e11) {
                e = e11;
                cVar2 = cVar;
                e.printStackTrace();
                return cVar2;
            }
        }
        return cVar2;
    }

    private static JSONObject c(JSONObject jSONObject) {
        JSONArray optJSONArray;
        try {
            if (!jSONObject.has(bM) || (optJSONArray = jSONObject.optJSONArray(bM)) == null || optJSONArray.length() <= 0) {
                return jSONObject;
            }
            jSONObject.remove(bM);
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                JSONObject a10 = com.anythink.expressad.foundation.c.a.a.a().a(optJSONArray.getString(i10));
                if (a10 != null) {
                    Iterator<String> keys = a10.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.put(next, a10.opt(next));
                    }
                }
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void a(List<String> list) {
        this.cZ = list;
    }

    public final void k(int i10) {
        this.eX = i10;
    }

    private void Z(int i10) {
        this.f9491ed = i10;
    }

    private void aa(int i10) {
        this.dS = i10;
    }

    public final void a(int i10) {
        this.df = i10;
    }

    public final String ak() {
        if (!TextUtils.isEmpty(this.dU)) {
            try {
                URL url = new URL(this.dU);
                return url.getProtocol() + "://" + url.getHost();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return "";
    }

    private void Z(String str) {
        this.dX = str;
    }

    private void aa(String str) {
        this.dT = str;
    }

    public final void a(boolean z10) {
        this.dl = z10;
    }

    private void a(a aVar) {
        this.dJ = aVar;
    }

    private void a(p pVar) {
        this.aH = pVar;
    }

    private void a(HashMap<String, String> hashMap) {
        this.eE = hashMap;
    }

    private void ae(int i10) {
        this.cV = i10;
    }

    private void a(n nVar) {
        this.f9495fd = nVar;
    }

    private void a(b bVar) {
        this.fn = bVar;
    }

    private void a(C0119c c0119c) {
        this.fo = c0119c;
        if (c0119c == null || TextUtils.isEmpty(c0119c.e())) {
            return;
        }
        if (TextUtils.isEmpty(this.eV) && c0119c.e().contains(f9463d)) {
            this.eW = c0119c.e();
        }
        boolean e10 = t.e(c0119c.e());
        int g6 = t.g(c0119c.e());
        if (e10) {
            this.dp = true;
            v(g6);
        }
    }

    @Override // com.anythink.expressad.foundation.d.h
    public final void a(c.b bVar) {
        this.fp = bVar;
    }

    public static c a(JSONObject jSONObject) {
        c cVar = new c();
        cVar.v(jSONObject.optString("campaignid"));
        cVar.w(jSONObject.optString(AppDownloadRecord.PACKAGE_NAME));
        cVar.x(jSONObject.optString("title"));
        cVar.o(jSONObject.optString(a.C0052a.f3676k));
        cVar.y(jSONObject.optString("desc"));
        cVar.dT = jSONObject.optString(L);
        cVar.A(jSONObject.optString("image_url"));
        cVar.dg = jSONObject.optLong("plct");
        cVar.dh = jSONObject.optLong("plctb");
        cVar.cX = jSONObject.optString(f9457c);
        cVar.a(jSONObject.optString(f9452b));
        cVar.d(jSONObject.optString(f9468j));
        cVar.dj = jSONObject.optString(f9469k);
        cVar.dk = jSONObject.optInt("creative_id");
        return cVar;
    }

    private static boolean a(c cVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (com.anythink.expressad.foundation.b.a.b().h() == 2 && "1".equals(Uri.parse(str).getQueryParameter("dpwgl"))) {
            return true;
        }
        cVar.k(str);
        return false;
    }

    private static c a(JSONObject jSONObject, String str, String str2, String str3, boolean z10, d dVar) {
        return a(jSONObject, str, str2, str3, z10, dVar, "");
    }

    private void ad(int i10) {
        this.eR = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v57, types: [com.anythink.expressad.out.j, com.anythink.expressad.foundation.d.c] */
    public static c a(JSONObject jSONObject, String str, String str2, String str3, boolean z10, d dVar, String str4) {
        c cVar;
        ArrayList arrayList;
        JSONObject c10 = c(jSONObject);
        if (c10 == null) {
            return null;
        }
        try {
            c cVar2 = new c();
            try {
                String optString = c10.optString(bh);
                if (!TextUtils.isEmpty(optString)) {
                    JSONObject jSONObject2 = new JSONObject(optString);
                    HashMap<String, String> hashMap = new HashMap<>();
                    for (Iterator<String> keys = jSONObject2.keys(); keys != null && keys.hasNext(); keys = keys) {
                        String next = keys.next();
                        hashMap.put(next, jSONObject2.optString(next));
                    }
                    cVar2.eE = hashMap;
                }
                if (!TextUtils.isEmpty(str4)) {
                    cVar2.eL = str4;
                    cVar2.eK = true;
                }
                try {
                    cVar2.eR = c10.optInt("ready_rate", -1);
                    JSONObject optJSONObject = c10.optJSONObject(bN);
                    if (optJSONObject != null) {
                        cVar2.eT = optJSONObject.toString();
                    }
                    cVar2.eX = c10.optInt(d.G);
                    cVar2.r(c10.optString(d.F));
                    cVar2.eU = c10.optInt(d.E);
                    new JSONArray();
                    JSONArray optJSONArray = c10.optJSONArray("pv_urls");
                    if (optJSONArray == null || optJSONArray.length() <= 0) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(optJSONArray.length());
                        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                            arrayList.add(optJSONArray.optString(i10));
                        }
                    }
                    cVar2.cZ = arrayList;
                    JSONObject optJSONObject2 = c10.optJSONObject(d.H);
                    if (optJSONObject2 != null) {
                        cVar2.eY = optJSONObject2.toString();
                    }
                } catch (Exception unused) {
                }
                cVar2.v(c10.optString("id"));
                cVar2.x(c10.optString("title"));
                cVar2.ff = c10.optString("unitId", "");
                cVar2.y(c10.optString("desc"));
                cVar2.w(c10.optString("package_name"));
                cVar2.ev = c10.optInt(av);
                cVar2.z(c10.optString("icon_url"));
                cVar2.A(c10.optString("image_url"));
                cVar2.B(c10.optString(K));
                cVar2.f9488ea = c10.optString(J);
                cVar2.dT = h.a(dVar, cVar2, c10.optString(L));
                cVar2.dV = h.a(dVar, cVar2, c10.optString("click_url"));
                cVar2.aH = p.a(c10.optString(aF));
                cVar2.dW = c10.optInt(N);
                cVar2.dX = h.a(dVar, cVar2, c10.optString(O));
                cVar2.dY = c10.optBoolean(P, false);
                cVar2.dU = h.a(dVar, cVar2, c10.optString("notice_url"));
                cVar2.f9489eb = c10.optInt("template");
                cVar2.p(c10.optInt("ad_source_id", 1));
                cVar2.f9490ec = c10.optInt(T);
                cVar2.f9491ed = c10.optInt(U);
                cVar2.eQ = c10.optInt(ah);
                if (!TextUtils.isEmpty(c10.optString(Y))) {
                    cVar2.a(Double.parseDouble(c10.optString(Y, "0")));
                }
                if (!TextUtils.isEmpty(c10.optString(Z))) {
                    cVar2.o(c10.optInt(Z, 333333));
                }
                cVar2.ee = c10.optString("click_mode");
                cVar2.ef = c10.optString("landing_type");
                cVar2.eu = c10.optInt("link_type", 4);
                cVar2.ei = c10.optInt(f9449ab);
                cVar2.o(c10.optString(f9448aa));
                cVar2.eD = c10.optString(aw);
                cVar2.fm = c10.optInt(ax, 2);
                String optString2 = c10.optString("video_url");
                cVar = TextUtils.isEmpty(optString2);
                if (cVar == 0) {
                    if (z10) {
                        cVar2.en = optString2;
                    } else {
                        cVar2.en = com.anythink.expressad.foundation.h.j.b(optString2);
                    }
                }
                cVar2.ds = c10.optInt(f9479v);
                cVar2.q(c10.optInt("video_length"));
                cVar2.eo = c10.optInt("video_size");
                cVar2.ep = c10.optString(af);
                cVar2.eq = c10.optInt(ag);
                cVar2.a(System.currentTimeMillis());
                cVar2.dZ = h.a(dVar, cVar2, str);
                cVar2.er = c10.optInt("ctype");
                cVar2.es = c10.optString(aj);
                cVar2.et = c10.optInt(ak);
                cVar2.ey = str2;
                cVar2.n(str3);
                cVar2.ew = c10.optString(an);
                cVar2.ex = c10.optInt("offer_type");
                cVar2.eB = c10.optString("reward_name");
                cVar2.eA = c10.optInt("reward_amount");
                try {
                    if (c10.has(cj)) {
                        String a10 = h.a(dVar, cVar2, c10.optString(cj));
                        if (!TextUtils.isEmpty(a10)) {
                            cVar2.fe = a10;
                            cVar2.f9495fd = ad(a10);
                        }
                    }
                } catch (Exception unused2) {
                }
                cVar2.eP = c10.optInt(bC, 2);
                if (a(cVar2, c10.optString("endcard_url"))) {
                    return null;
                }
                cVar2.f9494fc = c10.optInt(bP, 1);
                if (c10.has(ar)) {
                    cVar2.bK = c10.optString(ar);
                }
                if (c10.has(f9455bc)) {
                    cVar2.dQ = c10.optInt(f9455bc);
                }
                if (c10.has(be)) {
                    cVar2.dR = c10.optString(be);
                }
                cVar2.a(C0119c.a(c10.optJSONObject(ck)));
                cVar2.f9492fa = c10.optInt(as, 2);
                cVar2.dN = c10.optInt(aW, 1);
                cVar2.dO = c10.optInt(aX, 1);
                cVar2.dw = c10.optInt(aG);
                cVar2.dA = c10.optString("ia_icon");
                cVar2.dB = c10.optInt("ia_rst");
                cVar2.dC = c10.optString("ia_url");
                cVar2.dD = c10.optInt("ia_ori");
                cVar2.dE = dVar.d();
                cVar2.f9484db = c10.optInt(f9464e);
                cVar2.f9485dc = c10.optInt(f);
                cVar2.dF = c10.optString(aS);
                cVar2.dG = c10.optString(aT);
                cVar2.dH = c10.optInt(aU);
                cVar2.dI = c10.optString(aV);
                cVar2.dL = c10.optInt(aJ);
                cVar2.dK = c10.optInt(aI);
                cVar2.dM = c10.optString(aK);
                cVar2.dJ = a.a(c10.optString(aL, ""));
                cVar2.dg = c10.optLong("plct");
                cVar2.dh = c10.optLong("plctb");
                cVar2.dk = c10.optLong("creative_id");
                String optString3 = c10.optString("cam_tpl_url");
                Uri parse = Uri.parse(optString3);
                if (!TextUtils.isEmpty(parse.getPath()) && (parse.getPath().endsWith(".zip") || parse.getPath().endsWith(".ZIP"))) {
                    cVar2.a(optString3);
                } else {
                    cVar2.d(optString3);
                }
                cVar2.dj = c10.optString("cam_html");
                cVar2.cX = c10.optString("cam_html");
                String optString4 = c10.optString(f9471m);
                if (!TextUtils.isEmpty(optString4)) {
                    cVar2.eN = true;
                    cVar2.eM = optString4;
                } else if (!TextUtils.isEmpty(cVar2.cX) && !cVar2.cX.contains("<MBTPLMARK>")) {
                    cVar2.eN = true;
                } else {
                    cVar2.eN = false;
                }
                JSONArray optJSONArray2 = c10.optJSONArray(aM);
                if (optJSONArray2 == null) {
                    if (!TextUtils.isEmpty(c10.optString(aM))) {
                        cVar2.fr = c10.optString(aM);
                    } else {
                        cVar2.fr = null;
                    }
                } else {
                    cVar2.fr = optJSONArray2.toString();
                }
                try {
                    cVar2.fk = c10.optInt(f9474q);
                    cVar2.fl = c10.optString(f9475r);
                    cVar2.du = c10.optInt(ay);
                    cVar2.f9487de = c10.optInt(f9481x, -2);
                    cVar2.df = c10.optInt(y, -2);
                    cVar2.f9486dd = c10.optInt("adspace_t", 1);
                    cVar2.dv = c10.optInt(az);
                    cVar = h.b(c10, cVar2);
                    try {
                        ((c) cVar).dT = t.a(com.anythink.core.common.b.n.a().g(), cVar.ba(), ((c) cVar).dT);
                    } catch (Exception e10) {
                        com.anythink.expressad.foundation.h.o.d("campaign", e10.getMessage());
                    }
                    cVar.ag(c10.optInt(aB, 2));
                    cVar.ah(c10.optInt(aA, 1));
                    JSONArray optJSONArray3 = c10.optJSONArray(aC);
                    if (optJSONArray3 != null && optJSONArray3.length() > 0) {
                        ArrayList<Integer> arrayList2 = new ArrayList<>();
                        for (int i11 = 0; i11 < optJSONArray3.length(); i11++) {
                            arrayList2.add(Integer.valueOf(optJSONArray3.optInt(i11)));
                        }
                        if (arrayList2.size() > 0) {
                            ((c) cVar).fu = arrayList2;
                        }
                    }
                    ((c) cVar).fC = c10.optInt(f9465g, 0);
                    return cVar;
                } catch (Exception e11) {
                    e = e11;
                    e.printStackTrace();
                    return cVar;
                }
            } catch (Exception e12) {
                e = e12;
                cVar = cVar2;
            }
        } catch (Exception e13) {
            e = e13;
            cVar = 0;
        }
    }

    public static JSONArray b(List<c> list) {
        JSONArray jSONArray = null;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    JSONArray jSONArray2 = new JSONArray();
                    try {
                        Iterator<c> it = list.iterator();
                        while (it.hasNext()) {
                            try {
                                jSONArray2.put(a(it.next()));
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }
                        return jSONArray2;
                    } catch (Exception e10) {
                        e = e10;
                        jSONArray = jSONArray2;
                        e.printStackTrace();
                        return jSONArray;
                    }
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        return jSONArray;
    }

    private static List<Map<Integer, String>> b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    String string = jSONArray.getString(i10);
                    if (!TextUtils.isEmpty(string)) {
                        JSONObject jSONObject = new JSONObject(string);
                        HashMap hashMap = new HashMap();
                        int i11 = jSONObject.getInt("rate");
                        hashMap.put(Integer.valueOf(i11), jSONObject.getString("url"));
                        arrayList.add(hashMap);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return arrayList;
    }

    private static n a(JSONObject jSONObject, n nVar) {
        nVar.a(a(jSONObject.optJSONArray(h.cK)));
        nVar.b(a(jSONObject.optJSONArray(h.cL)));
        nVar.c(a(jSONObject.optJSONArray(h.cM)));
        return nVar;
    }

    private static String[] a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        String[] strArr = new String[jSONArray.length()];
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            strArr[i10] = jSONArray.optString(i10);
        }
        return strArr;
    }

    public static JSONObject a(c cVar, boolean z10, boolean z11) {
        JSONObject a10 = a(cVar);
        a10.put("isReady", z10);
        a10.put("expired", z11);
        return a10;
    }

    public static JSONObject a(c cVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", cVar.aZ());
        jSONObject.put(ay, cVar.du);
        jSONObject.put(az, cVar.dv);
        jSONObject.put("adspace_t", cVar.f9486dd);
        jSONObject.put(y, cVar.df);
        jSONObject.put(f9481x, cVar.f9487de);
        if (!TextUtils.isEmpty(cVar.ff)) {
            jSONObject.put("unitId", cVar.ff);
        }
        if (!TextUtils.isEmpty(cVar.eT)) {
            try {
                jSONObject.put(bN, new JSONObject(cVar.eT));
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(cVar.eY)) {
            try {
                jSONObject.put(d.H, new JSONObject(cVar.eY));
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
        List<String> list = cVar.cZ;
        if (list != null && list.size() > 0) {
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = cVar.cZ.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject.put("pv_urls", jSONArray);
            } catch (JSONException e12) {
                e12.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(cVar.eV)) {
            jSONObject.put(d.G, cVar.eX);
            jSONObject.put(d.F, cVar.eV);
            jSONObject.put(d.E, cVar.eU);
        }
        jSONObject.put("ready_rate", cVar.eR);
        jSONObject.put("title", cVar.bb());
        jSONObject.put("desc", cVar.bc());
        jSONObject.put("package_name", cVar.ba());
        jSONObject.put(av, cVar.ev);
        jSONObject.put("icon_url", cVar.bd());
        jSONObject.put("image_url", cVar.be());
        jSONObject.put(K, cVar.bh());
        jSONObject.put(J, cVar.f9488ea);
        jSONObject.put(L, cVar.dT);
        jSONObject.put("click_url", cVar.dV);
        p pVar = cVar.aH;
        if (pVar != null) {
            jSONObject.put(aF, pVar.c());
        }
        jSONObject.put(N, cVar.dW);
        jSONObject.put(O, cVar.dX);
        jSONObject.put(P, cVar.dY);
        jSONObject.put("notice_url", cVar.dU);
        jSONObject.put("template", cVar.f9489eb);
        jSONObject.put("ad_source_id", cVar.bf());
        jSONObject.put(T, cVar.f9490ec);
        jSONObject.put(U, cVar.f9491ed);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cVar.aX());
        jSONObject.put(Y, sb2.toString());
        jSONObject.put(Z, cVar.aY());
        jSONObject.put("click_mode", cVar.ee);
        jSONObject.put("landing_type", cVar.ef);
        jSONObject.put("link_type", cVar.eu);
        jSONObject.put(f9449ab, cVar.ei);
        jSONObject.put(f9448aa, cVar.cU);
        jSONObject.put(ah, cVar.eQ);
        jSONObject.put(ax, cVar.fm);
        jSONObject.put("video_url", cVar.en);
        jSONObject.put("video_length", cVar.bi());
        jSONObject.put("video_size", cVar.eo);
        jSONObject.put(af, cVar.ep);
        jSONObject.put(ag, cVar.eq);
        jSONObject.put(aw, cVar.eD);
        jSONObject.put(d.f9542g, cVar.dZ);
        jSONObject.put("ctype", cVar.er);
        jSONObject.put(ak, cVar.et);
        jSONObject.put(aj, cVar.es);
        jSONObject.put(d.f, cVar.ey);
        jSONObject.put(d.f9546k, cVar.ez);
        jSONObject.put(an, cVar.ew);
        jSONObject.put("offer_type", cVar.ex);
        jSONObject.put("reward_amount", cVar.eA);
        jSONObject.put("reward_name", cVar.eB);
        jSONObject.put(be, cVar.dR);
        if (w.b(cVar.fe)) {
            jSONObject.put(cj, new JSONObject(cVar.fe));
        }
        jSONObject.put(bC, cVar.eP);
        jSONObject.put("endcard_url", cVar.I());
        jSONObject.put(bP, cVar.f9494fc);
        C0119c c0119c = cVar.fo;
        if (c0119c != null && w.b(c0119c.a())) {
            jSONObject.put(ck, new JSONObject(cVar.fo.a()));
        }
        jSONObject.put(ar, cVar.bK);
        jSONObject.put(as, cVar.f9492fa);
        jSONObject.put(aX, cVar.dO);
        jSONObject.put(aW, cVar.dN);
        jSONObject.put(aG, cVar.dw);
        jSONObject.put("ia_icon", cVar.dA);
        jSONObject.put("ia_rst", cVar.dB);
        jSONObject.put("ia_url", cVar.dC);
        jSONObject.put("ia_ori", cVar.dD);
        jSONObject.put("ad_type", cVar.dE);
        jSONObject.put(aS, cVar.dF);
        jSONObject.put(aT, cVar.dG);
        jSONObject.put(aU, cVar.dH);
        jSONObject.put(aV, cVar.dI);
        jSONObject.put(aI, cVar.dK);
        jSONObject.put(aJ, cVar.dL);
        jSONObject.put(aK, cVar.dM);
        a aVar = cVar.dJ;
        if (aVar != null) {
            jSONObject.put(aL, new JSONObject(aVar.a()));
        }
        jSONObject.put("plct", cVar.dg);
        jSONObject.put("plctb", cVar.dh);
        jSONObject.put(aM, cVar.fr);
        jSONObject.put("creative_id", cVar.dk);
        jSONObject.put("cam_html", cVar.dj);
        String str = cVar.di;
        if (str == null) {
            str = cVar.cW;
        }
        jSONObject.put("cam_tpl_url", str);
        jSONObject.put(f9471m, cVar.eM);
        jSONObject.put(f9472n, cVar.eM);
        jSONObject.put("timestamp", cVar.bg());
        jSONObject.put("hb", cVar.eK);
        jSONObject.put(f9474q, cVar.fk);
        jSONObject.put(f9475r, cVar.fl);
        int i10 = cVar.dm;
        if (i10 <= 0) {
            i10 = 1;
        }
        jSONObject.put("vcn", i10);
        int i11 = cVar.dn;
        if (i11 != 1) {
            i11 = 0;
        }
        jSONObject.put("token_r", i11);
        jSONObject.put("encrypt_p", cVar.f1do);
        jSONObject.put(f9479v, cVar.ds);
        jSONObject.put(aC, cVar.fu);
        jSONObject.put(aB, cVar.fv);
        jSONObject.put(aA, cVar.fw);
        jSONObject.put(f9464e, cVar.f9484db);
        jSONObject.put(f, cVar.f9485dc);
        try {
            jSONObject.put("misk_spt", com.anythink.core.common.p.a().c());
            com.anythink.core.common.p.a();
            jSONObject.put("misk_spt_det", com.anythink.core.common.p.b());
        } catch (JSONException unused) {
        }
        jSONObject.put(f9465g, cVar.fC);
        jSONObject.put(h.cw, cVar.aW());
        jSONObject.put(h.cx, cVar.aV());
        jSONObject.put(h.cA, cVar.aU());
        jSONObject.put("ttc_type", cVar.aT());
        jSONObject.put(h.cC, cVar.aS());
        jSONObject.put(h.cD, cVar.aN());
        jSONObject.put(h.cE, com.anythink.expressad.foundation.h.j.a(cVar.aO()));
        jSONObject.put(h.cF, cVar.aP());
        jSONObject.put(h.cp, cVar.aI());
        jSONObject.put(h.cq, cVar.aH());
        if (cVar.aG() != null) {
            jSONObject.put(h.cr, cVar.aG().g());
        }
        jSONObject.put(h.cG, cVar.aQ());
        jSONObject.put(h.cH, cVar.aR());
        jSONObject.put(f9455bc, cVar.dQ);
        jSONObject.put(h.ct, cVar.aK());
        jSONObject.put(h.cs, cVar.aJ());
        jSONObject.put(h.cu, cVar.aL());
        jSONObject.put(h.cv, cVar.aM());
        return jSONObject;
    }

    private void a(ArrayList<Integer> arrayList) {
        this.fu = arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0026, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0024, code lost:
    
        if ((bg() + r12) >= r0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (((r11.dg * 1000) + bg()) >= r0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0028, code lost:
    
        r12 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(long r12, long r14) {
        /*
            r11 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r11.dg
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r6 = 1000(0x3e8, double:4.94E-321)
            r3 = 1
            r8 = 0
            if (r2 <= 0) goto L1d
            long r12 = r11.bg()
            long r9 = r11.dg
            long r9 = r9 * r6
            long r9 = r9 + r12
            int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r12 < 0) goto L28
            goto L26
        L1d:
            long r9 = r11.bg()
            long r9 = r9 + r12
            int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r12 < 0) goto L28
        L26:
            r12 = r3
            goto L29
        L28:
            r12 = r8
        L29:
            if (r12 == 0) goto L2c
            return r8
        L2c:
            long r12 = java.lang.System.currentTimeMillis()
            long r0 = r11.dh
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L44
            long r14 = r11.bg()
            long r0 = r11.dh
            long r0 = r0 * r6
            long r0 = r0 + r14
            int r12 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r12 < 0) goto L43
            return r3
        L43:
            return r8
        L44:
            long r0 = r11.bg()
            long r0 = r0 + r14
            int r12 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r12 < 0) goto L4e
            return r3
        L4e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.d.c.a(long, long):boolean");
    }
}
