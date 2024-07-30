package a0;

import a8.g;
import ab.j;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.Address;
import android.location.Geocoder;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.Trace;
import android.renderscript.BaseObj;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.activity.n;
import androidx.appcompat.widget.v0;
import com.anythink.expressad.exoplayer.h.o;
import com.anythink.expressad.exoplayer.k.p;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.huawei.hms.ads.cy;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.constant.bi;
import com.huawei.openalliance.ad.constant.s;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.msgnotify.NotifyCallback;
import com.huawei.openalliance.ad.ppskit.beans.feedback.AdditionalContext;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.beans.inner.AnalysisEventReport;
import com.huawei.openalliance.ad.ppskit.beans.inner.CountryCodeBean;
import com.huawei.openalliance.ad.ppskit.beans.metadata.MetaData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;
import com.huawei.openalliance.ad.ppskit.handlers.l;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import com.huawei.openalliance.ad.ppskit.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.ppskit.msgnotify.PersistentMessageCenter;
import com.huawei.openalliance.ad.ppskit.utils.ServerConfig;
import com.huawei.openalliance.ad.ppskit.utils.d0;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import com.huawei.openalliance.ad.ppskit.utils.i2;
import com.huawei.openalliance.ad.ppskit.utils.k0;
import com.huawei.openalliance.ad.ppskit.utils.o2;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.q1;
import com.huawei.openalliance.ad.ppskit.utils.v1;
import com.huawei.openalliance.ad.ppskit.utils.x;
import com.huawei.openalliance.ad.ppskit.utils.y0;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import com.huawei.openalliance.ad.ppskit.views.PPSInterstitialView;
import com.huawei.openalliance.ad.ppskit.views.PPSRewardView;
import com.huawei.opendevice.open.BaseWebActivity;
import com.onesignal.e3;
import com.onesignal.l0;
import com.onesignal.p3;
import com.vungle.warren.ui.JavascriptBridge;
import d0.a;
import d6.g0;
import gb.c0;
import gb.r0;
import gb.w0;
import ib.a0;
import ib.z;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.Executor;
import ka.Cif;
import ka.b;
import ka.c7;
import ka.e;
import ka.h;
import ka.hi;
import ka.i;
import ka.ii;
import ka.ki;
import ka.m;
import ka.mh;
import ka.n7;
import l3.d;
import m3.c;
import n0.m0;
import org.json.JSONException;
import org.json.JSONObject;
import z6.f;

/* loaded from: classes.dex */
public class a implements g, c, m0 {
    public static long A = -1;
    public static volatile hi A0 = null;
    public static final /* synthetic */ int B = 0;
    public static volatile d C0 = null;
    public static volatile boolean E0 = false;
    public static volatile k0 F0 = null;

    /* renamed from: g0, reason: collision with root package name */
    public static final /* synthetic */ int f10g0 = 0;

    /* renamed from: h0, reason: collision with root package name */
    public static long f11h0 = 0;

    /* renamed from: i0, reason: collision with root package name */
    public static long f12i0 = 0;

    /* renamed from: s0, reason: collision with root package name */
    public static String f23s0 = "";

    /* renamed from: t0, reason: collision with root package name */
    public static String f25t0 = "";

    /* renamed from: u0, reason: collision with root package name */
    public static String f27u0 = "";

    /* renamed from: v0, reason: collision with root package name */
    public static a0 f29v0;

    /* renamed from: w0, reason: collision with root package name */
    public static volatile f f31w0;

    /* renamed from: x, reason: collision with root package name */
    public static String f32x;
    public static Field y;
    public static volatile b y0;

