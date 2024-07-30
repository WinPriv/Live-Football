package com.applovin.impl.b.a;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinCFErrorImpl;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinCFError;
import com.applovin.sdk.AppLovinCFService;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b implements AppLovinCommunicatorPublisher, AppLovinCommunicatorSubscriber {

    /* renamed from: a, reason: collision with root package name */
    private final p f17234a;

    /* renamed from: b, reason: collision with root package name */
    private final c f17235b = a(p.y());

    /* renamed from: c, reason: collision with root package name */
    private final i f17236c;

    /* renamed from: d, reason: collision with root package name */
    private List<d> f17237d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f17238e;

    /* renamed from: com.applovin.impl.b.a.b$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f17239a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AppLovinCFService.OnCFCompletionCallback f17240b;

        /* renamed from: com.applovin.impl.b.a.b$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC01941 implements Runnable {
            public RunnableC01941() {
            }

            @Override // java.lang.Runnable
            public void run() {
                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                b.this.c(anonymousClass1.f17239a, new Runnable() { // from class: com.applovin.impl.b.a.b.1.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.f17236c.a(b.this.f17237d, b.this.f17238e, AnonymousClass1.this.f17239a, new AppLovinCFService.OnCFCompletionCallback() { // from class: com.applovin.impl.b.a.b.1.1.1.1
                            @Override // com.applovin.sdk.AppLovinCFService.OnCFCompletionCallback
                            public void onFlowCompleted(AppLovinCFError appLovinCFError) {
                                if (appLovinCFError == null) {
                                    b.this.f17237d = null;
                                    b.this.f17238e = false;
                                }
                                AnonymousClass1.this.f17240b.onFlowCompleted(appLovinCFError);
                            }
                        });
                    }
                });
            }
        }

        public AnonymousClass1(Activity activity, AppLovinCFService.OnCFCompletionCallback onCFCompletionCallback) {
            this.f17239a = activity;
            this.f17240b = onCFCompletionCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.b(this.f17239a, new RunnableC01941());
        }
    }

    public b(p pVar) {
        this.f17234a = pVar;
        this.f17236c = new i(pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Uri j() {
        com.applovin.impl.sdk.c.b<String> bVar;
        if (this.f17234a.g()) {
            bVar = com.applovin.impl.sdk.c.b.fV;
        } else {
            bVar = com.applovin.impl.sdk.c.b.fU;
        }
        return Uri.parse((String) this.f17234a.a(bVar));
    }

    public List<Uri> f() {
        List<Uri> f = a().f();
        if (a().g()) {
            f.addAll(a(com.applovin.impl.sdk.c.b.fY));
        }
        return f;
    }

    public boolean g() {
        p pVar = p.f19228a;
        if (!pVar.f()) {
            return false;
        }
        b ae = pVar.ae();
        List<d> list = ae.f17237d;
        if (!ae.f17236c.a() && (list == null || list.size() <= 0)) {
            return false;
        }
        return true;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "consent_flow_manager";
    }

    public JSONObject h() {
        String str;
        c a10 = a();
        Uri b10 = a10.b();
        Uri c10 = a10.c();
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "enabled", String.valueOf(b()));
        String str2 = "";
        if (b10 == null) {
            str = "";
        } else {
            str = b10.toString();
        }
        JsonUtils.putString(jSONObject, "privacy_policy_url", str);
        if (c10 != null) {
            str2 = c10.toString();
        }
        JsonUtils.putString(jSONObject, "terms_of_service_url", str2);
        return jSONObject;
    }

    public String i() {
        a();
        Object c10 = c();
        Object d10 = d();
        StringBuilder sb2 = new StringBuilder("\nConsent Flow Enabled - ");
        sb2.append(b());
        sb2.append("\nPrivacy Policy - ");
        if (c10 == null) {
            c10 = "undefined";
        }
        sb2.append(c10);
        sb2.append("\nTerms of Service - ");
        if (d10 == null) {
            d10 = "undefined";
        }
        sb2.append(d10);
        return sb2.toString();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        Uri d10 = d();
        if (appLovinCommunicatorMessage.getMessageData().getBoolean("gdpr_flow")) {
            this.f17237d = j.c(this.f17234a);
            this.f17238e = true;
        } else if (d10 != null && appLovinCommunicatorMessage.getMessageData().getBoolean("include_tos")) {
            this.f17237d = j.b(this.f17234a);
        } else {
            this.f17237d = j.a(this.f17234a);
        }
        if (this.f17237d.size() == 0) {
            Utils.showAlert("No Consent Flow Available", (String) null, this.f17234a.x());
        } else {
            a(this.f17234a.x(), new AppLovinCFService.OnCFCompletionCallback() { // from class: com.applovin.impl.b.a.b.5
                @Override // com.applovin.sdk.AppLovinCFService.OnCFCompletionCallback
                public void onFlowCompleted(AppLovinCFError appLovinCFError) {
                    AppLovinCommunicatorMessage appLovinCommunicatorMessage2 = new AppLovinCommunicatorMessage(new Bundle(), "sdk_consent_flow_finished", b.this);
                    p unused = b.this.f17234a;
                    AppLovinCommunicator.getInstance(p.y()).getMessagingService().publish(appLovinCommunicatorMessage2);
                }
            });
        }
    }

    public Uri c() {
        return a().b();
    }

    public Uri d() {
        return a().c();
    }

    public List<Uri> e() {
        List<Uri> d10 = a().d();
        if (a().e()) {
            d10.addAll(a(com.applovin.impl.sdk.c.b.fX));
        }
        return d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final Activity activity, Runnable runnable) {
        if (f().isEmpty()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.b.a.b.4
                @Override // java.lang.Runnable
                public void run() {
                    final Uri j10 = b.this.j();
                    new AlertDialog.Builder(activity).setTitle("Missing Analytics Partner URLs").setMessage("You cannot use the AppLovin SDK's consent flow without adding a list of analytics partner URLs").setNeutralButton("Go To Documentation", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.b.a.b.4.2
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i10) {
                            p unused = b.this.f17234a;
                            Utils.openUri(p.y(), j10, b.this.f17234a);
                            throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without adding a list of analytics partner URLs Please refer to " + j10.toString());
                        }
                    }).setNegativeButton("DISMISS", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.b.a.b.4.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i10) {
                            throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without adding a list of analytics partner URLs Please refer to " + j10.toString());
                        }
                    }).create().show();
                }
            });
        } else {
            runnable.run();
        }
    }

    public boolean b() {
        Map<String, String> extraParameters = this.f17234a.C().getExtraParameters();
        return extraParameters.containsKey("consent_flow_enabled") ? Boolean.parseBoolean(extraParameters.get("consent_flow_enabled")) && this.f17234a.h() : a().a() && this.f17234a.h();
    }

    public c a() {
        return this.f17235b;
    }

    private List<Uri> a(com.applovin.impl.sdk.c.b<String> bVar) {
        List<String> b10 = this.f17234a.b(bVar);
        ArrayList arrayList = new ArrayList(b10.size());
        Iterator<String> it = b10.iterator();
        while (it.hasNext()) {
            arrayList.add(Uri.parse(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final Activity activity, Runnable runnable) {
        if (e().isEmpty()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.b.a.b.3
                @Override // java.lang.Runnable
                public void run() {
                    final Uri j10 = b.this.j();
                    new AlertDialog.Builder(activity).setTitle("Missing Advertising Partner URLs").setMessage("You cannot use the AppLovin SDK's consent flow without adding a list of advertising partner URLs").setNeutralButton("Go To Documentation", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.b.a.b.3.2
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i10) {
                            p unused = b.this.f17234a;
                            Utils.openUri(p.y(), j10, b.this.f17234a);
                            throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without adding a list of advertising partner URLs Please refer to " + j10.toString());
                        }
                    }).setNegativeButton("DISMISS", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.b.a.b.3.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i10) {
                            throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without adding a list of advertising partner URLs Please refer to " + j10.toString());
                        }
                    }).create().show();
                }
            });
        } else {
            runnable.run();
        }
    }

    @SuppressLint({"DiscouragedApi"})
    public static c a(Context context) {
        String rawResourceString = Utils.getRawResourceString(context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName()), context, null);
        JSONObject jSONObject = JsonUtils.getJSONObject(StringUtils.isValidString(rawResourceString) ? JsonUtils.jsonObjectFromJsonString(rawResourceString, new JSONObject()) : new JSONObject(), "consent_flow_settings", new JSONObject());
        Boolean bool = JsonUtils.getBoolean(jSONObject, "consent_flow_enabled", Boolean.FALSE);
        String string = JsonUtils.getString(jSONObject, "consent_flow_terms_of_service", null);
        Uri parse = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        String string2 = JsonUtils.getString(jSONObject, "consent_flow_privacy_policy", null);
        Uri parse2 = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        List<Uri> a10 = a(jSONObject, "consent_flow_advertising_partners");
        Boolean bool2 = Boolean.TRUE;
        return new c(bool.booleanValue(), parse2, parse, a10, JsonUtils.getBoolean(jSONObject, "consent_flow_should_include_default_advertising_partners", bool2).booleanValue(), a(jSONObject, "consent_flow_analytics_partners"), JsonUtils.getBoolean(jSONObject, "consent_flow_should_include_default_analytics_partners", bool2).booleanValue());
    }

    private static List<Uri> a(JSONObject jSONObject, String str) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray, i10, null);
            if (objectAtIndex instanceof String) {
                arrayList.add(Uri.parse((String) objectAtIndex));
            } else {
                y.h("AppLovinSdk", "URIs need to be of type string");
            }
        }
        return arrayList;
    }

    public void a(Activity activity, AppLovinCFService.OnCFCompletionCallback onCFCompletionCallback) {
        List<d> list = this.f17237d;
        if (list != null && list.size() > 0 && b()) {
            a(activity, new AnonymousClass1(activity, onCFCompletionCallback));
        } else {
            onCFCompletionCallback.onFlowCompleted(new AppLovinCFErrorImpl(-100, "Failed to start consent flow. Please make sure that the consent flow is enabled."));
        }
    }

    private void a(final Activity activity, Runnable runnable) {
        if (a().b() == null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.b.a.b.2
                @Override // java.lang.Runnable
                public void run() {
                    final Uri j10 = b.this.j();
                    new AlertDialog.Builder(activity).setTitle("Missing Privacy Policy URL").setMessage("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL").setNeutralButton("Go To Documentation", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.b.a.b.2.2
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i10) {
                            p unused = b.this.f17234a;
                            Utils.openUri(p.y(), j10, b.this.f17234a);
                            throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL Please refer to " + j10.toString());
                        }
                    }).setNegativeButton("DISMISS", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.b.a.b.2.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i10) {
                            throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL Please refer to " + j10.toString());
                        }
                    }).create().show();
                }
            });
        } else {
            runnable.run();
        }
    }

    public void a(boolean z10) {
        if (!this.f17234a.e() && b()) {
            this.f17234a.L();
            if (y.a()) {
                this.f17234a.L().b("AppLovinSdk", "Generating consent flow...");
            }
            this.f17237d = a.a(this.f17234a, z10);
            this.f17238e = z10;
            this.f17234a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<Boolean>>) com.applovin.impl.sdk.c.d.f18750s, (com.applovin.impl.sdk.c.d<Boolean>) Boolean.FALSE);
        }
        if (Utils.isTestApp(p.y())) {
            AppLovinCommunicator.getInstance(p.y()).subscribe(this, "start_sdk_consent_flow");
        }
    }
}
