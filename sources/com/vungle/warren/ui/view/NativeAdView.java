package com.vungle.warren.ui.view;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import com.vungle.warren.NativeAdLayout;
import com.vungle.warren.ui.PresenterAdOpenCallback;
import com.vungle.warren.ui.contract.NativeAdContract;
import com.vungle.warren.ui.presenter.NativeAdPresenter;
import com.vungle.warren.utility.ActivityManager;
import com.vungle.warren.utility.ExternalRouter;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class NativeAdView implements NativeAdContract.NativeView, NativeAdLayout.OnItemClickListener {
    private static final String TAG = "NativeAdView";
    private final Context context;
    private Dialog currentDialog;
    private NativeAdContract.NativePresenter presenter;
    private final NativeAdLayout view;

    /* loaded from: classes2.dex */
    public static class DialogClickListenerProxy implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {
        private final AtomicReference<DialogInterface.OnClickListener> ckickRef;
        private final AtomicReference<DialogInterface.OnDismissListener> dismissRef;

        public DialogClickListenerProxy(DialogInterface.OnClickListener onClickListener, DialogInterface.OnDismissListener onDismissListener) {
            AtomicReference<DialogInterface.OnClickListener> atomicReference = new AtomicReference<>();
            this.ckickRef = atomicReference;
            AtomicReference<DialogInterface.OnDismissListener> atomicReference2 = new AtomicReference<>();
            this.dismissRef = atomicReference2;
            atomicReference.set(onClickListener);
            atomicReference2.set(onDismissListener);
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

    public NativeAdView(Context context, NativeAdLayout nativeAdLayout) {
        this.context = context;
        this.view = nativeAdLayout;
        nativeAdLayout.setOnItemClickListener(this);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void destroyAdView(long j10) {
        this.view.release();
    }

    public DialogInterface.OnDismissListener getDialogDismissListener() {
        return new DialogInterface.OnDismissListener() { // from class: com.vungle.warren.ui.view.NativeAdView.2
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                NativeAdView.this.currentDialog = null;
            }
        };
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public String getWebsiteUrl() {
        return null;
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public boolean hasWebView() {
        return false;
    }

    @Override // com.vungle.warren.ui.contract.NativeAdContract.NativeView
    public boolean isDialogVisible() {
        if (this.currentDialog != null) {
            return true;
        }
        return false;
    }

    @Override // com.vungle.warren.NativeAdLayout.OnItemClickListener
    public void onItemClicked(int i10) {
        if (i10 != 1) {
            if (i10 == 2) {
                this.presenter.onPrivacy();
                return;
            }
            return;
        }
        this.presenter.onDownload();
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void open(String str, String str2, ActivityManager.LeftApplicationCallback leftApplicationCallback, PresenterAdOpenCallback presenterAdOpenCallback) {
        if (!ExternalRouter.launch(str, str2, this.context, leftApplicationCallback, true, presenterAdOpenCallback)) {
            Log.e(TAG, "Cannot open url " + str2);
        }
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void refreshDialogIfVisible() {
        if (isDialogVisible()) {
            this.currentDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.vungle.warren.ui.view.NativeAdView.3
                @Override // android.content.DialogInterface.OnDismissListener
                public void onDismiss(DialogInterface dialogInterface) {
                    NativeAdView.this.currentDialog.setOnDismissListener(NativeAdView.this.getDialogDismissListener());
                }
            });
            this.currentDialog.dismiss();
            this.currentDialog.show();
        }
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void showDialog(String str, String str2, String str3, String str4, final DialogInterface.OnClickListener onClickListener) {
        Context context = this.context;
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(context, context.getApplicationInfo().theme));
        DialogClickListenerProxy dialogClickListenerProxy = new DialogClickListenerProxy(new DialogInterface.OnClickListener() { // from class: com.vungle.warren.ui.view.NativeAdView.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                NativeAdView.this.currentDialog = null;
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

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void setPresenter(NativeAdPresenter nativeAdPresenter) {
        this.presenter = nativeAdPresenter;
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void close() {
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void pauseWeb() {
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void removeWebView() {
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void resumeWeb() {
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void setImmersiveMode() {
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void showCloseButton() {
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void setOrientation(int i10) {
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void showWebsite(String str) {
    }
}