    /* renamed from: z, reason: collision with root package name */
    public static boolean f34z;

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f22s = {R.attr.color, R.attr.alpha, 16844359, com.hamkho.livefoot.R.attr.alpha, com.hamkho.livefoot.R.attr.lStar};

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f24t = {com.hamkho.livefoot.R.attr.fontProviderAuthority, com.hamkho.livefoot.R.attr.fontProviderCerts, com.hamkho.livefoot.R.attr.fontProviderFetchStrategy, com.hamkho.livefoot.R.attr.fontProviderFetchTimeout, com.hamkho.livefoot.R.attr.fontProviderPackage, com.hamkho.livefoot.R.attr.fontProviderQuery, com.hamkho.livefoot.R.attr.fontProviderSystemFontFamily};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f26u = {R.attr.font, R.attr.fontWeight, R.attr.fontStyle, R.attr.ttcIndex, R.attr.fontVariationSettings, com.hamkho.livefoot.R.attr.font, com.hamkho.livefoot.R.attr.fontStyle, com.hamkho.livefoot.R.attr.fontVariationSettings, com.hamkho.livefoot.R.attr.fontWeight, com.hamkho.livefoot.R.attr.ttcIndex};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f28v = {R.attr.startColor, R.attr.endColor, R.attr.type, R.attr.centerX, R.attr.centerY, R.attr.gradientRadius, R.attr.tileMode, R.attr.centerColor, R.attr.startX, R.attr.startY, R.attr.endX, R.attr.endY};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f30w = {R.attr.color, R.attr.offset};
    public static final int[] C = {com.hamkho.livefoot.R.attr.background, com.hamkho.livefoot.R.attr.backgroundSplit, com.hamkho.livefoot.R.attr.backgroundStacked, com.hamkho.livefoot.R.attr.contentInsetEnd, com.hamkho.livefoot.R.attr.contentInsetEndWithActions, com.hamkho.livefoot.R.attr.contentInsetLeft, com.hamkho.livefoot.R.attr.contentInsetRight, com.hamkho.livefoot.R.attr.contentInsetStart, com.hamkho.livefoot.R.attr.contentInsetStartWithNavigation, com.hamkho.livefoot.R.attr.customNavigationLayout, com.hamkho.livefoot.R.attr.displayOptions, com.hamkho.livefoot.R.attr.divider, com.hamkho.livefoot.R.attr.elevation, com.hamkho.livefoot.R.attr.height, com.hamkho.livefoot.R.attr.hideOnContentScroll, com.hamkho.livefoot.R.attr.homeAsUpIndicator, com.hamkho.livefoot.R.attr.homeLayout, com.hamkho.livefoot.R.attr.icon, com.hamkho.livefoot.R.attr.indeterminateProgressStyle, com.hamkho.livefoot.R.attr.itemPadding, com.hamkho.livefoot.R.attr.logo, com.hamkho.livefoot.R.attr.navigationMode, com.hamkho.livefoot.R.attr.popupTheme, com.hamkho.livefoot.R.attr.progressBarPadding, com.hamkho.livefoot.R.attr.progressBarStyle, com.hamkho.livefoot.R.attr.subtitle, com.hamkho.livefoot.R.attr.subtitleTextStyle, com.hamkho.livefoot.R.attr.title, com.hamkho.livefoot.R.attr.titleTextStyle};
    public static final int[] D = {R.attr.layout_gravity};
    public static final int[] E = {R.attr.minWidth};
    public static final int[] F = {com.hamkho.livefoot.R.attr.background, com.hamkho.livefoot.R.attr.backgroundSplit, com.hamkho.livefoot.R.attr.closeItemLayout, com.hamkho.livefoot.R.attr.height, com.hamkho.livefoot.R.attr.subtitleTextStyle, com.hamkho.livefoot.R.attr.titleTextStyle};
    public static final int[] G = {R.attr.layout, com.hamkho.livefoot.R.attr.buttonIconDimen, com.hamkho.livefoot.R.attr.buttonPanelSideLayout, com.hamkho.livefoot.R.attr.listItemLayout, com.hamkho.livefoot.R.attr.listLayout, com.hamkho.livefoot.R.attr.multiChoiceItemLayout, com.hamkho.livefoot.R.attr.showTitle, com.hamkho.livefoot.R.attr.singleChoiceItemLayout};
    public static final int[] H = {R.attr.src, com.hamkho.livefoot.R.attr.srcCompat, com.hamkho.livefoot.R.attr.tint, com.hamkho.livefoot.R.attr.tintMode};
    public static final int[] I = {R.attr.thumb, com.hamkho.livefoot.R.attr.tickMark, com.hamkho.livefoot.R.attr.tickMarkTint, com.hamkho.livefoot.R.attr.tickMarkTintMode};
    public static final int[] J = {R.attr.textAppearance, R.attr.drawableTop, R.attr.drawableBottom, R.attr.drawableLeft, R.attr.drawableRight, R.attr.drawableStart, R.attr.drawableEnd};
    public static final int[] K = {R.attr.textAppearance, com.hamkho.livefoot.R.attr.autoSizeMaxTextSize, com.hamkho.livefoot.R.attr.autoSizeMinTextSize, com.hamkho.livefoot.R.attr.autoSizePresetSizes, com.hamkho.livefoot.R.attr.autoSizeStepGranularity, com.hamkho.livefoot.R.attr.autoSizeTextType, com.hamkho.livefoot.R.attr.drawableBottomCompat, com.hamkho.livefoot.R.attr.drawableEndCompat, com.hamkho.livefoot.R.attr.drawableLeftCompat, com.hamkho.livefoot.R.attr.drawableRightCompat, com.hamkho.livefoot.R.attr.drawableStartCompat, com.hamkho.livefoot.R.attr.drawableTint, com.hamkho.livefoot.R.attr.drawableTintMode, com.hamkho.livefoot.R.attr.drawableTopCompat, com.hamkho.livefoot.R.attr.emojiCompatEnabled, com.hamkho.livefoot.R.attr.firstBaselineToTopHeight, com.hamkho.livefoot.R.attr.fontFamily, com.hamkho.livefoot.R.attr.fontVariationSettings, com.hamkho.livefoot.R.attr.lastBaselineToBottomHeight, com.hamkho.livefoot.R.attr.lineHeight, com.hamkho.livefoot.R.attr.textAllCaps, com.hamkho.livefoot.R.attr.textLocale};
    public static final int[] L = {R.attr.windowIsFloating, R.attr.windowAnimationStyle, com.hamkho.livefoot.R.attr.actionBarDivider, com.hamkho.livefoot.R.attr.actionBarItemBackground, com.hamkho.livefoot.R.attr.actionBarPopupTheme, com.hamkho.livefoot.R.attr.actionBarSize, com.hamkho.livefoot.R.attr.actionBarSplitStyle, com.hamkho.livefoot.R.attr.actionBarStyle, com.hamkho.livefoot.R.attr.actionBarTabBarStyle, com.hamkho.livefoot.R.attr.actionBarTabStyle, com.hamkho.livefoot.R.attr.actionBarTabTextStyle, com.hamkho.livefoot.R.attr.actionBarTheme, com.hamkho.livefoot.R.attr.actionBarWidgetTheme, com.hamkho.livefoot.R.attr.actionButtonStyle, com.hamkho.livefoot.R.attr.actionDropDownStyle, com.hamkho.livefoot.R.attr.actionMenuTextAppearance, com.hamkho.livefoot.R.attr.actionMenuTextColor, com.hamkho.livefoot.R.attr.actionModeBackground, com.hamkho.livefoot.R.attr.actionModeCloseButtonStyle, com.hamkho.livefoot.R.attr.actionModeCloseContentDescription, com.hamkho.livefoot.R.attr.actionModeCloseDrawable, com.hamkho.livefoot.R.attr.actionModeCopyDrawable, com.hamkho.livefoot.R.attr.actionModeCutDrawable, com.hamkho.livefoot.R.attr.actionModeFindDrawable, com.hamkho.livefoot.R.attr.actionModePasteDrawable, com.hamkho.livefoot.R.attr.actionModePopupWindowStyle, com.hamkho.livefoot.R.attr.actionModeSelectAllDrawable, com.hamkho.livefoot.R.attr.actionModeShareDrawable, com.hamkho.livefoot.R.attr.actionModeSplitBackground, com.hamkho.livefoot.R.attr.actionModeStyle, com.hamkho.livefoot.R.attr.actionModeTheme, com.hamkho.livefoot.R.attr.actionModeWebSearchDrawable, com.hamkho.livefoot.R.attr.actionOverflowButtonStyle, com.hamkho.livefoot.R.attr.actionOverflowMenuStyle, com.hamkho.livefoot.R.attr.activityChooserViewStyle, com.hamkho.livefoot.R.attr.alertDialogButtonGroupStyle, com.hamkho.livefoot.R.attr.alertDialogCenterButtons, com.hamkho.livefoot.R.attr.alertDialogStyle, com.hamkho.livefoot.R.attr.alertDialogTheme, com.hamkho.livefoot.R.attr.autoCompleteTextViewStyle, com.hamkho.livefoot.R.attr.borderlessButtonStyle, com.hamkho.livefoot.R.attr.buttonBarButtonStyle, com.hamkho.livefoot.R.attr.buttonBarNegativeButtonStyle, com.hamkho.livefoot.R.attr.buttonBarNeutralButtonStyle, com.hamkho.livefoot.R.attr.buttonBarPositiveButtonStyle, com.hamkho.livefoot.R.attr.buttonBarStyle, com.hamkho.livefoot.R.attr.buttonStyle, com.hamkho.livefoot.R.attr.buttonStyleSmall, com.hamkho.livefoot.R.attr.checkboxStyle, com.hamkho.livefoot.R.attr.checkedTextViewStyle, com.hamkho.livefoot.R.attr.colorAccent, com.hamkho.livefoot.R.attr.colorBackgroundFloating, com.hamkho.livefoot.R.attr.colorButtonNormal, com.hamkho.livefoot.R.attr.colorControlActivated, com.hamkho.livefoot.R.attr.colorControlHighlight, com.hamkho.livefoot.R.attr.colorControlNormal, com.hamkho.livefoot.R.attr.colorError, com.hamkho.livefoot.R.attr.colorPrimary, com.hamkho.livefoot.R.attr.colorPrimaryDark, com.hamkho.livefoot.R.attr.colorSwitchThumbNormal, com.hamkho.livefoot.R.attr.controlBackground, com.hamkho.livefoot.R.attr.dialogCornerRadius, com.hamkho.livefoot.R.attr.dialogPreferredPadding, com.hamkho.livefoot.R.attr.dialogTheme, com.hamkho.livefoot.R.attr.dividerHorizontal, com.hamkho.livefoot.R.attr.dividerVertical, com.hamkho.livefoot.R.attr.dropDownListViewStyle, com.hamkho.livefoot.R.attr.dropdownListPreferredItemHeight, com.hamkho.livefoot.R.attr.editTextBackground, com.hamkho.livefoot.R.attr.editTextColor, com.hamkho.livefoot.R.attr.editTextStyle, com.hamkho.livefoot.R.attr.homeAsUpIndicator, com.hamkho.livefoot.R.attr.imageButtonStyle, com.hamkho.livefoot.R.attr.listChoiceBackgroundIndicator, com.hamkho.livefoot.R.attr.listChoiceIndicatorMultipleAnimated, com.hamkho.livefoot.R.attr.listChoiceIndicatorSingleAnimated, com.hamkho.livefoot.R.attr.listDividerAlertDialog, com.hamkho.livefoot.R.attr.listMenuViewStyle, com.hamkho.livefoot.R.attr.listPopupWindowStyle, com.hamkho.livefoot.R.attr.listPreferredItemHeight, com.hamkho.livefoot.R.attr.listPreferredItemHeightLarge, com.hamkho.livefoot.R.attr.listPreferredItemHeightSmall, com.hamkho.livefoot.R.attr.listPreferredItemPaddingEnd, com.hamkho.livefoot.R.attr.listPreferredItemPaddingLeft, com.hamkho.livefoot.R.attr.listPreferredItemPaddingRight, com.hamkho.livefoot.R.attr.listPreferredItemPaddingStart, com.hamkho.livefoot.R.attr.panelBackground, com.hamkho.livefoot.R.attr.panelMenuListTheme, com.hamkho.livefoot.R.attr.panelMenuListWidth, com.hamkho.livefoot.R.attr.popupMenuStyle, com.hamkho.livefoot.R.attr.popupWindowStyle, com.hamkho.livefoot.R.attr.radioButtonStyle, com.hamkho.livefoot.R.attr.ratingBarStyle, com.hamkho.livefoot.R.attr.ratingBarStyleIndicator, com.hamkho.livefoot.R.attr.ratingBarStyleSmall, com.hamkho.livefoot.R.attr.searchViewStyle, com.hamkho.livefoot.R.attr.seekBarStyle, com.hamkho.livefoot.R.attr.selectableItemBackground, com.hamkho.livefoot.R.attr.selectableItemBackgroundBorderless, com.hamkho.livefoot.R.attr.spinnerDropDownItemStyle, com.hamkho.livefoot.R.attr.spinnerStyle, com.hamkho.livefoot.R.attr.switchStyle, com.hamkho.livefoot.R.attr.textAppearanceLargePopupMenu, com.hamkho.livefoot.R.attr.textAppearanceListItem, com.hamkho.livefoot.R.attr.textAppearanceListItemSecondary, com.hamkho.livefoot.R.attr.textAppearanceListItemSmall, com.hamkho.livefoot.R.attr.textAppearancePopupMenuHeader, com.hamkho.livefoot.R.attr.textAppearanceSearchResultSubtitle, com.hamkho.livefoot.R.attr.textAppearanceSearchResultTitle, com.hamkho.livefoot.R.attr.textAppearanceSmallPopupMenu, com.hamkho.livefoot.R.attr.textColorAlertDialogListItem, com.hamkho.livefoot.R.attr.textColorSearchUrl, com.hamkho.livefoot.R.attr.toolbarNavigationButtonStyle, com.hamkho.livefoot.R.attr.toolbarStyle, com.hamkho.livefoot.R.attr.tooltipForegroundColor, com.hamkho.livefoot.R.attr.tooltipFrameBackground, com.hamkho.livefoot.R.attr.viewInflaterClass, com.hamkho.livefoot.R.attr.windowActionBar, com.hamkho.livefoot.R.attr.windowActionBarOverlay, com.hamkho.livefoot.R.attr.windowActionModeOverlay, com.hamkho.livefoot.R.attr.windowFixedHeightMajor, com.hamkho.livefoot.R.attr.windowFixedHeightMinor, com.hamkho.livefoot.R.attr.windowFixedWidthMajor, com.hamkho.livefoot.R.attr.windowFixedWidthMinor, com.hamkho.livefoot.R.attr.windowMinWidthMajor, com.hamkho.livefoot.R.attr.windowMinWidthMinor, com.hamkho.livefoot.R.attr.windowNoTitle};
    public static final int[] M = {com.hamkho.livefoot.R.attr.allowStacking};
    public static final int[] N = {R.attr.checkMark, com.hamkho.livefoot.R.attr.checkMarkCompat, com.hamkho.livefoot.R.attr.checkMarkTint, com.hamkho.livefoot.R.attr.checkMarkTintMode};
    public static final int[] O = {R.attr.button, com.hamkho.livefoot.R.attr.buttonCompat, com.hamkho.livefoot.R.attr.buttonTint, com.hamkho.livefoot.R.attr.buttonTintMode};
    public static final int[] P = {R.attr.gravity, R.attr.orientation, R.attr.baselineAligned, R.attr.baselineAlignedChildIndex, R.attr.weightSum, com.hamkho.livefoot.R.attr.divider, com.hamkho.livefoot.R.attr.dividerPadding, com.hamkho.livefoot.R.attr.measureWithLargestChild, com.hamkho.livefoot.R.attr.showDividers};
    public static final int[] Q = {R.attr.dropDownHorizontalOffset, R.attr.dropDownVerticalOffset};
    public static final int[] R = {R.attr.enabled, R.attr.id, R.attr.visible, R.attr.menuCategory, R.attr.orderInCategory, R.attr.checkableBehavior};
    public static final int[] S = {R.attr.icon, R.attr.enabled, R.attr.id, R.attr.checked, R.attr.visible, R.attr.menuCategory, R.attr.orderInCategory, R.attr.title, R.attr.titleCondensed, R.attr.alphabeticShortcut, R.attr.numericShortcut, R.attr.checkable, R.attr.onClick, com.hamkho.livefoot.R.attr.actionLayout, com.hamkho.livefoot.R.attr.actionProviderClass, com.hamkho.livefoot.R.attr.actionViewClass, com.hamkho.livefoot.R.attr.alphabeticModifiers, com.hamkho.livefoot.R.attr.contentDescription, com.hamkho.livefoot.R.attr.iconTint, com.hamkho.livefoot.R.attr.iconTintMode, com.hamkho.livefoot.R.attr.numericModifiers, com.hamkho.livefoot.R.attr.showAsAction, com.hamkho.livefoot.R.attr.tooltipText};
    public static final int[] T = {R.attr.windowAnimationStyle, R.attr.itemTextAppearance, R.attr.horizontalDivider, R.attr.verticalDivider, R.attr.headerBackground, R.attr.itemBackground, R.attr.itemIconDisabledAlpha, com.hamkho.livefoot.R.attr.preserveIconSpacing, com.hamkho.livefoot.R.attr.subMenuArrow};
    public static final int[] U = {R.attr.popupBackground, R.attr.popupAnimationStyle, com.hamkho.livefoot.R.attr.overlapAnchor};
    public static final int[] V = {com.hamkho.livefoot.R.attr.paddingBottomNoButtons, com.hamkho.livefoot.R.attr.paddingTopNoTitle};
    public static final int[] W = {R.attr.textAppearance, R.attr.focusable, R.attr.maxWidth, R.attr.text, R.attr.hint, R.attr.inputType, R.attr.imeOptions, com.hamkho.livefoot.R.attr.animateMenuItems, com.hamkho.livefoot.R.attr.animateNavigationIcon, com.hamkho.livefoot.R.attr.autoShowKeyboard, com.hamkho.livefoot.R.attr.closeIcon, com.hamkho.livefoot.R.attr.commitIcon, com.hamkho.livefoot.R.attr.defaultQueryHint, com.hamkho.livefoot.R.attr.goIcon, com.hamkho.livefoot.R.attr.headerLayout, com.hamkho.livefoot.R.attr.hideNavigationIcon, com.hamkho.livefoot.R.attr.iconifiedByDefault, com.hamkho.livefoot.R.attr.layout, com.hamkho.livefoot.R.attr.queryBackground, com.hamkho.livefoot.R.attr.queryHint, com.hamkho.livefoot.R.attr.searchHintIcon, com.hamkho.livefoot.R.attr.searchIcon, com.hamkho.livefoot.R.attr.searchPrefixText, com.hamkho.livefoot.R.attr.submitBackground, com.hamkho.livefoot.R.attr.suggestionRowLayout, com.hamkho.livefoot.R.attr.useDrawerArrowDrawable, com.hamkho.livefoot.R.attr.voiceIcon};
    public static final int[] X = {R.attr.entries, R.attr.popupBackground, R.attr.prompt, R.attr.dropDownWidth, com.hamkho.livefoot.R.attr.popupTheme};
    public static final int[] Y = {R.attr.textSize, R.attr.typeface, R.attr.textStyle, R.attr.textColor, R.attr.textColorHint, R.attr.textColorLink, R.attr.shadowColor, R.attr.shadowDx, R.attr.shadowDy, R.attr.shadowRadius, R.attr.fontFamily, R.attr.textFontWeight, com.hamkho.livefoot.R.attr.fontFamily, com.hamkho.livefoot.R.attr.fontVariationSettings, com.hamkho.livefoot.R.attr.textAllCaps, com.hamkho.livefoot.R.attr.textLocale};
    public static final int[] Z = {R.attr.gravity, R.attr.minHeight, com.hamkho.livefoot.R.attr.buttonGravity, com.hamkho.livefoot.R.attr.collapseContentDescription, com.hamkho.livefoot.R.attr.collapseIcon, com.hamkho.livefoot.R.attr.contentInsetEnd, com.hamkho.livefoot.R.attr.contentInsetEndWithActions, com.hamkho.livefoot.R.attr.contentInsetLeft, com.hamkho.livefoot.R.attr.contentInsetRight, com.hamkho.livefoot.R.attr.contentInsetStart, com.hamkho.livefoot.R.attr.contentInsetStartWithNavigation, com.hamkho.livefoot.R.attr.logo, com.hamkho.livefoot.R.attr.logoDescription, com.hamkho.livefoot.R.attr.maxButtonHeight, com.hamkho.livefoot.R.attr.menu, com.hamkho.livefoot.R.attr.navigationContentDescription, com.hamkho.livefoot.R.attr.navigationIcon, com.hamkho.livefoot.R.attr.popupTheme, com.hamkho.livefoot.R.attr.subtitle, com.hamkho.livefoot.R.attr.subtitleTextAppearance, com.hamkho.livefoot.R.attr.subtitleTextColor, com.hamkho.livefoot.R.attr.title, com.hamkho.livefoot.R.attr.titleMargin, com.hamkho.livefoot.R.attr.titleMarginBottom, com.hamkho.livefoot.R.attr.titleMarginEnd, com.hamkho.livefoot.R.attr.titleMarginStart, com.hamkho.livefoot.R.attr.titleMarginTop, com.hamkho.livefoot.R.attr.titleMargins, com.hamkho.livefoot.R.attr.titleTextAppearance, com.hamkho.livefoot.R.attr.titleTextColor};

