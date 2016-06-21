package cn.zmy;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import cn.zmy.indexscroller.R;
import cn.zmy.utils.ScreenUtil;

/**
 * Created by zmy on 2016/6/15 0015.
 */
public class IndexScroller extends View
{
    private static final String[] KEY_ARRAY = {"#", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    private Paint paint;
    private int textSize;
    private int textSizePressed;
    private int textColorNormal;
    private int textColorPressed;
    private int balloonSize;//气泡的大小（气泡为正方形)
    private int balloonMargin;
    private int balloonTextSize;
    private int balloonTextColor;
    private int balloonBackgroundResID;
    private boolean clipBalloon;//默认为false。如果为true，当气泡的最顶端到达IndexScroller的最顶端时，气泡将不再往上移动。最底端也是一个道理。

    private Point touchPoint;
    private Point viewPos;
    private int singleItemHeight;
    private int balloonPosX;
    private int statusBarHeight;
    private IndexerBalloon balloon;
    private String oldSection;
    private OnSectionChangeListener sectionChangeListener;

    public IndexScroller(Context context)
    {
        this(context, null);
    }

    public IndexScroller(Context context, AttributeSet attrs)
    {
        this(context, attrs, 0);
    }

    public IndexScroller(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        init();
        setTextSize(ScreenUtil.dip2Px(context,18));
        setTextSizePressed(textSize);
        setBalloonSize(ScreenUtil.dip2Px(context,60));
        setBalloonMargin(ScreenUtil.dip2Px(context,10));
        setTextColorNormal(Color.BLACK);
        setTextColorPressed(textColorNormal);
        setBalloonTextSize(ScreenUtil.dip2Px(context,20));
        setBalloonTextColor(Color.WHITE);
        setBalloonBackground(R.drawable.shape_balloon_indexer);
        clipBalloon = false;
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.IndexScroller);
        if (array != null)
        {
            for (int i = 0; i < array.getIndexCount(); i++)
            {
                int attrID = array.getIndex(i);
                if (attrID == R.styleable.IndexScroller_is_textSize)
                {
                    setTextSize(array.getDimensionPixelSize(attrID, textSize));
                    continue;
                }
                if (attrID == R.styleable.IndexScroller_is_textSizePressed)
                {
                    setTextSizePressed(array.getDimensionPixelSize(attrID, textSizePressed));
                    continue;
                }
                if (attrID == R.styleable.IndexScroller_is_balloonSize)
                {
                    setBalloonSize(array.getDimensionPixelSize(attrID, balloonSize));
                    continue;
                }
                if (attrID == R.styleable.IndexScroller_is_balloonMargin)
                {
                    setBalloonMargin(array.getDimensionPixelSize(attrID, balloonMargin));
                    continue;
                }
                if (attrID == R.styleable.IndexScroller_is_textNormalColor)
                {
                    setTextColorNormal(array.getColor(attrID, textColorNormal));
                    continue;
                }
                if (attrID == R.styleable.IndexScroller_is_textPressedColor)
                {
                    setTextColorPressed(array.getColor(attrID, textColorPressed));
                    continue;
                }
                if (attrID == R.styleable.IndexScroller_is_balloonTextSize)
                {
                    setBalloonTextSize(array.getDimensionPixelSize(attrID, balloonTextSize));
                    continue;
                }
                if (attrID == R.styleable.IndexScroller_is_balloonTextColor)
                {
                    setBalloonTextColor(array.getColor(attrID, balloonTextColor));
                    continue;
                }
                if (attrID == R.styleable.IndexScroller_is_balloonBackground)
                {
                    setBalloonBackground(array.getDrawable(attrID));
                    continue;
                }
                if(attrID == R.styleable.IndexScroller_is_clipBalloon)
                {
                    setClipBalloon(array.getBoolean(attrID,clipBalloon));
                    continue;
                }
            }
            array.recycle();
        }
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        int width = getWidth();//View的宽度
        int height = getHeight() - getPaddingTop() - getPaddingBottom();//可绘制的最大的高度
        singleItemHeight = (int) ((float) height / (float) KEY_ARRAY.length);//每一个KEY View的高度

        //将KEY垂直排列画在界面上
        //drawText垂直居中显示可参考博文 http://blog.csdn.net/hursing/article/details/18703599
        paint.setTextSize(Math.max(textSize,textSizePressed));
        Paint.FontMetricsInt fontMetrics = paint.getFontMetricsInt();
        Rect targetRect = new Rect();//每一个KEY都会在targetRect里面居中显示
        int currentY = getPaddingTop();
        for (String key : KEY_ARRAY)
        {
            targetRect.set(0,currentY,width,currentY + singleItemHeight);

            //判断手指是否在此区域有触摸操作
            if (targetRect.contains(touchPoint.x,touchPoint.y))
            {
                paint.setTextSize(textSizePressed);
                paint.setColor(textColorPressed);
            }
            else
            {
                paint.setTextSize(textSize);
                paint.setColor(textColorNormal);
            }
            int x = (int) ((width - paint.measureText(key))/2f);
            int baseline = (targetRect.bottom + targetRect.top - fontMetrics.bottom - fontMetrics.top) / 2;
            canvas.drawText(key, x, baseline, paint);
            currentY += singleItemHeight;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        switch (event.getActionMasked())
        {
            case MotionEvent.ACTION_DOWN:
            {
                refreshValues();//这里不需要break
            }
            case MotionEvent.ACTION_MOVE:
            {
                touchPoint.set((int)event.getX(), (int) event.getY());
                touchChanged(event);
                break;
            }
            case MotionEvent.ACTION_UP:
            case MotionEvent.ACTION_CANCEL:
            {
                oldSection = "";
                touchPoint.set(-1,-1);
                balloon.hide();
                break;
            }
        }
        invalidate();
        return true;
    }

    public int getTextSize()
    {
        return textSize;
    }

    /**
     * 设置Scroller上文字的大小，单位为Px
     * */
    public void setTextSize(int sizePx)
    {
        this.textSize = sizePx;
        paint.setTextSize(sizePx);
    }

    public int getTextSizePressed()
    {
        return textSizePressed;
    }

    /**
     * 设置当Scroller的某文字被按住时，其字体的大小，单位为Px
     * */
    public void setTextSizePressed(int sizePx)
    {
        this.textSizePressed = sizePx;
    }

    public int getBalloonSize()
    {
        return balloonSize;
    }

    /**
     * 设置旗袍的大小，单位为Px
     * */
    public void setBalloonSize(int sizePx)
    {
        this.balloonSize = sizePx;
        balloon.setSize(sizePx);
    }

    public int getBalloonMargin()
    {
        return balloonMargin;
    }

    /**
     * 设置气泡和Scroller之间的间距，单位为Px
     * */
    public void setBalloonMargin(int marginPx)
    {
        this.balloonMargin = marginPx;
    }

    public int getTextColorNormal()
    {
        return textColorNormal;
    }

    /**
     * 设置Scroller文字的颜色
     * */
    public void setTextColorNormal(int textColorNormal)
    {
        this.textColorNormal = textColorNormal;
    }

    public int getTextColorPressed()
    {
        return textColorPressed;
    }

    /**
     * 设置Scroller某文字被按住时的颜色
     * */
    public void setTextColorPressed(int textColorPressed)
    {
        this.textColorPressed = textColorPressed;
    }

    public int getBalloonTextSize()
    {
        return balloonTextSize;
    }

    /**
     * 设置气泡上文字的大小
     * */
    public void setBalloonTextSize(int sizePx)
    {
        this.balloonTextSize = sizePx;
        this.balloon.setTextSize(sizePx);
    }

    public int getBalloonTextColor()
    {
        return balloonTextColor;
    }

    /**
     * 设置气泡文字的颜色
     * */
    public void setBalloonTextColor(int balloonTextColor)
    {
        this.balloonTextColor = balloonTextColor;
        this.balloon.setTextColor(balloonTextColor);
    }

    public int getBalloonBackground()
    {
        return balloonBackgroundResID;
    }

    /**
     * 设置气泡的背景
     * @param id Drawable的ID
     * */
    public void setBalloonBackground(int id)
    {
        this.balloonBackgroundResID = id;
        this.balloon.setBackground(id);
    }

    public void setBalloonBackground(Drawable drawable)
    {
        if (drawable == null)
        {
            return;
        }
        this.balloon.setBackground(drawable);
    }

    public boolean isClipBalloon()
    {
        return clipBalloon;
    }

    /**
     * 如果为true，当气泡的最顶端到达IndexScroller的最顶端时，气泡将不再往上移动。最底端也是一个道理。
     * */
    public void setClipBalloon(boolean clip)
    {
        this.clipBalloon = clip;
    }

    public OnSectionChangeListener getSectionChangeListener()
    {
        return sectionChangeListener;
    }

    /**
     * 设置Scroller文字改变监听器
     * */
    public void setOnSectionChangeListener(OnSectionChangeListener listener)
    {
        this.sectionChangeListener = listener;
    }

    private void init()
    {
        balloon = new IndexerBalloon(getContext());
        touchPoint = new Point(-1,-1);
        oldSection = "";
        statusBarHeight = ScreenUtil.getStatusBarHeight(getContext());
        paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
    }

    private void touchChanged(MotionEvent event)
    {
        int rawY = (int) event.getRawY();//获取触摸点相对于整个屏幕（包含状态栏）的Y轴坐标
        //由于Balloon所在的Window的Type为Toast,而Toast Window的区域不能超过状态栏，所以需要减去状态栏的高度
        int balloonPosY = rawY - balloonSize - statusBarHeight;
        if (clipBalloon)
        {
            //判断气泡是否已到达View的最顶端或者最底端
            int minY = viewPos.y - statusBarHeight;
            int maxY = viewPos.y + getHeight() - balloonSize - statusBarHeight;

            balloonPosY = Math.max(balloonPosY,minY);
            balloonPosY = Math.min(balloonPosY,maxY);
        }
        balloon.show(balloonPosX,balloonPosY);
        int keyIndex = (int) (event.getY()/singleItemHeight);
        if (keyIndex >= 0 && keyIndex < KEY_ARRAY.length)
        {
            String key = KEY_ARRAY[keyIndex];
            balloon.setText(key);
            if (!key.contentEquals(oldSection))
            {
                oldSection = key;
                if (this.sectionChangeListener != null)
                {
                    this.sectionChangeListener.changeTo(key);
                }
            }
        }
    }

    private void refreshValues()
    {
        viewPos = getLocationOnScreen();
        balloonPosX = viewPos.x - balloonSize - balloonMargin;
    }

    private Point getLocationOnScreen()
    {
        int[] pos = new int[2];
        getLocationOnScreen(pos);

        return new Point(pos[0],pos[1]);
    }

    public static class IndexerBalloon
    {
        private Context context;
        private WindowManager windowManager;
        private WindowManager.LayoutParams layoutParams;
        private TextView textView;

        private boolean isViewAdded;

        private IndexerBalloon(Context context)
        {
            this.context = context;
            windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);

            layoutParams = new WindowManager.LayoutParams();
            layoutParams.type = WindowManager.LayoutParams.TYPE_TOAST;
            layoutParams.flags = WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE | WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL;
            layoutParams.format = PixelFormat.TRANSPARENT;
            layoutParams.gravity = Gravity.TOP|Gravity.LEFT;

            textView = new TextView(context);
            textView.setGravity(Gravity.CENTER);
        }

        private void show(int x,int y)
        {
            layoutParams.x = x;
            layoutParams.y = y;
            if (isViewAdded)
            {
                windowManager.updateViewLayout(textView,layoutParams);
            }
            else
            {
                isViewAdded = true;
                windowManager.addView(textView, layoutParams);
            }
        }

        private void hide()
        {
            if (isViewAdded)
            {
                isViewAdded = false;
                try
                {
                    windowManager.removeView(textView);
                }
                catch (Exception ex){}
            }
        }

        private void setText(String text)
        {
            textView.setText(text);
        }

        private void setSize(int sizePx)
        {
            layoutParams.width = sizePx;
            layoutParams.height = sizePx;
        }

        private void setTextSize(int sizePx)
        {
            textView.setTextSize(TypedValue.COMPLEX_UNIT_PX,sizePx);
        }

        private void setTextColor(int color)
        {
            textView.setTextColor(color);
        }

        private void setBackground(int id)
        {
            textView.setBackgroundResource(id);
        }

        public void setBackground(Drawable drawable)
        {
            textView.setBackgroundDrawable(drawable);
        }
    }

    public interface OnSectionChangeListener
    {
        void changeTo(String selectionKey);
    }
}
