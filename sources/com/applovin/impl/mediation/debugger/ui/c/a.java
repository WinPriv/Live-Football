package com.applovin.impl.mediation.debugger.ui.c;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.anythink.core.common.l;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.mediation.debugger.b.c.b;
import com.applovin.impl.mediation.debugger.ui.c.b;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.b;
import com.applovin.mediation.MaxDebuggerMultiAdActivity;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.debugger.ui.a {

    /* renamed from: a, reason: collision with root package name */
    private b f18111a;

    /* renamed from: b, reason: collision with root package name */
    private ListView f18112b;

    public a() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a
    public p getSdk() {
        b bVar = this.f18111a;
        if (bVar != null) {
            return bVar.a().y();
        }
        return null;
    }

    public void initialize(final com.applovin.impl.mediation.debugger.b.c.b bVar) {
        setTitle(bVar.i());
        b bVar2 = new b(bVar, this);
        this.f18111a = bVar2;
        bVar2.a(new d.a() { // from class: com.applovin.impl.mediation.debugger.ui.c.a.1
            @Override // com.applovin.impl.mediation.debugger.ui.d.d.a
            public void a(com.applovin.impl.mediation.debugger.ui.d.a aVar, c cVar) {
                if (aVar.a() == b.a.TEST_ADS.ordinal()) {
                    p y = bVar.y();
                    b.EnumC0208b c10 = bVar.c();
                    if (a.this.f18111a.a(aVar)) {
                        if (b.EnumC0208b.READY == c10) {
                            com.applovin.impl.sdk.utils.b.a(a.this, MaxDebuggerMultiAdActivity.class, y.w(), new b.a<MaxDebuggerMultiAdActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.c.a.1.1
                                @Override // com.applovin.impl.sdk.utils.b.a
                                public void a(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                                    maxDebuggerMultiAdActivity.initialize(bVar);
                                }
                            });
                            return;
                        } else if (b.EnumC0208b.DISABLED == c10) {
                            y.av().d();
                            Utils.showAlert(cVar.l(), cVar.m(), a.this);
                            return;
                        } else {
                            Utils.showAlert(cVar.l(), cVar.m(), a.this);
                            return;
                        }
                    }
                    Utils.showAlert(cVar.l(), cVar.m(), a.this);
                    return;
                }
                Utils.showAlert(cVar.l(), cVar.m(), a.this);
            }
        });
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f18112b = listView;
        listView.setAdapter((ListAdapter) this.f18111a);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.f18111a.a().m().equals(appLovinCommunicatorMessage.getMessageData().getString(l.f6263z, ""))) {
            this.f18111a.b();
            this.f18111a.m();
        }
    }
}
