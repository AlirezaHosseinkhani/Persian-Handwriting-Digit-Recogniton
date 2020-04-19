// Generated code from Butter Knife. Do not modify!
package com.example.persiandigitdetector;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.nex3z.fingerpaintview.FingerPaintView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view7f080027;

  private View view7f080026;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    target.mFpvPaint = Utils.findRequiredViewAsType(source, R.id.fpv_paint, "field 'mFpvPaint'", FingerPaintView.class);
    target.mTvPrediction = Utils.findRequiredViewAsType(source, R.id.tv_prediction, "field 'mTvPrediction'", TextView.class);
    target.mTvProbability = Utils.findRequiredViewAsType(source, R.id.tv_probability, "field 'mTvProbability'", TextView.class);
    target.mTvTimeCost = Utils.findRequiredViewAsType(source, R.id.tv_timecost, "field 'mTvTimeCost'", TextView.class);
    view = Utils.findRequiredView(source, R.id.btn_detect, "method 'onDetectClick'");
    view7f080027 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onDetectClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_clear, "method 'onClearClick'");
    view7f080026 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClearClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mFpvPaint = null;
    target.mTvPrediction = null;
    target.mTvProbability = null;
    target.mTvTimeCost = null;

    view7f080027.setOnClickListener(null);
    view7f080027 = null;
    view7f080026.setOnClickListener(null);
    view7f080026 = null;
  }
}
