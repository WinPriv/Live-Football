package q;

import android.R;
import com.anythink.expressad.exoplayer.k.p;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.sdk.InitializationListener;
import s7.v;

/* compiled from: ContainerHelpers.java */
/* loaded from: classes.dex */
public final class e implements s7.e, InitializationListener, xc.d {

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f34515s = new int[0];

    /* renamed from: t, reason: collision with root package name */
    public static final long[] f34516t = new long[0];

    /* renamed from: u, reason: collision with root package name */
    public static final Object[] f34517u = new Object[0];

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ e f34518v = new e();

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f34519w = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -1, -1, -1, -1, -1, -1, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    /* renamed from: x, reason: collision with root package name */
    public static final boolean[] f34520x = new boolean[3];
    public static final int[] y = {R.attr.orientation, R.attr.id, R.attr.visibility, R.attr.layout_width, R.attr.layout_height, R.attr.layout_marginLeft, R.attr.layout_marginTop, R.attr.layout_marginRight, R.attr.layout_marginBottom, R.attr.maxWidth, R.attr.maxHeight, R.attr.minWidth, R.attr.minHeight, R.attr.alpha, R.attr.transformPivotX, R.attr.transformPivotY, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.layout_marginStart, R.attr.layout_marginEnd, R.attr.translationZ, R.attr.elevation, com.hamkho.livefoot.R.attr.animateCircleAngleTo, com.hamkho.livefoot.R.attr.animateRelativeTo, com.hamkho.livefoot.R.attr.barrierAllowsGoneWidgets, com.hamkho.livefoot.R.attr.barrierDirection, com.hamkho.livefoot.R.attr.barrierMargin, com.hamkho.livefoot.R.attr.chainUseRtl, com.hamkho.livefoot.R.attr.constraint_referenced_ids, com.hamkho.livefoot.R.attr.constraint_referenced_tags, com.hamkho.livefoot.R.attr.drawPath, com.hamkho.livefoot.R.attr.flow_firstHorizontalBias, com.hamkho.livefoot.R.attr.flow_firstHorizontalStyle, com.hamkho.livefoot.R.attr.flow_firstVerticalBias, com.hamkho.livefoot.R.attr.flow_firstVerticalStyle, com.hamkho.livefoot.R.attr.flow_horizontalAlign, com.hamkho.livefoot.R.attr.flow_horizontalBias, com.hamkho.livefoot.R.attr.flow_horizontalGap, com.hamkho.livefoot.R.attr.flow_horizontalStyle, com.hamkho.livefoot.R.attr.flow_lastHorizontalBias, com.hamkho.livefoot.R.attr.flow_lastHorizontalStyle, com.hamkho.livefoot.R.attr.flow_lastVerticalBias, com.hamkho.livefoot.R.attr.flow_lastVerticalStyle, com.hamkho.livefoot.R.attr.flow_maxElementsWrap, com.hamkho.livefoot.R.attr.flow_verticalAlign, com.hamkho.livefoot.R.attr.flow_verticalBias, com.hamkho.livefoot.R.attr.flow_verticalGap, com.hamkho.livefoot.R.attr.flow_verticalStyle, com.hamkho.livefoot.R.attr.flow_wrapMode, com.hamkho.livefoot.R.attr.guidelineUseRtl, com.hamkho.livefoot.R.attr.layout_constrainedHeight, com.hamkho.livefoot.R.attr.layout_constrainedWidth, com.hamkho.livefoot.R.attr.layout_constraintBaseline_creator, com.hamkho.livefoot.R.attr.layout_constraintBaseline_toBaselineOf, com.hamkho.livefoot.R.attr.layout_constraintBaseline_toBottomOf, com.hamkho.livefoot.R.attr.layout_constraintBaseline_toTopOf, com.hamkho.livefoot.R.attr.layout_constraintBottom_creator, com.hamkho.livefoot.R.attr.layout_constraintBottom_toBottomOf, com.hamkho.livefoot.R.attr.layout_constraintBottom_toTopOf, com.hamkho.livefoot.R.attr.layout_constraintCircle, com.hamkho.livefoot.R.attr.layout_constraintCircleAngle, com.hamkho.livefoot.R.attr.layout_constraintCircleRadius, com.hamkho.livefoot.R.attr.layout_constraintDimensionRatio, com.hamkho.livefoot.R.attr.layout_constraintEnd_toEndOf, com.hamkho.livefoot.R.attr.layout_constraintEnd_toStartOf, com.hamkho.livefoot.R.attr.layout_constraintGuide_begin, com.hamkho.livefoot.R.attr.layout_constraintGuide_end, com.hamkho.livefoot.R.attr.layout_constraintGuide_percent, com.hamkho.livefoot.R.attr.layout_constraintHeight, com.hamkho.livefoot.R.attr.layout_constraintHeight_default, com.hamkho.livefoot.R.attr.layout_constraintHeight_max, com.hamkho.livefoot.R.attr.layout_constraintHeight_min, com.hamkho.livefoot.R.attr.layout_constraintHeight_percent, com.hamkho.livefoot.R.attr.layout_constraintHorizontal_bias, com.hamkho.livefoot.R.attr.layout_constraintHorizontal_chainStyle, com.hamkho.livefoot.R.attr.layout_constraintHorizontal_weight, com.hamkho.livefoot.R.attr.layout_constraintLeft_creator, com.hamkho.livefoot.R.attr.layout_constraintLeft_toLeftOf, com.hamkho.livefoot.R.attr.layout_constraintLeft_toRightOf, com.hamkho.livefoot.R.attr.layout_constraintRight_creator, com.hamkho.livefoot.R.attr.layout_constraintRight_toLeftOf, com.hamkho.livefoot.R.attr.layout_constraintRight_toRightOf, com.hamkho.livefoot.R.attr.layout_constraintStart_toEndOf, com.hamkho.livefoot.R.attr.layout_constraintStart_toStartOf, com.hamkho.livefoot.R.attr.layout_constraintTag, com.hamkho.livefoot.R.attr.layout_constraintTop_creator, com.hamkho.livefoot.R.attr.layout_constraintTop_toBottomOf, com.hamkho.livefoot.R.attr.layout_constraintTop_toTopOf, com.hamkho.livefoot.R.attr.layout_constraintVertical_bias, com.hamkho.livefoot.R.attr.layout_constraintVertical_chainStyle, com.hamkho.livefoot.R.attr.layout_constraintVertical_weight, com.hamkho.livefoot.R.attr.layout_constraintWidth, com.hamkho.livefoot.R.attr.layout_constraintWidth_default, com.hamkho.livefoot.R.attr.layout_constraintWidth_max, com.hamkho.livefoot.R.attr.layout_constraintWidth_min, com.hamkho.livefoot.R.attr.layout_constraintWidth_percent, com.hamkho.livefoot.R.attr.layout_editor_absoluteX, com.hamkho.livefoot.R.attr.layout_editor_absoluteY, com.hamkho.livefoot.R.attr.layout_goneMarginBaseline, com.hamkho.livefoot.R.attr.layout_goneMarginBottom, com.hamkho.livefoot.R.attr.layout_goneMarginEnd, com.hamkho.livefoot.R.attr.layout_goneMarginLeft, com.hamkho.livefoot.R.attr.layout_goneMarginRight, com.hamkho.livefoot.R.attr.layout_goneMarginStart, com.hamkho.livefoot.R.attr.layout_goneMarginTop, com.hamkho.livefoot.R.attr.layout_marginBaseline, com.hamkho.livefoot.R.attr.layout_wrapBehaviorInParent, com.hamkho.livefoot.R.attr.motionProgress, com.hamkho.livefoot.R.attr.motionStagger, com.hamkho.livefoot.R.attr.pathMotionArc, com.hamkho.livefoot.R.attr.pivotAnchor, com.hamkho.livefoot.R.attr.polarRelativeTo, com.hamkho.livefoot.R.attr.quantizeMotionInterpolator, com.hamkho.livefoot.R.attr.quantizeMotionPhase, com.hamkho.livefoot.R.attr.quantizeMotionSteps, com.hamkho.livefoot.R.attr.transformPivotTarget, com.hamkho.livefoot.R.attr.transitionEasing, com.hamkho.livefoot.R.attr.transitionPathRotate, com.hamkho.livefoot.R.attr.visibilityMode};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f34521z = {R.attr.orientation, R.attr.padding, R.attr.paddingLeft, R.attr.paddingTop, R.attr.paddingRight, R.attr.paddingBottom, R.attr.visibility, R.attr.layout_width, R.attr.layout_height, R.attr.layout_margin, R.attr.layout_marginLeft, R.attr.layout_marginTop, R.attr.layout_marginRight, R.attr.layout_marginBottom, R.attr.maxWidth, R.attr.maxHeight, R.attr.minWidth, R.attr.minHeight, R.attr.paddingStart, R.attr.paddingEnd, R.attr.layout_marginStart, R.attr.layout_marginEnd, R.attr.elevation, R.attr.layout_marginHorizontal, R.attr.layout_marginVertical, com.hamkho.livefoot.R.attr.barrierAllowsGoneWidgets, com.hamkho.livefoot.R.attr.barrierDirection, com.hamkho.livefoot.R.attr.barrierMargin, com.hamkho.livefoot.R.attr.chainUseRtl, com.hamkho.livefoot.R.attr.circularflow_angles, com.hamkho.livefoot.R.attr.circularflow_defaultAngle, com.hamkho.livefoot.R.attr.circularflow_defaultRadius, com.hamkho.livefoot.R.attr.circularflow_radiusInDP, com.hamkho.livefoot.R.attr.circularflow_viewCenter, com.hamkho.livefoot.R.attr.constraintSet, com.hamkho.livefoot.R.attr.constraint_referenced_ids, com.hamkho.livefoot.R.attr.constraint_referenced_tags, com.hamkho.livefoot.R.attr.flow_firstHorizontalBias, com.hamkho.livefoot.R.attr.flow_firstHorizontalStyle, com.hamkho.livefoot.R.attr.flow_firstVerticalBias, com.hamkho.livefoot.R.attr.flow_firstVerticalStyle, com.hamkho.livefoot.R.attr.flow_horizontalAlign, com.hamkho.livefoot.R.attr.flow_horizontalBias, com.hamkho.livefoot.R.attr.flow_horizontalGap, com.hamkho.livefoot.R.attr.flow_horizontalStyle, com.hamkho.livefoot.R.attr.flow_lastHorizontalBias, com.hamkho.livefoot.R.attr.flow_lastHorizontalStyle, com.hamkho.livefoot.R.attr.flow_lastVerticalBias, com.hamkho.livefoot.R.attr.flow_lastVerticalStyle, com.hamkho.livefoot.R.attr.flow_maxElementsWrap, com.hamkho.livefoot.R.attr.flow_verticalAlign, com.hamkho.livefoot.R.attr.flow_verticalBias, com.hamkho.livefoot.R.attr.flow_verticalGap, com.hamkho.livefoot.R.attr.flow_verticalStyle, com.hamkho.livefoot.R.attr.flow_wrapMode, com.hamkho.livefoot.R.attr.guidelineUseRtl, com.hamkho.livefoot.R.attr.layoutDescription, com.hamkho.livefoot.R.attr.layout_constrainedHeight, com.hamkho.livefoot.R.attr.layout_constrainedWidth, com.hamkho.livefoot.R.attr.layout_constraintBaseline_creator, com.hamkho.livefoot.R.attr.layout_constraintBaseline_toBaselineOf, com.hamkho.livefoot.R.attr.layout_constraintBaseline_toBottomOf, com.hamkho.livefoot.R.attr.layout_constraintBaseline_toTopOf, com.hamkho.livefoot.R.attr.layout_constraintBottom_creator, com.hamkho.livefoot.R.attr.layout_constraintBottom_toBottomOf, com.hamkho.livefoot.R.attr.layout_constraintBottom_toTopOf, com.hamkho.livefoot.R.attr.layout_constraintCircle, com.hamkho.livefoot.R.attr.layout_constraintCircleAngle, com.hamkho.livefoot.R.attr.layout_constraintCircleRadius, com.hamkho.livefoot.R.attr.layout_constraintDimensionRatio, com.hamkho.livefoot.R.attr.layout_constraintEnd_toEndOf, com.hamkho.livefoot.R.attr.layout_constraintEnd_toStartOf, com.hamkho.livefoot.R.attr.layout_constraintGuide_begin, com.hamkho.livefoot.R.attr.layout_constraintGuide_end, com.hamkho.livefoot.R.attr.layout_constraintGuide_percent, com.hamkho.livefoot.R.attr.layout_constraintHeight, com.hamkho.livefoot.R.attr.layout_constraintHeight_default, com.hamkho.livefoot.R.attr.layout_constraintHeight_max, com.hamkho.livefoot.R.attr.layout_constraintHeight_min, com.hamkho.livefoot.R.attr.layout_constraintHeight_percent, com.hamkho.livefoot.R.attr.layout_constraintHorizontal_bias, com.hamkho.livefoot.R.attr.layout_constraintHorizontal_chainStyle, com.hamkho.livefoot.R.attr.layout_constraintHorizontal_weight, com.hamkho.livefoot.R.attr.layout_constraintLeft_creator, com.hamkho.livefoot.R.attr.layout_constraintLeft_toLeftOf, com.hamkho.livefoot.R.attr.layout_constraintLeft_toRightOf, com.hamkho.livefoot.R.attr.layout_constraintRight_creator, com.hamkho.livefoot.R.attr.layout_constraintRight_toLeftOf, com.hamkho.livefoot.R.attr.layout_constraintRight_toRightOf, com.hamkho.livefoot.R.attr.layout_constraintStart_toEndOf, com.hamkho.livefoot.R.attr.layout_constraintStart_toStartOf, com.hamkho.livefoot.R.attr.layout_constraintTag, com.hamkho.livefoot.R.attr.layout_constraintTop_creator, com.hamkho.livefoot.R.attr.layout_constraintTop_toBottomOf, com.hamkho.livefoot.R.attr.layout_constraintTop_toTopOf, com.hamkho.livefoot.R.attr.layout_constraintVertical_bias, com.hamkho.livefoot.R.attr.layout_constraintVertical_chainStyle, com.hamkho.livefoot.R.attr.layout_constraintVertical_weight, com.hamkho.livefoot.R.attr.layout_constraintWidth, com.hamkho.livefoot.R.attr.layout_constraintWidth_default, com.hamkho.livefoot.R.attr.layout_constraintWidth_max, com.hamkho.livefoot.R.attr.layout_constraintWidth_min, com.hamkho.livefoot.R.attr.layout_constraintWidth_percent, com.hamkho.livefoot.R.attr.layout_editor_absoluteX, com.hamkho.livefoot.R.attr.layout_editor_absoluteY, com.hamkho.livefoot.R.attr.layout_goneMarginBaseline, com.hamkho.livefoot.R.attr.layout_goneMarginBottom, com.hamkho.livefoot.R.attr.layout_goneMarginEnd, com.hamkho.livefoot.R.attr.layout_goneMarginLeft, com.hamkho.livefoot.R.attr.layout_goneMarginRight, com.hamkho.livefoot.R.attr.layout_goneMarginStart, com.hamkho.livefoot.R.attr.layout_goneMarginTop, com.hamkho.livefoot.R.attr.layout_marginBaseline, com.hamkho.livefoot.R.attr.layout_optimizationLevel, com.hamkho.livefoot.R.attr.layout_wrapBehaviorInParent};
    public static final int[] A = {R.attr.orientation, R.attr.id, R.attr.visibility, R.attr.layout_width, R.attr.layout_height, R.attr.layout_marginLeft, R.attr.layout_marginTop, R.attr.layout_marginRight, R.attr.layout_marginBottom, R.attr.maxWidth, R.attr.maxHeight, R.attr.minWidth, R.attr.minHeight, R.attr.alpha, R.attr.transformPivotX, R.attr.transformPivotY, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.layout_marginStart, R.attr.layout_marginEnd, R.attr.translationZ, R.attr.elevation, com.hamkho.livefoot.R.attr.animateCircleAngleTo, com.hamkho.livefoot.R.attr.animateRelativeTo, com.hamkho.livefoot.R.attr.barrierAllowsGoneWidgets, com.hamkho.livefoot.R.attr.barrierDirection, com.hamkho.livefoot.R.attr.barrierMargin, com.hamkho.livefoot.R.attr.chainUseRtl, com.hamkho.livefoot.R.attr.constraint_referenced_ids, com.hamkho.livefoot.R.attr.drawPath, com.hamkho.livefoot.R.attr.flow_firstHorizontalBias, com.hamkho.livefoot.R.attr.flow_firstHorizontalStyle, com.hamkho.livefoot.R.attr.flow_firstVerticalBias, com.hamkho.livefoot.R.attr.flow_firstVerticalStyle, com.hamkho.livefoot.R.attr.flow_horizontalAlign, com.hamkho.livefoot.R.attr.flow_horizontalBias, com.hamkho.livefoot.R.attr.flow_horizontalGap, com.hamkho.livefoot.R.attr.flow_horizontalStyle, com.hamkho.livefoot.R.attr.flow_lastHorizontalBias, com.hamkho.livefoot.R.attr.flow_lastHorizontalStyle, com.hamkho.livefoot.R.attr.flow_lastVerticalBias, com.hamkho.livefoot.R.attr.flow_lastVerticalStyle, com.hamkho.livefoot.R.attr.flow_maxElementsWrap, com.hamkho.livefoot.R.attr.flow_verticalAlign, com.hamkho.livefoot.R.attr.flow_verticalBias, com.hamkho.livefoot.R.attr.flow_verticalGap, com.hamkho.livefoot.R.attr.flow_verticalStyle, com.hamkho.livefoot.R.attr.flow_wrapMode, com.hamkho.livefoot.R.attr.guidelineUseRtl, com.hamkho.livefoot.R.attr.layout_constrainedHeight, com.hamkho.livefoot.R.attr.layout_constrainedWidth, com.hamkho.livefoot.R.attr.layout_constraintBaseline_creator, com.hamkho.livefoot.R.attr.layout_constraintBottom_creator, com.hamkho.livefoot.R.attr.layout_constraintCircleAngle, com.hamkho.livefoot.R.attr.layout_constraintCircleRadius, com.hamkho.livefoot.R.attr.layout_constraintDimensionRatio, com.hamkho.livefoot.R.attr.layout_constraintGuide_begin, com.hamkho.livefoot.R.attr.layout_constraintGuide_end, com.hamkho.livefoot.R.attr.layout_constraintGuide_percent, com.hamkho.livefoot.R.attr.layout_constraintHeight, com.hamkho.livefoot.R.attr.layout_constraintHeight_default, com.hamkho.livefoot.R.attr.layout_constraintHeight_max, com.hamkho.livefoot.R.attr.layout_constraintHeight_min, com.hamkho.livefoot.R.attr.layout_constraintHeight_percent, com.hamkho.livefoot.R.attr.layout_constraintHorizontal_bias, com.hamkho.livefoot.R.attr.layout_constraintHorizontal_chainStyle, com.hamkho.livefoot.R.attr.layout_constraintHorizontal_weight, com.hamkho.livefoot.R.attr.layout_constraintLeft_creator, com.hamkho.livefoot.R.attr.layout_constraintRight_creator, com.hamkho.livefoot.R.attr.layout_constraintTag, com.hamkho.livefoot.R.attr.layout_constraintTop_creator, com.hamkho.livefoot.R.attr.layout_constraintVertical_bias, com.hamkho.livefoot.R.attr.layout_constraintVertical_chainStyle, com.hamkho.livefoot.R.attr.layout_constraintVertical_weight, com.hamkho.livefoot.R.attr.layout_constraintWidth, com.hamkho.livefoot.R.attr.layout_constraintWidth_default, com.hamkho.livefoot.R.attr.layout_constraintWidth_max, com.hamkho.livefoot.R.attr.layout_constraintWidth_min, com.hamkho.livefoot.R.attr.layout_constraintWidth_percent, com.hamkho.livefoot.R.attr.layout_editor_absoluteX, com.hamkho.livefoot.R.attr.layout_editor_absoluteY, com.hamkho.livefoot.R.attr.layout_goneMarginBaseline, com.hamkho.livefoot.R.attr.layout_goneMarginBottom, com.hamkho.livefoot.R.attr.layout_goneMarginEnd, com.hamkho.livefoot.R.attr.layout_goneMarginLeft, com.hamkho.livefoot.R.attr.layout_goneMarginRight, com.hamkho.livefoot.R.attr.layout_goneMarginStart, com.hamkho.livefoot.R.attr.layout_goneMarginTop, com.hamkho.livefoot.R.attr.layout_marginBaseline, com.hamkho.livefoot.R.attr.layout_wrapBehaviorInParent, com.hamkho.livefoot.R.attr.motionProgress, com.hamkho.livefoot.R.attr.motionStagger, com.hamkho.livefoot.R.attr.motionTarget, com.hamkho.livefoot.R.attr.pathMotionArc, com.hamkho.livefoot.R.attr.pivotAnchor, com.hamkho.livefoot.R.attr.polarRelativeTo, com.hamkho.livefoot.R.attr.quantizeMotionInterpolator, com.hamkho.livefoot.R.attr.quantizeMotionPhase, com.hamkho.livefoot.R.attr.quantizeMotionSteps, com.hamkho.livefoot.R.attr.transformPivotTarget, com.hamkho.livefoot.R.attr.transitionEasing, com.hamkho.livefoot.R.attr.transitionPathRotate, com.hamkho.livefoot.R.attr.visibilityMode};
    public static final int[] B = {R.attr.orientation, R.attr.id, R.attr.visibility, R.attr.layout_width, R.attr.layout_height, R.attr.layout_marginLeft, R.attr.layout_marginTop, R.attr.layout_marginRight, R.attr.layout_marginBottom, R.attr.maxWidth, R.attr.maxHeight, R.attr.minWidth, R.attr.minHeight, R.attr.pivotX, R.attr.pivotY, R.attr.alpha, R.attr.transformPivotX, R.attr.transformPivotY, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.layout_marginStart, R.attr.layout_marginEnd, R.attr.translationZ, R.attr.elevation, com.hamkho.livefoot.R.attr.animateCircleAngleTo, com.hamkho.livefoot.R.attr.animateRelativeTo, com.hamkho.livefoot.R.attr.barrierAllowsGoneWidgets, com.hamkho.livefoot.R.attr.barrierDirection, com.hamkho.livefoot.R.attr.barrierMargin, com.hamkho.livefoot.R.attr.chainUseRtl, com.hamkho.livefoot.R.attr.constraintRotate, com.hamkho.livefoot.R.attr.constraint_referenced_ids, com.hamkho.livefoot.R.attr.constraint_referenced_tags, com.hamkho.livefoot.R.attr.deriveConstraintsFrom, com.hamkho.livefoot.R.attr.drawPath, com.hamkho.livefoot.R.attr.flow_firstHorizontalBias, com.hamkho.livefoot.R.attr.flow_firstHorizontalStyle, com.hamkho.livefoot.R.attr.flow_firstVerticalBias, com.hamkho.livefoot.R.attr.flow_firstVerticalStyle, com.hamkho.livefoot.R.attr.flow_horizontalAlign, com.hamkho.livefoot.R.attr.flow_horizontalBias, com.hamkho.livefoot.R.attr.flow_horizontalGap, com.hamkho.livefoot.R.attr.flow_horizontalStyle, com.hamkho.livefoot.R.attr.flow_lastHorizontalBias, com.hamkho.livefoot.R.attr.flow_lastHorizontalStyle, com.hamkho.livefoot.R.attr.flow_lastVerticalBias, com.hamkho.livefoot.R.attr.flow_lastVerticalStyle, com.hamkho.livefoot.R.attr.flow_maxElementsWrap, com.hamkho.livefoot.R.attr.flow_verticalAlign, com.hamkho.livefoot.R.attr.flow_verticalBias, com.hamkho.livefoot.R.attr.flow_verticalGap, com.hamkho.livefoot.R.attr.flow_verticalStyle, com.hamkho.livefoot.R.attr.flow_wrapMode, com.hamkho.livefoot.R.attr.guidelineUseRtl, com.hamkho.livefoot.R.attr.layout_constrainedHeight, com.hamkho.livefoot.R.attr.layout_constrainedWidth, com.hamkho.livefoot.R.attr.layout_constraintBaseline_creator, com.hamkho.livefoot.R.attr.layout_constraintBaseline_toBaselineOf, com.hamkho.livefoot.R.attr.layout_constraintBaseline_toBottomOf, com.hamkho.livefoot.R.attr.layout_constraintBaseline_toTopOf, com.hamkho.livefoot.R.attr.layout_constraintBottom_creator, com.hamkho.livefoot.R.attr.layout_constraintBottom_toBottomOf, com.hamkho.livefoot.R.attr.layout_constraintBottom_toTopOf, com.hamkho.livefoot.R.attr.layout_constraintCircle, com.hamkho.livefoot.R.attr.layout_constraintCircleAngle, com.hamkho.livefoot.R.attr.layout_constraintCircleRadius, com.hamkho.livefoot.R.attr.layout_constraintDimensionRatio, com.hamkho.livefoot.R.attr.layout_constraintEnd_toEndOf, com.hamkho.livefoot.R.attr.layout_constraintEnd_toStartOf, com.hamkho.livefoot.R.attr.layout_constraintGuide_begin, com.hamkho.livefoot.R.attr.layout_constraintGuide_end, com.hamkho.livefoot.R.attr.layout_constraintGuide_percent, com.hamkho.livefoot.R.attr.layout_constraintHeight_default, com.hamkho.livefoot.R.attr.layout_constraintHeight_max, com.hamkho.livefoot.R.attr.layout_constraintHeight_min, com.hamkho.livefoot.R.attr.layout_constraintHeight_percent, com.hamkho.livefoot.R.attr.layout_constraintHorizontal_bias, com.hamkho.livefoot.R.attr.layout_constraintHorizontal_chainStyle, com.hamkho.livefoot.R.attr.layout_constraintHorizontal_weight, com.hamkho.livefoot.R.attr.layout_constraintLeft_creator, com.hamkho.livefoot.R.attr.layout_constraintLeft_toLeftOf, com.hamkho.livefoot.R.attr.layout_constraintLeft_toRightOf, com.hamkho.livefoot.R.attr.layout_constraintRight_creator, com.hamkho.livefoot.R.attr.layout_constraintRight_toLeftOf, com.hamkho.livefoot.R.attr.layout_constraintRight_toRightOf, com.hamkho.livefoot.R.attr.layout_constraintStart_toEndOf, com.hamkho.livefoot.R.attr.layout_constraintStart_toStartOf, com.hamkho.livefoot.R.attr.layout_constraintTag, com.hamkho.livefoot.R.attr.layout_constraintTop_creator, com.hamkho.livefoot.R.attr.layout_constraintTop_toBottomOf, com.hamkho.livefoot.R.attr.layout_constraintTop_toTopOf, com.hamkho.livefoot.R.attr.layout_constraintVertical_bias, com.hamkho.livefoot.R.attr.layout_constraintVertical_chainStyle, com.hamkho.livefoot.R.attr.layout_constraintVertical_weight, com.hamkho.livefoot.R.attr.layout_constraintWidth_default, com.hamkho.livefoot.R.attr.layout_constraintWidth_max, com.hamkho.livefoot.R.attr.layout_constraintWidth_min, com.hamkho.livefoot.R.attr.layout_constraintWidth_percent, com.hamkho.livefoot.R.attr.layout_editor_absoluteX, com.hamkho.livefoot.R.attr.layout_editor_absoluteY, com.hamkho.livefoot.R.attr.layout_goneMarginBaseline, com.hamkho.livefoot.R.attr.layout_goneMarginBottom, com.hamkho.livefoot.R.attr.layout_goneMarginEnd, com.hamkho.livefoot.R.attr.layout_goneMarginLeft, com.hamkho.livefoot.R.attr.layout_goneMarginRight, com.hamkho.livefoot.R.attr.layout_goneMarginStart, com.hamkho.livefoot.R.attr.layout_goneMarginTop, com.hamkho.livefoot.R.attr.layout_marginBaseline, com.hamkho.livefoot.R.attr.layout_wrapBehaviorInParent, com.hamkho.livefoot.R.attr.motionProgress, com.hamkho.livefoot.R.attr.motionStagger, com.hamkho.livefoot.R.attr.pathMotionArc, com.hamkho.livefoot.R.attr.pivotAnchor, com.hamkho.livefoot.R.attr.polarRelativeTo, com.hamkho.livefoot.R.attr.quantizeMotionSteps, com.hamkho.livefoot.R.attr.transitionEasing, com.hamkho.livefoot.R.attr.transitionPathRotate};
    public static final int[] C = {com.hamkho.livefoot.R.attr.attributeName, com.hamkho.livefoot.R.attr.customBoolean, com.hamkho.livefoot.R.attr.customColorDrawableValue, com.hamkho.livefoot.R.attr.customColorValue, com.hamkho.livefoot.R.attr.customDimension, com.hamkho.livefoot.R.attr.customFloatValue, com.hamkho.livefoot.R.attr.customIntegerValue, com.hamkho.livefoot.R.attr.customPixelDimension, com.hamkho.livefoot.R.attr.customReference, com.hamkho.livefoot.R.attr.customStringValue, com.hamkho.livefoot.R.attr.methodName};
    public static final int[] D = {R.attr.orientation, R.attr.layout_width, R.attr.layout_height, R.attr.layout_marginLeft, R.attr.layout_marginTop, R.attr.layout_marginRight, R.attr.layout_marginBottom, R.attr.layout_marginStart, R.attr.layout_marginEnd, com.hamkho.livefoot.R.attr.barrierAllowsGoneWidgets, com.hamkho.livefoot.R.attr.barrierDirection, com.hamkho.livefoot.R.attr.barrierMargin, com.hamkho.livefoot.R.attr.chainUseRtl, com.hamkho.livefoot.R.attr.constraint_referenced_ids, com.hamkho.livefoot.R.attr.constraint_referenced_tags, com.hamkho.livefoot.R.attr.guidelineUseRtl, com.hamkho.livefoot.R.attr.layout_constrainedHeight, com.hamkho.livefoot.R.attr.layout_constrainedWidth, com.hamkho.livefoot.R.attr.layout_constraintBaseline_creator, com.hamkho.livefoot.R.attr.layout_constraintBaseline_toBaselineOf, com.hamkho.livefoot.R.attr.layout_constraintBaseline_toBottomOf, com.hamkho.livefoot.R.attr.layout_constraintBaseline_toTopOf, com.hamkho.livefoot.R.attr.layout_constraintBottom_creator, com.hamkho.livefoot.R.attr.layout_constraintBottom_toBottomOf, com.hamkho.livefoot.R.attr.layout_constraintBottom_toTopOf, com.hamkho.livefoot.R.attr.layout_constraintCircle, com.hamkho.livefoot.R.attr.layout_constraintCircleAngle, com.hamkho.livefoot.R.attr.layout_constraintCircleRadius, com.hamkho.livefoot.R.attr.layout_constraintDimensionRatio, com.hamkho.livefoot.R.attr.layout_constraintEnd_toEndOf, com.hamkho.livefoot.R.attr.layout_constraintEnd_toStartOf, com.hamkho.livefoot.R.attr.layout_constraintGuide_begin, com.hamkho.livefoot.R.attr.layout_constraintGuide_end, com.hamkho.livefoot.R.attr.layout_constraintGuide_percent, com.hamkho.livefoot.R.attr.layout_constraintHeight, com.hamkho.livefoot.R.attr.layout_constraintHeight_default, com.hamkho.livefoot.R.attr.layout_constraintHeight_max, com.hamkho.livefoot.R.attr.layout_constraintHeight_min, com.hamkho.livefoot.R.attr.layout_constraintHeight_percent, com.hamkho.livefoot.R.attr.layout_constraintHorizontal_bias, com.hamkho.livefoot.R.attr.layout_constraintHorizontal_chainStyle, com.hamkho.livefoot.R.attr.layout_constraintHorizontal_weight, com.hamkho.livefoot.R.attr.layout_constraintLeft_creator, com.hamkho.livefoot.R.attr.layout_constraintLeft_toLeftOf, com.hamkho.livefoot.R.attr.layout_constraintLeft_toRightOf, com.hamkho.livefoot.R.attr.layout_constraintRight_creator, com.hamkho.livefoot.R.attr.layout_constraintRight_toLeftOf, com.hamkho.livefoot.R.attr.layout_constraintRight_toRightOf, com.hamkho.livefoot.R.attr.layout_constraintStart_toEndOf, com.hamkho.livefoot.R.attr.layout_constraintStart_toStartOf, com.hamkho.livefoot.R.attr.layout_constraintTop_creator, com.hamkho.livefoot.R.attr.layout_constraintTop_toBottomOf, com.hamkho.livefoot.R.attr.layout_constraintTop_toTopOf, com.hamkho.livefoot.R.attr.layout_constraintVertical_bias, com.hamkho.livefoot.R.attr.layout_constraintVertical_chainStyle, com.hamkho.livefoot.R.attr.layout_constraintVertical_weight, com.hamkho.livefoot.R.attr.layout_constraintWidth, com.hamkho.livefoot.R.attr.layout_constraintWidth_default, com.hamkho.livefoot.R.attr.layout_constraintWidth_max, com.hamkho.livefoot.R.attr.layout_constraintWidth_min, com.hamkho.livefoot.R.attr.layout_constraintWidth_percent, com.hamkho.livefoot.R.attr.layout_editor_absoluteX, com.hamkho.livefoot.R.attr.layout_editor_absoluteY, com.hamkho.livefoot.R.attr.layout_goneMarginBaseline, com.hamkho.livefoot.R.attr.layout_goneMarginBottom, com.hamkho.livefoot.R.attr.layout_goneMarginEnd, com.hamkho.livefoot.R.attr.layout_goneMarginLeft, com.hamkho.livefoot.R.attr.layout_goneMarginRight, com.hamkho.livefoot.R.attr.layout_goneMarginStart, com.hamkho.livefoot.R.attr.layout_goneMarginTop, com.hamkho.livefoot.R.attr.layout_marginBaseline, com.hamkho.livefoot.R.attr.layout_wrapBehaviorInParent, com.hamkho.livefoot.R.attr.maxHeight, com.hamkho.livefoot.R.attr.maxWidth, com.hamkho.livefoot.R.attr.minHeight, com.hamkho.livefoot.R.attr.minWidth};
    public static final int[] E = {com.hamkho.livefoot.R.attr.animateCircleAngleTo, com.hamkho.livefoot.R.attr.animateRelativeTo, com.hamkho.livefoot.R.attr.drawPath, com.hamkho.livefoot.R.attr.motionPathRotate, com.hamkho.livefoot.R.attr.motionStagger, com.hamkho.livefoot.R.attr.pathMotionArc, com.hamkho.livefoot.R.attr.quantizeMotionInterpolator, com.hamkho.livefoot.R.attr.quantizeMotionPhase, com.hamkho.livefoot.R.attr.quantizeMotionSteps, com.hamkho.livefoot.R.attr.transitionEasing};
    public static final int[] F = {com.hamkho.livefoot.R.attr.onHide, com.hamkho.livefoot.R.attr.onShow};
    public static final int[] G = {R.attr.visibility, R.attr.alpha, com.hamkho.livefoot.R.attr.layout_constraintTag, com.hamkho.livefoot.R.attr.motionProgress, com.hamkho.livefoot.R.attr.visibilityMode};
    public static final int[] H = {R.attr.id, com.hamkho.livefoot.R.attr.constraints};
    public static final int[] I = {R.attr.transformPivotX, R.attr.transformPivotY, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.translationZ, R.attr.elevation, com.hamkho.livefoot.R.attr.transformPivotTarget};
    public static final int[] J = {com.hamkho.livefoot.R.attr.constraints, com.hamkho.livefoot.R.attr.region_heightLessThan, com.hamkho.livefoot.R.attr.region_heightMoreThan, com.hamkho.livefoot.R.attr.region_widthLessThan, com.hamkho.livefoot.R.attr.region_widthMoreThan};
    public static final /* synthetic */ e K = new e();
    public static final int[] L = {R.attr.name, R.attr.id, R.attr.tag};
    public static final int[] M = {R.attr.name, R.attr.tag};

