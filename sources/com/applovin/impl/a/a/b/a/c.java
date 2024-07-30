package com.applovin.impl.a.a.b.a;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.l;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class c extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.a.a.a.a f16926a;

    /* renamed from: b, reason: collision with root package name */
    private p f16927b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f16928c;

    /* renamed from: d, reason: collision with root package name */
    private Button f16929d;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(this.f16926a.a() + " - " + this.f16926a.b());
        setContentView(R.layout.creative_debugger_displayed_ad_detail_activity);
        a();
        Button button = (Button) findViewById(R.id.report_ad_button);
        this.f16929d = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.a.a.b.a.c.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                c.this.f16927b.af().a(c.this.f16926a, c.this, true);
            }
        });
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.creative_debugger_displayed_ad_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (R.id.action_share == menuItem.getItemId()) {
            this.f16927b.af().a(this.f16926a, this, false);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void a(com.applovin.impl.a.a.a.a aVar, p pVar) {
        this.f16926a = aVar;
        this.f16927b = pVar;
    }

    private void a() {
        l lVar = new l();
        lVar.a(this.f16927b.af().a(this.f16926a));
        String b10 = this.f16927b.af().b(this.f16926a.c());
        if (b10 != null) {
            lVar.a("\nBid Response Preview:\n");
            lVar.a(b10);
        }
        TextView textView = (TextView) findViewById(R.id.email_report_tv);
        this.f16928c = textView;
        textView.setText(lVar.toString());
        this.f16928c.setTextColor(-16777216);
    }
}
