package com.vungle.warren.ui.view;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import com.vungle.warren.ui.CloseDelegate;
import com.vungle.warren.ui.OrientationDelegate;
import com.vungle.warren.ui.PresenterAdOpenCallback;
import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter;
import com.vungle.warren.utility.ActivityManager;
import com.vungle.warren.utility.ExternalRouter;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class BaseAdView<T extends AdContract.AdvertisementPresenter> implements AdContract.AdView<T> {
    private final CloseDelegate closeDelegate;
    protected final Context context;
    protected Dialog currentDialog;
    private final OrientationDelegate orientationDelegate;
    protected final FullAdWidget view;
    protected Handler handler = new Handler(Looper.getMainLooper());
    protected final String TAG = getClass().getSimpleName();

    /* loaded from: classes2.dex */
    public static class DialogClickListenerProxy implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {
        private AtomicReference<DialogInterface.OnClickListener> ckickRef = new AtomicReference<>();
        private AtomicReference<DialogInterface.OnDismissListener> dismissRef = new AtomicReference<>();

        public DialogClickListenerProxy(DialogInterface.OnClickListener onClickListener, DialogInterface.OnDismissListener onDismissListener) {
            this.ckickRef.set(onClickListener);
            this.dismissRef.set(onDismissListener);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void autoRelease(Dialog dialog) {
            dialog.setOnDismissListener(this);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
            DialogInterface.OnClickListener onClickListener = this.ckickRef.get();
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i10);
            }
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            DialogInterface.OnDismissListener onDismissListener = this.dismissRef.get();
            if (onDismissListener != null) {
                onDismissListener.onDismiss(dialogInterface);
            }
            this.dismissRef.set(null);
            this.ckickRef.set(null);
        }
    }

    public BaseAdView(Context context, FullAdWidget fullAdWidget, OrientationDelegate orientationDelegate, CloseDelegate closeDelegate) {
        this.view = fullAdWidget;
        this.context = context;
        this.orientationDelegate = orientationDelegate;
        this.closeDelegate = closeDelegate;
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void close() {
        this.closeDelegate.close();
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void destroyAdView(long j10) {
        this.view.release(j10);
    }

    public DialogInterface.OnDismissListener getDialogDismissListener() {
        return new DialogInterface.OnDismissListener() { // from class: com.vungle.warren.ui.view.BaseAdView.2
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                BaseAdView.this.currentDialog = null;
            }
        };
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public String getWebsiteUrl() {
        return this.view.getUrl();
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public boolean hasWebView() {
        return this.view.hasWebView();
    }

    public boolean isDialogVisible() {
        if (this.currentDialog != null) {
            return true;
        }
        return false;
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void open(String str, String str2, ActivityManager.LeftApplicationCallback leftApplicationCallback, PresenterAdOpenCallback presenterAdOpenCallback) {
        Log.d(this.TAG, "Opening " + str2);
        if (!ExternalRouter.launch(str, str2, this.context, leftApplicationCallback, false, presenterAdOpenCallback)) {
            Log.e(this.TAG, "Cannot open url " + str2);
        }
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void pauseWeb() {
        this.view.pauseWeb();
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void refreshDialogIfVisible() {
        if (isDialogVisible()) {
            this.currentDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.vungle.warren.ui.view.BaseAdView.3
                @Override // android.content.DialogInterface.OnDismissListener
                public void onDismiss(DialogInterface dialogInterface) {
                    BaseAdView baseAdView = BaseAdView.this;
                    baseAdView.currentDialog.setOnDismissListener(baseAdView.getDialogDismissListener());
                }
            });
            this.currentDialog.dismiss();
            this.currentDialog.show();
        }
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void removeWebView() {
        this.view.destroyWebView(0L);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void resumeWeb() {
        this.view.resumeWeb();
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void setImmersiveMode() {
        this.view.setImmersiveMode();
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void setOrientation(int i10) {
        this.orientationDelegate.setOrientation(i10);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void showCloseButton() {
        this.view.showCloseButton(true);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void showDialog(String str, String str2, String str3, String str4, final DialogInterface.OnClickListener onClickListener) {
        Context context = this.context;
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(context, context.getApplicationInfo().theme));
        DialogClickListenerProxy dialogClickListenerProxy = new DialogClickListenerProxy(new DialogInterface.OnClickListener() { // from class: com.vungle.warren.ui.view.BaseAdView.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                BaseAdView.this.currentDialog = null;
                DialogInterface.OnClickListener onClickListener2 = onClickListener;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(dialogInterface, i10);
                }
            }
        }, getDialogDismissListener());
        if (!TextUtils.isEmpty(str)) {
            builder.setTitle(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            builder.setMessage(str2);
        }
        builder.setPositiveButton(str3, dialogClickListenerProxy);
        builder.setNegativeButton(str4, dialogClickListenerProxy);
        builder.setCancelable(false);
        AlertDialog create = builder.create();
        this.currentDialog = create;
        dialogClickListenerProxy.autoRelease(create);
        this.currentDialog.show();
    }
}
