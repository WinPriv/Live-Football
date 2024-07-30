package com.huawei.openalliance.ad.ppskit.beans.metadata;

import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import ka.n7;
import org.json.JSONException;
import org.json.JSONObject;

@DataKeep
/* loaded from: classes2.dex */
public class LocalChannelInfo {
    public static final String KEY_AD_TYPE = "adType";
    public static final String KEY_CHANNEL = "channel";
    public static final String KEY_CHANNEL_INFO = "channelId";
    public static final String KEY_CLICK_TIMESTAMP = "clickTimestamp";
    public static final String KEY_CONTENT_ID = "contentId";
    public static final String KEY_DELETE_UNINSTALL = "deleteWhenUpdate";
    public static final String KEY_INSTALL_TIME = "installTime";
    public static final String KEY_INSTALL_TIMESTAMP = "installTimestamp";
    public static final String KEY_READ_COUNT = "readCount";
    public static final String KEY_REFERRER = "referrer";
    public static final String KEY_REPORT_COUNT = "reportCount";
    public static final String KEY_SLOT_ID = "slotId";
    private static final long MILLISECONDS_PER_MINIUTE = 60000;
    private static final long MILLISECONDS_PER_YEAR = 31536000000L;
    private static final int REPORT_NO = 0;
    private static final int REPORT_NO_LIMIT = -1;
    private static final String TAG = "LocalChannelInfo";
    private String callerVersionCode;
    private String channelInfo;
    private long clickTime;
    private String clientAdRequestId;
    private int readTimes;
    private int saveLimit;
    private long saveTime = -1;
    private int channelInfoVersion = 0;
    private int errorCode = 0;

    public final JSONObject a() {
        JSONObject jSONObject = null;
        if (TextUtils.isEmpty(this.channelInfo)) {
            return null;
        }
        try {
            String p10 = y1.p(this.channelInfo);
            if (TextUtils.isEmpty(p10)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(p10);
            }
        } catch (JSONException unused) {
            n7.g(TAG, "transfor channel info to json error");
        }
        return jSONObject;
    }
}
