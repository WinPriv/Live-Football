package fa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.ads.ec;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.ji;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class f extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final Context f28225a;

    /* renamed from: b, reason: collision with root package name */
    public final ec f28226b;

    /* loaded from: classes2.dex */
    public class a implements RemoteCallResultCallback<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f28227a;

        public a(Context context) {
            this.f28227a = context;
        }

        @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
        public final void onRemoteCallResult(String str, CallResult<String> callResult) {
            String str2;
            int code = callResult.getCode();
            f fVar = f.this;
            if (code == 200) {
                ex.V("ExLinkedSplashReceiver", "reqExLinkedVideo success");
                try {
                    AdContentData a10 = f.a(fVar, new JSONObject(callResult.getData()));
                    if (a10 != null) {
                        a10.p();
                        ji.Code(a10).getClass();
                        j.a(this.f28227a).getClass();
                        str2 = "exSplashCallback is null";
                    } else {
                        str2 = "content is null";
                    }
                    ex.I("ExLinkedSplashReceiver", str2);
                    fVar.b();
                    return;
                } catch (JSONException unused) {
                    ex.I("ExLinkedSplashReceiver", "reqLinkedVideo onRemoteCallResult JSONException ");
                    return;
                }
            }
            ex.I("ExLinkedSplashReceiver", "call reqExLinked failed");
            fVar.b();
        }
    }

    public f(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f28225a = applicationContext;
        this.f28226b = ec.Code(applicationContext);
    }

    public static AdContentData a(f fVar, JSONObject jSONObject) {
        AdContentData adContentData;
        fVar.getClass();
        try {
            String optString = jSONObject.optString("contentRecord");
            adContentData = (AdContentData) gb.b.o(AdContentData.class, optString, new Class[0]);
            try {
                if (ex.Code()) {
                    ex.Code("ExLinkedSplashReceiver", " adContent content=%s", androidx.transition.n.e(optString));
                }
                if (adContentData != null) {
                    fVar.c(jSONObject);
                }
            } catch (Throwable th) {
                th = th;
                ex.I("ExLinkedSplashReceiver", "handleResponse exception: %s", th.getClass().getSimpleName());
                return adContentData;
            }
        } catch (Throwable th2) {
            th = th2;
            adContentData = null;
        }
        return adContentData;
    }

    public final void b() {
        ha.e.g(this.f28225a).d("showSplash", null, null, null);
    }

    public final void c(JSONObject jSONObject) {
        int optInt = jSONObject.optInt(ba.H);
        String optString = jSONObject.optString(ba.G);
        if (ex.Code()) {
            ex.Code("ExLinkedSplashReceiver", "splashSkipArea=%s", Integer.valueOf(optInt));
            ex.Code("ExLinkedSplashReceiver", "globalSwitch=%s", androidx.transition.n.e(optString));
        }
        ec ecVar = this.f28226b;
        if (ecVar != null) {
            ecVar.C(optInt);
            ecVar.I(optString);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Log.d("ExLinkedSplashReceiver", "onReceive.");
        if (intent == null) {
            return;
        }
        try {
            if (w.bl.equals(intent.getAction())) {
                ex.V("ExLinkedSplashReceiver", "receiver exlinkedsplash action");
                Long valueOf = Long.valueOf(intent.getLongExtra("exsplash_slogan_start_time", 0L));
                int intExtra = intent.getIntExtra("exsplash_slogan_show_time", 0);
                String stringExtra = intent.getStringExtra("linked_content_id");
                String stringExtra2 = intent.getStringExtra("linked_content_slotId");
                int intExtra2 = intent.getIntExtra("exsplash_redundancy_time", 0);
                ex.Code("ExLinkedSplashReceiver", "ExLinkedSplashReceiver, startTime: %s, showTime: %s, contentId: %s", valueOf, Integer.valueOf(intExtra), stringExtra);
                context.removeStickyBroadcast(intent);
                ec ecVar = this.f28226b;
                if (ecVar != null) {
                    ecVar.V(valueOf.longValue());
                    ecVar.Z(intExtra);
                    ecVar.V(stringExtra);
                    ecVar.B(intExtra2);
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("content_id", stringExtra);
                jSONObject.put("package_name", this.f28225a.getPackageName());
                jSONObject.put(ba.E, false);
                if (!TextUtils.isEmpty(stringExtra2)) {
                    jSONObject.put("slotid", stringExtra2);
                }
                ha.e.g(context).d("reqLinkedVideo", jSONObject.toString(), new a(context), String.class);
            }
        } catch (JSONException unused) {
            ex.I("ExLinkedSplashReceiver", "reqExLinkedVideo JSONException");
            b();
        } catch (Throwable th) {
            ex.I("ExLinkedSplashReceiver", "reqLinkedVideo exception: %s", th.getClass().getSimpleName());
        }
    }
}
