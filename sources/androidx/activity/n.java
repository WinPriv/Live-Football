package androidx.activity;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.renderscript.BaseObj;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import com.anythink.expressad.exoplayer.k.p;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.gl;
import com.huawei.hms.ads.jo;
import com.huawei.hms.safetydetect.sysintegrity.innersdk.SafetyDetectInnerAPI;
import com.huawei.hms.safetydetect.userdetect.innersdk.UserDetectInnerAPI;
import com.huawei.openalliance.ad.constant.ah;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.constant.s;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.FeedbackInfo;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Ad30;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Content;
import com.huawei.openalliance.ad.ppskit.beans.metadata.FlowControl;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ImpEX;
import com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.download.local.AppLocalDownloadTask;
import com.huawei.openalliance.ad.ppskit.download.local.RemoteAppDownloadTask;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import com.huawei.openalliance.ad.ppskit.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.ppskit.msgnotify.PersistentMessageCenter;
import com.huawei.openalliance.ad.ppskit.utils.b2;
import com.huawei.openalliance.ad.ppskit.utils.d0;
import com.huawei.openalliance.ad.ppskit.utils.i2;
import com.huawei.openalliance.ad.ppskit.utils.k0;
import com.huawei.openalliance.ad.ppskit.utils.k1;
import com.huawei.openalliance.ad.ppskit.utils.o2;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.q1;
import com.huawei.openalliance.ad.ppskit.utils.v0;
import com.huawei.openalliance.ad.ppskit.utils.y0;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import com.huawei.opendevice.open.IOaidManager;
import com.huawei.opendevice.open.PpsOaidManager;
import d6.g0;
import d6.w;
import d7.g;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import ka.Cif;
import ka.bg;
import ka.c7;
import ka.d7;
import ka.dg;
import ka.eg;
import ka.ge;
import ka.gg;
import ka.gi;
import ka.hb;
import ka.hg;
import ka.ig;
import ka.ji;
import ka.mi;
import ka.n7;
import ka.ni;
import ka.ob;
import ka.of;
import ka.pf;
import ka.qf;
import ka.ri;
import ka.s6;
import ka.sf;
import ka.si;
import ka.tf;
import ka.uf;
import ka.vf;
import ka.w6;
import ka.wf;
import ka.y6;
import ka.yf;
import n0.c0;
import n0.l0;
import org.json.JSONException;
import org.json.JSONObject;
import p4.u;

/* compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
/* loaded from: classes.dex */
public class n implements c3.a, y2.d, com.bumptech.glide.manager.h, com.bumptech.glide.manager.g, md.a, hb, k0, p4.j {
    public static volatile y6.m A0;
    public static volatile s6 C0;
    public static HashMap E0;
    public static long F0;
    public static int G;
    public static long G0;
    public static volatile p2.f H;
    public static volatile p2.e I;
    public static n I0;

    /* renamed from: x, reason: collision with root package name */
    public static String f517x;
    public static byte y;