    /* renamed from: c0, reason: collision with root package name */
    public static final int[] f6c0 = {R.attr.theme, R.attr.focusable, com.hamkho.livefoot.R.attr.paddingEnd, com.hamkho.livefoot.R.attr.paddingStart, com.hamkho.livefoot.R.attr.theme};

    /* renamed from: d0, reason: collision with root package name */
    public static final int[] f7d0 = {R.attr.background, com.hamkho.livefoot.R.attr.backgroundTint, com.hamkho.livefoot.R.attr.backgroundTintMode};

    /* renamed from: e0, reason: collision with root package name */
    public static final int[] f8e0 = {R.attr.id, R.attr.layout, R.attr.inflatedId};

    /* renamed from: f0, reason: collision with root package name */
    public static final int[] f9f0 = {com.hamkho.livefoot.R.attr.isConvertDaysToHours, com.hamkho.livefoot.R.attr.isHideTimeBackground, com.hamkho.livefoot.R.attr.isShowDay, com.hamkho.livefoot.R.attr.isShowHour, com.hamkho.livefoot.R.attr.isShowMillisecond, com.hamkho.livefoot.R.attr.isShowMinute, com.hamkho.livefoot.R.attr.isShowSecond, com.hamkho.livefoot.R.attr.isShowTimeBgBorder, com.hamkho.livefoot.R.attr.isShowTimeBgDivisionLine, com.hamkho.livefoot.R.attr.isSuffixTextBold, com.hamkho.livefoot.R.attr.isTimeTextBold, com.hamkho.livefoot.R.attr.suffix, com.hamkho.livefoot.R.attr.suffixDay, com.hamkho.livefoot.R.attr.suffixDayLeftMargin, com.hamkho.livefoot.R.attr.suffixDayRightMargin, com.hamkho.livefoot.R.attr.suffixGravity, com.hamkho.livefoot.R.attr.suffixHour, com.hamkho.livefoot.R.attr.suffixHourLeftMargin, com.hamkho.livefoot.R.attr.suffixHourRightMargin, com.hamkho.livefoot.R.attr.suffixLRMargin, com.hamkho.livefoot.R.attr.suffixMillisecond, com.hamkho.livefoot.R.attr.suffixMillisecondLeftMargin, com.hamkho.livefoot.R.attr.suffixMinute, com.hamkho.livefoot.R.attr.suffixMinuteLeftMargin, com.hamkho.livefoot.R.attr.suffixMinuteRightMargin, com.hamkho.livefoot.R.attr.suffixSecond, com.hamkho.livefoot.R.attr.suffixSecondLeftMargin, com.hamkho.livefoot.R.attr.suffixSecondRightMargin, com.hamkho.livefoot.R.attr.suffixTextColor, com.hamkho.livefoot.R.attr.suffixTextSize, com.hamkho.livefoot.R.attr.timeBgBorderColor, com.hamkho.livefoot.R.attr.timeBgBorderRadius, com.hamkho.livefoot.R.attr.timeBgBorderSize, com.hamkho.livefoot.R.attr.timeBgColor, com.hamkho.livefoot.R.attr.timeBgDivisionLineColor, com.hamkho.livefoot.R.attr.timeBgDivisionLineSize, com.hamkho.livefoot.R.attr.timeBgRadius, com.hamkho.livefoot.R.attr.timeBgSize, com.hamkho.livefoot.R.attr.timeTextColor, com.hamkho.livefoot.R.attr.timeTextSize};

    /* renamed from: j0, reason: collision with root package name */
    public static final int[] f13j0 = {com.hamkho.livefoot.R.attr.hiad_border_color, com.hamkho.livefoot.R.attr.hiad_border_width, com.hamkho.livefoot.R.attr.hiad_corner_radius};

    /* renamed from: k0, reason: collision with root package name */
    public static final int[] f14k0 = {com.hamkho.livefoot.R.attr.insreTemplate};

    /* renamed from: l0, reason: collision with root package name */
    public static final int[] f15l0 = {com.hamkho.livefoot.R.attr.nonNetworkText, com.hamkho.livefoot.R.attr.setButtonText, com.hamkho.livefoot.R.attr.wifiIcon};

    /* renamed from: m0, reason: collision with root package name */
    public static final int[] f16m0 = {com.hamkho.livefoot.R.attr.hiad_detail_type};

    /* renamed from: n0, reason: collision with root package name */
    public static final int[] f17n0 = {com.hamkho.livefoot.R.attr.hiad_roundCorner};

    /* renamed from: o0, reason: collision with root package name */
    public static final int[] f18o0 = {com.hamkho.livefoot.R.attr.layoutRadius, com.hamkho.livefoot.R.attr.layoutScanImage};

    /* renamed from: p0, reason: collision with root package name */
    public static final int[] f19p0 = {com.hamkho.livefoot.R.attr.gravity_style, com.hamkho.livefoot.R.attr.support_elderly, com.hamkho.livefoot.R.attr.title_text_size};

    /* renamed from: q0, reason: collision with root package name */
    public static final int[] f20q0 = {com.hamkho.livefoot.R.attr.fullScreen};

    /* renamed from: r0, reason: collision with root package name */
    public static final int[] f21r0 = {com.hamkho.livefoot.R.attr.hiad_fixedWidth, com.hamkho.livefoot.R.attr.hiad_fontFamily, com.hamkho.livefoot.R.attr.hiad_maxWidth, com.hamkho.livefoot.R.attr.hiad_minWidth, com.hamkho.livefoot.R.attr.hiad_resetWidth, com.hamkho.livefoot.R.attr.hiad_styleIndex, com.hamkho.livefoot.R.attr.hiad_textColor, com.hamkho.livefoot.R.attr.hiad_textSize, com.hamkho.livefoot.R.attr.hiad_typefaceIndex};

    /* renamed from: x0, reason: collision with root package name */
    public static final byte[] f33x0 = new byte[0];

    /* renamed from: z0, reason: collision with root package name */
    public static final byte[] f35z0 = new byte[0];
    public static final byte[] B0 = new byte[0];
    public static final byte[] D0 = new byte[0];
    public static final byte[] G0 = new byte[0];
    public static final a H0 = new a();

    public static k0 A() {
        k0 k0Var;
        if (F0 != null) {
            return F0;
        }
        synchronized (G0) {
            if (F0 == null) {
                F0 = new n();
            }
            k0Var = F0;
        }
        return k0Var;
    }

    public static int A0(Context context, String str) {
        return z0(context, str, context.getPackageName(), Process.myPid(), Process.myUid());
    }

    public static z B(String str) {
        z zVar = new z();
        zVar.f29531a = s.f.b(JavascriptBridge.MraidHandler.PRIVACY_ACTION, str);
        return zVar;
    }

