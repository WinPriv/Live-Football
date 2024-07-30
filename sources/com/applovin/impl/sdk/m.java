package com.applovin.impl.sdk;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.anythink.core.api.ATAdConst;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.network.j;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m implements AppLovinCommunicatorPublisher, AppLovinCommunicatorSubscriber {

    /* renamed from: a, reason: collision with root package name */
    private final p f19017a;

    /* renamed from: b, reason: collision with root package name */
    private final AppLovinCommunicator f19018b;

    public m(p pVar) {
        this.f19017a = pVar;
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(p.y());
        this.f19018b = appLovinCommunicator;
        if (!pVar.e() && ((Boolean) pVar.a(com.applovin.impl.sdk.c.b.fZ)).booleanValue()) {
            appLovinCommunicator.a(pVar);
            appLovinCommunicator.subscribe(this, com.applovin.impl.communicator.c.f17482a);
        }
    }

    public void a(JSONObject jSONObject, boolean z10) {
        if (((Boolean) this.f19017a.a(com.applovin.impl.sdk.c.b.fZ)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f19017a.B());
            bundle.putString("applovin_random_token", this.f19017a.q());
            bundle.putString("compass_random_token", this.f19017a.p());
            bundle.putString("device_type", AppLovinSdkUtils.isTablet(p.y()) ? "tablet" : "phone");
            bundle.putString("init_success", String.valueOf(z10));
            bundle.putParcelableArrayList("installed_mediation_adapters", JsonUtils.toBundle(com.applovin.impl.mediation.d.c.a(this.f19017a)));
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "communicator_settings", (JSONObject) null);
            Bundle bundle2 = (Bundle) bundle.clone();
            bundle2.putString("user_id", this.f19017a.o());
            bundle2.putBundle("settings", JsonUtils.toBundle(JsonUtils.getJSONObject(jSONObject2, "safedk_settings")));
            this.f19017a.L();
            if (y.a()) {
                this.f19017a.L().b("CommunicatorService", "Sending \"safedk_init\" message: " + bundle);
            }
            a(bundle2, "safedk_init");
        }
    }

    public void b(com.applovin.impl.mediation.a.a aVar, String str) {
        if (((Boolean) this.f19017a.a(com.applovin.impl.sdk.c.b.fZ)).booleanValue() && this.f19018b.hasSubscriber("ad_callback_blocked_after_hidden")) {
            Bundle b10 = b(aVar);
            b10.putString("callback_name", str);
            a(b10, "ad_callback_blocked_after_hidden");
        }
    }

    public boolean c(String str) {
        return com.applovin.impl.communicator.c.f17482a.contains(str);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "applovin_sdk";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        long longValue;
        long longValue2;
        Map<String, Object> map;
        int i10;
        Map<String, Object> h10;
        Map<String, Object> d10;
        JSONObject jSONObject;
        Map<String, Object> a10;
        if (!((Boolean) this.f19017a.a(com.applovin.impl.sdk.c.b.fZ)).booleanValue()) {
            return;
        }
        if ("send_http_request".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            Map<String, String> stringMap = BundleUtils.toStringMap(messageData.getBundle("query_params"));
            Map<String, Object> map2 = BundleUtils.toMap(messageData.getBundle("post_body"));
            Map<String, String> stringMap2 = BundleUtils.toStringMap(messageData.getBundle("headers"));
            String string = messageData.getString("id", "");
            if (!map2.containsKey(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY)) {
                map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f19017a.B());
            }
            this.f19017a.al().a(new j.a().c(messageData.getString("url")).d(messageData.getString("backup_url")).a(stringMap).c(map2).b(stringMap2).a(((Boolean) this.f19017a.a(com.applovin.impl.sdk.c.b.f18726fa)).booleanValue()).a(string).a());
            return;
        }
        if ("send_http_request_v2".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData2 = appLovinCommunicatorMessage.getMessageData();
            String string2 = messageData2.getString("http_method", "POST");
            if (messageData2.containsKey("timeout_sec")) {
                longValue = TimeUnit.SECONDS.toMillis(messageData2.getLong("timeout_sec"));
            } else {
                longValue = ((Long) this.f19017a.a(com.applovin.impl.sdk.c.b.dw)).longValue();
            }
            int i11 = messageData2.getInt("retry_count", ((Integer) this.f19017a.a(com.applovin.impl.sdk.c.b.dx)).intValue());
            if (messageData2.containsKey("retry_delay_sec")) {
                longValue2 = TimeUnit.SECONDS.toMillis(messageData2.getLong("retry_delay_sec"));
            } else {
                longValue2 = ((Long) this.f19017a.a(com.applovin.impl.sdk.c.b.dy)).longValue();
            }
            Map<String, String> stringMap3 = BundleUtils.toStringMap(messageData2.getBundle("query_params"));
            long j10 = longValue2;
            if ("GET".equalsIgnoreCase(string2)) {
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    if (this.f19017a.S() != null) {
                        a10 = this.f19017a.S().a(null, false, false);
                    } else {
                        a10 = this.f19017a.R().a(null, false, false);
                    }
                    stringMap3.putAll(BundleUtils.toStringMap(CollectionUtils.toBundle(a10)));
                }
                i10 = i11;
                map = null;
            } else {
                map = BundleUtils.toMap(messageData2.getBundle("post_body"));
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    if (this.f19017a.S() != null) {
                        h10 = this.f19017a.S().d();
                        d10 = this.f19017a.S().b();
                    } else {
                        h10 = this.f19017a.R().h();
                        d10 = this.f19017a.R().d();
                    }
                    if (d10.containsKey("idfv") && d10.containsKey("idfv_scope")) {
                        i10 = i11;
                        String str = (String) d10.get("idfv");
                        int intValue = ((Integer) d10.get("idfv_scope")).intValue();
                        d10.remove("idfv");
                        d10.remove("idfv_scope");
                        h10.put("idfv", str);
                        h10.put("idfv_scope", Integer.valueOf(intValue));
                    } else {
                        i10 = i11;
                    }
                    h10.put("server_installed_at", this.f19017a.a(com.applovin.impl.sdk.c.b.al));
                    h10.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f19017a.B());
                    map.put("app", h10);
                    map.put("device", d10);
                } else {
                    i10 = i11;
                }
            }
            c.a b10 = com.applovin.impl.sdk.network.c.a(this.f19017a).a(messageData2.getString("url")).c(messageData2.getString("backup_url")).a(stringMap3).b(string2).b(BundleUtils.toStringMap(messageData2.getBundle("headers")));
            if (map != null) {
                jSONObject = new JSONObject(map);
            } else {
                jSONObject = null;
            }
            this.f19017a.M().a(new com.applovin.impl.sdk.network.a(appLovinCommunicatorMessage.getPublisherId(), b10.a(jSONObject).b((int) longValue).a(i10).c((int) j10).a((c.a) new JSONObject()).c(messageData2.getBoolean("is_encoding_enabled", false)).a(), this.f19017a), o.a.MAIN);
            return;
        }
        if ("set_ad_request_query_params".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
            this.f19017a.E().addCustomQueryParams(Utils.stringifyObjectMap(BundleUtils.toMap(appLovinCommunicatorMessage.getMessageData())));
        } else if ("set_ad_request_post_body".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
            this.f19017a.E().setCustomPostBody(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
        } else if ("set_mediate_request_post_body_data".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
            this.f19017a.ap().setCustomPostBodyData(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
        }
    }

    public void b(String str) {
        if (((Boolean) this.f19017a.a(com.applovin.impl.sdk.c.b.fZ)).booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                a(Bundle.EMPTY, "test_mode_network_updated");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("test_mode_network", str);
            a(bundle, "test_mode_network_updated");
        }
    }

    private Bundle b(com.applovin.impl.mediation.a.a aVar) {
        String str;
        Bundle bundle = new Bundle();
        bundle.putString("id", aVar.g());
        bundle.putString(ATAdConst.NETWORK_CUSTOM_KEY.NETWORK_NAME, aVar.X());
        bundle.putString("max_ad_unit_id", aVar.getAdUnitId());
        bundle.putString("third_party_ad_placement_id", aVar.r());
        bundle.putString(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, aVar.getFormat().getLabel());
        if (StringUtils.isValidString(aVar.getCreativeId())) {
            bundle.putString("creative_id", aVar.getCreativeId());
        }
        if (StringUtils.isValidString(aVar.getDspName())) {
            bundle.putString("dsp_name", aVar.getDspName());
        }
        if (aVar.o() != null && StringUtils.isValidString(aVar.o().getLabel())) {
            bundle.putString("hybrid_ad_format", aVar.o().getLabel());
        }
        if (aVar.n()) {
            bundle.putString("custom_js_network_name", aVar.getNetworkName());
        } else if ("CUSTOM_NETWORK_SDK".equalsIgnoreCase(aVar.X())) {
            bundle.putString("custom_sdk_network_name", aVar.getNetworkName());
        }
        bundle.putAll(JsonUtils.toBundle(aVar.b()));
        if (aVar instanceof com.applovin.impl.mediation.a.b) {
            View q10 = ((com.applovin.impl.mediation.a.b) aVar).q();
            if (q10 != null) {
                str = q10.getClass().getName() + '@' + Integer.toHexString(q10.hashCode());
            } else {
                str = "N/A";
            }
            bundle.putString("ad_view", str);
        }
        return bundle;
    }

    public void a(com.applovin.impl.mediation.a.a aVar, String str) {
        if (((Boolean) this.f19017a.a(com.applovin.impl.sdk.c.b.fZ)).booleanValue() && this.f19018b.hasSubscriber("max_ad_events")) {
            Bundle b10 = b(aVar);
            b10.putString("type", str);
            this.f19017a.L();
            if (y.a()) {
                this.f19017a.L().b("CommunicatorService", "Sending \"max_ad_events\" message: " + b10);
            }
            a(b10, "max_ad_events");
        }
    }

    public void a(com.applovin.impl.mediation.a.a aVar) {
        if (((Boolean) this.f19017a.a(com.applovin.impl.sdk.c.b.fZ)).booleanValue() && this.f19018b.hasSubscriber("max_revenue_events")) {
            Bundle b10 = b(aVar);
            b10.putAll(JsonUtils.toBundle(aVar.d()));
            b10.putString(com.anythink.expressad.foundation.g.a.bD, this.f19017a.ax().getCountryCode());
            BundleUtils.putStringIfValid("user_segment", this.f19017a.D().getName(), b10);
            a(b10, "max_revenue_events");
        }
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (((Boolean) this.f19017a.a(com.applovin.impl.sdk.c.b.fZ)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString(com.anythink.core.common.l.f6263z, str);
            bundle.putInt("init_status", initializationStatus.getCode());
            a(bundle, "adapter_initialization_status");
        }
    }

    public void a() {
        if (((Boolean) this.f19017a.a(com.applovin.impl.sdk.c.b.fZ)).booleanValue()) {
            a(new Bundle(), "privacy_setting_updated");
        }
    }

    public void a(String str, String str2) {
        if (((Boolean) this.f19017a.a(com.applovin.impl.sdk.c.b.fZ)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString(com.anythink.core.common.l.f6263z, str2);
            bundle.putString("sdk_version", str);
            a(bundle, "network_sdk_version_updated");
        }
    }

    public void a(String str) {
        if (((Boolean) this.f19017a.a(com.applovin.impl.sdk.c.b.fZ)).booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                a(Bundle.EMPTY, "live_network_updated");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("live_network", str);
            a(bundle, "live_network_updated");
        }
    }

    public void a(String str, String str2, String str3) {
        if (((Boolean) this.f19017a.a(com.applovin.impl.sdk.c.b.fZ)).booleanValue()) {
            String maybeConvertToIndentedString = JsonUtils.maybeConvertToIndentedString(str3, 2);
            String maybeConvertToIndentedString2 = JsonUtils.maybeConvertToIndentedString(str, 2);
            Bundle bundle = new Bundle();
            bundle.putString("request_url", str2);
            bundle.putString("request_body", maybeConvertToIndentedString);
            bundle.putString("response", maybeConvertToIndentedString2);
            a(bundle, "responses");
        }
    }

    public void a(String str, String str2, int i10, Object obj, String str3, boolean z10) {
        if (((Boolean) this.f19017a.a(com.applovin.impl.sdk.c.b.fZ)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("id", str);
            bundle.putString("url", str2);
            bundle.putInt("code", i10);
            bundle.putBundle("body", JsonUtils.toBundle(obj));
            bundle.putBoolean("success", z10);
            BundleUtils.putString("error_message", str3, bundle);
            a(bundle, "receive_http_response");
        }
    }

    public void a(Bundle bundle, String str) {
        if (((Boolean) this.f19017a.a(com.applovin.impl.sdk.c.b.fZ)).booleanValue() && !this.f19017a.e()) {
            this.f19018b.getMessagingService().publish(CommunicatorMessageImpl.create(bundle, str, this));
        }
    }
}
