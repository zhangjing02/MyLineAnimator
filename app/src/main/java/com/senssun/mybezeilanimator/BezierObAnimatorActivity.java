package com.senssun.mybezeilanimator;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class BezierObAnimatorActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bezier_ob_animator);
        imageView= (ImageView) findViewById(R.id.imageview_search_bar_anim);
        //ObjectAnimator objectAnimator =  ObjectAnimator.ofInt(new BezierPath(this),"setX",0,300);//这里一般我们会传入view对象，
        //new BezierPath(this).startAnimation();
       // objectAnimator.setDuration(5000);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                BezierPath bezierPath= (BezierPath) findViewById(R.id.bezier_btn);
//               bezierPath.startAnimation();
//                bezierPath.setListener(new BezierPath.BezierPathListener() {
//                    @Override
//                    public void onAnimationEnd() {
//                    }
//                });
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof Animatable) {
                    ((Animatable) drawable).start();
                }


            }
        });


    }



    class MyObj{
        private View view;
        public MyObj(View view){
            this.view =view;
        }
        // 可以看到我们这里的方法，和熟悉“setX”很像，就是利用反射来的，如果我们以前传入“alpha”，就是调用view的setAlpha方法设置属性
// 对于参数int x，这里就和我们传入的0，300对应，当然，还可以自定义估值器，和变化的对象，这里参数也就一一对应
        public void setSetX(int x){
            view.setTranslationX(x);
        }
    }

}
