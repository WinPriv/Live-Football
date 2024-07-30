package com.applovin.impl.mediation.debugger.ui.testmode;

import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.d.e;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class b extends com.applovin.impl.mediation.debugger.ui.a {

    /* renamed from: a, reason: collision with root package name */
    private p f18218a;

    /* renamed from: b, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.b.c.b> f18219b;

    /* renamed from: c, reason: collision with root package name */
    private d f18220c;

    /* renamed from: d, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.ui.d.c> f18221d;

    /* renamed from: e, reason: collision with root package name */
    private ListView f18222e;

    public b() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a
    public p getSdk() {
        return this.f18218a;
    }

    public void initialize(final List<com.applovin.impl.mediation.debugger.b.c.b> list, final p pVar) {
        this.f18218a = pVar;
        this.f18219b = list;
        this.f18221d = a(list);
        d dVar = new d(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b.1
            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public int a(int i10) {
                return list.size();
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public com.applovin.impl.mediation.debugger.ui.d.c b(int i10) {
                return new e("TEST MODE NETWORKS");
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public List<com.applovin.impl.mediation.debugger.ui.d.c> c(int i10) {
                return b.this.f18221d;
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public int e() {
                return 1;
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public com.applovin.impl.mediation.debugger.ui.d.c n() {
                return new c.a(c.b.SECTION_CENTERED).a("Select a network to load test ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
            }
        };
        this.f18220c = dVar;
        dVar.a(new d.a() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b.2
            @Override // com.applovin.impl.mediation.debugger.ui.d.d.a
            public void a(com.applovin.impl.mediation.debugger.ui.d.a aVar, com.applovin.impl.mediation.debugger.ui.d.c cVar) {
                com.applovin.impl.mediation.debugger.b.c.b bVar = (com.applovin.impl.mediation.debugger.b.c.b) list.get(aVar.b());
                String h10 = bVar.h();
                String c10 = pVar.av().c();
                if (StringUtils.isValidString(h10) && StringUtils.isValidString(c10) && h10.equals(c10)) {
                    pVar.av().a(false);
                    pVar.av().a((String) null);
                    b.this.getSdk().ab().b((String) null);
                } else {
                    pVar.av().a(true);
                    pVar.av().a(h10);
                    b.this.getSdk().ab().b(bVar.i());
                }
                b.this.f18220c.notifyDataSetChanged();
            }
        });
        this.f18220c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Test Mode Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f18222e = listView;
        listView.setAdapter((ListAdapter) this.f18220c);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f18221d = a(this.f18219b);
        this.f18220c.notifyDataSetChanged();
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> a(List<com.applovin.impl.mediation.debugger.b.c.b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (final com.applovin.impl.mediation.debugger.b.c.b bVar : list) {
            arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.a(bVar, this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b.3
                @Override // com.applovin.impl.mediation.debugger.ui.b.a.a, com.applovin.impl.mediation.debugger.ui.d.c
                public int a() {
                    if (b.this.f18218a.av().c() != null && b.this.f18218a.av().c().equals(bVar.h())) {
                        return R.drawable.applovin_ic_check_mark_borderless;
                    }
                    return 0;
                }

                @Override // com.applovin.impl.mediation.debugger.ui.b.a.a, com.applovin.impl.mediation.debugger.ui.d.c
                public int b() {
                    if (b.this.f18218a.av().c() != null && b.this.f18218a.av().c().equals(bVar.h())) {
                        return -16776961;
                    }
                    return super.b();
                }

                @Override // com.applovin.impl.mediation.debugger.ui.d.c
                public SpannedString k() {
                    int i10;
                    if (c()) {
                        i10 = -16777216;
                    } else {
                        i10 = -7829368;
                    }
                    return StringUtils.createSpannedString(bVar.i(), i10, 18, 1);
                }
            });
        }
        return arrayList;
    }
}
