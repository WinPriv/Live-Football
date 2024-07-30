package com.anythink.core.common.e;

import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBiddingNotice;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.c.k;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m extends l implements Comparable<m> {
    private boolean A;
    private String B;
    private String C;
    private String D;
    private String E;
    private String F;
    private String G;

    /* renamed from: a, reason: collision with root package name */
    public int f5690a;

    /* renamed from: b, reason: collision with root package name */
    public String f5691b;

    /* renamed from: c, reason: collision with root package name */
    public String f5692c;

    /* renamed from: d, reason: collision with root package name */
    public int f5693d;

    /* renamed from: e, reason: collision with root package name */
    public long f5694e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public String f5695g;

    /* renamed from: h, reason: collision with root package name */
    public String f5696h;

    /* renamed from: i, reason: collision with root package name */
    public String f5697i;

    /* renamed from: j, reason: collision with root package name */
    public String f5698j;

    /* renamed from: k, reason: collision with root package name */
    public String f5699k;

    /* renamed from: l, reason: collision with root package name */
    public double f5700l;

    /* renamed from: m, reason: collision with root package name */
    public String f5701m;

    /* renamed from: n, reason: collision with root package name */
    public int f5702n;
    public double o;

    /* renamed from: p, reason: collision with root package name */
    public String f5703p;

    /* renamed from: q, reason: collision with root package name */
    public double f5704q;

    /* renamed from: r, reason: collision with root package name */
    public com.anythink.core.b.c.a f5705r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5706s;

    /* renamed from: t, reason: collision with root package name */
    private final String f5707t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f5708u;

    /* renamed from: v, reason: collision with root package name */
    private final String f5709v;

    /* renamed from: w, reason: collision with root package name */
    private final String f5710w;

    /* renamed from: x, reason: collision with root package name */
    private final String f5711x;
    private final String y;

    /* renamed from: z, reason: collision with root package name */
    private final String f5712z;

    public m(boolean z10, double d10, String str, String str2, String str3, String str4, String str5) {
        super(z10, d10, str, str2, str3, str4, str5, ATAdConst.CURRENCY.USD);
        this.f5707t = "m:";
        this.f5709v = "${AUCTION_PRICE}";
        this.f5710w = "${AUCTION_LOSS}";
        this.f5711x = "${AUCTION_SEAT_ID}";
        this.y = "${AUCTION_BID_TO_WIN}";
        this.f5712z = "${AUCTION_CURRENCY}";
    }

    private static String a(int i10) {
        return i10 == 2 ? ATAdConst.BIDDING_TYPE.BIDDING_LOSS_WITH_LOW_PRICE_IN_HB : ErrorCode.networkError;
    }

    private static int d(ai aiVar) {
        if (aiVar == null) {
            return 0;
        }
        int l10 = aiVar.l();
        if (l10 != 2) {
            return (l10 == 5 || l10 == 6) ? 3 : 1;
        }
        return 2;
    }

    public final synchronized void b() {
        this.A = true;
    }

    public final String c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(k.a.f5344b, this.token);
            jSONObject.put("cur", this.f5691b);
            jSONObject.put("origin_price", this.originPrice);
            jSONObject.put("price", this.price);
            jSONObject.put("nurl", this.winNoticeUrl);
            jSONObject.put("lurl", this.loseNoticeUrl);
            jSONObject.put("unit_id", this.f5692c);
            jSONObject.put("nw_firm_id", this.f5693d);
            jSONObject.put("is_success", this.isSuccess ? 1 : 0);
            jSONObject.put("err_code", this.f5690a);
            jSONObject.put("err_msg", this.errorMsg);
            jSONObject.put("expire", this.f5694e);
            jSONObject.put("out_data_time", this.f);
            jSONObject.put("is_send_winurl", this.f5708u);
            jSONObject.put(k.a.f5347e, this.f5697i);
            jSONObject.put("tp_bid_id", this.f5695g);
            jSONObject.put("burl", this.displayNoticeUrl);
            jSONObject.put("ad_source_id", this.f5699k);
            jSONObject.put("cur_rate", this.f5700l);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.anythink.core.common.l.ae, this.f5702n);
            jSONObject.put("ctrl", jSONObject2);
            if (!TextUtils.isEmpty(this.f5701m)) {
                jSONObject.put("bid_response", this.f5701m);
            }
            jSONObject.put("ecpm_api", this.o);
            jSONObject.put("precision", this.f5703p);
            jSONObject.put("second_price", this.f5704q);
            jSONObject.put("req_url", this.f5696h);
            jSONObject.put("bd_type", this.useType);
            jSONObject.put(com.anythink.core.common.l.am, this.sortPrice);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(m mVar) {
        m mVar2 = mVar;
        if (mVar2 == null) {
            return -1;
        }
        double d10 = this.sortPrice;
        if (d10 == 0.0d) {
            d10 = com.anythink.core.b.f.a().a(this.f5695g, this.f5699k);
        }
        double d11 = mVar2.sortPrice;
        if (d11 == 0.0d) {
            d11 = com.anythink.core.b.f.a().a(mVar2.f5695g, mVar2.f5699k);
        }
        if (d10 > d11) {
            return -1;
        }
        return 1;
    }

    public final boolean a() {
        return this.f < System.currentTimeMillis();
    }

    public final boolean d() {
        return this.price == 0.0d;
    }

    private String b(boolean z10, int i10) {
        if (i10 == 3) {
            return "-1";
        }
        int i11 = this.f5693d;
        if (i11 == 8) {
            return i10 == 1 ? "5" : "1";
        }
        if (i11 == 29) {
            return i10 == 1 ? "2002" : "2";
        }
        if (i11 == 34) {
            return a(i10);
        }
        return (i11 == 59 || z10) ? ATAdConst.BIDDING_TYPE.BIDDING_LOSS_WITH_LOW_PRICE_IN_HB : ATAdConst.BIDDING_TYPE.BIDDING_LOSS_WITH_LOW_PRICE_IN_NORMAL;
    }

    public final synchronized void a(ai aiVar) {
        a(aiVar, this.f5704q);
    }

    private synchronized void a(ai aiVar, double d10) {
        if (this.f5708u) {
            return;
        }
        this.f5708u = true;
        double d11 = this.f5700l;
        if (d11 > 0.0d) {
            d10 *= d11;
        }
        double sortPrice = d11 > 0.0d ? getSortPrice() * this.f5700l : getSortPrice();
        if (!TextUtils.isEmpty(this.winNoticeUrl)) {
            String replace = this.winNoticeUrl.replace("${AUCTION_BID_TO_WIN}", a(d10));
            if (this.f5693d == 28) {
                replace = this.winNoticeUrl.replace("${AUCTION_PRICE}", a(sortPrice));
            }
            if (aiVar != null) {
                com.anythink.core.common.g.f a10 = com.anythink.core.common.g.f.a(replace, aiVar.c(), aiVar.t());
                a10.a(c(aiVar));
                a10.a(0, (com.anythink.core.common.g.i) null);
            }
        }
        ATBiddingNotice aTBiddingNotice = this.biddingNotice;
        if (aTBiddingNotice != null) {
            if (this.f5693d == 28) {
                aTBiddingNotice.notifyBidWin(sortPrice);
            } else {
                aTBiddingNotice.notifyBidWin(d10);
            }
            com.anythink.core.common.j.c.a(c(aiVar));
        }
        if ((aiVar.l() == 3 || aiVar.l() == 7) && !this.A) {
            com.anythink.core.b.f.a();
            com.anythink.core.b.f.a(this.f5699k, this);
        }
    }

    private void b(double d10) {
        this.f5704q = d10;
    }

    public final void b(String str) {
        this.B = str;
    }

    private void b(ai aiVar) {
        com.anythink.core.common.j.c.a(c(aiVar));
    }

    public final synchronized void a(boolean z10, double d10, boolean z11) {
        double d11 = this.f5700l;
        if (d11 > 0.0d) {
            d10 *= d11;
        }
        if (z10) {
            String str = this.f5698j;
            if (TextUtils.isEmpty(str)) {
                str = this.displayNoticeUrl;
            }
            if (!TextUtils.isEmpty(str)) {
                c(str.replace("${AUCTION_PRICE}", a(d10)));
            }
        } else {
            String str2 = this.displayNoticeUrl;
            if (!TextUtils.isEmpty(str2)) {
                c(str2.replace("${AUCTION_PRICE}", a(d10)).replace("${AUCTION_LOSS}", b(z11, 2)));
            }
        }
        ATBiddingNotice aTBiddingNotice = this.biddingNotice;
        if (aTBiddingNotice != null) {
            aTBiddingNotice.notifyBidDisplay(z10, d10);
            if (z10) {
                this.biddingNotice = null;
            }
        }
    }

    private static void c(String str) {
        com.anythink.core.common.g.f.b(str).a(0, (com.anythink.core.common.g.i) null);
    }

    private an c(ai aiVar) {
        if (aiVar == null) {
            return null;
        }
        an anVar = new an(aiVar.c(), aiVar.t());
        anVar.c(this.B);
        anVar.a(d(aiVar));
        anVar.f(this.f5695g);
        anVar.d(this.D);
        anVar.e(this.C);
        anVar.g(this.E);
        anVar.h(this.F);
        anVar.i(this.G);
        return anVar;
    }

    public final synchronized void a(r rVar, boolean z10) {
        String replace;
        int i10 = rVar.f5731a;
        ai aiVar = rVar.f5734d;
        ai aiVar2 = rVar.f5733c;
        double d10 = rVar.f5732b;
        e eVar = rVar.f5735e;
        if (aiVar2 != null && aiVar != null) {
            boolean j10 = aiVar2.j();
            int c10 = aiVar2.c();
            m a10 = com.anythink.core.b.f.a().a(aiVar);
            if (z10) {
                if (a10 != null && TextUtils.equals(a10.token, this.token)) {
                    com.anythink.core.b.f.a().a(this.f5699k);
                    com.anythink.core.b.f.a();
                    com.anythink.core.b.f.b(this.f5699k);
                }
                if (aiVar.l() == 3 || aiVar.l() == 7) {
                    com.anythink.core.common.a.a.a().b(com.anythink.core.common.b.n.a().g(), this.token);
                }
            }
            if (this.f5708u) {
                return;
            }
            this.f5708u = true;
            if (d10 <= getSortPrice()) {
                d10 = getSortPrice() + 0.01d;
            }
            String str = this.loseNoticeUrl;
            String b10 = b(j10, i10);
            com.anythink.core.common.j.c.a(eVar, aiVar, d10, b10);
            double d11 = this.f5700l;
            if (d11 > 0.0d) {
                d10 *= d11;
            }
            if (!b10.equals("-1")) {
                if (this.biddingNotice != null) {
                    HashMap hashMap = new HashMap(3);
                    if (this.f5693d == 8) {
                        hashMap.put(ATBiddingNotice.ADN_ID, Integer.valueOf(a(j10, c10)));
                    }
                    this.biddingNotice.notifyBidLoss(b10, d10, hashMap);
                    this.biddingNotice = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    String replace2 = str.replace("${AUCTION_PRICE}", a(d10)).replace("${AUCTION_LOSS}", b10);
                    int i11 = this.f5693d;
                    if (i11 == 8) {
                        replace = replace2.replace("${AUCTION_SEAT_ID}", String.valueOf(a(j10, c10)));
                    } else if (i11 == 29) {
                        replace = replace2.replace("${AUCTION_SEAT_ID}", i11 == c10 ? "1" : "10001");
                    } else {
                        replace = replace2.replace("${AUCTION_SEAT_ID}", "");
                    }
                    if (this.f5693d == 6) {
                        replace = replace.replace("${AUCTION_CURRENCY}", ATAdConst.CURRENCY.USD.toString());
                    }
                    c(replace);
                }
            }
        }
    }

    private int a(boolean z10, int i10) {
        int i11 = this.f5693d;
        return i10 == i11 ? !z10 ? 1 : 4 : (i10 == 67 || i11 == 35) ? 3 : 2;
    }

    private String a(double d10) {
        int i10 = this.f5693d;
        if (i10 != 8 && i10 != 28) {
            return String.valueOf(d10);
        }
        return String.valueOf((int) d10);
    }

    public static m a(String str) {
        double d10;
        try {
            JSONObject jSONObject = new JSONObject(str);
            m mVar = new m(jSONObject.optInt("is_success") == 1, jSONObject.has("price") ? jSONObject.optDouble("price") : 0.0d, jSONObject.optString(k.a.f5344b), jSONObject.optString("nurl"), jSONObject.optString("lurl"), jSONObject.optString("burl"), jSONObject.optString("err_msg"));
            mVar.f5691b = jSONObject.optString("cur");
            mVar.f5692c = jSONObject.optString("unit_id");
            mVar.f5693d = jSONObject.optInt("nw_firm_id");
            mVar.f5690a = jSONObject.optInt("err_code");
            mVar.f5694e = jSONObject.optLong("expire");
            mVar.f = jSONObject.optLong("out_data_time");
            mVar.f5708u = jSONObject.optBoolean("is_send_winurl");
            mVar.f5697i = jSONObject.optString(k.a.f5347e);
            mVar.f5695g = jSONObject.optString("tp_bid_id");
            mVar.f5698j = jSONObject.optString("burl_win");
            mVar.f5699k = jSONObject.optString("ad_source_id");
            mVar.f5700l = jSONObject.optDouble("cur_rate");
            if (jSONObject.has("bid_response")) {
                mVar.f5701m = jSONObject.optString("bid_response");
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("ctrl");
            if (optJSONObject != null) {
                mVar.f5702n = optJSONObject.optInt(com.anythink.core.common.l.ae);
            }
            if (jSONObject.has("ecpm_api")) {
                d10 = 0.0d;
                mVar.o = jSONObject.optDouble("ecpm_api", 0.0d);
            } else {
                d10 = 0.0d;
            }
            mVar.f5703p = jSONObject.optString("precision");
            if (jSONObject.has("second_price")) {
                mVar.f5704q = jSONObject.optDouble("second_price", d10);
            }
            mVar.f5696h = jSONObject.optString("req_url", "");
            mVar.useType = jSONObject.optInt("bd_type", 1);
            if (jSONObject.has(com.anythink.core.common.l.am)) {
                mVar.sortPrice = jSONObject.optDouble(com.anythink.core.common.l.am, d10);
            } else {
                mVar.sortPrice = mVar.price;
            }
            if (jSONObject.has("origin_price")) {
                mVar.originPrice = jSONObject.optDouble("origin_price");
            } else {
                mVar.originPrice = mVar.sortPrice;
            }
            return mVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    private int a(m mVar) {
        if (mVar == null) {
            return -1;
        }
        double d10 = this.sortPrice;
        if (d10 == 0.0d) {
            d10 = com.anythink.core.b.f.a().a(this.f5695g, this.f5699k);
        }
        double d11 = mVar.sortPrice;
        if (d11 == 0.0d) {
            d11 = com.anythink.core.b.f.a().a(mVar.f5695g, mVar.f5699k);
        }
        return d10 > d11 ? -1 : 1;
    }

    private static String a(int i10, String str) {
        return TextUtils.isEmpty(str) ? "" : i10 == 34 ? str.replace("${AUCTION_CURRENCY}", ATAdConst.CURRENCY.USD.toString()) : str;
    }

    private void a(String str, ai aiVar) {
        if (aiVar == null) {
            return;
        }
        com.anythink.core.common.g.f a10 = com.anythink.core.common.g.f.a(str, aiVar.c(), aiVar.t());
        a10.a(c(aiVar));
        a10.a(0, (com.anythink.core.common.g.i) null);
    }

    public final void a(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.C = a(map, "offer_id");
        this.D = a(map, "dsp_id");
    }

    public final void a(e eVar) {
        if (eVar == null) {
            return;
        }
        this.F = String.valueOf(eVar.U());
        this.E = String.valueOf(eVar.I());
        this.G = eVar.W();
    }

    private static String a(Map<String, Object> map, String str) {
        Object obj = map.get(str);
        if (obj instanceof String) {
            return obj.toString();
        }
        return obj != null ? obj.toString() : "";
    }
}
