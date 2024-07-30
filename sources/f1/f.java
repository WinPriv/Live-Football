package f1;

import android.content.Context;
import android.net.Uri;
import com.huawei.openalliance.ad.constant.bj;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.onesignal.OSSubscriptionState;
import com.onesignal.c3;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import ka.Cif;
import ka.ke;
import ka.n7;
import ka.zh;
import org.json.JSONObject;

/* compiled from: InvalidationLiveDataContainer.java */
/* loaded from: classes.dex */
public final class f implements va.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27932a;

    /* renamed from: b, reason: collision with root package name */
    public Object f27933b;

    /* renamed from: c, reason: collision with root package name */
    public Object f27934c;

    public f(Context context) {
        this.f27932a = 1;
        this.f27933b = null;
        this.f27934c = null;
        if (Cif.d(context)) {
            try {
                b(context);
                return;
            } catch (Throwable th) {
                e0.i.p(th, "init anim error:", "HwAnimationReflection");
                return;
            }
        }
        n7.b("HwAnimationReflection", "not support Huawei Animation");
    }

    public final void a(int i10) {
        Object obj;
        switch (this.f27932a) {
            case 1:
                Object obj2 = this.f27934c;
                if (((Method) obj2) != null && (obj = this.f27933b) != null) {
                    try {
                        ((Method) obj2).invoke(obj, Integer.valueOf(i10));
                        return;
                    } catch (Throwable th) {
                        e0.i.p(th, "init anim error:", "HwAnimationReflection");
                        return;
                    }
                }
                return;
            default:
                return;
        }
    }

    public final void b(Context context) {
        Class<?> cls;
        String str;
        String str2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("com.huawei.hwanimation.AnimUtil");
        } catch (ClassNotFoundException unused) {
            n7.i("HwAnimationReflection", "initAnimUtilObjectAndMethods ClassNotFoundException");
            cls = null;
        }
        if (cls == null) {
            str2 = "initAnimUtilObjectAndMethods : cann't construct of AniUtil class object";
        } else {
            try {
                this.f27934c = cls.getDeclaredMethod("overrideTransition", Integer.TYPE);
            } catch (NoSuchMethodException unused2) {
                n7.i("HwAnimationReflection", "initAnimUtilObjectAndMethods NoSuchMethodException");
            }
            if (((Method) this.f27934c) == null) {
                str2 = "initAnimUtilObjectAndMethods : cann't get the method of overrideTransiton defined in AnimUtil";
            } else {
                try {
                    constructor = cls.getConstructor(Context.class);
                } catch (NoSuchMethodException unused3) {
                    n7.i("HwAnimationReflection", "initAnimUtilObjectAndMethods NoSuchMethodException");
                }
                if (constructor == null) {
                    str = "initAnimUtilObjectAndMethods : cann't get constructor method of AnimUtil";
                } else {
                    try {
                        this.f27933b = constructor.newInstance(context);
                        return;
                    } catch (IllegalAccessException unused4) {
                        str = "initAnimUtilObjectAndMethods IllegalAccessException";
                    } catch (IllegalArgumentException unused5) {
                        str = "initAnimUtilObjectAndMethods IllegalArgumentException";
                    } catch (InstantiationException unused6) {
                        str = "initAnimUtilObjectAndMethods InstantiationException";
                    } catch (InvocationTargetException unused7) {
                        str = "initAnimUtilObjectAndMethods InvocationTargetException";
                    }
                }
                n7.i("HwAnimationReflection", str);
                return;
            }
        }
        n7.i("HwAnimationReflection", str2);
    }

    public final Uri c() {
        int i10;
        char c10;
        boolean z10;
        if (!c3.i((Context) this.f27933b) || c3.j((Context) this.f27933b)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(((JSONObject) this.f27934c).optString("custom"));
        if (jSONObject.has("u")) {
            String optString = jSONObject.optString("u");
            if (!zc.d.a(optString, "")) {
                zc.d.c(optString, "url");
                int length = optString.length() - 1;
                int i11 = 0;
                boolean z11 = false;
                while (i11 <= length) {
                    if (!z11) {
                        i10 = i11;
                    } else {
                        i10 = length;
                    }
                    char charAt = optString.charAt(i10);
                    if (charAt < ' ') {
                        c10 = 65535;
                    } else if (charAt == ' ') {
                        c10 = 0;
                    } else {
                        c10 = 1;
                    }
                    if (c10 <= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z11) {
                        if (!z10) {
                            z11 = true;
                        } else {
                            i11++;
                        }
                    } else {
                        if (!z10) {
                            break;
                        }
                        length--;
                    }
                }
                return Uri.parse(optString.subSequence(i11, length + 1).toString());
            }
        }
        return null;
    }

    public final String toString() {
        switch (this.f27932a) {
            case 4:
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("from", ((OSSubscriptionState) this.f27933b).b());
                    jSONObject.put("to", ((OSSubscriptionState) this.f27934c).b());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                return jSONObject.toString();
            default:
                return super.toString();
        }
    }

    public f(Context context, ContentRecord contentRecord) {
        this.f27932a = 2;
        this.f27933b = contentRecord;
        ke keVar = new ke(context, zh.a(contentRecord.z0(), context), null);
        this.f27934c = keVar;
        keVar.f31382b = (ContentRecord) this.f27933b;
    }

    public f(Context context, JSONObject jSONObject) {
        this.f27932a = 3;
        zc.d.d(context, bj.f.o);
        zc.d.d(jSONObject, "fcmPayload");
        this.f27933b = context;
        this.f27934c = jSONObject;
    }

    public f(OSSubscriptionState oSSubscriptionState, OSSubscriptionState oSSubscriptionState2) {
        this.f27932a = 4;
        this.f27933b = oSSubscriptionState;
        this.f27934c = oSSubscriptionState2;
    }
}
