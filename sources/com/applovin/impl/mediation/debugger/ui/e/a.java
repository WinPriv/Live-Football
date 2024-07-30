package com.applovin.impl.mediation.debugger.ui.e;

import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.mediation.debugger.b.a.d;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.d.e;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.debugger.ui.a {

    /* renamed from: a, reason: collision with root package name */
    private p f18171a;

    /* renamed from: b, reason: collision with root package name */
    private List<d> f18172b;

    /* renamed from: c, reason: collision with root package name */
    private List<d> f18173c;

    /* renamed from: d, reason: collision with root package name */
    private com.applovin.impl.mediation.debugger.ui.d.d f18174d;

    /* renamed from: e, reason: collision with root package name */
    private List<c> f18175e;
    private List<c> f;

    /* renamed from: g, reason: collision with root package name */
    private ListView f18176g;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.e.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0215a {
        BIDDERS,
        WATERFALL,
        COUNT
    }

    public a() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a
    public p getSdk() {
        return this.f18171a;
    }

    public void initialize(List<d> list, List<d> list2, final p pVar) {
        this.f18171a = pVar;
        this.f18172b = list;
        this.f18173c = list2;
        this.f18175e = a(list);
        this.f = a(list2);
        com.applovin.impl.mediation.debugger.ui.d.d dVar = new com.applovin.impl.mediation.debugger.ui.d.d(this) { // from class: com.applovin.impl.mediation.debugger.ui.e.a.1
            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public int a(int i10) {
                if (i10 == EnumC0215a.BIDDERS.ordinal()) {
                    return a.this.f18175e.size();
                }
                return a.this.f.size();
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public c b(int i10) {
                if (i10 == EnumC0215a.BIDDERS.ordinal()) {
                    return new e("BIDDERS");
                }
                return new e("WATERFALL");
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public List<c> c(int i10) {
                if (i10 != EnumC0215a.BIDDERS.ordinal()) {
                    return a.this.f;
                }
                return a.this.f18175e;
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public int e() {
                return EnumC0215a.COUNT.ordinal();
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public c n() {
                return new c.a(c.b.SECTION_CENTERED).a("Select a network to load ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
            }
        };
        this.f18174d = dVar;
        dVar.a(new d.a() { // from class: com.applovin.impl.mediation.debugger.ui.e.a.2
            @Override // com.applovin.impl.mediation.debugger.ui.d.d.a
            public void a(com.applovin.impl.mediation.debugger.ui.d.a aVar, c cVar) {
                com.applovin.impl.mediation.debugger.b.a.d a10 = a.this.a(aVar);
                if (StringUtils.isValidString(a10.a()) && StringUtils.isValidString(pVar.av().c()) && a10.a().equals(pVar.av().c())) {
                    pVar.av().a(false);
                    pVar.av().a((String) null);
                    pVar.ab().a((String) null);
                } else {
                    pVar.av().a(true);
                    pVar.av().a(a10.a());
                    pVar.ab().a(a10.b());
                }
                a.this.f18174d.notifyDataSetChanged();
            }
        });
        this.f18174d.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Live Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f18176g = listView;
        listView.setAdapter((ListAdapter) this.f18174d);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f18175e = a(this.f18172b);
        this.f = a(this.f18173c);
        this.f18174d.m();
    }

    private List<c> a(List<com.applovin.impl.mediation.debugger.b.a.d> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (final com.applovin.impl.mediation.debugger.b.a.d dVar : list) {
            arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.a(dVar.c(), this) { // from class: com.applovin.impl.mediation.debugger.ui.e.a.3
                @Override // com.applovin.impl.mediation.debugger.ui.b.a.a, com.applovin.impl.mediation.debugger.ui.d.c
                public int a() {
                    if (a.this.f18171a.av().c() != null && a.this.f18171a.av().c().equals(dVar.a())) {
                        return R.drawable.applovin_ic_check_mark_borderless;
                    }
                    return 0;
                }

                @Override // com.applovin.impl.mediation.debugger.ui.b.a.a, com.applovin.impl.mediation.debugger.ui.d.c
                public int b() {
                    if (a.this.f18171a.av().c() != null && a.this.f18171a.av().c().equals(dVar.a())) {
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
                    return StringUtils.createSpannedString(dVar.b(), i10, 18, 1);
                }
            });
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.applovin.impl.mediation.debugger.b.a.d a(com.applovin.impl.mediation.debugger.ui.d.a aVar) {
        if (aVar.a() == EnumC0215a.BIDDERS.ordinal()) {
            return this.f18172b.get(aVar.b());
        }
        return this.f18173c.get(aVar.b());
    }
}
