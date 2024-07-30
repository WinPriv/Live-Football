package ja;

import android.content.Intent;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import com.huawei.openalliance.ad.msgnotify.NotifyCallback;
import com.huawei.openalliance.ad.utils.SafeIntent;
import java.io.Serializable;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c implements RemoteCallResultCallback<String> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NotifyCallback f30193a;

    public c(NotifyCallback notifyCallback) {
        this.f30193a = notifyCallback;
    }

    @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
    public final void onRemoteCallResult(String str, CallResult<String> callResult) {
        Intent intent;
        NotifyCallback notifyCallback = this.f30193a;
        if (notifyCallback != null && callResult != null && callResult.getCode() == 200) {
            try {
                JSONObject jSONObject = new JSONObject(callResult.getData());
                intent = new Intent();
                String optString = jSONObject.optString(ba.f22070t);
                intent.setAction(jSONObject.optString(ba.f22073w));
                intent.putExtra(ba.f22070t, optString);
                JSONObject optJSONObject = jSONObject.optJSONObject(ba.f22071u);
                if (optJSONObject != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Object obj = optJSONObject.get(next);
                        if (obj instanceof Serializable) {
                            intent.putExtra(next, (Serializable) obj);
                        }
                    }
                }
            } catch (JSONException unused) {
                ex.I("MsgConverter", "convertMsgJsonToIntent JSONException");
                intent = null;
            }
            if (intent != null) {
                SafeIntent safeIntent = new SafeIntent(intent);
                String stringExtra = safeIntent.getStringExtra(ba.f22070t);
                ex.V("MessageNotifyManager", "receive msg: " + stringExtra);
                notifyCallback.onMessageNotify(stringExtra, safeIntent);
            }
        }
    }
}