    public static int B0(int i10, int i11, int i12) {
        if (i10 < i11) {
            return i11;
        }
        if (i10 > i12) {
            return i12;
        }
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v5 */
    public static Serializable C(String str) {
        Closeable closeable;
        v1 v1Var;
        FileInputStream fileInputStream;
        String str2;
        v1 v1Var2;
        FileInputStream fileInputStream2 = null;
        r1 = null;
        Closeable closeable2 = null;
        Serializable serializable = null;
        try {
            try {
                fileInputStream = new FileInputStream((String) str);
            } catch (Throwable th) {
                closeable2 = str;
                th = th;
            }
        } catch (FileNotFoundException unused) {
            v1Var = null;
            fileInputStream = null;
        } catch (IOException unused2) {
            v1Var = null;
            fileInputStream = null;
        } catch (ClassNotFoundException unused3) {
            v1Var = null;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            closeable = null;
            androidx.transition.n.D(fileInputStream2);
            androidx.transition.n.D(closeable);
            throw th;
        }
        try {
            v1Var = new v1(fileInputStream);
            try {
                Object readObject = v1Var.readObject();
                str = v1Var;
                if (readObject instanceof Serializable) {
                    serializable = (Serializable) readObject;
                    str = v1Var;
                }
            } catch (FileNotFoundException unused4) {
                str2 = "read file FileNotFoundException";
                v1Var2 = v1Var;
                n7.g("a", str2);
                str = v1Var2;
                androidx.transition.n.D(fileInputStream);
                androidx.transition.n.D(str);
                return serializable;
            } catch (IOException unused5) {
                str2 = "read file IOException";
                v1Var2 = v1Var;
                n7.g("a", str2);
                str = v1Var2;
                androidx.transition.n.D(fileInputStream);
                androidx.transition.n.D(str);
                return serializable;
            } catch (ClassNotFoundException unused6) {
                str2 = "read file ClassNotFoundException";
                v1Var2 = v1Var;
                n7.g("a", str2);
                str = v1Var2;
                androidx.transition.n.D(fileInputStream);
                androidx.transition.n.D(str);
                return serializable;
            }
        } catch (FileNotFoundException unused7) {
            v1Var = null;
        } catch (IOException unused8) {
            v1Var = null;
        } catch (ClassNotFoundException unused9) {
            v1Var = null;
        } catch (Throwable th3) {
            th = th3;
            closeable = closeable2;
            fileInputStream2 = fileInputStream;
            androidx.transition.n.D(fileInputStream2);
            androidx.transition.n.D(closeable);
            throw th;
        }
        androidx.transition.n.D(fileInputStream);
        androidx.transition.n.D(str);
        return serializable;
    }

    public static int C0(int i10, int i11) {
        return f0.a.c(i10, (Color.alpha(i10) * i11) / p.f9095b);
    }

    public static Integer D(Context context, String str, String str2) {
        try {
            Object p02 = p0(context, str, str2);
            if (p02 != null) {
                return y1.q(p02.toString());
            }
            return null;
        } catch (Throwable th) {
            n7.h("MetaDataUtils", "getIntegerMetaData %s err: %s", str2, th.getClass().getSimpleName());
            return null;
        }
    }

    public static boolean D0(int i10) {
        return Z(i10, new int[]{2, 5});
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
    
        if (r1 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b5, code lost:
    
        a0.a.f32x = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bb, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bf, code lost:
    
        return a0.a.f32x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c2, code lost:
    
        return a0.a.f32x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b0, code lost:
    
        if (r1 == null) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String E(android.content.Context r9) {
        /*
            java.lang.String r0 = "OIdentifierManager"
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "action.com.heytap.openid.OPEN_ID_SERVICE"
            r1.<init>(r2)
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.String r3 = "com.heytap.openid"
            java.lang.String r4 = "com.heytap.openid.IdentifyService"
            r2.<init>(r3, r4)
            r1.setComponent(r2)
            r2 = 0
            r3 = 1
            com.huawei.openalliance.ad.ppskit.utils.l1 r4 = new com.huawei.openalliance.ad.ppskit.utils.l1     // Catch: java.lang.Throwable -> L28
            r4.<init>(r9)     // Catch: java.lang.Throwable -> L28
            boolean r1 = r9.bindService(r1, r4, r3)     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L3a
            java.lang.String r1 = "HeyTap IdentifyService bind failed"
            ka.n7.g(r0, r1)     // Catch: java.lang.Throwable -> L28
            goto L3a
        L28:
            r1 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r4[r2] = r1
            java.lang.String r1 = "get oaid error: %s"
            ka.n7.h(r0, r1, r4)
        L3a:
            java.lang.String r0 = com.huawei.openalliance.ad.ppskit.utils.m1.f22925b
            a0.a.f32x = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L47
            java.lang.String r9 = a0.a.f32x
            return r9
        L47:
            java.lang.Object r0 = com.huawei.openalliance.ad.ppskit.utils.e1.f22841b
            r1 = 0
            if (r0 == 0) goto L71
            java.lang.reflect.Method r4 = com.huawei.openalliance.ad.ppskit.utils.e1.f22840a
            if (r4 == 0) goto L71
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L5d
            r5[r2] = r9     // Catch: java.lang.Exception -> L5d
            java.lang.Object r0 = r4.invoke(r0, r5)     // Catch: java.lang.Exception -> L5d
            if (r0 == 0) goto L71
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L5d
            goto L72
        L5d:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r3[r2] = r0
            java.lang.String r0 = "MIdentifierManager"
            java.lang.String r2 = "invoke exception, %s"
            ka.n7.j(r0, r2, r3)
        L71:
            r0 = r1
        L72:
            a0.a.f32x = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L7d
            java.lang.String r9 = a0.a.f32x
            return r9
        L7d:
            java.lang.String r0 = ""
            java.lang.String r2 = "content://com.vivo.vms.IdProvider/IdentifierId/OAID"
            android.net.Uri r4 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            if (r1 == 0) goto La4
            boolean r9 = r1.moveToNext()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            if (r9 == 0) goto La4
            java.lang.String r9 = "value"
            int r9 = r1.getColumnIndex(r9)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            java.lang.String r9 = r1.getString(r9)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            r0 = r9
        La4:
            if (r1 == 0) goto Lb5
            goto Lb2
        La7:
            r9 = move-exception
            goto Lc3
        La9:
            java.lang.String r9 = "VIdentifierManager"
            java.lang.String r2 = "contentResolver query exception"
            ka.n7.g(r9, r2)     // Catch: java.lang.Throwable -> La7
            if (r1 == 0) goto Lb5
        Lb2:
            r1.close()
        Lb5:
            a0.a.f32x = r0
            boolean r9 = android.text.TextUtils.isEmpty(r0)
            if (r9 != 0) goto Lc0
            java.lang.String r9 = a0.a.f32x
            return r9
        Lc0:
            java.lang.String r9 = a0.a.f32x
            return r9
        Lc3:
            if (r1 == 0) goto Lc8
            r1.close()
        Lc8:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.a.E(android.content.Context):java.lang.String");
    }

    public static boolean E0(int i10) {
        return Z(i10, new int[]{1, 9});
    }

    public static String F(Context context, ContentRecord contentRecord) {
        ArrayList E2;
        if (contentRecord != null && contentRecord.X1() != null) {
            MetaData x10 = AdContentData.f(context, contentRecord).x();
            if (2 == contentRecord.z()) {
                E2 = x10.F();
            } else if (9 != contentRecord.z() && 12 != contentRecord.z()) {
                E2 = null;
            } else {
                E2 = x10.E();
            }
            if (!androidx.transition.n.M(E2)) {
                return (String) E2.get(0);
            }
        }
        return null;
    }

    public static void F0() {
        if (g0.f27302a >= 18) {
            Trace.endSection();
        }
    }

    public static String G(Context context, String str) {
        if (TextUtils.isEmpty(f23s0)) {
            f23s0 = K(context).a(context, ServerConfig.a(), str, ServerConfig.b(), "amsServer".concat(y1.i(context)));
            n7.c("PrivacyUrlUtil", "app: %s base url for %s is: %s", ServerConfig.a(), "amsServer", y1.j(f23s0));
        }
        return f23s0;
    }

    public static boolean G0(Context context) {
        long j10;
        l d10 = l.d(context);
        String packageName = context.getPackageName();
        synchronized (d10.f22585a) {
            j10 = d10.G(packageName).getLong("last_qry_GrpId_Time", 0L);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - j10 < 43200000) {
            n7.b("MediaGroupIdUtils", "update groupId too quick");
            return true;
        }
        synchronized (d10.f22585a) {
            d10.G(packageName).edit().putLong("last_qry_GrpId_Time", currentTimeMillis).apply();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String H(android.content.Context r10, java.lang.String r11, com.huawei.openalliance.ad.ppskit.beans.metadata.Location r12) {
        /*
            java.lang.String r0 = "GeoLocationUtil"
            r1 = 0
            r2 = 1
            r3 = 0
            boolean r4 = r12.l()     // Catch: java.lang.Throwable -> L5f
            if (r4 == 0) goto L5d
            boolean r11 = k0(r10, r11)     // Catch: java.lang.Throwable -> L5f
            if (r11 == 0) goto L5d
            boolean r11 = a0(r10)     // Catch: java.lang.Throwable -> L5f
            if (r11 == 0) goto L5d
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5f
            a0.a.A = r4     // Catch: java.lang.Throwable -> L5f
            java.lang.Double r11 = r12.f()     // Catch: java.lang.Throwable -> L5f
            double r5 = r11.doubleValue()     // Catch: java.lang.Throwable -> L5f
            java.lang.Double r11 = r12.h()     // Catch: java.lang.Throwable -> L5f
            double r7 = r11.doubleValue()     // Catch: java.lang.Throwable -> L5f
            java.util.Locale r9 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> L5f
            r4 = r10
            android.location.Address r10 = w(r4, r5, r7, r9)     // Catch: java.lang.Throwable -> L5f
            if (r10 == 0) goto L5d
            java.lang.String r11 = r10.getCountryCode()     // Catch: java.lang.Throwable -> L5f
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L5f
            if (r11 != 0) goto L5d
            com.huawei.openalliance.ad.ppskit.beans.metadata.PoiInfo r11 = new com.huawei.openalliance.ad.ppskit.beans.metadata.PoiInfo     // Catch: java.lang.Throwable -> L5f
            r11.<init>()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r12 = r10.getCountryCode()     // Catch: java.lang.Throwable -> L5b
            r11.a(r12)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r12 = r10.getAdminArea()     // Catch: java.lang.Throwable -> L5b
            r11.b(r12)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r10 = r10.getLocality()     // Catch: java.lang.Throwable -> L5b
            r11.c(r10)     // Catch: java.lang.Throwable -> L5b
            goto L72
        L5b:
            r10 = move-exception
            goto L61
        L5d:
            r11 = r3
            goto L72
        L5f:
            r10 = move-exception
            r11 = r3
        L61:
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getSimpleName()
            r12[r1] = r10
            java.lang.String r10 = "getPoi ex：%s"
            ka.n7.f(r0, r10, r12)
        L72:
            if (r11 == 0) goto L8a
            java.lang.String r10 = com.huawei.openalliance.ad.ppskit.utils.y0.q(r3, r11)
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.String r12 = com.huawei.openalliance.ad.ppskit.utils.y1.j(r10)
            r11[r1] = r12
            java.lang.String r12 = "getPoi, result: %s"
            ka.n7.c(r0, r12, r11)
            java.lang.String r10 = com.huawei.openalliance.ad.ppskit.utils.n2.a(r10)
            return r10
        L8a:
            java.lang.String r10 = ""
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.a.H(android.content.Context, java.lang.String, com.huawei.openalliance.ad.ppskit.beans.metadata.Location):java.lang.String");
    }

    public static View H0(int i10, View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View findViewById = viewGroup.getChildAt(i11).findViewById(i10);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    public static String I(Context context, boolean z10) {
        String a10;
        String U2 = q1.m(context).U();
        if (TextUtils.isEmpty(U2)) {
            if (z10) {
                a10 = "CN";
            } else {
                a10 = new CountryCodeBean(context).a();
                if ("UNKNOWN".equalsIgnoreCase(a10)) {
                    a10 = "EU";
                }
            }
            String str = a10;
            q1.m(context).R(str);
            return str;
        }
        return U2;
    }

    public static final dd.d I0(Executor executor) {
        if (executor instanceof dd.b) {
        }
        return new dd.d(executor);
    }

    public static String J(String str, z zVar) {
        StringBuilder l10 = com.ironsource.adapters.facebook.a.l(str, "&language=");
        l10.append(zVar.f29532b);
        l10.append("&branchid=0&version=");
        return a3.l.p(l10, zVar.f, "&contenttag=default");
    }

    public static void J0(Context context) {
        Pair pair;
        String str = "";
        if (context == null) {
            pair = new Pair("", 1);
        } else if (Cif.a(context).d()) {
            pair = new Pair("", 12);
        } else {
            Uri parse = Uri.parse("content://com.huawei.hms.ads.brain.open/groupid/query");
            int i10 = 11;
            if (!d0.g(context, parse)) {
                n7.e("MediaGroupIdUtils", "target provider not exists");
                pair = new Pair("", 11);
            } else {
                Cursor cursor = null;
                try {
                    cursor = context.getContentResolver().query(parse, null, null, null, null);
                    if (cursor != null && cursor.moveToFirst()) {
                        str = cursor.getString(cursor.getColumnIndex("group_id"));
                        i10 = cursor.getInt(cursor.getColumnIndex("code"));
                    }
                } finally {
                    try {
                        androidx.transition.n.D(cursor);
                        pair = new Pair(str, Integer.valueOf(i10));
                    } catch (Throwable th) {
                    }
                }
                androidx.transition.n.D(cursor);
                pair = new Pair(str, Integer.valueOf(i10));
            }
        }
        n7.c("MediaGroupIdUtils", "update groupId: %s", y1.j((String) pair.first));
        n7.f("MediaGroupIdUtils", "update grpIdStatusCode: %s", pair.second);
        q1 m10 = q1.m(context);
        m10.E(((Integer) pair.second).intValue());
        m10.d((String) pair.first);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [ka.m, z6.f] */
    public static m K(Context context) {
        boolean z10;
        f hVar;
        if (f31w0 == null) {
            synchronized (f33x0) {
                if (f31w0 == null) {
                    String c10 = z1.c(context);
                    String d10 = z1.d(context);
                    if (w.bo.equalsIgnoreCase(c10) && w.bo.equalsIgnoreCase(d10)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && n.k0()) {
                        hVar = new ka.f(context);
                    } else {
                        hVar = new h(context);
                    }
                    f31w0 = hVar;
                }
            }
        }
        return f31w0;
    }

    public static int K0(int i10, View view) {
        Context context = view.getContext();
        TypedValue c10 = z6.b.c(view.getContext(), i10, view.getClass().getCanonicalName());
        int i11 = c10.resourceId;
        if (i11 != 0) {
            Object obj = d0.a.f27248a;
            return a.d.a(context, i11);
        }
        return c10.data;
    }

    public static ka.n L(Context context) {
        b bVar;
        if (y0 == null) {
            synchronized (f35z0) {
                if (y0 == null) {
                    if (Cif.f(context)) {
                        synchronized (e.f31110b) {
                            try {
                                if (e.f31109a == null) {
                                    e.f31109a = new e();
                                }
                                bVar = e.f31109a;
                            } finally {
                            }
                        }
                        y0 = bVar;
                    } else {
                        synchronized (i.f31263b) {
                            if (i.f31262a == null) {
                                i.f31262a = new i();
                            }
                            bVar = i.f31262a;
                        }
                        y0 = bVar;
                    }
                }
            }
        }
        return y0;
    }

    public static int L0(Context context, int i10, int i11) {
        TypedValue a10 = z6.b.a(i10, context);
        if (a10 != null) {
            int i12 = a10.resourceId;
            if (i12 != 0) {
                Object obj = d0.a.f27248a;
                return a.d.a(context, i12);
            }
            return a10.data;
        }
        return i11;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0016. Please report as an issue. */
    public static ii M(Context context, ContentRecord contentRecord, Map map, Integer num) {
        ii dVar;
        int intValue = num.intValue();
        int i10 = 1;
        if (intValue != 11) {
            if (intValue != 12) {
                if (intValue != 14) {
                    if (intValue != 300) {
                        int i11 = 0;
                        switch (intValue) {
                            case 0:
                                return new ab.g();
                            case 1:
                                dVar = new ab.f(context, contentRecord, map, false);
                                break;
                            case 2:
                                dVar = new ab.e(context, contentRecord, map);
                                break;
                            case 3:
                                return new ab.a(context, contentRecord, i11);
                            case 4:
                                dVar = new ab.f(context, contentRecord, map, true);
                                break;
                            case 5:
                                return new ab.c(context, contentRecord, 2);
                            case 6:
                                return new ab.c(context, contentRecord, i11);
                            case 7:
                                return new ab.b(context, contentRecord);
                            case 8:
                                return new ab.i(context, contentRecord);
                            case 9:
                                return new j(context, contentRecord);
                            default:
                                n7.g("a", "unsupport action:" + num);
                                return null;
                        }
                    } else {
                        dVar = new ab.h(context, contentRecord, map);
                    }
                    return dVar;
                }
                if (map != null && "1".equals(map.get("is_allow_gp_action"))) {
                    dVar = new ab.d(context, contentRecord, map);
                    return dVar;
                }
                return null;
            }
            return new com.huawei.openalliance.ad.ppskit.uriaction.a(context, contentRecord);
        }
        return new ab.a(context, contentRecord, i10);
    }

    public static int M0(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }

    public static ii N(Context context, ContentRecord contentRecord, Map map, boolean z10) {
        ArrayList<ii> arrayList;
        if (context != null && contentRecord != null && map != null) {
            List<Integer> X2 = contentRecord.X();
            ii iiVar = null;
            if (X2 != null && X2.size() > 0) {
                arrayList = new ArrayList(X2.size());
                Iterator<Integer> it = X2.iterator();
                while (it.hasNext()) {
                    ii M2 = M(context, contentRecord, map, it.next());
                    if (M2 != null) {
                        M2.f31311e = z10;
                        arrayList.add(M2);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null && arrayList.size() > 0) {
                for (ii iiVar2 : arrayList) {
                    if (iiVar != null) {
                        iiVar.f31310d = iiVar2;
                    }
                    iiVar = iiVar2;
                }
                return (ii) arrayList.get(0);
            }
            return new ab.g();
        }
        return new ab.g();
    }

    public static long N0(byte b10, byte b11) {
        int i10;
        int i11;
        int i12 = b10 & DefaultClassResolver.NAME;
        int i13 = i12 & 3;
        if (i13 != 0) {
            i10 = 2;
            if (i13 != 1 && i13 != 2) {
                i10 = b11 & 63;
            }
        } else {
            i10 = 1;
        }
        int i14 = i12 >> 3;
        int i15 = i14 & 3;
        if (i14 >= 16) {
            i11 = 2500 << i15;
        } else if (i14 >= 12) {
            i11 = 10000 << (i15 & 1);
        } else if (i15 == 3) {
            i11 = w.f22171t;
        } else {
            i11 = 10000 << i15;
        }
        return i10 * i11;
    }

    public static JSONObject O(String str) {
        JSONObject jSONObject = new JSONObject();
        if (n7.d()) {
            n7.c("ApReDnApi", "appDownloadTask: %s", str);
        }
        jSONObject.put("content", str);
        return jSONObject;
    }

    public static Integer O0(p3 p3Var, String str) {
        Throwable th;
        Integer num;
        Cursor cursor = null;
        try {
            Cursor i10 = p3Var.i("notification", new String[]{"android_notification_id"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 1", new String[]{str}, null);
            try {
                if (!i10.moveToFirst()) {
                    i10.close();
                    if (!i10.isClosed()) {
                        i10.close();
                    }
                    return null;
                }
                Integer valueOf = Integer.valueOf(i10.getInt(i10.getColumnIndex("android_notification_id")));
                i10.close();
                if (!i10.isClosed()) {
                    i10.close();
                    return valueOf;
                }
                return valueOf;
            } catch (Throwable th2) {
                th = th2;
                cursor = i10;
                num = null;
                try {
                    e3.b(3, "Error getting android notification id for summary notification group: ".concat(str), th);
                    return num;
                } finally {
                    if (cursor != null && !cursor.isClosed()) {
                        cursor.close();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            num = null;
        }
    }

    public static void P(Context context, ContentRecord contentRecord, long j10, long j11) {
        AnalysisEventReport y10 = y(contentRecord);
        y10.d(j10);
        y10.g(j11);
        c7.l(context).k(cy.V, y0.q(null, y10), null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009a, code lost:
    
        if (r4.isClosed() == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.database.Cursor P0(android.content.Context r18, com.onesignal.p3 r19, java.lang.String r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.a.P0(android.content.Context, com.onesignal.p3, java.lang.String, boolean):android.database.Cursor");
    }

    public static void Q(Context context, ContentRecord contentRecord, String str, JSONObject jSONObject) {
        if (contentRecord == null) {
            return;
        }
        String D1 = contentRecord.D1(context);
        jSONObject.put("paramFromServer", D1);
        String q10 = y0.q(null, contentRecord.S1(context));
        jSONObject.put("monitor", q10);
        if (n7.d()) {
            n7.c("ApReDnApi", "pfs: %s", y1.j(D1));
            n7.c("ApReDnApi", "monitors: %s", y1.j(q10));
        }
        String q11 = y0.q(null, contentRecord);
        jSONObject.put("contentRecord", q11);
        jSONObject.put("unique_id", str);
        n7.f("ApReDnApi", "content: %s", y1.j(q11));
    }

    public static boolean Q0(int i10) {
        boolean z10;
        double pow;
        double pow2;
        double pow3;
        if (i10 != 0) {
            ThreadLocal<double[]> threadLocal = f0.a.f27897a;
            double[] dArr = threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i10);
            int green = Color.green(i10);
            int blue = Color.blue(i10);
            if (dArr.length == 3) {
                double d10 = red / 255.0d;
                if (d10 < 0.04045d) {
                    pow = d10 / 12.92d;
                } else {
                    pow = Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
                }
                double d11 = green / 255.0d;
                if (d11 < 0.04045d) {
                    pow2 = d11 / 12.92d;
                } else {
                    pow2 = Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
                }
                double d12 = blue / 255.0d;
                if (d12 < 0.04045d) {
                    pow3 = d12 / 12.92d;
                } else {
                    pow3 = Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
                }
                z10 = false;
                dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
                double d13 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
                dArr[1] = d13;
                dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
                if (d13 / 100.0d > 0.5d) {
                    return true;
                }
            } else {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
        } else {
            z10 = false;
        }
        return z10;
    }

    public static void R(Context context, z zVar, String str) {
        String f = e0.i.f(Locale.getDefault().getLanguage().toLowerCase(Locale.getDefault()), "-", Locale.getDefault().getCountry().toLowerCase(Locale.getDefault()));
        String H2 = z1.H(context);
        zVar.f = str;
        zVar.f29532b = f;
        zVar.f29535e = H2;
    }

    public static boolean R0(Uri uri) {
        if (uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }

    public static void S(Context context, String str, String str2, String str3, String str4) {
        n7.c("AnalyticsKitUtils", "ana_tag_kit broadcastEvent sourcePkg = %s", str);
        Intent intent = new Intent("com.huawei.hms.analytics.pps.event");
        intent.setPackage(context.getPackageName());
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        bundle.putString("event_type", str2);
        bundle.putString("slot_id", str3);
        if (str4 == null) {
            bundle.putString("activity_name", "");
        } else {
            bundle.putString("activity_name", str4);
        }
        intent.putExtra("event_detail", bundle);
        context.sendBroadcast(intent);
        n7.c("AnalyticsKitUtils", "sendBroadcast intent extra: %s", bundle.toString());
        n7.b("AnalyticsKitUtils", "ana_tag sendBroadcast successfully!");
    }

    public static int S0(float f, int i10, int i11) {
        return f0.a.b(f0.a.c(i11, Math.round(Color.alpha(i11) * f)), i10);
    }

    public static void T(View view, MotionEvent motionEvent, MaterialClickInfo materialClickInfo) {
        MaterialClickInfo z10;
        if (materialClickInfo != null && view != null && motionEvent != null) {
            materialClickInfo.b(Float.valueOf(i2.i(view.getContext())));
            if (materialClickInfo.a() == null) {
                materialClickInfo.c(oa.a.f33786c);
            }
            if (materialClickInfo.a() == oa.a.f33786c && (z10 = z(view, motionEvent)) != null) {
                materialClickInfo.e(z10.i());
                materialClickInfo.g(z10.j());
            }
        }
    }

    public static void T0(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                if (parent instanceof v0) {
                    editorInfo.hintText = ((v0) parent).a();
                    return;
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(13:81|82|83|4|5|6|(3:8|(2:10|11)(1:13)|12)|15|16|(7:19|(1:21)(1:72)|22|23|(4:25|(9:28|29|30|31|(4:33|34|35|36)|56|57|(1:41)(2:43|(2:45|(1:47))(2:48|(3:52|53|54)(2:50|51)))|42)|70|(0)(0))|71|17)|73|74|75)|3|4|5|6|(0)|15|16|(1:17)|73|74|75|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x007e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0081, code lost:
    
        android.util.Log.e("WebViewSSLCheck", "loadBksCA: exception : " + r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0069 A[Catch: all -> 0x0077, NoSuchAlgorithmException -> 0x007a, IOException -> 0x007c, IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException -> 0x007e, KeyStoreException -> 0x0080, TryCatch #10 {all -> 0x0077, blocks: (B:6:0x003c, B:8:0x0069, B:10:0x006f, B:80:0x0081), top: B:5:0x003c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void U(android.webkit.SslErrorHandler r16, android.net.http.SslError r17, java.lang.String r18, android.content.Context r19, db.j.a r20) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.a.U(android.webkit.SslErrorHandler, android.net.http.SslError, java.lang.String, android.content.Context, db.j$a):void");
    }

    public static void U0(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            j10 = Math.max(j10, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j10);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static void V(BaseWebActivity.d dVar) {
        f29v0 = dVar;
    }

    public static void V0(l0 l0Var, String str, long j10) {
        e3.b(6, "scheduleTrigger: " + str + " delay: " + j10, null);
        new Timer(s.f.b("trigger_timer:", str)).schedule(l0Var, j10);
    }

    public static void W(String str, int i10, ContentRecord contentRecord, AdditionalContext additionalContext) {
        additionalContext.c(str);
        if (contentRecord != null) {
            MetaData X1 = contentRecord.X1();
            if (X1 != null && 3 != i10) {
                if (!y1.h(X1.c())) {
                    additionalContext.a(y1.p(X1.c()));
                }
                if (!androidx.transition.n.M(X1.F())) {
                    additionalContext.b(X1.F());
                }
                if (!androidx.transition.n.M(X1.E())) {
                    additionalContext.d(X1.E());
                }
            }
            if (3 != i10 && !y1.h(contentRecord.p3())) {
                additionalContext.f(contentRecord.p3());
            }
        }
    }

    public static void X(String str, ib.p pVar, z zVar) {
        if (!TextUtils.isEmpty(str)) {
            n7.f("PrivacyUrlUtil", "statement url= %s", y1.j(str));
            ((BaseWebActivity) pVar).d(str);
        } else {
            BaseWebActivity baseWebActivity = (BaseWebActivity) pVar;
            baseWebActivity.getClass();
            n7.i("BaseWebActivity", "onGrsFailed");
            d2.a(new ib.c(baseWebActivity));
        }
        a0 a0Var = f29v0;
        if (a0Var != null) {
            a0Var.a(zVar);
        }
    }

    public static String X0(int i10) {
        return g0.l("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Double.valueOf(Color.alpha(i10) / 255.0d));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.io.ObjectOutputStream] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static void Y(String str, Serializable serializable) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        FileOutputStream fileOutputStream3;
        String str2;
        FileOutputStream fileOutputStream4;
        Throwable th;
        Closeable closeable;
        FileOutputStream fileOutputStream5 = null;
        try {
            File file = new File(str);
            if (!file.getParentFile().exists() && !x.v(file.getParentFile())) {
                n7.g("a", "writeObject, mkdir failed");
            }
            fileOutputStream4 = new FileOutputStream(str);
        } catch (FileNotFoundException unused) {
            fileOutputStream3 = null;
        } catch (IOException unused2) {
            fileOutputStream2 = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
            androidx.transition.n.D(fileOutputStream5);
            androidx.transition.n.D(fileOutputStream);
            throw th;
        }
        try {
            ?? r42 = new ObjectOutputStream(fileOutputStream4);
            try {
                r42.writeObject(serializable);
                androidx.transition.n.D(fileOutputStream4);
                closeable = r42;
            } catch (FileNotFoundException unused3) {
                fileOutputStream5 = r42;
                fileOutputStream3 = fileOutputStream5;
                fileOutputStream5 = fileOutputStream4;
                str2 = "write file FileNotFoundException";
                r42 = fileOutputStream3;
                try {
                    n7.g("a", str2);
                    androidx.transition.n.D(fileOutputStream5);
                    closeable = r42;
                    androidx.transition.n.D(closeable);
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream4 = fileOutputStream5;
                    fileOutputStream5 = r42;
                    th = th;
                    fileOutputStream = fileOutputStream5;
                    fileOutputStream5 = fileOutputStream4;
                    androidx.transition.n.D(fileOutputStream5);
                    androidx.transition.n.D(fileOutputStream);
                    throw th;
                }
            } catch (IOException unused4) {
                fileOutputStream5 = r42;
                fileOutputStream2 = fileOutputStream5;
                fileOutputStream5 = fileOutputStream4;
                str2 = "write file IOException";
                r42 = fileOutputStream2;
                n7.g("a", str2);
                androidx.transition.n.D(fileOutputStream5);
                closeable = r42;
                androidx.transition.n.D(closeable);
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream5 = r42;
                th = th;
                fileOutputStream = fileOutputStream5;
                fileOutputStream5 = fileOutputStream4;
                androidx.transition.n.D(fileOutputStream5);
                androidx.transition.n.D(fileOutputStream);
                throw th;
            }
        } catch (FileNotFoundException unused5) {
        } catch (IOException unused6) {
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = fileOutputStream5;
            fileOutputStream5 = fileOutputStream4;
            androidx.transition.n.D(fileOutputStream5);
            androidx.transition.n.D(fileOutputStream);
            throw th;
        }
        androidx.transition.n.D(closeable);
    }

    public static Class Y0(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Void.TYPE) {
            return Void.class;
        }
        return cls;
    }

    public static boolean Z(int i10, int[] iArr) {
        boolean z10;
        int i11;
        if (Array.getLength(iArr) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i11 = 0;
            while (i11 < iArr.length) {
                if (i10 == iArr[i11]) {
                    break;
                }
                i11++;
            }
        }
        i11 = -1;
        if (i11 != -1) {
            return true;
        }
        return false;
    }

    public static boolean a0(Context context) {
        boolean z10;
        if (context == null) {
            return false;
        }
        ConfigSpHandler b10 = ConfigSpHandler.b(context);
        synchronized (b10.f22478a) {
            if (!"0".equalsIgnoreCase(b10.D("clctPoi"))) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        n7.c("GeoLocationUtil", "poi enable: %s", Boolean.valueOf(z10));
        return z10;
    }

    public static boolean b0(Context context, AppInfo appInfo, String str) {
        n7.e("HarmonyUtils", "openHarmonyApp intent");
        boolean z10 = false;
        if (appInfo == null) {
            return false;
        }
        if (!TextUtils.isEmpty(appInfo.p())) {
            try {
                String p10 = appInfo.p();
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(str, p10));
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                com.huawei.openalliance.ad.ppskit.handlers.x.f(context, intent);
                z10 = true;
            } catch (Throwable unused) {
                n7.g("HarmonyUtils", "handle harmony intent url fail");
            }
        }
        if (!z10 && !TextUtils.isEmpty(appInfo.getIntentUri())) {
            return o2.g(context, str, appInfo.getIntentUri());
        }
        return z10;
    }

    public static boolean c0(Context context, String str) {
        try {
            if (o2.c(context.getApplicationContext(), str)) {
                return true;
            }
            if (!androidx.transition.n.M(com.huawei.openalliance.ad.ppskit.handlers.x.c(str))) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            n7.g("HarmonyUtils", "check app installed fail");
            return false;
        }
    }

    public static int d(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                if (type == 0) {
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                        case 16:
                            return 4;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            return 5;
                        case 13:
                        case 18:
                            return 6;
                        case 19:
                        default:
                            return 0;
                        case 20:
                            return 7;
                    }
                }
                if (9 == type) {
                    return 1;
                }
                if (1 == type) {
                    return 2;
                }
            }
        } catch (Exception unused) {
            ex.I("a", "get net info err");
        }
        return 0;
    }

    public static boolean d0(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != 1 && intValue != 2 && intValue != 6) {
                switch (intValue) {
                    case 12:
                    case 13:
                    case 14:
                        break;
                    default:
                        return false;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0087 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap e(android.content.Context r7, android.graphics.Bitmap r8) {
        /*
            java.lang.String r0 = "blur drawable exception"
            r1 = 0
            int r2 = r8.getWidth()     // Catch: java.lang.Throwable -> L65
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L65
            r3 = 1090519040(0x41000000, float:8.0)
            float r2 = r2 / r3
            int r2 = java.lang.Math.round(r2)     // Catch: java.lang.Throwable -> L65
            int r4 = r8.getHeight()     // Catch: java.lang.Throwable -> L65
            float r4 = (float) r4     // Catch: java.lang.Throwable -> L65
            float r4 = r4 / r3
            int r3 = java.lang.Math.round(r4)     // Catch: java.lang.Throwable -> L65
            r4 = 0
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createScaledBitmap(r8, r2, r3, r4)     // Catch: java.lang.Throwable -> L65
            android.renderscript.RenderScript r7 = android.renderscript.RenderScript.create(r7)     // Catch: java.lang.Throwable -> L62
            android.renderscript.Element r2 = android.renderscript.Element.U8_4(r7)     // Catch: java.lang.Throwable -> L5b
            android.renderscript.ScriptIntrinsicBlur r2 = android.renderscript.ScriptIntrinsicBlur.create(r7, r2)     // Catch: java.lang.Throwable -> L5b
            android.renderscript.Allocation r3 = android.renderscript.Allocation.createFromBitmap(r7, r8)     // Catch: java.lang.Throwable -> L58
            android.renderscript.Type r4 = r3.getType()     // Catch: java.lang.Throwable -> L53
            android.renderscript.Allocation r1 = android.renderscript.Allocation.createTyped(r7, r4)     // Catch: java.lang.Throwable -> L53
            r4 = 1084227584(0x40a00000, float:5.0)
            r2.setRadius(r4)     // Catch: java.lang.Throwable -> L53
            r2.setInput(r3)     // Catch: java.lang.Throwable -> L53
            r2.forEach(r1)     // Catch: java.lang.Throwable -> L53
            r1.copyTo(r8)     // Catch: java.lang.Throwable -> L53
            q(r3)
            q(r1)
            q(r2)
            if (r7 == 0) goto L52
            r7.destroy()
        L52:
            return r8
        L53:
            r4 = move-exception
            r6 = r1
            r1 = r7
            r7 = r6
            goto L6b
        L58:
            r3 = move-exception
            r4 = r3
            goto L5e
        L5b:
            r2 = move-exception
            r4 = r2
            r2 = r1
        L5e:
            r3 = r1
            r1 = r7
            r7 = r3
            goto L6b
        L62:
            r7 = move-exception
            r4 = r7
            goto L68
        L65:
            r7 = move-exception
            r4 = r7
            r8 = r1
        L68:
            r7 = r1
            r2 = r7
            r3 = r2
        L6b:
            java.lang.String r5 = "BlurUtil"
            java.lang.Class r4 = r4.getClass()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r4 = r4.getSimpleName()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = r0.concat(r4)     // Catch: java.lang.Throwable -> L8b
            com.huawei.hms.ads.ex.I(r5, r0)     // Catch: java.lang.Throwable -> L8b
            q(r3)
            q(r7)
            q(r2)
            if (r1 == 0) goto L8a
            r1.destroy()
        L8a:
            return r8
        L8b:
            r8 = move-exception
            q(r3)
            q(r7)
            q(r2)
            if (r1 == 0) goto L9a
            r1.destroy()
        L9a:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.a.e(android.content.Context, android.graphics.Bitmap):android.graphics.Bitmap");
    }

    public static boolean e0(Map map) {
        if (map != null && !map.isEmpty()) {
            return false;
        }
        return true;
    }

    public static String f0(Context context) {
        Activity activity = null;
        if (context == null) {
            n7.i("ActivityUtils", "ana_tag getActivityName context is null, return");
            return null;
        }
        int i10 = 0;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            }
            i10++;
            if (i10 > 5) {
                n7.i("ActivityUtils", "ana_tag getActivityName loop too much times, return");
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (activity != null) {
            n7.c("ActivityUtils", "ana_tag  getActivityName activityname = %s", activity.getLocalClassName());
            return activity.getLocalClassName();
        }
        n7.i("ActivityUtils", "ana_tag  getActivityName activityname is null");
        return "";
    }

    public static BitmapDrawable g(Context context, Drawable drawable) {
        String concat;
        long currentTimeMillis;
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2 = null;
        try {
            currentTimeMillis = System.currentTimeMillis();
            bitmapDrawable = new BitmapDrawable(context.getResources(), e(context, w0.c(drawable)));
        } catch (OutOfMemoryError unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            ex.Code("BlurUtil", "blurDrawable: duration %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            return bitmapDrawable;
        } catch (OutOfMemoryError unused2) {
            bitmapDrawable2 = bitmapDrawable;
            concat = "OOM blur image";
            BitmapDrawable bitmapDrawable3 = bitmapDrawable2;
            ex.I("BlurUtil", concat);
            return bitmapDrawable3;
        } catch (Throwable th2) {
            th = th2;
            bitmapDrawable2 = bitmapDrawable;
            concat = "blur drawable exception ".concat(th.getClass().getSimpleName());
            BitmapDrawable bitmapDrawable32 = bitmapDrawable2;
            ex.I("BlurUtil", concat);
            return bitmapDrawable32;
        }
    }

    public static void g0(SpannableStringBuilder spannableStringBuilder, Object obj, int i10, int i11) {
        for (Object obj2 : spannableStringBuilder.getSpans(i10, i11, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i10 && spannableStringBuilder.getSpanEnd(obj2) == i11 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i10, i11, 33);
    }

    public static ha.i h(Context context, boolean z10) {
        if (z10) {
            return ha.e.g(context);
        }
        return ha.i.e(context);
    }

    public static MaterialClickInfo h0(View view, MotionEvent motionEvent) {
        boolean z10;
        if (view == null || motionEvent == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int width = view.getWidth();
        int height = view.getHeight();
        ViewParent parent = view.getParent();
        for (int i10 = 0; i10 < 5 && parent != null; i10++) {
            if (!(parent instanceof PPSInterstitialView) && !(parent instanceof PPSRewardView)) {
                parent = parent.getParent();
            } else {
                z10 = true;
                break;
            }
        }
        z10 = false;
        if (z10) {
            float x10 = motionEvent.getX() + view.getLeft();
            float y10 = motionEvent.getY() + view.getTop();
            StringBuilder sb3 = new StringBuilder();
            ViewParent parent2 = view.getParent();
            for (int i11 = 0; i11 < 5 && parent2 != null; i11++) {
                if (parent2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent2;
                    x10 += viewGroup.getLeft();
                    y10 += viewGroup.getTop();
                }
                if (!(parent2 instanceof PPSInterstitialView) && !(parent2 instanceof PPSRewardView)) {
                    parent2 = parent2.getParent();
                } else {
                    ViewGroup viewGroup2 = (ViewGroup) parent2;
                    int width2 = viewGroup2.getWidth();
                    int height2 = viewGroup2.getHeight();
                    sb3.append(width2);
                    sb3.append("*");
                    sb3.append(height2);
                    return new MaterialClickInfo(Integer.valueOf((int) x10), Integer.valueOf((int) y10), sb3.toString());
                }
            }
            return null;
        }
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        sb2.append(width);
        sb2.append("*");
        sb2.append(height);
        return new MaterialClickInfo(Integer.valueOf((int) x11), Integer.valueOf((int) y11), sb2.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #0 {all -> 0x003b, blocks: (B:9:0x0032, B:19:0x001c, B:3:0x0006, B:5:0x0012, B:7:0x0016), top: B:2:0x0006, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer i(android.content.Context r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "MetaDataUtils"
            r1 = 0
            r2 = 1
            r3 = 0
            r4 = 2
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L1b
            r5 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r6 = r6.getApplicationInfo(r7, r5)     // Catch: java.lang.Throwable -> L1b
            if (r6 == 0) goto L2f
            android.os.Bundle r6 = r6.metaData     // Catch: java.lang.Throwable -> L1b
            if (r6 == 0) goto L2f
            java.lang.Object r6 = r6.get(r8)     // Catch: java.lang.Throwable -> L1b
            goto L30
        L1b:
            r6 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L3b
            r7[r3] = r8     // Catch: java.lang.Throwable -> L3b
            java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r6 = r6.getSimpleName()     // Catch: java.lang.Throwable -> L3b
            r7[r2] = r6     // Catch: java.lang.Throwable -> L3b
            java.lang.String r6 = "getMetaData %d err: %s"
            com.huawei.hms.ads.ex.I(r0, r6, r7)     // Catch: java.lang.Throwable -> L3b
        L2f:
            r6 = r1
        L30:
            if (r6 == 0) goto L4f
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L3b
            java.lang.Integer r6 = gb.p.g(r6)     // Catch: java.lang.Throwable -> L3b
            return r6
        L3b:
            r6 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r4]
            r7[r3] = r8
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getSimpleName()
            r7[r2] = r6
            java.lang.String r6 = "getIntegerMetaData %s err: %s"
            com.huawei.hms.ads.ex.I(r0, r6, r7)
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.a.i(android.content.Context, java.lang.String, java.lang.String):java.lang.Integer");
    }

    public static String i0(Context context, String str) {
        String str2;
        if (com.huawei.openalliance.ad.ppskit.utils.e.a(str, null, 0, com.huawei.openalliance.ad.ppskit.utils.e.f22834a)) {
            str2 = "haid_h5_content_server_CN";
        } else if (com.huawei.openalliance.ad.ppskit.utils.e.a(str, null, 1, com.huawei.openalliance.ad.ppskit.utils.e.f22835b)) {
            str2 = "haid_h5_content_server_HK";
        } else if (com.huawei.openalliance.ad.ppskit.utils.e.a(str, null, 2, com.huawei.openalliance.ad.ppskit.utils.e.f22836c)) {
            str2 = "haid_h5_content_server_EU";
        } else if (com.huawei.openalliance.ad.ppskit.utils.e.a(str, null, 3, com.huawei.openalliance.ad.ppskit.utils.e.f22837d)) {
            str2 = "haid_h5_content_server_RU";
        } else {
            n7.g("PrivacyUrlUtil", "getLocalH5ServerUrl error, countryCode not belong to any site.");
            str2 = "haid_h5_content_server";
        }
        return y1.c(context, str2);
    }

    public static Object j() {
        try {
            return androidx.transition.n.d(null, PersistentMessageCenter.class, "getInstance", null, null);
        } catch (Throwable unused) {
            ex.V("MessageNotifyManager", "get inner msg notify");
            synchronized (ja.b.f30190d) {
                if (ja.b.f30189c == null) {
                    ja.b.f30189c = new ja.b();
                }
                return ja.b.f30189c;
            }
        }
    }

    public static String j0(String str, z zVar) {
        StringBuilder l10 = com.ironsource.adapters.facebook.a.l(str, "&language=");
        l10.append(zVar.f29532b);
        l10.append("&version=");
        l10.append(zVar.f);
        l10.append("&script=");
        l10.append(zVar.f29535e);
        return l10.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String k(android.content.Context r6) {
        /*
            r0 = 1
            r1 = 0
            java.lang.String r2 = "ActivityUtils"
            r3 = 0
            if (r6 != 0) goto La
            java.lang.String r6 = "ana_tag getActivity context is null, return"
            goto L1d
        La:
            r4 = r1
        Lb:
            boolean r5 = r6 instanceof android.content.ContextWrapper
            if (r5 == 0) goto L28
            boolean r5 = r6 instanceof android.app.Activity
            if (r5 == 0) goto L17
            r3 = r6
            android.app.Activity r3 = (android.app.Activity) r3
            goto L28
        L17:
            int r4 = r4 + r0
            r5 = 5
            if (r4 <= r5) goto L21
            java.lang.String r6 = "ana_tag getActivity loop too much times, return"
        L1d:
            com.huawei.hms.ads.ex.Z(r2, r6)
            goto L28
        L21:
            android.content.ContextWrapper r6 = (android.content.ContextWrapper) r6
            android.content.Context r6 = r6.getBaseContext()
            goto Lb
        L28:
            if (r3 == 0) goto L3c
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.String r0 = r3.getLocalClassName()
            r6[r1] = r0
            java.lang.String r0 = "ana_tag  getActivityLocalClassName LocalClassName = %s"
            com.huawei.hms.ads.ex.Code(r2, r0, r6)
            java.lang.String r6 = r3.getLocalClassName()
            return r6
        L3c:
            java.lang.String r6 = "ana_tag  getActivityLocalClassName LocalClassName is null"
            com.huawei.hms.ads.ex.Z(r2, r6)
            java.lang.String r6 = ""
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.a.k(android.content.Context):java.lang.String");
    }

    public static boolean k0(Context context, String str) {
        long max;
        long currentTimeMillis = System.currentTimeMillis() - A;
        l d10 = l.d(context);
        synchronized (d10.f22585a) {
            max = Math.max(d10.G(str).getLong("location_refresh_interval_time", 1800000L), w.as);
        }
        n7.c("GeoLocationUtil", "refresh interval: %s, interval: %s", Long.valueOf(max), Long.valueOf(currentTimeMillis));
        if (currentTimeMillis > max) {
            n7.b("GeoLocationUtil", "refresh poi");
            return true;
        }
        n7.b("GeoLocationUtil", "not refresh poi");
        return false;
    }

    public static String l(Object obj) {
        String str;
        if (obj == null) {
            str = "ana_tag getActivityName obj is null, return";
        } else {
            if (obj instanceof View) {
                return k(((View) obj).getContext());
            }
            str = "ana_tag  getActivityName activityname is not view";
        }
        ex.Z("ActivityUtils", str);
        return null;
    }

    public static String l0() {
        Random random = new Random();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 8; i10++) {
            sb2.append(random.nextInt(10));
        }
        return sb2.toString();
    }

    public static JSONObject m(com.huawei.openalliance.ad.inter.data.AdContentData adContentData) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ba.Y, adContentData.u());
            jSONObject.put(ba.O, adContentData.B0());
            jSONObject.put(ba.N, adContentData.A0());
        } catch (Throwable th) {
            ex.I("HUAApi", "getParamContent ex:%s", th.getClass().getSimpleName());
        }
        return jSONObject;
    }

    public static boolean m0(Context context, String str) {
        boolean z10;
        n7.e("HarmonyUtils", "open harmony app main page");
        boolean z11 = false;
        try {
            z10 = o2.m(context, str);
        } catch (Throwable unused) {
            n7.g("HarmonyUtils", "open app main page fail");
            z10 = false;
        }
        if (z10) {
            return true;
        }
        try {
            List c10 = com.huawei.openalliance.ad.ppskit.handlers.x.c(str);
            if (!androidx.transition.n.M(c10)) {
                Intent intent = (Intent) c10.get(0);
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                com.huawei.openalliance.ad.ppskit.handlers.x.f(context, intent);
                z11 = true;
            }
            return z11;
        } catch (Throwable unused2) {
            n7.g("HarmonyUtils", "open harmony app main page fail");
            return z10;
        }
    }

    public static void n(Context context, Intent intent) {
        ex.V("MessageNotifyManager", "notifyMessage via hard link");
        Object j10 = j();
        if (j10 != null) {
            if (j10 instanceof ja.b) {
                ja.b bVar = (ja.b) j10;
                synchronized (bVar.f30191a) {
                    Set<NotifyCallback> set = (Set) bVar.f30192b.get(bi.B);
                    if (set != null) {
                        for (NotifyCallback notifyCallback : set) {
                            if (notifyCallback != null) {
                                c0.a(new ja.a(notifyCallback, intent));
                            }
                        }
                    }
                }
                return;
            }
            androidx.transition.n.d(j10, j10.getClass(), "notifyMessage", new Class[]{String.class, String.class, Intent.class}, new Object[]{context.getPackageName(), bi.B, intent});
        }
    }

    public static void n0(String str) {
        if (g0.f27302a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void o(Context context, String str) {
        ex.V("MessageNotifyManager", "unregisterAllNotify via aidl");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(ba.f22070t, str);
            jSONObject.putOpt(ba.f22072v, w.aF);
            ha.i.e(context).d(s.f, jSONObject.toString(), null, null);
        } catch (JSONException e10) {
            ex.I("MessageNotifyManager", "unregisterAllNotify ".concat(e10.getClass().getSimpleName()));
        }
        if (!r0.a(context)) {
            t(context, str);
        }
    }

    public static ArrayList o0(byte[] bArr) {
        long j10 = ((((bArr[11] & DefaultClassResolver.NAME) << 8) | (bArr[10] & DefaultClassResolver.NAME)) * com.anythink.expressad.exoplayer.b.f7300h) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j10).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static void p(Context context, String str, NotifyCallback notifyCallback) {
        ex.V("MessageNotifyManager", "registerNotifyViaAidl");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(ba.f22070t, str);
            jSONObject.putOpt(ba.f22072v, w.aE);
            ha.i.e(context).d(s.f, jSONObject.toString(), new ja.c(notifyCallback), String.class);
        } catch (JSONException e10) {
            ex.Code(5, "MessageNotifyManager", "registerNotify ", e10);
        }
    }

    public static Object p0(Context context, String str, String str2) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                return bundle.get(str2);
            }
            return null;
        } catch (Throwable th) {
            n7.h("MetaDataUtils", "getMetaData %d err: %s", str2, th.getClass().getSimpleName());
            return null;
        }
    }

    public static void q(BaseObj baseObj) {
        if (baseObj != null) {
            baseObj.destroy();
        }
    }

    public static String q0(Context context, String str) {
        if (TextUtils.isEmpty(f27u0)) {
            f27u0 = K(context).a(context, ServerConfig.a(), str, ServerConfig.b(), "h5Server".concat(y1.i(context)));
            n7.c("PrivacyUrlUtil", "app: %s base url for %s is: %s", ServerConfig.a(), "h5Server", y1.j(f27u0));
        }
        return f27u0;
    }

    public static boolean r(Map map) {
        if (map != null && !map.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void r0(Context context) {
        if (E0) {
            return;
        }
        n7.e("MediaGroupIdUtils", "init");
        E0 = true;
        if (!G0(context)) {
            J0(context);
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.huawei.hwid.loginSuccess.anonymous");
            intentFilter.addAction("com.huawei.hwid.ACTION_REMOVE_ACCOUNT");
            n7.e("MediaGroupIdUtils", "register hw account receiver");
            context.registerReceiver(new mh(), intentFilter, "com.huawei.hms.permission.INNER_BROADCAST", null);
        } catch (Throwable th) {
            n7.f("MediaGroupIdUtils", "register hw account receiver ex: %s", th.getClass().getSimpleName());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean s(android.content.Context r6) {
        /*
            r0 = 1
            r1 = 0
            if (r6 != 0) goto L5
            goto L49
        L5:
            r2 = 2
            int r3 = d(r6)
            if (r2 != r3) goto L49
            boolean r2 = gb.z.f()     // Catch: java.lang.Throwable -> L3a java.lang.ClassNotFoundException -> L3c
            if (r2 == 0) goto L15
            java.lang.String r2 = "com.hihonor.android.net.wifi.WifiManagerCommonEx"
            goto L17
        L15:
            java.lang.String r2 = "com.huawei.android.net.wifi.WifiManagerCommonEx"
        L17:
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.String r3 = "getHwMeteredHint"
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r4[r1] = r5     // Catch: java.lang.Throwable -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.reflect.Method r3 = r2.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.Object r2 = r2.newInstance()     // Catch: java.lang.Throwable -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L3a java.lang.ClassNotFoundException -> L3c
            r4[r1] = r6     // Catch: java.lang.Throwable -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.Object r2 = r3.invoke(r2, r4)     // Catch: java.lang.Throwable -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L3a java.lang.ClassNotFoundException -> L3c
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L3a java.lang.ClassNotFoundException -> L3c
            goto L45
        L3a:
            r2 = move-exception
            goto L3d
        L3c:
            r2 = move-exception
        L3d:
            java.lang.String r3 = "isMeteredWifi "
            java.lang.String r4 = "a"
            e0.i.q(r2, r3, r4)
            r2 = r1
        L45:
            if (r2 != 0) goto L49
            r2 = r0
            goto L4a
        L49:
            r2 = r1
        L4a:
            if (r2 != 0) goto L5c
            if (r6 != 0) goto L4f
            goto L57
        L4f:
            int r6 = d(r6)
            if (r0 != r6) goto L57
            r6 = r0
            goto L58
        L57:
            r6 = r1
        L58:
            if (r6 == 0) goto L5b
            goto L5c
        L5b:
            r0 = r1
        L5c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.a.s(android.content.Context):boolean");
    }

    public static boolean s0(int i10) {
        return !Z(i10, new int[]{1, 0, 9});
    }

    public static void t(Context context, String str) {
        ex.V("MessageNotifyManager", "unregisterAllNotify via hard link");
        Object j10 = j();
        if (j10 != null) {
            if (j10 instanceof ja.b) {
                ja.b bVar = (ja.b) j10;
                if (!TextUtils.isEmpty(str)) {
                    synchronized (bVar.f30191a) {
                        bVar.f30192b.remove(str);
                    }
                    return;
                }
                return;
            }
            androidx.transition.n.d(j10, j10.getClass(), "unregisterAll", new Class[]{String.class, String.class}, new Object[]{context.getPackageName(), str});
        }
    }

    public static boolean t0(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if ((L(context).a(o2.l(context.getApplicationContext(), str)) & o.f8460d) == 0) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            n7.g("HarmonyUtils", "isHarmonyApp exception");
            return false;
        }
    }

    public static void u(Context context, String str, NotifyCallback notifyCallback) {
        if (context != null && !TextUtils.isEmpty(str) && notifyCallback != null) {
            ex.V("MessageNotifyManager", "registerNotifyViaHardLink");
            Object j10 = j();
            if (j10 != null) {
                if (j10 instanceof ja.b) {
                    ja.b bVar = (ja.b) j10;
                    if (!TextUtils.isEmpty(str)) {
                        synchronized (bVar.f30191a) {
                            Set set = (Set) bVar.f30192b.get(str);
                            if (set == null) {
                                set = new HashSet();
                                bVar.f30192b.put(str, set);
                            }
                            set.add(notifyCallback);
                        }
                        return;
                    }
                    return;
                }
                androidx.transition.n.d(j10, j10.getClass(), "registerNotifyCallbackFromSdk", new Class[]{String.class, String.class, Object.class}, new Object[]{context.getPackageName(), str, notifyCallback});
                return;
            }
            return;
        }
        ex.V("MessageNotifyManager", "registerNotifyViaHardLink some param is empty");
    }

    public static void u0(boolean z10, String str) {
        if (z10) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean v(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            if (!activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            ex.I("a", "check net conn err");
            return false;
        }
    }

    public static void v0(boolean z10) {
        if (z10) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static Address w(Context context, double d10, double d11, Locale locale) {
        List<Address> list;
        if (context == null) {
            return null;
        }
        try {
            list = new Geocoder(context, locale).getFromLocation(d11, d10, 1);
        } catch (Throwable th) {
            n7.h("GeoLocationUtil", "get geo ex:%s", th.getClass().getSimpleName());
            list = null;
        }
        if (androidx.transition.n.M(list)) {
            return null;
        }
        return list.get(0);
    }

    public static void w0(int i10) {
        if (i10 >= 0) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static Pair x(Context context) {
        if (!G0(context)) {
            p2.d(new ki(context));
        }
        q1 m10 = q1.m(context);
        String g6 = m10.g();
        int v3 = m10.v();
        n7.c("MediaGroupIdUtils", "get groupId: %s", y1.j(g6));
        n7.f("MediaGroupIdUtils", "get grpIdStatusCode: %s", Integer.valueOf(v3));
        return new Pair(g6, Integer.valueOf(v3));
    }

    public static int x0(Context context, String str) {
        String str2;
        if (Binder.getCallingPid() == Process.myPid()) {
            str2 = context.getPackageName();
        } else {
            str2 = null;
        }
        return z0(context, str, str2, Binder.getCallingPid(), Binder.getCallingUid());
    }

    public static AnalysisEventReport y(ContentRecord contentRecord) {
        AnalysisEventReport analysisEventReport = new AnalysisEventReport();
        if (contentRecord != null) {
            analysisEventReport.n(contentRecord.h());
            analysisEventReport.p(contentRecord.h1());
            analysisEventReport.t(contentRecord.Z0());
            analysisEventReport.r(contentRecord.n1());
            analysisEventReport.v(contentRecord.p2());
            analysisEventReport.f(contentRecord.a1());
        }
        return analysisEventReport;
    }

    public static void y0(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0074 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.openalliance.ad.ppskit.inter.data.MaterialClickInfo z(android.view.View r13, android.view.MotionEvent r14) {
        /*
            r0 = 0
            if (r13 == 0) goto L94
            if (r14 != 0) goto L7
            goto L94
        L7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r13.getWidth()
            int r3 = r13.getHeight()
            float r4 = r14.getX()
            float r14 = r14.getY()
            boolean r5 = r13 instanceof android.widget.ImageView
            if (r5 == 0) goto L75
            r6 = 1
            r7 = 0
            r8 = 2
            if (r5 == 0) goto L62
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            android.graphics.drawable.Drawable r5 = r13.getDrawable()
            if (r5 == 0) goto L62
            int[] r5 = new int[r8]
            android.graphics.drawable.Drawable r9 = r13.getDrawable()
            android.graphics.Rect r9 = r9.getBounds()
            int r9 = r9.width()
            android.graphics.drawable.Drawable r10 = r13.getDrawable()
            android.graphics.Rect r10 = r10.getBounds()
            int r10 = r10.height()
            android.graphics.Matrix r13 = r13.getImageMatrix()
            r11 = 10
            float[] r11 = new float[r11]
            r13.getValues(r11)
            r13 = r11[r7]
            r12 = 4
            r11 = r11[r12]
            float r9 = (float) r9
            float r9 = r9 * r13
            int r13 = (int) r9
            r5[r7] = r13
            float r13 = (float) r10
            float r13 = r13 * r11
            int r13 = (int) r13
            r5[r6] = r13
            goto L63
        L62:
            r5 = r0
        L63:
            if (r5 == 0) goto L74
            r13 = r5[r7]
            r0 = r5[r6]
            int r2 = r2 - r13
            int r2 = r2 / r8
            float r2 = (float) r2
            float r4 = r4 - r2
            int r3 = r3 - r0
            int r3 = r3 / r8
            float r2 = (float) r3
            float r14 = r14 - r2
            r2 = r13
            r3 = r0
            goto L75
        L74:
            return r0
        L75:
            r1.append(r2)
            java.lang.String r13 = "*"
            r1.append(r13)
            r1.append(r3)
            com.huawei.openalliance.ad.ppskit.inter.data.MaterialClickInfo r13 = new com.huawei.openalliance.ad.ppskit.inter.data.MaterialClickInfo
            int r0 = (int) r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r14 = (int) r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.String r1 = r1.toString()
            r13.<init>(r0, r14, r1)
            return r13
        L94:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.a.z(android.view.View, android.view.MotionEvent):com.huawei.openalliance.ad.ppskit.inter.data.MaterialClickInfo");
    }

    public static int z0(Context context, String str, String str2, int i10, int i11) {
        boolean z10;
        int c10;
        if (context.checkPermission(str, i10, i11) == -1) {
            return -1;
        }
        String d10 = b0.g.d(str);
        if (d10 == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i11);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (myUid == i11 && m0.b.a(packageName, str2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (Build.VERSION.SDK_INT >= 29) {
                AppOpsManager c11 = b0.h.c(context);
                c10 = b0.h.a(c11, d10, Binder.getCallingUid(), str2);
                if (c10 == 0) {
                    c10 = b0.h.a(c11, d10, i11, b0.h.b(context));
                }
            } else {
                c10 = b0.g.c((AppOpsManager) b0.g.a(context, AppOpsManager.class), d10, str2);
            }
        } else {
            c10 = b0.g.c((AppOpsManager) b0.g.a(context, AppOpsManager.class), d10, str2);
        }
        if (c10 == 0) {
            return 0;
        }
        return -2;
    }

    public void W0(int i10, View view) {
        if (!f34z) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                y = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f34z = true;
        }
        Field field = y;
        if (field != null) {
            try {
                y.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    @Override // n0.m0
    public void c() {
    }

    @Override // n0.m0
    public void b(View view) {
    }

    @Override // m3.c
    public a3.x f(a3.x xVar, y2.g gVar) {
        return xVar;
    }
}
