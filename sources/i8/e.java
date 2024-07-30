package i8;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CommonNotificationBuilder.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f29257a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* compiled from: CommonNotificationBuilder.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final b0.q f29258a;

        /* renamed from: b, reason: collision with root package name */
        public final String f29259b;

        public a(b0.q qVar, String str) {
            this.f29258a = qVar;
            this.f29259b = str;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(71:1|(3:2|3|(1:5))|229|7|(3:9|10|(71:12|(63:14|(1:16)|17|(1:19)|20|(1:22)|23|(54:25|(1:197)|29|(1:31)|32|(1:34)(2:187|(1:192)(1:191))|(1:36)|37|(1:39)(5:175|(1:177)|178|(1:180)(1:186)|(1:182)(2:183|(1:185)))|40|(1:42)(6:154|(5:157|(1:169)(1:163)|(2:165|166)(1:168)|167|155)|170|171|(1:173)|174)|43|(1:45)(1:153)|(1:47)|48|(37:149|150|(1:54)|55|(1:57)|58|(31:60|(1:143)|(1:65)|66|(27:68|(1:141)|(1:73)|74|(23:76|(1:78)|(1:80)|81|(19:136|137|(1:85)|86|(3:126|127|(16:129|(1:131)|132|(1:90)|91|(4:93|94|95|(2:97|(10:99|(3:101|(1:104)|105)|106|(1:108)|109|(1:111)|112|(1:114)|115|116)(2:118|119))(2:120|121))|125|(0)|106|(0)|109|(0)|112|(0)|115|116)(2:133|134))|88|(0)|91|(0)|125|(0)|106|(0)|109|(0)|112|(0)|115|116)|83|(0)|86|(0)|88|(0)|91|(0)|125|(0)|106|(0)|109|(0)|112|(0)|115|116)|140|(0)|81|(0)|83|(0)|86|(0)|88|(0)|91|(0)|125|(0)|106|(0)|109|(0)|112|(0)|115|116)|142|(0)|74|(0)|140|(0)|81|(0)|83|(0)|86|(0)|88|(0)|91|(0)|125|(0)|106|(0)|109|(0)|112|(0)|115|116)|144|(0)|66|(0)|142|(0)|74|(0)|140|(0)|81|(0)|83|(0)|86|(0)|88|(0)|91|(0)|125|(0)|106|(0)|109|(0)|112|(0)|115|116)|50|(37:145|146|(0)|55|(0)|58|(0)|144|(0)|66|(0)|142|(0)|74|(0)|140|(0)|81|(0)|83|(0)|86|(0)|88|(0)|91|(0)|125|(0)|106|(0)|109|(0)|112|(0)|115|116)|52|(0)|55|(0)|58|(0)|144|(0)|66|(0)|142|(0)|74|(0)|140|(0)|81|(0)|83|(0)|86|(0)|88|(0)|91|(0)|125|(0)|106|(0)|109|(0)|112|(0)|115|116)|198|(3:206|207|208)|(1:205)|29|(0)|32|(0)(0)|(0)|37|(0)(0)|40|(0)(0)|43|(0)(0)|(0)|48|(0)|50|(0)|52|(0)|55|(0)|58|(0)|144|(0)|66|(0)|142|(0)|74|(0)|140|(0)|81|(0)|83|(0)|86|(0)|88|(0)|91|(0)|125|(0)|106|(0)|109|(0)|112|(0)|115|116)|212|(67:214|(1:216)|17|(0)|20|(0)|23|(0)|198|(1:200)|206|207|208|(1:203)|205|29|(0)|32|(0)(0)|(0)|37|(0)(0)|40|(0)(0)|43|(0)(0)|(0)|48|(0)|50|(0)|52|(0)|55|(0)|58|(0)|144|(0)|66|(0)|142|(0)|74|(0)|140|(0)|81|(0)|83|(0)|86|(0)|88|(0)|91|(0)|125|(0)|106|(0)|109|(0)|112|(0)|115|116)(1:224)|217|(3:219|(1:221)(1:223)|222)|17|(0)|20|(0)|23|(0)|198|(0)|206|207|208|(0)|205|29|(0)|32|(0)(0)|(0)|37|(0)(0)|40|(0)(0)|43|(0)(0)|(0)|48|(0)|50|(0)|52|(0)|55|(0)|58|(0)|144|(0)|66|(0)|142|(0)|74|(0)|140|(0)|81|(0)|83|(0)|86|(0)|88|(0)|91|(0)|125|(0)|106|(0)|109|(0)|112|(0)|115|116))|225|17|(0)|20|(0)|23|(0)|198|(0)|206|207|208|(0)|205|29|(0)|32|(0)(0)|(0)|37|(0)(0)|40|(0)(0)|43|(0)(0)|(0)|48|(0)|50|(0)|52|(0)|55|(0)|58|(0)|144|(0)|66|(0)|142|(0)|74|(0)|140|(0)|81|(0)|83|(0)|86|(0)|88|(0)|91|(0)|125|(0)|106|(0)|109|(0)|112|(0)|115|116) */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0164, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0165, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r0 != null) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0427 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0303 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0471  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static i8.e.a a(android.content.Context r17, androidx.appcompat.app.r r18) {
        /*
            Method dump skipped, instructions count: 1334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.e.a(android.content.Context, androidx.appcompat.app.r):i8.e$a");
    }

    @TargetApi(26)
    public static boolean b(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i10, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i10);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i10 + ", treating it as an invalid icon");
            return false;
        }
    }
}
