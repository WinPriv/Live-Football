package com.onesignal;

import com.huawei.openalliance.ad.constant.bd;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: OSNotification.java */
/* loaded from: classes2.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public List<t1> f27068a;

    /* renamed from: b, reason: collision with root package name */
    public int f27069b;

    /* renamed from: c, reason: collision with root package name */
    public String f27070c;

    /* renamed from: d, reason: collision with root package name */
    public String f27071d;

    /* renamed from: e, reason: collision with root package name */
    public String f27072e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public String f27073g;

    /* renamed from: h, reason: collision with root package name */
    public JSONObject f27074h;

    /* renamed from: i, reason: collision with root package name */
    public String f27075i;

    /* renamed from: j, reason: collision with root package name */
    public String f27076j;

    /* renamed from: k, reason: collision with root package name */
    public String f27077k;

    /* renamed from: l, reason: collision with root package name */
    public String f27078l;

    /* renamed from: m, reason: collision with root package name */
    public String f27079m;

    /* renamed from: n, reason: collision with root package name */
    public String f27080n;
    public String o;

    /* renamed from: p, reason: collision with root package name */
    public int f27081p;

    /* renamed from: q, reason: collision with root package name */
    public String f27082q;

    /* renamed from: r, reason: collision with root package name */
    public String f27083r;

    /* renamed from: s, reason: collision with root package name */
    public List<a> f27084s;

    /* renamed from: t, reason: collision with root package name */
    public String f27085t;

    /* renamed from: u, reason: collision with root package name */
    public b f27086u;

    /* renamed from: v, reason: collision with root package name */
    public String f27087v;

    /* renamed from: w, reason: collision with root package name */
    public int f27088w;

    /* renamed from: x, reason: collision with root package name */
    public String f27089x;
    public long y;

    /* renamed from: z, reason: collision with root package name */
    public int f27090z;

    /* compiled from: OSNotification.java */
    /* loaded from: classes2.dex */
    public static class a {
    }

    /* compiled from: OSNotification.java */
    /* loaded from: classes2.dex */
    public static class b {
    }

    public t1() {
        this.f27081p = 1;
    }

    public final t1 a() {
        List<t1> list = this.f27068a;
        int i10 = this.f27069b;
        String str = this.f27070c;
        String str2 = this.f27071d;
        String str3 = this.f27072e;
        String str4 = this.f;
        String str5 = this.f27073g;
        JSONObject jSONObject = this.f27074h;
        String str6 = this.f27075i;
        String str7 = this.f27076j;
        String str8 = this.f27077k;
        String str9 = this.f27078l;
        String str10 = this.f27079m;
        String str11 = this.f27080n;
        String str12 = this.o;
        int i11 = this.f27081p;
        String str13 = this.f27082q;
        String str14 = this.f27083r;
        List<a> list2 = this.f27084s;
        String str15 = this.f27085t;
        b bVar = this.f27086u;
        String str16 = this.f27087v;
        int i12 = this.f27088w;
        String str17 = this.f27089x;
        long j10 = this.y;
        int i13 = this.f27090z;
        t1 t1Var = new t1();
        t1Var.f27068a = list;
        t1Var.f27069b = i10;
        t1Var.f27070c = str;
        t1Var.f27071d = str2;
        t1Var.f27072e = str3;
        t1Var.f = str4;
        t1Var.f27073g = str5;
        t1Var.f27074h = jSONObject;
        t1Var.f27075i = str6;
        t1Var.f27076j = str7;
        t1Var.f27077k = str8;
        t1Var.f27078l = str9;
        t1Var.f27079m = str10;
        t1Var.f27080n = str11;
        t1Var.o = str12;
        t1Var.f27081p = i11;
        t1Var.f27082q = str13;
        t1Var.f27083r = str14;
        t1Var.f27084s = list2;
        t1Var.f27085t = str15;
        t1Var.f27086u = bVar;
        t1Var.f27087v = str16;
        t1Var.f27088w = i12;
        t1Var.f27089x = str17;
        t1Var.y = j10;
        t1Var.f27090z = i13;
        return t1Var;
    }

    public final void b() throws Throwable {
        JSONObject jSONObject = this.f27074h;
        if (jSONObject != null && jSONObject.has("actionButtons")) {
            JSONArray jSONArray = this.f27074h.getJSONArray("actionButtons");
            this.f27084s = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                a aVar = new a();
                jSONObject2.optString("id", null);
                jSONObject2.optString(com.anythink.expressad.exoplayer.k.o.f9070c, null);
                jSONObject2.optString("icon", null);
                this.f27084s.add(aVar);
            }
            this.f27074h.remove("actionId");
            this.f27074h.remove("actionButtons");
        }
    }

    public final void c(JSONObject jSONObject) throws Throwable {
        String optString = jSONObject.optString("bg_img", null);
        if (optString != null) {
            JSONObject jSONObject2 = new JSONObject(optString);
            this.f27086u = new b();
            jSONObject2.optString(bd.Code);
            b bVar = this.f27086u;
            jSONObject2.optString("tc");
            bVar.getClass();
            b bVar2 = this.f27086u;
            jSONObject2.optString("bc");
            bVar2.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OSNotification{notificationExtender=null, groupedNotifications=");
        sb2.append(this.f27068a);
        sb2.append(", androidNotificationId=");
        sb2.append(this.f27069b);
        sb2.append(", notificationId='");
        sb2.append(this.f27070c);
        sb2.append("', templateName='");
        sb2.append(this.f27071d);
        sb2.append("', templateId='");
        sb2.append(this.f27072e);
        sb2.append("', title='");
        sb2.append(this.f);
        sb2.append("', body='");
        sb2.append(this.f27073g);
        sb2.append("', additionalData=");
        sb2.append(this.f27074h);
        sb2.append(", smallIcon='");
        sb2.append(this.f27075i);
        sb2.append("', largeIcon='");
        sb2.append(this.f27076j);
        sb2.append("', bigPicture='");
        sb2.append(this.f27077k);
        sb2.append("', smallIconAccentColor='");
        sb2.append(this.f27078l);
        sb2.append("', launchURL='");
        sb2.append(this.f27079m);
        sb2.append("', sound='");
        sb2.append(this.f27080n);
        sb2.append("', ledColor='");
        sb2.append(this.o);
        sb2.append("', lockScreenVisibility=");
        sb2.append(this.f27081p);
        sb2.append(", groupKey='");
        sb2.append(this.f27082q);
        sb2.append("', groupMessage='");
        sb2.append(this.f27083r);
        sb2.append("', actionButtons=");
        sb2.append(this.f27084s);
        sb2.append(", fromProjectNumber='");
        sb2.append(this.f27085t);
        sb2.append("', backgroundImageLayout=");
        sb2.append(this.f27086u);
        sb2.append(", collapseId='");
        sb2.append(this.f27087v);
        sb2.append("', priority=");
        sb2.append(this.f27088w);
        sb2.append(", rawPayload='");
        return a3.l.p(sb2, this.f27089x, "'}");
    }

    public t1(JSONObject jSONObject) {
        this(null, jSONObject, 0);
    }

    public t1(ArrayList arrayList, JSONObject jSONObject, int i10) {
        this.f27081p = 1;
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("custom"));
            e3.f26775w.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (jSONObject.has("google.ttl")) {
                this.y = jSONObject.optLong("google.sent_time", currentTimeMillis) / 1000;
                this.f27090z = jSONObject.optInt("google.ttl", com.anythink.expressad.d.a.b.bx);
            } else if (jSONObject.has("hms.ttl")) {
                this.y = jSONObject.optLong("hms.sent_time", currentTimeMillis) / 1000;
                this.f27090z = jSONObject.optInt("hms.ttl", com.anythink.expressad.d.a.b.bx);
            } else {
                this.y = currentTimeMillis / 1000;
                this.f27090z = com.anythink.expressad.d.a.b.bx;
            }
            this.f27070c = jSONObject2.optString(com.anythink.basead.d.i.f3957a);
            this.f27072e = jSONObject2.optString("ti");
            this.f27071d = jSONObject2.optString("tn");
            this.f27089x = jSONObject.toString();
            this.f27074h = jSONObject2.optJSONObject("a");
            this.f27079m = jSONObject2.optString("u", null);
            this.f27073g = jSONObject.optString("alert", null);
            this.f = jSONObject.optString("title", null);
            this.f27075i = jSONObject.optString("sicon", null);
            this.f27077k = jSONObject.optString("bicon", null);
            this.f27076j = jSONObject.optString("licon", null);
            this.f27080n = jSONObject.optString("sound", null);
            this.f27082q = jSONObject.optString("grp", null);
            this.f27083r = jSONObject.optString("grp_msg", null);
            this.f27078l = jSONObject.optString("bgac", null);
            this.o = jSONObject.optString("ledc", null);
            String optString = jSONObject.optString("vis", null);
            if (optString != null) {
                this.f27081p = Integer.parseInt(optString);
            }
            this.f27085t = jSONObject.optString("from", null);
            this.f27088w = jSONObject.optInt("pri", 0);
            String optString2 = jSONObject.optString("collapse_key", null);
            if (!"do_not_collapse".equals(optString2)) {
                this.f27087v = optString2;
            }
            try {
                b();
            } catch (Throwable th) {
                e3.b(3, "Error assigning OSNotificationReceivedEvent.actionButtons values!", th);
            }
            try {
                c(jSONObject);
            } catch (Throwable th2) {
                e3.b(3, "Error assigning OSNotificationReceivedEvent.backgroundImageLayout values!", th2);
            }
        } catch (Throwable th3) {
            e3.b(3, "Error assigning OSNotificationReceivedEvent payload values!", th3);
        }
        this.f27068a = arrayList;
        this.f27069b = i10;
    }
}
