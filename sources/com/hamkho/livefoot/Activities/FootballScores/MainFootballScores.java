package com.hamkho.livefoot.Activities.FootballScores;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.hamkho.livefoot.R;
import y1.g;

/* loaded from: classes2.dex */
public class MainFootballScores extends AppCompatActivity {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f21461t = 0;

    /* renamed from: s, reason: collision with root package name */
    public g f21462s;

    public final void c(Fragment fragment) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        a aVar = new a(supportFragmentManager);
        aVar.c(R.id.Container, fragment, null, 2);
        aVar.e(false);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        finishAndRemoveTask();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005c, code lost:
    
        if (t8.l.f35592c.f() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        r10 = new android.app.Dialog(r9);
        r10.setContentView(com.hamkho.livefoot.R.layout.warning);
        r10.setCancelable(false);
        r10.getWindow().setLayout(-1, -2);
        r10.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        ((android.widget.Button) r10.findViewById(com.hamkho.livefoot.R.id.Ok)).setOnClickListener(new v8.a(r9, r10, 1));
        r10.show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0095, code lost:
    
        c(new z8.a());
        ((com.google.android.material.bottomnavigation.BottomNavigationView) r9.f21462s.f36547w).setOnItemSelectedListener(new com.applovin.exoplayer2.h.k0(r9, 6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ac, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0044, code lost:
    
        setContentView(r10);
        ((android.widget.ImageView) r9.f21462s.f36545u).setOnClickListener(new com.anythink.basead.ui.d(r9, 2));
     */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            android.view.LayoutInflater r10 = r9.getLayoutInflater()
            r0 = 2131558438(0x7f0d0026, float:1.8742192E38)
            r1 = 0
            r2 = 0
            android.view.View r10 = r10.inflate(r0, r1, r2)
            r0 = 2131361799(0x7f0a0007, float:1.834336E38)
            android.view.View r1 = a0.a.H0(r0, r10)
            r5 = r1
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            if (r5 == 0) goto Lad
            r0 = 2131361810(0x7f0a0012, float:1.8343383E38)
            android.view.View r1 = a0.a.H0(r0, r10)
            r6 = r1
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            if (r6 == 0) goto Lad
            r0 = 2131362327(0x7f0a0217, float:1.8344431E38)
            android.view.View r1 = a0.a.H0(r0, r10)
            r7 = r1
            com.google.android.material.bottomnavigation.BottomNavigationView r7 = (com.google.android.material.bottomnavigation.BottomNavigationView) r7
            if (r7 == 0) goto Lad
            y1.g r0 = new y1.g
            android.widget.RelativeLayout r10 = (android.widget.RelativeLayout) r10
            r1 = 3
            r3 = r0
            r4 = r10
            r8 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            r9.f21462s = r0
            switch(r1) {
                case 3: goto L44;
                default: goto L44;
            }
        L44:
            r9.setContentView(r10)
            y1.g r10 = r9.f21462s
            java.lang.Object r10 = r10.f36545u
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            com.anythink.basead.ui.d r0 = new com.anythink.basead.ui.d
            r1 = 2
            r0.<init>(r9, r1)
            r10.setOnClickListener(r0)
            i9.c r10 = t8.l.f35592c
            boolean r10 = r10.f()
            if (r10 == 0) goto L95
            android.app.Dialog r10 = new android.app.Dialog
            r10.<init>(r9)
            r0 = 2131558805(0x7f0d0195, float:1.8742936E38)
            r10.setContentView(r0)
            r10.setCancelable(r2)
            android.view.Window r0 = r10.getWindow()
            r1 = -1
            r2 = -2
            r0.setLayout(r1, r2)
            android.view.Window r0 = r10.getWindow()
            r1 = 17170445(0x106000d, float:2.461195E-38)
            r0.setBackgroundDrawableResource(r1)
            r0 = 2131361840(0x7f0a0030, float:1.8343444E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            v8.a r1 = new v8.a
            r2 = 1
            r1.<init>(r9, r10, r2)
            r0.setOnClickListener(r1)
            r10.show()
            goto Lac
        L95:
            z8.a r10 = new z8.a
            r10.<init>()
            r9.c(r10)
            y1.g r10 = r9.f21462s
            java.lang.Object r10 = r10.f36547w
            com.google.android.material.bottomnavigation.BottomNavigationView r10 = (com.google.android.material.bottomnavigation.BottomNavigationView) r10
            com.applovin.exoplayer2.h.k0 r0 = new com.applovin.exoplayer2.h.k0
            r1 = 6
            r0.<init>(r9, r1)
            r10.setOnItemSelectedListener(r0)
        Lac:
            return
        Lad:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hamkho.livefoot.Activities.FootballScores.MainFootballScores.onCreate(android.os.Bundle):void");
    }
}
