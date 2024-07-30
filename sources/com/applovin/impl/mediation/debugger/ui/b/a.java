package com.applovin.impl.mediation.debugger.ui.b;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.mediation.debugger.ui.b.b;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.b;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.mediation.MaxDebuggerTestModeNetworkActivity;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.debugger.ui.a {

    /* renamed from: a, reason: collision with root package name */
    private b f18057a;

    /* renamed from: b, reason: collision with root package name */
    private DataSetObserver f18058b;

    /* renamed from: c, reason: collision with root package name */
    private FrameLayout f18059c;

    /* renamed from: d, reason: collision with root package name */
    private ListView f18060d;

    /* renamed from: e, reason: collision with root package name */
    private com.applovin.impl.adview.a f18061e;

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        com.applovin.impl.adview.a aVar = this.f18061e;
        if (aVar != null) {
            aVar.b();
            this.f18059c.removeView(this.f18061e);
            this.f18061e = null;
        }
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a
    public p getSdk() {
        b bVar = this.f18057a;
        if (bVar != null) {
            return bVar.c();
        }
        return null;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.f18059c = (FrameLayout) findViewById(android.R.id.content);
        this.f18060d = (ListView) findViewById(R.id.listView);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        b bVar = this.f18057a;
        if (bVar != null) {
            bVar.unregisterDataSetObserver(this.f18058b);
            this.f18057a.a((d.a) null);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (R.id.action_share == menuItem.getItemId()) {
            a();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.f18060d.setAdapter((ListAdapter) this.f18057a);
        b bVar = this.f18057a;
        if (bVar != null && !bVar.a()) {
            b();
        }
    }

    public void setListAdapter(b bVar, final com.applovin.impl.sdk.a aVar) {
        DataSetObserver dataSetObserver;
        b bVar2 = this.f18057a;
        if (bVar2 != null && (dataSetObserver = this.f18058b) != null) {
            bVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f18057a = bVar;
        this.f18058b = new DataSetObserver() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.1
            @Override // android.database.DataSetObserver
            public void onChanged() {
                a.this.c();
                a aVar2 = a.this;
                aVar2.a((Context) aVar2);
            }
        };
        a((Context) this);
        this.f18057a.registerDataSetObserver(this.f18058b);
        this.f18057a.a(new d.a() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.2
            @Override // com.applovin.impl.mediation.debugger.ui.d.d.a
            public void a(com.applovin.impl.mediation.debugger.ui.d.a aVar2, final c cVar) {
                int a10 = aVar2.a();
                if (a10 != b.EnumC0213b.APP_INFO.ordinal() && a10 != b.EnumC0213b.MAX.ordinal()) {
                    if (a10 == b.EnumC0213b.ADS.ordinal()) {
                        if (aVar2.b() == b.a.AD_UNITS.ordinal()) {
                            if (a.this.f18057a.d().size() > 0) {
                                com.applovin.impl.sdk.utils.b.a(a.this, MaxDebuggerAdUnitsListActivity.class, aVar, new b.a<MaxDebuggerAdUnitsListActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.2.1
                                    @Override // com.applovin.impl.sdk.utils.b.a
                                    public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                                        maxDebuggerAdUnitsListActivity.initialize(a.this.f18057a.d(), false, a.this.f18057a.c());
                                    }
                                });
                                return;
                            } else {
                                Utils.showAlert("No live ad units", "Please setup or enable your MAX ad units on https://applovin.com.", a.this);
                                return;
                            }
                        }
                        if (aVar2.b() == b.a.SELECT_LIVE_NETWORKS.ordinal()) {
                            if (a.this.f18057a.i().size() <= 0 && a.this.f18057a.j().size() <= 0) {
                                Utils.showAlert("Complete Integrations", "Please complete integrations in order to access this.", a.this);
                                return;
                            } else if (a.this.f18057a.c().av().a()) {
                                Utils.showAlert("Restart Required", cVar.m(), a.this);
                                return;
                            } else {
                                com.applovin.impl.sdk.utils.b.a(a.this, MaxDebuggerTestLiveNetworkActivity.class, aVar, new b.a<MaxDebuggerTestLiveNetworkActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.2.2
                                    @Override // com.applovin.impl.sdk.utils.b.a
                                    public void a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                                        maxDebuggerTestLiveNetworkActivity.initialize(a.this.f18057a.i(), a.this.f18057a.j(), a.this.f18057a.c());
                                    }
                                });
                                return;
                            }
                        }
                        if (aVar2.b() == b.a.SELECT_TEST_MODE_NETWORKS.ordinal()) {
                            if (!a.this.f18057a.c().av().a()) {
                                a.this.getSdk().av().d();
                                Utils.showAlert("Restart Required", cVar.m(), a.this);
                                return;
                            } else if (a.this.f18057a.k().size() > 0) {
                                com.applovin.impl.sdk.utils.b.a(a.this, MaxDebuggerTestModeNetworkActivity.class, aVar, new b.a<MaxDebuggerTestModeNetworkActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.2.3
                                    @Override // com.applovin.impl.sdk.utils.b.a
                                    public void a(MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity) {
                                        maxDebuggerTestModeNetworkActivity.initialize(a.this.f18057a.k(), a.this.f18057a.c());
                                    }
                                });
                                return;
                            } else {
                                Utils.showAlert("Complete Integrations", "Please complete integrations in order to access this.", a.this);
                                return;
                            }
                        }
                        if (aVar2.b() == b.a.INITIALIZATION_AD_UNITS.ordinal()) {
                            com.applovin.impl.sdk.utils.b.a(a.this, MaxDebuggerAdUnitsListActivity.class, aVar, new b.a<MaxDebuggerAdUnitsListActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.2.4
                                @Override // com.applovin.impl.sdk.utils.b.a
                                public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                                    maxDebuggerAdUnitsListActivity.initialize(a.this.f18057a.f(), true, a.this.f18057a.c());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if ((a10 == b.EnumC0213b.INCOMPLETE_NETWORKS.ordinal() || a10 == b.EnumC0213b.COMPLETED_NETWORKS.ordinal()) && (cVar instanceof com.applovin.impl.mediation.debugger.ui.b.a.a)) {
                        com.applovin.impl.sdk.utils.b.a(a.this, MaxDebuggerDetailActivity.class, aVar, new b.a<MaxDebuggerDetailActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.2.5
                            @Override // com.applovin.impl.sdk.utils.b.a
                            public void a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                                maxDebuggerDetailActivity.initialize(((com.applovin.impl.mediation.debugger.ui.b.a.a) cVar).f());
                            }
                        });
                        return;
                    }
                    return;
                }
                Utils.showAlert(cVar.l(), cVar.m(), a.this);
            }
        });
    }

    private void b() {
        c();
        com.applovin.impl.adview.a aVar = new com.applovin.impl.adview.a(this, 50, android.R.attr.progressBarStyleLarge);
        this.f18061e = aVar;
        aVar.setColor(-3355444);
        this.f18059c.addView(this.f18061e, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f18059c.bringChildToFront(this.f18061e);
        this.f18061e.a();
    }

    private void a() {
        String l10 = this.f18057a.l();
        if (TextUtils.isEmpty(l10)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", l10);
        intent.putExtra("android.intent.extra.TITLE", "Mediation Debugger logs");
        intent.putExtra("android.intent.extra.SUBJECT", "MAX Mediation Debugger logs");
        startActivity(Intent.createChooser(intent, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Context context) {
        if (!StringUtils.isValidString(this.f18057a.h()) || this.f18057a.b()) {
            return;
        }
        this.f18057a.a(true);
        runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.3
            @Override // java.lang.Runnable
            public void run() {
                Utils.showAlert(a.this.f18057a.g(), a.this.f18057a.h(), context);
            }
        });
    }
}
