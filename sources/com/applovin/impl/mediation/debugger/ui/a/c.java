package com.applovin.impl.mediation.debugger.ui.a;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.d.e;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.b;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class c extends com.applovin.impl.mediation.debugger.ui.a {

    /* renamed from: a, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.b.a.a> f18039a;

    /* renamed from: b, reason: collision with root package name */
    private p f18040b;

    /* renamed from: c, reason: collision with root package name */
    private com.applovin.impl.mediation.debugger.ui.d.d f18041c;

    /* renamed from: d, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.ui.d.c> f18042d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f18043e;
    private ListView f;

    @Override // com.applovin.impl.mediation.debugger.ui.a
    public p getSdk() {
        return this.f18040b;
    }

    public void initialize(final List<com.applovin.impl.mediation.debugger.b.a.a> list, boolean z10, final p pVar) {
        this.f18039a = list;
        this.f18043e = z10;
        this.f18040b = pVar;
        this.f18042d = a(list);
        com.applovin.impl.mediation.debugger.ui.d.d dVar = new com.applovin.impl.mediation.debugger.ui.d.d(this) { // from class: com.applovin.impl.mediation.debugger.ui.a.c.1
            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public int a(int i10) {
                return list.size();
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public com.applovin.impl.mediation.debugger.ui.d.c b(int i10) {
                return new e("");
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public List<com.applovin.impl.mediation.debugger.ui.d.c> c(int i10) {
                return c.this.f18042d;
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public int e() {
                return 1;
            }
        };
        this.f18041c = dVar;
        dVar.a(new d.a() { // from class: com.applovin.impl.mediation.debugger.ui.a.c.2
            @Override // com.applovin.impl.mediation.debugger.ui.d.d.a
            public void a(final com.applovin.impl.mediation.debugger.ui.d.a aVar, com.applovin.impl.mediation.debugger.ui.d.c cVar) {
                com.applovin.impl.sdk.utils.b.a(c.this, MaxDebuggerAdUnitDetailActivity.class, pVar.w(), new b.a<MaxDebuggerAdUnitDetailActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.a.c.2.1
                    @Override // com.applovin.impl.sdk.utils.b.a
                    public void a(MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
                        maxDebuggerAdUnitDetailActivity.initialize((com.applovin.impl.mediation.debugger.b.a.a) list.get(aVar.b()), null, pVar);
                    }
                });
            }
        });
        this.f18041c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (this.f18043e) {
            str = "Selective Init ";
        } else {
            str = "";
        }
        setTitle(str.concat("Ad Units"));
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f = listView;
        listView.setAdapter((ListAdapter) this.f18041c);
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> a(List<com.applovin.impl.mediation.debugger.b.a.a> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (com.applovin.impl.mediation.debugger.b.a.a aVar : list) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ID\t\t\t\t\t\t", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(aVar.a(), -16777216));
            spannableStringBuilder.append((CharSequence) new SpannedString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("FORMAT  ", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(aVar.c(), -16777216));
            arrayList.add(com.applovin.impl.mediation.debugger.ui.d.c.a(c.b.DETAIL).a(StringUtils.createSpannedString(aVar.b(), -16777216, 18, 1)).b(new SpannedString(spannableStringBuilder)).a(this).a(true).a());
        }
        return arrayList;
    }
}