    /* renamed from: z0, reason: collision with root package name */
    public static JSONObject f520z0;

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f507s = {R.attr.shimmer_auto_start, R.attr.shimmer_base_alpha, R.attr.shimmer_base_color, R.attr.shimmer_clip_to_children, R.attr.shimmer_colored, R.attr.shimmer_direction, R.attr.shimmer_dropoff, R.attr.shimmer_duration, R.attr.shimmer_fixed_height, R.attr.shimmer_fixed_width, R.attr.shimmer_height_ratio, R.attr.shimmer_highlight_alpha, R.attr.shimmer_highlight_color, R.attr.shimmer_intensity, R.attr.shimmer_repeat_count, R.attr.shimmer_repeat_delay, R.attr.shimmer_repeat_mode, R.attr.shimmer_shape, R.attr.shimmer_tilt, R.attr.shimmer_width_ratio};

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f509t = {R.attr.resize_mode};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f511u = {R.attr.ad_marker_color, R.attr.ad_marker_width, R.attr.bar_gravity, R.attr.bar_height, R.attr.buffered_color, R.attr.played_ad_marker_color, R.attr.played_color, R.attr.scrubber_color, R.attr.scrubber_disabled_size, R.attr.scrubber_dragged_size, R.attr.scrubber_drawable, R.attr.scrubber_enabled_size, R.attr.touch_target_height, R.attr.unplayed_color};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f513v = {R.attr.ad_marker_color, R.attr.ad_marker_width, R.attr.bar_gravity, R.attr.bar_height, R.attr.buffered_color, R.attr.controller_layout_id, R.attr.played_ad_marker_color, R.attr.played_color, R.attr.repeat_toggle_modes, R.attr.scrubber_color, R.attr.scrubber_disabled_size, R.attr.scrubber_dragged_size, R.attr.scrubber_drawable, R.attr.scrubber_enabled_size, R.attr.show_fastforward_button, R.attr.show_next_button, R.attr.show_previous_button, R.attr.show_rewind_button, R.attr.show_shuffle_button, R.attr.show_timeout, R.attr.time_bar_min_update_interval, R.attr.touch_target_height, R.attr.unplayed_color};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f515w = {R.attr.ad_marker_color, R.attr.ad_marker_width, R.attr.auto_show, R.attr.bar_height, R.attr.buffered_color, R.attr.controller_layout_id, R.attr.default_artwork, R.attr.hide_during_ads, R.attr.hide_on_touch, R.attr.keep_content_on_player_reset, R.attr.played_ad_marker_color, R.attr.played_color, R.attr.player_layout_id, R.attr.repeat_toggle_modes, R.attr.resize_mode, R.attr.scrubber_color, R.attr.scrubber_disabled_size, R.attr.scrubber_dragged_size, R.attr.scrubber_drawable, R.attr.scrubber_enabled_size, R.attr.show_buffering, R.attr.show_shuffle_button, R.attr.show_timeout, R.attr.shutter_background_color, R.attr.surface_type, R.attr.time_bar_min_update_interval, R.attr.touch_target_height, R.attr.unplayed_color, R.attr.use_artwork, R.attr.use_controller};

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f519z = {0, 0, 0, 1};
    public static final String[] A = {"", "A", "B", "C"};
    public static final float[][] B = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] C = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] D = {95.047f, 100.0f, 108.883f};
    public static final float[][] E = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final int[] F = {android.R.attr.orientation, android.R.attr.clipToPadding, android.R.attr.descendantFocusability, R.attr.fastScrollEnabled, R.attr.fastScrollHorizontalThumbDrawable, R.attr.fastScrollHorizontalTrackDrawable, R.attr.fastScrollVerticalThumbDrawable, R.attr.fastScrollVerticalTrackDrawable, R.attr.layoutManager, R.attr.reverseLayout, R.attr.spanCount, R.attr.stackFromEnd};
    public static final int[] J = {R.attr.lottie_autoPlay, R.attr.lottie_cacheComposition, R.attr.lottie_clipToCompositionBounds, R.attr.lottie_colorFilter, R.attr.lottie_defaultFontFileExtension, R.attr.lottie_enableMergePathsForKitKatAndAbove, R.attr.lottie_fallbackRes, R.attr.lottie_fileName, R.attr.lottie_ignoreDisabledSystemAnimations, R.attr.lottie_imageAssetsFolder, R.attr.lottie_loop, R.attr.lottie_progress, R.attr.lottie_rawRes, R.attr.lottie_renderMode, R.attr.lottie_repeatCount, R.attr.lottie_repeatMode, R.attr.lottie_speed, R.attr.lottie_url, R.attr.lottie_useCompositionFrameRate};
    public static final int[] K = {R.attr.layout_scrollEffect, R.attr.layout_scrollFlags, R.attr.layout_scrollInterpolator};
    public static final int[] L = {R.attr.backgroundColor, R.attr.badgeGravity, R.attr.badgeRadius, R.attr.badgeTextColor, R.attr.badgeWidePadding, R.attr.badgeWithTextRadius, R.attr.horizontalOffset, R.attr.horizontalOffsetWithText, R.attr.maxCharacterCount, R.attr.number, R.attr.verticalOffset, R.attr.verticalOffsetWithText};
    public static final int[] M = {android.R.attr.indeterminate, R.attr.hideAnimationBehavior, R.attr.indicatorColor, R.attr.minHideDelay, R.attr.showAnimationBehavior, R.attr.showDelay, R.attr.trackColor, R.attr.trackCornerRadius, R.attr.trackThickness};
    public static final int[] N = {android.R.attr.minHeight, R.attr.compatShadowEnabled, R.attr.itemHorizontalTranslationEnabled};
    public static final int[] O = {android.R.attr.maxWidth, android.R.attr.maxHeight, android.R.attr.elevation, R.attr.backgroundTint, R.attr.behavior_draggable, R.attr.behavior_expandedOffset, R.attr.behavior_fitToContents, R.attr.behavior_halfExpandedRatio, R.attr.behavior_hideable, R.attr.behavior_peekHeight, R.attr.behavior_saveFlags, R.attr.behavior_significantVelocityThreshold, R.attr.behavior_skipCollapsed, R.attr.gestureInsetBottomIgnored, R.attr.marginLeftSystemWindowInsets, R.attr.marginRightSystemWindowInsets, R.attr.marginTopSystemWindowInsets, R.attr.paddingBottomSystemWindowInsets, R.attr.paddingLeftSystemWindowInsets, R.attr.paddingRightSystemWindowInsets, R.attr.paddingTopSystemWindowInsets, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.shouldRemoveExpandedCorners};
    public static final int[] P = {android.R.attr.textAppearance, android.R.attr.textSize, android.R.attr.textColor, android.R.attr.ellipsize, android.R.attr.maxWidth, android.R.attr.text, android.R.attr.checkable, R.attr.checkedIcon, R.attr.checkedIconEnabled, R.attr.checkedIconTint, R.attr.checkedIconVisible, R.attr.chipBackgroundColor, R.attr.chipCornerRadius, R.attr.chipEndPadding, R.attr.chipIcon, R.attr.chipIconEnabled, R.attr.chipIconSize, R.attr.chipIconTint, R.attr.chipIconVisible, R.attr.chipMinHeight, R.attr.chipMinTouchTargetSize, R.attr.chipStartPadding, R.attr.chipStrokeColor, R.attr.chipStrokeWidth, R.attr.chipSurfaceColor, R.attr.closeIcon, R.attr.closeIconEnabled, R.attr.closeIconEndPadding, R.attr.closeIconSize, R.attr.closeIconStartPadding, R.attr.closeIconTint, R.attr.closeIconVisible, R.attr.ensureMinTouchTargetSize, R.attr.hideMotionSpec, R.attr.iconEndPadding, R.attr.iconStartPadding, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.showMotionSpec, R.attr.textEndPadding, R.attr.textStartPadding};
    public static final int[] Q = {R.attr.indicatorDirectionCircular, R.attr.indicatorInset, R.attr.indicatorSize};
    public static final int[] R = {R.attr.clockFaceBackgroundColor, R.attr.clockNumberTextColor};
    public static final int[] S = {R.attr.clockHandColor, R.attr.materialCircleRadius, R.attr.selectorSize};
    public static final int[] T = {R.attr.layout_collapseMode, R.attr.layout_collapseParallaxMultiplier};
    public static final int[] U = {R.attr.behavior_autoHide, R.attr.behavior_autoShrink};
    public static final int[] V = {R.attr.behavior_autoHide};
    public static final int[] W = {android.R.attr.foreground, android.R.attr.foregroundGravity, R.attr.foregroundInsidePadding};
    public static final int[] X = {R.attr.indeterminateAnimationType, R.attr.indicatorDirectionLinear};
    public static final int[] Y = {R.attr.backgroundInsetBottom, R.attr.backgroundInsetEnd, R.attr.backgroundInsetStart, R.attr.backgroundInsetTop};
    public static final int[] Z = {android.R.attr.inputType, android.R.attr.popupElevation, R.attr.simpleItemLayout, R.attr.simpleItemSelectedColor, R.attr.simpleItemSelectedRippleColor, R.attr.simpleItems};

    /* renamed from: c0, reason: collision with root package name */
    public static final int[] f491c0 = {android.R.attr.background, android.R.attr.insetLeft, android.R.attr.insetRight, android.R.attr.insetTop, android.R.attr.insetBottom, android.R.attr.checkable, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.cornerRadius, R.attr.elevation, R.attr.icon, R.attr.iconGravity, R.attr.iconPadding, R.attr.iconSize, R.attr.iconTint, R.attr.iconTintMode, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.strokeColor, R.attr.strokeWidth, R.attr.toggleCheckedStateOnClick};

    /* renamed from: d0, reason: collision with root package name */
    public static final int[] f492d0 = {android.R.attr.enabled, R.attr.checkedButton, R.attr.selectionRequired, R.attr.singleSelection};

    /* renamed from: e0, reason: collision with root package name */
    public static final int[] f493e0 = {android.R.attr.windowFullscreen, R.attr.dayInvalidStyle, R.attr.daySelectedStyle, R.attr.dayStyle, R.attr.dayTodayStyle, R.attr.nestedScrollable, R.attr.rangeFillColor, R.attr.yearSelectedStyle, R.attr.yearStyle, R.attr.yearTodayStyle};

    /* renamed from: f0, reason: collision with root package name */
    public static final int[] f494f0 = {android.R.attr.insetLeft, android.R.attr.insetRight, android.R.attr.insetTop, android.R.attr.insetBottom, R.attr.itemFillColor, R.attr.itemShapeAppearance, R.attr.itemShapeAppearanceOverlay, R.attr.itemStrokeColor, R.attr.itemStrokeWidth, R.attr.itemTextColor};

    /* renamed from: g0, reason: collision with root package name */
    public static final int[] f495g0 = {android.R.attr.button, R.attr.buttonCompat, R.attr.buttonIcon, R.attr.buttonIconTint, R.attr.buttonIconTintMode, R.attr.buttonTint, R.attr.centerIfNoTextEnabled, R.attr.checkedState, R.attr.errorAccessibilityLabel, R.attr.errorShown, R.attr.useMaterialThemeColors};

    /* renamed from: h0, reason: collision with root package name */
    public static final int[] f496h0 = {R.attr.buttonTint, R.attr.useMaterialThemeColors};

    /* renamed from: i0, reason: collision with root package name */
    public static final int[] f497i0 = {R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay};

    /* renamed from: j0, reason: collision with root package name */
    public static final int[] f498j0 = {android.R.attr.letterSpacing, android.R.attr.lineHeight, R.attr.lineHeight};

    /* renamed from: k0, reason: collision with root package name */
    public static final int[] f499k0 = {android.R.attr.textAppearance, android.R.attr.lineHeight, R.attr.lineHeight};

    /* renamed from: l0, reason: collision with root package name */
    public static final int[] f500l0 = {R.attr.logoAdjustViewBounds, R.attr.logoScaleType, R.attr.navigationIconTint, R.attr.subtitleCentered, R.attr.titleCentered};

    /* renamed from: m0, reason: collision with root package name */
    public static final int[] f501m0 = {android.R.attr.height, android.R.attr.width, android.R.attr.color, R.attr.marginHorizontal, R.attr.shapeAppearance};

    /* renamed from: n0, reason: collision with root package name */
    public static final int[] f502n0 = {R.attr.backgroundTint, R.attr.elevation, R.attr.itemActiveIndicatorStyle, R.attr.itemBackground, R.attr.itemIconSize, R.attr.itemIconTint, R.attr.itemPaddingBottom, R.attr.itemPaddingTop, R.attr.itemRippleColor, R.attr.itemTextAppearanceActive, R.attr.itemTextAppearanceInactive, R.attr.itemTextColor, R.attr.labelVisibilityMode, R.attr.menu};

    /* renamed from: o0, reason: collision with root package name */
    public static final int[] f503o0 = {R.attr.materialCircleRadius};

    /* renamed from: p0, reason: collision with root package name */
    public static final int[] f504p0 = {R.attr.behavior_overlapTop};

    /* renamed from: q0, reason: collision with root package name */
    public static final int[] f505q0 = {R.attr.cornerFamily, R.attr.cornerFamilyBottomLeft, R.attr.cornerFamilyBottomRight, R.attr.cornerFamilyTopLeft, R.attr.cornerFamilyTopRight, R.attr.cornerSize, R.attr.cornerSizeBottomLeft, R.attr.cornerSizeBottomRight, R.attr.cornerSizeTopLeft, R.attr.cornerSizeTopRight};

    /* renamed from: r0, reason: collision with root package name */
    public static final int[] f506r0 = {android.R.attr.maxWidth, android.R.attr.maxHeight, android.R.attr.elevation, R.attr.backgroundTint, R.attr.behavior_draggable, R.attr.coplanarSiblingViewId, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay};

    /* renamed from: s0, reason: collision with root package name */
    public static final int[] f508s0 = {android.R.attr.maxWidth, R.attr.actionTextColorAlpha, R.attr.animationMode, R.attr.backgroundOverlayColorAlpha, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.elevation, R.attr.maxActionInlineWidth, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay};

    /* renamed from: t0, reason: collision with root package name */
    public static final int[] f510t0 = {android.R.attr.icon, android.R.attr.layout, android.R.attr.text};

    /* renamed from: u0, reason: collision with root package name */
    public static final int[] f512u0 = {R.attr.tabBackground, R.attr.tabContentStart, R.attr.tabGravity, R.attr.tabIconTint, R.attr.tabIconTintMode, R.attr.tabIndicator, R.attr.tabIndicatorAnimationDuration, R.attr.tabIndicatorAnimationMode, R.attr.tabIndicatorColor, R.attr.tabIndicatorFullWidth, R.attr.tabIndicatorGravity, R.attr.tabIndicatorHeight, R.attr.tabInlineLabel, R.attr.tabMaxWidth, R.attr.tabMinWidth, R.attr.tabMode, R.attr.tabPadding, R.attr.tabPaddingBottom, R.attr.tabPaddingEnd, R.attr.tabPaddingStart, R.attr.tabPaddingTop, R.attr.tabRippleColor, R.attr.tabSelectedTextAppearance, R.attr.tabSelectedTextColor, R.attr.tabTextAppearance, R.attr.tabTextColor, R.attr.tabUnboundedRipple};

    /* renamed from: v0, reason: collision with root package name */
    public static final int[] f514v0 = {android.R.attr.textSize, android.R.attr.typeface, android.R.attr.textStyle, android.R.attr.textColor, android.R.attr.textColorHint, android.R.attr.textColorLink, android.R.attr.shadowColor, android.R.attr.shadowDx, android.R.attr.shadowDy, android.R.attr.shadowRadius, android.R.attr.fontFamily, android.R.attr.textFontWeight, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.textAllCaps, R.attr.textLocale};

    /* renamed from: w0, reason: collision with root package name */
    public static final int[] f516w0 = {R.attr.textInputLayoutFocusedRectEnabled};

    /* renamed from: x0, reason: collision with root package name */
    public static final int[] f518x0 = {android.R.attr.enabled, android.R.attr.textColorHint, android.R.attr.maxWidth, android.R.attr.minWidth, android.R.attr.hint, android.R.attr.maxEms, android.R.attr.minEms, R.attr.boxBackgroundColor, R.attr.boxBackgroundMode, R.attr.boxCollapsedPaddingTop, R.attr.boxCornerRadiusBottomEnd, R.attr.boxCornerRadiusBottomStart, R.attr.boxCornerRadiusTopEnd, R.attr.boxCornerRadiusTopStart, R.attr.boxStrokeColor, R.attr.boxStrokeErrorColor, R.attr.boxStrokeWidth, R.attr.boxStrokeWidthFocused, R.attr.counterEnabled, R.attr.counterMaxLength, R.attr.counterOverflowTextAppearance, R.attr.counterOverflowTextColor, R.attr.counterTextAppearance, R.attr.counterTextColor, R.attr.endIconCheckable, R.attr.endIconContentDescription, R.attr.endIconDrawable, R.attr.endIconMinSize, R.attr.endIconMode, R.attr.endIconScaleType, R.attr.endIconTint, R.attr.endIconTintMode, R.attr.errorAccessibilityLiveRegion, R.attr.errorContentDescription, R.attr.errorEnabled, R.attr.errorIconDrawable, R.attr.errorIconTint, R.attr.errorIconTintMode, R.attr.errorTextAppearance, R.attr.errorTextColor, R.attr.expandedHintEnabled, R.attr.helperText, R.attr.helperTextEnabled, R.attr.helperTextTextAppearance, R.attr.helperTextTextColor, R.attr.hintAnimationEnabled, R.attr.hintEnabled, R.attr.hintTextAppearance, R.attr.hintTextColor, R.attr.passwordToggleContentDescription, R.attr.passwordToggleDrawable, R.attr.passwordToggleEnabled, R.attr.passwordToggleTint, R.attr.passwordToggleTintMode, R.attr.placeholderText, R.attr.placeholderTextAppearance, R.attr.placeholderTextColor, R.attr.prefixText, R.attr.prefixTextAppearance, R.attr.prefixTextColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.startIconCheckable, R.attr.startIconContentDescription, R.attr.startIconDrawable, R.attr.startIconMinSize, R.attr.startIconScaleType, R.attr.startIconTint, R.attr.startIconTintMode, R.attr.suffixText, R.attr.suffixTextAppearance, R.attr.suffixTextColor};
    public static final int[] y0 = {android.R.attr.textAppearance, R.attr.enforceMaterialTheme, R.attr.enforceTextAppearance};
    public static final byte[] B0 = new byte[0];
    public static final byte[] D0 = new byte[0];
    public static final byte[] H0 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    public /* synthetic */ n() {
    }

    public static AppInfo A(AppLocalDownloadTask appLocalDownloadTask) {
        if (appLocalDownloadTask.n() == null) {
            return null;
        }
        AppInfo appInfo = new AppInfo();
        appInfo.B(appLocalDownloadTask.n().getPackageName());
        appInfo.W(appLocalDownloadTask.n().c());
        appInfo.v(appLocalDownloadTask.K());
        appInfo.X(appLocalDownloadTask.n().d());
        return appInfo;
    }

    public static int A0(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static IOaidManager B(Context context) {
        y6.m ppsOaidManager;
        if (A0 == null) {
            synchronized (B0) {
                if (A0 == null) {
                    boolean c10 = Cif.c(context);
                    boolean d10 = Cif.a(context).d();
                    boolean z10 = false;
                    n7.f("OaidManager", "inner device: %s, chinaRom: %s", Boolean.valueOf(c10), Boolean.valueOf(d10));
                    if (c10 && d10) {
                        z10 = true;
                    }
                    if (z10) {
                        ppsOaidManager = ib.k.j(context);
                    } else {
                        ppsOaidManager = PpsOaidManager.getInstance(context);
                    }
                    A0 = ppsOaidManager;
                }
            }
        }
        return A0;
    }

    public static int B0(float f) {
        boolean z10;
        float f10;
        boolean z11;
        float f11;
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f12 = (f + 16.0f) / 116.0f;
        if (f > 8.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f10 = f12 * f12 * f12;
        } else {
            f10 = f / 903.2963f;
        }
        float f13 = f12 * f12 * f12;
        if (f13 > 0.008856452f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            f11 = f13;
        } else {
            f11 = ((f12 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z11) {
            f13 = ((f12 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = D;
        return f0.a.a(f11 * fArr[0], f10 * fArr[1], f13 * fArr[2]);
    }

    public static Double C(Double d10) {
        if (d10 != null && !Double.isInfinite(d10.doubleValue()) && !Double.isNaN(d10.doubleValue())) {
            return Double.valueOf(new BigDecimal(d10.doubleValue()).setScale(4, 4).doubleValue());
        }
        return null;
    }

    public static boolean C0(MotionEvent motionEvent, int i10) {
        if ((motionEvent.getSource() & i10) == i10) {
            return true;
        }
        return false;
    }

    public static Object D(Context context, AppInfo appInfo) {
        boolean z10;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("content", y0.q(null, appInfo));
            w6 b10 = w6.b(context);
            String jSONObject2 = jSONObject.toString();
            if (appInfo != null && appInfo.D(5)) {
                z10 = true;
            } else {
                z10 = false;
            }
            return b10.c(RemoteAppDownloadTask.class, "getDownloadStatus", jSONObject2, z10).f32211c;
        } catch (JSONException unused) {
            n7.g("ApDnApi", "queryTask JSONException");
            return null;
        }
    }

    public static float D0(int i10) {
        float pow;
        float f = i10 / 255.0f;
        if (f <= 0.04045f) {
            pow = f / 12.92f;
        } else {
            pow = (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static String E(String str, String str2) {
        if (!TextUtils.isEmpty(str) && ((z1.u() && "zh-CN".equalsIgnoreCase(i2.l())) || !z1.u())) {
            return str;
        }
        return str2;
    }

    public static final List E0(Object obj) {
        List singletonList = Collections.singletonList(obj);
        zc.d.c(singletonList, "singletonList(element)");
        return singletonList;
    }

    public static z6.f F(Context context) {
        s6 s6Var;
        if (C0 != null) {
            return C0;
        }
        synchronized (D0) {
            try {
                if (C0 == null) {
                    C0 = new s6(context);
                }
                s6Var = C0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return s6Var;
    }

    public static final List F0(Object... objArr) {
        if (objArr.length > 0) {
            List asList = Arrays.asList(objArr);
            zc.d.c(asList, "asList(this)");
            return asList;
        }
        return vc.d.f36006s;
    }

    public static void G(Context context, int i10, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ba.f, i10);
            jSONObject.put(ba.f22059h, str);
            jSONObject.put(ba.M, str2);
            w6.b(context).c(null, "syncAgProtocolStatus", jSONObject.toString(), true);
        } catch (JSONException unused) {
            n7.g("ApDnApi", "syncAgProcolAgreeStatus JSONException");
        }
    }

    public static String G0(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
            for (int i10 = 0; i10 < str.length(); i10++) {
                sb2.append(str.charAt(i10));
                if (str2.length() > i10) {
                    sb2.append(str2.charAt(i10));
                }
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }

    public static void H(Context context, ContentRecord contentRecord, Long l10, Integer num, Integer num2, String str, String str2) {
        ge geVar;
        if (!y1.h(str2)) {
            geVar = new ge();
            geVar.f31222c = str2;
        } else {
            geVar = null;
        }
        M(context, contentRecord, false, l10, num, num2, str, geVar);
    }

    public static long H0(int i10, int i11, w wVar) {
        boolean z10;
        boolean z11;
        wVar.E(i10);
        if (wVar.f27386c - wVar.f27385b < 5) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        int d10 = wVar.d();
        if ((8388608 & d10) != 0 || ((2096896 & d10) >> 8) != i11) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        if ((d10 & 32) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && wVar.t() >= 7 && wVar.f27386c - wVar.f27385b >= 7) {
            if ((wVar.t() & 16) == 16) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                wVar.b(new byte[6], 0, 6);
                return ((r1[3] & 255) << 1) | ((r1[0] & 255) << 25) | ((r1[1] & 255) << 17) | ((r1[2] & 255) << 9) | ((r1[4] & 255) >> 7);
            }
        }
        return com.anythink.expressad.exoplayer.b.f7291b;
    }

    public static void I(Context context, ContentRecord contentRecord, String str) {
        AdEventReport y10 = y(contentRecord);
        y10.k0(str);
        P(context, s.f22111e, y10);
    }

    public static y5.f I0(y5.f fVar, String[] strArr, Map map) {
        int i10 = 0;
        if (fVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (y5.f) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                y5.f fVar2 = new y5.f();
                int length = strArr.length;
                while (i10 < length) {
                    fVar2.a((y5.f) map.get(strArr[i10]));
                    i10++;
                }
                return fVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                fVar.a((y5.f) map.get(strArr[0]));
                return fVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    fVar.a((y5.f) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return fVar;
    }

    public static void J(Context context, ContentRecord contentRecord, String str, long j10, long j11, int i10, int i11) {
        if (contentRecord == null) {
            n7.g("event", "reportVideoPlayState, ad data is null");
            return;
        }
        AdEventReport y10 = y(contentRecord);
        y10.L(str);
        y10.P(Integer.valueOf(i10));
        y10.K(Long.valueOf(j10));
        y10.Q(Long.valueOf(j11));
        y10.V(Integer.valueOf(i11));
        P(context, s.Z, y10);
    }

    public static void J0(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof d7.g) {
            ((d7.g) background).j(f);
        }
    }

    public static void K(Context context, ContentRecord contentRecord, String str, Integer num, Integer num2) {
        AdEventReport y10 = y(contentRecord);
        y10.L(str);
        y10.Z(num);
        y10.d0(num2);
        P(context, s.S, y10);
    }

    public static void K0(View view) {
        Drawable background = view.getBackground();
        if (background instanceof d7.g) {
            L0(view, (d7.g) background);
        }
    }

    public static void L(Context context, ContentRecord contentRecord, boolean z10) {
        if (contentRecord == null) {
            n7.g("event", "reportSoundButtonClick, ad data is null");
            return;
        }
        AdEventReport y10 = y(contentRecord);
        y10.M(z10);
        P(context, s.f22114i, y10);
    }

    public static void L0(View view, d7.g gVar) {
        boolean z10;
        t6.a aVar = gVar.f27403s.f27412b;
        if (aVar != null && aVar.f35508a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            float f = gl.Code;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                f += c0.i.i((View) parent);
            }
            g.b bVar = gVar.f27403s;
            if (bVar.f27422m != f) {
                bVar.f27422m = f;
                gVar.n();
            }
        }
    }

    public static void M(Context context, ContentRecord contentRecord, boolean z10, Long l10, Integer num, Integer num2, String str, ge geVar) {
        if (contentRecord == null) {
            n7.g("event", "on ad show, ad data is null");
            return;
        }
        AdEventReport y10 = y(contentRecord);
        y10.F(z10);
        y10.D(l10);
        y10.C(num);
        if (num2 != null) {
            y10.J(num2);
        }
        if (geVar != null) {
            Integer num3 = geVar.f31220a;
            if (num3 != null) {
                y10.t0(num3);
                y10.w0(geVar.f31221b);
            }
            if (!y1.h(geVar.f31222c)) {
                y10.D0(geVar.f31222c);
            }
        }
        y10.p0(str);
        P(context, s.V, y10);
    }

    public static float M0() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public static void N(Context context, ContentRecord contentRecord, int[] iArr, vf vfVar) {
        boolean z10;
        Resources resources;
        Configuration configuration;
        AdEventReport y10 = y(contentRecord);
        y10.H(vfVar.f32011a);
        y10.O(vfVar.f32012b);
        y10.R(vfVar.f32013c);
        y10.J(vfVar.f32014d);
        String str = vfVar.f;
        if (!"com.huawei.openalliance.ad.ppskit.activity.PPSRewardActivity".equals(str) && !"com.huawei.openalliance.ad.ppskit.activity.InterstitialAdActivity".equals(str)) {
            y10.p0(str);
        } else {
            y10.p0("");
        }
        int i10 = 1;
        if (iArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && iArr.length > 1) {
            y10.m0(Integer.valueOf(iArr[0]));
            y10.o0(Integer.valueOf(iArr[1]));
            if (context != null && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null) {
                i10 = configuration.orientation;
            }
            y10.r0(Integer.valueOf(i10));
        }
        MaterialClickInfo materialClickInfo = vfVar.f32015e;
        if (materialClickInfo != null) {
            if (materialClickInfo.i() != null) {
                y10.f0(materialClickInfo.i());
            }
            if (materialClickInfo.j() != null) {
                y10.j0(materialClickInfo.j());
            }
            if (materialClickInfo.k() != null) {
                y10.u0(materialClickInfo.k());
            }
            if (materialClickInfo.h() != null) {
                y10.B(materialClickInfo.h());
            }
            if (materialClickInfo.a() != null) {
                y10.z0(materialClickInfo.a());
            }
            if (materialClickInfo.d() != null) {
                y10.C0(materialClickInfo.d());
            }
            if (materialClickInfo.f() != null) {
                y10.F0(materialClickInfo.f());
            }
        }
        P(context, s.B, y10);
    }

    public static void O(Context context, AppInfo appInfo, ContentRecord contentRecord) {
        String packageName;
        if (context != null && contentRecord != null) {
            Intent intent = new Intent();
            intent.setAction("huawei.intent.action.OPEN");
            if (appInfo == null) {
                packageName = "";
            } else {
                packageName = appInfo.getPackageName();
            }
            intent.putExtra("appPackageName", packageName);
            if (!d0.m(context)) {
                PersistentMessageCenter.getInstance().notifyMessage(context.getPackageName(), "appInnerNotification", intent);
            } else {
                context.sendBroadcast(intent);
            }
            Intent intent2 = new Intent("com.huawei.hms.pps.action.PPS_APP_OPEN");
            intent2.setPackage(contentRecord.h1());
            intent2.putExtra(com.huawei.hms.ads.ge.Code, y0.q(null, appInfo));
            if (!d0.m(context)) {
                PersistentMessageCenter.getInstance().notifyMessage(context.getPackageName(), "appInnerNotification", intent2);
                return;
            } else {
                context.sendBroadcast(intent2);
                return;
            }
        }
        n7.g("AppOpenNotification", "onAppOpen, param error");
    }

    public static void P(Context context, String str, AdEventReport adEventReport) {
        c7.l(context).k(str, y0.q(null, adEventReport), null, null);
    }

    public static void Q(Context context, String str, AdContentRsp adContentRsp) {
        try {
            if (context != null && adContentRsp != null) {
                List<Ad30> q10 = adContentRsp.q();
                if (!androidx.transition.n.M(q10)) {
                    for (Ad30 ad30 : q10) {
                        if (ad30 != null && ad30.u() != null) {
                            com.huawei.openalliance.ad.ppskit.handlers.l.d(context).i(str, ad30.a(), ad30.u());
                        }
                    }
                    return;
                }
                return;
            }
            n7.e("FlowControlManager", "para is empty");
        } catch (Throwable th) {
            n7.h("FlowControlManager", "save fc err, %s", th.getClass().getSimpleName());
        }
    }

    public static void R(Context context, String str, ContentRecord contentRecord, d7 d7Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("content_id", contentRecord.h());
            jSONObject.put(ba.f22049a, str);
            jSONObject.put("sdk_version", contentRecord.n1());
            jSONObject.put("package_name", contentRecord.h1());
            jSONObject.put("slotid", contentRecord.p2());
            c7.l(context).k("trafficReminderExceptionEvent", jSONObject.toString(), d7Var, String.class);
        } catch (JSONException unused) {
            Z(d7Var, "reportAnalysisEvent JSONException", "trafficReminderExceptionEvent");
        }
    }

    public static void S(Context context, String str, HashMap hashMap, ArrayList arrayList, SecureRandom secureRandom, String str2, FlowControl flowControl, int i10) {
        if (System.currentTimeMillis() > flowControl.b()) {
            p2.a(new ig(context, str, str2, i10), 5);
            hashMap.put(str2, 0);
            return;
        }
        int a10 = flowControl.a();
        if (a10 > 0 && a10 <= 100) {
            if (secureRandom.nextInt(101) <= a10) {
                n7.f("FlowControlManager", "discard slot %s", str2);
                com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(context);
                synchronized (d10.f22585a) {
                    String str3 = str2 + "fc_counts";
                    d10.G(str).edit().putInt(str3, d10.G(str).getInt(str3, 0) + 1).commit();
                }
                arrayList.remove(str2);
                return;
            }
            hashMap.put(str2, 1);
            return;
        }
        hashMap.put(str2, 0);
    }

    public static void T(Context context, String str, gi giVar, boolean z10) {
        if (n7.d()) {
            n7.b("MultiEventReporter", "reportAllEvents");
        }
        if (k1.g(context) && k1.e(context)) {
            dg dgVar = new dg(context, giVar);
            dgVar.i().execute(new b2(new yf(dgVar, str)));
            bg bgVar = new bg(context, giVar);
            bgVar.i().execute(new b2(new yf(bgVar, str)));
            eg egVar = new eg(context, giVar);
            egVar.i().execute(new b2(new yf(egVar, str)));
            wf wfVar = new wf(context, giVar);
            wfVar.i().execute(new b2(new yf(wfVar, str)));
            if (z10) {
                hg.f31255g.execute(new b2(new gg(new hg(context, giVar), str)));
            }
        }
    }

    public static void U(BaseObj baseObj) {
        if (baseObj != null) {
            baseObj.destroy();
        }
    }

    public static void V(View view, boolean z10) {
        int i10;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        if (view != null && view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
    }

    public static void W(LinearLayout linearLayout) {
        boolean z10;
        if (linearLayout != null && linearLayout.getChildCount() > 0) {
            int childCount = linearLayout.getChildCount();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 < childCount) {
                    View childAt = linearLayout.getChildAt(i11);
                    if (childAt != null && childAt.getVisibility() == 0) {
                        z10 = true;
                        break;
                    }
                    i11++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (!z10 || linearLayout.getVisibility() == 0) {
                if (!z10) {
                    i10 = 8;
                    if (linearLayout.getVisibility() == 8) {
                        return;
                    }
                } else {
                    return;
                }
            }
            linearLayout.setVisibility(i10);
        }
    }

    public static void X(AppLocalDownloadTask appLocalDownloadTask, JSONObject jSONObject) {
        String str;
        String q10 = y0.q(null, appLocalDownloadTask);
        n7.c("ApDnApi", "appdownload=%s", q10);
        jSONObject.put("content", q10);
        if (appLocalDownloadTask != null && appLocalDownloadTask.n() != null && appLocalDownloadTask.n().getUniqueId() != null) {
            str = appLocalDownloadTask.n().getUniqueId();
        } else {
            str = "";
        }
        jSONObject.put("unique_id", str);
    }

    public static void Y(Object obj, Field field, Annotation annotation) {
        boolean z10;
        Object valueOf;
        ma.h hVar = (ma.h) annotation;
        if (hVar.a()) {
            Class b10 = hVar.b();
            if (b10 != Void.class) {
                Field[] P2 = androidx.transition.n.P(b10);
                Object obj2 = field.get(obj);
                for (Field field2 : P2) {
                    Object obj3 = field2.get(null);
                    if ((obj3 != null && (obj3 == obj2 || obj3.equals(obj2))) || (obj3 == null && obj2 == null)) {
                        z10 = true;
                        break;
                    }
                }
                z10 = false;
                if (!z10) {
                    n7.h("ValueConstraintProcessor", "%s - field %s not in constraint values, set default value", obj.getClass().getSimpleName(), field.getName());
                    Class<?> type = field.getType();
                    if (String.class == type) {
                        valueOf = hVar.d();
                    } else if (Integer.TYPE == type || Integer.class == type) {
                        valueOf = Integer.valueOf(hVar.c());
                    } else {
                        return;
                    }
                    field.set(obj, valueOf);
                    return;
                }
                return;
            }
            int[] e10 = hVar.e();
            if (e10.length == 2) {
                int i10 = e10[0];
                int i11 = e10[1];
                if (i11 < i10) {
                    i10 = i11;
                    i11 = i10;
                }
                Object obj4 = field.get(obj);
                if (obj4 instanceof Number) {
                    int intValue = ((Number) obj4).intValue();
                    if (intValue < i10 || intValue > i11) {
                        n7.h("ValueConstraintProcessor", "%s - field %s not in constraint range, set default value", obj.getClass().getSimpleName(), field.getName());
                        field.set(obj, Integer.valueOf(hVar.f()));
                        return;
                    }
                    return;
                }
                return;
            }
            n7.h("ValueConstraintProcessor", "%s - field %s the length of range constraint must be 2", obj.getClass().getSimpleName(), field.getName());
        }
    }

    public static void Z(d7 d7Var, String str, String str2) {
        n7.g("ApDnApi", str);
        y6 y6Var = new y6(0);
        y6Var.f32210b = -1;
        y6Var.f32209a = str;
        d7Var.a(y6Var);
    }

    public static boolean a0(Context context) {
        long j10;
        long j11;
        Integer num;
        int i10;
        String packageName = context.getPackageName();
        com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(context);
        synchronized (d10.f22586b) {
            j10 = 0;
            j11 = d10.G(packageName).getLong("last_req_oaid_time", 0L);
        }
        Long valueOf = Long.valueOf(j11);
        synchronized (d10.f22585a) {
            Map<String, String> K2 = d10.K(packageName, false);
            if (!a0.a.e0(K2)) {
                num = y1.q(K2.get("reqQaidInterval"));
            } else {
                num = null;
            }
            if (num != null && num.intValue() >= 0) {
                i10 = num.intValue();
            }
            i10 = 30;
        }
        long j12 = i10 * 60000;
        if (valueOf != null) {
            j10 = valueOf.longValue();
        }
        if (System.currentTimeMillis() - j10 < j12) {
            StringBuilder k10 = com.ironsource.adapters.facebook.a.k("request QAID time limit, timeInter=", j12, ", lastTime=");
            k10.append(j10);
            k10.append(" callerPkg: ");
            k10.append(packageName);
            n7.b("NonHmsOaidAccessor", k10.toString());
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (d10.f22586b) {
            d10.G(packageName).edit().putLong("last_req_oaid_time", currentTimeMillis).commit();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair c0(android.content.Context r6, java.lang.String r7) {
        /*
            com.huawei.openalliance.ad.ppskit.utils.k0 r0 = a0.a.A()
            int r1 = ib.r.f29513a
            com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler r1 = com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler.b(r6)
            byte[] r2 = r1.f22478a
            monitor-enter(r2)
            r3 = 0
            java.util.Map r4 = r1.u(r3)     // Catch: java.lang.Throwable -> L53
            boolean r4 = a0.a.e0(r4)     // Catch: java.lang.Throwable -> L53
            if (r4 != 0) goto L47
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f22482e     // Catch: java.lang.Throwable -> L53
            java.lang.String r4 = "adsKitTrack"
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L53
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L53
            r4 = 1
            java.lang.Integer r1 = com.huawei.openalliance.ad.ppskit.utils.y1.q(r1)     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L2a
            goto L43
        L2a:
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L2f
            goto L44
        L2f:
            r1 = move-exception
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> L53
            java.lang.String r1 = r1.getSimpleName()     // Catch: java.lang.Throwable -> L53
            java.lang.String r5 = "toInteger ex:"
            java.lang.String r1 = r5.concat(r1)     // Catch: java.lang.Throwable -> L53
            java.lang.String r5 = "StringUtils"
            ka.n7.i(r5, r1)     // Catch: java.lang.Throwable -> L53
        L43:
            r1 = r4
        L44:
            if (r1 != 0) goto L47
            r3 = r4
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L53
            if (r3 == 0) goto L4e
            java.lang.String r7 = r6.getPackageName()
        L4e:
            android.util.Pair r6 = r0.b(r6, r7)
            return r6
        L53:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L53
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.n.c0(android.content.Context, java.lang.String):android.util.Pair");
    }

    public static boolean d0() {
        try {
            n7.f("SafetyDetectUtil", "%s class is available", SafetyDetectInnerAPI.class.getSimpleName());
            n7.f("SafetyDetectUtil", "%s class is available", UserDetectInnerAPI.class.getSimpleName());
            return true;
        } catch (Throwable th) {
            n7.h("SafetyDetectUtil", "isSafetyDetectSupported ex: %s", th.getClass().getSimpleName());
            return false;
        }
    }

    public static void e0(String str, String str2) {
        Log.e("SecurityComp10105308: ".concat(str), str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean f0(android.content.Context r9) {
        /*
            java.lang.String r0 = "mutiCardFactory"
            byte r1 = androidx.activity.n.y
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L10
            if (r1 == r3) goto L8a
            if (r1 != r2) goto L89
            goto L8a
        L10:
            r1 = 0
            java.lang.String r6 = "com.mediatek.common.featureoption.FeatureOption"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Error -> L25 java.lang.Exception -> L28
            java.lang.String r7 = "MTK_GEMINI_SUPPORT"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r7)     // Catch: java.lang.Error -> L25 java.lang.Exception -> L28
            r6.setAccessible(r4)     // Catch: java.lang.Error -> L25 java.lang.Exception -> L28
            boolean r6 = r6.getBoolean(r1)     // Catch: java.lang.Error -> L25 java.lang.Exception -> L28
            goto L2e
        L25:
            java.lang.String r6 = "MTK NoClassDefFoundError"
            goto L2a
        L28:
            java.lang.String r6 = "cannot find ext mtkapi"
        L2a:
            ka.n7.g(r0, r6)
            r6 = r5
        L2e:
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.String r8 = java.lang.String.valueOf(r6)
            r7[r5] = r8
            java.lang.String r8 = "isMtkGeminiSupport %s"
            ka.n7.f(r0, r8, r7)
            if (r6 == 0) goto L40
            androidx.activity.n.y = r2
            goto L8a
        L40:
            ka.n r9 = a0.a.L(r9)
            com.huawei.openalliance.ad.ppskit.utils.g1 r9 = r9.a()
            boolean r2 = r9 instanceof com.huawei.openalliance.ad.ppskit.utils.h1
            if (r2 == 0) goto L57
            com.huawei.openalliance.ad.ppskit.utils.h1 r9 = (com.huawei.openalliance.ad.ppskit.utils.h1) r9
            int r9 = com.huawei.openalliance.ad.ppskit.utils.h1.f22859a
            java.lang.String r9 = "com.hihonor.android.telephony.MSimTelephonyManager"
            java.lang.Object r9 = androidx.transition.n.t(r9)
            goto L5f
        L57:
            int r9 = com.huawei.openalliance.ad.ppskit.utils.i1.f22862a
            java.lang.String r9 = "android.telephony.MSimTelephonyManager"
            java.lang.Object r9 = androidx.transition.n.t(r9)
        L5f:
            if (r9 == 0) goto L74
            java.lang.String r2 = "isMultiSimEnabled"
            java.lang.Object r9 = androidx.transition.n.s(r9, r2, r1, r1, r4)
            if (r9 == 0) goto L74
            boolean r1 = r9 instanceof java.lang.Boolean
            if (r1 == 0) goto L74
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            goto L75
        L74:
            r9 = r5
        L75:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = java.lang.String.valueOf(r9)
            r1[r5] = r2
            java.lang.String r2 = "isHwGeminiSupport1 %s"
            ka.n7.f(r0, r2, r1)
            if (r9 == 0) goto L87
            androidx.activity.n.y = r3
            goto L8a
        L87:
            androidx.activity.n.y = r4
        L89:
            r4 = r5
        L8a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.n.f0(android.content.Context):boolean");
    }

    public static String g0(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static String h0(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        char c10;
        Object[] objArr = new Object[5];
        objArr[0] = A[i10];
        objArr[1] = Integer.valueOf(i11);
        objArr[2] = Integer.valueOf(i12);
        if (z10) {
            c10 = 'H';
        } else {
            c10 = 'L';
        }
        objArr[3] = Character.valueOf(c10);
        objArr[4] = Integer.valueOf(i13);
        StringBuilder sb2 = new StringBuilder(g0.l("hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    public static void i0(androidx.lifecycle.m mVar, StringBuilder sb2) {
        int lastIndexOf;
        if (mVar == null) {
            sb2.append("null");
            return;
        }
        String simpleName = mVar.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = mVar.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb2.append(simpleName);
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(mVar)));
    }

    public static void j0(String str, String str2) {
        Log.i("SecurityComp10105308: ".concat(str), str2);
    }

    public static fb.m k(Context context, AdContentData adContentData, Map map) {
        ArrayList<fb.m> arrayList;
        if (context != null && adContentData != null && map != null) {
            List<Integer> T0 = adContentData.T0();
            int i10 = 0;
            fb.m mVar = null;
            if (T0 != null && T0.size() > 0) {
                arrayList = new ArrayList(T0.size());
                Object obj = null;
                for (Integer num : T0) {
                    int intValue = num.intValue();
                    if (intValue != 300) {
                        switch (intValue) {
                            case 0:
                                obj = new fb.h();
                                break;
                            case 1:
                                obj = new fb.g(context, adContentData, false, map);
                                break;
                            case 2:
                                obj = new fb.f(context, adContentData, map);
                                break;
                            case 3:
                                obj = new fb.a(context, adContentData);
                                break;
                            case 4:
                                obj = new fb.g(context, adContentData, true, map);
                                break;
                            case 5:
                                obj = new fb.c(context, adContentData, 2);
                                break;
                            case 6:
                                obj = new fb.c(context, adContentData, i10);
                                break;
                            case 7:
                                obj = new fb.b(context, adContentData);
                                break;
                            case 8:
                                obj = new fb.j(context, adContentData);
                                break;
                            case 9:
                                obj = new fb.l(context, adContentData);
                                break;
                            default:
                                switch (intValue) {
                                    case 11:
                                        obj = new fb.e(context, adContentData);
                                        break;
                                    case 12:
                                        obj = new com.huawei.openalliance.ad.uriaction.a(context, adContentData);
                                        break;
                                    case 13:
                                        if (jo.Code(context)) {
                                            obj = new fb.k(context, adContentData);
                                            break;
                                        }
                                        break;
                                    case 14:
                                        obj = new fb.d(context, adContentData, map);
                                        break;
                                    default:
                                        ex.I("n", "unsupport action:" + num);
                                        obj = null;
                                        break;
                                }
                        }
                    } else {
                        obj = new fb.i(context, adContentData, map);
                    }
                    if (obj != null) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null && arrayList.size() > 0) {
                for (fb.m mVar2 : arrayList) {
                    if (mVar != null) {
                        mVar.f28349d = mVar2;
                    }
                    mVar = mVar2;
                }
                return (fb.m) arrayList.get(0);
            }
            return new fb.h();
        }
        return new fb.h();
    }

    public static boolean k0() {
        try {
            Class.forName("com.hihonor.common.grs.HihonorGrsApi");
            return true;
        } catch (Throwable unused) {
            n7.g("GrsUtil", "check honor grs available error");
            return false;
        }
    }

    public static Double l(Double d10) {
        if (d10 != null && !Double.isInfinite(d10.doubleValue()) && !Double.isNaN(d10.doubleValue())) {
            return Double.valueOf(new BigDecimal(d10.doubleValue()).setScale(4, 4).doubleValue());
        }
        return null;
    }

    public static boolean l0(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            return false;
        }
        return true;
    }

    public static void m0(String str, boolean z10) {
        if (z10) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static void n(LinearLayout linearLayout) {
        boolean z10;
        if (linearLayout != null && linearLayout.getChildCount() > 0) {
            int childCount = linearLayout.getChildCount();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 < childCount) {
                    View childAt = linearLayout.getChildAt(i11);
                    if (childAt != null && childAt.getVisibility() == 0) {
                        z10 = true;
                        break;
                    }
                    i11++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (!z10 || linearLayout.getVisibility() == 0) {
                if (!z10) {
                    i10 = 8;
                    if (linearLayout.getVisibility() == 8) {
                        return;
                    }
                } else {
                    return;
                }
            }
            linearLayout.setVisibility(i10);
        }
    }

    public static void n0(Object obj) {
        if (obj != null) {
        } else {
            throw new NullPointerException("Argument must not be null");
        }
    }

    public static boolean o() {
        if (Math.abs(System.currentTimeMillis() - F0) >= 500 && Math.abs(System.currentTimeMillis() - G0) >= 1500) {
            F0 = System.currentTimeMillis();
            return false;
        }
        return true;
    }

    public static void o0(c6.j jVar) {
        if (jVar != null) {
            try {
                jVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean p(View view, int i10, int i11) {
        float f;
        boolean z10 = false;
        if (view == null || view.getVisibility() == i10) {
            return false;
        }
        view.setVisibility(i10);
        if (i10 == 0) {
            z10 = true;
        }
        float f10 = gl.Code;
        if (z10) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        if (z10) {
            f10 = 1.0f;
        }
        Animation animation = view.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f10);
        alphaAnimation.setDuration(300);
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        if (i11 > 0) {
            alphaAnimation.setStartOffset(i11);
        }
        view.startAnimation(alphaAnimation);
        return true;
    }

    public static n p0(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return new d7.i();
            }
            return new d7.d();
        }
        return new d7.i();
    }

    public static boolean q(View view, boolean z10) {
        int i10;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        if (view == null || view.getVisibility() == i10) {
            return false;
        }
        view.setVisibility(i10);
        return true;
    }

    public static void q0(Context context, ContentRecord contentRecord) {
        J(context, contentRecord, ah.B, -111111L, -111111L, -111111, -111111);
    }

    public static boolean r(List list) {
        if (androidx.transition.n.h(list)) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FeedbackInfo feedbackInfo = (FeedbackInfo) it.next();
            if (feedbackInfo != null && feedbackInfo.Z()) {
                return true;
            }
        }
        return false;
    }

    public static int r0(Context context, float f) {
        if (f <= gl.Code) {
            return 0;
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static void s0() {
        int i10 = G;
        if (i10 > 0) {
            G = i10 - 1;
        }
    }

    public static float t(float f) {
        if (f <= 0.04045f) {
            return f / 12.92f;
        }
        return (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static void t0(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
        } else {
            throw new IllegalArgumentException("Bundle must contain ".concat(str));
        }
    }

    public static float u(float f) {
        if (f <= 0.0031308f) {
            return f * 12.92f;
        }
        return (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int u0(float f, int i10, int i11) {
        if (i10 == i11) {
            return i10;
        }
        float f10 = ((i10 >> 24) & p.f9095b) / 255.0f;
        float f11 = ((i10 >> 16) & p.f9095b) / 255.0f;
        float f12 = ((i10 >> 8) & p.f9095b) / 255.0f;
        float f13 = ((i11 >> 24) & p.f9095b) / 255.0f;
        float f14 = ((i11 >> 16) & p.f9095b) / 255.0f;
        float f15 = ((i11 >> 8) & p.f9095b) / 255.0f;
        float t10 = t(f11);
        float t11 = t(f12);
        float t12 = t((i10 & p.f9095b) / 255.0f);
        float t13 = t(f14);
        float t14 = t(f15);
        float t15 = t((i11 & p.f9095b) / 255.0f);
        float d10 = a3.k.d(f13, f10, f, f10);
        float d11 = a3.k.d(t13, t10, f, t10);
        float d12 = a3.k.d(t14, t11, f, t11);
        float d13 = a3.k.d(t15, t12, f, t12);
        float u2 = u(d11) * 255.0f;
        float u10 = u(d12) * 255.0f;
        return Math.round(u(d13) * 255.0f) | (Math.round(u2) << 16) | (Math.round(d10 * 255.0f) << 24) | (Math.round(u10) << 8);
    }

    public static int v(int i10) {
        if (i10 != 1) {
            if (i10 != 3) {
                if (i10 != 12) {
                    if (i10 != 60) {
                        if (i10 != 7) {
                            if (i10 != 8) {
                                return 5;
                            }
                            return 999;
                        }
                        return 3999;
                    }
                    return 4999;
                }
                return 1999;
            }
            return 2999;
        }
        return 6999;
    }

    public static String v0(int i10) {
        if (i10 > 99) {
            return String.valueOf(i10 / 10);
        }
        if (i10 <= 9) {
            return a3.l.i("0", i10);
        }
        return String.valueOf(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0087 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap w(android.content.Context r7, android.graphics.Bitmap r8) {
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
            U(r3)
            U(r1)
            U(r2)
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
            ka.n7.g(r5, r0)     // Catch: java.lang.Throwable -> L8b
            U(r3)
            U(r7)
            U(r2)
            if (r1 == 0) goto L8a
            r1.destroy()
        L8a:
            return r8
        L8b:
            r8 = move-exception
            U(r3)
            U(r7)
            U(r2)
            if (r1 == 0) goto L9a
            r1.destroy()
        L9a:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.n.w(android.content.Context, android.graphics.Bitmap):android.graphics.Bitmap");
    }

    public static String w0(int i10) {
        if (i10 < 10) {
            return a3.l.i("0", i10);
        }
        return String.valueOf(i10);
    }

    public static BitmapDrawable x(Context context, Drawable drawable) {
        String concat;
        long currentTimeMillis;
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2 = null;
        try {
            currentTimeMillis = System.currentTimeMillis();
            bitmapDrawable = new BitmapDrawable(context.getResources(), w(context, v0.b(drawable)));
        } catch (OutOfMemoryError unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            n7.c("BlurUtil", "blurDrawable: duration %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            return bitmapDrawable;
        } catch (OutOfMemoryError unused2) {
            bitmapDrawable2 = bitmapDrawable;
            concat = "OOM blur image";
            BitmapDrawable bitmapDrawable3 = bitmapDrawable2;
            n7.g("BlurUtil", concat);
            return bitmapDrawable3;
        } catch (Throwable th2) {
            th = th2;
            bitmapDrawable2 = bitmapDrawable;
            concat = "blur drawable exception ".concat(th.getClass().getSimpleName());
            BitmapDrawable bitmapDrawable32 = bitmapDrawable2;
            n7.g("BlurUtil", concat);
            return bitmapDrawable32;
        }
    }

    public static void x0(Context context, ContentRecord contentRecord) {
        J(context, contentRecord, ah.S, -111111L, -111111L, -111111, -111111);
    }

    public static AdEventReport y(ContentRecord contentRecord) {
        AdEventReport adEventReport = new AdEventReport();
        if (contentRecord != null) {
            adEventReport.y(contentRecord.z0());
            adEventReport.E(contentRecord.h());
            adEventReport.W(contentRecord.j2());
            adEventReport.a0(contentRecord.h1());
            adEventReport.e0(contentRecord.n1());
            adEventReport.g0(contentRecord.o1());
            adEventReport.z(contentRecord.W0());
            adEventReport.x0(contentRecord.Z0());
            adEventReport.A0(contentRecord.p2());
            adEventReport.c0(contentRecord.a1());
            adEventReport.N();
            if (!TextUtils.isEmpty(contentRecord.f1())) {
                if (y1.f23070a.matcher(contentRecord.f1()).matches()) {
                    adEventReport.Y(Integer.parseInt(contentRecord.f1()));
                }
            }
        }
        return adEventReport;
    }

    public static AdContentRsp z(String str, String str2, Context context, AdContentRsp adContentRsp, int i10) {
        ArrayList arrayList;
        boolean z10;
        tf ofVar;
        HashMap hashMap = d0.f22830a;
        long currentTimeMillis = System.currentTimeMillis();
        E0 = new HashMap();
        if (adContentRsp == null) {
            return null;
        }
        List<Ad30> q10 = adContentRsp.q();
        if (androidx.transition.n.M(q10)) {
            return adContentRsp;
        }
        Iterator<Ad30> it = q10.iterator();
        while (true) {
            int i11 = 1;
            if (!it.hasNext()) {
                break;
            }
            Ad30 next = it.next();
            List<Content> k10 = next.k();
            ArrayList arrayList2 = new ArrayList();
            List<ImpEX> p10 = next.p();
            if (!androidx.transition.n.M(k10)) {
                String a10 = next.a();
                Content content = k10.get(0);
                ConcurrentHashMap<String, String> concurrentHashMap = com.huawei.openalliance.ad.ppskit.utils.f.f22842a;
                if (a10 != null && content != null && content.F0() != null) {
                    n7.c("CtrInfoCacheManager", "save slot:%s ctrSwitch:%s", a10, content.F0());
                    com.huawei.openalliance.ad.ppskit.utils.f.f22842a.put(a10, content.F0());
                }
                for (Content content2 : k10) {
                    if (content2 != null) {
                        content2.g0(adContentRsp.C(), i10);
                        List<ImpEX> K2 = content2.K();
                        ArrayList arrayList3 = new ArrayList();
                        if (!androidx.transition.n.M(K2)) {
                            arrayList3.addAll(K2);
                        }
                        if (!androidx.transition.n.M(p10)) {
                            arrayList3.addAll(p10);
                        }
                        if (androidx.transition.n.M(arrayList3)) {
                            arrayList3 = null;
                        }
                        content2.s0(arrayList3);
                        List<Integer> H02 = content2.H0();
                        if (H02 != null && context != null) {
                            arrayList = new ArrayList();
                            for (Integer num : H02) {
                                if (num != null) {
                                    int intValue = num.intValue();
                                    if (intValue != i11) {
                                        if (intValue != 2) {
                                            if (intValue != 3) {
                                                if (intValue != 4) {
                                                    if (intValue == 99) {
                                                        ofVar = new sf(context);
                                                    }
                                                    i11 = 1;
                                                } else {
                                                    ofVar = new qf(context);
                                                }
                                            } else {
                                                ofVar = new uf(context);
                                            }
                                        } else {
                                            ofVar = new pf(context);
                                        }
                                    } else {
                                        ofVar = new of(context);
                                    }
                                    arrayList.add(ofVar);
                                    i11 = 1;
                                }
                            }
                        } else {
                            if (H02 == null) {
                                n7.g("AdFilterManager", "createFilters filterList is null");
                            }
                            if (context == null) {
                                n7.g("AdFilterManager", "createFilters context is null");
                            }
                            arrayList = null;
                        }
                        String a11 = next.a();
                        int Y2 = adContentRsp.Y();
                        if (arrayList == null) {
                            z10 = false;
                        } else {
                            Iterator it2 = arrayList.iterator();
                            z10 = false;
                            while (it2.hasNext()) {
                                z10 |= ((tf) it2.next()).a(str, str2, a11, i10, Y2, content2);
                            }
                        }
                        if (!z10) {
                            arrayList2.add(content2);
                        } else {
                            String a12 = next.a();
                            int Y3 = adContentRsp.Y();
                            if (arrayList != null) {
                                Iterator it3 = arrayList.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        tf tfVar = (tf) it3.next();
                                        if (tfVar.a(str, str2, a12, i10, Y3, content2)) {
                                            String d10 = y1.d(Integer.valueOf(tfVar.b()));
                                            if (!y1.h(d10)) {
                                                if (E0.containsKey(d10)) {
                                                    E0.put(d10, Integer.valueOf(((Integer) E0.get(d10)).intValue() + 1));
                                                } else {
                                                    E0.put(d10, 1);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i11 = 1;
                }
            }
            next.b(arrayList2);
        }
        if (!a0.a.e0(E0)) {
            adContentRsp.o(E0);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        adContentRsp.l(currentTimeMillis2);
        if (n7.d()) {
            n7.c("AdFilterManager", "filter ad contents, duration: %s ms", Long.valueOf(currentTimeMillis2));
        }
        return adContentRsp;
    }

    public static final String z0(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @Override // com.huawei.openalliance.ad.ppskit.utils.k0
    public Pair b(Context context, String str) {
        Pair<String, Boolean> pair;
        String string;
        if (context == null) {
            return null;
        }
        if (!com.huawei.openalliance.ad.ppskit.handlers.l.d(context).k()) {
            n7.e("NonHmsOaidAccessor", "not enable user info, skip oaid.");
            return null;
        }
        q1 m10 = q1.m(context);
        n7.e("NonHmsOaidAccessor", "query oaid");
        if (Cif.c(context)) {
            Uri uri = si.f31854a;
            try {
                string = Settings.Global.getString(context.getContentResolver(), "pps_oaid_c");
            } catch (Throwable th) {
                e0.i.p(th, "exception happen: ", "OaidSettingsForAppUtil");
            }
            if (TextUtils.isEmpty(string)) {
                ContentResolver contentResolver = context.getContentResolver();
                String string2 = Settings.Global.getString(contentResolver, "pps_oaid");
                String string3 = Settings.Global.getString(contentResolver, "pps_track_limit");
                if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                    RSAPublicKey a10 = si.a(context);
                    String Q2 = androidx.transition.n.Q(string2 + string3);
                    boolean a11 = ji.a(context, Q2, Settings.Global.getString(contentResolver, "pps_oaid_digest_pss"), a10);
                    n7.c("OaidSettingsForAppUtil", "verifySignPss result: %s", Boolean.valueOf(a11));
                    if (!a11) {
                        si.f31858e = null;
                        a11 = ji.c(Q2, Settings.Global.getString(contentResolver, "pps_oaid_digest"), si.b(context));
                        n7.c("OaidSettingsForAppUtil", "verifySign result: %s", Boolean.valueOf(a11));
                    }
                    if (a11) {
                        pair = new Pair<>(string2, Boolean.valueOf(Boolean.valueOf(string3).booleanValue()));
                    } else {
                        si.f31857d = null;
                    }
                }
                pair = null;
            } else {
                n7.b("OaidSettingsForAppUtil", "read and decrypt oaid.");
                pair = ri.a(context, string);
            }
            if (pair != null && !a0(context)) {
                n7.e("NonHmsOaidAccessor", "read from setting");
                p2.d(new mi(context.getApplicationContext(), Cif.a(context).d() ? m10 : null));
            }
            if (pair != null) {
                return pair;
            }
        } else {
            q1 m11 = q1.m(context);
            n7.e("NonHmsOaidAccessor", "thirdDevice, get oaid.");
            Pair<String, Boolean> S2 = m11.S();
            if (!a0(context)) {
                String E2 = a0.a.E(context);
                if (TextUtils.isEmpty(E2)) {
                    S2 = null;
                } else {
                    n7.e("NonHmsOaidAccessor", "oaid acquired.");
                    Boolean bool = Boolean.FALSE;
                    m11.q(E2, bool);
                    S2 = new Pair<>(E2, bool);
                }
            }
            if (S2 != null) {
                return S2;
            }
        }
        if (!Cif.a(context).d()) {
            return null;
        }
        String Q3 = androidx.transition.n.Q(com.huawei.openalliance.ad.ppskit.utils.m.C() + com.huawei.openalliance.ad.ppskit.utils.m.q(context));
        if (TextUtils.isEmpty(m10.T())) {
            m10.N(Q3);
        }
        if (!TextUtils.isEmpty(Q3) && !Q3.equalsIgnoreCase(m10.T())) {
            p2.a(new ni(context.getApplicationContext(), m10), 2);
            return null;
        }
        if (Cif.c(context) && !com.huawei.openalliance.ad.ppskit.handlers.l.d(context).j(2, context.getPackageName(), "dirOaid")) {
            n7.e("NonHmsOaidAccessor", "start to request oaid");
            com.huawei.openalliance.ad.ppskit.handlers.l.d(context).S(context.getPackageName(), "dirOaid");
            p2.d(new mi(context.getApplicationContext(), m10));
        }
        n7.e("NonHmsOaidAccessor", "read from cache");
        return m10.S();
    }

    public boolean b0(Context context, String str) {
        boolean equals;
        String str2;
        boolean c10;
        String str3;
        String str4;
        if (TextUtils.equals(str, context.getPackageName())) {
            equals = true;
        } else {
            equals = "com.huawei.wisdomscreen".equals(str);
        }
        if (equals) {
            return true;
        }
        ConfigSpHandler b10 = ConfigSpHandler.b(context);
        synchronized (b10.f22478a) {
            Map<String, String> u2 = b10.u(false);
            if (!a0.a.e0(u2)) {
                str2 = u2.get("appTrackTvWhitePkgs");
            } else {
                str2 = "";
            }
        }
        if (TextUtils.isEmpty(str2)) {
            str3 = "AppTrackWhitePkgListChecker";
            str4 = "server white list is null";
        } else {
            Map map = (Map) y0.o(null, str2, Map.class, List.class);
            if (a0.a.e0(map)) {
                str3 = "AppTrackWhitePkgListChecker";
                str4 = "server white list toObjectException";
            } else {
                List list = (List) map.get(str);
                if (androidx.transition.n.M(list)) {
                    str3 = "AppTrackWhitePkgListChecker";
                    str4 = "server white list is empty";
                } else {
                    c10 = oa.j.c(str, o2.j(context, str), list);
                    n7.c("AppTrackWhitePkgListChecker", "check %s, result:%s", str, Boolean.valueOf(c10));
                    return c10;
                }
            }
        }
        n7.b(str3, str4);
        c10 = false;
        n7.c("AppTrackWhitePkgListChecker", "check %s, result:%s", str, Boolean.valueOf(c10));
        return c10;
    }

    @Override // com.bumptech.glide.manager.h
    public void d(com.bumptech.glide.manager.i iVar) {
        iVar.onStart();
    }

    @Override // y2.d
    public boolean g(Object obj, File file, y2.g gVar) {
        try {
            t3.a.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e10);
            }
            return false;
        }
    }

    @Override // c3.a
    public File j(y2.e eVar) {
        return null;
    }

    @Override // md.a
    public id.a newInstantiatorOf(Class cls) {
        boolean z10;
        if (!md.b.b("Java HotSpot") && !md.b.b("OpenJDK")) {
            if (md.b.b("Dalvik")) {
                if (md.b.f33034c) {
                    return new ld.a(cls);
                }
                int i10 = md.b.f33033b;
                if (i10 <= 10) {
                    return new a4.l(cls);
                }
                if (i10 <= 17) {
                    return new m3.b(cls);
                }
                return new t2.c(cls);
            }
            if (md.b.b("BEA")) {
                return new jd.a(cls, 1);
            }
            if (md.b.b("GNU libgcj")) {
                return new kd.a(cls);
            }
            if (md.b.b("PERC")) {
                return new j1.a(cls);
            }
            return new ld.a(cls);
        }
        if (md.b.f33035d != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (Serializable.class.isAssignableFrom(cls)) {
                return new jd.b(cls);
            }
            return new jd.a(cls, 0);
        }
        return new jd.a(cls, 1);
    }

    @Override // p4.j
    public p4.w s(int i10, int i11) {
        return new p4.g();
    }

    public void y0(float f, float f10, d7.m mVar) {
        throw null;
    }

    public /* synthetic */ n(int i10) {
    }

    @Override // ka.hb
    public void b() {
    }

    @Override // com.bumptech.glide.manager.g
    public void a() {
    }

    @Override // p4.j
    public void m() {
    }

    @Override // com.bumptech.glide.manager.h
    public void e(com.bumptech.glide.manager.i iVar) {
    }

    @Override // ka.hb
    public void f(ob obVar) {
    }

    @Override // p4.j
    public void i(u uVar) {
    }

    @Override // c3.a
    public void c(y2.e eVar, a3.g gVar) {
    }
}
