package gabby.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;


/**
 * Created by Administrator on 2018/11/28.
 */

public class InvalidTextView extends android.support.v7.widget.AppCompatTextView {
    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    public InvalidTextView(Context context){
        super(context);
        initDraw();
    }

    public InvalidTextView(Context context, AttributeSet attrs){
        super(context, attrs);
        initDraw();
    }

    public InvalidTextView(Context context, AttributeSet attrs, int defStyleAttr){
        super(context, attrs, defStyleAttr);
        initDraw();
    }

    private void initDraw() {
        mPaint.setColor(Color.RED);
        mPaint.setStrokeWidth((float)1.5);
    }

    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        int width = getWidth();
        int hegiht = getHeight();
        canvas.drawLine(0, hegiht/2, width, hegiht/2, mPaint);
    }
}