    public static byte[] a(String str) {
        byte[] bArr;
        byte b10;
        int length = str.length();
        int i10 = 0;
        while (true) {
            int length2 = str.length();
            bArr = f34519w;
            if (i10 >= length2) {
                break;
            }
            char charAt = str.charAt(i10);
            if (charAt > 255 || bArr[charAt] < 0) {
                length--;
            }
            i10++;
        }
        int i11 = (length / 4) * 3;
        int i12 = length % 4;
        if (i12 == 3) {
            i11 += 2;
        }
        if (i12 == 2) {
            i11++;
        }
        byte[] bArr2 = new byte[i11];
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < str.length(); i16++) {
            char charAt2 = str.charAt(i16);
            if (charAt2 > 255) {
                b10 = -1;
            } else {
                b10 = bArr[charAt2];
            }
            if (b10 >= 0) {
                i15 += 6;
                i14 = (i14 << 6) | b10;
                if (i15 >= 8) {
                    i15 -= 8;
                    bArr2[i13] = (byte) ((i14 >> i15) & p.f9095b);
                    i13++;
                }
            }
        }
        if (i13 != i11) {
            return new byte[0];
        }
        return bArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x0271, code lost:
    
        if (r2.f35617d == r8) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f1, code lost:
    
        if (r4.f35617d == r13) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0427 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x06ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x06ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0709 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x048c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0577 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(u.e r36, s.c r37, java.util.ArrayList r38, int r39) {
        /*
            Method dump skipped, instructions count: 1815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.e.b(u.e, s.c, java.util.ArrayList, int):void");
    }

    public static int c(int i10, int i11, int[] iArr) {
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else if (i15 > i11) {
                i12 = i14 - 1;
            } else {
                return i14;
            }
        }
        return ~i13;
    }

    public static int e(long[] jArr, int i10, long j10) {
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            long j11 = jArr[i13];
            if (j11 < j10) {
                i12 = i13 + 1;
            } else if (j11 > j10) {
                i11 = i13 - 1;
            } else {
                return i13;
            }
        }
        return ~i12;
    }

    public static void f(u.e eVar, s.c cVar, u.d dVar) {
        dVar.f35657p = -1;
        dVar.f35659q = -1;
        int i10 = eVar.V[0];
        int[] iArr = dVar.V;
        if (i10 != 2 && iArr[0] == 4) {
            u.c cVar2 = dVar.K;
            int i11 = cVar2.f35619g;
            int r10 = eVar.r();
            u.c cVar3 = dVar.M;
            int i12 = r10 - cVar3.f35619g;
            cVar2.f35621i = cVar.k(cVar2);
            cVar3.f35621i = cVar.k(cVar3);
            cVar.d(cVar2.f35621i, i11);
            cVar.d(cVar3.f35621i, i12);
            dVar.f35657p = 2;
            dVar.f35632b0 = i11;
            int i13 = i12 - i11;
            dVar.X = i13;
            int i14 = dVar.f35638e0;
            if (i13 < i14) {
                dVar.X = i14;
            }
        }
        if (eVar.V[1] != 2 && iArr[1] == 4) {
            u.c cVar4 = dVar.L;
            int i15 = cVar4.f35619g;
            int l10 = eVar.l();
            u.c cVar5 = dVar.N;
            int i16 = l10 - cVar5.f35619g;
            cVar4.f35621i = cVar.k(cVar4);
            cVar5.f35621i = cVar.k(cVar5);
            cVar.d(cVar4.f35621i, i15);
            cVar.d(cVar5.f35621i, i16);
            if (dVar.f35636d0 > 0 || dVar.f35647j0 == 8) {
                u.c cVar6 = dVar.O;
                s.g k10 = cVar.k(cVar6);
                cVar6.f35621i = k10;
                cVar.d(k10, dVar.f35636d0 + i15);
            }
            dVar.f35659q = 2;
            dVar.f35634c0 = i15;
            int i17 = i16 - i15;
            dVar.Y = i17;
            int i18 = dVar.f35639f0;
            if (i17 < i18) {
                dVar.Y = i18;
            }
        }
    }

    public static final boolean g(int i10, int i11) {
        if ((i10 & i11) == i11) {
            return true;
        }
        return false;
    }

    @Override // s7.e
    public Object d(v vVar) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(vVar);
    }

    @Override // com.ironsource.mediationsdk.sdk.InitializationListener
    public void onInitializationComplete() {
        IronSource.loadInterstitial();
    }
}
