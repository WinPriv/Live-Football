package ka;

import android.content.Context;
import android.util.Pair;
import java.util.HashMap;
import ka.qd;

/* loaded from: classes2.dex */
public final class f1 extends d0 {

    /* loaded from: classes2.dex */
    public static class a implements qd.a {

        /* renamed from: a, reason: collision with root package name */
        public final String f31151a;

        /* renamed from: b, reason: collision with root package name */
        public final Context f31152b;

        /* renamed from: c, reason: collision with root package name */
        public final com.huawei.android.hms.ppskit.a f31153c;

        /* renamed from: d, reason: collision with root package name */
        public final String f31154d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f31155e;

        public a(Context context, String str, com.huawei.android.hms.ppskit.a aVar, String str2, boolean z10) {
            this.f31152b = context;
            this.f31151a = str;
            this.f31153c = aVar;
            this.f31154d = str2;
            this.f31155e = z10;
        }

        public final void a(int i10, int i11) {
            y.d(this.f31153c, this.f31154d, i11, com.huawei.openalliance.ad.ppskit.utils.y0.q(null, new Pair(Integer.valueOf(i10), "")));
        }

        public final void b(int i10, HashMap hashMap) {
            String q10 = com.huawei.openalliance.ad.ppskit.utils.y0.q(null, new Pair(Integer.valueOf(i10), hashMap));
            y.d(this.f31153c, this.f31154d, 200, q10);
        }
    }

    public f1() {
        super("reqAdViaApi");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(37:1|(3:3|(2:6|4)|7)|8|(4:181|182|183|(35:185|(1:207)(38:189|(1:191)|192|193|194|(1:196)(1:198)|197|(1:12)(1:180)|13|14|15|(1:17)(1:177)|18|19|20|(1:22)(1:172)|23|24|25|26|27|28|(1:30)(6:127|(1:129)(1:160)|130|(1:132)|133|(14:159|32|(1:34)(4:112|(6:115|(1:117)(1:124)|118|(2:120|121)(1:123)|122|113)|125|126)|(1:111)(1:38)|39|(1:41)|42|(4:45|(3:47|48|49)(1:51)|50|43)|52|53|(5:56|(1:58)|(2:63|64)(3:66|67|68)|65|54)|70|71|(1:110)(4:73|(7:76|(1:106)(2:78|(2:80|(1:103)(2:(3:87|88|(3:93|94|(3:100|101|102)(1:96))(3:90|91|92))(3:83|84|85)|86))(5:104|105|98|99|86))|97|98|99|86|74)|107|108))(6:137|(4:140|(1:152)(7:142|143|(1:145)|146|(1:148)|149|150)|151|138)|153|154|(2:157|155)|158))|31|32|(0)(0)|(1:36)|111|39|(0)|42|(1:43)|52|53|(1:54)|70|71|(0)(0))|206|197|(0)(0)|13|14|15|(0)(0)|18|19|20|(0)(0)|23|24|25|26|27|28|(0)(0)|31|32|(0)(0)|(0)|111|39|(0)|42|(1:43)|52|53|(1:54)|70|71|(0)(0)))|10|(0)(0)|13|14|15|(0)(0)|18|19|20|(0)(0)|23|24|25|26|27|28|(0)(0)|31|32|(0)(0)|(0)|111|39|(0)|42|(1:43)|52|53|(1:54)|70|71|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01a4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01b4, code lost:
    
        ka.n7.g("i0", "fillResponseData error");
        r12.j(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0590, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0591, code lost:
    
        androidx.transition.n.D(r11);
        androidx.transition.n.D(r8);
        ka.n7.e("i0", "end request");
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x059c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x01a6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x01a7, code lost:
    
        r30 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x01aa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x01ab, code lost:
    
        r30 = r2;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x01af, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x01b0, code lost:
    
        r30 = r2;
        r8 = null;
        r11 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x058f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x04da  */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v21 */
    @Override // ka.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(android.content.Context r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, com.huawei.android.hms.ppskit.a r43) {
        /*
            Method dump skipped, instructions count: 1437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.f1.h(android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.huawei.android.hms.ppskit.a):void");
    }
}
