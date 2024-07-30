package com.huawei.openalliance.ad.ppskit.activity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toolbar;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import e0.i;
import ka.Cif;
import ka.n7;

/* loaded from: classes2.dex */
public abstract class BasePureWebActivity extends PPSBaseActivity {
    public String k() {
        return "";
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity, com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowTitleEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
            if (!y1.h(k())) {
                if (!Cif.c(this)) {
                    View inflate = getLayoutInflater().inflate(R.layout.action_bar_title_layout, (ViewGroup) null);
                    actionBar.setDisplayShowCustomEnabled(true);
                    actionBar.setCustomView(inflate);
                    try {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                        Toolbar toolbar = (Toolbar) inflate.getParent();
                        if (toolbar != null) {
                            toolbar.setLayoutParams(layoutParams);
                        }
                        inflate.post(new la.a(this, inflate, toolbar));
                    } catch (Throwable unused) {
                        n7.g("BasePureWebActivity", "setCustomToolBar error.");
                    }
                    if (!y1.h(k())) {
                        ((TextView) findViewById(R.id.custom_action_bar_title)).setText(k());
                        return;
                    } else {
                        ((TextView) findViewById(R.id.custom_action_bar_title)).setText(0);
                        return;
                    }
                }
                if (!y1.h(k())) {
                    actionBar.setTitle(k());
                } else {
                    actionBar.setTitle(0);
                }
            }
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        try {
            if (menuItem.getItemId() == 16908332) {
                super.onBackPressed();
                return true;
            }
            return super.onOptionsItemSelected(menuItem);
        } catch (Throwable th) {
            i.p(th, "onOptionsItemSelected ex: ", "BasePureWebActivity");
            return false;
        }
    }
}
