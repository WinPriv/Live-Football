package com.huawei.openalliance.ad.activity;

import android.app.Activity;
import android.app.assist.AssistContent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.utils.SafeIntent;
import e0.i;

/* loaded from: classes2.dex */
public abstract class c extends Activity {
    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        try {
            return super.dispatchKeyEvent(keyEvent);
        } catch (Throwable th) {
            i.q(th, "dispatchKeyEvent Throwable : ", "SafeActivity");
            return false;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Throwable th) {
            i.q(th, "dispatchTouchEvent Throwable : ", "SafeActivity");
            return false;
        }
    }

    @Override // android.app.Activity
    public final <T extends View> T findViewById(int i10) {
        try {
            return (T) getWindow().findViewById(i10);
        } catch (Throwable th) {
            i.q(th, "findViewById Throwable : ", "SafeActivity");
            return null;
        }
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Throwable th) {
            ex.I("SafeActivity", "finish Throwable : ".concat(th.getClass().getSimpleName()), Boolean.TRUE);
        }
    }

    @Override // android.app.Activity
    public final void finishAffinity() {
        try {
            super.finishAffinity();
        } catch (Throwable th) {
            i.q(th, "finishAffinity: ", "SafeActivity");
        }
    }

    @Override // android.app.Activity
    public final ComponentName getCallingActivity() {
        try {
            return super.getCallingActivity();
        } catch (Throwable th) {
            i.q(th, "getCallingActivity: ", "SafeActivity");
            return null;
        }
    }

    @Override // android.app.Activity
    public final String getCallingPackage() {
        try {
            return super.getCallingPackage();
        } catch (Throwable th) {
            i.q(th, "getCallingPackage Throwable : ", "SafeActivity");
            return null;
        }
    }

    @Override // android.app.Activity
    public final Intent getIntent() {
        try {
            return new SafeIntent(super.getIntent());
        } catch (Throwable th) {
            ex.I("SafeActivity", "getIntent: ".concat(th.getClass().getSimpleName()));
            return new SafeIntent(new Intent());
        }
    }

    @Override // android.app.Activity
    public final Uri getReferrer() {
        try {
            return super.getReferrer();
        } catch (Throwable th) {
            i.q(th, "getReferrer: ", "SafeActivity");
            return null;
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        try {
            return super.getSystemService(str);
        } catch (Throwable th) {
            i.q(th, "finishAffinity: ", "SafeActivity");
            return null;
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        try {
            super.onActivityResult(i10, i11, new SafeIntent(intent));
        } catch (Throwable th) {
            i.q(th, "onActivityResult Throwable : ", "SafeActivity");
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        try {
            super.onBackPressed();
        } catch (Throwable th) {
            i.q(th, "onBackPressed Throwable : ", "SafeActivity");
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        try {
            super.onConfigurationChanged(configuration);
        } catch (Throwable th) {
            i.q(th, "onConfigurationChanged Throwable : ", "SafeActivity");
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
        } catch (Throwable th) {
            i.q(th, "onCreate Throwable : ", "SafeActivity");
        }
    }

    @Override // android.app.Activity
    public final CharSequence onCreateDescription() {
        try {
            return super.onCreateDescription();
        } catch (Throwable th) {
            i.q(th, "onCreateDescription Throwable : ", "SafeActivity");
            return null;
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        try {
            super.onDestroy();
        } catch (Throwable th) {
            i.q(th, "onDestroy Throwable : ", "SafeActivity");
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        try {
            return super.onKeyDown(i10, keyEvent);
        } catch (Throwable th) {
            i.q(th, "onKeyDown Throwable : ", "SafeActivity");
            return false;
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyLongPress(int i10, KeyEvent keyEvent) {
        try {
            return super.onKeyLongPress(i10, keyEvent);
        } catch (Throwable th) {
            i.q(th, "onKeyLongPress Throwable : ", "SafeActivity");
            return false;
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyMultiple(int i10, int i11, KeyEvent keyEvent) {
        try {
            return super.onKeyMultiple(i10, i11, keyEvent);
        } catch (Throwable th) {
            i.q(th, "onKeyMultiple Throwable : ", "SafeActivity");
            return false;
        }
    }

    @Override // android.app.Activity
    public final boolean onKeyShortcut(int i10, KeyEvent keyEvent) {
        try {
            return super.onKeyShortcut(i10, keyEvent);
        } catch (Throwable th) {
            i.q(th, "onKeyShortcut Throwable : ", "SafeActivity");
            return false;
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        try {
            return super.onKeyUp(i10, keyEvent);
        } catch (Throwable th) {
            i.q(th, "onKeyUp Throwable : ", "SafeActivity");
            return false;
        }
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        try {
            super.onMultiWindowModeChanged(z10, configuration);
        } catch (Throwable th) {
            i.q(th, "onMultiWindowModeChanged Throwable : ", "SafeActivity");
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        try {
            super.onNewIntent(intent);
        } catch (Throwable th) {
            i.q(th, "onNewIntent Throwable : ", "SafeActivity");
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        try {
            super.onPause();
        } catch (Throwable th) {
            i.q(th, "onPause Throwable : ", "SafeActivity");
        }
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        try {
            super.onPostCreate(bundle);
        } catch (Throwable th) {
            i.q(th, "onPostCreate Throwable : ", "SafeActivity");
        }
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        try {
            super.onPostResume();
        } catch (Throwable th) {
            i.q(th, "onPostResume Throwable : ", "SafeActivity");
        }
    }

    @Override // android.app.Activity
    public final void onProvideAssistContent(AssistContent assistContent) {
        try {
            super.onProvideAssistContent(assistContent);
        } catch (Throwable th) {
            i.q(th, "onProvideAssistContent Throwable : ", "SafeActivity");
        }
    }

    @Override // android.app.Activity
    public final void onProvideAssistData(Bundle bundle) {
        try {
            super.onProvideAssistData(bundle);
        } catch (Throwable th) {
            i.q(th, "onProvideAssistData Throwable : ", "SafeActivity");
        }
    }

    @Override // android.app.Activity
    public final Uri onProvideReferrer() {
        try {
            return super.onProvideReferrer();
        } catch (Throwable th) {
            i.q(th, "onProvideReferrer: ", "SafeActivity");
            return null;
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        try {
            super.onRestart();
        } catch (Throwable th) {
            i.q(th, "onRestart Throwable : ", "SafeActivity");
        }
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        try {
            super.onRestoreInstanceState(bundle);
        } catch (Throwable th) {
            i.q(th, "onRestoreInstanceState Throwable : ", "SafeActivity");
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        try {
            super.onResume();
        } catch (Throwable th) {
            i.q(th, "onResume Throwable : ", "SafeActivity");
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            super.onSaveInstanceState(bundle);
        } catch (Throwable th) {
            i.q(th, "onSaveInstanceState Throwable : ", "SafeActivity");
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        try {
            super.onStart();
        } catch (Throwable th) {
            i.q(th, "onStart Throwable : ", "SafeActivity");
        }
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        try {
            super.onStateNotSaved();
        } catch (Throwable th) {
            i.q(th, "onStateNotSaved Throwable : ", "SafeActivity");
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        try {
            super.onStop();
        } catch (Throwable th) {
            i.q(th, "onStop Throwable : ", "SafeActivity");
        }
    }

    @Override // android.app.Activity
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Throwable th) {
            i.q(th, "onKeyShortcut Throwable : ", "SafeActivity");
            return false;
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        try {
            super.onUserLeaveHint();
        } catch (Throwable th) {
            i.q(th, "onUserLeaveHint Throwable : ", "SafeActivity");
        }
    }

    @Override // android.app.Activity
    public final void recreate() {
        try {
            super.recreate();
        } catch (Throwable th) {
            i.q(th, "recreate: ", "SafeActivity");
        }
    }

    @Override // android.app.Activity
    public final void setIntent(Intent intent) {
        try {
            super.setIntent(new SafeIntent(intent));
        } catch (Throwable th) {
            i.q(th, "setIntent: ", "SafeActivity");
        }
    }

    @Override // android.app.Activity
    public final boolean showAssist(Bundle bundle) {
        try {
            return super.showAssist(bundle);
        } catch (Throwable th) {
            i.q(th, "showAssist Throwable : ", "SafeActivity");
            return false;
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivities(Intent[] intentArr) {
        try {
            super.startActivities(intentArr);
        } catch (Throwable th) {
            i.q(th, "startActivities: ", "SafeActivity");
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        try {
            intent.setClipData(w.cH);
            super.startActivity(new SafeIntent(intent));
        } catch (Throwable th) {
            i.q(th, "startActivity: ", "SafeActivity");
        }
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i10) {
        try {
            intent.setClipData(w.cH);
            super.startActivityForResult(new SafeIntent(intent), i10);
        } catch (Throwable th) {
            i.q(th, "startActivity: ", "SafeActivity");
        }
    }

    @Override // android.app.Activity
    public final boolean startActivityIfNeeded(Intent intent, int i10) {
        try {
            return super.startActivityIfNeeded(intent, i10);
        } catch (Throwable th) {
            i.q(th, "startActivityIfNeeded: ", "SafeActivity");
            return false;
        }
    }

    @Override // android.app.Activity
    public final boolean startNextMatchingActivity(Intent intent) {
        try {
            return super.startNextMatchingActivity(intent);
        } catch (Throwable th) {
            i.q(th, "startNextMatchingActivity: ", "SafeActivity");
            return false;
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        try {
            super.onCreate(bundle, persistableBundle);
        } catch (Throwable th) {
            i.q(th, "onCreate Throwable : ", "SafeActivity");
        }
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle, PersistableBundle persistableBundle) {
        try {
            super.onPostCreate(bundle, persistableBundle);
        } catch (Throwable th) {
            i.q(th, "onPostCreate Throwable : ", "SafeActivity");
        }
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        try {
            super.onRestoreInstanceState(bundle, persistableBundle);
        } catch (Throwable th) {
            i.q(th, "onRestoreInstanceState Throwable : ", "SafeActivity");
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        try {
            super.onSaveInstanceState(bundle, persistableBundle);
        } catch (Throwable th) {
            i.q(th, "onSaveInstanceState Throwable : ", "SafeActivity");
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivities(Intent[] intentArr, Bundle bundle) {
        try {
            super.startActivities(intentArr, bundle);
        } catch (Throwable th) {
            i.q(th, "startActivities: ", "SafeActivity");
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        try {
            intent.setClipData(w.cH);
            super.startActivity(new SafeIntent(intent), bundle);
        } catch (Throwable th) {
            i.q(th, "startActivity: ", "SafeActivity");
        }
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        try {
            intent.setClipData(w.cH);
            super.startActivityForResult(new SafeIntent(intent), i10, bundle);
        } catch (Throwable th) {
            i.q(th, "startActivity: ", "SafeActivity");
        }
    }

    @Override // android.app.Activity
    public final boolean startActivityIfNeeded(Intent intent, int i10, Bundle bundle) {
        try {
            return super.startActivityIfNeeded(intent, i10, bundle);
        } catch (Throwable th) {
            i.q(th, "startActivityIfNeeded: ", "SafeActivity");
            return false;
        }
    }

    @Override // android.app.Activity
    public final boolean startNextMatchingActivity(Intent intent, Bundle bundle) {
        try {
            return super.startNextMatchingActivity(intent, bundle);
        } catch (Throwable th) {
            i.q(th, "startNextMatchingActivity: ", "SafeActivity");
            return false;
        }
    }
}
