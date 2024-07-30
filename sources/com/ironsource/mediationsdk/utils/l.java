package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.G;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.q;
import com.ironsource.mediationsdk.model.r;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public com.ironsource.mediationsdk.model.p f25934a;

    /* renamed from: b, reason: collision with root package name */
    public q f25935b;

    /* renamed from: c, reason: collision with root package name */
    public com.ironsource.mediationsdk.model.j f25936c;

    /* renamed from: d, reason: collision with root package name */
    public JSONObject f25937d;

    /* renamed from: e, reason: collision with root package name */
    public int f25938e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public String f25939g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f25940h;

    /* JADX WARN: Enum class init method not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f25941a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f25942b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f25943c = 3;
    }

    public l(Context context, String str, String str2, String str3) {
        this.f25938e = a.f25941a;
        this.f25940h = context;
        try {
            this.f25937d = TextUtils.isEmpty(str3) ? new JSONObject() : new JSONObject(str3);
            g();
            h();
            f();
            this.f = TextUtils.isEmpty(str) ? "" : str;
            this.f25939g = TextUtils.isEmpty(str2) ? "" : str2;
        } catch (JSONException e10) {
            e10.printStackTrace();
            e();
        }
    }

    public static int a(int i10, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        int i11 = 0;
        if (jSONObject.has(str)) {
            i11 = jSONObject.optInt(str, 0);
        } else if (jSONObject2.has(str)) {
            i11 = jSONObject2.optInt(str, 0);
        }
        return i11 == 0 ? i10 : i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
    
        if (r6.toString().equals(r5) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ironsource.mediationsdk.model.n b(org.json.JSONObject r8) {
        /*
            com.ironsource.mediationsdk.model.n$a r0 = new com.ironsource.mediationsdk.model.n$a
            r0.<init>()
            java.lang.String r1 = "delivery"
            r2 = 1
            boolean r1 = r8.optBoolean(r1, r2)
            r0.f25702a = r1
            java.lang.String r1 = "capping"
            org.json.JSONObject r1 = r8.optJSONObject(r1)
            java.lang.String r3 = "enabled"
            r4 = 0
            if (r1 == 0) goto L54
            java.lang.String r5 = "unit"
            java.lang.String r5 = r1.optString(r5)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L3f
            com.ironsource.mediationsdk.model.o r6 = com.ironsource.mediationsdk.model.o.PER_DAY
            java.lang.String r7 = r6.toString()
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L32
            goto L40
        L32:
            com.ironsource.mediationsdk.model.o r6 = com.ironsource.mediationsdk.model.o.PER_HOUR
            java.lang.String r7 = r6.toString()
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L3f
            goto L40
        L3f:
            r6 = 0
        L40:
            java.lang.String r5 = "maxImpressions"
            int r5 = r1.optInt(r5, r4)
            boolean r1 = r1.optBoolean(r3, r4)
            if (r1 == 0) goto L50
            if (r5 <= 0) goto L50
            r1 = r2
            goto L51
        L50:
            r1 = r4
        L51:
            r0.a(r1, r6, r5)
        L54:
            java.lang.String r1 = "pacing"
            org.json.JSONObject r8 = r8.optJSONObject(r1)
            if (r8 == 0) goto L6f
            java.lang.String r1 = "numOfSeconds"
            int r1 = r8.optInt(r1, r4)
            boolean r8 = r8.optBoolean(r3, r4)
            if (r8 == 0) goto L6b
            if (r1 <= 0) goto L6b
            goto L6c
        L6b:
            r2 = r4
        L6c:
            r0.a(r2, r1)
        L6f:
            com.ironsource.mediationsdk.model.n r8 = r0.a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.l.b(org.json.JSONObject):com.ironsource.mediationsdk.model.n");
    }

    public static int[] c(String str, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        int[] iArr = new int[optJSONArray.length()];
        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
            iArr[i10] = optJSONArray.optInt(i10);
        }
        return iArr;
    }

    public static JSONObject d(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    public final void e() {
        this.f25937d = new JSONObject();
        this.f = "";
        this.f25939g = "";
        this.f25934a = new com.ironsource.mediationsdk.model.p();
        this.f25935b = q.a();
        this.f25936c = new com.ironsource.mediationsdk.model.j();
    }

    public final void f() {
        com.ironsource.mediationsdk.model.j jVar;
        com.ironsource.mediationsdk.model.k kVar;
        com.ironsource.mediationsdk.model.j jVar2;
        r rVar;
        try {
            JSONObject d10 = d("providerOrder", this.f25937d);
            JSONArray optJSONArray = d10.optJSONArray("rewardedVideo");
            JSONArray optJSONArray2 = d10.optJSONArray("interstitial");
            JSONArray optJSONArray3 = d10.optJSONArray(com.anythink.expressad.foundation.g.a.f.f9817e);
            this.f25934a = new com.ironsource.mediationsdk.model.p();
            if (optJSONArray != null && (jVar2 = this.f25936c) != null && (rVar = jVar2.f25674a) != null) {
                String str = rVar.f;
                String str2 = rVar.f25724g;
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    String optString = optJSONArray.optString(i10);
                    if (optString.equals(str)) {
                        this.f25934a.f25712b = str;
                    } else {
                        if (optString.equals(str2)) {
                            this.f25934a.f25713c = str2;
                        }
                        com.ironsource.mediationsdk.model.p pVar = this.f25934a;
                        if (!TextUtils.isEmpty(optString)) {
                            pVar.f25711a.add(optString);
                        }
                        NetworkSettings a10 = q.a().a(optString);
                        if (a10 != null) {
                            a10.setRewardedVideoPriority(i10);
                        }
                    }
                }
            }
            if (optJSONArray2 != null && (jVar = this.f25936c) != null && (kVar = jVar.f25675b) != null) {
                String str3 = kVar.f25684g;
                String str4 = kVar.f25685h;
                for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                    String optString2 = optJSONArray2.optString(i11);
                    if (optString2.equals(str3)) {
                        this.f25934a.f = str3;
                    } else {
                        if (optString2.equals(str4)) {
                            this.f25934a.f25716g = str4;
                        }
                        com.ironsource.mediationsdk.model.p pVar2 = this.f25934a;
                        if (!TextUtils.isEmpty(optString2)) {
                            pVar2.f25714d.add(optString2);
                        }
                        NetworkSettings a11 = q.a().a(optString2);
                        if (a11 != null) {
                            a11.setInterstitialPriority(i11);
                        }
                    }
                }
            }
            if (optJSONArray3 != null) {
                for (int i12 = 0; i12 < optJSONArray3.length(); i12++) {
                    String optString3 = optJSONArray3.optString(i12);
                    com.ironsource.mediationsdk.model.p pVar3 = this.f25934a;
                    if (!TextUtils.isEmpty(optString3)) {
                        pVar3.f25715e.add(optString3);
                    }
                    NetworkSettings a12 = q.a().a(optString3);
                    if (a12 != null) {
                        a12.setBannerPriority(i12);
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void g() {
        String str;
        JSONObject jSONObject;
        boolean z10;
        NetworkSettings networkSettings;
        q qVar;
        String str2 = "Mediation";
        try {
            this.f25935b = q.a();
            JSONObject d10 = d("providerSettings", this.f25937d);
            Iterator<String> keys = d10.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = d10.optJSONObject(next);
                if (optJSONObject != null) {
                    boolean optBoolean = optJSONObject.optBoolean("mpis", false);
                    String optString = optJSONObject.optString(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, "0");
                    String optString2 = optJSONObject.optString("adSourceName", null);
                    String optString3 = optJSONObject.optString("providerLoadName", next);
                    String optString4 = optJSONObject.optString("providerDefaultInstance", optString3);
                    JSONObject d11 = d("adUnits", optJSONObject);
                    JSONObject d12 = d(com.anythink.expressad.exoplayer.k.o.f9071d, optJSONObject);
                    JSONObject d13 = d("rewardedVideo", d11);
                    JSONObject d14 = d("interstitial", d11);
                    JSONObject d15 = d(com.anythink.expressad.foundation.g.a.f.f9817e, d11);
                    JSONObject mergeJsons = IronSourceUtils.mergeJsons(d13, d12);
                    JSONObject mergeJsons2 = IronSourceUtils.mergeJsons(d14, d12);
                    JSONObject mergeJsons3 = IronSourceUtils.mergeJsons(d15, d12);
                    if (this.f25935b.b(next)) {
                        NetworkSettings a10 = this.f25935b.a(next);
                        JSONObject rewardedVideoSettings = a10.getRewardedVideoSettings();
                        JSONObject interstitialSettings = a10.getInterstitialSettings();
                        JSONObject bannerSettings = a10.getBannerSettings();
                        a10.setRewardedVideoSettings(IronSourceUtils.mergeJsons(rewardedVideoSettings, mergeJsons));
                        a10.setInterstitialSettings(IronSourceUtils.mergeJsons(interstitialSettings, mergeJsons2));
                        a10.setBannerSettings(IronSourceUtils.mergeJsons(bannerSettings, mergeJsons3));
                        a10.setIsMultipleInstances(optBoolean);
                        a10.setSubProviderId(optString);
                        a10.setAdSourceNameForEvents(optString2);
                    } else {
                        Locale locale = Locale.ENGLISH;
                        String lowerCase = optString3.toLowerCase(locale);
                        jSONObject = d10;
                        if (this.f25935b.b(str2) && (IronSourceConstants.SUPERSONIC_CONFIG_NAME.toLowerCase(locale).equals(lowerCase) || IronSourceConstants.IRONSOURCE_CONFIG_NAME.toLowerCase(locale).equals(lowerCase))) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            NetworkSettings a11 = this.f25935b.a(str2);
                            JSONObject rewardedVideoSettings2 = a11.getRewardedVideoSettings();
                            JSONObject interstitialSettings2 = a11.getInterstitialSettings();
                            JSONObject bannerSettings2 = a11.getBannerSettings();
                            str = str2;
                            networkSettings = new NetworkSettings(next, optString3, optString4, d12, IronSourceUtils.mergeJsons(new JSONObject(rewardedVideoSettings2.toString()), mergeJsons), IronSourceUtils.mergeJsons(new JSONObject(interstitialSettings2.toString()), mergeJsons2), IronSourceUtils.mergeJsons(new JSONObject(bannerSettings2.toString()), mergeJsons3));
                            networkSettings.setIsMultipleInstances(optBoolean);
                            networkSettings.setSubProviderId(optString);
                            networkSettings.setAdSourceNameForEvents(optString2);
                            qVar = this.f25935b;
                        } else {
                            str = str2;
                            networkSettings = new NetworkSettings(next, optString3, optString4, d12, mergeJsons, mergeJsons2, mergeJsons3);
                            networkSettings.setIsMultipleInstances(optBoolean);
                            networkSettings.setSubProviderId(optString);
                            networkSettings.setAdSourceNameForEvents(optString2);
                            qVar = this.f25935b;
                        }
                        qVar.a(networkSettings);
                    }
                } else {
                    str = str2;
                    jSONObject = d10;
                }
                str2 = str;
                d10 = jSONObject;
            }
            this.f25935b.b();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x0565 A[Catch: Exception -> 0x007b, TryCatch #0 {Exception -> 0x007b, blocks: (B:8:0x006f, B:10:0x0084, B:12:0x0090, B:15:0x00ca, B:18:0x0103, B:20:0x0153, B:21:0x015e, B:23:0x0164, B:26:0x0176, B:28:0x017e, B:29:0x0187, B:31:0x018d, B:34:0x019d, B:36:0x01a5, B:37:0x01ac, B:39:0x01b2, B:42:0x01c0, B:44:0x01c8, B:45:0x01cf, B:47:0x01d5, B:50:0x01e3, B:52:0x01ec, B:55:0x0297, B:57:0x029d, B:59:0x02a7, B:61:0x02ac, B:65:0x02be, B:68:0x02c8, B:70:0x02ce, B:72:0x02d6, B:74:0x02fd, B:76:0x0303, B:79:0x030b, B:81:0x0316, B:83:0x0325, B:85:0x032e, B:88:0x0331, B:87:0x0338, B:96:0x033f, B:98:0x034d, B:99:0x034f, B:101:0x035b, B:104:0x0374, B:107:0x03ae, B:109:0x03f1, B:110:0x03fe, B:112:0x0404, B:115:0x0418, B:117:0x0420, B:118:0x0429, B:120:0x042f, B:123:0x043f, B:125:0x0447, B:126:0x044e, B:128:0x0454, B:131:0x0462, B:133:0x046a, B:134:0x0471, B:136:0x0477, B:139:0x0485, B:141:0x0490, B:142:0x050d, B:145:0x0517, B:147:0x051d, B:149:0x0523, B:151:0x0543, B:153:0x0549, B:155:0x0550, B:157:0x0565, B:159:0x056e, B:162:0x0571, B:161:0x0578, B:171:0x0583, B:173:0x0595, B:174:0x0597, B:176:0x05a3, B:179:0x05b1, B:181:0x05d1, B:185:0x05eb, B:187:0x0602, B:189:0x0618, B:191:0x065c, B:192:0x0669, B:194:0x066f, B:197:0x0683, B:199:0x068b, B:200:0x0694, B:202:0x069a, B:205:0x06aa, B:207:0x06b2, B:208:0x06b9, B:210:0x06bf, B:213:0x06cd, B:215:0x06d5, B:216:0x06dc, B:218:0x06e2, B:221:0x06f0, B:223:0x06fb, B:225:0x0705, B:226:0x0783, B:229:0x078f, B:231:0x0795, B:233:0x079b, B:235:0x07b9, B:237:0x07bf, B:239:0x07c6, B:241:0x07d9, B:243:0x07e2, B:246:0x07e5, B:245:0x07ec, B:257:0x0808, B:259:0x083e, B:260:0x0845, B:262:0x084b, B:265:0x0859, B:267:0x0861, B:268:0x0868, B:270:0x086e, B:273:0x087c, B:275:0x0884, B:276:0x088b, B:278:0x0891, B:281:0x089f, B:283:0x08a7, B:284:0x08ae, B:286:0x08b4, B:289:0x08c2, B:292:0x08db, B:294:0x08e1, B:296:0x08e7, B:298:0x08fd, B:300:0x0903, B:302:0x090e, B:304:0x0917, B:307:0x091a, B:306:0x091f, B:316:0x092b, B:318:0x0932, B:321:0x093d, B:323:0x0943, B:325:0x094d, B:327:0x0952, B:330:0x0955, B:332:0x095d, B:333:0x095f, B:334:0x0971, B:336:0x0978, B:337:0x098e, B:339:0x0993, B:340:0x09a9, B:342:0x09ca, B:345:0x0a0a, B:347:0x0a10, B:349:0x0a1a, B:351:0x0a1f, B:355:0x0a24, B:356:0x0a44, B:358:0x0a4b, B:359:0x0a76, B:361:0x0a7f, B:363:0x0a8e, B:364:0x0a92, B:365:0x0a9d, B:367:0x0aa6, B:368:0x0ab8, B:394:0x0772, B:395:0x077a, B:400:0x060a, B:402:0x0611, B:405:0x05d6, B:407:0x05dc, B:410:0x0504, B:417:0x02b2), top: B:7:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0578 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x065c A[Catch: Exception -> 0x007b, TryCatch #0 {Exception -> 0x007b, blocks: (B:8:0x006f, B:10:0x0084, B:12:0x0090, B:15:0x00ca, B:18:0x0103, B:20:0x0153, B:21:0x015e, B:23:0x0164, B:26:0x0176, B:28:0x017e, B:29:0x0187, B:31:0x018d, B:34:0x019d, B:36:0x01a5, B:37:0x01ac, B:39:0x01b2, B:42:0x01c0, B:44:0x01c8, B:45:0x01cf, B:47:0x01d5, B:50:0x01e3, B:52:0x01ec, B:55:0x0297, B:57:0x029d, B:59:0x02a7, B:61:0x02ac, B:65:0x02be, B:68:0x02c8, B:70:0x02ce, B:72:0x02d6, B:74:0x02fd, B:76:0x0303, B:79:0x030b, B:81:0x0316, B:83:0x0325, B:85:0x032e, B:88:0x0331, B:87:0x0338, B:96:0x033f, B:98:0x034d, B:99:0x034f, B:101:0x035b, B:104:0x0374, B:107:0x03ae, B:109:0x03f1, B:110:0x03fe, B:112:0x0404, B:115:0x0418, B:117:0x0420, B:118:0x0429, B:120:0x042f, B:123:0x043f, B:125:0x0447, B:126:0x044e, B:128:0x0454, B:131:0x0462, B:133:0x046a, B:134:0x0471, B:136:0x0477, B:139:0x0485, B:141:0x0490, B:142:0x050d, B:145:0x0517, B:147:0x051d, B:149:0x0523, B:151:0x0543, B:153:0x0549, B:155:0x0550, B:157:0x0565, B:159:0x056e, B:162:0x0571, B:161:0x0578, B:171:0x0583, B:173:0x0595, B:174:0x0597, B:176:0x05a3, B:179:0x05b1, B:181:0x05d1, B:185:0x05eb, B:187:0x0602, B:189:0x0618, B:191:0x065c, B:192:0x0669, B:194:0x066f, B:197:0x0683, B:199:0x068b, B:200:0x0694, B:202:0x069a, B:205:0x06aa, B:207:0x06b2, B:208:0x06b9, B:210:0x06bf, B:213:0x06cd, B:215:0x06d5, B:216:0x06dc, B:218:0x06e2, B:221:0x06f0, B:223:0x06fb, B:225:0x0705, B:226:0x0783, B:229:0x078f, B:231:0x0795, B:233:0x079b, B:235:0x07b9, B:237:0x07bf, B:239:0x07c6, B:241:0x07d9, B:243:0x07e2, B:246:0x07e5, B:245:0x07ec, B:257:0x0808, B:259:0x083e, B:260:0x0845, B:262:0x084b, B:265:0x0859, B:267:0x0861, B:268:0x0868, B:270:0x086e, B:273:0x087c, B:275:0x0884, B:276:0x088b, B:278:0x0891, B:281:0x089f, B:283:0x08a7, B:284:0x08ae, B:286:0x08b4, B:289:0x08c2, B:292:0x08db, B:294:0x08e1, B:296:0x08e7, B:298:0x08fd, B:300:0x0903, B:302:0x090e, B:304:0x0917, B:307:0x091a, B:306:0x091f, B:316:0x092b, B:318:0x0932, B:321:0x093d, B:323:0x0943, B:325:0x094d, B:327:0x0952, B:330:0x0955, B:332:0x095d, B:333:0x095f, B:334:0x0971, B:336:0x0978, B:337:0x098e, B:339:0x0993, B:340:0x09a9, B:342:0x09ca, B:345:0x0a0a, B:347:0x0a10, B:349:0x0a1a, B:351:0x0a1f, B:355:0x0a24, B:356:0x0a44, B:358:0x0a4b, B:359:0x0a76, B:361:0x0a7f, B:363:0x0a8e, B:364:0x0a92, B:365:0x0a9d, B:367:0x0aa6, B:368:0x0ab8, B:394:0x0772, B:395:0x077a, B:400:0x060a, B:402:0x0611, B:405:0x05d6, B:407:0x05dc, B:410:0x0504, B:417:0x02b2), top: B:7:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x068b A[Catch: Exception -> 0x007b, TryCatch #0 {Exception -> 0x007b, blocks: (B:8:0x006f, B:10:0x0084, B:12:0x0090, B:15:0x00ca, B:18:0x0103, B:20:0x0153, B:21:0x015e, B:23:0x0164, B:26:0x0176, B:28:0x017e, B:29:0x0187, B:31:0x018d, B:34:0x019d, B:36:0x01a5, B:37:0x01ac, B:39:0x01b2, B:42:0x01c0, B:44:0x01c8, B:45:0x01cf, B:47:0x01d5, B:50:0x01e3, B:52:0x01ec, B:55:0x0297, B:57:0x029d, B:59:0x02a7, B:61:0x02ac, B:65:0x02be, B:68:0x02c8, B:70:0x02ce, B:72:0x02d6, B:74:0x02fd, B:76:0x0303, B:79:0x030b, B:81:0x0316, B:83:0x0325, B:85:0x032e, B:88:0x0331, B:87:0x0338, B:96:0x033f, B:98:0x034d, B:99:0x034f, B:101:0x035b, B:104:0x0374, B:107:0x03ae, B:109:0x03f1, B:110:0x03fe, B:112:0x0404, B:115:0x0418, B:117:0x0420, B:118:0x0429, B:120:0x042f, B:123:0x043f, B:125:0x0447, B:126:0x044e, B:128:0x0454, B:131:0x0462, B:133:0x046a, B:134:0x0471, B:136:0x0477, B:139:0x0485, B:141:0x0490, B:142:0x050d, B:145:0x0517, B:147:0x051d, B:149:0x0523, B:151:0x0543, B:153:0x0549, B:155:0x0550, B:157:0x0565, B:159:0x056e, B:162:0x0571, B:161:0x0578, B:171:0x0583, B:173:0x0595, B:174:0x0597, B:176:0x05a3, B:179:0x05b1, B:181:0x05d1, B:185:0x05eb, B:187:0x0602, B:189:0x0618, B:191:0x065c, B:192:0x0669, B:194:0x066f, B:197:0x0683, B:199:0x068b, B:200:0x0694, B:202:0x069a, B:205:0x06aa, B:207:0x06b2, B:208:0x06b9, B:210:0x06bf, B:213:0x06cd, B:215:0x06d5, B:216:0x06dc, B:218:0x06e2, B:221:0x06f0, B:223:0x06fb, B:225:0x0705, B:226:0x0783, B:229:0x078f, B:231:0x0795, B:233:0x079b, B:235:0x07b9, B:237:0x07bf, B:239:0x07c6, B:241:0x07d9, B:243:0x07e2, B:246:0x07e5, B:245:0x07ec, B:257:0x0808, B:259:0x083e, B:260:0x0845, B:262:0x084b, B:265:0x0859, B:267:0x0861, B:268:0x0868, B:270:0x086e, B:273:0x087c, B:275:0x0884, B:276:0x088b, B:278:0x0891, B:281:0x089f, B:283:0x08a7, B:284:0x08ae, B:286:0x08b4, B:289:0x08c2, B:292:0x08db, B:294:0x08e1, B:296:0x08e7, B:298:0x08fd, B:300:0x0903, B:302:0x090e, B:304:0x0917, B:307:0x091a, B:306:0x091f, B:316:0x092b, B:318:0x0932, B:321:0x093d, B:323:0x0943, B:325:0x094d, B:327:0x0952, B:330:0x0955, B:332:0x095d, B:333:0x095f, B:334:0x0971, B:336:0x0978, B:337:0x098e, B:339:0x0993, B:340:0x09a9, B:342:0x09ca, B:345:0x0a0a, B:347:0x0a10, B:349:0x0a1a, B:351:0x0a1f, B:355:0x0a24, B:356:0x0a44, B:358:0x0a4b, B:359:0x0a76, B:361:0x0a7f, B:363:0x0a8e, B:364:0x0a92, B:365:0x0a9d, B:367:0x0aa6, B:368:0x0ab8, B:394:0x0772, B:395:0x077a, B:400:0x060a, B:402:0x0611, B:405:0x05d6, B:407:0x05dc, B:410:0x0504, B:417:0x02b2), top: B:7:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x06b2 A[Catch: Exception -> 0x007b, TryCatch #0 {Exception -> 0x007b, blocks: (B:8:0x006f, B:10:0x0084, B:12:0x0090, B:15:0x00ca, B:18:0x0103, B:20:0x0153, B:21:0x015e, B:23:0x0164, B:26:0x0176, B:28:0x017e, B:29:0x0187, B:31:0x018d, B:34:0x019d, B:36:0x01a5, B:37:0x01ac, B:39:0x01b2, B:42:0x01c0, B:44:0x01c8, B:45:0x01cf, B:47:0x01d5, B:50:0x01e3, B:52:0x01ec, B:55:0x0297, B:57:0x029d, B:59:0x02a7, B:61:0x02ac, B:65:0x02be, B:68:0x02c8, B:70:0x02ce, B:72:0x02d6, B:74:0x02fd, B:76:0x0303, B:79:0x030b, B:81:0x0316, B:83:0x0325, B:85:0x032e, B:88:0x0331, B:87:0x0338, B:96:0x033f, B:98:0x034d, B:99:0x034f, B:101:0x035b, B:104:0x0374, B:107:0x03ae, B:109:0x03f1, B:110:0x03fe, B:112:0x0404, B:115:0x0418, B:117:0x0420, B:118:0x0429, B:120:0x042f, B:123:0x043f, B:125:0x0447, B:126:0x044e, B:128:0x0454, B:131:0x0462, B:133:0x046a, B:134:0x0471, B:136:0x0477, B:139:0x0485, B:141:0x0490, B:142:0x050d, B:145:0x0517, B:147:0x051d, B:149:0x0523, B:151:0x0543, B:153:0x0549, B:155:0x0550, B:157:0x0565, B:159:0x056e, B:162:0x0571, B:161:0x0578, B:171:0x0583, B:173:0x0595, B:174:0x0597, B:176:0x05a3, B:179:0x05b1, B:181:0x05d1, B:185:0x05eb, B:187:0x0602, B:189:0x0618, B:191:0x065c, B:192:0x0669, B:194:0x066f, B:197:0x0683, B:199:0x068b, B:200:0x0694, B:202:0x069a, B:205:0x06aa, B:207:0x06b2, B:208:0x06b9, B:210:0x06bf, B:213:0x06cd, B:215:0x06d5, B:216:0x06dc, B:218:0x06e2, B:221:0x06f0, B:223:0x06fb, B:225:0x0705, B:226:0x0783, B:229:0x078f, B:231:0x0795, B:233:0x079b, B:235:0x07b9, B:237:0x07bf, B:239:0x07c6, B:241:0x07d9, B:243:0x07e2, B:246:0x07e5, B:245:0x07ec, B:257:0x0808, B:259:0x083e, B:260:0x0845, B:262:0x084b, B:265:0x0859, B:267:0x0861, B:268:0x0868, B:270:0x086e, B:273:0x087c, B:275:0x0884, B:276:0x088b, B:278:0x0891, B:281:0x089f, B:283:0x08a7, B:284:0x08ae, B:286:0x08b4, B:289:0x08c2, B:292:0x08db, B:294:0x08e1, B:296:0x08e7, B:298:0x08fd, B:300:0x0903, B:302:0x090e, B:304:0x0917, B:307:0x091a, B:306:0x091f, B:316:0x092b, B:318:0x0932, B:321:0x093d, B:323:0x0943, B:325:0x094d, B:327:0x0952, B:330:0x0955, B:332:0x095d, B:333:0x095f, B:334:0x0971, B:336:0x0978, B:337:0x098e, B:339:0x0993, B:340:0x09a9, B:342:0x09ca, B:345:0x0a0a, B:347:0x0a10, B:349:0x0a1a, B:351:0x0a1f, B:355:0x0a24, B:356:0x0a44, B:358:0x0a4b, B:359:0x0a76, B:361:0x0a7f, B:363:0x0a8e, B:364:0x0a92, B:365:0x0a9d, B:367:0x0aa6, B:368:0x0ab8, B:394:0x0772, B:395:0x077a, B:400:0x060a, B:402:0x0611, B:405:0x05d6, B:407:0x05dc, B:410:0x0504, B:417:0x02b2), top: B:7:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x06d5 A[Catch: Exception -> 0x007b, TryCatch #0 {Exception -> 0x007b, blocks: (B:8:0x006f, B:10:0x0084, B:12:0x0090, B:15:0x00ca, B:18:0x0103, B:20:0x0153, B:21:0x015e, B:23:0x0164, B:26:0x0176, B:28:0x017e, B:29:0x0187, B:31:0x018d, B:34:0x019d, B:36:0x01a5, B:37:0x01ac, B:39:0x01b2, B:42:0x01c0, B:44:0x01c8, B:45:0x01cf, B:47:0x01d5, B:50:0x01e3, B:52:0x01ec, B:55:0x0297, B:57:0x029d, B:59:0x02a7, B:61:0x02ac, B:65:0x02be, B:68:0x02c8, B:70:0x02ce, B:72:0x02d6, B:74:0x02fd, B:76:0x0303, B:79:0x030b, B:81:0x0316, B:83:0x0325, B:85:0x032e, B:88:0x0331, B:87:0x0338, B:96:0x033f, B:98:0x034d, B:99:0x034f, B:101:0x035b, B:104:0x0374, B:107:0x03ae, B:109:0x03f1, B:110:0x03fe, B:112:0x0404, B:115:0x0418, B:117:0x0420, B:118:0x0429, B:120:0x042f, B:123:0x043f, B:125:0x0447, B:126:0x044e, B:128:0x0454, B:131:0x0462, B:133:0x046a, B:134:0x0471, B:136:0x0477, B:139:0x0485, B:141:0x0490, B:142:0x050d, B:145:0x0517, B:147:0x051d, B:149:0x0523, B:151:0x0543, B:153:0x0549, B:155:0x0550, B:157:0x0565, B:159:0x056e, B:162:0x0571, B:161:0x0578, B:171:0x0583, B:173:0x0595, B:174:0x0597, B:176:0x05a3, B:179:0x05b1, B:181:0x05d1, B:185:0x05eb, B:187:0x0602, B:189:0x0618, B:191:0x065c, B:192:0x0669, B:194:0x066f, B:197:0x0683, B:199:0x068b, B:200:0x0694, B:202:0x069a, B:205:0x06aa, B:207:0x06b2, B:208:0x06b9, B:210:0x06bf, B:213:0x06cd, B:215:0x06d5, B:216:0x06dc, B:218:0x06e2, B:221:0x06f0, B:223:0x06fb, B:225:0x0705, B:226:0x0783, B:229:0x078f, B:231:0x0795, B:233:0x079b, B:235:0x07b9, B:237:0x07bf, B:239:0x07c6, B:241:0x07d9, B:243:0x07e2, B:246:0x07e5, B:245:0x07ec, B:257:0x0808, B:259:0x083e, B:260:0x0845, B:262:0x084b, B:265:0x0859, B:267:0x0861, B:268:0x0868, B:270:0x086e, B:273:0x087c, B:275:0x0884, B:276:0x088b, B:278:0x0891, B:281:0x089f, B:283:0x08a7, B:284:0x08ae, B:286:0x08b4, B:289:0x08c2, B:292:0x08db, B:294:0x08e1, B:296:0x08e7, B:298:0x08fd, B:300:0x0903, B:302:0x090e, B:304:0x0917, B:307:0x091a, B:306:0x091f, B:316:0x092b, B:318:0x0932, B:321:0x093d, B:323:0x0943, B:325:0x094d, B:327:0x0952, B:330:0x0955, B:332:0x095d, B:333:0x095f, B:334:0x0971, B:336:0x0978, B:337:0x098e, B:339:0x0993, B:340:0x09a9, B:342:0x09ca, B:345:0x0a0a, B:347:0x0a10, B:349:0x0a1a, B:351:0x0a1f, B:355:0x0a24, B:356:0x0a44, B:358:0x0a4b, B:359:0x0a76, B:361:0x0a7f, B:363:0x0a8e, B:364:0x0a92, B:365:0x0a9d, B:367:0x0aa6, B:368:0x0ab8, B:394:0x0772, B:395:0x077a, B:400:0x060a, B:402:0x0611, B:405:0x05d6, B:407:0x05dc, B:410:0x0504, B:417:0x02b2), top: B:7:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x06fb A[Catch: Exception -> 0x007b, TryCatch #0 {Exception -> 0x007b, blocks: (B:8:0x006f, B:10:0x0084, B:12:0x0090, B:15:0x00ca, B:18:0x0103, B:20:0x0153, B:21:0x015e, B:23:0x0164, B:26:0x0176, B:28:0x017e, B:29:0x0187, B:31:0x018d, B:34:0x019d, B:36:0x01a5, B:37:0x01ac, B:39:0x01b2, B:42:0x01c0, B:44:0x01c8, B:45:0x01cf, B:47:0x01d5, B:50:0x01e3, B:52:0x01ec, B:55:0x0297, B:57:0x029d, B:59:0x02a7, B:61:0x02ac, B:65:0x02be, B:68:0x02c8, B:70:0x02ce, B:72:0x02d6, B:74:0x02fd, B:76:0x0303, B:79:0x030b, B:81:0x0316, B:83:0x0325, B:85:0x032e, B:88:0x0331, B:87:0x0338, B:96:0x033f, B:98:0x034d, B:99:0x034f, B:101:0x035b, B:104:0x0374, B:107:0x03ae, B:109:0x03f1, B:110:0x03fe, B:112:0x0404, B:115:0x0418, B:117:0x0420, B:118:0x0429, B:120:0x042f, B:123:0x043f, B:125:0x0447, B:126:0x044e, B:128:0x0454, B:131:0x0462, B:133:0x046a, B:134:0x0471, B:136:0x0477, B:139:0x0485, B:141:0x0490, B:142:0x050d, B:145:0x0517, B:147:0x051d, B:149:0x0523, B:151:0x0543, B:153:0x0549, B:155:0x0550, B:157:0x0565, B:159:0x056e, B:162:0x0571, B:161:0x0578, B:171:0x0583, B:173:0x0595, B:174:0x0597, B:176:0x05a3, B:179:0x05b1, B:181:0x05d1, B:185:0x05eb, B:187:0x0602, B:189:0x0618, B:191:0x065c, B:192:0x0669, B:194:0x066f, B:197:0x0683, B:199:0x068b, B:200:0x0694, B:202:0x069a, B:205:0x06aa, B:207:0x06b2, B:208:0x06b9, B:210:0x06bf, B:213:0x06cd, B:215:0x06d5, B:216:0x06dc, B:218:0x06e2, B:221:0x06f0, B:223:0x06fb, B:225:0x0705, B:226:0x0783, B:229:0x078f, B:231:0x0795, B:233:0x079b, B:235:0x07b9, B:237:0x07bf, B:239:0x07c6, B:241:0x07d9, B:243:0x07e2, B:246:0x07e5, B:245:0x07ec, B:257:0x0808, B:259:0x083e, B:260:0x0845, B:262:0x084b, B:265:0x0859, B:267:0x0861, B:268:0x0868, B:270:0x086e, B:273:0x087c, B:275:0x0884, B:276:0x088b, B:278:0x0891, B:281:0x089f, B:283:0x08a7, B:284:0x08ae, B:286:0x08b4, B:289:0x08c2, B:292:0x08db, B:294:0x08e1, B:296:0x08e7, B:298:0x08fd, B:300:0x0903, B:302:0x090e, B:304:0x0917, B:307:0x091a, B:306:0x091f, B:316:0x092b, B:318:0x0932, B:321:0x093d, B:323:0x0943, B:325:0x094d, B:327:0x0952, B:330:0x0955, B:332:0x095d, B:333:0x095f, B:334:0x0971, B:336:0x0978, B:337:0x098e, B:339:0x0993, B:340:0x09a9, B:342:0x09ca, B:345:0x0a0a, B:347:0x0a10, B:349:0x0a1a, B:351:0x0a1f, B:355:0x0a24, B:356:0x0a44, B:358:0x0a4b, B:359:0x0a76, B:361:0x0a7f, B:363:0x0a8e, B:364:0x0a92, B:365:0x0a9d, B:367:0x0aa6, B:368:0x0ab8, B:394:0x0772, B:395:0x077a, B:400:0x060a, B:402:0x0611, B:405:0x05d6, B:407:0x05dc, B:410:0x0504, B:417:0x02b2), top: B:7:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x07d9 A[Catch: Exception -> 0x007b, TryCatch #0 {Exception -> 0x007b, blocks: (B:8:0x006f, B:10:0x0084, B:12:0x0090, B:15:0x00ca, B:18:0x0103, B:20:0x0153, B:21:0x015e, B:23:0x0164, B:26:0x0176, B:28:0x017e, B:29:0x0187, B:31:0x018d, B:34:0x019d, B:36:0x01a5, B:37:0x01ac, B:39:0x01b2, B:42:0x01c0, B:44:0x01c8, B:45:0x01cf, B:47:0x01d5, B:50:0x01e3, B:52:0x01ec, B:55:0x0297, B:57:0x029d, B:59:0x02a7, B:61:0x02ac, B:65:0x02be, B:68:0x02c8, B:70:0x02ce, B:72:0x02d6, B:74:0x02fd, B:76:0x0303, B:79:0x030b, B:81:0x0316, B:83:0x0325, B:85:0x032e, B:88:0x0331, B:87:0x0338, B:96:0x033f, B:98:0x034d, B:99:0x034f, B:101:0x035b, B:104:0x0374, B:107:0x03ae, B:109:0x03f1, B:110:0x03fe, B:112:0x0404, B:115:0x0418, B:117:0x0420, B:118:0x0429, B:120:0x042f, B:123:0x043f, B:125:0x0447, B:126:0x044e, B:128:0x0454, B:131:0x0462, B:133:0x046a, B:134:0x0471, B:136:0x0477, B:139:0x0485, B:141:0x0490, B:142:0x050d, B:145:0x0517, B:147:0x051d, B:149:0x0523, B:151:0x0543, B:153:0x0549, B:155:0x0550, B:157:0x0565, B:159:0x056e, B:162:0x0571, B:161:0x0578, B:171:0x0583, B:173:0x0595, B:174:0x0597, B:176:0x05a3, B:179:0x05b1, B:181:0x05d1, B:185:0x05eb, B:187:0x0602, B:189:0x0618, B:191:0x065c, B:192:0x0669, B:194:0x066f, B:197:0x0683, B:199:0x068b, B:200:0x0694, B:202:0x069a, B:205:0x06aa, B:207:0x06b2, B:208:0x06b9, B:210:0x06bf, B:213:0x06cd, B:215:0x06d5, B:216:0x06dc, B:218:0x06e2, B:221:0x06f0, B:223:0x06fb, B:225:0x0705, B:226:0x0783, B:229:0x078f, B:231:0x0795, B:233:0x079b, B:235:0x07b9, B:237:0x07bf, B:239:0x07c6, B:241:0x07d9, B:243:0x07e2, B:246:0x07e5, B:245:0x07ec, B:257:0x0808, B:259:0x083e, B:260:0x0845, B:262:0x084b, B:265:0x0859, B:267:0x0861, B:268:0x0868, B:270:0x086e, B:273:0x087c, B:275:0x0884, B:276:0x088b, B:278:0x0891, B:281:0x089f, B:283:0x08a7, B:284:0x08ae, B:286:0x08b4, B:289:0x08c2, B:292:0x08db, B:294:0x08e1, B:296:0x08e7, B:298:0x08fd, B:300:0x0903, B:302:0x090e, B:304:0x0917, B:307:0x091a, B:306:0x091f, B:316:0x092b, B:318:0x0932, B:321:0x093d, B:323:0x0943, B:325:0x094d, B:327:0x0952, B:330:0x0955, B:332:0x095d, B:333:0x095f, B:334:0x0971, B:336:0x0978, B:337:0x098e, B:339:0x0993, B:340:0x09a9, B:342:0x09ca, B:345:0x0a0a, B:347:0x0a10, B:349:0x0a1a, B:351:0x0a1f, B:355:0x0a24, B:356:0x0a44, B:358:0x0a4b, B:359:0x0a76, B:361:0x0a7f, B:363:0x0a8e, B:364:0x0a92, B:365:0x0a9d, B:367:0x0aa6, B:368:0x0ab8, B:394:0x0772, B:395:0x077a, B:400:0x060a, B:402:0x0611, B:405:0x05d6, B:407:0x05dc, B:410:0x0504, B:417:0x02b2), top: B:7:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x07ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x090e A[Catch: Exception -> 0x007b, TryCatch #0 {Exception -> 0x007b, blocks: (B:8:0x006f, B:10:0x0084, B:12:0x0090, B:15:0x00ca, B:18:0x0103, B:20:0x0153, B:21:0x015e, B:23:0x0164, B:26:0x0176, B:28:0x017e, B:29:0x0187, B:31:0x018d, B:34:0x019d, B:36:0x01a5, B:37:0x01ac, B:39:0x01b2, B:42:0x01c0, B:44:0x01c8, B:45:0x01cf, B:47:0x01d5, B:50:0x01e3, B:52:0x01ec, B:55:0x0297, B:57:0x029d, B:59:0x02a7, B:61:0x02ac, B:65:0x02be, B:68:0x02c8, B:70:0x02ce, B:72:0x02d6, B:74:0x02fd, B:76:0x0303, B:79:0x030b, B:81:0x0316, B:83:0x0325, B:85:0x032e, B:88:0x0331, B:87:0x0338, B:96:0x033f, B:98:0x034d, B:99:0x034f, B:101:0x035b, B:104:0x0374, B:107:0x03ae, B:109:0x03f1, B:110:0x03fe, B:112:0x0404, B:115:0x0418, B:117:0x0420, B:118:0x0429, B:120:0x042f, B:123:0x043f, B:125:0x0447, B:126:0x044e, B:128:0x0454, B:131:0x0462, B:133:0x046a, B:134:0x0471, B:136:0x0477, B:139:0x0485, B:141:0x0490, B:142:0x050d, B:145:0x0517, B:147:0x051d, B:149:0x0523, B:151:0x0543, B:153:0x0549, B:155:0x0550, B:157:0x0565, B:159:0x056e, B:162:0x0571, B:161:0x0578, B:171:0x0583, B:173:0x0595, B:174:0x0597, B:176:0x05a3, B:179:0x05b1, B:181:0x05d1, B:185:0x05eb, B:187:0x0602, B:189:0x0618, B:191:0x065c, B:192:0x0669, B:194:0x066f, B:197:0x0683, B:199:0x068b, B:200:0x0694, B:202:0x069a, B:205:0x06aa, B:207:0x06b2, B:208:0x06b9, B:210:0x06bf, B:213:0x06cd, B:215:0x06d5, B:216:0x06dc, B:218:0x06e2, B:221:0x06f0, B:223:0x06fb, B:225:0x0705, B:226:0x0783, B:229:0x078f, B:231:0x0795, B:233:0x079b, B:235:0x07b9, B:237:0x07bf, B:239:0x07c6, B:241:0x07d9, B:243:0x07e2, B:246:0x07e5, B:245:0x07ec, B:257:0x0808, B:259:0x083e, B:260:0x0845, B:262:0x084b, B:265:0x0859, B:267:0x0861, B:268:0x0868, B:270:0x086e, B:273:0x087c, B:275:0x0884, B:276:0x088b, B:278:0x0891, B:281:0x089f, B:283:0x08a7, B:284:0x08ae, B:286:0x08b4, B:289:0x08c2, B:292:0x08db, B:294:0x08e1, B:296:0x08e7, B:298:0x08fd, B:300:0x0903, B:302:0x090e, B:304:0x0917, B:307:0x091a, B:306:0x091f, B:316:0x092b, B:318:0x0932, B:321:0x093d, B:323:0x0943, B:325:0x094d, B:327:0x0952, B:330:0x0955, B:332:0x095d, B:333:0x095f, B:334:0x0971, B:336:0x0978, B:337:0x098e, B:339:0x0993, B:340:0x09a9, B:342:0x09ca, B:345:0x0a0a, B:347:0x0a10, B:349:0x0a1a, B:351:0x0a1f, B:355:0x0a24, B:356:0x0a44, B:358:0x0a4b, B:359:0x0a76, B:361:0x0a7f, B:363:0x0a8e, B:364:0x0a92, B:365:0x0a9d, B:367:0x0aa6, B:368:0x0ab8, B:394:0x0772, B:395:0x077a, B:400:0x060a, B:402:0x0611, B:405:0x05d6, B:407:0x05dc, B:410:0x0504, B:417:0x02b2), top: B:7:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x091f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x077a A[Catch: Exception -> 0x007b, TryCatch #0 {Exception -> 0x007b, blocks: (B:8:0x006f, B:10:0x0084, B:12:0x0090, B:15:0x00ca, B:18:0x0103, B:20:0x0153, B:21:0x015e, B:23:0x0164, B:26:0x0176, B:28:0x017e, B:29:0x0187, B:31:0x018d, B:34:0x019d, B:36:0x01a5, B:37:0x01ac, B:39:0x01b2, B:42:0x01c0, B:44:0x01c8, B:45:0x01cf, B:47:0x01d5, B:50:0x01e3, B:52:0x01ec, B:55:0x0297, B:57:0x029d, B:59:0x02a7, B:61:0x02ac, B:65:0x02be, B:68:0x02c8, B:70:0x02ce, B:72:0x02d6, B:74:0x02fd, B:76:0x0303, B:79:0x030b, B:81:0x0316, B:83:0x0325, B:85:0x032e, B:88:0x0331, B:87:0x0338, B:96:0x033f, B:98:0x034d, B:99:0x034f, B:101:0x035b, B:104:0x0374, B:107:0x03ae, B:109:0x03f1, B:110:0x03fe, B:112:0x0404, B:115:0x0418, B:117:0x0420, B:118:0x0429, B:120:0x042f, B:123:0x043f, B:125:0x0447, B:126:0x044e, B:128:0x0454, B:131:0x0462, B:133:0x046a, B:134:0x0471, B:136:0x0477, B:139:0x0485, B:141:0x0490, B:142:0x050d, B:145:0x0517, B:147:0x051d, B:149:0x0523, B:151:0x0543, B:153:0x0549, B:155:0x0550, B:157:0x0565, B:159:0x056e, B:162:0x0571, B:161:0x0578, B:171:0x0583, B:173:0x0595, B:174:0x0597, B:176:0x05a3, B:179:0x05b1, B:181:0x05d1, B:185:0x05eb, B:187:0x0602, B:189:0x0618, B:191:0x065c, B:192:0x0669, B:194:0x066f, B:197:0x0683, B:199:0x068b, B:200:0x0694, B:202:0x069a, B:205:0x06aa, B:207:0x06b2, B:208:0x06b9, B:210:0x06bf, B:213:0x06cd, B:215:0x06d5, B:216:0x06dc, B:218:0x06e2, B:221:0x06f0, B:223:0x06fb, B:225:0x0705, B:226:0x0783, B:229:0x078f, B:231:0x0795, B:233:0x079b, B:235:0x07b9, B:237:0x07bf, B:239:0x07c6, B:241:0x07d9, B:243:0x07e2, B:246:0x07e5, B:245:0x07ec, B:257:0x0808, B:259:0x083e, B:260:0x0845, B:262:0x084b, B:265:0x0859, B:267:0x0861, B:268:0x0868, B:270:0x086e, B:273:0x087c, B:275:0x0884, B:276:0x088b, B:278:0x0891, B:281:0x089f, B:283:0x08a7, B:284:0x08ae, B:286:0x08b4, B:289:0x08c2, B:292:0x08db, B:294:0x08e1, B:296:0x08e7, B:298:0x08fd, B:300:0x0903, B:302:0x090e, B:304:0x0917, B:307:0x091a, B:306:0x091f, B:316:0x092b, B:318:0x0932, B:321:0x093d, B:323:0x0943, B:325:0x094d, B:327:0x0952, B:330:0x0955, B:332:0x095d, B:333:0x095f, B:334:0x0971, B:336:0x0978, B:337:0x098e, B:339:0x0993, B:340:0x09a9, B:342:0x09ca, B:345:0x0a0a, B:347:0x0a10, B:349:0x0a1a, B:351:0x0a1f, B:355:0x0a24, B:356:0x0a44, B:358:0x0a4b, B:359:0x0a76, B:361:0x0a7f, B:363:0x0a8e, B:364:0x0a92, B:365:0x0a9d, B:367:0x0aa6, B:368:0x0ab8, B:394:0x0772, B:395:0x077a, B:400:0x060a, B:402:0x0611, B:405:0x05d6, B:407:0x05dc, B:410:0x0504, B:417:0x02b2), top: B:7:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0325 A[Catch: Exception -> 0x007b, TryCatch #0 {Exception -> 0x007b, blocks: (B:8:0x006f, B:10:0x0084, B:12:0x0090, B:15:0x00ca, B:18:0x0103, B:20:0x0153, B:21:0x015e, B:23:0x0164, B:26:0x0176, B:28:0x017e, B:29:0x0187, B:31:0x018d, B:34:0x019d, B:36:0x01a5, B:37:0x01ac, B:39:0x01b2, B:42:0x01c0, B:44:0x01c8, B:45:0x01cf, B:47:0x01d5, B:50:0x01e3, B:52:0x01ec, B:55:0x0297, B:57:0x029d, B:59:0x02a7, B:61:0x02ac, B:65:0x02be, B:68:0x02c8, B:70:0x02ce, B:72:0x02d6, B:74:0x02fd, B:76:0x0303, B:79:0x030b, B:81:0x0316, B:83:0x0325, B:85:0x032e, B:88:0x0331, B:87:0x0338, B:96:0x033f, B:98:0x034d, B:99:0x034f, B:101:0x035b, B:104:0x0374, B:107:0x03ae, B:109:0x03f1, B:110:0x03fe, B:112:0x0404, B:115:0x0418, B:117:0x0420, B:118:0x0429, B:120:0x042f, B:123:0x043f, B:125:0x0447, B:126:0x044e, B:128:0x0454, B:131:0x0462, B:133:0x046a, B:134:0x0471, B:136:0x0477, B:139:0x0485, B:141:0x0490, B:142:0x050d, B:145:0x0517, B:147:0x051d, B:149:0x0523, B:151:0x0543, B:153:0x0549, B:155:0x0550, B:157:0x0565, B:159:0x056e, B:162:0x0571, B:161:0x0578, B:171:0x0583, B:173:0x0595, B:174:0x0597, B:176:0x05a3, B:179:0x05b1, B:181:0x05d1, B:185:0x05eb, B:187:0x0602, B:189:0x0618, B:191:0x065c, B:192:0x0669, B:194:0x066f, B:197:0x0683, B:199:0x068b, B:200:0x0694, B:202:0x069a, B:205:0x06aa, B:207:0x06b2, B:208:0x06b9, B:210:0x06bf, B:213:0x06cd, B:215:0x06d5, B:216:0x06dc, B:218:0x06e2, B:221:0x06f0, B:223:0x06fb, B:225:0x0705, B:226:0x0783, B:229:0x078f, B:231:0x0795, B:233:0x079b, B:235:0x07b9, B:237:0x07bf, B:239:0x07c6, B:241:0x07d9, B:243:0x07e2, B:246:0x07e5, B:245:0x07ec, B:257:0x0808, B:259:0x083e, B:260:0x0845, B:262:0x084b, B:265:0x0859, B:267:0x0861, B:268:0x0868, B:270:0x086e, B:273:0x087c, B:275:0x0884, B:276:0x088b, B:278:0x0891, B:281:0x089f, B:283:0x08a7, B:284:0x08ae, B:286:0x08b4, B:289:0x08c2, B:292:0x08db, B:294:0x08e1, B:296:0x08e7, B:298:0x08fd, B:300:0x0903, B:302:0x090e, B:304:0x0917, B:307:0x091a, B:306:0x091f, B:316:0x092b, B:318:0x0932, B:321:0x093d, B:323:0x0943, B:325:0x094d, B:327:0x0952, B:330:0x0955, B:332:0x095d, B:333:0x095f, B:334:0x0971, B:336:0x0978, B:337:0x098e, B:339:0x0993, B:340:0x09a9, B:342:0x09ca, B:345:0x0a0a, B:347:0x0a10, B:349:0x0a1a, B:351:0x0a1f, B:355:0x0a24, B:356:0x0a44, B:358:0x0a4b, B:359:0x0a76, B:361:0x0a7f, B:363:0x0a8e, B:364:0x0a92, B:365:0x0a9d, B:367:0x0aa6, B:368:0x0ab8, B:394:0x0772, B:395:0x077a, B:400:0x060a, B:402:0x0611, B:405:0x05d6, B:407:0x05dc, B:410:0x0504, B:417:0x02b2), top: B:7:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0338 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 2846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.l.h():void");
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appKey", this.f);
            jSONObject.put("userId", this.f25939g);
            jSONObject.put("response", this.f25937d);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject.toString();
    }

    public l(l lVar) {
        this.f25938e = a.f25941a;
        try {
            this.f25940h = lVar.f25940h;
            this.f25937d = new JSONObject(lVar.f25937d.toString());
            this.f = lVar.f;
            this.f25939g = lVar.f25939g;
            this.f25934a = lVar.f25934a;
            this.f25935b = lVar.f25935b;
            this.f25936c = lVar.f25936c;
            this.f25938e = lVar.f25938e;
        } catch (Exception unused) {
            e();
        }
    }

    public final G a() {
        return new G(this.f, this.f25939g);
    }

    public final boolean b() {
        JSONObject d10;
        JSONArray optJSONArray;
        boolean z10;
        JSONObject jSONObject = this.f25937d;
        if (!(((((jSONObject != null) && !jSONObject.has("error")) && this.f25934a != null) && this.f25935b != null) && this.f25936c != null)) {
            return false;
        }
        JSONObject d11 = d("providerOrder", this.f25937d);
        JSONArray names = d11.names();
        if (names != null) {
            JSONObject d12 = d("adUnits", d("configurations", this.f25937d));
            for (int i10 = 0; i10 < names.length(); i10++) {
                String optString = names.optString(i10);
                JSONArray optJSONArray2 = d11.optJSONArray(optString);
                if (optJSONArray2 != null && optJSONArray2.length() != 0 && (d10 = d(optString, d12)) != null && ((optJSONArray = d10.optJSONArray("placements")) == null || optJSONArray.length() == 0)) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        return z10;
    }

    public final String c() {
        try {
            return this.f25934a.f25712b;
        } catch (Exception e10) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getRVBackFillProvider", e10);
            return null;
        }
    }

    public final String d() {
        try {
            return this.f25934a.f25713c;
        } catch (Exception e10) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getRVPremiumProvider", e10);
            return null;
        }
    }
}
